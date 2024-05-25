package edu.colostate.cs415.model;

import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;

import org.junit.Test;

import edu.colostate.cs415.dto.ProjectDTO;

public class ProjectTest {
    @Test
    public void test() {
        assert (true);
    }

    // CONSTRUCTOR TESTS
    // pdj1183 - Project Constructor Base Test (A2, B2, C1, D1, E2)
    @Test
    public void projectConstructorBaseTest() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";

	    Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));
        assert (qualifications.size() == 2);
        

        Project project = new Project(name, qualifications, ProjectSize.SMALL);
        assert (project.getName().equals(name));
        assert (project.getRequiredQualifications().equals(qualifications));
        assert (project.getSize() == ProjectSize.SMALL);
    }

    // pdj1183 - Project Constructor T2 (A1, B2, C1, D1, E2)
    @Test(expected = IllegalArgumentException.class)
    public void projectConstructorT2() {
        String name = "";
        String description1 = "Welding";
        String description2 = "Painting";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));
        assert (qualifications.size() == 2);

        Project project = new Project(name, qualifications, ProjectSize.SMALL);
    }

    // pdj1183 - Project Constructor T3 (A2, B1, C1, D1, E2)
    @Test(expected = IllegalArgumentException.class) 
    public void projectConstructorT3() {
        String name = "ABC";

        Set<Qualification> qualifications = new HashSet<Qualification>();

        Project project = new Project(name, qualifications, ProjectSize.SMALL);
        assert (project.getRequiredQualifications() == qualifications);
    }

    //pdj1183 - Project Constructor T4 (A2, B2, C2, D1, E2)
    @Test(expected = IllegalArgumentException.class)
    public void projectConstructorT4() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = null;

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));
        assert (qualifications.size() == 2);

        Project project = new Project(name, qualifications, ProjectSize.SMALL);
        assertTrue(project.getRequiredQualifications().size() == 2);
    }

    // pdj1183 - Project Constructor T5 (A2, B2, C1, D2, E2)
    @Test(expected = IllegalArgumentException.class)
    public void projectConstructorT5() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";

	    Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));
        assert (qualifications.size() == 2);

        ProjectSize size = ProjectSize.valueOf("GARGANTUAN");

        Project project = new Project(name, qualifications, size);
    }

    //pdj1183 - Project Constructor T6 (A2, B2, C1, D1, E1)
    @Test(expected = IllegalArgumentException.class)
    public void projectConstructorT6() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));
        assert (qualifications.size() == 2);

        Project project = new Project(name, qualifications, null);
    }

    // TOSTRING TESTS
    // pdj1183 - Project toString Base Test (L1)
    @Test 
    public void projectToStringBaseTest() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));
        assert (qualifications.size() == 2);

        Project project = new Project(name, qualifications, ProjectSize.SMALL);
        assert(project.toString().equals("ABC:0:PLANNED"));
    }
    
    // pdj1183 - Project toString T2 (L2)
    @Test(expected = NullPointerException.class)
    public void projectToStringT2() {
        Project project = null;
        project.toString();
    }

    // EQUALS TESTS
    // pdj1183 - Project equals Base Test (F1, G1, H1, L1)
    @Test
    public void projectEqualsBaseTest() {
        String name = "ABC";
        String description1 = "ABC";
        String description2 = "Painting";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));
        assert (qualifications.size() == 2);

        Project project1 = new Project(name, qualifications, ProjectSize.SMALL);
        Project project2 = new Project(name, qualifications, ProjectSize.SMALL);
        assertTrue(project1.equals(project2));
    }

    // pdj1183 - Project equals T2 (F2, G1, H1, L1)
    @Test
    public void projectEqualsT2() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        Qualification qualification = new Qualification(description1);
        qualifications.add(qualification);
        qualifications.add(new Qualification(description2));
        assert (qualifications.size() == 2);
        
        Project project = new Project(name, qualifications, ProjectSize.SMALL);
        assertFalse(project.equals(qualification));
    }

    // pdj1183 - Project equals T3 (F1, G2, H1, L1)
    @Test()
    public void projectEqualsT3() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));
        assert (qualifications.size() == 2);

        Project project = new Project(name, qualifications, ProjectSize.SMALL);
        assertFalse(project.equals(null));
    }

    // pdj1183 - Project equals T4 (F1, G1, H2, L1)
    @Test(expected = NullPointerException.class)
    public void projectEqualsT4() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));
        assert (qualifications.size() == 2);

        Project project1 = null;
        Project project2 = new Project(name, qualifications, ProjectSize.SMALL);

        project1.equals(project2);
    }

    // pdj1183 - Project equals T5 (F1, G1, H1, L2)
    @Test
    public void projectEqualsT5() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));
        assert (qualifications.size() == 2);

        Project project1 = new Project(name, qualifications, ProjectSize.SMALL);
        Project project2 = new Project("DEF", qualifications, ProjectSize.SMALL);
        assertFalse(project1.equals(project2));
    }

    // HASHCODE TESTS
    // pdj1183 - Project hashCode Base Test (J1, K2)
    @Test
    public void projectHashCodeBaseTest() { 
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));
        assert (qualifications.size() == 2);

        Project project = new Project(name, qualifications, ProjectSize.SMALL);

        assertTrue(project.hashCode() == name.hashCode());
    }

    // pdj1183 - Project hashCode T2 (J2, K2)
    @Test(expected = NullPointerException.class)
    public void projectHashCodeT2() {
        Project project = null;
        project.hashCode();
    }

    // pdj1183 - Project hashCode T3 (J1, K1)
    @Test(expected = IllegalArgumentException.class)
    public void projectHashCodeT3() {
        String name = "";
        String description1 = "Welding";
        String description2 = "Painting";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));
        assert (qualifications.size() == 2);

        Project project = new Project(name, qualifications, ProjectSize.SMALL);
    }

    // SETSTATUS TESTS
    // pdj1183 - Project setStatus Base Test (M1, N1)
    @Test
    public void projectSetStatusBaseTest() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));
        assert (qualifications.size() == 2);

        Project project = new Project(name, qualifications, ProjectSize.SMALL);
        project.setStatus(ProjectStatus.ACTIVE);
        assert (project.getStatus() == ProjectStatus.ACTIVE);
    }

    // pdj1183 - Project setStatus T2 (M2, N1)
    @Test(expected = NullPointerException.class)
    public void projectSetStatusT2() {
        Project project = null;
        project.setStatus(ProjectStatus.ACTIVE);
    }

    // pdj1183 - Project setStatus T3 (M1, N2)
    @Test(expected = IllegalArgumentException.class)
    public void projectSetStatusT3() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));
        assert (qualifications.size() == 2);

        ProjectStatus status = ProjectStatus.valueOf("Illegal");


        Project project = new Project(name, qualifications, ProjectSize.SMALL);
        project.setStatus(status);
    }

    // ADDWORKER TESTS
    // pdj1183 - Project addWorker Base Test (O1, T1)
    @Test
    public void projectAddWorkerBaseTest() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";
        String workerName = "BCD";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));
        assert (qualifications.size() == 2);

        Project project = new Project(name, qualifications, ProjectSize.SMALL);
        Worker worker = new Worker(workerName, qualifications, 5.0);
        project.addWorker(worker);
        assert (project.getWorkers().contains(worker));
    }

    // pdj1183 - Project addWorker T2 (O2, T1)
    @Test(expected = NullPointerException.class)
    public void projectAddWorkerT2() {
        String description1 = "Welding";
        String description2 = "Painting";
        String workerName = "BCD";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));
        assert (qualifications.size() == 2);

        Project project = null;
        Worker worker = new Worker(workerName, qualifications, 5.0);
        project.addWorker(worker);

    }

    // pdj1183 - Project addWorker T3 (O1, T2)
    @Test(expected = NullPointerException.class)
    public void projectAddWorkerT3() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";
        String workerName = "BCD";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));
        assert (qualifications.size() == 2);

        Project project = new Project(name, qualifications, ProjectSize.SMALL);
        Worker worker = null;
        project.addWorker(worker);
    }

    // REMOVEWORKER TESTS
    // pdj1183 - Project removeWorker Base Test (U1, V1, W1)
    @Test
    public void projectRemoveWorkerBaseTest() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";
        String workerName = "BCD";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));
        Worker worker = new Worker(workerName, qualifications, 5.0);
        assert (qualifications.size() == 2);

        Project project = new Project(name, qualifications, ProjectSize.SMALL);
        project.addWorker(worker);
        project.removeWorker(worker);
        assertFalse(project.getWorkers().contains(worker));
    }

    // pdj1183 - Project removeWorker T2 (U2, V1, W1)
    @Test(expected = NullPointerException.class)
    public void projectRemoveWorkerT2() {
        String description1 = "Welding";
        String description2 = "Painting";
        String workerName = "BCD";


        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));

        Worker worker = new Worker("BCD", qualifications, 5.0);
        Project project = null;
        project.addWorker(worker);
        project.removeWorker(worker);
    }

    // pdj1183 - Project removeWorker T3 (U1, V2, W1)
    @Test(expected = IllegalArgumentException.class)
    public void projectRemoveWorkerT3() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";
        String workerName = "BCD";
        String WorkerName2 = "DEF";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));
        Worker worker = new Worker(workerName, qualifications, 5.0);
        Worker worker2 = new Worker(WorkerName2, qualifications, 5.0);
        assert (qualifications.size() == 2);

        Project project = new Project(name, qualifications, ProjectSize.SMALL);
        project.addWorker(worker);
        project.removeWorker(worker2);
    }

    // pdj1183 - Project removeWorker T4 (U1, V1, W2)
    @Test(expected = NullPointerException.class)
    public void projectRemoveWorkerT4() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";
        String workerName = "BCD";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));
        Worker worker = new Worker(workerName, qualifications, 5.0);
        assert (qualifications.size() == 2);

        Project project = new Project(name, qualifications, ProjectSize.SMALL);
        project.addWorker(worker);
        project.removeWorker(null);
    }

    // REMOVEALLWORKERS TESTS
    // pdj1183 - Project removeAllWorkers Base Test (X1, Y2)
    @Test
    public void projectRemoveAllWorkersBaseTest() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";
        String workerName = "BCD";
        String WorkerName2 = "DEF";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));
        Worker worker = new Worker(workerName, qualifications, 5.0);
        Worker worker2 = new Worker(WorkerName2, qualifications, 5.0);
        assert (qualifications.size() == 2);

        Project project = new Project(name, qualifications, ProjectSize.SMALL);
        project.addWorker(worker);
        project.addWorker(worker2);
        project.removeAllWorkers();
        assertTrue(project.getWorkers().isEmpty());
    }

    // pdj1183 - Project removeAllWorkers T2 (X2, Y2)
    @Test(expected = NullPointerException.class)
    public void projectRemoveAllWorkersT2() {
        Project project = null;
        project.removeAllWorkers();
    }

    // pdj1183 - Project removeAllWorkers T3 (X1, Y1)
    @Test
    public void projectRemoveAllWorkersT3() {
         String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));
        assert (qualifications.size() == 2);

        Project project = new Project(name, qualifications, ProjectSize.SMALL);
        assertTrue(project.getWorkers().isEmpty());
    }

    // ADDQUALIFICATION TESTS
    // pdj1183 - Project addQualification Base Test (AB1, AD1)
    @Test
    public void projectAddQualificationBaseTest() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";
        String description3 = "Soldering";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));
        assert (qualifications.size() == 2);

        Project project = new Project(name, qualifications, ProjectSize.SMALL);
        project.addQualification(new Qualification(description3));
        assert (project.getRequiredQualifications().size() == 3);
        assertTrue(project.getRequiredQualifications().contains(new Qualification(description3)));
    }

    // pdj1183 - Project addQualification T2 (AB2, AD1)
    @Test(expected = NullPointerException.class)
    public void projectAddQualificationT2() {
        String description3 = "Soldering";

        Project project = null;
        project.addQualification(new Qualification(description3));
    }

    // pdj1183 - Project addQualification T3 (AB1, AD2)
    @Test(expected = NullPointerException.class)
    public void projectAddQualificationT3() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";
        String description3 = "Soldering";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));
        assert (qualifications.size() == 2);

        Project project = new Project(name, qualifications, ProjectSize.SMALL);
        project.addQualification(null);
    }

    //GETMISSINGQUALIFICATIONS TESTS
    // pdj1183 - Project getMissingQualifications Base Test (AE1, AF2, AH3)
    @Test
    public void projectGetMissingQualificationsBaseTest() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));
        assert (qualifications.size() == 2);

        Set<Qualification> workerQualifications = new HashSet<Qualification>();
        workerQualifications.add(new Qualification(description1));

        Project project = new Project(name, qualifications, ProjectSize.SMALL);
        Worker worker = new Worker("Greg", workerQualifications, 20.0);

        project.addWorker(worker);
        Set<Qualification> missingQualifications = project.getMissingQualifications();
        assertTrue(missingQualifications.contains(new Qualification(description2)));
    }

    // pdj1183 - Project getMissingQualifications T2 (AE2, AF2, AH3)
    @Test(expected = NullPointerException.class)
    public void projectGetMissingQualificationsT2() {
        Project project = null;
        project.getMissingQualifications();
    }

    // pdj1183 - Project getMissingQualifications T3 (AE1, AF1, AH1)
    @Test(expected = IllegalArgumentException.class)
    public void projectGetMissingQualificationsT3() {
        String name = "ABC";

        String description1 = "Welding";

        Set<Qualification> workerQualifications = new HashSet<Qualification>();
        workerQualifications.add(new Qualification(description1));

        Project project = new Project(name, new HashSet<Qualification>(), ProjectSize.SMALL);
        Worker worker = new Worker("Greg", workerQualifications, 20.0);

        project.addWorker(worker);
        Set<Qualification> missingQualifications = project.getMissingQualifications();
        assertTrue(missingQualifications.isEmpty());
    }

    // pdj1183 - Project getMissingQualifications T4 (AE1, AF2, AH1)
    @Test
    public void projectGetMissingQualificationsT4() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));

        Project project = new Project(name, qualifications, ProjectSize.SMALL);
        Worker worker = new Worker("Greg", qualifications, 20.0);

        project.addWorker(worker);
        Set<Qualification> missingQualifications = project.getMissingQualifications();
        assertTrue(missingQualifications.isEmpty());
    }

    // pdj1183 - Project getMissingQualifications T5 (AE1, AF2, AH2)
    @Test
    public void projectGetMissingQualificationsT5() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";
        String description3 = "Soldering";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));

        Set<Qualification> workerQualifications = new HashSet<Qualification>();
        workerQualifications.add(new Qualification(description3));

        Project project = new Project(name, qualifications, ProjectSize.SMALL);
        Worker worker = new Worker("Greg", workerQualifications, 20.0);

        project.addWorker(worker);
        Set<Qualification> missingQualifications = project.getMissingQualifications();
        assert(missingQualifications.size() == 2);
        assertTrue(missingQualifications.contains(new Qualification(description1)));
        assertTrue(missingQualifications.contains(new Qualification(description2)));
    }

    // ISHELFUL TESTS
    // pdj1183 - Project isHelpful Base Test (AI1, AJ2, AK2, AL3)
    @Test
    public void projectIsHelpfulBaseTest() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));

        Set<Qualification> workerQualifications1 = new HashSet<Qualification>();
        workerQualifications1.add(new Qualification(description1));

        Set<Qualification> workerQualifications2 = new HashSet<Qualification>();
        workerQualifications2.add(new Qualification(description2));

        Project project = new Project(name, qualifications, ProjectSize.SMALL);
        Worker worker = new Worker("Greg", workerQualifications1, 20.0);
        Worker worker1 = new Worker("Bob", workerQualifications2, 30.0);

        project.addWorker(worker);
        assertTrue(project.isHelpful(worker1));
    }

    // pdj1183 - Project isHelpful T2 (AI2, AJ2, AK2, AL3)
    @Test(expected = NullPointerException.class)
    public void projectIsHelpfulT2() {
        Project project = null;
        Set<Qualification> workerQualification = new HashSet<Qualification>();
        workerQualification.add(new Qualification("Welding"));
        Worker worker = new Worker("Greg", workerQualification, 20.0);
        project.isHelpful(worker);
    }

    // pdj1183 - Project isHelpful T3 (AI1, AJ1, AK2, AL3)
    @Test(expected = IllegalArgumentException.class)
    public void projectIsHelpfulT3() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";

        Set<Qualification> workerQualifications = new HashSet<Qualification>();
        workerQualifications.add(new Qualification(description1));
        workerQualifications.add(new Qualification(description2));

        Project project = new Project(name, new HashSet<Qualification>(), ProjectSize.SMALL);
        Worker worker = new Worker("Greg", workerQualifications, 20.0);

        project.addWorker(worker);
        assertFalse(project.isHelpful(worker));
    }

    // pdj1183 - Project isHelpful T4 (AI1, AJ2, AK1, AL3)
    @Test
    public void projectIsHelpfulT4() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));

        Set<Qualification> workerQualifications = new HashSet<Qualification>();
        workerQualifications.add(new Qualification(description1));

        Project project = new Project(name, qualifications, ProjectSize.SMALL);
        Worker worker = new Worker("Greg", workerQualifications, 20.0);

        assertTrue(project.isHelpful(worker));
    }

    // pdj1183 - Project isHelpful T5 (AI1, AJ2, AK2, AL1)
    @Test
    public void projectIsHelpfulT5() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";
        String deccription3 = "Sanding";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));

        Set<Qualification> workerQualifications1 = new HashSet<Qualification>();
        workerQualifications1.add(new Qualification(description1));

        Set<Qualification> workerQualifications2 = new HashSet<Qualification>();
        workerQualifications2.add(new Qualification(description2));

        Set<Qualification> workerQualifications3 = new HashSet<Qualification>();
        workerQualifications3.add(new Qualification(deccription3));

        Project project = new Project(name, qualifications, ProjectSize.SMALL);
        Worker worker = new Worker("Greg", workerQualifications1, 20.0);
        Worker worker1 = new Worker("Bob", workerQualifications2, 30.0);
        Worker worker2 = new Worker("Tom", workerQualifications3, 15.0);

        project.addWorker(worker);
        project.addWorker(worker1);

        assertFalse(project.isHelpful(worker2));
    }

    // pdj1183 - Project isHelpful T6 (AI1, AJ2, AK2, AL2)
    @Test
    public void projectIsHelpfulT6() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));

        Set<Qualification> workerQualifications1 = new HashSet<Qualification>();
        workerQualifications1.add(new Qualification(description1));

        Project project = new Project(name, qualifications, ProjectSize.SMALL);
        Worker worker = new Worker("Greg", workerQualifications1, 20.0);

        assertTrue(project.isHelpful(worker));
    }

    // TODTO TESTS
    // pdj1183 - Project toDTO Base Test (AM2, AN2, AO1, AP1, AQ2, AR2)
    @Test
    public void projectToDTOBaseTest() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));
        assert (qualifications.size() == 2);

        Set<Qualification> workerQualifications1 = new HashSet<Qualification>();
        workerQualifications1.add(new Qualification(description1));

        Set<Qualification> workerQualifications2 = new HashSet<Qualification>();
        workerQualifications2.add(new Qualification(description2));

        Worker worker = new Worker("Greg", workerQualifications1, 20.0);
        Worker worker1 = new Worker("Bob", workerQualifications2, 30.0);

        Project project = new Project(name, qualifications, ProjectSize.SMALL);
        project.addWorker(worker);
        project.addWorker(worker1);

        ProjectDTO projectDTO = project.toDTO();

        assert (projectDTO.getName().equals(name));
        assert (projectDTO.getWorkers().length == 2);
        assert (projectDTO.getWorkers()[1].equals(worker.getName()));
        assert (projectDTO.getWorkers()[0].equals(worker1.getName()));
        assert (projectDTO.getQualifications().length == 2);
        assert (projectDTO.getMissingQualifications().length == 0);
    }

    // pdj1183 - Project toDTO T2 (AM1, AN2, AO1, AP1, AQ2, AR2)
    @Test(expected = IllegalArgumentException.class)
    public void projectToDTOT2() {
        String name = "";
        String description1 = "Welding";
        String description2 = "Painting";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));

        Project project = new Project(name, qualifications, ProjectSize.SMALL);
        project.toDTO();
    }

    // pdj1183 - Project toDTO T3 (AM2, AN1, AO1, AP1, AQ2, AR2)
    @Test(expected = IllegalArgumentException.class)
    public void projectToDTOT3() {
        String name = "ABC";

        Set<Qualification> qualifications = new HashSet<Qualification>();

        Project project = new Project(name, qualifications, ProjectSize.SMALL);
        ProjectDTO projectDTO = project.toDTO();

        assert (projectDTO.getName().equals(name));
        assert (projectDTO.getWorkers().length == 0);
        assert (projectDTO.getQualifications().length == 0);
}

    // pdj1183 - Project toDTO T4 (AM2, AN2, AO2, AP1, AQ2, AR2)
    @Test(expected = IllegalArgumentException.class)    
    public void projectToDTOT4() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = null;

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));

        Project project = new Project(name, qualifications, ProjectSize.SMALL);
        project.toDTO();
        assertTrue(project.toDTO().getQualifications().length == 2);
    }

    // pdj1183 - Project toDTO T5 (AM2, AN2, AO1, AP2, AQ2, AR2)
    @Test(expected = IllegalArgumentException.class)
    public void projectToDTOT5() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));

        ProjectSize size = ProjectSize.valueOf("GARGANTUAN");

        Project project = new Project(name, qualifications, size);
        project.toDTO();
    }

    // pdj1183 - Project toDTO T6 (AM2, AN2, AO1, AP1, AQ1, AR2)
    @Test(expected = IllegalArgumentException.class)
    public void projectToDTOT6() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));

        Project project = new Project(name, qualifications, null);
        project.toDTO();
    }

    // pdj1183 - Project toDTO T7 (AM2, AN2, AO1, AP1, AQ2, AR1)
    @Test()
    public void projectToDTOT7() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));

        Project project = new Project(name, qualifications, ProjectSize.SMALL);
        ProjectDTO projectDTO = project.toDTO();

         assert (projectDTO.getName().equals(name));
        assert (projectDTO.getWorkers().length == 0);
        assert (projectDTO.getQualifications().length == 2);
        assert (projectDTO.getMissingQualifications().length == 2);

    }


// PIT TESTS

    //pdj1183 PIT improvement test
    @Test
    public void projectGetNamePIT() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));

        Project project = new Project(name, qualifications, ProjectSize.SMALL);

        assertTrue(project.getName().equals(name));


    } 

    //pdj1183 PIT improvement test
    @Test
    public void projectIsHelpfulPIT() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));

        Set<Qualification> workerQualifications1 = new HashSet<Qualification>();
        workerQualifications1.add(new Qualification(description1));

        Set<Qualification> workerQualifications2 = new HashSet<Qualification>();

        Project project = new Project(name, qualifications, ProjectSize.SMALL);
        Worker worker = new Worker("Greg", workerQualifications1, 20.0);
        Worker worker1 = new Worker("Bob", workerQualifications2, 30.0);

        project.addWorker(worker);
        assertFalse(project.isHelpful(worker1));
    }


    //pdj1183 PIT improvement test
    @Test
    public void projectProjectDTOPIT() {
        String name = "ABC";
        String description1 = "Welding";
        String description2 = "Painting";

        Set<Qualification> qualifications = new HashSet<Qualification>();
        qualifications.add(new Qualification(description1));
        qualifications.add(new Qualification(description2));
        assert (qualifications.size() == 2);

        Set<Qualification> workerQualifications1 = new HashSet<Qualification>();
        workerQualifications1.add(new Qualification(description1));

        Set<Qualification> workerQualifications2 = new HashSet<Qualification>();
        workerQualifications2.add(new Qualification(description2));

        Worker worker = new Worker("Greg", workerQualifications1, 20.0);
        Worker worker1 = new Worker("Bob", workerQualifications2, 30.0);

        Project project = new Project(name, qualifications, ProjectSize.SMALL);
        project.addWorker(worker);
        project.addWorker(worker1);

        ProjectDTO projectDTO = project.toDTO();

        assertTrue(projectDTO != null);

    }
}
