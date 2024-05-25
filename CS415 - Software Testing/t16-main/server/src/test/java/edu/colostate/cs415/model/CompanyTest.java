package edu.colostate.cs415.model;

import java.util.Set;
import static org.junit.Assert.*;
import java.util.HashSet;
import org.junit.Test;

public class CompanyTest {
	@Test
	public void test() {
		assert (true);
	}

	// CONTRUCTOR TESTS
	// tyler-bair - Company Constructor
	// Test name is correctly set (B2, C1)
	@Test
	public void companyConstructorBaseTest() {
		String name = "ABC";
		Company company = new Company("ABC");

		assert (company.getName().equals(name));
	}

	// tyler-bair - Tests empty string causes exception (B1)
	@Test(expected = IllegalArgumentException.class)
	public void companyConstructorT2() {
		String name = "";
		new Company(name);
	}

	// tyler-bair - Test null string causes exception (C2)
	@Test(expected = IllegalArgumentException.class)
	public void companyConstructorT3() {
		String name = null;
		new Company(name);
	}

	// TOSTRING TESTS

	// tyler-bair - Test toString executes correctly (A1, N1, O1, R2, S1)
	@Test()
	public void toStringT1() {
		String name = "ABC";
		Company company2 = new Company("ABC");
		company2.createQualification("Fork Lift");
		assert (company2.getName().equals(name));

		Set<Qualification> qualificaion = new HashSet<Qualification>();
		qualificaion.add(new Qualification("Fork Lift"));

		assert (company2.getQualifications().equals(qualificaion));

		company2.createProject("First Project", qualificaion, ProjectSize.SMALL);
		assert (company2.toString().equals("ABC:0:1"));
	}

	// tyler-bair - Test null string causes exception (A2)
	@Test(expected = IllegalArgumentException.class)
	public void toStringT2() {
		Company nullCompany = new Company(null);
		nullCompany.toString();
	}

	// CREATEQUALIFICATION TESTS
	// tyler-bair - Test createQaulification executes correctly (B2, N1, O1)
	@Test()
	public void createQualificationT1() {
		String name = "co3";
		Company company3 = new Company(name);
		Set<Qualification> qualificaion = new HashSet<Qualification>();
		qualificaion.add(new Qualification("Ice Hockey"));
		company3.createQualification("Ice Hockey");
		assert (company3.getQualifications().equals(qualificaion));
	}

	// tyler-bair - Test null qualification creates exception (B2, C1, O2)
	@Test(expected = IllegalArgumentException.class)
	public void createQualificationT2() {
		String name = "co4";
		Company company4 = new Company(name);
		company4.createQualification(null);
	}

	// tyler-bair - Test empty qualification creates exception (B2, C1, N2)
	@Test(expected = IllegalArgumentException.class)
	public void createQualificaitonT3() {
		String name = "co5";
		Company company5 = new Company(name);
		company5.createQualification("");
	}

	// tyler-bair - Test createQaulification executes multiple qualifications
	// correctly (B2, N1, O1)
	@Test()
	public void createQualificationT4() {
		String name = "co6";
		Set<Qualification> qualificaion = new HashSet<Qualification>();
		qualificaion.add(new Qualification("Ice Hockey"));
		qualificaion.add(new Qualification("Blacksmith"));
		Company company6 = new Company(name);
		company6.createQualification("Ice Hockey");
		company6.createQualification("Blacksmith");
		assert (company6.getQualifications().equals(qualificaion));
	}

	// CREATEPROJECT TESTS
	// tyler-bair - Test a project is created successfully (P1, Q1, R1)
	@Test()
	public void createProjectT1() {
		String name = "ABC";
		Company company = new Company(name);
		assert (company.getName().equals(name));

		Set<Qualification> qualification = new HashSet<Qualification>();
		qualification.add(new Qualification("Fork Lift"));
		company.createQualification("Fork Lift");
		assert (company.getQualifications().equals(qualification));

		Set<Project> expectedProjects = new HashSet<Project>();
		expectedProjects.add(new Project(name, qualification, ProjectSize.MEDIUM));
		company.createProject(name, qualification, ProjectSize.MEDIUM);
		assert (company.getProjects().equals(expectedProjects));
	}

	// tyler-bair - Test multiple projects are created successfully and size set to
	// BIG (P1, Q1, R3)
	@Test()
	public void createProjectT2() {
		String name = "ABC";
		Company company = new Company(name);
		assert (company.getName().equals(name));

		Set<Qualification> qualification = new HashSet<Qualification>();
		qualification.add(new Qualification("Fork Lift"));
		qualification.add(new Qualification("OSHA 30 Hour"));
		company.createQualification("Fork Lift");
		company.createQualification("OSHA 30 Hour");
		assert (company.getQualifications().equals(qualification));

		Set<Project> projects = new HashSet<Project>();
		projects.add(new Project("p1", qualification, ProjectSize.BIG));
		projects.add(new Project("p2", qualification, ProjectSize.BIG));
		company.createProject("p1", qualification, ProjectSize.BIG);
		company.createProject("p2", qualification, ProjectSize.BIG);
		assert (company.getProjects().equals(projects));
	}

	// tyler-bair - Test project size small executes successfully (P1, Q1, R2)
	@Test()
	public void createProjectT3() {
		String name = "ABC";
		Company company = new Company(name);
		assert (company.getName().equals(name));

		Set<Qualification> qualification = new HashSet<Qualification>();
		qualification.add(new Qualification("Fork Lift"));
		company.createQualification("Fork Lift");
		assert (company.getQualifications().equals(qualification));

		Set<Project> projects = new HashSet<Project>();
		projects.add(new Project("p1", qualification, ProjectSize.SMALL));
		company.createProject("p1", qualification, ProjectSize.SMALL);
		assert (company.getProjects().equals(projects));
	}

	// tyler-bair - Test that project size null causes exception (P1, Q1, R4)
	@Test(expected = IllegalArgumentException.class)
	public void createProjectT4() {
		String name = "ABC";
		Company company = new Company(name);
		assert (company.getName().equals(name));

		Set<Qualification> qualification = new HashSet<Qualification>();
		qualification.add(new Qualification("Fork Lift"));
		company.createQualification("Fork Lift");
		assert (company.getQualifications().equals(qualification));

		company.createProject("p1", qualification, null);
	}

	// tyler-bair - Test that empty project name creates exception (P2, Q1, R1)
	@Test(expected = IllegalArgumentException.class)
	public void createProjectT5() {
		String name = "ABC";
		Company company = new Company(name);
		assert (company.getName().equals(name));

		Set<Qualification> qualification = new HashSet<Qualification>();
		qualification.add(new Qualification("Fork Lift"));
		company.createQualification("Fork Lift");
		assert (company.getQualifications().equals(qualification));

		company.createProject("", qualification, null);
	}

	// tyler-bair - Test that null project name creates exception (P1, Q2, R1)
	@Test(expected = IllegalArgumentException.class)
	public void createProjectT6() {
		String name = "ABC";
		Company company = new Company(name);
		assert (company.getName().equals(name));

		Set<Qualification> qualification = new HashSet<Qualification>();
		qualification.add(new Qualification("Fork Lift"));
		company.createQualification("Fork Lift");
		assert (company.getQualifications().equals(qualification));

		company.createProject(null, qualification, null);
	}

	// EQUALS TEST
	// chenaa - base case T1 (D1,E1,F1,G1)
	@Test
	public void companyEqualsT1() {
		Company company1 = new Company("ABC");
		Company company2 = new Company("ABC");

		assertTrue("type = company", company1 instanceof Company);
		assertFalse("null E1", company1.equals(null));
		assertFalse("null F1", company2.equals(null));
		assertTrue("do match", company1.equals(company2));
	}

	// chenaa - T2 (D2,E1,F1,G1)
	@Test
	public void companyEqualsT2() {
		Company company1 = new Company("ABC");
		Qualification qualification = new Qualification("ABC");

		assertFalse("type != company", company1.equals(qualification));
	}

	// chenaa - T3 (D1,E2,F1,G1)
	@Test
	public void companyEqualsT3() {
		Company company = new Company("ABC");
		assertFalse("null E2", company.equals(null));
	}

	// chenaa - T4 (D1,E1,F2,G1)
	@Test
	public void companyEqualsT4() {
		Company company1 = new Company("ABC");
		Company company2 = null;
		assertFalse("null F2", company1.equals(company2));
	}

	// chenaa - T5 (D1,E1,F1,G2)
	@Test
	public void companyEqualsT5() {
		Company company1 = new Company("ABC");
		Company company2 = new Company("BCD");
		;
		assertFalse("do not match", company1.equals(company2));
	}

	// CREATEWORKER TESTS
	// Test worker is created successfully (H1, I1, J1, K1, L1)
	@Test()
	public void createWorkerT1() {
		String coName = "co1";
		Company company = new Company(coName);
		assert (company.getName().equals(coName));

		Set<Qualification> qualifications = new HashSet<Qualification>();
		qualifications.add(new Qualification("Fork Lift"));
		company.createQualification("Fork Lift");
		assert (company.getQualifications().equals(qualifications));

		String wName = "Steve";
		Set<Worker> workers = new HashSet<Worker>();
		workers.add(new Worker(wName, qualifications, 5.5));
		company.createWorker(wName, qualifications, 5.5);
		assert (company.getEmployedWorkers().equals(workers));
		assert (company.getAvailableWorkers().equals(workers));
	}

	// Test empty worker name creates exception (H2, I1, J1, K1, L1)
	@Test(expected = IllegalArgumentException.class)
	public void createWorkerT2() {
		String coName = "co1";
		Company company = new Company(coName);
		assert (company.getName().equals(coName));

		Set<Qualification> qualifications = new HashSet<Qualification>();
		qualifications.add(new Qualification("Fork Lift"));
		company.createQualification("Fork Lift");
		assert (company.getQualifications().equals(qualifications));

		String wName = "";
		Set<Worker> workers = new HashSet<Worker>();
		workers.add(new Worker(wName, qualifications, 5.5));
		company.createWorker(wName, qualifications, 5.5);
	}

	// Test null worker name creates exception (H1, I2, J1, K1, L1)
	@Test(expected = IllegalArgumentException.class)
	public void createWorkerT3() {
		String coName = "co1";
		Company company = new Company(coName);
		assert (company.getName().equals(coName));

		Set<Qualification> qualifications = new HashSet<Qualification>();
		qualifications.add(new Qualification("Fork Lift"));
		company.createQualification("Fork Lift");
		assert (company.getQualifications().equals(qualifications));

		company.createWorker(null, qualifications, 5.5);
	}

	// Test null qualifications causes an exception (H1, I1, J2, K1, L1)
	@Test(expected = IllegalArgumentException.class)
	public void createWorkerT4() {
		String coName = "co1";
		Company company = new Company(coName);
		assert (company.getName().equals(coName));

		company.createWorker(coName, null, 0);
	}

	// Test qualification not existing causes exception (H1, I1, J1, K2, L1)
	@Test(expected = IllegalArgumentException.class)
	public void createWorkerT5() {
		String coName = "co1";
		Company company = new Company(coName);
		assert (company.getName().equals(coName));

		Set<Qualification> qualifications = new HashSet<Qualification>();
		qualifications.add(new Qualification("Fork Lift"));
		company.createQualification("Fork Lift");
		assert (company.getQualifications().equals(qualifications));
		qualifications.add(new Qualification("Not in company"));

		String wName = "Steve";
		Set<Worker> workers = new HashSet<Worker>();
		workers.add(new Worker(wName, qualifications, 5.5));
		company.createWorker(wName, qualifications, 5.5);
	}

	// Test negative salary causes exception (H1, I1, J1, K1, L2)
	@Test(expected = IllegalArgumentException.class)
	public void createWorkerT6() {
		String coName = "co1";
		Company company = new Company(coName);
		assert (company.getName().equals(coName));

		Set<Qualification> qualifications = new HashSet<Qualification>();
		qualifications.add(new Qualification("Fork Lift"));
		company.createQualification("Fork Lift");
		assert (company.getQualifications().equals(qualifications));

		String wName = "Steve";
		Set<Worker> workers = new HashSet<Worker>();
		workers.add(new Worker(wName, qualifications, 5.5));
		company.createWorker(wName, qualifications, -5.5);
	}

	// Test zero salary causes exception (H1, I1, J1, K1, L3)
	@Test(expected = IllegalArgumentException.class)
	public void createWorkerT7() {
		String coName = "co1";
		Company company = new Company(coName);
		assert (company.getName().equals(coName));

		Set<Qualification> qualifications = new HashSet<Qualification>();
		qualifications.add(new Qualification("Fork Lift"));
		company.createQualification("Fork Lift");
		assert (company.getQualifications().equals(qualifications));

		String wName = "Steve";
		Set<Worker> workers = new HashSet<Worker>();
		workers.add(new Worker(wName, qualifications, 5.5));
		company.createWorker(wName, qualifications, 0);
	}

	// chenaa - T1 (T1,U1,V1,W1)
	@Test
	public void startT1() {
		Company company = new Company("BCD");
		Set<Qualification> qualifications = new HashSet<>();
		Qualification q = new Qualification("ABC");
		qualifications.add(q);
		company.createQualification("ABC");
		Project project = new Project("BCD", qualifications, ProjectSize.SMALL);
		Set<Qualification> workerQualifications = new HashSet<>();
		workerQualifications.add(q);
		Worker worker = company.createWorker("Worker1", workerQualifications, 50000.00);
		company.assign(worker, project);
		company.start(project);

		assertEquals(ProjectStatus.ACTIVE, project.getStatus());
	}

	// chenaa - T2 (T2,U1,V1,W1)
	@Test
	public void startT2() {
		Company company = new Company("BCD");
		Set<Qualification> qualifications = new HashSet<>();
		Qualification q = company.createQualification("ABC"); // Assume this adds the qualification to the company
		qualifications.add(q);
		Project project = new Project("BCD", qualifications, ProjectSize.SMALL);
		project.setStatus(ProjectStatus.SUSPENDED);
		Set<Qualification> workerQualifications = new HashSet<>();
		workerQualifications.add(q);
		Worker worker = company.createWorker("Worker1", workerQualifications, 50000);
		company.assign(worker, project);
		company.start(project);
		assertEquals(ProjectStatus.ACTIVE, project.getStatus());
	}

	// chenaa - T3 (T3,U1,V1,W1)
	@Test
	public void startT3() {
		Company company = new Company("BCD");
		Set<Qualification> qualifications = new HashSet<>();
		Qualification q = company.createQualification("ABC"); // Assume this adds the qualification to the company
		qualifications.add(q);
		Project project = new Project("BCD", qualifications, ProjectSize.SMALL);
		project.setStatus(ProjectStatus.PLANNED);
		Set<Qualification> workerQualifications = new HashSet<>();
		workerQualifications.add(q);
		Worker worker = company.createWorker("Worker1", workerQualifications, 50000);
		company.assign(worker, project);
		company.start(project);
		assertEquals(ProjectStatus.ACTIVE, project.getStatus());
	}

	// chenaa - T4 (T4,U1,V1,W1)
	@Test(expected = IllegalArgumentException.class)
	public void startT4() {
		Company company = new Company("BCD");
		Set<Qualification> qualifications = new HashSet<>();
		Qualification q = company.createQualification("ABC"); // Assume this adds the qualification to the company
		qualifications.add(q);
		Project project = new Project("BCD", qualifications, ProjectSize.SMALL);
		project.setStatus(ProjectStatus.FINISHED);
		Set<Qualification> workerQualifications = new HashSet<>();
		workerQualifications.add(q);
		Worker worker = company.createWorker("Worker1", workerQualifications, 50000);
		company.assign(worker, project);
		company.start(project);
	}

	// chenaa - T5 (T1,U2,V1,W1)
	@Test
	public void startT5() {
		Company company = new Company("BCD");
		Set<Qualification> qualifications = new HashSet<>();
		Qualification q = new Qualification("ABC");
		qualifications.add(q);
		company.createQualification("ABC");
		Project project = new Project("BCD", qualifications, ProjectSize.SMALL);
		project.setStatus(ProjectStatus.PLANNED);
		company.start(project);

		assertNotEquals(ProjectStatus.ACTIVE, project.getStatus());
	}

	// chenaa - T6 (T1,U1,V2,W1)
	@Test(expected = NullPointerException.class)
	public void startT6() {
		Company company = new Company("BCD");
		Set<Qualification> qualifications = new HashSet<>();
		Qualification q = new Qualification("ABC");
		qualifications.add(q);
		company.createQualification("ABC");
		Project project = null;
		Set<Qualification> workerQualifications = new HashSet<>();
		workerQualifications.add(q);
		Worker worker = company.createWorker("Worker1", workerQualifications, 50000.00);
		company.assign(worker, project);
		company.start(project);
	}

	// chenaa - T7 (T1,U1,V1,W2)
	@Test(expected = NullPointerException.class)
	public void startT7() {
		Company company = null;
		Set<Qualification> qualifications = new HashSet<>();
		Qualification q = new Qualification("ABC");
		qualifications.add(q);
		company.createQualification("ABC");
		Project project = new Project("BCD", qualifications, ProjectSize.SMALL);
		Set<Qualification> workerQualifications = new HashSet<>();
		workerQualifications.add(q);
		Worker worker = company.createWorker("Worker1", workerQualifications, 50000.00);
		company.assign(worker, project);
		company.start(project);
	}

	// ASSIGN TESTS
	// chenaa assign T1 (AB1,AC1,AD1,AE1,AF1,AG1,AH1,AI1,AJ1,AK1)
	@Test
	public void assignT1() {
		Company company = new Company("BCD");
		Qualification q = company.createQualification("ABC");
		Set<Qualification> qualifications = new HashSet<>();
		qualifications.add(q);

		Project project = company.createProject("BCD", qualifications, ProjectSize.SMALL);
		project.setStatus(ProjectStatus.PLANNED);

		Set<Qualification> workerQualifications = new HashSet<>();
		workerQualifications.add(q);

		Worker worker = company.createWorker("Worker1", workerQualifications, 50.00);
		company.assign(worker, project);
		assertTrue(project.getWorkers().contains(worker));
	}

	// chenaa assign T2 (AB2,AC1,AD1,AE1,AF1,AG1,AH1,AI1,AJ1,AK1)
	@Test(expected = IllegalArgumentException.class)
	public void assignT2() {
		Company company = new Company("BCD");
		Qualification q = company.createQualification("ABC");
		Set<Qualification> qualifications = new HashSet<>();
		qualifications.add(q);
		Project projectToFillWorkload = company.createProject("FillWorkload", qualifications, ProjectSize.BIG);
		projectToFillWorkload.setStatus(ProjectStatus.PLANNED);
		Project projectToFillWorkload2 = company.createProject("FillWorkload2", qualifications, ProjectSize.BIG);
		projectToFillWorkload2.setStatus(ProjectStatus.PLANNED);
		Project projectToFillWorkload3 = company.createProject("FillWorkload3", qualifications, ProjectSize.BIG);
		projectToFillWorkload3.setStatus(ProjectStatus.PLANNED);
		Project projectToFillWorkload4 = company.createProject("FillWorkload4", qualifications, ProjectSize.BIG);
		projectToFillWorkload4.setStatus(ProjectStatus.PLANNED);

		Project project = company.createProject("BCD", qualifications, ProjectSize.SMALL);
		project.setStatus(ProjectStatus.PLANNED);

		Set<Qualification> workerQualifications = new HashSet<>();
		workerQualifications.add(q);

		Worker worker = company.createWorker("Worker1", workerQualifications, 50.00);
		company.assign(worker, projectToFillWorkload);
		company.assign(worker, projectToFillWorkload2);
		company.assign(worker, projectToFillWorkload3);
		company.assign(worker, projectToFillWorkload4);
		company.assign(worker, project);
	}

	// chenaa assign T3 (AB1,AC2,AD1,AE1,AF1,AG1,AH1,AI1,AJ1,AK1)
	@Test(expected = IllegalArgumentException.class)
	public void assignT3() {
		Company company = new Company("BCD");
		Qualification q = company.createQualification("ABC");
		Set<Qualification> qualifications = new HashSet<>();
		qualifications.add(q);

		Project project = company.createProject("BCD", qualifications, ProjectSize.SMALL);
		project.setStatus(ProjectStatus.PLANNED);

		Set<Qualification> workerQualifications = new HashSet<>();
		workerQualifications.add(q);

		Worker worker = company.createWorker("Worker1", workerQualifications, 50.00);
		company.assign(worker, project);
		company.assign(worker, project);
	}

	// chenaa assign T4 (AB1,AC1,AD2,AE1,AF1,AG1,AH1,AI1,AJ1,AK1)
	@Test(expected = IllegalArgumentException.class)
	public void assignT4() {
		Company company = new Company("BCD");
		Qualification q = company.createQualification("ABC");
		Set<Qualification> qualifications = new HashSet<>();
		qualifications.add(q);
		Project projectToFillWorkload = company.createProject("FillWorkload", qualifications, ProjectSize.BIG);
		projectToFillWorkload.setStatus(ProjectStatus.PLANNED);
		Project projectToFillWorkload2 = company.createProject("FillWorkload2", qualifications, ProjectSize.BIG);
		projectToFillWorkload2.setStatus(ProjectStatus.PLANNED);
		Project projectToFillWorkload3 = company.createProject("FillWorkload3", qualifications, ProjectSize.BIG);
		projectToFillWorkload3.setStatus(ProjectStatus.PLANNED);
		Project projectToFillWorkload4 = company.createProject("FillWorkload4", qualifications, ProjectSize.BIG);
		projectToFillWorkload4.setStatus(ProjectStatus.PLANNED);

		Project project = company.createProject("BCD", qualifications, ProjectSize.SMALL);
		project.setStatus(ProjectStatus.PLANNED);

		Set<Qualification> workerQualifications = new HashSet<>();
		workerQualifications.add(q);

		Worker worker = company.createWorker("Worker1", workerQualifications, 50.00);
		company.assign(worker, projectToFillWorkload);
		company.assign(worker, projectToFillWorkload2);
		company.assign(worker, projectToFillWorkload3);
		company.assign(worker, projectToFillWorkload4);
		company.assign(worker, project);
	}

	// chenaa assign T5 (AB1,AC1,AD1,AE2,AF1,AG1,AH1,AI1,AJ1,AK1)
	@Test
	public void assignT5() {
		Company company = new Company("BCD");
		Qualification q = company.createQualification("ABC");
		Set<Qualification> qualifications = new HashSet<>();
		qualifications.add(q);
		Project projectToFillWorkload = company.createProject("FillWorkload", qualifications, ProjectSize.BIG);
		projectToFillWorkload.setStatus(ProjectStatus.PLANNED);
		Project projectToFillWorkload2 = company.createProject("FillWorkload2", qualifications, ProjectSize.BIG);
		projectToFillWorkload2.setStatus(ProjectStatus.PLANNED);
		Project projectToFillWorkload3 = company.createProject("FillWorkload3", qualifications, ProjectSize.BIG);
		projectToFillWorkload3.setStatus(ProjectStatus.PLANNED);
		Project projectToFillWorkload4 = company.createProject("FillWorkload4", qualifications, ProjectSize.BIG);
		projectToFillWorkload4.setStatus(ProjectStatus.PLANNED);

		Set<Qualification> workerQualifications = new HashSet<>();
		workerQualifications.add(q);

		Worker worker = company.createWorker("Worker1", workerQualifications, 50.00);
		company.assign(worker, projectToFillWorkload);
		company.assign(worker, projectToFillWorkload2);
		company.assign(worker, projectToFillWorkload3);
		company.assign(worker, projectToFillWorkload4);
		assertFalse(worker.isAvailable());
		assertFalse(company.getAvailableWorkers().contains(worker));
	}

	// chenaa assign T6 (AB1,AC1,AD1,AE1,AF2,AG1,AH1,AI1,AJ1,AK1)
	@Test(expected = NullPointerException.class)
	public void assignT6() {
		Company company = new Company("BCD");
		Qualification q = company.createQualification("ABC");
		Set<Qualification> qualifications = new HashSet<>();
		qualifications.add(q);

		Project project = company.createProject("BCD", qualifications, ProjectSize.SMALL);
		project.setStatus(ProjectStatus.PLANNED);

		Set<Qualification> workerQualifications = new HashSet<>();
		workerQualifications.add(q);

		Worker worker = null;
		company.assign(worker, project);
	}

	// chenaa assign T7 (AB1,AC1,AD1,AE1,AF1,AG2,AH1,AI1,AJ1,AK1)
	@Test
	public void assignT7() {
		Company company = new Company("BCD");
		Qualification q = company.createQualification("ABC");
		Set<Qualification> qualifications = new HashSet<>();
		qualifications.add(q);

		Project project = company.createProject("BCD", qualifications, ProjectSize.SMALL);
		project.setStatus(ProjectStatus.SUSPENDED);

		Set<Qualification> workerQualifications = new HashSet<>();
		workerQualifications.add(q);

		Worker worker = company.createWorker("Worker1", workerQualifications, 50.00);
		company.assign(worker, project);
		assertTrue(project.getWorkers().contains(worker));
	}

	// chenaa assign T8 (AB1,AC1,AD1,AE1,AF1,AG3,AH1,AI1,AJ1,AK1)
	@Test(expected = IllegalArgumentException.class)
	public void assignT8() {
		Company company = new Company("BCD");
		Qualification q = company.createQualification("ABC");
		Set<Qualification> qualifications = new HashSet<>();
		qualifications.add(q);

		Project project = company.createProject("BCD", qualifications, ProjectSize.SMALL);
		project.setStatus(ProjectStatus.ACTIVE);

		Set<Qualification> workerQualifications = new HashSet<>();
		workerQualifications.add(q);

		Worker worker = company.createWorker("Worker1", workerQualifications, 50.00);
		company.assign(worker, project);
	}

	// chenaa assign T9 (AB1,AC1,AD1,AE1,AF1,AG4,AH1,AI1,AJ1,AK1)
	@Test(expected = IllegalArgumentException.class)
	public void assignT9() {
		Company company = new Company("BCD");
		Qualification q = company.createQualification("ABC");
		Set<Qualification> qualifications = new HashSet<>();
		qualifications.add(q);

		Project project = company.createProject("BCD", qualifications, ProjectSize.SMALL);
		project.setStatus(ProjectStatus.FINISHED);

		Set<Qualification> workerQualifications = new HashSet<>();
		workerQualifications.add(q);

		Worker worker = company.createWorker("Worker1", workerQualifications, 50.00);
		company.assign(worker, project);
	}

	// chenaa assign T10 (AB1,AC1,AD1,AE1,AF1,AG1,AH2,AI1,AJ1,AK1)
	@Test(expected = IllegalArgumentException.class)
	public void assignT10() {
		Company company = new Company("BCD");
		Qualification q = company.createQualification("ABC");
		Qualification q2 = company.createQualification("BCD");
		Set<Qualification> qualifications = new HashSet<>();
		qualifications.add(q);

		Project project = company.createProject("BCD", qualifications, ProjectSize.SMALL);
		project.setStatus(ProjectStatus.PLANNED);

		Set<Qualification> workerQualifications = new HashSet<>();
		workerQualifications.add(q2);

		Worker worker = company.createWorker("Worker1", workerQualifications, 50.00);
		company.assign(worker, project);
	}

	// chenaa assign T11 (AB1,AC1,AD1,AE1,AF1,AG1,AH1,AI2,AJ1,AK1)
	@Test(expected = NullPointerException.class)
	public void assignT11() {
		Company company = new Company("BCD");
		Qualification q = company.createQualification("ABC");
		Set<Qualification> qualifications = new HashSet<>();
		qualifications.add(q);

		Project project = null;
		project.setStatus(ProjectStatus.PLANNED);

		Set<Qualification> workerQualifications = new HashSet<>();
		workerQualifications.add(q);

		Worker worker = company.createWorker("Worker1", workerQualifications, 50.00);
		company.assign(worker, project);
	}

	// chenaa assign T12 (AB1,AC1,AD1,AE1,AF1,AG1,AH1,AI1,AJ2,AK1)
	@Test(expected = NullPointerException.class)
	public void assignT12() {
		Company company = null;
		Qualification q = company.createQualification("ABC");
		Set<Qualification> qualifications = new HashSet<>();
		qualifications.add(q);

		Project project = company.createProject("BCD", qualifications, ProjectSize.SMALL);
		project.setStatus(ProjectStatus.PLANNED);

		Set<Qualification> workerQualifications = new HashSet<>();
		workerQualifications.add(q);

		Worker worker = company.createWorker("Worker1", workerQualifications, 50.00);
		company.assign(worker, project);
	}

	// chenaa assign T13 (AB1,AC1,AD1,AE1,AF1,AG1,AH1,AI1,AJ1,AK2)
	@Test
	public void assignT13() {
		Company company = new Company("BCD");
		Qualification q = company.createQualification("ABC");
		Set<Qualification> qualifications = new HashSet<>();
		qualifications.add(q);

		Project project = company.createProject("BCD", qualifications, ProjectSize.SMALL);
		project.setStatus(ProjectStatus.PLANNED);

		Project project2 = company.createProject("ABC", qualifications, ProjectSize.SMALL);
		project.setStatus(ProjectStatus.PLANNED);

		Set<Qualification> workerQualifications = new HashSet<>();
		workerQualifications.add(q);

		Worker worker = company.createWorker("Worker1", workerQualifications, 50.00);
		company.assign(worker, project);
		company.assign(worker, project2);
		assertTrue(company.getAssignedWorkers().contains(worker));
		assertEquals(1, company.getAssignedWorkers().size());
	}

	// chenaa getunavailable workers test
	@Test
	public void getUnavailableWorkersTest() {
		Company company = new Company("BCD");
		Qualification q = company.createQualification("ABC");
		Qualification q2 = company.createQualification("BCD");
		Set<Qualification> qualifications = new HashSet<>();
		qualifications.add(q);
		qualifications.add(q2);
		Project projectToFillWorkload = company.createProject("FillWorkload", qualifications, ProjectSize.BIG);
		projectToFillWorkload.setStatus(ProjectStatus.PLANNED);
		Project projectToFillWorkload2 = company.createProject("FillWorkload2", qualifications, ProjectSize.BIG);
		projectToFillWorkload2.setStatus(ProjectStatus.PLANNED);
		Project projectToFillWorkload3 = company.createProject("FillWorkload3", qualifications, ProjectSize.BIG);
		projectToFillWorkload3.setStatus(ProjectStatus.PLANNED);
		Project projectToFillWorkload4 = company.createProject("FillWorkload4", qualifications, ProjectSize.BIG);
		projectToFillWorkload4.setStatus(ProjectStatus.PLANNED);

		Set<Qualification> workerQualifications = new HashSet<>();
		workerQualifications.add(q);
		Set<Qualification> workerQualifications2 = new HashSet<>();
		workerQualifications2.add(q2);

		Worker worker = company.createWorker("Worker1", workerQualifications, 50.00);
		Worker worker2 = company.createWorker("Worker2", workerQualifications2, 50.00);
		assertTrue(company.getAvailableWorkers().contains(worker));
		assertTrue(company.getAvailableWorkers().contains(worker2));
		company.assign(worker, projectToFillWorkload);
		company.assign(worker, projectToFillWorkload2);
		company.assign(worker, projectToFillWorkload3);
		company.assign(worker, projectToFillWorkload4);
		company.assign(worker2, projectToFillWorkload);
		company.assign(worker2, projectToFillWorkload2);
		company.assign(worker2, projectToFillWorkload3);
		company.assign(worker2, projectToFillWorkload4);
		assertTrue(company.getUnavailableWorkers().contains(worker));
		assertTrue(company.getUnavailableWorkers().contains(worker2));
	}

	// UNASSIGN TESTS
	// tyler-bair test unassing properly executes (AL1, AM1, AN1, AO1, AP1, AQ1,
	// AR1)
	@Test()
	public void unassignT1() {
		Company co = new Company("ABC");
		Set<Qualification> qualifications = new HashSet<Qualification>();
		Qualification q1 = co.createQualification("Fork Lift");
		Qualification q2 = co.createQualification("Beef Jerky");
		qualifications.add(q1);
		qualifications.add(q2);

		Project proj = co.createProject("BCD", qualifications, ProjectSize.SMALL);
		proj.setStatus(ProjectStatus.PLANNED);

		Set<Qualification> worker1Qualifications = new HashSet<Qualification>();
		worker1Qualifications.add(q1);

		Set<Qualification> worker2Qualifications = new HashSet<Qualification>();
		worker2Qualifications.add(q2);

		Worker worker1 = co.createWorker("Worker1", worker1Qualifications, 50.00);
		Worker worker2 = co.createWorker("Worker2", worker2Qualifications, 50.00);
		co.assign(worker1, proj);
		co.assign(worker2, proj);

		worker2.addQualification(q1);
		proj.setStatus(ProjectStatus.ACTIVE);
		co.unassign(worker2, proj);

		assertTrue(worker2.getQualifications().size() == 2);
		assertFalse(co.getAssignedWorkers().contains(worker2));
		assertTrue(proj.getMissingQualifications().size() == 1);
		assertTrue(worker1.getQualifications().size() == 1);
		assertFalse(proj.getWorkers().contains(worker2));
		assertEquals(ProjectStatus.SUSPENDED, proj.getStatus());
	}

	// tyler-bair (AL2, AM1, AN1, AO1, AP1, AQ1, AR1)
	@Test()
	public void unassignT2() {
		Company co = new Company("ABC");
		Set<Qualification> qualifications = new HashSet<Qualification>();
		Qualification q1 = co.createQualification("Fork Lift");
		Qualification q2 = co.createQualification("Beef Jerky");
		qualifications.add(q1);
		qualifications.add(q2);

		Project proj = co.createProject("BCD", qualifications, ProjectSize.SMALL);
		proj.setStatus(ProjectStatus.PLANNED);

		Set<Qualification> worker1Qualifications = new HashSet<Qualification>();
		worker1Qualifications.add(q1);

		Worker worker1 = co.createWorker("Worker1", worker1Qualifications, 50.00);
		co.assign(worker1, proj);
		proj.setStatus(ProjectStatus.ACTIVE);

		co.unassign(worker1, proj);
		assertTrue(worker1.getProjects().size() == 0);
		assertEquals(ProjectStatus.SUSPENDED, proj.getStatus());
		assertTrue(proj.getMissingQualifications().size() > 0);
		assertFalse(co.getAssignedWorkers().contains(worker1));
		assertFalse(proj.getWorkers().contains(worker1));
	}

	// tyler-bair (AL1, AM2, AN1, AO1, AP1, AQ1, AR1)
	@Test()
	public void unassignT3() {
		Company co = new Company("ABC");
		Set<Qualification> qualifications = new HashSet<Qualification>();
		Qualification q1 = co.createQualification("Fork Lift");
		Qualification q2 = co.createQualification("Beef Jerky");
		qualifications.add(q1);
		qualifications.add(q2);

		Project proj = co.createProject("BCD", qualifications, ProjectSize.SMALL);
		proj.setStatus(ProjectStatus.PLANNED);

		Set<Qualification> worker1Qualifications = new HashSet<Qualification>();
		worker1Qualifications.add(q1);

		Worker worker1 = co.createWorker("Worker1", worker1Qualifications, 50.00);
		co.assign(worker1, proj);
		proj.setStatus(ProjectStatus.ACTIVE);

		assertTrue(worker1.getProjects().contains(proj));

		co.unassign(worker1, proj);
		assertTrue(co.getUnassignedWorkers().contains(worker1));
		assertTrue(proj.getMissingQualifications().size() > 0);
	}

	// tyler-bair (AL1, AM1, AN2, AO1, AP1, AQ1, AR1)
	@Test()
	public void unassignT4() {
		Company co = new Company("ABC");
		Set<Qualification> qualifications = new HashSet<Qualification>();
		Qualification q1 = co.createQualification("Fork Lift");
		Qualification q2 = co.createQualification("Beef Jerky");
		qualifications.add(q1);
		qualifications.add(q2);

		Project projectToFillWorkload1 = co.createProject("FillWorkload", qualifications, ProjectSize.BIG);
		projectToFillWorkload1.setStatus(ProjectStatus.PLANNED);
		Project projectToFillWorkload2 = co.createProject("FillWorkload2", qualifications, ProjectSize.BIG);
		projectToFillWorkload2.setStatus(ProjectStatus.PLANNED);
		Project projectToFillWorkload3 = co.createProject("FillWorkload3", qualifications, ProjectSize.BIG);
		projectToFillWorkload3.setStatus(ProjectStatus.PLANNED);
		Project projectToFillWorkload4 = co.createProject("FillWorkload4", qualifications, ProjectSize.BIG);
		projectToFillWorkload4.setStatus(ProjectStatus.PLANNED);

		Set<Qualification> worker1Qualifications = new HashSet<>();
		worker1Qualifications.add(q1);
		Set<Qualification> worker2Qualifications = new HashSet<>();
		worker2Qualifications.add(q2);

		Worker worker1 = co.createWorker("Worker1", worker1Qualifications, 50.00);
		Worker worker2 = co.createWorker("Worker2", worker2Qualifications, 50.00);
		assertTrue(co.getAvailableWorkers().contains(worker1));
		assertTrue(co.getAvailableWorkers().contains(worker2));

		co.assign(worker1, projectToFillWorkload1);
		co.assign(worker1, projectToFillWorkload2);
		co.assign(worker1, projectToFillWorkload3);
		co.assign(worker1, projectToFillWorkload4);
		co.assign(worker2, projectToFillWorkload1);
		co.assign(worker2, projectToFillWorkload2);
		co.assign(worker2, projectToFillWorkload3);
		co.assign(worker2, projectToFillWorkload4);
		projectToFillWorkload1.setStatus(ProjectStatus.ACTIVE);
		projectToFillWorkload2.setStatus(ProjectStatus.ACTIVE);
		projectToFillWorkload3.setStatus(ProjectStatus.ACTIVE);
		projectToFillWorkload4.setStatus(ProjectStatus.ACTIVE);

		assertTrue(co.getUnavailableWorkers().contains(worker1));
		assertTrue(co.getUnavailableWorkers().contains(worker2));

		co.unassign(worker2, projectToFillWorkload4);
		assertTrue(co.getAvailableWorkers().contains(worker2));
		assertTrue(projectToFillWorkload4.getMissingQualifications().size() > 0);
		assertFalse(co.getUnassignedWorkers().contains(worker2));
		assertTrue(projectToFillWorkload4.getMissingQualifications().size() > 0);
		assertTrue(projectToFillWorkload3.getMissingQualifications().size() == 0);
	}

	// tyler-bair (AL1, AM1, AN1, AO2, AP1, AQ1, AR1)
	@Test(expected = NullPointerException.class)
	public void unassignT5() {
		Company co = new Company("ABC");
		Set<Qualification> qualifications = new HashSet<Qualification>();
		Qualification q1 = co.createQualification("Fork Lift");
		Qualification q2 = co.createQualification("Beef Jerky");
		qualifications.add(q1);
		qualifications.add(q2);

		Project proj = co.createProject("BCD", qualifications, ProjectSize.SMALL);
		proj.setStatus(ProjectStatus.ACTIVE);

		Set<Qualification> worker1Qualifications = new HashSet<Qualification>();
		worker1Qualifications.add(q1);
		Set<Qualification> worker2Qualifications = new HashSet<>();
		worker2Qualifications.add(q2);

		Worker worker1 = null;
		worker1.addProject(proj);
	}

	// tyler-bair (AL1, AM1, AN1, AO1, AP2, AQ1, AR1)
	@Test()
	public void unassignT6() {
		Company co = new Company("ABC");
		Set<Qualification> qualifications = new HashSet<Qualification>();
		Qualification q1 = co.createQualification("Fork Lift");
		Qualification q2 = co.createQualification("Beef Jerky");
		qualifications.add(q1);
		qualifications.add(q2);

		Project proj = co.createProject("BCD", qualifications, ProjectSize.SMALL);
		proj.setStatus(ProjectStatus.SUSPENDED);

		Set<Qualification> worker1Qualifications = new HashSet<Qualification>();
		worker1Qualifications.add(q1);

		Worker worker1 = co.createWorker("Worker1", worker1Qualifications, 50.00);
		co.assign(worker1, proj);
		co.unassign(worker1, proj);

		assertTrue(proj.getStatus() == ProjectStatus.SUSPENDED);
		assertTrue(proj.getMissingQualifications().size() > 0);
	}

	// tyler-bair (AL1, AM1, AN1, AO1, AP3, AQ1, AR1)
	@Test()
	public void unassignT7() {
		Company co = new Company("ABC");
		Set<Qualification> qualifications = new HashSet<Qualification>();
		Qualification q1 = co.createQualification("Fork Lift");
		Qualification q2 = co.createQualification("Beef Jerky");
		qualifications.add(q1);
		qualifications.add(q2);

		Project proj = co.createProject("BCD", qualifications, ProjectSize.SMALL);
		proj.setStatus(ProjectStatus.PLANNED);

		Set<Qualification> worker1Qualifications = new HashSet<Qualification>();
		worker1Qualifications.add(q1);

		Worker worker1 = co.createWorker("Worker1", worker1Qualifications, 50.00);
		co.assign(worker1, proj);
		co.unassign(worker1, proj);

		assertTrue(co.getAvailableWorkers().contains(worker1));
		assertTrue(proj.getStatus() == ProjectStatus.PLANNED);
		assertTrue(proj.getMissingQualifications().size() > 0);
		assertTrue(co.getQualifications().size() == 2);
	}

	// tyler-bair (AL1, AM1, AN1, AO1, AP4, AQ1, AR1)
	@Test(expected = IllegalArgumentException.class)
	public void unassignT8() {
		Company co = new Company("ABC");
		Set<Qualification> qualifications = new HashSet<Qualification>();
		Qualification q1 = co.createQualification("Fork Lift");
		Qualification q2 = co.createQualification("Beef Jerky");
		qualifications.add(q1);
		qualifications.add(q2);

		Project proj = co.createProject("BCD", qualifications, ProjectSize.SMALL);
		proj.setStatus(ProjectStatus.FINISHED);

		Set<Qualification> worker1Qualifications = new HashSet<Qualification>();
		worker1Qualifications.add(q1);

		Worker worker1 = co.createWorker("Worker1", worker1Qualifications, 50.00);
		co.assign(worker1, proj);
		co.unassign(worker1, proj);

		assertTrue(co.getAvailableWorkers().contains(worker1));
		assertTrue(proj.getStatus() == ProjectStatus.PLANNED);
		assertTrue(proj.getMissingQualifications().size() > 0);
		assertTrue(co.getQualifications().size() == 2);
	}

	// tyler-bair (AL1, AM1, AN1, AO1, AP1, AQ2, AR1)
	@Test()
	public void unassignT9() {
		Company co = new Company("ABC");
		Set<Qualification> qualifications = new HashSet<Qualification>();
		Qualification q1 = co.createQualification("Fork Lift");
		Qualification q2 = co.createQualification("Beef Jerky");
		qualifications.add(q1);
		qualifications.add(q2);

		Project proj = co.createProject("BCD", qualifications, ProjectSize.SMALL);
		proj.setStatus(ProjectStatus.PLANNED);

		Set<Qualification> worker1Qualifications = new HashSet<Qualification>();
		worker1Qualifications.add(q1);
		Set<Qualification> worker2Qualifications = new HashSet<Qualification>();
		worker2Qualifications.add(q2);

		Worker worker1 = co.createWorker("Worker1", worker1Qualifications, 50.00);
		Worker worker2 = co.createWorker("Worker2", worker2Qualifications, 50.00);
		co.assign(worker1, proj);
		co.assign(worker2, proj);
		worker1.addQualification(q2);

		co.unassign(worker2, proj);
		assertTrue(proj.getMissingQualifications().size() == 0);
		assertTrue(co.getAvailableWorkers().contains(worker2));
		assertTrue(co.getAssignedWorkers().contains(worker1));
		assertTrue(co.getQualifications().size() == 2);
	}

	// tyler-bair (AL1, AM1, AN1, AO1, AP1, AQ1, AR2)
	@Test(expected = NullPointerException.class)
	public void unassignT10() {
		Company co = new Company("ABC");
		Set<Qualification> qualifications = new HashSet<Qualification>();
		Qualification q1 = co.createQualification("Fork Lift");
		Qualification q2 = co.createQualification("Beef Jerky");
		qualifications.add(q1);
		qualifications.add(q2);

		Project proj = null;
		proj.setStatus(ProjectStatus.PLANNED);

		Set<Qualification> worker1Qualifications = new HashSet<Qualification>();
		worker1Qualifications.add(q1);
		Set<Qualification> worker2Qualifications = new HashSet<Qualification>();
		worker2Qualifications.add(q2);

		Worker worker1 = co.createWorker("Worker1", worker1Qualifications, 50.00);
		Worker worker2 = co.createWorker("Worker2", worker2Qualifications, 50.00);
		co.assign(worker1, proj);
		co.assign(worker2, proj);

		co.unassign(worker2, proj);
		assertTrue(proj.getMissingQualifications().size() == 0);
		assertTrue(co.getAvailableWorkers().contains(worker2));
		assertTrue(co.getAssignedWorkers().contains(worker1));
		assertTrue(co.getQualifications().size() == 2);
	}

	//UNASSIGN-ALL TESTS
	//tyler-bair (AT1, AU1, AV1, AW1)

	@Test()
	public void unassignAllT1() {
		Company co = new Company("ABC");
		Set<Qualification> qualifications = new HashSet<Qualification>();
		Qualification q1 = co.createQualification("Fork Lift");
		Qualification q2 = co.createQualification("Beef Jerky");
		qualifications.add(q1);
		qualifications.add(q2);

		Set<Qualification> qualifications2 = new HashSet<Qualification>();
		qualifications2.add(q1);
		qualifications2.add(q2);

		Set<Qualification> qualifications3 = new HashSet<Qualification>();
		qualifications3.add(q1);
		qualifications3.add(q2);

		Project proj1 = co.createProject("BCD", qualifications, ProjectSize.SMALL);
		proj1.setStatus(ProjectStatus.PLANNED);
		Project proj2 = co.createProject("EFG", qualifications2, ProjectSize.SMALL);
		proj2.setStatus(ProjectStatus.PLANNED);
		Project proj3 = co.createProject("HIJ", qualifications3, ProjectSize.SMALL);
		proj3.setStatus(ProjectStatus.PLANNED);

		Set<Qualification> worker1Qualifications = new HashSet<Qualification>();
		worker1Qualifications.add(q1);

		Worker worker1 = co.createWorker("Worker1", worker1Qualifications, 50.00);
		co.assign(worker1, proj1);
		co.assign(worker1, proj2);
		co.assign(worker1, proj3);
		assertTrue(worker1.getProjects().size() == 3);

		co.unassignAll(worker1);
		assertTrue(worker1.getProjects().isEmpty());
		assertTrue(worker1.isAvailable());
		assertTrue(co.getUnassignedWorkers().contains(worker1));
	}

	//tyler-bair (AT2, AU1, AV1, AW1)
	@Test()
	public void unassignAllT2() {
		Company co = new Company("ABC");
		Set<Qualification> qualifications = new HashSet<Qualification>();
		Qualification q1 = co.createQualification("Fork Lift");
		Qualification q2 = co.createQualification("Beef Jerky");
		qualifications.add(q1);
		qualifications.add(q2);

		Set<Qualification> qualifications2 = new HashSet<Qualification>();
		qualifications2.add(q1);
		qualifications2.add(q2);

		Set<Qualification> qualifications3 = new HashSet<Qualification>();
		qualifications3.add(q1);
		qualifications3.add(q2);

		Project proj1 = co.createProject("BCD", qualifications, ProjectSize.SMALL);
		proj1.setStatus(ProjectStatus.PLANNED);
		Project proj2 = co.createProject("EFG", qualifications2, ProjectSize.SMALL);
		proj2.setStatus(ProjectStatus.PLANNED);
		Project proj3 = co.createProject("HIJ", qualifications3, ProjectSize.SMALL);
		proj3.setStatus(ProjectStatus.PLANNED);

		Set<Qualification> worker1Qualifications = new HashSet<Qualification>();
		worker1Qualifications.add(q1);

		Worker worker1 = co.createWorker("Worker1", worker1Qualifications, 50.00);
		co.assign(worker1, proj1);
		co.assign(worker1, proj2);
		co.unassignAll(worker1);
		co.assign(worker1, proj3);

		assertFalse(worker1.getProjects().isEmpty());
		assertTrue(worker1.isAvailable());
		assertFalse(co.getUnassignedWorkers().contains(worker1));
	}

	//tyler-bair (AT1, AU2, AV1, AW1)
	@Test(expected = NullPointerException.class)
	public void unassignAllT3() {
		Company co = new Company("ABC");
		Set<Qualification> qualifications = new HashSet<Qualification>();
		Qualification q1 = co.createQualification("Fork Lift");
		Qualification q2 = co.createQualification("Beef Jerky");
		qualifications.add(q1);
		qualifications.add(q2);

		Set<Qualification> qualifications2 = new HashSet<Qualification>();
		qualifications2.add(q1);
		qualifications2.add(q2);

		Set<Qualification> qualifications3 = new HashSet<Qualification>();
		qualifications3.add(q1);
		qualifications3.add(q2);

		Project proj1 = co.createProject("BCD", qualifications, ProjectSize.SMALL);
		proj1.setStatus(ProjectStatus.PLANNED);
		Project proj2 = co.createProject("EFG", qualifications2, ProjectSize.SMALL);
		proj2.setStatus(ProjectStatus.PLANNED);
		Project proj3 = co.createProject("HIJ", qualifications3, ProjectSize.SMALL);
		proj3.setStatus(ProjectStatus.PLANNED);

		Set<Qualification> worker1Qualifications = new HashSet<Qualification>();
		worker1Qualifications.add(q1);

		Worker worker1 = null;
		co.assign(worker1, proj1);
	}

	//tyler-bair (AT1, AU1, AV2, AW1)
	@Test(expected = NullPointerException.class)
	public void unassignAllT4() {
		Company co = null;
		Set<Qualification> qualifications = new HashSet<Qualification>();
		Qualification q1 = co.createQualification("Fork Lift");
		Qualification q2 = co.createQualification("Beef Jerky");
		qualifications.add(q1);
		qualifications.add(q2);

		Set<Qualification> qualifications2 = new HashSet<Qualification>();
		qualifications2.add(q1);
		qualifications2.add(q2);

		Set<Qualification> qualifications3 = new HashSet<Qualification>();
		qualifications3.add(q1);
		qualifications3.add(q2);

		Project proj1 = co.createProject("BCD", qualifications, ProjectSize.SMALL);
		proj1.setStatus(ProjectStatus.PLANNED);
		Project proj2 = co.createProject("EFG", qualifications2, ProjectSize.SMALL);
		proj2.setStatus(ProjectStatus.PLANNED);
		Project proj3 = co.createProject("HIJ", qualifications3, ProjectSize.SMALL);
		proj3.setStatus(ProjectStatus.PLANNED);

		Set<Qualification> worker1Qualifications = new HashSet<Qualification>();
		worker1Qualifications.add(q1);

		Worker worker1 = co.createWorker("Worker1", worker1Qualifications, 50.00);;
		co.assign(worker1, proj1);
	}

	//tyler-bair (AT1, AU1, AV1, AW2)
	@Test(expected = NullPointerException.class)
	public void unassignAllT5() {
		Company co = null;
		Set<Qualification> qualifications = new HashSet<Qualification>();
		Qualification q1 = co.createQualification("Fork Lift");
		Qualification q2 = co.createQualification("Beef Jerky");
		qualifications.add(q1);
		qualifications.add(q2);

		Set<Qualification> qualifications2 = new HashSet<Qualification>();
		qualifications2.add(q1);
		qualifications2.add(q2);

		Set<Qualification> qualifications3 = new HashSet<Qualification>();
		qualifications3.add(q1);
		qualifications3.add(q2);

		Project proj1 = co.createProject("BCD", qualifications, ProjectSize.SMALL);
		proj1.setStatus(ProjectStatus.PLANNED);
		Project proj2 = co.createProject("EFG", qualifications2, ProjectSize.SMALL);
		proj2.setStatus(ProjectStatus.PLANNED);
		Project proj3 = co.createProject("HIJ", qualifications3, ProjectSize.SMALL);
		proj3.setStatus(ProjectStatus.PLANNED);

		Set<Qualification> worker1Qualifications = new HashSet<Qualification>();
		worker1Qualifications.add(q1);

		Worker worker1 = co.createWorker("Worker1", worker1Qualifications, 50.00);
		assertFalse(co.getAssignedWorkers().contains(worker1));
	}


	
	//chenaa finish T1 (X1,Y1,Z1,AA1)
    @Test()
    public void finishT1(){
        Company company = new Company("BCD");
        Qualification q = company.createQualification("ABC");
        Qualification q2 = company.createQualification("BCE");
        Set<Qualification> qualifications = new HashSet<>();
        qualifications.add(q);
        qualifications.add(q2);
        Project project = company.createProject("BCD", qualifications, ProjectSize.BIG);

        Set<Qualification> workerQualifications = new HashSet<>();
        workerQualifications.add(q);
        Worker worker = company.createWorker("Worker1", workerQualifications, 50.00);
        company.assign(worker, project);

        Set<Qualification> workerQualifications2 = new HashSet<>();
        workerQualifications2.add(q2);
        Worker worker2 = company.createWorker("Worker2", workerQualifications2, 50.00);
        company.assign(worker2, project);

        project.setStatus(ProjectStatus.ACTIVE);

        assertEquals(2, project.getWorkers().size());

        company.finish(project);

        assertEquals(ProjectStatus.FINISHED, project.getStatus());
        assertEquals(0, project.getWorkers().size());
    }

	//chenaa finish T2 (X2,Y1,Z1,AA1)
	@Test
    public void finishT2(){
        Company company = new Company("BCD");
        Qualification q = company.createQualification("ABC");
        Qualification q2 = company.createQualification("BCE");
        Set<Qualification> qualifications = new HashSet<>();
        qualifications.add(q);
        qualifications.add(q2);
        Project project = company.createProject("BCD", qualifications, ProjectSize.BIG);

        Set<Qualification> workerQualifications = new HashSet<>();
        workerQualifications.add(q);
        Worker worker = company.createWorker("Worker1", workerQualifications, 50.00);
        company.assign(worker, project);

        Set<Qualification> workerQualifications2 = new HashSet<>();
        workerQualifications2.add(q2);
        Worker worker2 = company.createWorker("Worker2", workerQualifications2, 50.00);
        company.assign(worker2, project);

        project.setStatus(ProjectStatus.SUSPENDED);

        assertEquals(2, project.getWorkers().size());

        company.finish(project);

        assertEquals(ProjectStatus.SUSPENDED, project.getStatus());
        assertEquals(2, project.getWorkers().size());
    }
	//chenaa finish T3 (X3,Y1,Z1,AA1)
	@Test
    public void finishT3(){
        Company company = new Company("BCD");
        Qualification q = company.createQualification("ABC");
        Qualification q2 = company.createQualification("BCE");
        Set<Qualification> qualifications = new HashSet<>();
        qualifications.add(q);
        qualifications.add(q2);
        Project project = company.createProject("BCD", qualifications, ProjectSize.BIG);

        Set<Qualification> workerQualifications = new HashSet<>();
        workerQualifications.add(q);
        Worker worker = company.createWorker("Worker1", workerQualifications, 50.00);
        company.assign(worker, project);

        Set<Qualification> workerQualifications2 = new HashSet<>();
        workerQualifications2.add(q2);
        Worker worker2 = company.createWorker("Worker2", workerQualifications2, 50.00);
        company.assign(worker2, project);

        project.setStatus(ProjectStatus.PLANNED);

        assertEquals(2, project.getWorkers().size());

        company.finish(project);

        assertEquals(ProjectStatus.PLANNED, project.getStatus());
        assertEquals(2, project.getWorkers().size());
    }
	//chenaa finish T4 (X4,Y1,Z1,AA1)
	@Test
    public void finishT4(){
        Company company = new Company("BCD");
        Qualification q = company.createQualification("ABC");
        Qualification q2 = company.createQualification("BCE");
        Set<Qualification> qualifications = new HashSet<>();
        qualifications.add(q);
        qualifications.add(q2);
        Project project = company.createProject("BCD", qualifications, ProjectSize.BIG);

        Set<Qualification> workerQualifications = new HashSet<>();
        workerQualifications.add(q);
        Worker worker = company.createWorker("Worker1", workerQualifications, 50.00);
        company.assign(worker, project);

        Set<Qualification> workerQualifications2 = new HashSet<>();
        workerQualifications2.add(q2);
        Worker worker2 = company.createWorker("Worker2", workerQualifications2, 50.00);
        company.assign(worker2, project);

        project.setStatus(ProjectStatus.FINISHED);

        assertEquals(2, project.getWorkers().size());

        company.finish(project);

        assertEquals(ProjectStatus.FINISHED, project.getStatus());
        assertEquals(0, project.getWorkers().size());
    }
	//chenaa finish T5 (X1,Y2,Z1,AA1)
	@Test
	public void finishT5(){
        Company company = new Company("BCD");
        Qualification q = company.createQualification("ABC");
        Set<Qualification> qualifications = new HashSet<>();
        qualifications.add(q);
        Project project = company.createProject("BCD", qualifications, ProjectSize.BIG);

        project.setStatus(ProjectStatus.ACTIVE);

        assertEquals(0, project.getWorkers().size());

        company.finish(project);

        assertEquals(ProjectStatus.FINISHED, project.getStatus());
        assertEquals(0, project.getWorkers().size());
    }
	//chenaa finish T6 (X1,Y1,Z2,AA1)
	@Test(expected = NullPointerException.class)
    public void finishT6(){
        Company company = new Company("BCD");
        Qualification q = company.createQualification("ABC");
        Qualification q2 = company.createQualification("BCE");
        Set<Qualification> qualifications = new HashSet<>();
        qualifications.add(q);
        qualifications.add(q2);
        Project project = null;

        Set<Qualification> workerQualifications = new HashSet<>();
        workerQualifications.add(q);
        Worker worker = company.createWorker("Worker1", workerQualifications, 50.00);
        company.assign(worker, project);

        Set<Qualification> workerQualifications2 = new HashSet<>();
        workerQualifications2.add(q2);
        Worker worker2 = company.createWorker("Worker2", workerQualifications2, 50.00);
        company.assign(worker2, project);

        project.setStatus(ProjectStatus.ACTIVE);
        company.finish(project);
    }
	//chenaa finish T7 (X1,Y1,Z1,AA2)
	@Test(expected = NullPointerException.class)
    public void finishT7(){
        Company company = null;
        Qualification q = company.createQualification("ABC");
        Qualification q2 = company.createQualification("BCE");
        Set<Qualification> qualifications = new HashSet<>();
        qualifications.add(q);
        qualifications.add(q2);
        Project project = company.createProject("BCD", qualifications, ProjectSize.BIG);

        Set<Qualification> workerQualifications = new HashSet<>();
        workerQualifications.add(q);
        Worker worker = company.createWorker("Worker1", workerQualifications, 50.00);
        company.assign(worker, project);

        Set<Qualification> workerQualifications2 = new HashSet<>();
        workerQualifications2.add(q2);
        Worker worker2 = company.createWorker("Worker2", workerQualifications2, 50.00);
        company.assign(worker2, project);

        project.setStatus(ProjectStatus.ACTIVE);
        company.finish(project);
    }

    // PIT  IMPROVEMENTS
    // pdj1183 toString/getName 
    @Test
    public void companyPIT1() {
        String name = "ABC";
		Company company = new Company(name);
		company.createQualification("Fork Lift");
		assertTrue(company.getName().equals(name));
        assertTrue(company.toString().equals("ABC:0:0"));
    }

    // pdj1183 getEmployed/HashCode
    @Test
    public void companyPIT2() {
        String name = "ABC";
		Company company = new Company(name);
		Qualification q = company.createQualification("Fork Lift");

        Set<Qualification> workerQualifications = new HashSet<>();
        workerQualifications.add(q);
        Worker worker = company.createWorker("Worker1", workerQualifications, 50.00);
        HashSet<Worker> workers = new HashSet<Worker>();
        workers.add(worker);

        Project project = company.createProject("BCD", workerQualifications, ProjectSize.SMALL);
		project.setStatus(ProjectStatus.PLANNED);
        HashSet<Project> projects = new HashSet<Project>();
        projects.add(project);


        assertTrue(company.getEmployedWorkers().equals(workers));
        assertTrue(company.getProjects().equals(projects));
        assertTrue(q.getWorkers().contains(worker));
    }
    
    // pdj1183 assign
    @Test
    public void companyPIT3() {
        Company company = new Company("BCD");
		Qualification q = company.createQualification("ABC");
		Set<Qualification> qualifications = new HashSet<>();
		qualifications.add(q);
		Project projectToFillWorkload = company.createProject("FillWorkload", qualifications, ProjectSize.BIG);
		projectToFillWorkload.setStatus(ProjectStatus.PLANNED);
		Project projectToFillWorkload2 = company.createProject("FillWorkload2", qualifications, ProjectSize.BIG);
		projectToFillWorkload2.setStatus(ProjectStatus.PLANNED);
		Project projectToFillWorkload3 = company.createProject("FillWorkload3", qualifications, ProjectSize.BIG);
		projectToFillWorkload3.setStatus(ProjectStatus.PLANNED);
		Project projectToFillWorkload4 = company.createProject("FillWorkload4", qualifications, ProjectSize.BIG);
		projectToFillWorkload4.setStatus(ProjectStatus.PLANNED);

		Set<Qualification> workerQualifications = new HashSet<>();
		workerQualifications.add(q);

		Worker worker = company.createWorker("Worker1", workerQualifications, 50.00);
		company.assign(worker, projectToFillWorkload);
		company.assign(worker, projectToFillWorkload2);
		company.assign(worker, projectToFillWorkload3);
        assertTrue(company.getAvailableWorkers().contains(worker));
		company.assign(worker, projectToFillWorkload4);
        assertFalse(company.getAvailableWorkers().contains(worker));
    }

    // pdj1183 unassign
    @Test
    public void companyPIT4() {
        Company co = new Company("ABC");
		Set<Qualification> qualifications = new HashSet<Qualification>();
		Qualification q1 = co.createQualification("Fork Lift");
		Qualification q2 = co.createQualification("Beef Jerky");
		qualifications.add(q1);
		qualifications.add(q2);

		Set<Qualification> qualifications2 = new HashSet<Qualification>();
		qualifications2.add(q1);
		qualifications2.add(q2);

		Set<Qualification> qualifications3 = new HashSet<Qualification>();
		qualifications3.add(q1);
		qualifications3.add(q2);

		Project proj1 = co.createProject("BCD", qualifications, ProjectSize.SMALL);
		proj1.setStatus(ProjectStatus.PLANNED);
		Project proj2 = co.createProject("EFG", qualifications2, ProjectSize.SMALL);
		proj2.setStatus(ProjectStatus.PLANNED);
		Project proj3 = co.createProject("HIJ", qualifications3, ProjectSize.SMALL);
		proj3.setStatus(ProjectStatus.PLANNED);

		Set<Qualification> worker1Qualifications = new HashSet<Qualification>();
		worker1Qualifications.add(q1);

		Set<Qualification> worker2Qualifications = new HashSet<Qualification>();
        worker2Qualifications.add(q2);

		Worker worker1 = co.createWorker("Worker1", worker1Qualifications, 50.00);
        Worker worker2 = co.createWorker("Worker2", worker2Qualifications, 50.00);
        Worker worker3 = co.createWorker("Worker2", worker2Qualifications, 50.00);
		co.assign(worker1, proj1);
		co.assign(worker1, proj2);
		co.assign(worker1, proj3);
		assertTrue(worker1.getProjects().size() == 3);
        co.assign(worker3, proj3);

        proj1.setStatus(ProjectStatus.ACTIVE);
        proj3.setStatus(ProjectStatus.ACTIVE);
        worker3.addQualification(q1);

		co.unassignAll(worker1);
		assertTrue(worker1.getProjects().isEmpty());
		assertTrue(worker1.isAvailable());
		assertTrue(co.getUnassignedWorkers().contains(worker1));
        assertTrue(proj1.getStatus().equals(ProjectStatus.SUSPENDED));
        assertTrue(proj3.getStatus().equals(ProjectStatus.ACTIVE));
        assertTrue(co.getAvailableWorkers().contains(worker1));

        co.assign(worker1, proj1);
        co.assign(worker1, proj2);
        co.assign(worker2, proj2);
        worker2.addQualification(q1);
        proj1.setStatus(ProjectStatus.ACTIVE);
        proj2.setStatus(ProjectStatus.ACTIVE);
        co.unassign(worker1, proj1);
        co.unassign(worker1, proj2);
        assertTrue(proj1.getStatus().equals(ProjectStatus.SUSPENDED));
        assertTrue(proj2.getStatus().equals(ProjectStatus.ACTIVE));
    }
}
