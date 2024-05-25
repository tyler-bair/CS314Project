package edu.colostate.cs415.model;

import java.util.Set;
import java.util.HashSet;

import edu.colostate.cs415.dto.ProjectDTO;

public class Project {

	private String name;
	private ProjectSize size;
	private ProjectStatus status;
	private Set<Worker> workers;
	private Set<Qualification> qualifications;

    //Creates an instance of a project with the name, qualifications, and size.
    //A project always starts in the PLANNED state.
    //Check for boundary conditions on the qualification set as well as the requirements on the String reference (not null).
    //These qualifications must be from the company's set of qualifications.
    public Project(String name, Set<Qualification> qualifications, ProjectSize size) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Project name cannot be null or empty");
        } else {
            this.name = name;
        }

        if (qualifications == null || qualifications.isEmpty()) {
            throw new IllegalArgumentException("Qualifications cannot be null");
        } else {
            this.qualifications = new HashSet<Qualification>(qualifications);
        }

        if (size == null) {
            throw new IllegalArgumentException("Project size cannot be null");
        } else {
            this.size = size;
        }
        this.workers = new HashSet<Worker>();
        this.status = ProjectStatus.PLANNED;

	}

    //This operation will be used by JUnit.
    //Note that the argument to this operation must be of type Object, i.e. not equals (p : Project), etc.
    //You will override the equals(o : Object) method inherited by the class.
    //Two Project instances are equal if and only if their names match.
    //Note that it is good practice to override the hashCode method when equals is overridden but we won't be testing it in this assignment.
	@Override
	public boolean equals(Object other) {
        if(other == null){
            return false;
        }
        String otherName = other.toString();
        try {
            otherName = otherName.substring(0, otherName.indexOf(":"));
        } catch (Exception e) {
            return false;
        }
        if (otherName.equals(this.name)) {
            return true;}
		return false;
	}

    //This operation is used when storing the object into a hashset or hashtable.
    //It returns the hashcode of the attribute name.
	@Override
	public int hashCode() {
        return this.name.hashCode();
	}

    //Returns a String that includes the name, colon, number of assigned workers, colon, status.
    //For example, a project named "CS5Anniv" using 10 assigned workers and status PLANNED will result in CS5Anniv:10:PLANNED.
    //In the string, status is in upper case (as shown in the UML class diagram).
	@Override
	public String toString() {
        String out = "";
        out += this.name + ":" + this.workers.size() + ":" + this.status.toString();
		return out;
	}

    //Returns the name of the project.
	public String getName() {
		return this.name;
	}

    //Returns the size of the project.
	public ProjectSize getSize() {
		return this.size;
	}

    //Returns the status of the project.
	public ProjectStatus getStatus() {
		return this.status;
	}

    //Sets the status of the project.
	public void setStatus(ProjectStatus status) {
        this.status = status;
	}

    //Adds a worker to the project.
    //It is up to the caller to determine whether this worker can be added to the project and all the project and company constraints are still enforced.
    //For example, it is called by the assign method in the Company class.
	public void addWorker(Worker worker) {
        if (worker == null) {
            throw new NullPointerException("Worker cannot be null");
        }
        this.workers.add(worker);
	}

    //Removes a worker from the project.
    //It is up to the caller to determine whether this worker can be removed from the project and if removed, making sure all the other project and company constraints are still enforced.
    //For example, it is called by the unassign in the Company class.
	public void removeWorker(Worker worker) {
        if (worker == null) {
            throw new NullPointerException("Worker cannot be null");
        }
        if (!this.workers.remove(worker)) {
            throw new IllegalArgumentException("Worker not found in project");
        }
	}

    //Returns the set of workers assigned to the project.
    //The order in the set is not under your control, so your tests shouldn't assume any specific ordering in the returned object.
    //Return an empty set if there are no workers.
	public Set<Worker> getWorkers() {
		return new HashSet<Worker>(this.workers);
	}

    //Removes all the workers assigned to the project.
    //It's the responsibility of the calling method to make sure this can be done, and if it is done, the caller ensures that the state of the project is consistent.
    //This part is not the responsibility of the removeAllWorkers method.
	public void removeAllWorkers() {
        this.workers.clear();
	}

    //Returns the set of all the qualifications required for the project.
    //The order in the set is not under your control, so your tests shouldn't assume any specific ordering in the returned object.
    //Return an empty set if there are no qualifications.
	public Set<Qualification> getRequiredQualifications() {
		return new HashSet<Qualification>(this.qualifications);
	}

    //Add q to the set of qualifications required for the project.
    //The set of qualifications for the project should have no duplicates.
    //It's the caller's responsibility to ensure that this qualification is from the company's set of qualifications.
	public void addQualification(Qualification qualification) {
        if (qualification == null) {
            throw new NullPointerException("Qualification cannot be null");
        }
        this.qualifications.add(qualification);
	}

    //Compare the qualifications required by the project and those that are met by the workers currently assigned to the project.
    //Return the set of qualifications that are not met.
    //An empty set (not null set) is returned when all the qualification requirements are met.
    //The order in the set is not under your control, so your tests shouldn't assume any specific ordering in the returned object.
    //Return an empty set if there are no missing qualifications.

	public Set<Qualification> getMissingQualifications() {
        Set<Qualification> reqQuals = getRequiredQualifications();
        Set<Qualification> workerQuals = new HashSet<Qualification>();
        for (Worker w : getWorkers()) {
            workerQuals.addAll(w.getQualifications());
        }
        reqQuals.removeAll(workerQuals);
		return reqQuals;
	}

    //If at least one of the missing qualification requirements of a project is satisfied by the worker, then return true, else return false.
	public boolean isHelpful(Worker worker) {
        if (worker == null) {
            throw new NullPointerException("Worker cannot be null");
        }
        if (worker.getQualifications().isEmpty()) {
            return false;
        }
        Set<Qualification> missingQuals = getMissingQualifications();
        for (Qualification q : missingQuals) {
            if (worker.getQualifications().contains(q)) {
                return true;
            }
        }
		return false;
	}

    //Returns a data-transfer-object representing the project.
    //The object contains the names of the workers.
    //Do not use the toString() method.
	public ProjectDTO toDTO() {
        String[] workersString = new String[this.workers.size()];
        int i = 0;
        for (Worker w : this.workers) {
            workersString[i] = w.getName();
            i++;
        }
        i = 0;
        String[] qualificationsString = new String[this.qualifications.size()];
        for (Qualification q : this.qualifications) {
            qualificationsString[i] = q.toString();
            i++;
        }
        i = 0;
        Set<Qualification> missingQuals = getMissingQualifications();
        String[] missingQualifications = new String[missingQuals.size()];
        for (Qualification q : missingQuals) {
            missingQualifications[i] = q.toString();
            i++;
        }
     
        ProjectDTO dto = new ProjectDTO(this.name, this.size, this.status, workersString, qualificationsString, missingQualifications);
		return dto;
	}
}
