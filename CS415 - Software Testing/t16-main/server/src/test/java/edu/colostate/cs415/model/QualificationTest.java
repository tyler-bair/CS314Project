package edu.colostate.cs415.model;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import static org.junit.Assert.*;


public class QualificationTest {
    @Test
    public void test() {
        assert (true);
    }


//    pdj1183 - Test that normal description assigns class description correctly
//    @Test
//    public void pdj1183_qualificationConstructorTest_qualificationToStringTest_normDescription(){
//        String description = "Welding";
//        Qualification qualification = new Qualification(description);
//
//        assertEquals("Welding", qualification.toString());
//    }
    
// CONSTRUCTOR TESTS
//   pdj1183 - Constructor Base Test (A2, B1)
    @Test
    public void qualificationConstructorBaseTest(){
        String description = "Welding";
        Qualification qualification = new Qualification(description);
        assertEquals("Welding", qualification.toString());
    }
//   pdj1183 - Constructor T2 (A2, B2)
    @Test (expected = IllegalArgumentException.class)
    public void qualificationConstructorT2(){
        String description = "Welding";
        new Qualification(null);
    }
//   pdj1183/tylerbair - Constructor T3 (A1, B1)
    @Test(expected = IllegalArgumentException.class)
    public void qualificationConstructorT3(){
        String description = "";
        new Qualification(description);
    }

// EQUALS TESTS
//  pdj1183 - Equals Base Test (C1, D1, E1, F2)
    @Test
    public void qualificationEqualsBaseTest(){
        String description = "Welding";
        String description2 = "Painting";
        Qualification qualification1 = new Qualification(description);
        Qualification qualification2 = new Qualification(description2);
        assertFalse(qualification1.equals(qualification2));
    }

//  pdj1183 - Equals T2 (C2, D1, E1, F2)
    @Test
    public void qualificationEqualsT2(){
        String description = "Welding";
        Integer qualification = 5;
        Qualification qualification1 = new Qualification(description);
        assertFalse(qualification1.equals(qualification));
    } 

//  pdj1183 - Equals T3 (C1, D2, E1, F2)
    @Test(expected = IllegalArgumentException.class)
    public void qualificationEqualsT3(){
        String description = "Welding";
        String description2 = null;
        Qualification qualification1 = new Qualification(description);
        Qualification qualification2 = new Qualification(description2);
        assertFalse(qualification1.equals(qualification2));
    }

//  pdj1183 - Equals T4 (C1, D1, E2, F2)
    @Test(expected = IllegalArgumentException.class)
    public void qualificationEqualsT4(){
        String description = null;
        String description2 = "Welding";
        Qualification qualification1 = new Qualification(description);
        Qualification qualification2 = new Qualification(description2);
        assertFalse(qualification1.equals(qualification2));
    }

//  pdj1183 - Equals T5 (C1, D1, E1, F1)
    @Test
    public void qualificationEqualsT5(){
        String description = "Welding";
        String description2 = "Welding";
        Qualification qualification1 = new Qualification(description);
        Qualification qualification2 = new Qualification(description2);
        assertTrue(qualification1.equals(qualification2));
    }

// HASHCODE TESTS
// pdj1183 - Hashcode Base Test (G2, H1)
    @Test
    public void qualificationHashcodeBaseTest(){
        String description = "ABC";
        Qualification qualification = new Qualification(description);
        assertEquals(description.hashCode(), qualification.hashCode());
    }

// pdj1183 - Hashcode T2 (G1, H1)
//    TEST SUBSUMED BY Constructor T3
//    @Test(expected = IllegalArgumentException.class)
//    public void qualificationHashcodeT2(){
//        String description = "";
//        Qualification qualification = new Qualification(description);
//        assTrue(qualification.hashCode() == 0);
//    }

// pdj1183 - Hashcode T3 (G1, H2)
//   TEST SUBSUMED BY Constructor T2
//    @Test(expected = NullPointerException.class)
//    public void qualificationHashcodeT3(){
//        String description = null;
//        Qualification qualification = new Qualification(description);
//        assertTrue(qualification.hashCode() == 0);
//    }
  
//bbgabel - test an empty Qualification of workers to ensure null set
  @Test
  public void bbgabel_qualificationgetWorkersTest_emptyObject() {
      String description = "Welding";
      Qualification qualification = new Qualification(description);

      Set<Worker> workers = qualification.getWorkers();
      assertTrue(workers.size() == 0);
  }

  //bbgabel - testing two workers in a qualification, testing getWorkers and addWorker methods
  @Test
  public void bbgabel_qualificationgetWorkersTest_filledSet() {

      String main = "Smelling";

      Qualification qualification = new Qualification(main);
      String name1 = "Greg";
      String name2 = "Bob";
      double salary1 = 20.00;
      double salary2 = 30.00;
      String description1 = "Welding";
      String description2 = "Painting";

      Set<Qualification> qualifications = new HashSet<>();
      qualifications.add(new Qualification(description1));
      qualifications.add(new Qualification(description2));

      Worker worker1 = new Worker(name1, qualifications, salary1);
      Worker worker2 = new Worker(name2, qualifications, salary2);

      qualification.addWorker(worker1);
      qualification.addWorker(worker2);

      Set<Worker> workers = qualification.getWorkers();

      assertEquals(2, workers.size());
      assertTrue(workers.contains(worker1));
      assertTrue(workers.contains(worker2));
  }
  //chenaa - to string T1 (R2,S1)
  @Test
  public void toStringT1() {
    String description = "Welding";
    Qualification qualification = new Qualification(description);
    String actualDescription = qualification.toString();
    assertEquals("return description as string", description, actualDescription);
  }

  //chenaa//tylerbair - to string T2 (R1,S1)
  @Test(expected = IllegalArgumentException.class)
  public void toStringT2() {
    String description = "";
    new Qualification(description);
  }

  //chenaa - to string T3 (R2,S2)
  @Test(expected = IllegalArgumentException.class)
  public void toStringT3() {
    String description = null;
    Qualification qualification = new Qualification(description);
    assertTrue(qualification.toString() == "");
  }

  //chenaa - removeWorker T1 base case (N1,O1,P1)
  @Test
  public void removeWorkerT1() {
    String description1 = "ABC";
    Qualification qualification = new Qualification(description1);
    String name = "Greg";
    double salary = 20.00;
    String description2 = "Welding";

    Set<Qualification> qualifications = new HashSet<>();
    qualifications.add(new Qualification(description2));

    Worker worker = new Worker(name, qualifications, salary);
    qualification.addWorker(worker);
    assertTrue(qualification.getWorkers().contains(worker));
    qualification.removeWorker(worker);
    assertFalse(qualification.getWorkers().contains(worker));
  }

  //chenaa - removeWorker T2 null qualification (N2,O1,P1)
  @Test(expected = NullPointerException.class)
  public void removeWorkerT2() {
    Qualification qualification = null;
    String name = "Greg";
    double salary = 20.00;
    String description2 = "Welding";

    Set<Qualification> qualifications = new HashSet<>();
    qualifications.add(new Qualification(description2));

    Worker worker = new Worker(name, qualifications, salary);
    qualification.addWorker(worker);
    assertTrue(qualification.getWorkers().contains(worker));
    qualification.removeWorker(worker);
    assertFalse(qualification.getWorkers().contains(worker));
  }

  //chenaa - removeWorker T3 empty worker(N1,O2,P1)
  @Test(expected = NullPointerException.class)
  public void removeWorkerT3() {
    String description1 = "ABC";
    Qualification qualification = new Qualification(description1);
    String name = "Greg";
    double salary = 20.00;
    String description2 = "Welding";

    Set<Qualification> qualifications = new HashSet<>();
    qualifications.add(new Qualification(description2));

    Worker worker = new Worker(name, qualifications, salary);
    assertFalse(qualification.getWorkers().contains(worker));
    qualification.removeWorker(worker);
    assertFalse(qualification.getWorkers().contains(worker));
  }

  //chenaa - removeWorker T4 (N1,O1,P2)
  @Test(expected = NullPointerException.class)
  public void removeWorkerT4() {
    String description1 = "ABC";
    Qualification qualification = new Qualification(description1);
    String name = "Greg";
    double salary = 20.00;
    String description2 = "Welding";

    Set<Qualification> qualifications = new HashSet<>();
    qualifications.add(new Qualification(description2));

    Worker worker = new Worker(name, qualifications, salary);
    qualification.addWorker(worker);
    assertTrue(qualification.getWorkers().contains(worker));
    qualification.removeWorker(null);
    assertTrue(qualification.getWorkers().contains(worker));
  }

// TODTO TESTS

//  kypeus - toDTO T1 (Q1)
@Test
public void qualificationtoDTOT1(){
    String description = "Welding";
    Qualification qualification1 = new Qualification(description);
    Set<Qualification> qualification = new HashSet<Qualification>();
    qualification.add(new Qualification("Fork Lift"));
    Worker worker = new Worker("Levi", qualification, 4.3);
    Worker worker2 = new Worker("Zeke", qualification, 4.3);
    Worker worker3 = new Worker("Erin", qualification, 4.3);

    qualification1.addWorker(worker);
    qualification1.addWorker(worker2);
    qualification1.addWorker(worker3);
    assertTrue(qualification1.toDTO().getDescription() == "Welding");
    assertTrue(qualification1.toDTO().getWorkers()[1] == worker.getName());
    assertTrue(qualification1.toDTO().getWorkers()[2] == worker2.getName());
    assertTrue(qualification1.toDTO().getWorkers()[0] == worker3.getName());
    }

//  kypeus - toDTO T2 (Q2)
@Test
public void qualificationtoDTOT2(){
    String description = "Welding";
    Qualification qualification1 = new Qualification(description);
    assertTrue(qualification1.toDTO().getDescription() == "Welding");
    assertTrue(qualification1.toDTO().getWorkers().length == 0);
    }


    //PIT IMPROVEMENTS
    //pdj1183 equals
    @Test
    public void qualificationsPIT1(){
        String description = "Welding";
        Qualification qualification = new Qualification(description);
        assertFalse(qualification.equals(null));
    }


    // pdj1183 toString
    @Test(expected = IllegalArgumentException.class)
    public void qualificationsPIT2(){
        Qualification qualification = new Qualification(null);
        assertTrue(qualification.toString().equals("null"));
    }


    //pdj1183 getWorkers
    @Test
    public void qualificationsPIT3(){
        String description = "Welding";
        Qualification qualification = new Qualification(description);
        assertTrue(qualification.getWorkers().equals(new HashSet<Worker>()));
    }

    // pdj1183 equals
    @Test
    public void qualificationsPIT4() {
        String description = "Welding";
        Qualification qualification = new Qualification(description);
        assertTrue(qualification.equals(qualification));
    }
}

