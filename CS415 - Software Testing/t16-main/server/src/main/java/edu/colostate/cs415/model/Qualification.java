package edu.colostate.cs415.model;

import java.util.Set;
import java.util.HashSet;
import java.util.Objects;


import edu.colostate.cs415.dto.QualificationDTO;

public class Qualification {

	private String description;
	private Set<Worker> workers;

	public Qualification(String description) {
        if (description==null){
            throw new IllegalArgumentException("Description can not be null");
        } else if ( description.isEmpty() ) {
			throw new IllegalArgumentException("Description cannot be empty");
		}
        else{
		    this.description = description;
        }
	}

//  This operation will be used by JUnit.
//  Note that the argument to this operation must be of type Object, i.e. not equals(q : Qualification), etc.
//  You will override the equals(o : Object) method inherited by the class.
//  Two Qualification instances are equal if and only if their descriptions match.
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Qualification))
			return false;
		Qualification otherQualification = (Qualification) other;
		return Objects.equals(this.description, otherQualification.description);
	}


//  This operation is used when storing the object into a hashset or hashtable.
//  It returns the hashcode of the attribute description.
	@Override
	public int hashCode() {
        if (this.description != null) {
            return this.description.hashCode();
        }
		return 0;
	}

//  Returns the description.
	@Override
	public String toString() {
        return this.description.toString();
	}

//  Returns the set of workers that have this qualification.
//  The order in the set is not under your control, so your tests shouldn't assume any specific ordering in the returned object.
//  Return an empty set if there are no workers.
	public Set<Worker> getWorkers() {
        Set<Worker> workers = new HashSet<Worker>();
        if (this.workers != null){
            workers = this.workers;
        }
        return workers;
    }

//  Adds worker to the set of workers with this qualification.
//  It is not the responsibility of this method to ensure that the worker actually has the qualification. This will be ensured by the method that calls addWorker (e.g., addQualification in Worker).
//  Otherwise, the system will be in an inconsistent state.
	public void addWorker(Worker worker) {
		if (this.workers == null) {
			this.workers = new HashSet<>();
		}
		this.workers.add(worker);
	}

//  Removes the worker from the set of workers with this qualification.
//  It is not the responsibility of this method to ensure that the worker is actually in the set of workers for this qualification,
//  or is actually removed from the company or the projects.
//  All of this will be ensured by the method that calls removeWorker.
//  Otherwise, the system will be in an inconsistent state.
	public void removeWorker(Worker worker) {
		if (worker == null) {
			throw new NullPointerException("Cannot remove null worker");
		}
		this.workers.remove(worker);
	}

//  Returns a data-transfer-object representing the qualification.
//  The object contains the names of the workers. Do not use the toString() method.
	public QualificationDTO toDTO() {
        if(this.workers == null){
            return new QualificationDTO(this.description,new String[0]);
        }
        String workerNames[] = new String[this.workers.size()];
        int i = 0;

        for(Worker w: this.workers){
            workerNames[i] = w.getName();
            i++;
        }

		return new QualificationDTO(this.description,workerNames);
	}

}

