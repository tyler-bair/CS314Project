package edu.colostate.cs415.server;

import org.junit.Test;
import org.junit.runner.RunWith;

import edu.colostate.cs415.db.DBConnector;
import edu.colostate.cs415.dto.QualificationDTO;
import edu.colostate.cs415.dto.ProjectDTO;
import edu.colostate.cs415.dto.AssignmentDTO;
import edu.colostate.cs415.dto.WorkerDTO;
import edu.colostate.cs415.model.Company;
import edu.colostate.cs415.model.Project;
import edu.colostate.cs415.model.ProjectSize;
import edu.colostate.cs415.model.ProjectStatus;
import edu.colostate.cs415.model.Qualification;
import edu.colostate.cs415.model.Worker;

import static org.mockito.Mockito.*;

import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;

import org.apache.hc.client5.http.fluent.Request;
import org.apache.hc.client5.http.fluent.Response;
import org.apache.hc.core5.http.ContentType;
import org.junit.BeforeClass;

import java.io.IOException;
import com.google.gson.Gson;
import java.util.HashSet;
import static org.junit.Assert.*;
import java.util.Arrays;

@RunWith(MockitoJUnitRunner.class)
public class RestControllerTest {
    public static DBConnector mockdbConnector = mock(DBConnector.class);

    public static Company mockCompany =  new Company("TEST");


    public static RestController restController;

    @BeforeClass
    public static void setUpClass() {
        restController = new RestController(4567, mockdbConnector);
    }

    public void loadMockCompany1() {
        Set<Qualification> qualifications = new HashSet<Qualification>();
        Qualification qualification1 = mockCompany.createQualification("Welding");
        Qualification qualification2 = mockCompany.createQualification("Painting");

        qualifications.add(qualification1);

        Worker worker1 = mockCompany.createWorker("Bob", qualifications, 20.0);

        qualifications.add(qualification2);

        Project project = new Project("ABC", qualifications, ProjectSize.SMALL);

        mockCompany.assign(worker1, project);
    }

    @Test
    public void mockTest() throws IOException {
        loadMockCompany1();
        when(mockdbConnector.loadCompanyData()).thenReturn(mockCompany);
        restController.start();
        Gson gson = new Gson();
        QualificationDTO[] quals = gson.fromJson(
                Request.get("http://localhost:4567/api/qualifications").execute().returnContent().asString(),
                QualificationDTO[].class);

        assertEquals("Welding", quals[0].getDescription());
        assertEquals(2, quals.length);
    }

    // Qualification ENDPOINTS
    // bbgabel Qualification getQualification Test
    @Test
    public void testGetQualifications() throws IOException {
        when(mockdbConnector.loadCompanyData()).thenReturn(new DBConnector().loadCompanyData());
        restController.start();
        Gson gson = new Gson();
        QualificationDTO[] quals = gson.fromJson (
            Request.get("http://localhost:4567/api/qualifications").execute().returnContent().asString(), QualificationDTO[].class
        );
        assertEquals(12, quals.length);
        assertEquals ("Tensorflow", quals[0].getDescription());
        assertEquals ("Cyber Security", quals[2].getDescription());
        assertEquals ("JavaScript", quals[8].getDescription());
    }

    //bbgabel Qualification getQualificationByDescription Tests
    @Test
    public void getQualificationByDescription() throws IOException {
        when(mockdbConnector.loadCompanyData()).thenReturn(new DBConnector().loadCompanyData());
        restController.start();
        Gson gson = new Gson();
        QualificationDTO qual = gson.fromJson (
            Request.get("http://localhost:4567/api/qualifications/MongoDB").execute().returnContent().asString(), QualificationDTO.class
        );
        assertNotNull(qual);
        assertEquals("MongoDB", qual.getDescription());
    }

   @Test(expected = org.apache.hc.client5.http.HttpResponseException.class)
    public void getQualificationByDescription2() throws IOException {
        when(mockdbConnector.loadCompanyData()).thenReturn(new DBConnector().loadCompanyData());
        restController.start();
        Gson gson = new Gson();
        gson.fromJson (
            Request.get("http://localhost:4567/api/qualifications/DoesNotExist").execute().returnContent().asString(), QualificationDTO.class
        );
    }

    @Test
    public void createQualificationMockTest() throws IOException {
        when(mockdbConnector.loadCompanyData()).thenReturn(new DBConnector().loadCompanyData());
        restController.start();
        Gson gson = new Gson();

        QualificationDTO qual = new QualificationDTO();
        qual.setDescription("MockQualification");
        String jsonBody = gson.toJson(qual);

        String response = Request.post("http://localhost:4567/api/qualifications/MockQualification")
            .bodyString(jsonBody, ContentType.APPLICATION_JSON)
            .execute()
            .returnContent()
            .asString();

        assertEquals("OK", response);

        QualificationDTO testQual = gson.fromJson (
            Request.get("http://localhost:4567/api/qualifications/MockQualification").execute().returnContent().asString(), QualificationDTO.class
        );
        assertNotNull(qual);
        assertEquals("MockQualification", testQual.getDescription());
        
    }

    // Worker ENDPOINTS
    // Kypeus Worker getWorkers Test
    @Test
    public void getWorkersMockTest1() throws IOException {
        when(mockdbConnector.loadCompanyData()).thenReturn(new DBConnector().loadCompanyData());
        restController.start();
        Gson gson = new Gson();
        WorkerDTO[] work = gson.fromJson (
            Request.get("http://localhost:4567/api/workers").execute().returnContent().asString(), WorkerDTO[].class
        );
        assertEquals(12, work.length);
        assertEquals ("Jamie Burgess", work[0].getName());
        assertEquals ("Nick Hubbard", work[3].getName());
        assertEquals ("Gene Robertson", work[9].getName());
    }

    // Kypeus Worker getWorker Test
    @Test
    public void getWorkerMockTest1() throws IOException {
        when(mockdbConnector.loadCompanyData()).thenReturn(new DBConnector().loadCompanyData());
        restController.start();
        Gson gson = new Gson();
        WorkerDTO work = gson.fromJson (
            Request.get("http://localhost:4567/api/workers/Gene%20Robertson").execute().returnContent().asString(), WorkerDTO.class
        );
        assertEquals("Gene Robertson", work.getName());
        assert (100000.0 == work.getSalary());
        assertEquals ("Tensorflow", work.getQualifications()[0]);
        assertEquals ("Python", work.getQualifications()[1]);
    }

    // Kypeus Worker getWorker Test for worker not in company
    @Test(expected = org.apache.hc.client5.http.HttpResponseException.class)
    public void getWorkerMockTest2() throws IOException {
        when(mockdbConnector.loadCompanyData()).thenReturn(new DBConnector().loadCompanyData());
        restController.start();
        Gson gson = new Gson();
        gson.fromJson (
            Request.get("http://localhost:4567/api/workers/FakeName").execute().returnContent().asString(), WorkerDTO.class
        );
    }

    // Kypeus Worker createWorker Test
    @Test
    public void createWorkerMockTest1() throws IOException {
        when(mockdbConnector.loadCompanyData()).thenReturn(new DBConnector().loadCompanyData());
        restController.start();

        WorkerDTO work = new WorkerDTO();
        work.setName("Joe");
        work.setSalary(200000);
        work.setQualifications(new String[]{"Angular","Java","Python"});
        
        Gson gson = new Gson();
        String workerJson = gson.toJson(work);

        Response response = Request.post("http://localhost:4567/api/workers/Joe").bodyString(workerJson, ContentType.APPLICATION_JSON).execute();
        
        int statusCode = response.returnResponse().getCode();
        assertEquals(work.getName(), "Joe");
        assertEquals(200, statusCode);
    }

    // Kypeus Worker createWorker Test mismatch name
    @Test
    public void createWorkerMockTest2() throws IOException {
        when(mockdbConnector.loadCompanyData()).thenReturn(new DBConnector().loadCompanyData());
        restController.start();

        WorkerDTO work = new WorkerDTO();
        work.setName("Joe");
        work.setSalary(200000);
        work.setQualifications(new String[]{"Angular","Java","Python"});
        
        Gson gson = new Gson();
        String workerJson = gson.toJson(work);

        Response response = Request.post("http://localhost:4567/api/workers/Walter").bodyString(workerJson, ContentType.APPLICATION_JSON).execute();
        
        int statusCode = response.returnResponse().getCode();
        assertEquals(work.getName(), "Joe");
        assertEquals(200, statusCode);
    }

        // Kypeus Worker createWorker Test bad qualifications
        @Test
        public void createWorkerMockTest3() throws IOException {
        when(mockdbConnector.loadCompanyData()).thenReturn(new DBConnector().loadCompanyData());
        restController.start();
    
            WorkerDTO work = new WorkerDTO();
            work.setName("Joe");
            work.setSalary(200000);
            work.setQualifications(new String[]{"Diving","Java","Python"});
            
            Gson gson = new Gson();
            String workerJson = gson.toJson(work);
    
            Response response = Request.post("http://localhost:4567/api/workers/Joe").bodyString(workerJson, ContentType.APPLICATION_JSON).execute();
            
            int statusCode = response.returnResponse().getCode();
            assertEquals(work.getName(), "Joe");
            assertEquals(500, statusCode);
        }

        // Kypeus Worker createWorker Test negative salary
        @Test
        public void createWorkerMockTest4() throws IOException {
        when(mockdbConnector.loadCompanyData()).thenReturn(new DBConnector().loadCompanyData());
        restController.start();
    
            WorkerDTO work = new WorkerDTO();
            work.setName("Joe");
            work.setSalary(-200000);
            work.setQualifications(new String[]{"Angular","Java","Python"});
            
            Gson gson = new Gson();
            String workerJson = gson.toJson(work);
    
            Response response = Request.post("http://localhost:4567/api/workers/Joe").bodyString(workerJson, ContentType.APPLICATION_JSON).execute();
            
            int statusCode = response.returnResponse().getCode();
            assertEquals(work.getName(), "Joe");
            assertEquals(500, statusCode);
        }

        // Kypeus Worker createWorker Test null qualifications
        @Test
        public void createWorkerMockTest5() throws IOException {
        when(mockdbConnector.loadCompanyData()).thenReturn(new DBConnector().loadCompanyData());
        restController.start();
    
            WorkerDTO work = new WorkerDTO();
            work.setName("Joe");
            work.setSalary(-200000);
            work.setQualifications(null);
            
            Gson gson = new Gson();
            String workerJson = gson.toJson(work);
    
            Response response = Request.post("http://localhost:4567/api/workers/Joe").bodyString(workerJson, ContentType.APPLICATION_JSON).execute();
            
            int statusCode = response.returnResponse().getCode();
            assertEquals(work.getName(), "Joe");
            assertEquals(500, statusCode);
        }

    // PROJECT ENDPOINT
    // chenaa Project getProjects Test
    @Test
    public void getProjectsTest() throws IOException {
        when(mockdbConnector.loadCompanyData()).thenReturn(new DBConnector().loadCompanyData());
        restController.start();
        Gson gson = new Gson();
        ProjectDTO[] proj = gson.fromJson (
            Request.get("http://localhost:4567/api/projects").execute().returnContent().asString(), ProjectDTO[].class
        );
        assertEquals(12, proj.length);
        assertEquals ("Weather Forecasting System", proj[0].getName());
        assertEquals ("Signature Verification System", proj[2].getName());
        assertEquals ("Legacy Software Maintanance", proj[11].getName());
    }

    //chenaa Project getProjectByName Tests
    @Test
    public void getProjectByNameTest() throws IOException {
        when(mockdbConnector.loadCompanyData()).thenReturn(new DBConnector().loadCompanyData());
        restController.start();
        Gson gson = new Gson();
        ProjectDTO proj = gson.fromJson (
            Request.get("http://localhost:4567/api/projects/Weather%20Forecasting%20System").execute().returnContent().asString(), ProjectDTO.class
        );
        assertEquals("Weather Forecasting System", proj.getName());
    }

    @Test(expected = org.apache.hc.client5.http.HttpResponseException.class)
    public void getProjectByNameTest2() throws IOException {
        when(mockdbConnector.loadCompanyData()).thenReturn(new DBConnector().loadCompanyData());
        restController.start();
        Gson gson = new Gson();
        ProjectDTO proj = gson.fromJson (
            Request.get("http://localhost:4567/api/projects/DoesNotExist").execute().returnContent().asString(), ProjectDTO.class
        );
    }

    //chenaa createProject test
    @Test
    public void createProjectTest() throws IOException {
        when(mockdbConnector.loadCompanyData()).thenReturn(new DBConnector().loadCompanyData());
        restController.start();
        Gson gson = new Gson();
        ProjectDTO proj = new ProjectDTO();
        proj.setName("MockProject");
        proj.setQualifications(new String[]{"Java"});
        proj.setSize(ProjectSize.SMALL);
        String jsonBody = gson.toJson(proj);
        String res = Request.post("http://localhost:4567/api/projects/MockProject")
            .bodyString(jsonBody, ContentType.APPLICATION_JSON)
            .execute()
            .returnContent()
            .asString();
        assertEquals("OK",res);

        ProjectDTO projCreated = gson.fromJson (
            Request.get("http://localhost:4567/api/projects/MockProject").execute().returnContent().asString(), ProjectDTO.class
        );

        Set<String> expectedQualifications = new HashSet<>(Arrays.asList("Java"));
        Set<String> actualQualifications = new HashSet<>(Arrays.asList(projCreated.getQualifications()));

        assertEquals("MockProject", projCreated.getName());
        assertEquals(expectedQualifications, actualQualifications);
        assertEquals(ProjectSize.SMALL, projCreated.getSize());
    }

    //chenaa createProject test not matching names 
    @Test(expected = org.apache.hc.client5.http.HttpResponseException.class)
    public void createProjectTest2() throws IOException {
        when(mockdbConnector.loadCompanyData()).thenReturn(new DBConnector().loadCompanyData());
        restController.start();
        Gson gson = new Gson();
        ProjectDTO proj = new ProjectDTO();
        proj.setName("MockitoStuff");
        proj.setQualifications(new String[]{"Java"});
        proj.setSize(ProjectSize.SMALL);
        String jsonBody = gson.toJson(proj);
        String res = Request.post("http://localhost:4567/api/projects/MockProject")
            .bodyString(jsonBody, ContentType.APPLICATION_JSON)
            .execute()
            .returnContent()
            .asString();
        assertEquals("KO",res);
    }

    //chenaa createProject test no quals
    @Test(expected = org.apache.hc.client5.http.HttpResponseException.class)
    public void createProjectTest3() throws IOException {
        when(mockdbConnector.loadCompanyData()).thenReturn(new DBConnector().loadCompanyData());
        restController.start();
        Gson gson = new Gson();
        ProjectDTO proj = new ProjectDTO();
        proj.setName("MockProject");
        proj.setSize(ProjectSize.SMALL);
        String jsonBody = gson.toJson(proj);
        String res = Request.post("http://localhost:4567/api/projects/MockProject")
            .bodyString(jsonBody, ContentType.APPLICATION_JSON)
            .execute()
            .returnContent()
            .asString();
        assertEquals("KO",res);
    }
  
    //chenaa createProject test no size
    @Test(expected = org.apache.hc.client5.http.HttpResponseException.class)
    public void createProjectTest4() throws IOException {
        when(mockdbConnector.loadCompanyData()).thenReturn(new DBConnector().loadCompanyData());
        restController.start();
        Gson gson = new Gson();
        ProjectDTO proj = new ProjectDTO();
        proj.setName("MockitoStuff");
        proj.setQualifications(new String[]{"Java"});
        String jsonBody = gson.toJson(proj);
        String res = Request.post("http://localhost:4567/api/projects/MockProject")
            .bodyString(jsonBody, ContentType.APPLICATION_JSON)
            .execute()
            .returnContent()
            .asString();
        assertEquals("KO",res);
    }

    //COMPANY ENDPOINT
    //tylerbair assign worker to project test
    @Test
    public void assignWorkerTest1() throws IOException {
        when(mockdbConnector.loadCompanyData()).thenReturn(new DBConnector().loadCompanyData());
        restController.start();
        
        AssignmentDTO assignment = new AssignmentDTO();

        assignment.setWorker("Erika Johnston");
        assignment.setProject("Android Task Monitoring");
        
        Gson gson = new Gson();
        String assignmentJson = gson.toJson(assignment);


        Response response = Request.put("http://localhost:4567/api/assign").bodyString(assignmentJson, ContentType.APPLICATION_JSON).execute();

        int statusCode = response.returnResponse().getCode();

        assertEquals(assignment.getWorker(), "Erika Johnston");
        assertEquals(assignment.getProject(), "Android Task Monitoring");
        assertEquals(200, statusCode);
    }

    //kypeus assign worker to project test - not real worker
    @Test
    public void assignWorkerTest2() throws IOException {
        when(mockdbConnector.loadCompanyData()).thenReturn(new DBConnector().loadCompanyData());
        restController.start();
        
        AssignmentDTO assignment = new AssignmentDTO();

        assignment.setWorker("Aladin");
        assignment.setProject("Android Task Monitoring");
        
        Gson gson = new Gson();
        String assignmentJson = gson.toJson(assignment);


        Response response = Request.put("http://localhost:4567/api/assign").bodyString(assignmentJson, ContentType.APPLICATION_JSON).execute();

        int statusCode = response.returnResponse().getCode();
        assertEquals(500, statusCode);
    }

    //kypeus assign worker to project test - not real Project
    @Test
    public void assignWorkerTest3() throws IOException {
        when(mockdbConnector.loadCompanyData()).thenReturn(new DBConnector().loadCompanyData());
        restController.start();
        
        AssignmentDTO assignment = new AssignmentDTO();

        assignment.setWorker("Erika Johnston");
        assignment.setProject("Being Lazy");
        
        Gson gson = new Gson();
        String assignmentJson = gson.toJson(assignment);


        Response response = Request.put("http://localhost:4567/api/assign").bodyString(assignmentJson, ContentType.APPLICATION_JSON).execute();

        int statusCode = response.returnResponse().getCode();
        assertEquals(500, statusCode);
    }

    //kypeus assign worker to project test - Project Finished
    @Test
    public void assignWorkerTest4() throws IOException {
        when(mockdbConnector.loadCompanyData()).thenReturn(new DBConnector().loadCompanyData());
        restController.start();
        
        AssignmentDTO assignment = new AssignmentDTO();

        assignment.setWorker("Erika Johnston");
        assignment.setProject("AI Shopping System");
        
        Gson gson = new Gson();
        String assignmentJson = gson.toJson(assignment);


        Response response = Request.put("http://localhost:4567/api/assign").bodyString(assignmentJson, ContentType.APPLICATION_JSON).execute();

        int statusCode = response.returnResponse().getCode();
        assertEquals(500, statusCode);
    }

    //kypeus assign worker to project test - Doesn't meet qualifications
    @Test
    public void assignWorkerTest5() throws IOException {
        when(mockdbConnector.loadCompanyData()).thenReturn(new DBConnector().loadCompanyData());
        restController.start();
        
        AssignmentDTO assignment = new AssignmentDTO();

        assignment.setWorker("Nina Banks");
        assignment.setProject("Android Task Monitoring");
        
        Gson gson = new Gson();
        String assignmentJson = gson.toJson(assignment);


        Response response = Request.put("http://localhost:4567/api/assign").bodyString(assignmentJson, ContentType.APPLICATION_JSON).execute();

        int statusCode = response.returnResponse().getCode();
        assertEquals(500, statusCode);
    }

    //tylerbair unassign worker from project test
    @Test
    public void unassignWorkerTest1() throws IOException {
        when(mockdbConnector.loadCompanyData()).thenReturn(new DBConnector().loadCompanyData());
        restController.start();
        
        AssignmentDTO assignment = new AssignmentDTO();

        assignment.setWorker("Nick Hubbard");
        assignment.setProject("Credit Card Fraud Detection");
        
        Gson gson = new Gson();
        String assignmentJson = gson.toJson(assignment);
        
        assertEquals(assignment.getWorker(), "Nick Hubbard");
        assertEquals(assignment.getProject(), "Credit Card Fraud Detection");

        Response response = Request.put("http://localhost:4567/api/unassign").bodyString(assignmentJson, ContentType.APPLICATION_JSON).execute();

        int statusCode = response.returnResponse().getCode();

        //If 200, confirms worker was removed.
        assertEquals(200, statusCode);
    }

    //tylerbair start project by name test
    @Test
    public void startProjectTest1() throws IOException {
        when(mockdbConnector.loadCompanyData()).thenReturn(new DBConnector().loadCompanyData());
        restController.start();

        ProjectDTO projectDTO = new ProjectDTO();

        projectDTO.setName("Weather Forecasting System");

        Gson gson = new Gson();
        String projectJson = gson.toJson(projectDTO);

        assertEquals(projectDTO.getName(), "Weather Forecasting System");

        Response response = Request.put("http://localhost:4567/api/start").bodyString(projectJson, ContentType.APPLICATION_JSON).execute();

        int statusCode = response.returnResponse().getCode();

        assertEquals(200, statusCode);
    }

    //tylerbair project missing qualifications and in FINISHED state
    @Test
    public void startProjectTest2() throws IOException {
        when(mockdbConnector.loadCompanyData()).thenReturn(new DBConnector().loadCompanyData());
        restController.start();

        ProjectDTO projectDTO = new ProjectDTO();

        projectDTO.setName("AI Shopping System");

        Gson gson = new Gson();
        String projectJson = gson.toJson(projectDTO);

        assertEquals(projectDTO.getName(), "AI Shopping System");

        Response response = Request.put("http://localhost:4567/api/start").bodyString(projectJson, ContentType.APPLICATION_JSON).execute();

        int statusCode = response.returnResponse().getCode();

        assertEquals(500, statusCode);
    }

    //tylerbair project in PLANNED with missing qualificatons
    @Test
    public void startProjectTest3() throws IOException {
        when(mockdbConnector.loadCompanyData()).thenReturn(new DBConnector().loadCompanyData());
        restController.start();

        ProjectDTO projectDTO = new ProjectDTO();

        projectDTO.setName("Android Task Monitoring");

        Gson gson = new Gson();
        String projectJson = gson.toJson(projectDTO);

        assertEquals(projectDTO.getName(), "Android Task Monitoring");

        Response response = Request.put("http://localhost:4567/api/start").bodyString(projectJson, ContentType.APPLICATION_JSON).execute();

        int statusCode = response.returnResponse().getCode();

        assertEquals(500, statusCode);
    }

        //tylerbair project is already ACTIVE
        @Test
        public void startProjectTest4() throws IOException {
            when(mockdbConnector.loadCompanyData()).thenReturn(new DBConnector().loadCompanyData());
            restController.start();
    
            ProjectDTO projectDTO = new ProjectDTO();
    
            projectDTO.setName("Ecommerce Fake Product Reviews Detection System");
    
            Gson gson = new Gson();
            String projectJson = gson.toJson(projectDTO);
    
            assertEquals(projectDTO.getName(), "Ecommerce Fake Product Reviews Detection System");
    
            Response response = Request.put("http://localhost:4567/api/start").bodyString(projectJson, ContentType.APPLICATION_JSON).execute();
    
            int statusCode = response.returnResponse().getCode();
    
            assertEquals(500, statusCode);
        }


    //tylerbair finish project correctly marks active project as finished
    @Test
    public void finishProjectTest1() throws IOException {
        when(mockdbConnector.loadCompanyData()).thenReturn(new DBConnector().loadCompanyData());
        restController.start();

        ProjectDTO projectDTO = new ProjectDTO();

        projectDTO.setName("Credit Card Fraud Detection");

        Gson gson = new Gson();
        String projectJson = gson.toJson(projectDTO);

        assertEquals(projectDTO.getName(), "Credit Card Fraud Detection");

        Response response = Request.put("http://localhost:4567/api/finish").bodyString(projectJson, ContentType.APPLICATION_JSON).execute();

        int statusCode = response.returnResponse().getCode();

        assertEquals(200, statusCode);
    }
    //tylerbair planned project throws exception when trying to mark as finish
    @Test
    public void finishProjectTest2() throws IOException {
        when(mockdbConnector.loadCompanyData()).thenReturn(new DBConnector().loadCompanyData());
        restController.start();

        ProjectDTO projectDTO = new ProjectDTO();

        projectDTO.setName("Signature Verification System");

        Gson gson = new Gson();
        String projectJson = gson.toJson(projectDTO);

        assertEquals(projectDTO.getName(), "Signature Verification System");

        Response response = Request.put("http://localhost:4567/api/finish").bodyString(projectJson, ContentType.APPLICATION_JSON).execute();

        int statusCode = response.returnResponse().getCode();

        assertEquals(500, statusCode);
    }
        //tylerbair suspended project throws exception when trying to mark as finish
        @Test
        public void finishProjectTest3() throws IOException {
            when(mockdbConnector.loadCompanyData()).thenReturn(new DBConnector().loadCompanyData());
            restController.start();
    
            ProjectDTO projectDTO = new ProjectDTO();
    
            projectDTO.setName("Fingerprint-Based ATM System");
    
            Gson gson = new Gson();
            String projectJson = gson.toJson(projectDTO);
    
            assertEquals(projectDTO.getName(), "Fingerprint-Based ATM System");
    
            Response response = Request.put("http://localhost:4567/api/finish").bodyString(projectJson, ContentType.APPLICATION_JSON).execute();
    
            int statusCode = response.returnResponse().getCode();
    
            assertEquals(500, statusCode);
        }

        //tylerbair finished project throws exception when trying to mark as finish
        @Test
        public void finishProjectTest4() throws IOException {
            when(mockdbConnector.loadCompanyData()).thenReturn(new DBConnector().loadCompanyData());
            restController.start();
    
            ProjectDTO projectDTO = new ProjectDTO();
    
            projectDTO.setName("AI Shopping System");
    
            Gson gson = new Gson();
            String projectJson = gson.toJson(projectDTO);
    
            assertEquals(projectDTO.getName(), "AI Shopping System");
    
            Response response = Request.put("http://localhost:4567/api/finish").bodyString(projectJson, ContentType.APPLICATION_JSON).execute();
    
            int statusCode = response.returnResponse().getCode();
    
            assertEquals(500, statusCode);
        }
        // pdj1183 null company
    @Test 
    public void nullCompany() throws IOException{
        when(mockdbConnector.loadCompanyData()).thenReturn(null);
        restController.start();

        Response response = Request.get("http://localhost:4567/api/projects").execute();
        Response response2 = Request.get("http://localhost:4567/api/qualifications").execute();
        Response response3 = Request.get("http://localhost:4567/api/workers").execute();

        assertEquals(response.returnResponse().getCode(), 500);
        assertEquals(response2.returnResponse().getCode(), 500);
        assertEquals(response3.returnResponse().getCode(), 500);
    }
    
    // pdj1183 empty company
    @Test
    public void emptyCompany() throws IOException{
        when(mockdbConnector.loadCompanyData()).thenReturn(new Company("TEST"));
        restController.start();

        Response response = Request.get("http://localhost:4567/api/projects").execute();
        Response response2 = Request.get("http://localhost:4567/api/qualifications").execute();
        Response response3 = Request.get("http://localhost:4567/api/workers").execute();

        String result = response.returnContent().asString();
        String result2 = response2.returnContent().asString();
        String result3 = response3.returnContent().asString();

        assertEquals(result, "[]");
        assertEquals(result2, "[]");
        assertEquals(result3, "[]");
    }


    @Test
    public void emptyCompany2() throws IOException {
        when(mockdbConnector.loadCompanyData()).thenReturn(new Company("TEST"));
        restController.start();

        Gson gson = new Gson();
        ProjectDTO[] proj = gson.fromJson (
            Request.get("http://localhost:4567/api/projects").execute().returnContent().asString(), ProjectDTO[].class
        ); 
        QualificationDTO[] quals = gson.fromJson (
            Request.get("http://localhost:4567/api/qualifications").execute().returnContent().asString(), QualificationDTO[].class
        );
        WorkerDTO[] work = gson.fromJson (
            Request.get("http://localhost:4567/api/workers").execute().returnContent().asString(), WorkerDTO[].class
        );

        assertEquals(0, proj.length);
        assertEquals(0, quals.length);
        assertEquals(0, work.length);

        QualificationDTO qual = new QualificationDTO();
        qual.setDescription("Welding");

        String jsonBody = gson.toJson(qual);

        String response = Request.post("http://localhost:4567/api/qualifications/Welding")
            .bodyString(jsonBody, ContentType.APPLICATION_JSON)
            .execute()
            .returnContent()
            .asString();

        assertEquals("OK", response);


        qual.setDescription("Painting");

        jsonBody = gson.toJson(qual);

        response = Request.post("http://localhost:4567/api/qualifications/Painting")
            .bodyString(jsonBody, ContentType.APPLICATION_JSON)
            .execute()
            .returnContent()
            .asString();

        assertEquals("OK", response);

        quals = gson.fromJson (
            Request.get("http://localhost:4567/api/qualifications").execute().returnContent().asString(), QualificationDTO[].class
        );

        assertEquals(2, quals.length);


        ProjectDTO proj2 = new ProjectDTO();
        proj2.setName("MockProject");
        proj2.setQualifications(new String[]{"Welding", "Painting"});
        proj2.setSize(ProjectSize.SMALL);

        jsonBody = gson.toJson(proj2);
        response = Request.post("http://localhost:4567/api/projects/MockProject")
            .bodyString(jsonBody, ContentType.APPLICATION_JSON)
            .execute()
            .returnContent()
            .asString();
        assertEquals("OK",response);


        WorkerDTO work2 = new WorkerDTO();
        work2.setName("Joe");
        work2.setSalary(200000);
        work2.setQualifications(new String[]{"Welding"});
        
        jsonBody = gson.toJson(work2);
        response = Request.post("http://localhost:4567/api/workers/Joe")
            .bodyString(jsonBody, ContentType.APPLICATION_JSON)
            .execute()
            .returnContent()
            .asString();

        assertEquals("OK", response);

        AssignmentDTO assignment = new AssignmentDTO();
        assignment.setWorker("Joe");
        assignment.setProject("MockProject");

        jsonBody = gson.toJson(assignment);
        response = Request.put("http://localhost:4567/api/assign")
            .bodyString(jsonBody, ContentType.APPLICATION_JSON)
            .execute()
            .returnContent()
            .asString();
        assertEquals("OK", response);

        ProjectDTO proj3 = gson.fromJson (
            Request.get("http://localhost:4567/api/projects/MockProject").execute().returnContent().asString(), ProjectDTO.class
        );

        // assertEquals("{ name='MockProject', size='SMALL', status='PLANNED', workers='[Joe]', qualifications='[Welding, Painting]', missingQualifications='[Painting]'}", proj3.toString());
        assertEquals("MockProject", proj3.getName());
        assertEquals(ProjectSize.SMALL.toString(), proj3.getSize().toString());
        assertEquals(ProjectStatus.PLANNED.toString(), proj3.getStatus().toString());
        assertEquals(1, proj3.getWorkers().length);
        assertEquals("Joe", proj3.getWorkers()[0]);
        assertEquals(2, proj3.getQualifications().length);
        assertEquals("Welding", proj3.getQualifications()[0]);
        assertEquals("Painting", proj3.getQualifications()[1]);

        WorkerDTO work3 = new WorkerDTO();
        work3.setName("Bob");
        work3.setSalary(200000);
        work3.setQualifications(new String[]{"Painting"});

        jsonBody = gson.toJson(work3);
        response = Request.post("http://localhost:4567/api/workers/Bob")
            .bodyString(jsonBody, ContentType.APPLICATION_JSON)
            .execute()
            .returnContent()
            .asString();

        assertEquals("OK", response);

        AssignmentDTO assignment2 = new AssignmentDTO();
        assignment2.setWorker("Bob");
        assignment2.setProject("MockProject");

        jsonBody = gson.toJson(assignment2);
        response = Request.put("http://localhost:4567/api/assign")
            .bodyString(jsonBody, ContentType.APPLICATION_JSON)
            .execute()
            .returnContent()
            .asString();
        assertEquals("OK", response);


        jsonBody = gson.toJson(proj3);

        response = Request.put("http://localhost:4567/api/start")
            .bodyString(jsonBody, ContentType.APPLICATION_JSON)
            .execute()
            .returnContent()
            .asString();

        assertEquals("OK", response);

        ProjectDTO proj4 = gson.fromJson (
            Request.get("http://localhost:4567/api/projects/MockProject").execute().returnContent().asString(), ProjectDTO.class
        );

        assertEquals(proj4.getStatus().toString(), ProjectStatus.ACTIVE.toString());
    }
}
