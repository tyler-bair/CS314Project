import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company9.getUnassignedWorkers();
        java.lang.String str13 = company9.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company9.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company9.getEmployedWorkers();
        edu.colostate.cs415.model.Qualification qualification17 = company9.createQualification("hi!:0:0:0:0:0:0");
        java.lang.String str18 = company9.getName();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet19 = company9.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet20 = company9.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet21 = company9.getEmployedWorkers();
        boolean boolean22 = company1.equals((java.lang.Object) company9);
        edu.colostate.cs415.model.Company company25 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification27 = company25.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet28 = qualification27.getWorkers();
        edu.colostate.cs415.model.Company company30 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification32 = company30.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet33 = qualification32.getWorkers();
        boolean boolean34 = qualification27.equals((java.lang.Object) qualification32);
        edu.colostate.cs415.model.Worker worker35 = null;
        qualification32.addWorker(worker35);
        edu.colostate.cs415.model.Company company38 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification40 = company38.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet41 = qualification40.getWorkers();
        boolean boolean42 = qualification32.equals((java.lang.Object) workerSet41);
        edu.colostate.cs415.model.Company company44 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet45 = company44.getEmployedWorkers();
        boolean boolean46 = qualification32.equals((java.lang.Object) company44);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet47 = company44.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet48 = company44.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet49 = company44.getProjects();
        edu.colostate.cs415.model.Qualification qualification51 = company44.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet52 = company44.getProjects();
        java.lang.String str53 = company44.getName();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet54 = company44.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize55 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project56 = company1.createProject("", qualificationSet54, projectSize55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(qualification11);
        org.junit.Assert.assertNotNull(workerSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!:0:0" + "'", str13, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertNotNull(workerSet15);
        org.junit.Assert.assertNotNull(qualification17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(qualificationSet19);
        org.junit.Assert.assertNotNull(workerSet20);
        org.junit.Assert.assertNotNull(workerSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(qualification27);
        org.junit.Assert.assertNotNull(workerSet28);
        org.junit.Assert.assertNotNull(qualification32);
        org.junit.Assert.assertNotNull(workerSet33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(qualification40);
        org.junit.Assert.assertNotNull(workerSet41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(workerSet45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(qualificationSet47);
        org.junit.Assert.assertNotNull(workerSet48);
        org.junit.Assert.assertNotNull(projectSet49);
        org.junit.Assert.assertNotNull(qualification51);
        org.junit.Assert.assertNotNull(projectSet52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(qualificationSet54);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.lang.String str5 = company1.toString();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification9 = company7.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company7.getUnassignedWorkers();
        java.lang.String str11 = company7.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet12 = company7.getProjects();
        java.lang.Object obj13 = null;
        boolean boolean14 = company7.equals(obj13);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company7.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company7.getAvailableWorkers();
        boolean boolean17 = company1.equals((java.lang.Object) company7);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet18 = company7.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet19 = company7.getProjects();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet20 = company7.getQualifications();
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!:0:0" + "'", str11, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(workerSet15);
        org.junit.Assert.assertNotNull(workerSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(workerSet18);
        org.junit.Assert.assertNotNull(projectSet19);
        org.junit.Assert.assertNotNull(qualificationSet20);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company1.getQualifications();
        java.lang.String str8 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet9 = company1.getQualifications();
        java.lang.String str10 = company1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(qualificationSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!:0:0" + "'", str8, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualificationSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!:0:0" + "'", str10, "hi!:0:0");
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnavailableWorkers();
        java.lang.String str8 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company1.getUnavailableWorkers();
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!:0:0" + "'", str8, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertNotNull(workerSet11);
        org.junit.Assert.assertNotNull(workerSet12);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = qualification11.getWorkers();
        edu.colostate.cs415.model.Company company14 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification16 = company14.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = qualification16.getWorkers();
        boolean boolean18 = qualification11.equals((java.lang.Object) qualification16);
        edu.colostate.cs415.model.Worker worker19 = null;
        qualification16.addWorker(worker19);
        edu.colostate.cs415.model.Company company22 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification24 = company22.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet25 = qualification24.getWorkers();
        boolean boolean26 = qualification16.equals((java.lang.Object) workerSet25);
        edu.colostate.cs415.model.Company company28 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet29 = company28.getEmployedWorkers();
        boolean boolean30 = qualification16.equals((java.lang.Object) company28);
        edu.colostate.cs415.model.Qualification qualification32 = company28.createQualification("hi!");
        boolean boolean33 = company1.equals((java.lang.Object) qualification32);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet34 = qualification32.getWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet35 = qualification32.getWorkers();
        edu.colostate.cs415.model.Company company38 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str39 = company38.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet40 = company38.getAssignedWorkers();
        java.lang.String str41 = company38.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet42 = company38.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet43 = company38.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet44 = company38.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet45 = company38.getQualifications();
        edu.colostate.cs415.model.Worker worker47 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet45, (double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            qualification32.removeWorker(worker47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(qualification11);
        org.junit.Assert.assertNotNull(workerSet12);
        org.junit.Assert.assertNotNull(qualification16);
        org.junit.Assert.assertNotNull(workerSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(qualification24);
        org.junit.Assert.assertNotNull(workerSet25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(workerSet29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(qualification32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(workerSet34);
        org.junit.Assert.assertNotNull(workerSet35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!:0:0:0:0" + "'", str39, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!:0:0" + "'", str41, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet42);
        org.junit.Assert.assertNotNull(projectSet43);
        org.junit.Assert.assertNotNull(workerSet44);
        org.junit.Assert.assertNotNull(qualificationSet45);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getEmployedWorkers();
        java.lang.String str7 = company1.toString();
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = qualification8.getWorkers();
        boolean boolean10 = qualification3.equals((java.lang.Object) qualification8);
        java.lang.String str11 = qualification8.toString();
        edu.colostate.cs415.model.Company company13 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification15 = company13.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = qualification15.getWorkers();
        edu.colostate.cs415.model.Company company18 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification20 = company18.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet21 = qualification20.getWorkers();
        boolean boolean22 = qualification15.equals((java.lang.Object) qualification20);
        edu.colostate.cs415.model.Worker worker23 = null;
        qualification15.addWorker(worker23);
        java.lang.String str25 = qualification15.toString();
        boolean boolean26 = qualification8.equals((java.lang.Object) str25);
        java.lang.String str27 = qualification8.toString();
        edu.colostate.cs415.model.Company company29 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification31 = company29.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO32 = qualification31.toDTO();
        boolean boolean34 = qualification31.equals((java.lang.Object) 10.0d);
        edu.colostate.cs415.model.Company company36 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification38 = company36.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet39 = qualification38.getWorkers();
        edu.colostate.cs415.model.Company company41 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification43 = company41.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet44 = qualification43.getWorkers();
        boolean boolean45 = qualification38.equals((java.lang.Object) qualification43);
        boolean boolean46 = qualification31.equals((java.lang.Object) boolean45);
        boolean boolean47 = qualification8.equals((java.lang.Object) boolean45);
        edu.colostate.cs415.model.Company company49 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet50 = company49.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet51 = company49.getProjects();
        edu.colostate.cs415.model.Qualification qualification53 = company49.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet54 = company49.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet55 = company49.getProjects();
        java.lang.String str56 = company49.toString();
        java.lang.String str57 = company49.getName();
        edu.colostate.cs415.model.Qualification qualification59 = company49.createQualification("hi!");
        boolean boolean60 = qualification8.equals((java.lang.Object) qualification59);
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO61 = qualification8.toDTO();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(qualification15);
        org.junit.Assert.assertNotNull(workerSet16);
        org.junit.Assert.assertNotNull(qualification20);
        org.junit.Assert.assertNotNull(workerSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(qualification31);
        org.junit.Assert.assertNotNull(qualificationDTO32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(qualification38);
        org.junit.Assert.assertNotNull(workerSet39);
        org.junit.Assert.assertNotNull(qualification43);
        org.junit.Assert.assertNotNull(workerSet44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(workerSet50);
        org.junit.Assert.assertNotNull(projectSet51);
        org.junit.Assert.assertNotNull(qualification53);
        org.junit.Assert.assertNotNull(projectSet54);
        org.junit.Assert.assertNotNull(projectSet55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!:0:0" + "'", str56, "hi!:0:0");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(qualification59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(qualificationDTO61);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet2 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = qualification8.getWorkers();
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = qualification13.getWorkers();
        boolean boolean15 = qualification8.equals((java.lang.Object) qualification13);
        edu.colostate.cs415.model.Worker worker16 = null;
        qualification8.addWorker(worker16);
        java.lang.String str18 = qualification8.toString();
        boolean boolean19 = company1.equals((java.lang.Object) qualification8);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet20 = qualification8.getWorkers();
        java.lang.String str21 = qualification8.toString();
        edu.colostate.cs415.model.Company company23 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str24 = company23.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet25 = company23.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet26 = company23.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet27 = company23.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet28 = company23.getAssignedWorkers();
        boolean boolean29 = qualification8.equals((java.lang.Object) company23);
        org.junit.Assert.assertNotNull(projectSet2);
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(qualification13);
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(workerSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!:0:0" + "'", str24, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet25);
        org.junit.Assert.assertNotNull(workerSet26);
        org.junit.Assert.assertNotNull(workerSet27);
        org.junit.Assert.assertNotNull(workerSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet3 = company1.getQualifications();
        java.lang.String str4 = company1.getName();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company6.getUnassignedWorkers();
        java.lang.String str10 = company6.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company6.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company6.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company6.getUnassignedWorkers();
        boolean boolean14 = company1.equals((java.lang.Object) company6);
        java.util.Set<edu.colostate.cs415.model.Project> projectSet15 = company6.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company6.getAvailableWorkers();
        java.lang.String str17 = company6.getName();
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification22 = company20.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = company20.getUnassignedWorkers();
        java.lang.String str24 = company20.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet25 = company20.getProjects();
        java.lang.String str26 = company20.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet27 = company20.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet28 = company20.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company30 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification32 = company30.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet33 = qualification32.getWorkers();
        edu.colostate.cs415.model.Company company35 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification37 = company35.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet38 = qualification37.getWorkers();
        boolean boolean39 = qualification32.equals((java.lang.Object) qualification37);
        edu.colostate.cs415.model.Worker worker40 = null;
        qualification37.addWorker(worker40);
        edu.colostate.cs415.model.Company company43 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification45 = company43.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet46 = qualification45.getWorkers();
        boolean boolean47 = qualification37.equals((java.lang.Object) workerSet46);
        edu.colostate.cs415.model.Company company49 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet50 = company49.getEmployedWorkers();
        boolean boolean51 = qualification37.equals((java.lang.Object) company49);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet52 = company49.getQualifications();
        boolean boolean53 = company20.equals((java.lang.Object) company49);
        java.lang.String str54 = company20.getName();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet55 = company20.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker57 = company6.createWorker("", qualificationSet55, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Worker name cannot be empty or null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualificationSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!:0:0" + "'", str4, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!:0:0" + "'", str10, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet11);
        org.junit.Assert.assertNotNull(workerSet12);
        org.junit.Assert.assertNotNull(workerSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(projectSet15);
        org.junit.Assert.assertNotNull(workerSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(qualification22);
        org.junit.Assert.assertNotNull(workerSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!:0:0" + "'", str24, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!:0:0" + "'", str26, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet27);
        org.junit.Assert.assertNotNull(workerSet28);
        org.junit.Assert.assertNotNull(qualification32);
        org.junit.Assert.assertNotNull(workerSet33);
        org.junit.Assert.assertNotNull(qualification37);
        org.junit.Assert.assertNotNull(workerSet38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(qualification45);
        org.junit.Assert.assertNotNull(workerSet46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(workerSet50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(qualificationSet52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertNotNull(qualificationSet55);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnassignedWorkers();
        edu.colostate.cs415.model.Qualification qualification7 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str11 = company10.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company10.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet13 = company10.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet14 = company10.getProjects();
        java.lang.Object obj15 = null;
        boolean boolean16 = company10.equals(obj15);
        edu.colostate.cs415.model.Qualification qualification18 = company10.createQualification("hi!");
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification22 = company20.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = company20.getUnassignedWorkers();
        java.lang.String str24 = company20.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet25 = company20.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet26 = company20.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet27 = company20.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet28 = company20.getProjects();
        boolean boolean29 = company10.equals((java.lang.Object) projectSet28);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet30 = company10.getEmployedWorkers();
        boolean boolean31 = company1.equals((java.lang.Object) company10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(qualification7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!:0:0" + "'", str11, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet12);
        org.junit.Assert.assertNotNull(projectSet13);
        org.junit.Assert.assertNotNull(projectSet14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(qualification18);
        org.junit.Assert.assertNotNull(qualification22);
        org.junit.Assert.assertNotNull(workerSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!:0:0" + "'", str24, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet25);
        org.junit.Assert.assertNotNull(workerSet26);
        org.junit.Assert.assertNotNull(workerSet27);
        org.junit.Assert.assertNotNull(projectSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(workerSet30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Project project7 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(workerSet6);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str10 = company9.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company9.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification13 = company9.createQualification("hi!");
        java.lang.Object obj14 = null;
        boolean boolean15 = company9.equals(obj14);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company9.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet17 = company9.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet18 = company9.getProjects();
        boolean boolean19 = company1.equals((java.lang.Object) company9);
        edu.colostate.cs415.model.Project project20 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!:0:0:0:0" + "'", str10, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet11);
        org.junit.Assert.assertNotNull(qualification13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(workerSet16);
        org.junit.Assert.assertNotNull(qualificationSet17);
        org.junit.Assert.assertNotNull(projectSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnavailableWorkers();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(workerSet7);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification8 = company1.createQualification("hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(qualification8);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet8 = company1.getProjects();
        java.lang.String str9 = company1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0:0:0" + "'", str7, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(projectSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!:0:0:0:0" + "'", str9, "hi!:0:0:0:0");
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO4 = qualification3.toDTO();
        boolean boolean6 = qualification3.equals((java.lang.Object) 10.0d);
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification10 = company8.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = qualification10.getWorkers();
        edu.colostate.cs415.model.Company company13 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification15 = company13.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = qualification15.getWorkers();
        boolean boolean17 = qualification10.equals((java.lang.Object) qualification15);
        boolean boolean18 = qualification3.equals((java.lang.Object) boolean17);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet19 = qualification3.getWorkers();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO20 = qualification3.toDTO();
        java.lang.String str21 = qualification3.toString();
        edu.colostate.cs415.model.Company company23 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str24 = company23.toString();
        java.lang.String str25 = company23.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet26 = company23.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet27 = company23.getProjects();
        java.lang.String str28 = company23.getName();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet29 = company23.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet30 = company23.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet31 = company23.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet32 = company23.getQualifications();
        boolean boolean33 = qualification3.equals((java.lang.Object) company23);
        java.lang.String str34 = qualification3.toString();
        edu.colostate.cs415.model.Company company36 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet37 = company36.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet38 = company36.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet39 = company36.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet40 = company36.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet41 = company36.getUnavailableWorkers();
        boolean boolean42 = qualification3.equals((java.lang.Object) company36);
        edu.colostate.cs415.model.Company company44 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification46 = company44.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet47 = qualification46.getWorkers();
        edu.colostate.cs415.model.Company company49 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification51 = company49.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet52 = qualification51.getWorkers();
        boolean boolean53 = qualification46.equals((java.lang.Object) qualification51);
        java.lang.String str54 = qualification46.toString();
        java.lang.String str55 = qualification46.toString();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO56 = qualification46.toDTO();
        boolean boolean57 = company36.equals((java.lang.Object) qualificationDTO56);
        edu.colostate.cs415.model.Company company60 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification62 = company60.createQualification("hi!");
        boolean boolean64 = company60.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet65 = company60.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet66 = company60.getQualifications();
        edu.colostate.cs415.model.Worker worker68 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet66, (double) 'a');
        edu.colostate.cs415.model.Project project69 = null;
        // The following exception was thrown during execution in test generation
        try {
            company36.unassign(worker68, project69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(qualificationDTO4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(qualification10);
        org.junit.Assert.assertNotNull(workerSet11);
        org.junit.Assert.assertNotNull(qualification15);
        org.junit.Assert.assertNotNull(workerSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(workerSet19);
        org.junit.Assert.assertNotNull(qualificationDTO20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!:0:0:0:0" + "'", str24, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!:0:0:0:0" + "'", str25, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet26);
        org.junit.Assert.assertNotNull(projectSet27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!:0:0" + "'", str28, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet29);
        org.junit.Assert.assertNotNull(workerSet30);
        org.junit.Assert.assertNotNull(workerSet31);
        org.junit.Assert.assertNotNull(qualificationSet32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(workerSet37);
        org.junit.Assert.assertNotNull(workerSet38);
        org.junit.Assert.assertNotNull(workerSet39);
        org.junit.Assert.assertNotNull(workerSet40);
        org.junit.Assert.assertNotNull(workerSet41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(qualification46);
        org.junit.Assert.assertNotNull(workerSet47);
        org.junit.Assert.assertNotNull(qualification51);
        org.junit.Assert.assertNotNull(workerSet52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(qualificationDTO56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(qualification62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(qualificationSet65);
        org.junit.Assert.assertNotNull(qualificationSet66);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Worker worker10 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassignAll(worker10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(qualificationSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(workerSet9);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet5 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company1.getQualifications();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(projectSet5);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(qualificationSet7);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.lang.String str5 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getUnassignedWorkers();
        java.lang.String str7 = company1.getName();
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0:0:0");
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str12 = company11.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet13 = company11.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company11.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet15 = company11.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company11.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet17 = company11.getProjects();
        java.lang.String str18 = company11.getName();
        boolean boolean19 = qualification9.equals((java.lang.Object) company11);
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO20 = qualification9.toDTO();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!:0:0" + "'", str12, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet13);
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertNotNull(qualificationSet15);
        org.junit.Assert.assertNotNull(workerSet16);
        org.junit.Assert.assertNotNull(projectSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(qualificationDTO20);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification4 = company1.createQualification("hi!:0:0:0:0");
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker9 = company1.createWorker("hi!:0:0", qualificationSet7, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be empty or null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet9 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet10 = company1.getProjects();
        edu.colostate.cs415.model.Company company13 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company13.getUnavailableWorkers();
        boolean boolean16 = company13.equals((java.lang.Object) "");
        edu.colostate.cs415.model.Qualification qualification18 = company13.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet19 = company13.getProjects();
        java.lang.String str20 = company13.getName();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet21 = company13.getQualifications();
        edu.colostate.cs415.model.Worker worker23 = company1.createWorker("hi!", qualificationSet21, (double) 1);
        edu.colostate.cs415.model.Project project24 = null;
        // The following exception was thrown during execution in test generation
        try {
            worker23.addProject(project24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: project can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(qualificationSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(qualificationSet9);
        org.junit.Assert.assertNotNull(projectSet10);
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(qualification18);
        org.junit.Assert.assertNotNull(projectSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(qualificationSet21);
        org.junit.Assert.assertNotNull(worker23);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification14 = company12.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company12.getUnassignedWorkers();
        java.lang.String str16 = company12.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet17 = company12.getProjects();
        java.lang.String str18 = company12.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet19 = company12.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet20 = company12.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company22 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification24 = company22.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet25 = qualification24.getWorkers();
        edu.colostate.cs415.model.Company company27 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification29 = company27.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet30 = qualification29.getWorkers();
        boolean boolean31 = qualification24.equals((java.lang.Object) qualification29);
        edu.colostate.cs415.model.Worker worker32 = null;
        qualification29.addWorker(worker32);
        edu.colostate.cs415.model.Company company35 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification37 = company35.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet38 = qualification37.getWorkers();
        boolean boolean39 = qualification29.equals((java.lang.Object) workerSet38);
        edu.colostate.cs415.model.Company company41 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet42 = company41.getEmployedWorkers();
        boolean boolean43 = qualification29.equals((java.lang.Object) company41);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet44 = company41.getQualifications();
        boolean boolean45 = company12.equals((java.lang.Object) company41);
        java.lang.Class<?> wildcardClass46 = company41.getClass();
        boolean boolean47 = company1.equals((java.lang.Object) company41);
        edu.colostate.cs415.model.Company company50 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str51 = company50.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet52 = company50.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification54 = company50.createQualification("hi!");
        java.lang.Object obj55 = null;
        boolean boolean56 = company50.equals(obj55);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet57 = company50.getQualifications();
        edu.colostate.cs415.model.Worker worker59 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet57, (double) (byte) 10);
        edu.colostate.cs415.model.Project project60 = null;
        // The following exception was thrown during execution in test generation
        try {
            company41.assign(worker59, project60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertNotNull(qualification14);
        org.junit.Assert.assertNotNull(workerSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!:0:0" + "'", str16, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!:0:0" + "'", str18, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet19);
        org.junit.Assert.assertNotNull(workerSet20);
        org.junit.Assert.assertNotNull(qualification24);
        org.junit.Assert.assertNotNull(workerSet25);
        org.junit.Assert.assertNotNull(qualification29);
        org.junit.Assert.assertNotNull(workerSet30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(qualification37);
        org.junit.Assert.assertNotNull(workerSet38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(workerSet42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(qualificationSet44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!:0:0:0:0" + "'", str51, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet52);
        org.junit.Assert.assertNotNull(qualification54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(qualificationSet57);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = qualification8.getWorkers();
        boolean boolean10 = qualification3.equals((java.lang.Object) qualification8);
        java.lang.String str11 = qualification8.toString();
        edu.colostate.cs415.model.Company company13 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification15 = company13.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = qualification15.getWorkers();
        edu.colostate.cs415.model.Company company18 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification20 = company18.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet21 = qualification20.getWorkers();
        boolean boolean22 = qualification15.equals((java.lang.Object) qualification20);
        edu.colostate.cs415.model.Worker worker23 = null;
        qualification15.addWorker(worker23);
        java.lang.String str25 = qualification15.toString();
        boolean boolean26 = qualification8.equals((java.lang.Object) str25);
        boolean boolean28 = qualification8.equals((java.lang.Object) (byte) 10);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet29 = qualification8.getWorkers();
        edu.colostate.cs415.model.Company company31 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification33 = company31.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet34 = company31.getUnassignedWorkers();
        java.lang.String str35 = company31.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet36 = company31.getProjects();
        java.lang.String str37 = company31.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet38 = company31.getEmployedWorkers();
        edu.colostate.cs415.model.Company company40 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str41 = company40.toString();
        java.lang.String str42 = company40.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet43 = company40.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet44 = company40.getUnavailableWorkers();
        boolean boolean45 = company31.equals((java.lang.Object) company40);
        boolean boolean46 = qualification8.equals((java.lang.Object) boolean45);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet47 = qualification8.getWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet48 = qualification8.getWorkers();
        edu.colostate.cs415.model.Company company50 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification52 = company50.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet53 = company50.getUnassignedWorkers();
        java.lang.String str54 = company50.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet55 = company50.getProjects();
        java.lang.String str56 = company50.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet57 = company50.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet58 = company50.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company60 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification62 = company60.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet63 = qualification62.getWorkers();
        edu.colostate.cs415.model.Company company65 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification67 = company65.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet68 = qualification67.getWorkers();
        boolean boolean69 = qualification62.equals((java.lang.Object) qualification67);
        edu.colostate.cs415.model.Worker worker70 = null;
        qualification67.addWorker(worker70);
        edu.colostate.cs415.model.Company company73 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification75 = company73.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet76 = qualification75.getWorkers();
        boolean boolean77 = qualification67.equals((java.lang.Object) workerSet76);
        edu.colostate.cs415.model.Company company79 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet80 = company79.getEmployedWorkers();
        boolean boolean81 = qualification67.equals((java.lang.Object) company79);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet82 = company79.getQualifications();
        boolean boolean83 = company50.equals((java.lang.Object) company79);
        edu.colostate.cs415.model.Company company86 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification88 = company86.createQualification("hi!");
        boolean boolean90 = company86.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet91 = company86.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet92 = company86.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet93 = company86.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet94 = company86.getProjects();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet95 = company86.getQualifications();
        edu.colostate.cs415.model.Worker worker97 = company50.createWorker("hi!", qualificationSet95, (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            qualification8.removeWorker(worker97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(qualification15);
        org.junit.Assert.assertNotNull(workerSet16);
        org.junit.Assert.assertNotNull(qualification20);
        org.junit.Assert.assertNotNull(workerSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(workerSet29);
        org.junit.Assert.assertNotNull(qualification33);
        org.junit.Assert.assertNotNull(workerSet34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!:0:0" + "'", str35, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!:0:0" + "'", str37, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!:0:0:0:0" + "'", str41, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!:0:0:0:0" + "'", str42, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet43);
        org.junit.Assert.assertNotNull(workerSet44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(workerSet47);
        org.junit.Assert.assertNotNull(workerSet48);
        org.junit.Assert.assertNotNull(qualification52);
        org.junit.Assert.assertNotNull(workerSet53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!:0:0" + "'", str54, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!:0:0" + "'", str56, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet57);
        org.junit.Assert.assertNotNull(workerSet58);
        org.junit.Assert.assertNotNull(qualification62);
        org.junit.Assert.assertNotNull(workerSet63);
        org.junit.Assert.assertNotNull(qualification67);
        org.junit.Assert.assertNotNull(workerSet68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(qualification75);
        org.junit.Assert.assertNotNull(workerSet76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(workerSet80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(qualificationSet82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(qualification88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(qualificationSet91);
        org.junit.Assert.assertNotNull(workerSet92);
        org.junit.Assert.assertNotNull(workerSet93);
        org.junit.Assert.assertNotNull(projectSet94);
        org.junit.Assert.assertNotNull(qualificationSet95);
        org.junit.Assert.assertNotNull(worker97);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet1 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker3 = new edu.colostate.cs415.model.Worker("", qualificationSet1, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Worker name cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet9 = company1.getProjects();
        edu.colostate.cs415.model.Project project10 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(qualificationSet7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(projectSet9);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Qualification qualification10 = company1.createQualification("hi!:0:0:0:0");
        java.lang.String str11 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker15 = company1.createWorker("hi!:0:0:0:0:0:0", qualificationSet13, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be empty or null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(qualification10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!:0:0" + "'", str11, "hi!:0:0");
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str9 = company8.getName();
        java.lang.String str10 = company8.getName();
        edu.colostate.cs415.model.Qualification qualification12 = company8.createQualification("hi!:0:0:0:0:0:0");
        boolean boolean13 = company1.equals((java.lang.Object) qualification12);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = qualification12.getWorkers();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertNotNull(qualificationSet6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!:0:0" + "'", str9, "hi!:0:0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!:0:0" + "'", str10, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualification12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(workerSet14);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getAssignedWorkers();
        boolean boolean4 = company1.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company1.getQualifications();
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0");
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str13 = company12.toString();
        java.lang.String str14 = company12.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company12.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company12.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet17 = company12.getProjects();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet18 = company12.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker20 = company1.createWorker("hi!:0:0:0:0", qualificationSet18, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be empty or null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(qualificationSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!:0:0:0:0" + "'", str13, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!:0:0:0:0" + "'", str14, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet15);
        org.junit.Assert.assertNotNull(workerSet16);
        org.junit.Assert.assertNotNull(projectSet17);
        org.junit.Assert.assertNotNull(qualificationSet18);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.lang.String str6 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getUnavailableWorkers();
        java.lang.String str10 = company1.getName();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!:0:0" + "'", str6, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize7 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project8 = new edu.colostate.cs415.model.Project("hi!:0:0:0:0", qualificationSet6, projectSize7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0" + "'", str3, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(qualificationSet6);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet4 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnassignedWorkers();
        edu.colostate.cs415.model.Project project6 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(qualificationSet4);
        org.junit.Assert.assertNotNull(workerSet5);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.lang.String str5 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getUnassignedWorkers();
        java.lang.String str7 = company1.getName();
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = qualification9.getWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = qualification9.getWorkers();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertNotNull(workerSet11);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet4 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet8 = company7.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company7.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet10 = company7.getProjects();
        boolean boolean11 = company1.equals((java.lang.Object) projectSet10);
        edu.colostate.cs415.model.Qualification qualification13 = company1.createQualification("hi!");
        java.lang.String str14 = qualification13.toString();
        java.lang.Object obj15 = null;
        boolean boolean16 = qualification13.equals(obj15);
        edu.colostate.cs415.model.Company company18 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet19 = company18.getUnavailableWorkers();
        boolean boolean21 = company18.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet22 = company18.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet23 = company18.getQualifications();
        java.lang.String str24 = company18.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet25 = company18.getProjects();
        java.lang.String str26 = company18.getName();
        java.lang.String str27 = company18.getName();
        java.lang.String str28 = company18.toString();
        boolean boolean29 = qualification13.equals((java.lang.Object) company18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(qualificationSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(projectSet8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(projectSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(qualification13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(workerSet19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(workerSet22);
        org.junit.Assert.assertNotNull(qualificationSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!:0:0" + "'", str24, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!:0:0" + "'", str28, "hi!:0:0");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        boolean boolean4 = company1.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet5 = company1.getProjects();
        boolean boolean7 = company1.equals((java.lang.Object) (short) -1);
        java.lang.String str8 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification10 = new edu.colostate.cs415.model.Qualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO11 = qualification10.toDTO();
        boolean boolean12 = company1.equals((java.lang.Object) qualification10);
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(projectSet5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!:0:0" + "'", str8, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualificationDTO11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getEmployedWorkers();
        boolean boolean8 = company1.equals((java.lang.Object) 10);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getUnavailableWorkers();
        java.lang.String str10 = company1.getName();
        java.lang.Class<?> wildcardClass11 = company1.getClass();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Company company5 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company5.getProjects();
        boolean boolean7 = company1.equals((java.lang.Object) company5);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.lang.String str9 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company1.getQualifications();
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company12.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company12.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet15 = company12.getQualifications();
        edu.colostate.cs415.model.Company company17 = new edu.colostate.cs415.model.Company("hi!");
        boolean boolean18 = company12.equals((java.lang.Object) "hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet19 = company12.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet20 = company12.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet21 = company12.getEmployedWorkers();
        boolean boolean22 = company1.equals((java.lang.Object) workerSet21);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!:0:0" + "'", str9, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualificationSet10);
        org.junit.Assert.assertNotNull(workerSet13);
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertNotNull(qualificationSet15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(workerSet19);
        org.junit.Assert.assertNotNull(workerSet20);
        org.junit.Assert.assertNotNull(workerSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet2 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        edu.colostate.cs415.model.Qualification qualification6 = company1.createQualification("hi!:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAssignedWorkers();
        java.lang.String str9 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company1.getUnavailableWorkers();
        org.junit.Assert.assertNotNull(projectSet2);
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(qualification6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!:0:0:0:0" + "'", str9, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet10);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet11 = company1.getProjects();
        edu.colostate.cs415.model.Project project12 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertNotNull(projectSet11);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = qualification8.getWorkers();
        boolean boolean10 = qualification3.equals((java.lang.Object) qualification8);
        edu.colostate.cs415.model.Worker worker11 = null;
        qualification8.addWorker(worker11);
        edu.colostate.cs415.model.Company company14 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification16 = company14.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = qualification16.getWorkers();
        boolean boolean18 = qualification8.equals((java.lang.Object) workerSet17);
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet21 = company20.getEmployedWorkers();
        boolean boolean22 = qualification8.equals((java.lang.Object) company20);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = company20.getEmployedWorkers();
        edu.colostate.cs415.model.Qualification qualification25 = company20.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet26 = qualification25.getWorkers();
        edu.colostate.cs415.model.Company company28 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str29 = company28.toString();
        java.lang.String str30 = company28.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet31 = company28.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet32 = company28.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet33 = company28.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet34 = company28.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet35 = company28.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet36 = company28.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet37 = company28.getUnassignedWorkers();
        boolean boolean38 = qualification25.equals((java.lang.Object) workerSet37);
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(qualification16);
        org.junit.Assert.assertNotNull(workerSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(workerSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(workerSet23);
        org.junit.Assert.assertNotNull(qualification25);
        org.junit.Assert.assertNotNull(workerSet26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!:0:0:0:0" + "'", str29, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!:0:0:0:0" + "'", str30, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet31);
        org.junit.Assert.assertNotNull(workerSet32);
        org.junit.Assert.assertNotNull(workerSet33);
        org.junit.Assert.assertNotNull(qualificationSet34);
        org.junit.Assert.assertNotNull(workerSet35);
        org.junit.Assert.assertNotNull(projectSet36);
        org.junit.Assert.assertNotNull(workerSet37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.lang.String str4 = company1.getName();
        java.lang.String str5 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification10 = company8.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company8.getUnassignedWorkers();
        java.lang.String str12 = company8.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet13 = company8.getProjects();
        java.lang.String str14 = company8.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company8.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company8.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company18 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification20 = company18.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet21 = qualification20.getWorkers();
        edu.colostate.cs415.model.Company company23 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification25 = company23.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet26 = qualification25.getWorkers();
        boolean boolean27 = qualification20.equals((java.lang.Object) qualification25);
        edu.colostate.cs415.model.Worker worker28 = null;
        qualification25.addWorker(worker28);
        edu.colostate.cs415.model.Company company31 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification33 = company31.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet34 = qualification33.getWorkers();
        boolean boolean35 = qualification25.equals((java.lang.Object) workerSet34);
        edu.colostate.cs415.model.Company company37 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet38 = company37.getEmployedWorkers();
        boolean boolean39 = qualification25.equals((java.lang.Object) company37);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet40 = company37.getQualifications();
        boolean boolean41 = company8.equals((java.lang.Object) company37);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet42 = company37.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet43 = company37.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet44 = company37.getAvailableWorkers();
        boolean boolean45 = company1.equals((java.lang.Object) company37);
        edu.colostate.cs415.model.Company company48 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str49 = company48.toString();
        java.lang.String str50 = company48.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet51 = company48.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet52 = company48.getProjects();
        java.lang.String str53 = company48.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet54 = company48.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet55 = company48.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize56 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project57 = company37.createProject("hi!", qualificationSet55, projectSize56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!:0:0" + "'", str4, "hi!:0:0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(qualification10);
        org.junit.Assert.assertNotNull(workerSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!:0:0" + "'", str12, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!:0:0" + "'", str14, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet15);
        org.junit.Assert.assertNotNull(workerSet16);
        org.junit.Assert.assertNotNull(qualification20);
        org.junit.Assert.assertNotNull(workerSet21);
        org.junit.Assert.assertNotNull(qualification25);
        org.junit.Assert.assertNotNull(workerSet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(qualification33);
        org.junit.Assert.assertNotNull(workerSet34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(workerSet38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(qualificationSet40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(workerSet42);
        org.junit.Assert.assertNotNull(projectSet43);
        org.junit.Assert.assertNotNull(workerSet44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!:0:0:0:0" + "'", str49, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!:0:0:0:0" + "'", str50, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet51);
        org.junit.Assert.assertNotNull(projectSet52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!:0:0:0:0" + "'", str53, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet54);
        org.junit.Assert.assertNotNull(qualificationSet55);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet5 = company1.getProjects();
        java.lang.Object obj6 = null;
        boolean boolean7 = company1.equals(obj6);
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = qualification11.getWorkers();
        edu.colostate.cs415.model.Company company14 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification16 = company14.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = qualification16.getWorkers();
        boolean boolean18 = qualification11.equals((java.lang.Object) qualification16);
        boolean boolean19 = company1.equals((java.lang.Object) qualification16);
        edu.colostate.cs415.model.Company company21 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification23 = company21.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet24 = company21.getUnassignedWorkers();
        java.lang.String str25 = company21.toString();
        java.lang.String str26 = company21.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet27 = company21.getAvailableWorkers();
        edu.colostate.cs415.model.Qualification qualification29 = company21.createQualification("hi!:0:0:0:0");
        java.lang.String str30 = qualification29.toString();
        boolean boolean31 = company1.equals((java.lang.Object) str30);
        edu.colostate.cs415.model.Company company35 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str36 = company35.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet37 = company35.getAssignedWorkers();
        java.lang.String str38 = company35.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet39 = company35.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet40 = company35.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet41 = company35.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet42 = company35.getQualifications();
        edu.colostate.cs415.model.Worker worker44 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet42, (double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker46 = company1.createWorker("", qualificationSet42, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Worker name cannot be empty or null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(projectSet5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(qualification11);
        org.junit.Assert.assertNotNull(workerSet12);
        org.junit.Assert.assertNotNull(qualification16);
        org.junit.Assert.assertNotNull(workerSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(qualification23);
        org.junit.Assert.assertNotNull(workerSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!:0:0" + "'", str25, "hi!:0:0");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!:0:0" + "'", str26, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet27);
        org.junit.Assert.assertNotNull(qualification29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!:0:0:0:0" + "'", str30, "hi!:0:0:0:0");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!:0:0:0:0" + "'", str36, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!:0:0" + "'", str38, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet39);
        org.junit.Assert.assertNotNull(projectSet40);
        org.junit.Assert.assertNotNull(workerSet41);
        org.junit.Assert.assertNotNull(qualificationSet42);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getAvailableWorkers();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet8 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getAvailableWorkers();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet8);
        org.junit.Assert.assertNotNull(workerSet9);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company1.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Description cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertNotNull(qualificationSet7);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company1.getUnavailableWorkers();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(qualificationSet7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(workerSet10);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0:0:0:0:0");
        java.lang.String str10 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet12 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Company company16 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification18 = company16.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet19 = company16.getUnassignedWorkers();
        java.lang.String str20 = company16.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet21 = company16.getProjects();
        java.lang.String str22 = company16.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = company16.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet24 = company16.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet25 = company16.getProjects();
        java.lang.String str26 = company16.getName();
        edu.colostate.cs415.model.Company company28 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet29 = company28.getUnavailableWorkers();
        boolean boolean31 = company28.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet32 = company28.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet33 = company28.getProjects();
        boolean boolean34 = company16.equals((java.lang.Object) projectSet33);
        java.util.Set<edu.colostate.cs415.model.Project> projectSet35 = company16.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet36 = company16.getUnassignedWorkers();
        java.lang.String str37 = company16.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet38 = company16.getProjects();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet39 = company16.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize40 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project41 = company1.createProject("", qualificationSet39, projectSize40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(qualificationSet11);
        org.junit.Assert.assertNotNull(projectSet12);
        org.junit.Assert.assertNotNull(workerSet13);
        org.junit.Assert.assertNotNull(qualification18);
        org.junit.Assert.assertNotNull(workerSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!:0:0" + "'", str20, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!:0:0" + "'", str22, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet23);
        org.junit.Assert.assertNotNull(workerSet24);
        org.junit.Assert.assertNotNull(projectSet25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(workerSet29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(workerSet32);
        org.junit.Assert.assertNotNull(projectSet33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(projectSet35);
        org.junit.Assert.assertNotNull(workerSet36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!:0:0" + "'", str37, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet38);
        org.junit.Assert.assertNotNull(qualificationSet39);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getAssignedWorkers();
        boolean boolean4 = company1.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company1.getQualifications();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification9 = company7.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = qualification9.getWorkers();
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification14 = company12.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = qualification14.getWorkers();
        boolean boolean16 = qualification9.equals((java.lang.Object) qualification14);
        edu.colostate.cs415.model.Worker worker17 = null;
        qualification14.addWorker(worker17);
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification22 = company20.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = qualification22.getWorkers();
        boolean boolean24 = qualification14.equals((java.lang.Object) workerSet23);
        edu.colostate.cs415.model.Company company26 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet27 = company26.getEmployedWorkers();
        boolean boolean28 = qualification14.equals((java.lang.Object) company26);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet29 = company26.getEmployedWorkers();
        boolean boolean30 = company1.equals((java.lang.Object) company26);
        edu.colostate.cs415.model.Project project31 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(qualificationSet5);
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertNotNull(qualification14);
        org.junit.Assert.assertNotNull(workerSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(qualification22);
        org.junit.Assert.assertNotNull(workerSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(workerSet27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(workerSet29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet9 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Project project12 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(qualificationSet7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(projectSet9);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertNotNull(workerSet11);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet5 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company1.getQualifications();
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company1.getUnassignedWorkers();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(projectSet5);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(qualificationSet7);
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertNotNull(workerSet11);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.getName();
        edu.colostate.cs415.model.Qualification qualification4 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnassignedWorkers();
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company1.getQualifications();
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification12 = company10.createQualification("hi!");
        boolean boolean14 = company10.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet15 = company10.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet16 = company10.getQualifications();
        java.lang.String str17 = company10.getName();
        edu.colostate.cs415.model.Qualification qualification19 = company10.createQualification("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet20 = company10.getQualifications();
        edu.colostate.cs415.model.Worker worker22 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet20, (double) 1L);
        edu.colostate.cs415.model.Project project23 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker22, project23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!:0:0" + "'", str6, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualificationSet7);
        org.junit.Assert.assertNotNull(qualification12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(qualificationSet15);
        org.junit.Assert.assertNotNull(qualificationSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(qualification19);
        org.junit.Assert.assertNotNull(qualificationSet20);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = qualification8.getWorkers();
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = qualification13.getWorkers();
        boolean boolean15 = qualification8.equals((java.lang.Object) qualification13);
        java.lang.String str16 = qualification13.toString();
        edu.colostate.cs415.model.Company company18 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification20 = company18.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet21 = qualification20.getWorkers();
        edu.colostate.cs415.model.Company company23 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification25 = company23.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet26 = qualification25.getWorkers();
        boolean boolean27 = qualification20.equals((java.lang.Object) qualification25);
        edu.colostate.cs415.model.Worker worker28 = null;
        qualification20.addWorker(worker28);
        java.lang.String str30 = qualification20.toString();
        boolean boolean31 = qualification13.equals((java.lang.Object) str30);
        java.lang.String str32 = qualification13.toString();
        boolean boolean33 = company1.equals((java.lang.Object) str32);
        edu.colostate.cs415.model.Company company36 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification38 = company36.createQualification("hi!");
        boolean boolean40 = company36.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet41 = company36.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet42 = company36.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker44 = company1.createWorker("hi!:0:0", qualificationSet42, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualification is not in the company set");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(qualification13);
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(qualification20);
        org.junit.Assert.assertNotNull(workerSet21);
        org.junit.Assert.assertNotNull(qualification25);
        org.junit.Assert.assertNotNull(workerSet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(qualification38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(qualificationSet41);
        org.junit.Assert.assertNotNull(qualificationSet42);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO4 = qualification3.toDTO();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification9 = company7.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = qualification9.getWorkers();
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification14 = company12.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = qualification14.getWorkers();
        boolean boolean16 = qualification9.equals((java.lang.Object) qualification14);
        edu.colostate.cs415.model.Worker worker17 = null;
        qualification9.addWorker(worker17);
        java.lang.String str19 = qualification9.toString();
        java.lang.String str20 = qualification9.toString();
        boolean boolean21 = qualification3.equals((java.lang.Object) qualification9);
        java.lang.String str22 = qualification3.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = qualification3.getWorkers();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(qualificationDTO4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertNotNull(qualification14);
        org.junit.Assert.assertNotNull(workerSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(workerSet23);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualificationSet6);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Qualification qualification11 = company1.createQualification("hi!:0:0:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet13 = company1.getProjects();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(qualification11);
        org.junit.Assert.assertNotNull(workerSet12);
        org.junit.Assert.assertNotNull(projectSet13);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet5 = company1.getProjects();
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet7 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company1.getQualifications();
        java.lang.String str11 = company1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(projectSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!:0:0" + "'", str6, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(qualificationSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!:0:0:0:0" + "'", str11, "hi!:0:0:0:0");
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company1.getAssignedWorkers();
        java.lang.String str11 = company1.toString();
        edu.colostate.cs415.model.Project project12 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(qualificationSet7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!:0:0" + "'", str11, "hi!:0:0");
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet4 = company1.getQualifications();
        edu.colostate.cs415.model.Qualification qualification6 = company1.createQualification("hi!:0:0:0:0");
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification10 = company8.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO11 = qualification10.toDTO();
        boolean boolean13 = qualification10.equals((java.lang.Object) 10.0d);
        edu.colostate.cs415.model.Company company15 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification17 = company15.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet18 = qualification17.getWorkers();
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification22 = company20.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = qualification22.getWorkers();
        boolean boolean24 = qualification17.equals((java.lang.Object) qualification22);
        boolean boolean25 = qualification10.equals((java.lang.Object) boolean24);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet26 = qualification10.getWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet27 = qualification10.getWorkers();
        java.lang.String str28 = qualification10.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet29 = qualification10.getWorkers();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO30 = qualification10.toDTO();
        boolean boolean31 = qualification6.equals((java.lang.Object) qualification10);
        edu.colostate.cs415.model.Company company33 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification35 = company33.createQualification("hi!");
        boolean boolean37 = company33.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet38 = company33.getQualifications();
        java.lang.Class<?> wildcardClass39 = company33.getClass();
        boolean boolean40 = qualification10.equals((java.lang.Object) company33);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet41 = qualification10.getWorkers();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO42 = qualification10.toDTO();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(qualificationSet4);
        org.junit.Assert.assertNotNull(qualification6);
        org.junit.Assert.assertNotNull(qualification10);
        org.junit.Assert.assertNotNull(qualificationDTO11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(qualification17);
        org.junit.Assert.assertNotNull(workerSet18);
        org.junit.Assert.assertNotNull(qualification22);
        org.junit.Assert.assertNotNull(workerSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(workerSet26);
        org.junit.Assert.assertNotNull(workerSet27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(workerSet29);
        org.junit.Assert.assertNotNull(qualificationDTO30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(qualification35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(qualificationSet38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(workerSet41);
        org.junit.Assert.assertNotNull(qualificationDTO42);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getUnavailableWorkers();
        java.lang.String str7 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company1.getQualifications();
        edu.colostate.cs415.model.Qualification qualification10 = company1.createQualification("hi!:0:0:0:0:0:0");
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company12.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet14 = company12.getProjects();
        edu.colostate.cs415.model.Qualification qualification16 = company12.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet17 = company12.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet18 = company12.getProjects();
        java.lang.String str19 = company12.toString();
        java.lang.String str20 = company12.getName();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet21 = company12.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet22 = company12.getProjects();
        boolean boolean23 = qualification10.equals((java.lang.Object) projectSet22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualificationSet8);
        org.junit.Assert.assertNotNull(qualification10);
        org.junit.Assert.assertNotNull(workerSet13);
        org.junit.Assert.assertNotNull(projectSet14);
        org.junit.Assert.assertNotNull(qualification16);
        org.junit.Assert.assertNotNull(projectSet17);
        org.junit.Assert.assertNotNull(projectSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!:0:0" + "'", str19, "hi!:0:0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(qualificationSet21);
        org.junit.Assert.assertNotNull(projectSet22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getUnavailableWorkers();
        boolean boolean5 = company2.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company2.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        java.lang.String str8 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet9 = company2.getProjects();
        java.lang.String str10 = company2.getName();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company2.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize12 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project13 = new edu.colostate.cs415.model.Project("hi!", qualificationSet11, projectSize12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(qualificationSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!:0:0" + "'", str8, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(qualificationSet11);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        java.lang.String str6 = company1.toString();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification10 = company8.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = qualification10.getWorkers();
        edu.colostate.cs415.model.Company company13 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification15 = company13.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = qualification15.getWorkers();
        boolean boolean17 = qualification10.equals((java.lang.Object) qualification15);
        java.lang.String str18 = qualification10.toString();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO19 = qualification10.toDTO();
        java.lang.String str20 = qualification10.toString();
        edu.colostate.cs415.model.Company company22 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification24 = company22.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet25 = qualification24.getWorkers();
        edu.colostate.cs415.model.Company company27 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification29 = company27.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet30 = qualification29.getWorkers();
        boolean boolean31 = qualification24.equals((java.lang.Object) qualification29);
        edu.colostate.cs415.model.Worker worker32 = null;
        qualification24.addWorker(worker32);
        java.lang.String str34 = qualification24.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet35 = qualification24.getWorkers();
        boolean boolean36 = qualification10.equals((java.lang.Object) qualification24);
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO37 = qualification10.toDTO();
        boolean boolean38 = company1.equals((java.lang.Object) qualification10);
        edu.colostate.cs415.model.Company company41 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification43 = company41.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet44 = qualification43.getWorkers();
        edu.colostate.cs415.model.Company company46 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification48 = company46.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet49 = qualification48.getWorkers();
        boolean boolean50 = qualification43.equals((java.lang.Object) qualification48);
        edu.colostate.cs415.model.Worker worker51 = null;
        qualification48.addWorker(worker51);
        edu.colostate.cs415.model.Company company54 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification56 = company54.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet57 = qualification56.getWorkers();
        boolean boolean58 = qualification48.equals((java.lang.Object) workerSet57);
        edu.colostate.cs415.model.Company company60 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet61 = company60.getEmployedWorkers();
        boolean boolean62 = qualification48.equals((java.lang.Object) company60);
        edu.colostate.cs415.model.Qualification qualification64 = company60.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet65 = qualification64.getWorkers();
        edu.colostate.cs415.model.Company company67 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str68 = company67.getName();
        edu.colostate.cs415.model.Qualification qualification70 = company67.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet71 = company67.getUnavailableWorkers();
        boolean boolean72 = qualification64.equals((java.lang.Object) company67);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet73 = company67.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize74 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project75 = company1.createProject("", qualificationSet73, projectSize74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!:0:0" + "'", str6, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualification10);
        org.junit.Assert.assertNotNull(workerSet11);
        org.junit.Assert.assertNotNull(qualification15);
        org.junit.Assert.assertNotNull(workerSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(qualificationDTO19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(qualification24);
        org.junit.Assert.assertNotNull(workerSet25);
        org.junit.Assert.assertNotNull(qualification29);
        org.junit.Assert.assertNotNull(workerSet30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(workerSet35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(qualificationDTO37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(qualification43);
        org.junit.Assert.assertNotNull(workerSet44);
        org.junit.Assert.assertNotNull(qualification48);
        org.junit.Assert.assertNotNull(workerSet49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(qualification56);
        org.junit.Assert.assertNotNull(workerSet57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(workerSet61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(qualification64);
        org.junit.Assert.assertNotNull(workerSet65);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!:0:0" + "'", str68, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualification70);
        org.junit.Assert.assertNotNull(workerSet71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(qualificationSet73);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.lang.String str9 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company1.getUnassignedWorkers();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(qualificationSet7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!:0:0:0:0" + "'", str9, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet10);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getAvailableWorkers();
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(workerSet7);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.lang.String str4 = company1.toString();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!:0:0" + "'", str4, "hi!:0:0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.Object obj7 = null;
        boolean boolean8 = company1.equals(obj7);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet10 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company1.getEmployedWorkers();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(projectSet10);
        org.junit.Assert.assertNotNull(workerSet11);
        org.junit.Assert.assertNotNull(workerSet12);
        org.junit.Assert.assertNotNull(workerSet13);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        boolean boolean4 = company1.equals((java.lang.Object) "");
        java.lang.String str5 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getEmployedWorkers();
        java.lang.String str7 = company1.getName();
        java.lang.String str8 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Qualification qualification11 = company1.createQualification("hi!:0:0:0:0:0:0");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO12 = qualification11.toDTO();
        java.lang.String str13 = qualification11.toString();
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(qualification11);
        org.junit.Assert.assertNotNull(qualificationDTO12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!:0:0:0:0:0:0" + "'", str13, "hi!:0:0:0:0:0:0");
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company1.getQualifications();
        java.lang.String str6 = company1.getName();
        edu.colostate.cs415.model.Qualification qualification8 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getAvailableWorkers();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualificationSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertNotNull(workerSet9);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = qualification8.getWorkers();
        boolean boolean10 = qualification3.equals((java.lang.Object) qualification8);
        edu.colostate.cs415.model.Worker worker11 = null;
        qualification8.addWorker(worker11);
        edu.colostate.cs415.model.Company company14 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification16 = company14.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = qualification16.getWorkers();
        boolean boolean18 = qualification8.equals((java.lang.Object) workerSet17);
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet21 = company20.getEmployedWorkers();
        boolean boolean22 = qualification8.equals((java.lang.Object) company20);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet23 = company20.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet24 = company20.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet25 = company20.getProjects();
        edu.colostate.cs415.model.Qualification qualification27 = company20.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet28 = company20.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet29 = company20.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet30 = company20.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet31 = company20.getEmployedWorkers();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Qualification qualification33 = company20.createQualification("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Description cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(qualification16);
        org.junit.Assert.assertNotNull(workerSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(workerSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(qualificationSet23);
        org.junit.Assert.assertNotNull(workerSet24);
        org.junit.Assert.assertNotNull(projectSet25);
        org.junit.Assert.assertNotNull(qualification27);
        org.junit.Assert.assertNotNull(workerSet28);
        org.junit.Assert.assertNotNull(workerSet29);
        org.junit.Assert.assertNotNull(workerSet30);
        org.junit.Assert.assertNotNull(workerSet31);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company1.getQualifications();
        java.lang.String str8 = company1.getName();
        edu.colostate.cs415.model.Qualification qualification10 = company1.createQualification("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company1.getAvailableWorkers();
        java.lang.Class<?> wildcardClass14 = workerSet13.getClass();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(qualificationSet6);
        org.junit.Assert.assertNotNull(qualificationSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(qualification10);
        org.junit.Assert.assertNotNull(qualificationSet11);
        org.junit.Assert.assertNotNull(workerSet12);
        org.junit.Assert.assertNotNull(workerSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Project project4 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(workerSet3);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = qualification8.getWorkers();
        boolean boolean10 = qualification3.equals((java.lang.Object) qualification8);
        edu.colostate.cs415.model.Worker worker11 = null;
        qualification8.addWorker(worker11);
        edu.colostate.cs415.model.Company company14 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification16 = company14.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = qualification16.getWorkers();
        boolean boolean18 = qualification8.equals((java.lang.Object) workerSet17);
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet21 = company20.getEmployedWorkers();
        boolean boolean22 = qualification8.equals((java.lang.Object) company20);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet23 = company20.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet24 = company20.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet25 = company20.getProjects();
        edu.colostate.cs415.model.Qualification qualification27 = company20.createQualification("hi!");
        edu.colostate.cs415.model.Company company29 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification31 = company29.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet32 = company29.getUnassignedWorkers();
        java.lang.String str33 = company29.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet34 = company29.getProjects();
        java.lang.String str35 = company29.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet36 = company29.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet37 = company29.getEmployedWorkers();
        boolean boolean38 = qualification27.equals((java.lang.Object) company29);
        java.lang.String str39 = company29.getName();
        edu.colostate.cs415.model.Company company42 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification44 = company42.createQualification("hi!");
        boolean boolean46 = company42.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet47 = company42.getQualifications();
        edu.colostate.cs415.model.Worker worker49 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet47, 0.0d);
        edu.colostate.cs415.model.Project project50 = null;
        // The following exception was thrown during execution in test generation
        try {
            company29.unassign(worker49, project50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(qualification16);
        org.junit.Assert.assertNotNull(workerSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(workerSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(qualificationSet23);
        org.junit.Assert.assertNotNull(workerSet24);
        org.junit.Assert.assertNotNull(projectSet25);
        org.junit.Assert.assertNotNull(qualification27);
        org.junit.Assert.assertNotNull(qualification31);
        org.junit.Assert.assertNotNull(workerSet32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!:0:0" + "'", str33, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!:0:0" + "'", str35, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet36);
        org.junit.Assert.assertNotNull(workerSet37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(qualification44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(qualificationSet47);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = qualification8.getWorkers();
        boolean boolean10 = qualification3.equals((java.lang.Object) qualification8);
        java.lang.String str11 = qualification3.toString();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO12 = qualification3.toDTO();
        java.lang.String str13 = qualification3.toString();
        edu.colostate.cs415.model.Company company15 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification17 = company15.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet18 = qualification17.getWorkers();
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification22 = company20.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = qualification22.getWorkers();
        boolean boolean24 = qualification17.equals((java.lang.Object) qualification22);
        edu.colostate.cs415.model.Worker worker25 = null;
        qualification17.addWorker(worker25);
        java.lang.String str27 = qualification17.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet28 = qualification17.getWorkers();
        boolean boolean29 = qualification3.equals((java.lang.Object) qualification17);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet30 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company32 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str33 = company32.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet34 = company32.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification36 = company32.createQualification("hi!");
        java.lang.Object obj37 = null;
        boolean boolean38 = company32.equals(obj37);
        edu.colostate.cs415.model.Company company40 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet41 = company40.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet42 = company40.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet43 = company40.getProjects();
        java.lang.String str44 = company40.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet45 = company40.getAssignedWorkers();
        boolean boolean46 = company32.equals((java.lang.Object) workerSet45);
        boolean boolean47 = qualification3.equals((java.lang.Object) company32);
        java.util.Set<edu.colostate.cs415.model.Project> projectSet48 = company32.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet49 = company32.getUnavailableWorkers();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(qualificationDTO12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(qualification17);
        org.junit.Assert.assertNotNull(workerSet18);
        org.junit.Assert.assertNotNull(qualification22);
        org.junit.Assert.assertNotNull(workerSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(workerSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(workerSet30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!:0:0:0:0" + "'", str33, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet34);
        org.junit.Assert.assertNotNull(qualification36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(workerSet41);
        org.junit.Assert.assertNotNull(projectSet42);
        org.junit.Assert.assertNotNull(projectSet43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!:0:0" + "'", str44, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(projectSet48);
        org.junit.Assert.assertNotNull(workerSet49);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getEmployedWorkers();
        java.lang.String str10 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet11 = company1.getProjects();
        edu.colostate.cs415.model.Company company13 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company13.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet15 = company13.getProjects();
        edu.colostate.cs415.model.Qualification qualification17 = company13.createQualification("hi!");
        boolean boolean18 = company1.equals((java.lang.Object) qualification17);
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!:0:0" + "'", str10, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet11);
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertNotNull(projectSet15);
        org.junit.Assert.assertNotNull(qualification17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = qualification8.getWorkers();
        boolean boolean10 = qualification3.equals((java.lang.Object) qualification8);
        java.lang.String str11 = qualification3.toString();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO12 = qualification3.toDTO();
        java.lang.String str13 = qualification3.toString();
        edu.colostate.cs415.model.Company company15 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification17 = company15.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet18 = qualification17.getWorkers();
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification22 = company20.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = qualification22.getWorkers();
        boolean boolean24 = qualification17.equals((java.lang.Object) qualification22);
        edu.colostate.cs415.model.Worker worker25 = null;
        qualification17.addWorker(worker25);
        java.lang.String str27 = qualification17.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet28 = qualification17.getWorkers();
        boolean boolean29 = qualification3.equals((java.lang.Object) qualification17);
        edu.colostate.cs415.model.Company company31 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification33 = company31.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet34 = company31.getUnassignedWorkers();
        java.lang.String str35 = company31.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet36 = company31.getProjects();
        java.lang.String str37 = company31.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet38 = company31.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet39 = company31.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company41 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification43 = company41.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet44 = qualification43.getWorkers();
        edu.colostate.cs415.model.Company company46 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification48 = company46.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet49 = qualification48.getWorkers();
        boolean boolean50 = qualification43.equals((java.lang.Object) qualification48);
        edu.colostate.cs415.model.Worker worker51 = null;
        qualification48.addWorker(worker51);
        edu.colostate.cs415.model.Company company54 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification56 = company54.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet57 = qualification56.getWorkers();
        boolean boolean58 = qualification48.equals((java.lang.Object) workerSet57);
        edu.colostate.cs415.model.Company company60 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet61 = company60.getEmployedWorkers();
        boolean boolean62 = qualification48.equals((java.lang.Object) company60);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet63 = company60.getQualifications();
        boolean boolean64 = company31.equals((java.lang.Object) company60);
        boolean boolean65 = qualification3.equals((java.lang.Object) company60);
        edu.colostate.cs415.model.Qualification qualification67 = company60.createQualification("hi!:0:0:0:0");
        edu.colostate.cs415.model.Company company69 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet70 = company69.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet71 = company69.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet72 = company69.getProjects();
        java.lang.String str73 = company69.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet74 = company69.getAvailableWorkers();
        boolean boolean75 = company60.equals((java.lang.Object) company69);
        edu.colostate.cs415.model.Qualification qualification77 = company69.createQualification("hi!:0:0:0:0");
        java.lang.String str78 = company69.getName();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet79 = company69.getProjects();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(qualificationDTO12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(qualification17);
        org.junit.Assert.assertNotNull(workerSet18);
        org.junit.Assert.assertNotNull(qualification22);
        org.junit.Assert.assertNotNull(workerSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(workerSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(qualification33);
        org.junit.Assert.assertNotNull(workerSet34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!:0:0" + "'", str35, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!:0:0" + "'", str37, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet38);
        org.junit.Assert.assertNotNull(workerSet39);
        org.junit.Assert.assertNotNull(qualification43);
        org.junit.Assert.assertNotNull(workerSet44);
        org.junit.Assert.assertNotNull(qualification48);
        org.junit.Assert.assertNotNull(workerSet49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(qualification56);
        org.junit.Assert.assertNotNull(workerSet57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(workerSet61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(qualificationSet63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(qualification67);
        org.junit.Assert.assertNotNull(workerSet70);
        org.junit.Assert.assertNotNull(projectSet71);
        org.junit.Assert.assertNotNull(projectSet72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!:0:0" + "'", str73, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(qualification77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertNotNull(projectSet79);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO4 = qualification3.toDTO();
        boolean boolean6 = qualification3.equals((java.lang.Object) 10.0d);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = qualification3.getWorkers();
        edu.colostate.cs415.model.Worker worker8 = null;
        qualification3.addWorker(worker8);
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(qualificationDTO4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(workerSet7);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet11 = company1.getProjects();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Qualification qualification13 = company1.createQualification("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Description cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertNotNull(projectSet11);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.lang.String str5 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getUnassignedWorkers();
        java.lang.String str7 = company1.getName();
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0:0:0");
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str12 = company11.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet13 = company11.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company11.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet15 = company11.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company11.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet17 = company11.getProjects();
        java.lang.String str18 = company11.getName();
        boolean boolean19 = qualification9.equals((java.lang.Object) company11);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet20 = company11.getUnassignedWorkers();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!:0:0" + "'", str12, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet13);
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertNotNull(qualificationSet15);
        org.junit.Assert.assertNotNull(workerSet16);
        org.junit.Assert.assertNotNull(projectSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(workerSet20);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet5 = company1.getProjects();
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet7 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company1.getAssignedWorkers();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(projectSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!:0:0" + "'", str6, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(qualificationSet10);
        org.junit.Assert.assertNotNull(workerSet11);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Qualification qualification10 = company1.createQualification("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet11 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet12 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company1.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company1.getUnavailableWorkers();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(qualification10);
        org.junit.Assert.assertNotNull(projectSet11);
        org.junit.Assert.assertNotNull(projectSet12);
        org.junit.Assert.assertNotNull(workerSet13);
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertNotNull(workerSet15);
        org.junit.Assert.assertNotNull(workerSet16);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getEmployedWorkers();
        java.lang.String str8 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getAssignedWorkers();
        java.lang.String str10 = company1.toString();
        java.lang.String str11 = company1.toString();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!:0:0" + "'", str8, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!:0:0" + "'", str10, "hi!:0:0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!:0:0" + "'", str11, "hi!:0:0");
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        java.lang.String str6 = company1.toString();
        java.lang.String str7 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getUnavailableWorkers();
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!:0:0" + "'", str6, "hi!:0:0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(workerSet9);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company6.getUnassignedWorkers();
        java.lang.String str10 = company6.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet11 = company6.getProjects();
        java.lang.String str12 = company6.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company6.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company6.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company6.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet16 = company6.getQualifications();
        edu.colostate.cs415.model.Worker worker18 = company1.createWorker("hi!", qualificationSet16, 1.0d);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet20 = null;
        edu.colostate.cs415.model.ProjectSize projectSize21 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project22 = company1.createProject("", qualificationSet20, projectSize21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!:0:0" + "'", str10, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!:0:0" + "'", str12, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet13);
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertNotNull(workerSet15);
        org.junit.Assert.assertNotNull(qualificationSet16);
        org.junit.Assert.assertNotNull(worker18);
    }
}

