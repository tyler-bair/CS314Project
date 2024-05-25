package edu.colostate.cs415.server;

import static spark.Spark.after;
import static spark.Spark.exception;
import static spark.Spark.get;
import static spark.Spark.options;
import static spark.Spark.path;
import static spark.Spark.port;
import static spark.Spark.post;
import static spark.Spark.put;
import static spark.Spark.redirect;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

import com.google.gson.Gson;

import java.util.HashSet;
import java.util.Set;

import edu.colostate.cs415.db.DBConnector;
import edu.colostate.cs415.dto.AssignmentDTO;
import edu.colostate.cs415.dto.ProjectDTO;
import edu.colostate.cs415.dto.QualificationDTO;
import edu.colostate.cs415.dto.WorkerDTO;
import edu.colostate.cs415.model.Company;
import edu.colostate.cs415.model.ProjectStatus;
import spark.Request;
import spark.Response;
import spark.Spark;
import edu.colostate.cs415.model.Qualification;
import edu.colostate.cs415.model.Worker;
import edu.colostate.cs415.model.Project;


public class RestController {

	private static Logger log = Logger.getLogger(RestController.class.getName());
	private static String OK = "OK";
	private static String KO = "KO";

	private DBConnector dbConnector;
	private Company company;
	private Gson gson;

	public RestController(int port, DBConnector dbConnector) {
		port(port);
		this.dbConnector = dbConnector;
		gson = new Gson();
	}

	public void start() {
		// Load data from DB
		company = dbConnector.loadCompanyData();

		// Redirect
		redirect.get("/", "/helloworld");

		// Logging
		after("/*", (req, res) -> logRequest(req, res));
		exception(Exception.class, (exc, req, res) -> handleException(exc, res));

		// Hello World
		get("/helloworld", (req, res) -> helloWorld());

		// API
		path("/api", () -> {
			// Enable CORS
			options("/*", (req, res) -> optionsCORS(req, res));
			after("/*", (req, res) -> enableCORS(res));

			// Qualifications
			path("/qualifications", () -> {
				get("", (req, res) -> getQualifications(), gson::toJson);
				get("/:description", (req, res) -> getQualification(req.params("description")),
						gson::toJson);
				post("/:description", (req, res) -> createQualification(req));
			});

            // Workers
			path("/workers", () -> {
				get("", (req, res) -> getWorkers(), gson::toJson);
                get("/:name", (req, res) -> getWorker(req.params("name")), gson::toJson);
                post("/:name", (req, res) -> createWorker(req));
			});

            // Projects
            path("/projects", () -> {
                get("", (req, res) -> getProjects(), gson::toJson);
				get("/:name", (req, res) -> getProjectByName(req.params("name")), gson::toJson);
				post("/:name", (req, res) -> createProject(req));
            });

			path("/assign", () -> {
				put("", (req, res) -> assignWorker(req.body()));
			});

			path("/unassign", () -> {
				put("", (req, res) -> unassignWorker(req.body()));
			});
			path("/start", () -> {
				put("", (req, res) -> startProject(req.body()));
			});

			path("/finish", () -> {
				put("", (req, res) -> finishProject(req.body()), gson::toJson);
			});
		});
	}

	public void stop() {
		Spark.stop();
	}

	private String helloWorld() {
		return "Hello World!";
	}

    // Url: /api/qualifications
    // Request type: GET
    // Return type: JSON
    // Return value: QualificationDTO[]
	private QualificationDTO[] getQualifications() {

		Set<Qualification> qualificationsSet = company.getQualifications();
	
		QualificationDTO[] qualificationDTOs = new QualificationDTO[qualificationsSet.size()];
		int index = 0;
		for (Qualification qualification : qualificationsSet) {
			qualificationDTOs[index++] = qualification.toDTO();
		}
	
		return qualificationDTOs;
	}
	
	

    // Url: /api/qualifications/:description
    // Request type: GET
    // Return type: JSON
    // Return value: QualificationDTO
	private QualificationDTO getQualification(String description) {
		Set<Qualification> qualificationsSet = company.getQualifications();
        for (Qualification qualification : qualificationsSet) {
            if (qualification.toString().equals(description)) {
                return qualification.toDTO();
            }
        }
        throw new RuntimeException("Qualification does not exist.");
	}

    // Url: /api/qualifications/:description
    // Request type: POST
    // Body type: JSON
    // Body value: QualificationDTO
    // Body required fields: description
	private String createQualification(Request request) {
		QualificationDTO assignmentDTO = gson.fromJson(request.body(), QualificationDTO.class);
		if (request.params("description").equals(assignmentDTO.getDescription())) {
			company.createQualification(assignmentDTO.getDescription());
		} else
			throw new RuntimeException("Qualification descriptions do not match.");
		return OK;
	}

    // Worker endpoints

    // Url: /api/workers
    // Request type: GET
    // Return type: JSON
    // Return value: WorkerDTO[]
	private WorkerDTO[] getWorkers() {

		Set<Worker> workersSet = company.getEmployedWorkers();
	
		WorkerDTO[] workerDTOs = new WorkerDTO[workersSet.size()];
		int index = 0;
		for (Worker worker : workersSet) {
			workerDTOs[index++] = worker.toDTO();
		}
	
		return workerDTOs;
	}

    // Url: /api/workers/:name
    // Request type: GET
    // Return type: JSON
    // Return value: WorkerDTO[]
	private WorkerDTO getWorker(String name) {
        if(name.isEmpty() || name == null){
            throw new RuntimeException("Invalid worker name");
        }
        for(Worker w:company.getEmployedWorkers()){
            if(w.getName().equals(name)){
                return w.toDTO();
            }
        }
        throw new RuntimeException("Worker is not employed by the company");
	}

    // Url: /api/workers/:name
    // Request type: POST
    // Return type: JSON
    // Body value: WorkerDTO
    // Body required fields: name, qualifications, salary
    // Return type: String
    // Return value: OK
	private String createWorker(Request request) {
		WorkerDTO workerDTO = gson.fromJson(request.body(), WorkerDTO.class);
	
		if (workerDTO.getName() == null || workerDTO.getName().isEmpty()) {
			throw new RuntimeException("Worker name cannot be null or empty");
		}
		if (workerDTO.getQualifications() == null || workerDTO.getQualifications().length == 0) {
			throw new RuntimeException("Worker must have at least one qualification");
		}
		if (workerDTO.getSalary() <= 0.0) {
			throw new RuntimeException("Salary must be greater than zero");
		}

		Worker existingWorker = null;
		for (Worker w : company.getEmployedWorkers()) {
			if (w.getName().equals(workerDTO.getName())) {
				existingWorker = w;
				break;
			}
		}
	
		Set<Qualification> qualifications = new HashSet<>();
		for (String qualificationDescription : workerDTO.getQualifications()) {
			boolean found = false;
			for (Qualification q : company.getQualifications()) {
				if (q.toString().equals(qualificationDescription)) {
					qualifications.add(q);
					found = true;
					break;
				}
			}
			if (!found) {
				Qualification newQualification = new Qualification(qualificationDescription);
				qualifications.add(newQualification);
				company.getQualifications().add(newQualification);
			}
		}
	
		Worker newWorker;
		if (existingWorker != null) {
			for (Qualification q: qualifications) {
				existingWorker.addQualification(q);
				q.addWorker(existingWorker);
			}
			newWorker = existingWorker;
		} else {
			newWorker = company.createWorker(workerDTO.getName(), qualifications, workerDTO.getSalary());
		}

		if (newWorker != null) {
			return OK;
		} else {
			throw new RuntimeException("Worker was not added or updated correctly");
		}
	}

    // Project Endpoints
    
    // Url: /api/projects
    // Request type: GET
    // Return type: JSON
    // Return value: ProjectDTO[]
    private ProjectDTO[] getProjects() {
		Set<Project> projectsSet = company.getProjects();
		ProjectDTO[] projectDTOs = new ProjectDTO[projectsSet.size()];
    	int index = 0;
    	for (Project project : projectsSet) {
			projectDTOs[index++] = project.toDTO();
    	}
    	return projectDTOs;
    }
	
	//Url: /api/projects/:name
    //Request type: GET
    //Return type: JSON
    //Return value: ProjectDTO
    private ProjectDTO getProjectByName(String name) {
        Set<Project> projectsSet = company.getProjects();
        for (Project project : projectsSet) {
            if (project.getName().equals(name)) {
                return project.toDTO();
            }
        }
        throw new RuntimeException("Project does not exist.");
    }

	//Url: /api/projects/:name
	//Request type: POST
	//Body type: JSON
	//Body value: ProjectDTO
	//Body required fields: name, qualifications, size
	//Return type: String
	//Return value: OK
	private String createProject(Request request){
		ProjectDTO projectDTO = gson.fromJson(request.body(), ProjectDTO.class);
		if (request.params(":name").equals(projectDTO.getName()) 
        && projectDTO.getQualifications() != null && projectDTO.getQualifications().length > 0 
        && projectDTO.getSize() != null) {
			Set<Qualification> qualifications = new HashSet<>();
        	for (String qualificationName : projectDTO.getQualifications()) {
            	qualifications.add(new Qualification(qualificationName));
        	}
			company.createProject(projectDTO.getName(), qualifications, projectDTO.getSize());
		} else {
			throw new RuntimeException("projects needs name qualification set and size.");
		}
		return OK;
	}

	//Company end points
	private String assignWorker(String requestBody) {
		AssignmentDTO companyDTO = new Gson().fromJson(requestBody, AssignmentDTO.class);

		if(companyDTO.getWorker() != null && companyDTO.getWorker().isEmpty()) {
			throw new RuntimeException("Worker description is required");
		}

		if(companyDTO.getProject() != null && companyDTO.getProject().isEmpty()) {
			throw new RuntimeException("Project description is required");
		}

		if(companyDTO.getProject() == null) {
			throw new RuntimeException("Project field is required");
		}

		if(companyDTO.getWorker() == null) {
			throw new RuntimeException("Worker field is required");
		}

		String workerName = companyDTO.getWorker();
		String projectName = companyDTO.getProject();

		Worker foundWorker = null;
		for (Worker w : company.getAvailableWorkers()) {
			if (w.getName().equals(workerName)) {
				foundWorker = w;
				break;
			} 
		}
		if (foundWorker == null) {
			throw new RuntimeException("Worker with name '" + workerName + "' not found");
		}

		Project project = null;
		for (Project p : company.getProjects()) {
			if (p.getName().equals(projectName)) {
				project = p;
				break;
			}
		}

		if (project == null) {
			throw new RuntimeException("Project with name '" + projectName + "' not found");
		}

		company.assign(foundWorker, project);

		return OK;
	}

	private String unassignWorker(String requestBody) {
		AssignmentDTO companyDTO = new Gson().fromJson(requestBody, AssignmentDTO.class);

		if(companyDTO.getWorker() != null && companyDTO.getWorker().isEmpty()) {
			throw new RuntimeException("Worker description is required");
		}

		if(companyDTO.getProject() != null && companyDTO.getProject().isEmpty()) {
			throw new RuntimeException("Project description is required");
		}

		if(companyDTO.getProject() == null) {
			throw new RuntimeException("Project field is required");
		}

		if(companyDTO.getWorker() == null) {
			throw new RuntimeException("Worker field is required");
		}

		String workerName = companyDTO.getWorker();
		String projectName = companyDTO.getProject();

		Worker foundWorker = null;
		for (Worker w : company.getAssignedWorkers()) {
			if (w.getName().equals(workerName)) {
				foundWorker = w;
				break;
			} 
		}
		if (foundWorker == null) {
			throw new RuntimeException("Worker with name '" + workerName + "' not found");
		}

		Project project = null;
		for (Project p : company.getProjects()) {
			if (p.getName().equals(projectName)) {
				project = p;
				break;
			}
		}

		if (project == null) {
			throw new RuntimeException("Project with name '" + projectName + "' not found");
		}

		company.unassign(foundWorker, project);

		return OK;
	}

	private String startProject(String requestBody) {
		ProjectDTO projectDTO = new Gson().fromJson(requestBody, ProjectDTO.class);
		String projectName = projectDTO.getName();

		if(projectName != null && projectName.isEmpty()) {
			throw new RuntimeException("Project name is required");
		}

		Project project = null;
		for (Project p : company.getProjects()) {
			if (p.getName().equals(projectName)) {
				project = p;
				break;
			}
		}

		if (project == null) {
			throw new RuntimeException("Project with name '" + projectDTO.getName() + "' not found");
		}

		if(project.getMissingQualifications().size() > 0) {
			throw new RuntimeException("Project has missing qualifications");
		}

		company.start(project);

		return OK;
	}

	private String finishProject(String requestBody) {
		ProjectDTO projectDTO = new Gson().fromJson(requestBody, ProjectDTO.class);
		String projectName = projectDTO.getName();

		if(projectName != null && projectName.isEmpty()) {
			throw new RuntimeException("Project name is required");
		}

		Project project = null;
		for(Project p : company.getProjects()) {
			if(p.getName().equals(projectName)){
				project = p;
				break;
			}		
		}

		if (project == null) {
			throw new RuntimeException("Project with name '" + projectDTO.getName() + "' not found");
		}

		if(project.getStatus() == ProjectStatus.SUSPENDED) {
			throw new RuntimeException("Project is suspended, cannot be marked as finished");
		}

		if(project.getStatus() == ProjectStatus.PLANNED) {
			throw new RuntimeException("Project is planned, cannot be marked as finished");
		}

		if(project.getStatus() == ProjectStatus.FINISHED) {
			throw new RuntimeException("Project is already marked as finished");
		}

		company.finish(project);

		return OK;
	}

	// Logs every request received
	private void logRequest(Request request, Response response) {
		log.info(request.requestMethod() + " " + request.pathInfo() + "\nREQUEST:\n" + request.body() + "\nRESPONSE:\n"
				+ response.body());
	}

	// Exception handling
	private void handleException(Exception exception, Response response) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		exception.printStackTrace();
		exception.printStackTrace(pw);
		log.severe(sw.toString());
		response.body(KO);
		response.status(500);
	}

	// Enable CORS
	private void enableCORS(Response response) {
		response.header("Access-Control-Allow-Origin", "*");
	}

	// Enable CORS
	private String optionsCORS(Request request, Response response) {
		String accessControlRequestHeaders = request.headers("Access-Control-Request-Headers");
		if (accessControlRequestHeaders != null)
			response.header("Access-Control-Allow-Headers", accessControlRequestHeaders);

		String accessControlRequestMethod = request.headers("Access-Control-Request-Method");
		if (accessControlRequestMethod != null)
			response.header("Access-Control-Allow-Methods", accessControlRequestMethod);
		return OK;
	}


}
