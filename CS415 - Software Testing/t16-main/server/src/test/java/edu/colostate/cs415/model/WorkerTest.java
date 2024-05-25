package edu.colostate.cs415.model;

import java.util.Set;
import java.util.HashSet;

import org.junit.Test;
import static org.junit.Assert.*;

public class WorkerTest {
	@Test
	public void test() {
		assert (true);
	}

    //            CONSTRUCTOR TESTS

    //    Kypeus - Test that normal operation (1 qualification) works for Worker constructor (A1,B1,C1,D1)
@Test()
public void Kypeus_WorkerConstructorTest_normalOperation(){
    String name = "John";
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Fork Lift"));
    Worker worker = new Worker(name, qualification, 4.3);
    assertEquals("John:0:1:4", worker.toString());
}

//    Kypeus - Test that empty name string will have empty name (A2,B1,C1,D1)

@Test(expected = IllegalArgumentException.class)
    public void Kypeus_WorkerConstructorTest_emptyName(){
        String name = "";
        Set<Qualification> qualification = new HashSet<Qualification>();
        qualification.add(new Qualification("Fork Lift"));
        Worker w = new Worker(name, qualification, 4.3);
        assertTrue(w.getName() == "");
    }

    //    Kypeus - Test that null qualifications will cause exception (A1,B2,C1,D1)
@Test(expected = IllegalArgumentException.class)
public void Kypeus_WorkerConstructorTest_nullQualifications(){
    String name = "John";
    Set<Qualification> qualification = null;
    Worker w = new Worker(name, qualification, 4.3);
}

    //    Kypeus - Test that more than one qualification works (A1,B1,C2,D1)
@Test()
public void Kypeus_WorkerConstructorTest_multipleQualifications(){
    String name = "John";
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Fork Lift"));
    qualification.add(new Qualification("Front End Loader"));
    Worker worker = new Worker(name, qualification, 4.3);
    assertEquals("John:0:2:4", worker.toString());
}

//    Kypeus - Test that still works if Worker has zero qualifications (A1,B1,C3,D1)
@Test()
    public void Kypeus_WorkerConstructorTest_zeroQualifications(){
        String name = "John";
        Set<Qualification> qualification = new HashSet<Qualification>();
        Worker worker = new Worker(name, qualification, 4.3);
        assertEquals("John:0:0:4", worker.toString());
    }

    //    Kypeus - Test that zero salary will create a worker (A1,B1,C1,D2)
@Test()
public void Kypeus_WorkerConstructorTest_zeroSalary(){
    String name = "John";
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Fork Lift"));
    new Worker(name, qualification, 0);
}

//    Kypeus - Test that negative salary will set return exception (A1,B1,C1,D3)
@Test(expected = IllegalArgumentException.class)
    public void Kypeus_WorkerConstructorTest_negativeSalary(){
        String name = "John";
        Set<Qualification> qualification = new HashSet<Qualification>();
        qualification.add(new Qualification("Fork Lift"));
        Worker w = new Worker(name, qualification, -4.3);
    }

    //            TOSTRING TESTS
    
//    Kypeus - Test toString not null(K1)
@Test()
public void Kypeus_WorkertoStringTest_normalOperation(){
    String name = "John";
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Fork Lift"));
    Worker worker = new Worker(name, qualification, 4.3);
    assertEquals("John:0:1:4", worker.toString());
}

//    Kypeus - Test that negative salary will cause an exception in instantiating Worker object (A1,B1,C1,D3)
@Test(expected = NullPointerException.class)
    public void Kypeus_WorkertoStringTest_nullWorker(){
        Worker nullWorker = null;
        nullWorker.toString();
    }

    //            GETTER TESTS

//    Kypeus - getName works
@Test()
public void Kypeus_WorkergetNameTest_normal(){
    String name = "Anthony";
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Driver"));;
    Worker worker = new Worker(name, qualification, 6.8);
    assertEquals(name, worker.getName());
    }

//    Kypeus - getSalary works
@Test()
public void Kypeus_WorkergetSalaryTest_normal(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Driver"));;
    Worker worker = new Worker("Anthony", qualification, 6.8);
    assertEquals(6.8, worker.getSalary(),.1);
    }

//    Kypeus - getQualifications works
@Test()
public void Kypeus_WorkergetQualificationsTest_normal(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Driver"));;
    Worker worker = new Worker("Anthony", qualification, 6.8);
    assertEquals(qualification, worker.getQualifications());
    }

//    Kypeus - getProjects works
@Test()
public void Kypeus_WorkergetProjectsTest_normal(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Driver"));;
    Worker worker = new Worker("Anthony", qualification, 6.8);
    assertEquals(new HashSet<Project>(), worker.getProjects());
    }

    //            EQUALS TESTS

//    Kypeus - worker Equals works normally (E1,F1,G1,H1)
@Test()
public void Kypeus_WorkerequalsTest_normal(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Runner"));;
    Worker worker = new Worker("Anthony", qualification, 6.8);
    Worker worker2 = worker;
    assertTrue(worker.equals(worker2));
    }

//    Kypeus - worker equals when type of object is not worker (E2,F1,G1,H1)
@Test()
public void Kypeus_WorkerequalsTest_typeNotWorker(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Runner"));;
    Worker worker = new Worker("Anthony", qualification, 6.8);
    Object o = worker;
    assertTrue(worker.equals(o));
    }

//    Kypeus - worker Equals object is null (E1,F2,G1,H1)
@Test(expected = NullPointerException.class)
public void Kypeus_WorkerequalsTest_Objectisnull(){
    Worker worker = null;
    worker.equals(null);
    }

//    Kypeus - worker Equals curr is null (E1,F,G2,H1)
@Test(expected = NullPointerException.class)
public void Kypeus_WorkerequalsTest_Currisnull(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Runner"));;
    
    Worker worker = null;
    Worker worker2 = new Worker("Anthony", qualification, 6.8);
    worker.equals(worker2);
    }

//    Kypeus - worker equals no match (E1,F1,G1,H2)
@Test()
public void Kypeus_WorkerequalsTest_noMatch(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Runner"));;
    Worker worker = new Worker("Anthony", qualification, 6.8);
    Worker worker2 = new Worker("Bernard", qualification,6.8);
    assertFalse(worker.equals(worker2));
    }

    //            ADDQUALIFICATION TESTS

//    Kypeus - worker addQualification works normally (N1,O1,P1)
@Test()
public void Kypeus_WorkeraddQualificationTest_Normal(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Teacher"));;
    Worker worker = new Worker("Michelle", qualification, 6.8);
    Qualification q = new Qualification("Swim Coach");
    worker.addQualification(q);
    assertTrue(worker.getQualifications().contains(q));
    }

//    Kypeus - worker addQualification doesn't add duplicate (N2,O1,P1)
@Test()
public void Kypeus_WorkeraddQualificationTest_Duplicate(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Teacher"));;
    Worker worker = new Worker("Michelle", qualification, 6.8);
    Qualification q = new Qualification("Teacher");
    worker.addQualification(q);
    assertTrue(worker.getQualifications().size() == 1);
    }

//    Kypeus - worker addQualification doesn't add null q (N1,O2,P1)
@Test()
public void Kypeus_WorkeraddQualificationTest_Nullq(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Teacher"));;
    Worker worker = new Worker("Michelle", qualification, 6.8);
    worker.addQualification(null);
    assertTrue(worker.getQualifications().size() == 1);
    }

//    Kypeus - worker addQualification works with empty qualifications set (N1,O1,P2)
@Test()
public void Kypeus_WorkeraddQualificationTest_emptyQualifications(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    Worker worker = new Worker("Michelle", qualification, 6.8);
    Qualification q = new Qualification("Teacher");
    worker.addQualification(q);
    assertTrue(worker.getQualifications().contains(q));
    }

    //            HASHCODE TESTS

//    Kypeus - worker hashCode works normally (I1,J1)
@Test()
public void Kypeus_WorkerhashCode_normally(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    Worker worker = new Worker("Amanda", qualification, 6.8);
    assertEquals(worker.hashCode(),"Amanda".hashCode());
    }

//    Kypeus - worker hashCode works name is null (I2,J1)
@Test(expected = IllegalArgumentException.class)
public void Kypeus_WorkerhashCode_nameNull(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    String name = null;
    Worker worker = new Worker(name, qualification, 6.8);
    assertEquals(worker.hashCode(),name.hashCode());
    }

//    Kypeus - worker hashCode works for empty name (I1,J2)
@Test(expected = IllegalArgumentException.class)
public void Kypeus_WorkerhashCode_emptynameString(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    Worker worker = new Worker("", qualification, 6.8);
    assertEquals(worker.hashCode(),"".hashCode());
    }

    //            ADDProject TESTS

//    Kypeus - worker ADDProject works normally (Q1,R1,S1)
@Test()
public void Kypeus_WorkeraddProject_normally(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Teacher"));
    Worker worker = new Worker("Amanda", qualification, 6.8);
    Project p = new Project("Project",qualification,ProjectSize.SMALL);
    worker.addProject(p);
    assertTrue(worker.getProjects().contains(p));
    }

//    Kypeus - worker ADDProject null project (Q2,R1,S1)
@Test(expected = IllegalArgumentException.class)
public void Kypeus_WorkeraddProject_nullProject(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    Worker worker = new Worker("Amanda", qualification, 6.8);
    Project p = null;
    worker.addProject(p);
    assertTrue(worker.getProjects().contains(p));
    }

//    Kypeus - worker ADDProject works on Medium project (Q1,R2,S1)
@Test()
public void Kypeus_WorkeraddProject_mediumProject(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Teacher"));
    Worker worker = new Worker("Amanda", qualification, 6.8);
    Project p = new Project("Project",qualification,ProjectSize.MEDIUM);
    worker.addProject(p);
    assertTrue(worker.getProjects().contains(p));
    }

//    Kypeus - worker ADDProject works on Big project (Q1,R3,S1)
@Test()
public void Kypeus_WorkeraddProject_bigProject(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Teacher"));
    Worker worker = new Worker("Amanda", qualification, 6.8);
    Project p = new Project("Project",qualification,ProjectSize.BIG);
    worker.addProject(p);
    assertTrue(worker.getProjects().contains(p));
    }

//    Kypeus - worker ADDProject null worker (Q1,R1,S2)
@Test(expected = NullPointerException.class)
public void Kypeus_WorkeraddProject_nullworker(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Teacher"));
    Worker worker = null;
    Project p = new Project("Project",qualification,ProjectSize.SMALL);
    worker.addProject(p);
    }

    //            GETWORKLOAD TESTS

//    Kypeus - worker getWorkload works size == 1 (W1,X1)
@Test()
public void Kypeus_WorkergetWorkoad_size1(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Teacher"));
    Worker worker = new Worker("Amanda", qualification, 6.8);
    Project p = new Project("Project",qualification,ProjectSize.SMALL);
    worker.addProject(p);
    assertTrue(worker.getWorkload() == 1);
    }

//    Kypeus - worker getWorkload works size == 0 (W2,X1)
@Test()
public void Kypeus_WorkergetWorkoad_size0(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    Worker worker = new Worker("Amanda", qualification, 6.8);
    assertTrue(worker.getWorkload() == 0);
    }

//    Kypeus - worker getWorkload works size > 1 (W3,X1)
@Test()
public void Kypeus_WorkergetWorkoad_sizeOver1(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Teacher"));
    Worker worker = new Worker("Amanda", qualification, 6.8);
    Project p = new Project("Project",qualification,ProjectSize.SMALL);
    Project p2 = new Project("Project2",qualification,ProjectSize.SMALL);
    Project p3 = new Project("Project3",qualification,ProjectSize.SMALL);
    worker.addProject(p);
    worker.addProject(p2);
    worker.addProject(p3);
    assertTrue(worker.getWorkload() == 3);
    }

//    Kypeus - worker getWorkload contains MEDIUM (W1,X2)
@Test()
public void Kypeus_WorkergetWorkoad_medium(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Teacher"));
    Worker worker = new Worker("Amanda", qualification, 6.8);
    Project p = new Project("Project",qualification,ProjectSize.MEDIUM);
    worker.addProject(p);
    assertTrue(worker.getWorkload() == 2);
    }

//    Kypeus - worker getWorkload contains BIG (W1,X3)
@Test()
public void Kypeus_WorkergetWorkoad_big(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Teacher"));
    Worker worker = new Worker("Amanda", qualification, 6.8);
    Project p = new Project("Project",qualification,ProjectSize.BIG);
    worker.addProject(p);
    assertTrue(worker.getWorkload() == 3);
    }

    //            REMOVEPROJECT TESTS

//    Kypeus - worker removeProject works small projects (T1,U1,V1)
@Test()
public void Kypeus_WorkerremoveProject_smallProjects(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Teacher"));
    Worker worker = new Worker("Carrie", qualification, 6.8);
    Project p = new Project("Project",qualification,ProjectSize.SMALL);
    Project p2 = new Project("Project2",qualification,ProjectSize.SMALL);
    Project p3 = new Project("Project3",qualification,ProjectSize.SMALL);
    worker.addProject(p);
    worker.addProject(p2);
    worker.addProject(p3);
    assertTrue(worker.getProjects().contains(p));
    worker.removeProject(p);
    assertFalse(worker.getProjects().contains(p));
    }

//    Kypeus - worker removeProject null project (T2,U1,V1)
@Test(expected = NullPointerException.class)
public void Kypeus_WorkerremoveProject_nullProject(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    Worker worker = new Worker("Amanda", qualification, 6.8);
    Project p = null;
    worker.removeProject(p);
    }
//    Kypeus - worker removeProject medium Project (T1,U2,V1)
@Test()
public void Kypeus_WorkerremoveProject_mediumProject(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Teacher"));
    Worker worker = new Worker("Carrie", qualification, 6.8);
    Project p = new Project("Project",qualification,ProjectSize.MEDIUM);
    Project p2 = new Project("Project2",qualification,ProjectSize.MEDIUM);
    Project p3 = new Project("Project3",qualification,ProjectSize.MEDIUM);
    worker.addProject(p);
    worker.addProject(p2);
    worker.addProject(p3);
    assertTrue(worker.getProjects().contains(p));
    worker.removeProject(p);
    assertFalse(worker.getProjects().contains(p));
    }

//    Kypeus - worker removeProject big Project (T1,U3,V1)
@Test()
public void Kypeus_WorkerremoveProject_bigProject(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Teacher"));
    Worker worker = new Worker("Carrie", qualification, 6.8);
    Project p = new Project("Project",qualification,ProjectSize.BIG);
    Project p2 = new Project("Project2",qualification,ProjectSize.BIG);
    Project p3 = new Project("Project3",qualification,ProjectSize.BIG);
    worker.addProject(p);
    worker.addProject(p2);
    worker.addProject(p3);
    assertTrue(worker.getProjects().contains(p));
    worker.removeProject(p);
    assertFalse(worker.getProjects().contains(p));
    }

//    Kypeus - worker removeProject works one project (T1,U1,V2)
@Test()
public void Kypeus_WorkerremoveProject_oneProject(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Teacher"));
    Worker worker = new Worker("Carrie", qualification, 6.8);
    Project p = new Project("Project",qualification,ProjectSize.SMALL);
    worker.addProject(p);
    assertTrue(worker.getProjects().contains(p));
    worker.removeProject(p);
    assertFalse(worker.getProjects().contains(p));
    }

//    Kypeus - worker removeProject works zero project (T1,U1,V3)
@Test(expected = IllegalArgumentException.class)
public void Kypeus_WorkerremoveProject_ZeroProjects(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    Worker worker = new Worker("Carrie", qualification, 6.8);
    Project p = new Project("Project",qualification,ProjectSize.SMALL);
    worker.removeProject(p);
    }

    //            ISAVAILABLE TESTS

//    Kypeus - worker isAvailable returns true when less than 12 workload (AD1)
@Test()
public void Kypeus_WorkerisAvailable_workloadIs3(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Teacher"));
    Worker worker = new Worker("Carrie", qualification, 6.8);
    Project p = new Project("Project",qualification,ProjectSize.BIG);
    worker.addProject(p);
    assertTrue(worker.getProjects().contains(p));
    assertTrue(worker.isAvailable());
    }

//    Kypeus - worker isAvailable returns false when greater than 12 workload (AD2)
@Test()
public void Kypeus_WorkerisAvailable_workloadIs12(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Teacher"));
    Worker worker = new Worker("Carrie", qualification, 6.8);
    Project p = new Project("Project",qualification,ProjectSize.BIG);
    Project p2 = new Project("Project2",qualification,ProjectSize.BIG);
    Project p3 = new Project("Project3",qualification,ProjectSize.BIG);
    Project p4 = new Project("Project4",qualification,ProjectSize.BIG);
    worker.addProject(p);
    worker.addProject(p2);
    worker.addProject(p3);
    worker.addProject(p4);
    assertTrue(worker.getProjects().contains(p) && worker.getProjects().contains(p2) &&
               worker.getProjects().contains(p3) && worker.getProjects().contains(p4));
    assertFalse(worker.isAvailable());
    }

        //            SETSALARY TESTS
  
    //  bbgabel - setting salary correctly alters value (L1,M1)
    @Test
    public void bbgabel_WorkersetSalary_positiveSalary(){
        String name = "John";
        double expectedSalary = 100.5;
        Set<Qualification> qualification = new HashSet<Qualification>();
        qualification.add(new Qualification("Fork Lift"));
        Worker worker = new Worker(name, qualification, 1);
        worker.setSalary(100.5);
        assertEquals(expectedSalary, worker.getSalary(), 0.001);
    }

    //  bbgabel - setting salary with negative value throws exception (L1,M2)
    @Test(expected = IllegalArgumentException.class)
    public void bbgabel_WorkersetSalary_negativeSalary(){
        String name = "John";
        Set<Qualification> qualification = new HashSet<Qualification>();
        qualification.add(new Qualification("Fork Lift"));
        Worker worker = new Worker(name, qualification, 100.5);
        worker.setSalary(-100.5);
    }
    
    //            WILLOVERLOAD TESTS

//    Kypeus - worker willOverload returns false when less than 12 workload (Z1,AA1,AB1,AC1)
@Test()
public void Kypeus_WorkerwillOverload_Small(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Teacher"));
    Worker worker = new Worker("Marie", qualification, 6.8);
    Project p = new Project("Project",qualification,ProjectSize.BIG);
    worker.addProject(p);
    assertTrue(worker.getProjects().contains(p));
    Project p2 = new Project("Project2",qualification,ProjectSize.SMALL);
    assertFalse(worker.willOverload(p2));
    }

//    Kypeus - worker willOverload returns false when less than 12 workload (Z2,AA1,AB1,AC1)
@Test()
public void Kypeus_WorkerwillOverload_Medium(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Teacher"));
    Worker worker = new Worker("Marie", qualification, 6.8);
    Project p = new Project("Project",qualification,ProjectSize.BIG);
    worker.addProject(p);
    assertTrue(worker.getProjects().contains(p));
    Project p2 = new Project("Project2",qualification,ProjectSize.MEDIUM);
    assertFalse(worker.willOverload(p2));
    }

//    Kypeus - worker willOverload returns false when less than 12 workload (Z3,AA1,AB1,AC1)
@Test()
public void Kypeus_WorkerwillOverload_Big(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Teacher"));
    Worker worker = new Worker("Marie", qualification, 6.8);
    Project p = new Project("Project",qualification,ProjectSize.BIG);
    worker.addProject(p);
    assertTrue(worker.getProjects().contains(p));
    Project p2 = new Project("Project2",qualification,ProjectSize.BIG);
    assertFalse(worker.willOverload(p2));
    }

//    Kypeus - worker willOverload throws exception when project == null (Z1,AA2,AB1,AC1)
@Test(expected = NullPointerException.class)
public void Kypeus_WorkerwillOverload_projectIsNull(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Teacher"));
    Worker worker = new Worker("Marie", qualification, 6.8);
    Project p = new Project("Project",qualification,ProjectSize.BIG);
    worker.addProject(p);
    assertTrue(worker.getProjects().contains(p));
    Project p2 = null;
    worker.willOverload(p2);
    }
    
//    Kypeus - worker willOverload throws exception when project is already in projects (Z1,AA1,AB2,AC1)
@Test(expected = IllegalArgumentException.class)
public void Kypeus_WorkerwillOverload_AlreadyExists(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    Worker worker = new Worker("Marie", qualification, 6.8);
    Project p = new Project("Project",qualification,ProjectSize.BIG);
    worker.addProject(p);
    assertTrue(worker.getProjects().contains(p));
    Project p2 = new Project("Project",qualification,ProjectSize.BIG);
    worker.willOverload(p2);
    }

//    Kypeus - worker willOverload returns true when greater than 12 workload (Z1,AA1,AB1,AC2)
@Test()
public void Kypeus_WorkerwillOverload_Overloaded(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Teacher"));
    Worker worker = new Worker("Marie", qualification, 6.8);
    Project p = new Project("Project",qualification,ProjectSize.BIG);
    Project p2 = new Project("Project2",qualification,ProjectSize.BIG);
    Project p3 = new Project("Project3",qualification,ProjectSize.BIG);
    Project p4 = new Project("Project4",qualification,ProjectSize.BIG);
    worker.addProject(p);
    worker.addProject(p2);
    worker.addProject(p3);
    worker.addProject(p4);
    assertTrue(worker.getProjects().contains(p) && worker.getProjects().contains(p2) &&
               worker.getProjects().contains(p3) && worker.getProjects().contains(p4));
    Project p5 = new Project("Project5",qualification,ProjectSize.SMALL);
    assertTrue(worker.getWorkload() == 12);
    assertTrue(worker.willOverload(p5));
    }

    //            TODTO TESTS

//    Kypeus - worker toDTO creates object with non-empty projects/qualifications (AE1,AF1)
@Test()
public void Kypeus_WorkertoDTO_NoneEmpty(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Fork Lift"));
    qualification.add(new Qualification("Cook"));

    Worker worker = new Worker("Marie", qualification, 6.8);
    assertTrue(worker.getQualifications().equals(qualification));

    Project p = new Project("Project",qualification,ProjectSize.BIG);
    Project p2 = new Project("Project2",qualification,ProjectSize.BIG);

    worker.addProject(p);
    worker.addProject(p2);
    assertTrue(worker.getProjects().contains(p) && worker.getProjects().contains(p2));

    assertTrue(worker.toDTO().getName() == worker.getName());
    assertTrue(worker.toDTO().getSalary() == worker.getSalary());
    assertTrue(worker.toDTO().getWorkload() == worker.getWorkload());
    assertTrue(worker.toDTO().getProjects()[0] == p.getName());
    assertTrue(worker.toDTO().getProjects()[1] == p2.getName());
    assertTrue(worker.toDTO().getQualifications()[0] == "Fork Lift");
    assertTrue(worker.toDTO().getQualifications()[1] == "Cook");
    }

//    Kypeus - worker toDTO creates object with empty projects (AE2,AF1)
@Test()
public void Kypeus_WorkertoDTO_emptyProjects(){
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Fork Lift"));
    qualification.add(new Qualification("Cook"));

    Worker worker = new Worker("Marie", qualification, 6.8);
    assertTrue(worker.getQualifications().equals(qualification));

    assertTrue(worker.getProjects().isEmpty());

    assertTrue(worker.toDTO().getName() == worker.getName());
    assertTrue(worker.toDTO().getSalary() == worker.getSalary());
    assertTrue(worker.toDTO().getWorkload() == worker.getWorkload());
    assertTrue(worker.toDTO().getProjects().length == 0);
    assertTrue(worker.toDTO().getQualifications()[0] == "Fork Lift");
    assertTrue(worker.toDTO().getQualifications()[1] == "Cook");
    }

//    Kypeus - worker toDTO creates object with empty qualifications (AE1,AF1)
@Test()
public void Kypeus_WorkertoDTO_EmptyQualifications(){
    Set<Qualification> qualification = new HashSet<Qualification>();

    Worker worker = new Worker("Marie", qualification, 6.8);
    assertTrue(worker.getQualifications().equals(qualification));

    Set<Qualification> qualification2 = new HashSet<Qualification>();
    qualification2.add(new Qualification("Teacher"));
    Project p = new Project("Project",qualification2,ProjectSize.BIG);
    Project p2 = new Project("Project2",qualification2,ProjectSize.BIG);

    worker.addProject(p);
    worker.addProject(p2);
    assertTrue(worker.getProjects().contains(p) && worker.getProjects().contains(p2));

    assertTrue(worker.toDTO().getName() == worker.getName());
    assertTrue(worker.toDTO().getSalary() == worker.getSalary());
    assertTrue(worker.toDTO().getWorkload() == worker.getWorkload());
    assertTrue(worker.toDTO().getProjects()[0] == p.getName());
    assertTrue(worker.toDTO().getProjects()[1] == p2.getName());
    assertTrue(worker.toDTO().getQualifications().length == 0);
    }

    // PIT IMPROVEMENTS
    // pdj1183 equals
    @Test
    public void workerPIT1() {
        String name = "John";
        Set<Qualification> qualification = new HashSet<Qualification>();
        qualification.add(new Qualification("Fork Lift"));
        Worker worker = new Worker(name, qualification, 4.3);
        assertFalse(worker.equals(null));
    }


    // pdj1183 equals
    @Test
    public void workerPIT2() {
        String name = "John";
        Set<Qualification> qualification = new HashSet<Qualification>();
        qualification.add(new Qualification("Fork Lift"));
        Worker worker = new Worker(name, qualification, 4.3);
        assertFalse(worker.equals(qualification));
    }

    // pdj1183 setSalary
    @Test
    public void workerPIT3() {
        String name = "John";
        Set<Qualification> qualification = new HashSet<Qualification>();
        qualification.add(new Qualification("Fork Lift"));
        Worker worker = new Worker(name, qualification, 100.5);
        worker.setSalary(0);
        assert(worker.getSalary() == 0);
    }

    // pdj1183 willOverload
    @Test
    public void workerPIT4(){
        Set<Qualification> qualification = new HashSet<Qualification>();
        qualification.add(new Qualification("Teacher"));
        Worker worker = new Worker("Marie", qualification, 6.8);
        Project p = new Project("Project",qualification,ProjectSize.BIG);
        Project p2 = new Project("Project2",qualification,ProjectSize.BIG);
        Project p3 = new Project("Project3",qualification,ProjectSize.BIG);
        Project p4 = new Project("Project4",qualification,ProjectSize.BIG);
        worker.addProject(p);
        worker.addProject(p2);
        worker.addProject(p3);
        worker.addProject(p4);
        assertTrue(worker.getProjects().contains(p) && worker.getProjects().contains(p2) &&
                   worker.getProjects().contains(p3) && worker.getProjects().contains(p4));
        Project p5 = new Project("Project5",qualification,ProjectSize.SMALL);
        Project p6 = new Project("Project6", qualification, ProjectSize.MEDIUM);
        Project p7 = new Project("Project7", qualification, ProjectSize.BIG);
        assertTrue(worker.getWorkload() == 12);
        assertTrue(worker.willOverload(p5));
        assertTrue(worker.willOverload(p6));
        assertTrue(worker.willOverload(p7));

    }
}
