package edu.colostate.cs415.model;

import java.util.Set;
import java.util.HashSet;
import java.util.Objects;


import edu.colostate.cs415.dto.WorkerDTO;

public class Worker {

	public static final int MAX_WORKLOAD = 12;

	private String name;
	private double salary;
	private Set<Project> projects;
	private Set<Qualification> qualifications;

	public Worker(String name, Set<Qualification> qualifications, double salary) {
        if (name == null) {
			throw new IllegalArgumentException("Worker name cannot be null");
		}
        else if (name.isEmpty()){
            throw new IllegalArgumentException("Worker name cannot be empty");
        }
        this.name = name;

        if (salary < 0) {
			throw new IllegalArgumentException("Salary must be positive number");
		}
        else{
            this.salary = salary;
        }

        if(qualifications == null){
            throw new IllegalArgumentException("Qualifications can not be null");
        }
        else{
            this.qualifications = new HashSet<Qualification>(qualifications);
        }
        
        this.projects = new HashSet<Project>();
	}

	@Override
    public boolean equals(Object other) {
        if (!(other instanceof Worker))
            return false;
        Worker otherWorker = (Worker) other;
        return Objects.equals(this.name, otherWorker.name);
    }


	@Override
	public int hashCode() {
		return this.name.hashCode();
	}

	@Override
	public String toString() {
            return this.name + ':' + this.projects.size() + ':' + this.qualifications.size()
                   + ':' + (int) Math.floor(this.salary);
	}

	public String getName() {
		return this.name;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("salary can not be a negative number");
        } else {
            this.salary = salary;
        }
	}

	public Set<Qualification> getQualifications() {
		return new HashSet<Qualification>(qualifications);
	}

	public void addQualification(Qualification qualification) {
        if(qualification == null){
            return;
        }
        for(Qualification q: this.qualifications){
            if(q.equals(qualification)){
                return;
            }
        }
        this.qualifications.add(qualification);
	}

	public Set<Project> getProjects() {
		return new HashSet<Project>(projects);
	}

	public void addProject(Project project) {
        if (project == null){
            throw new IllegalArgumentException("project can not be null");
        }
        this.projects.add(project);
	}

	public void removeProject(Project project) {
        if (project == null) {
            throw new NullPointerException("project cannot be null");
        }
        if (!this.projects.remove(project)) {
            throw new IllegalArgumentException("project not assigned to worker");
        }
	}

	public int getWorkload() {
        int workload = 0;
        for(Project proj:this.projects){
            if(proj.getSize() == ProjectSize.SMALL){
                workload++;
            }
            else if(proj.getSize() == ProjectSize.MEDIUM){
                workload = workload + 2;
            }
            else{
                workload = workload + 3;
            }
        }
		return workload;
	}

	public boolean willOverload(Project project) {
        if(project == null){
            throw new NullPointerException("project can not be null");
        }
        for(Project p : this.projects){
            if(p.equals(project)){
                throw new IllegalArgumentException("Worker is already assigned to the project");
            }
        }

        int loadAfterAdd = this.getWorkload();

        switch(project.getSize()){
            case SMALL:
                loadAfterAdd = loadAfterAdd + 1;
                break;
            case MEDIUM:
                loadAfterAdd = loadAfterAdd + 2;
                break;
            case BIG: 
                loadAfterAdd = loadAfterAdd + 3;
                break;
        }

        if(loadAfterAdd > 12){
            return true;
        }
		return false;
	}

	public boolean isAvailable() {
        if(this.getWorkload() < 12){
		    return true;
        }
        return false;
	}

	public WorkerDTO toDTO() {
        String projectNames[] = new String[this.projects.size()];
        String qualificationDescriptions[] = new String[this.qualifications.size()];

        int i = 0;
        for(Project p: this.projects){
            projectNames[i] = p.getName();
            i++;
        }

        i = 0;
        for(Qualification q: this.qualifications){
            qualificationDescriptions[i] = q.toString();
            i++;
        }
        
		return new WorkerDTO(this.name,this.salary,this.getWorkload(),projectNames,qualificationDescriptions);
	}
}
