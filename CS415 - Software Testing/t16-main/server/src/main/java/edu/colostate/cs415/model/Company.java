package edu.colostate.cs415.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Objects;

public class Company {

	private String name;
	private Set<Worker> employees;
	private Set<Worker> available;
	private Set<Worker> assigned;
	private Set<Project> projects;
	private Set<Qualification> qualifications;

	// Creates an instance of company with empty worker types, projects, and
	// qualifications
	// Company is always initialized with these empty, besides the name
	public Company(String name) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("name cannot be empty");
        } else {
			this.name = name;
        }
			this.employees = new HashSet<>();
			this.available = new HashSet<>();
			this.assigned = new HashSet<>();
			this.projects = new HashSet<>();
			this.qualifications = new HashSet<>();
	}

	// This operation will be used by JUnit.
	// Note that the argument to this operation must be of type Object, i.e. not
	// equals (c : Company), etc.
	// You will override the equals(o : Object) method inherited by the class.
	// Two Company instances are equal if and only if their names match.
	// Note that it is good practice to override the hashCode method when equals is
	// overridden but we won't be testing it in this assignment.
	@Override
	public boolean equals(Object other) {
		if (other == null)
			return false;
		if (!(other instanceof Company))
			return false;
		Company otherCompany = (Company) other;
		return Objects.equals(this.name, otherCompany.name);
	}

	@Override
	public String toString() {
		return this.name + ":" + this.available.size() + ":" + this.projects.size();
	}

	public String getName() {
		return this.name;
	}

	public Set<Worker> getEmployedWorkers() {
		return new HashSet<Worker>(this.employees);
	}

	public Set<Worker> getAvailableWorkers() {
		return new HashSet<Worker>(this.available);
	}

	public Set<Worker> getUnavailableWorkers() {
		Set<Worker> unavailableWorkers = new HashSet<>(employees);
		unavailableWorkers.removeAll(available);
		return unavailableWorkers;
	}

	public Set<Worker> getAssignedWorkers() {
		return new HashSet<Worker>(this.assigned);
	}

	public Set<Worker> getUnassignedWorkers() {
		Set<Worker> unassignedWorkers = new HashSet<>(employees);
		unassignedWorkers.removeAll(assigned);
		return unassignedWorkers;
	}

	public Set<Project> getProjects() {
		return new HashSet<Project>(this.projects);
	}

	public Set<Qualification> getQualifications() {
		return new HashSet<Qualification>(this.qualifications);
	}

	public Worker createWorker(String name, Set<Qualification> qualifications, double salary) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Worker name cannot be empty or null");
		}
		if (qualifications == null || qualifications.isEmpty()) {
			throw new IllegalArgumentException("Qualifications cannot be empty or null");
		}

		if (salary <= 0.0) {
			throw new IllegalArgumentException("Salary cannot be less than or equal to zero");
		}

		Worker worker = new Worker(name, qualifications, salary);
		this.available.add(worker);
		this.employees.add(worker);

		for (Qualification q : qualifications) {
			if (!(this.qualifications.contains(q))) {
				throw new IllegalArgumentException("Qualification is not in the company set");
			}
			q.addWorker(worker);
		}

		return worker;
	}

	public Qualification createQualification(String description) {
		if (description != null && !description.isEmpty()) {
			Qualification newQualifications = new Qualification(description);
			this.qualifications.add(newQualifications);
			return newQualifications;
		} else {
			throw new IllegalArgumentException("Description cannot be empty");
		}
	}

	public Project createProject(String name, Set<Qualification> qualifications, ProjectSize size) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Project name cannot be null or empty");
		}

		if (qualifications == null || qualifications.isEmpty()) {
			throw new IllegalArgumentException("Qualifications cannot be null or empty");
		}

		if (size == null) {
			throw new IllegalArgumentException("Project size cannot be null");
		}

		for (Qualification q : qualifications) {
			if (!(this.qualifications.contains(q))) {
				throw new IllegalArgumentException("Qualification is not in the company set");
			}
		}

		Project newProject = new Project(name, qualifications, size);
		this.projects.add(newProject);
		return newProject;
	}

	public void start(Project project) {
		if ((project.getStatus() == ProjectStatus.PLANNED || project.getStatus() == ProjectStatus.SUSPENDED)
				&& project.getMissingQualifications().isEmpty()) {
			project.setStatus(ProjectStatus.ACTIVE);
		} else if (project.getStatus() == ProjectStatus.ACTIVE){
			throw new IllegalArgumentException("Project is already active.");
		} else if (project.getStatus() == ProjectStatus.FINISHED) {
			throw new IllegalArgumentException("Project is in the finished state and cannot be started again.");
		}
	}

	public void finish(Project project) {
		if (project.getStatus() == ProjectStatus.ACTIVE) {
			project.setStatus(ProjectStatus.FINISHED);

			Set<Worker> assignedWorkers = new HashSet<>(project.getWorkers());
			for (Worker worker : assignedWorkers) {
				unassign(worker, project);
			}
		} else if (project.getStatus() == ProjectStatus.FINISHED) {
			Set<Worker> assignedWorkers = new HashSet<>(project.getWorkers());
			for (Worker worker : assignedWorkers) {
				unassign(worker, project);
			}
		}
	}

	public void assign(Worker worker, Project project) {
		if (project.getStatus() == ProjectStatus.ACTIVE || project.getStatus() == ProjectStatus.FINISHED) {
			throw new IllegalArgumentException("Project must not be in ACTIVE or FINISHED state");
		}
		if (project.getWorkers().contains(worker)) {
			throw new IllegalArgumentException("Worker is already assigned");
		}
		if (!worker.willOverload(project) && project.isHelpful(worker)) {
			project.addWorker(worker);
			worker.addProject(project);
			if (!getAssignedWorkers().contains(worker)) {
				this.assigned.add(worker);
			}
			if (!worker.isAvailable()) {
				this.available.remove(worker);
			}
		} else {
			throw new IllegalArgumentException("Worker cannot be assigned");
		}
	}

	public void unassign(Worker worker, Project project) {
		if (project.getWorkers().contains(worker)) {
			if (worker.getProjects().size() == 1) {
				this.assigned.remove(worker);
			}
			project.removeWorker(worker);
			worker.removeProject(project);
			if (worker.isAvailable()) {
				this.available.add(worker);
			}
		}

		if (project.getMissingQualifications().size() > 0 && project.getStatus() == ProjectStatus.ACTIVE) {
			project.setStatus(ProjectStatus.SUSPENDED);
		}
	}

	public void unassignAll(Worker worker) {
		List<Project> projects = new ArrayList<>(worker.getProjects());

		for (Project proj : projects) {
			worker.removeProject(proj);
			proj.removeWorker(worker);

			if (proj.getMissingQualifications().size() > 0 && proj.getStatus() == ProjectStatus.ACTIVE) {
				proj.setStatus(ProjectStatus.SUSPENDED);
			}
		}

		this.assigned.remove(worker);
	    this.available.add(worker);
	}
}
