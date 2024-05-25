import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Qualification qualification1 = new edu.colostate.cs415.model.Qualification("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Description cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Worker worker2 = null;
        edu.colostate.cs415.model.Project project3 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker2, project3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Project project3 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification10 = company8.createQualification("hi!");
        edu.colostate.cs415.model.Qualification[] qualificationArray11 = new edu.colostate.cs415.model.Qualification[] { qualification10 };
        java.util.LinkedHashSet<edu.colostate.cs415.model.Qualification> qualificationSet12 = new java.util.LinkedHashSet<edu.colostate.cs415.model.Qualification>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<edu.colostate.cs415.model.Qualification>) qualificationSet12, qualificationArray11);
        edu.colostate.cs415.model.ProjectSize projectSize14 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project15 = company1.createProject("", (java.util.Set<edu.colostate.cs415.model.Qualification>) qualificationSet12, projectSize14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(qualification10);
        org.junit.Assert.assertNotNull(qualificationArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        edu.colostate.cs415.model.Qualification[] qualificationArray9 = new edu.colostate.cs415.model.Qualification[] { qualification4, qualification8 };
        java.util.LinkedHashSet<edu.colostate.cs415.model.Qualification> qualificationSet10 = new java.util.LinkedHashSet<edu.colostate.cs415.model.Qualification>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<edu.colostate.cs415.model.Qualification>) qualificationSet10, qualificationArray9);
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker13 = new edu.colostate.cs415.model.Worker("", (java.util.Set<edu.colostate.cs415.model.Qualification>) qualificationSet10, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Worker name cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertNotNull(qualificationArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.lang.String str6 = company1.getName();
        edu.colostate.cs415.model.Project project7 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        int int0 = edu.colostate.cs415.model.Worker.MAX_WORKLOAD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.Class<?> wildcardClass5 = workerSet4.getClass();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = qualification8.getWorkers();
        boolean boolean10 = qualification3.equals((java.lang.Object) qualification8);
        edu.colostate.cs415.model.Worker worker11 = null;
        // The following exception was thrown during execution in test generation
        try {
            qualification8.removeWorker(worker11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot remove null worker");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        edu.colostate.cs415.model.Project project5 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Qualification qualification8 = company1.createQualification("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Description cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(qualificationSet6);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Project project4 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Company company4 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification6 = company4.createQualification("hi!");
        boolean boolean8 = company4.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet9 = company4.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker11 = company1.createWorker("hi!:0:0", qualificationSet9, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualification is not in the company set");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(qualificationSet9);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("", qualificationSet7, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Worker name cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(qualificationSet7);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize8 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project9 = new edu.colostate.cs415.model.Project("hi!", qualificationSet7, projectSize8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(qualificationSet7);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.lang.String str6 = company1.getName();
        edu.colostate.cs415.model.Project project7 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        edu.colostate.cs415.model.Project project7 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(qualificationSet6);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize8 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project9 = new edu.colostate.cs415.model.Project("hi!:0:0", qualificationSet7, projectSize8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(qualificationSet7);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Company company5 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification7 = company5.createQualification("hi!");
        boolean boolean9 = company5.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company5.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize11 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project12 = company1.createProject("hi!:0:0", qualificationSet10, projectSize11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(qualification7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(qualificationSet10);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Worker worker4 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassignAll(worker4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        boolean boolean4 = company1.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Project project6 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(workerSet5);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Company company4 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification6 = company4.createQualification("hi!");
        boolean boolean8 = company4.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet9 = company4.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker11 = company1.createWorker("hi!", qualificationSet9, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualification is not in the company set");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(qualificationSet9);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Project project3 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        boolean boolean4 = company1.equals((java.lang.Object) "");
        edu.colostate.cs415.model.Worker worker5 = null;
        edu.colostate.cs415.model.Project project6 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker5, project6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
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
        edu.colostate.cs415.model.Project project23 = null;
        // The following exception was thrown during execution in test generation
        try {
            company20.finish(project23);
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
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO5 = qualification4.toDTO();
        boolean boolean7 = qualification4.equals((java.lang.Object) 10.0d);
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = qualification11.getWorkers();
        edu.colostate.cs415.model.Company company14 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification16 = company14.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = qualification16.getWorkers();
        boolean boolean18 = qualification11.equals((java.lang.Object) qualification16);
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification22 = company20.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO23 = qualification22.toDTO();
        boolean boolean25 = qualification22.equals((java.lang.Object) 10.0d);
        edu.colostate.cs415.model.Company company27 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification29 = company27.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet30 = qualification29.getWorkers();
        edu.colostate.cs415.model.Company company32 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification34 = company32.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet35 = qualification34.getWorkers();
        edu.colostate.cs415.model.Company company37 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification39 = company37.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet40 = qualification39.getWorkers();
        boolean boolean41 = qualification34.equals((java.lang.Object) qualification39);
        java.lang.String str42 = qualification39.toString();
        edu.colostate.cs415.model.Company company44 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification46 = company44.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet47 = qualification46.getWorkers();
        edu.colostate.cs415.model.Company company49 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification51 = company49.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet52 = qualification51.getWorkers();
        boolean boolean53 = qualification46.equals((java.lang.Object) qualification51);
        edu.colostate.cs415.model.Qualification[] qualificationArray54 = new edu.colostate.cs415.model.Qualification[] { qualification4, qualification16, qualification22, qualification29, qualification39, qualification51 };
        java.util.LinkedHashSet<edu.colostate.cs415.model.Qualification> qualificationSet55 = new java.util.LinkedHashSet<edu.colostate.cs415.model.Qualification>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<edu.colostate.cs415.model.Qualification>) qualificationSet55, qualificationArray54);
        edu.colostate.cs415.model.ProjectSize projectSize57 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project58 = new edu.colostate.cs415.model.Project("hi!:0:0:0:0", (java.util.Set<edu.colostate.cs415.model.Qualification>) qualificationSet55, projectSize57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertNotNull(qualificationDTO5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(qualification11);
        org.junit.Assert.assertNotNull(workerSet12);
        org.junit.Assert.assertNotNull(qualification16);
        org.junit.Assert.assertNotNull(workerSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(qualification22);
        org.junit.Assert.assertNotNull(qualificationDTO23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(qualification29);
        org.junit.Assert.assertNotNull(workerSet30);
        org.junit.Assert.assertNotNull(qualification34);
        org.junit.Assert.assertNotNull(workerSet35);
        org.junit.Assert.assertNotNull(qualification39);
        org.junit.Assert.assertNotNull(workerSet40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(qualification46);
        org.junit.Assert.assertNotNull(workerSet47);
        org.junit.Assert.assertNotNull(qualification51);
        org.junit.Assert.assertNotNull(workerSet52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(qualificationArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Worker worker4 = null;
        qualification3.addWorker(worker4);
        java.lang.Class<?> wildcardClass6 = qualification3.getClass();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: name cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Worker worker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassignAll(worker2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = qualification8.getWorkers();
        boolean boolean10 = qualification3.equals((java.lang.Object) qualification8);
        edu.colostate.cs415.model.Worker worker11 = null;
        qualification3.addWorker(worker11);
        edu.colostate.cs415.model.Worker worker13 = null;
        // The following exception was thrown during execution in test generation
        try {
            qualification3.removeWorker(worker13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot remove null worker");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        boolean boolean10 = company6.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company6.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker13 = company1.createWorker("hi!:0:0:0:0", qualificationSet11, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Salary cannot be less than or equal to zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(qualificationSet11);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification4 = company1.createQualification("hi!:0:0");
        edu.colostate.cs415.model.Project project5 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualification4);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        edu.colostate.cs415.model.Worker worker9 = null;
        qualification8.addWorker(worker9);
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification14 = company12.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO15 = qualification14.toDTO();
        java.lang.String str16 = qualification14.toString();
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
        edu.colostate.cs415.model.Company company32 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification34 = company32.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet35 = qualification34.getWorkers();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO36 = qualification34.toDTO();
        edu.colostate.cs415.model.Company company38 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification40 = company38.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet41 = qualification40.getWorkers();
        edu.colostate.cs415.model.Company company43 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification45 = company43.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet46 = qualification45.getWorkers();
        boolean boolean47 = qualification40.equals((java.lang.Object) qualification45);
        edu.colostate.cs415.model.Worker worker48 = null;
        qualification40.addWorker(worker48);
        edu.colostate.cs415.model.Company company51 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification53 = company51.createQualification("hi!");
        edu.colostate.cs415.model.Company company55 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification57 = company55.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet58 = qualification57.getWorkers();
        edu.colostate.cs415.model.Company company60 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification62 = company60.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet63 = qualification62.getWorkers();
        boolean boolean64 = qualification57.equals((java.lang.Object) qualification62);
        edu.colostate.cs415.model.Worker worker65 = null;
        qualification62.addWorker(worker65);
        edu.colostate.cs415.model.Company company68 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification70 = company68.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet71 = qualification70.getWorkers();
        boolean boolean72 = qualification62.equals((java.lang.Object) workerSet71);
        edu.colostate.cs415.model.Qualification[] qualificationArray73 = new edu.colostate.cs415.model.Qualification[] { qualification8, qualification14, qualification20, qualification34, qualification40, qualification53, qualification62 };
        java.util.LinkedHashSet<edu.colostate.cs415.model.Qualification> qualificationSet74 = new java.util.LinkedHashSet<edu.colostate.cs415.model.Qualification>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<edu.colostate.cs415.model.Qualification>) qualificationSet74, qualificationArray73);
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker77 = company1.createWorker("", (java.util.Set<edu.colostate.cs415.model.Qualification>) qualificationSet74, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Worker name cannot be empty or null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertNotNull(qualification14);
        org.junit.Assert.assertNotNull(qualificationDTO15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(qualification20);
        org.junit.Assert.assertNotNull(workerSet21);
        org.junit.Assert.assertNotNull(qualification25);
        org.junit.Assert.assertNotNull(workerSet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(qualification34);
        org.junit.Assert.assertNotNull(workerSet35);
        org.junit.Assert.assertNotNull(qualificationDTO36);
        org.junit.Assert.assertNotNull(qualification40);
        org.junit.Assert.assertNotNull(workerSet41);
        org.junit.Assert.assertNotNull(qualification45);
        org.junit.Assert.assertNotNull(workerSet46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(qualification53);
        org.junit.Assert.assertNotNull(qualification57);
        org.junit.Assert.assertNotNull(workerSet58);
        org.junit.Assert.assertNotNull(qualification62);
        org.junit.Assert.assertNotNull(workerSet63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(qualification70);
        org.junit.Assert.assertNotNull(workerSet71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(qualificationArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.lang.Class<?> wildcardClass3 = company1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize8 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project9 = new edu.colostate.cs415.model.Project("hi!:0:0:0:0", qualificationSet7, projectSize8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(qualificationSet7);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.lang.String str4 = company1.toString();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification9 = company7.createQualification("hi!");
        boolean boolean11 = company7.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company7.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker14 = company1.createWorker("hi!:0:0", qualificationSet12, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Salary cannot be less than or equal to zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!:0:0" + "'", str4, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(qualificationSet12);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = qualification8.getWorkers();
        boolean boolean10 = qualification3.equals((java.lang.Object) qualification8);
        edu.colostate.cs415.model.Worker worker11 = null;
        qualification3.addWorker(worker11);
        java.lang.String str13 = qualification3.toString();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.dto.QualificationDTO qualificationDTO14 = qualification3.toDTO();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        edu.colostate.cs415.model.Project project8 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        edu.colostate.cs415.model.Worker worker4 = null;
        edu.colostate.cs415.model.Project project5 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker4, project5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.lang.String str6 = company1.getName();
        edu.colostate.cs415.model.Worker worker7 = null;
        edu.colostate.cs415.model.Project project8 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker7, project8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
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
        edu.colostate.cs415.model.Qualification qualification24 = company20.createQualification("hi!");
        edu.colostate.cs415.model.Worker worker25 = null;
        // The following exception was thrown during execution in test generation
        try {
            company20.unassignAll(worker25);
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
        org.junit.Assert.assertNotNull(qualification24);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        boolean boolean4 = company1.equals((java.lang.Object) "");
        edu.colostate.cs415.model.Project project5 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        edu.colostate.cs415.model.Project project10 = null;
        // The following exception was thrown during execution in test generation
        try {
            worker9.addProject(project10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: project can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(qualificationSet7);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        edu.colostate.cs415.model.Company company5 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification7 = company5.createQualification("hi!");
        boolean boolean9 = company5.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company5.getQualifications();
        edu.colostate.cs415.model.Worker worker12 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet10, (double) 10L);
        edu.colostate.cs415.model.ProjectSize projectSize13 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project14 = company1.createProject("", qualificationSet10, projectSize13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(qualificationSet10);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Worker worker9 = null;
        edu.colostate.cs415.model.Project project10 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker9, project10);
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
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        edu.colostate.cs415.model.Project project6 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        edu.colostate.cs415.model.Project project10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = worker9.willOverload(project10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: project can not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(qualificationSet7);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
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
        java.lang.Class<?> wildcardClass19 = qualification8.getClass();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(qualification16);
        org.junit.Assert.assertNotNull(workerSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = qualification4.getWorkers();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification9 = company7.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = qualification9.getWorkers();
        boolean boolean11 = qualification4.equals((java.lang.Object) qualification9);
        edu.colostate.cs415.model.Worker worker12 = null;
        qualification9.addWorker(worker12);
        edu.colostate.cs415.model.Company company15 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification17 = company15.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet18 = qualification17.getWorkers();
        boolean boolean19 = qualification9.equals((java.lang.Object) workerSet18);
        edu.colostate.cs415.model.Company company21 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet22 = company21.getEmployedWorkers();
        boolean boolean23 = qualification9.equals((java.lang.Object) company21);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet24 = company21.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize25 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project26 = new edu.colostate.cs415.model.Project("", qualificationSet24, projectSize25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(qualification17);
        org.junit.Assert.assertNotNull(workerSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(workerSet22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(qualificationSet24);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
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
        edu.colostate.cs415.model.Company company25 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification27 = company25.createQualification("hi!");
        boolean boolean29 = company25.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet30 = company25.getQualifications();
        edu.colostate.cs415.model.Worker worker32 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet30, (double) 10L);
        edu.colostate.cs415.model.Project project33 = null;
        // The following exception was thrown during execution in test generation
        try {
            company20.assign(worker32, project33);
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
        org.junit.Assert.assertNotNull(qualification27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(qualificationSet30);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize6 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project7 = new edu.colostate.cs415.model.Project("", qualificationSet5, projectSize6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualificationSet5);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
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
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet19 = qualification8.getWorkers();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.dto.QualificationDTO qualificationDTO20 = qualification8.toDTO();
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
        org.junit.Assert.assertNotNull(workerSet19);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        edu.colostate.cs415.model.Project project5 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(projectSet4);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0:0:0");
        java.lang.Class<?> wildcardClass10 = qualification9.getClass();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = qualification8.getWorkers();
        boolean boolean10 = qualification3.equals((java.lang.Object) qualification8);
        edu.colostate.cs415.model.Worker worker11 = null;
        qualification3.addWorker(worker11);
        java.lang.String str13 = qualification3.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = qualification3.getWorkers();
        java.lang.Class<?> wildcardClass15 = workerSet14.getClass();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = qualification4.getWorkers();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification9 = company7.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = qualification9.getWorkers();
        boolean boolean11 = qualification4.equals((java.lang.Object) qualification9);
        edu.colostate.cs415.model.Worker worker12 = null;
        qualification9.addWorker(worker12);
        edu.colostate.cs415.model.Company company15 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification17 = company15.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet18 = qualification17.getWorkers();
        boolean boolean19 = qualification9.equals((java.lang.Object) workerSet18);
        edu.colostate.cs415.model.Company company21 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet22 = company21.getEmployedWorkers();
        boolean boolean23 = qualification9.equals((java.lang.Object) company21);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet24 = company21.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker26 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet24, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Salary must be positive number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(qualification17);
        org.junit.Assert.assertNotNull(workerSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(workerSet22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(qualificationSet24);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
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
        edu.colostate.cs415.model.Project project24 = null;
        // The following exception was thrown during execution in test generation
        try {
            company20.finish(project24);
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
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        edu.colostate.cs415.model.Project project10 = null;
        // The following exception was thrown during execution in test generation
        try {
            worker9.removeProject(project10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: project cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(qualificationSet7);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification9 = company7.createQualification("hi!");
        boolean boolean11 = company7.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company7.getQualifications();
        edu.colostate.cs415.model.Worker worker14 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet12, (double) 10L);
        edu.colostate.cs415.model.ProjectSize projectSize15 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project16 = company1.createProject("hi!", qualificationSet12, projectSize15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(qualificationSet12);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        boolean boolean13 = company9.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company9.getQualifications();
        edu.colostate.cs415.model.Worker worker16 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet14, (double) 10L);
        edu.colostate.cs415.model.Project project17 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker16, project17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertNotNull(qualification11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(qualificationSet14);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        boolean boolean13 = company9.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company9.getQualifications();
        edu.colostate.cs415.model.Worker worker16 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet14, (double) 10L);
        edu.colostate.cs415.model.Project project17 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker16, project17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(qualification11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(qualificationSet14);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Salary must be positive number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualificationSet5);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO4 = qualification3.toDTO();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = qualification3.getWorkers();
        java.lang.Class<?> wildcardClass6 = qualification3.getClass();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(qualificationDTO4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
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
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.dto.QualificationDTO qualificationDTO19 = qualification8.toDTO();
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
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification9 = company7.createQualification("hi!");
        boolean boolean11 = company7.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company7.getQualifications();
        edu.colostate.cs415.model.Worker worker14 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet12, (double) 10L);
        edu.colostate.cs415.model.Project project15 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker14, project15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(qualificationSet12);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker9 = company1.createWorker("hi!:0:0:0:0", qualificationSet7, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be empty or null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnassignedWorkers();
        edu.colostate.cs415.model.Project project8 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(qualificationSet6);
        org.junit.Assert.assertNotNull(workerSet7);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("", qualificationSet7, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Worker name cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(qualificationSet7);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            worker9.setSalary((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: salary can not be a negative number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(qualificationSet7);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification4 = company1.createQualification("hi!:0:0");
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification9 = company7.createQualification("hi!");
        boolean boolean11 = company7.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company7.getQualifications();
        edu.colostate.cs415.model.Worker worker14 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet12, (double) 10L);
        edu.colostate.cs415.model.Project project15 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker14, project15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(qualificationSet12);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO5 = qualification4.toDTO();
        java.lang.String str6 = qualification4.toString();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification10 = company8.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = qualification10.getWorkers();
        edu.colostate.cs415.model.Company company13 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification15 = company13.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = qualification15.getWorkers();
        boolean boolean17 = qualification10.equals((java.lang.Object) qualification15);
        java.lang.String str18 = qualification15.toString();
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification22 = company20.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = qualification22.getWorkers();
        edu.colostate.cs415.model.Company company25 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification27 = company25.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet28 = qualification27.getWorkers();
        boolean boolean29 = qualification22.equals((java.lang.Object) qualification27);
        java.lang.String str30 = qualification22.toString();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO31 = qualification22.toDTO();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet32 = qualification22.getWorkers();
        edu.colostate.cs415.model.Company company34 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification36 = company34.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet37 = qualification36.getWorkers();
        edu.colostate.cs415.model.Company company39 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification41 = company39.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet42 = qualification41.getWorkers();
        boolean boolean43 = qualification36.equals((java.lang.Object) qualification41);
        edu.colostate.cs415.model.Worker worker44 = null;
        qualification41.addWorker(worker44);
        edu.colostate.cs415.model.Company company47 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification49 = company47.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet50 = qualification49.getWorkers();
        boolean boolean51 = qualification41.equals((java.lang.Object) workerSet50);
        edu.colostate.cs415.model.Company company53 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet54 = company53.getEmployedWorkers();
        boolean boolean55 = qualification41.equals((java.lang.Object) company53);
        edu.colostate.cs415.model.Qualification qualification57 = company53.createQualification("hi!");
        edu.colostate.cs415.model.Company company59 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet60 = company59.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet61 = company59.getProjects();
        boolean boolean62 = qualification57.equals((java.lang.Object) projectSet61);
        edu.colostate.cs415.model.Company company64 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification66 = company64.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet67 = qualification66.getWorkers();
        edu.colostate.cs415.model.Company company69 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification71 = company69.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet72 = qualification71.getWorkers();
        boolean boolean73 = qualification66.equals((java.lang.Object) qualification71);
        java.lang.String str74 = qualification66.toString();
        edu.colostate.cs415.model.Company company76 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification78 = company76.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO79 = qualification78.toDTO();
        boolean boolean81 = qualification78.equals((java.lang.Object) 10.0d);
        edu.colostate.cs415.model.Qualification[] qualificationArray82 = new edu.colostate.cs415.model.Qualification[] { qualification4, qualification15, qualification22, qualification57, qualification66, qualification78 };
        java.util.LinkedHashSet<edu.colostate.cs415.model.Qualification> qualificationSet83 = new java.util.LinkedHashSet<edu.colostate.cs415.model.Qualification>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<edu.colostate.cs415.model.Qualification>) qualificationSet83, qualificationArray82);
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker86 = new edu.colostate.cs415.model.Worker("hi!:0:0:0:0", (java.util.Set<edu.colostate.cs415.model.Qualification>) qualificationSet83, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Salary must be positive number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertNotNull(qualificationDTO5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(qualification10);
        org.junit.Assert.assertNotNull(workerSet11);
        org.junit.Assert.assertNotNull(qualification15);
        org.junit.Assert.assertNotNull(workerSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(qualification22);
        org.junit.Assert.assertNotNull(workerSet23);
        org.junit.Assert.assertNotNull(qualification27);
        org.junit.Assert.assertNotNull(workerSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(qualificationDTO31);
        org.junit.Assert.assertNotNull(workerSet32);
        org.junit.Assert.assertNotNull(qualification36);
        org.junit.Assert.assertNotNull(workerSet37);
        org.junit.Assert.assertNotNull(qualification41);
        org.junit.Assert.assertNotNull(workerSet42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(qualification49);
        org.junit.Assert.assertNotNull(workerSet50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(workerSet54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(qualification57);
        org.junit.Assert.assertNotNull(workerSet60);
        org.junit.Assert.assertNotNull(projectSet61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(qualification66);
        org.junit.Assert.assertNotNull(workerSet67);
        org.junit.Assert.assertNotNull(qualification71);
        org.junit.Assert.assertNotNull(workerSet72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertNotNull(qualification78);
        org.junit.Assert.assertNotNull(qualificationDTO79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(qualificationArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
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
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet29 = company26.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize30 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project31 = company1.createProject("hi!:0:0", qualificationSet29, projectSize30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(projectSet4);
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
        org.junit.Assert.assertNotNull(qualificationSet29);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        java.lang.String str4 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Project project6 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!:0:0" + "'", str4, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet5);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.lang.String str6 = company1.getName();
        edu.colostate.cs415.model.Project project7 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
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
        java.lang.Class<?> wildcardClass20 = qualification3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!:0:0");
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification10 = company8.createQualification("hi!");
        boolean boolean12 = company8.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company8.getQualifications();
        edu.colostate.cs415.model.Worker worker15 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet13, (double) 10L);
        edu.colostate.cs415.model.Project project16 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker15, project16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertNotNull(qualification10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(qualificationSet13);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        edu.colostate.cs415.model.Qualification qualification1 = new edu.colostate.cs415.model.Qualification("hi!:0:0:0:0");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.lang.String str6 = company1.getName();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Qualification qualification8 = company1.createQualification("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Description cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Project project8 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(workerSet7);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.lang.String str4 = company1.getName();
        edu.colostate.cs415.model.Project project5 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!:0:0" + "'", str4, "hi!:0:0");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.lang.String str5 = company1.toString();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification10 = company8.createQualification("hi!");
        boolean boolean12 = company8.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company8.getQualifications();
        edu.colostate.cs415.model.Worker worker15 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet13, (double) 10L);
        edu.colostate.cs415.model.Project project16 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker15, project16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualification10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(qualificationSet13);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("", qualificationSet5, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Worker name cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualificationSet5);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        edu.colostate.cs415.model.Company company3 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification5 = company3.createQualification("hi!");
        boolean boolean7 = company3.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company3.getQualifications();
        edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet8, (double) 10L);
        edu.colostate.cs415.model.ProjectSize projectSize11 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project12 = new edu.colostate.cs415.model.Project("hi!:0:0", qualificationSet8, projectSize11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(qualificationSet8);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Project project2 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
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
        edu.colostate.cs415.model.Company company29 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification31 = company29.createQualification("hi!");
        boolean boolean33 = company29.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet34 = company29.getQualifications();
        edu.colostate.cs415.model.Worker worker36 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet34, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            qualification8.removeWorker(worker36);
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
        org.junit.Assert.assertNotNull(qualification31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(qualificationSet34);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = qualification3.getWorkers();
        java.lang.String str5 = qualification3.toString();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Worker worker4 = null;
        qualification3.addWorker(worker4);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = qualification3.getWorkers();
        java.lang.Class<?> wildcardClass7 = workerSet6.getClass();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company2.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!:0:0:0:0", qualificationSet8, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Salary must be positive number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(qualificationSet7);
        org.junit.Assert.assertNotNull(qualificationSet8);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        java.lang.String str4 = company1.getName();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str8 = company7.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company7.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company7.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize11 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project12 = company1.createProject("", qualificationSet10, projectSize11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!:0:0" + "'", str4, "hi!:0:0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!:0:0:0:0" + "'", str8, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(qualificationSet10);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        boolean boolean10 = company6.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company6.getQualifications();
        edu.colostate.cs415.model.Worker worker13 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet11, (double) 10L);
        edu.colostate.cs415.model.Project project14 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker13, project14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(qualificationSet11);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Project project6 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(workerSet5);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        edu.colostate.cs415.model.Project project8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = worker7.willOverload(project8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: project can not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualificationSet5);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        edu.colostate.cs415.model.Company company3 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str4 = company3.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company3.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company3.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) ' ');
        edu.colostate.cs415.model.ProjectSize projectSize9 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project10 = new edu.colostate.cs415.model.Project("", qualificationSet6, projectSize9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!:0:0:0:0" + "'", str4, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(qualificationSet6);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification9 = company7.createQualification("hi!");
        boolean boolean11 = company7.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company7.getQualifications();
        edu.colostate.cs415.model.Worker worker14 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet12, (double) 10L);
        edu.colostate.cs415.model.Project project15 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker14, project15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(qualificationSet12);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.lang.String str9 = company1.toString();
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification14 = company12.createQualification("hi!");
        boolean boolean16 = company12.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet17 = company12.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet18 = company12.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker20 = company1.createWorker("", qualificationSet18, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Worker name cannot be empty or null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!:0:0" + "'", str9, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualification14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(qualificationSet17);
        org.junit.Assert.assertNotNull(qualificationSet18);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
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
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet24 = company20.getEmployedWorkers();
        edu.colostate.cs415.model.Company company27 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str28 = company27.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet29 = company27.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet30 = company27.getQualifications();
        edu.colostate.cs415.model.Worker worker32 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet30, (double) ' ');
        edu.colostate.cs415.model.Project project33 = null;
        // The following exception was thrown during execution in test generation
        try {
            company20.assign(worker32, project33);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!:0:0:0:0" + "'", str28, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet29);
        org.junit.Assert.assertNotNull(qualificationSet30);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        edu.colostate.cs415.model.Project project8 = null;
        // The following exception was thrown during execution in test generation
        try {
            worker7.addProject(project8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: project can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualificationSet5);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        boolean boolean4 = company1.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet5 = company1.getProjects();
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str10 = company9.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company9.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company9.getQualifications();
        edu.colostate.cs415.model.Worker worker14 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet12, (double) ' ');
        edu.colostate.cs415.model.ProjectSize projectSize15 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project16 = company1.createProject("hi!", qualificationSet12, projectSize15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(projectSet5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!:0:0:0:0" + "'", str10, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet11);
        org.junit.Assert.assertNotNull(qualificationSet12);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Project project9 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(workerSet8);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        edu.colostate.cs415.model.Company company3 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification5 = company3.createQualification("hi!");
        boolean boolean7 = company3.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company3.getQualifications();
        edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet8, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker12 = new edu.colostate.cs415.model.Worker("", qualificationSet8, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Worker name cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(qualificationSet8);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company1.getQualifications();
        java.lang.String str8 = company1.getName();
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification14 = company12.createQualification("hi!");
        boolean boolean16 = company12.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet17 = company12.getQualifications();
        edu.colostate.cs415.model.Worker worker19 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet17, (double) 10L);
        edu.colostate.cs415.model.ProjectSize projectSize20 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project21 = company1.createProject("", qualificationSet17, projectSize20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(qualificationSet6);
        org.junit.Assert.assertNotNull(qualificationSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(qualification14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(qualificationSet17);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!:0:0");
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification10 = company8.createQualification("hi!");
        boolean boolean12 = company8.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company8.getQualifications();
        edu.colostate.cs415.model.Worker worker15 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet13, (double) 10L);
        edu.colostate.cs415.model.Project project16 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker15, project16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertNotNull(qualification10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(qualificationSet13);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification10 = company8.createQualification("hi!");
        boolean boolean12 = company8.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company8.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company8.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize15 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project16 = company1.createProject("hi!:0:0:0:0", qualificationSet14, projectSize15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(qualification10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(qualificationSet13);
        org.junit.Assert.assertNotNull(qualificationSet14);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Project project6 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(qualification5);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Company company4 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str5 = company4.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company4.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company4.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) ' ');
        edu.colostate.cs415.model.Project project10 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker9, project10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0:0:0" + "'", str5, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(qualificationSet7);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO4 = qualification3.toDTO();
        boolean boolean6 = qualification3.equals((java.lang.Object) 10.0d);
        edu.colostate.cs415.model.Worker worker7 = null;
        qualification3.addWorker(worker7);
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.dto.QualificationDTO qualificationDTO9 = qualification3.toDTO();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(qualificationDTO4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Project project6 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(workerSet5);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnassignedWorkers();
        edu.colostate.cs415.model.Project project8 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(qualificationSet6);
        org.junit.Assert.assertNotNull(workerSet7);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = qualification4.getWorkers();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification9 = company7.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = qualification9.getWorkers();
        boolean boolean11 = qualification4.equals((java.lang.Object) qualification9);
        edu.colostate.cs415.model.Worker worker12 = null;
        qualification9.addWorker(worker12);
        edu.colostate.cs415.model.Company company15 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification17 = company15.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet18 = qualification17.getWorkers();
        boolean boolean19 = qualification9.equals((java.lang.Object) workerSet18);
        edu.colostate.cs415.model.Company company21 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet22 = company21.getEmployedWorkers();
        boolean boolean23 = qualification9.equals((java.lang.Object) company21);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet24 = company21.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize25 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project26 = new edu.colostate.cs415.model.Project("hi!", qualificationSet24, projectSize25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(qualification17);
        org.junit.Assert.assertNotNull(workerSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(workerSet22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(qualificationSet24);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Company company13 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification15 = company13.createQualification("hi!");
        boolean boolean17 = company13.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet18 = company13.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet19 = company13.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker21 = company1.createWorker("", qualificationSet19, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Worker name cannot be empty or null");
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
        org.junit.Assert.assertNotNull(qualification15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(qualificationSet18);
        org.junit.Assert.assertNotNull(qualificationSet19);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.lang.Class<?> wildcardClass5 = company1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        boolean boolean10 = company6.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company6.getQualifications();
        edu.colostate.cs415.model.Worker worker13 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet11, (double) 10L);
        edu.colostate.cs415.model.Project project14 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker13, project14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(qualificationSet11);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Project project5 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(workerSet4);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Description cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!:0:0", qualificationSet7, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Salary must be positive number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(qualificationSet7);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
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
        edu.colostate.cs415.model.Qualification qualification24 = company20.createQualification("hi!");
        edu.colostate.cs415.model.Company company27 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification29 = company27.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet30 = qualification29.getWorkers();
        edu.colostate.cs415.model.Company company32 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification34 = company32.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet35 = qualification34.getWorkers();
        boolean boolean36 = qualification29.equals((java.lang.Object) qualification34);
        edu.colostate.cs415.model.Worker worker37 = null;
        qualification34.addWorker(worker37);
        edu.colostate.cs415.model.Company company40 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification42 = company40.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet43 = qualification42.getWorkers();
        boolean boolean44 = qualification34.equals((java.lang.Object) workerSet43);
        edu.colostate.cs415.model.Company company46 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet47 = company46.getEmployedWorkers();
        boolean boolean48 = qualification34.equals((java.lang.Object) company46);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet49 = company46.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize50 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project51 = company20.createProject("hi!:0:0:0:0", qualificationSet49, projectSize50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null or empty");
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
        org.junit.Assert.assertNotNull(qualification24);
        org.junit.Assert.assertNotNull(qualification29);
        org.junit.Assert.assertNotNull(workerSet30);
        org.junit.Assert.assertNotNull(qualification34);
        org.junit.Assert.assertNotNull(workerSet35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(qualification42);
        org.junit.Assert.assertNotNull(workerSet43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(workerSet47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(qualificationSet49);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.lang.String str4 = company1.getName();
        edu.colostate.cs415.model.Project project5 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!:0:0" + "'", str4, "hi!:0:0");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
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
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet29 = company26.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize30 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project31 = company1.createProject("", qualificationSet29, projectSize30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(workerSet4);
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
        org.junit.Assert.assertNotNull(qualificationSet29);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getUnassignedWorkers();
        java.lang.Class<?> wildcardClass10 = workerSet9.getClass();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str12 = company11.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company11.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company11.getQualifications();
        edu.colostate.cs415.model.Worker worker16 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet14, (double) ' ');
        edu.colostate.cs415.model.Project project17 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker16, project17);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!:0:0:0:0" + "'", str12, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet13);
        org.junit.Assert.assertNotNull(qualificationSet14);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        java.lang.Object obj6 = null;
        boolean boolean7 = company1.equals(obj6);
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0:0:0");
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str13 = company12.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company12.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet15 = company12.getQualifications();
        edu.colostate.cs415.model.Worker worker17 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet15, (double) ' ');
        edu.colostate.cs415.model.Project project18 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker17, project18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!:0:0:0:0" + "'", str13, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertNotNull(qualificationSet15);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Worker worker9 = null;
        edu.colostate.cs415.model.Project project10 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker9, project10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(qualificationSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(workerSet8);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            worker7.setSalary((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: salary can not be a negative number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualificationSet5);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = qualification13.getWorkers();
        edu.colostate.cs415.model.Company company16 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification18 = company16.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet19 = qualification18.getWorkers();
        boolean boolean20 = qualification13.equals((java.lang.Object) qualification18);
        edu.colostate.cs415.model.Worker worker21 = null;
        qualification18.addWorker(worker21);
        edu.colostate.cs415.model.Company company24 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification26 = company24.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet27 = qualification26.getWorkers();
        boolean boolean28 = qualification18.equals((java.lang.Object) workerSet27);
        edu.colostate.cs415.model.Company company30 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet31 = company30.getEmployedWorkers();
        boolean boolean32 = qualification18.equals((java.lang.Object) company30);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet33 = company30.getQualifications();
        boolean boolean34 = company1.equals((java.lang.Object) company30);
        edu.colostate.cs415.model.Project project35 = null;
        // The following exception was thrown during execution in test generation
        try {
            company30.start(project35);
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
        org.junit.Assert.assertNotNull(qualification13);
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertNotNull(qualification18);
        org.junit.Assert.assertNotNull(workerSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(qualification26);
        org.junit.Assert.assertNotNull(workerSet27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(workerSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(qualificationSet33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getEmployedWorkers();
        boolean boolean8 = company1.equals((java.lang.Object) 10);
        edu.colostate.cs415.model.Project project9 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        edu.colostate.cs415.model.Project project8 = null;
        // The following exception was thrown during execution in test generation
        try {
            worker7.removeProject(project8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: project cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualificationSet5);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str8 = company7.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company7.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company7.getQualifications();
        edu.colostate.cs415.model.Worker worker12 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet10, (double) ' ');
        edu.colostate.cs415.model.Project project13 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker12, project13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!:0:0:0:0" + "'", str8, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(qualificationSet10);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str11 = company10.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company10.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company10.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker15 = company1.createWorker("hi!:0:0", qualificationSet13, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be empty or null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!:0:0:0:0" + "'", str11, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet12);
        org.junit.Assert.assertNotNull(qualificationSet13);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
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
        edu.colostate.cs415.model.Qualification qualification24 = company20.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO25 = qualification24.toDTO();
        java.lang.String str26 = qualification24.toString();
        edu.colostate.cs415.model.Company company29 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str30 = company29.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet31 = company29.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet32 = company29.getQualifications();
        edu.colostate.cs415.model.Worker worker34 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet32, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            qualification24.removeWorker(worker34);
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
        org.junit.Assert.assertNotNull(qualification24);
        org.junit.Assert.assertNotNull(qualificationDTO25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!:0:0:0:0" + "'", str30, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet31);
        org.junit.Assert.assertNotNull(qualificationSet32);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        boolean boolean4 = company1.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification12 = company10.createQualification("hi!");
        boolean boolean14 = company10.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet15 = company10.getQualifications();
        edu.colostate.cs415.model.Worker worker17 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet15, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker19 = company1.createWorker("", qualificationSet15, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Worker name cannot be empty or null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(qualificationSet6);
        org.junit.Assert.assertNotNull(qualification12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(qualificationSet15);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.lang.String str6 = company1.getName();
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str10 = company9.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company9.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company9.getQualifications();
        edu.colostate.cs415.model.Worker worker14 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet12, (double) ' ');
        edu.colostate.cs415.model.Project project15 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker14, project15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!:0:0:0:0" + "'", str10, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet11);
        org.junit.Assert.assertNotNull(qualificationSet12);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str12 = company11.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company11.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company11.getQualifications();
        edu.colostate.cs415.model.Worker worker16 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet14, (double) ' ');
        edu.colostate.cs415.model.Project project17 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker16, project17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!:0:0:0:0" + "'", str12, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet13);
        org.junit.Assert.assertNotNull(qualificationSet14);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company5 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str6 = company5.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company5.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company5.getQualifications();
        edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet8, (double) ' ');
        edu.colostate.cs415.model.Project project11 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker10, project11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!:0:0:0:0" + "'", str6, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(qualificationSet8);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str11 = company10.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company10.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company10.getQualifications();
        edu.colostate.cs415.model.Worker worker15 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet13, (double) ' ');
        edu.colostate.cs415.model.Project project16 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker15, project16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!:0:0:0:0" + "'", str11, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet12);
        org.junit.Assert.assertNotNull(qualificationSet13);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        edu.colostate.cs415.model.Company company3 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification5 = company3.createQualification("hi!");
        boolean boolean7 = company3.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company3.getQualifications();
        edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet8, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker12 = new edu.colostate.cs415.model.Worker("", qualificationSet8, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Worker name cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(qualificationSet8);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Project project5 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(workerSet4);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        boolean boolean10 = company6.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company6.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize12 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project13 = company1.createProject("hi!:0:0", qualificationSet11, projectSize12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(qualificationSet11);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAvailableWorkers();
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
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.lang.String str6 = company1.getName();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification10 = company8.createQualification("hi!");
        edu.colostate.cs415.model.Company company13 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification15 = company13.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company13.getUnassignedWorkers();
        java.lang.String str17 = company13.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet18 = company13.getProjects();
        java.lang.String str19 = company13.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet20 = company13.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet21 = company13.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet22 = company13.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet23 = company13.getQualifications();
        edu.colostate.cs415.model.Worker worker25 = company8.createWorker("hi!", qualificationSet23, 1.0d);
        edu.colostate.cs415.model.Project project26 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker25, project26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(qualification10);
        org.junit.Assert.assertNotNull(qualification15);
        org.junit.Assert.assertNotNull(workerSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!:0:0" + "'", str17, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!:0:0" + "'", str19, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet20);
        org.junit.Assert.assertNotNull(workerSet21);
        org.junit.Assert.assertNotNull(workerSet22);
        org.junit.Assert.assertNotNull(qualificationSet23);
        org.junit.Assert.assertNotNull(worker25);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification9 = company7.createQualification("hi!");
        boolean boolean11 = company7.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company7.getQualifications();
        edu.colostate.cs415.model.Worker worker14 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet12, (double) 10L);
        edu.colostate.cs415.model.Project project15 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker14, project15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(qualificationSet12);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.lang.String str9 = company1.toString();
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str13 = company12.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company12.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet15 = company12.getQualifications();
        edu.colostate.cs415.model.Worker worker17 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet15, (double) ' ');
        edu.colostate.cs415.model.Project project18 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker17, project18);
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!:0:0" + "'", str9, "hi!:0:0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!:0:0:0:0" + "'", str13, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertNotNull(qualificationSet15);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
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
        edu.colostate.cs415.model.Company company32 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification34 = company32.createQualification("hi!");
        boolean boolean36 = company32.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet37 = company32.getQualifications();
        edu.colostate.cs415.model.Worker worker39 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet37, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            qualification3.removeWorker(worker39);
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
        org.junit.Assert.assertNotNull(qualification34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(qualificationSet37);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet24 = company20.getEmployedWorkers();
        edu.colostate.cs415.model.Qualification qualification26 = company20.createQualification("hi!:0:0");
        edu.colostate.cs415.model.Company company29 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str30 = company29.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet31 = company29.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet32 = company29.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet33 = company29.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize34 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project35 = company20.createProject("", qualificationSet33, projectSize34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project name cannot be null or empty");
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
        org.junit.Assert.assertNotNull(qualification26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!:0:0" + "'", str30, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet31);
        org.junit.Assert.assertNotNull(workerSet32);
        org.junit.Assert.assertNotNull(qualificationSet33);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.lang.String str4 = company1.getName();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str8 = company7.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company7.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company7.getQualifications();
        edu.colostate.cs415.model.Worker worker12 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet10, (double) ' ');
        edu.colostate.cs415.model.Project project13 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker12, project13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!:0:0" + "'", str4, "hi!:0:0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!:0:0:0:0" + "'", str8, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(qualificationSet10);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
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
        edu.colostate.cs415.model.Qualification qualification24 = company20.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO25 = qualification24.toDTO();
        java.lang.Class<?> wildcardClass26 = qualificationDTO25.getClass();
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
        org.junit.Assert.assertNotNull(qualification24);
        org.junit.Assert.assertNotNull(qualificationDTO25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification14 = company12.createQualification("hi!");
        boolean boolean16 = company12.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet17 = company12.getQualifications();
        edu.colostate.cs415.model.Worker worker19 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet17, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker21 = company1.createWorker("", qualificationSet17, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Worker name cannot be empty or null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(qualificationSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(qualification14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(qualificationSet17);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company1.getQualifications();
        edu.colostate.cs415.model.Company company14 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification16 = company14.createQualification("hi!");
        boolean boolean18 = company14.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet19 = company14.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize20 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project21 = company1.createProject("hi!:0:0", qualificationSet19, projectSize20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(qualificationSet11);
        org.junit.Assert.assertNotNull(qualification16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(qualificationSet19);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        boolean boolean4 = company1.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str9 = company8.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company8.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company8.getQualifications();
        edu.colostate.cs415.model.Worker worker13 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet11, (double) ' ');
        edu.colostate.cs415.model.Project project14 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker13, project14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!:0:0:0:0" + "'", str9, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertNotNull(qualificationSet11);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        java.lang.String str4 = company1.getName();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str8 = company7.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company7.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company7.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize11 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project12 = company1.createProject("hi!:0:0", qualificationSet10, projectSize11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!:0:0:0:0" + "'", str8, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(qualificationSet10);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet1 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker3 = new edu.colostate.cs415.model.Worker("hi!:0:0", qualificationSet1, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAssignedWorkers();
        java.lang.Class<?> wildcardClass9 = workerSet8.getClass();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Description cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Company company5 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str6 = company5.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet7 = company5.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company5.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet9 = company5.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize10 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project11 = company1.createProject("hi!:0:0", qualificationSet9, projectSize10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!:0:0" + "'", str6, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(qualificationSet9);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
        edu.colostate.cs415.model.Project project19 = null;
        // The following exception was thrown during execution in test generation
        try {
            worker18.removeProject(project19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: project cannot be null");
        } catch (java.lang.NullPointerException e) {
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

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
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
        edu.colostate.cs415.model.Project project19 = null;
        // The following exception was thrown during execution in test generation
        try {
            worker18.addProject(project19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: project can not be null");
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

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company2.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!:0:0", qualificationSet8, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Salary must be positive number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(qualificationSet7);
        org.junit.Assert.assertNotNull(qualificationSet8);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        edu.colostate.cs415.model.Project project7 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertNotNull(projectSet6);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
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
        java.lang.Class<?> wildcardClass21 = qualificationDTO20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet10 = company1.getProjects();
        java.lang.Class<?> wildcardClass11 = company1.getClass();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(projectSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        java.lang.String str4 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAssignedWorkers();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!:0:0" + "'", str4, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet5);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Company company13 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str14 = company13.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company13.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet16 = company13.getQualifications();
        edu.colostate.cs415.model.Worker worker18 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet16, (double) ' ');
        edu.colostate.cs415.model.Project project19 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker18, project19);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!:0:0:0:0" + "'", str14, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet15);
        org.junit.Assert.assertNotNull(qualificationSet16);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification12 = company10.createQualification("hi!");
        boolean boolean14 = company10.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet15 = company10.getQualifications();
        edu.colostate.cs415.model.Worker worker17 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet15, (double) 10L);
        edu.colostate.cs415.model.Project project18 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker17, project18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(qualification12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(qualificationSet15);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str8 = company7.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company7.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company7.getQualifications();
        edu.colostate.cs415.model.Worker worker12 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet10, (double) ' ');
        edu.colostate.cs415.model.Project project13 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker12, project13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!:0:0:0:0" + "'", str8, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(qualificationSet10);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
        edu.colostate.cs415.model.Company company50 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str51 = company50.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet52 = company50.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet53 = company50.getQualifications();
        edu.colostate.cs415.model.Worker worker55 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet53, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            qualification8.removeWorker(worker55);
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
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!:0:0:0:0" + "'", str51, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet52);
        org.junit.Assert.assertNotNull(qualificationSet53);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        edu.colostate.cs415.model.Project project5 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(workerSet4);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
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
        java.lang.Class<?> wildcardClass30 = qualification3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Project project5 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(workerSet4);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
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
        java.lang.Class<?> wildcardClass24 = qualificationSet23.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
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
        edu.colostate.cs415.model.Company company30 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str31 = company30.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet32 = company30.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet33 = company30.getQualifications();
        edu.colostate.cs415.model.Worker worker35 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet33, (double) ' ');
        edu.colostate.cs415.model.Project project36 = null;
        // The following exception was thrown during execution in test generation
        try {
            company20.unassign(worker35, project36);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!:0:0:0:0" + "'", str31, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet32);
        org.junit.Assert.assertNotNull(qualificationSet33);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        boolean boolean4 = company1.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        edu.colostate.cs415.model.Project project7 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(projectSet6);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        java.lang.Object obj6 = null;
        boolean boolean7 = company1.equals(obj6);
        java.lang.String str8 = company1.getName();
        edu.colostate.cs415.model.Project project9 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!:0:0" + "'", str8, "hi!:0:0");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str11 = company10.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company10.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company10.getQualifications();
        edu.colostate.cs415.model.Worker worker15 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet13, (double) ' ');
        edu.colostate.cs415.model.Project project16 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker15, project16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!:0:0:0:0" + "'", str11, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet12);
        org.junit.Assert.assertNotNull(qualificationSet13);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize6 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project7 = new edu.colostate.cs415.model.Project("hi!:0:0:0:0", qualificationSet5, projectSize6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualificationSet5);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.lang.String str6 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet7 = company2.getProjects();
        java.lang.String str8 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company2.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company2.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company2.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize13 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project14 = new edu.colostate.cs415.model.Project("hi!:0:0:0:0", qualificationSet12, projectSize13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!:0:0" + "'", str6, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!:0:0" + "'", str8, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertNotNull(workerSet11);
        org.junit.Assert.assertNotNull(qualificationSet12);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Project project5 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(workerSet4);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification12 = company10.createQualification("hi!");
        boolean boolean14 = company10.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet15 = company10.getQualifications();
        edu.colostate.cs415.model.Worker worker17 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet15, (double) 10L);
        edu.colostate.cs415.model.Project project18 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker17, project18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualification12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(qualificationSet15);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getEmployedWorkers();
        boolean boolean8 = company1.equals((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Qualification qualification10 = company1.createQualification("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Description cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        edu.colostate.cs415.model.Company company3 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str4 = company3.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company3.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company3.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) ' ');
        edu.colostate.cs415.model.ProjectSize projectSize9 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project10 = new edu.colostate.cs415.model.Project("hi!:0:0:0:0", qualificationSet6, projectSize9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!:0:0:0:0" + "'", str4, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(qualificationSet6);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str12 = company11.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company11.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company11.getQualifications();
        edu.colostate.cs415.model.Worker worker16 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet14, 0.0d);
        edu.colostate.cs415.model.Project project17 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker16, project17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(qualificationSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!:0:0:0:0" + "'", str12, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet13);
        org.junit.Assert.assertNotNull(qualificationSet14);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.lang.String str5 = company1.toString();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Qualification qualification7 = company1.createQualification("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Description cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str8 = company7.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company7.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company7.getQualifications();
        edu.colostate.cs415.model.Worker worker12 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet10, (double) ' ');
        edu.colostate.cs415.model.Project project13 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker12, project13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!:0:0:0:0" + "'", str8, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(qualificationSet10);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = qualification8.getWorkers();
        boolean boolean10 = qualification3.equals((java.lang.Object) qualification8);
        edu.colostate.cs415.model.Worker worker11 = null;
        qualification3.addWorker(worker11);
        java.lang.String str13 = qualification3.toString();
        java.lang.String str14 = qualification3.toString();
        java.lang.String str15 = qualification3.toString();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.dto.QualificationDTO qualificationDTO16 = qualification3.toDTO();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getEmployedWorkers();
        java.lang.String str10 = company1.getName();
        edu.colostate.cs415.model.Project project11 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project11);
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize7 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project8 = new edu.colostate.cs415.model.Project("hi!", qualificationSet6, projectSize7);
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
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification12 = company10.createQualification("hi!");
        boolean boolean14 = company10.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet15 = company10.getQualifications();
        edu.colostate.cs415.model.Worker worker17 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet15, (double) 10L);
        edu.colostate.cs415.model.Project project18 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker17, project18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(qualification12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(qualificationSet15);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
        edu.colostate.cs415.model.Company company28 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str29 = company28.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet30 = company28.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet31 = company28.getQualifications();
        edu.colostate.cs415.model.Worker worker33 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet31, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker35 = company20.createWorker("", qualificationSet31, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Worker name cannot be empty or null");
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!:0:0:0:0" + "'", str29, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet30);
        org.junit.Assert.assertNotNull(qualificationSet31);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.lang.String str4 = company1.getName();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company7.getUnavailableWorkers();
        boolean boolean10 = company7.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company7.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company7.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize13 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project14 = company1.createProject("hi!:0:0:0:0", qualificationSet12, projectSize13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!:0:0" + "'", str4, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(workerSet11);
        org.junit.Assert.assertNotNull(qualificationSet12);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, 0.0d);
        edu.colostate.cs415.model.Project project8 = null;
        // The following exception was thrown during execution in test generation
        try {
            worker7.removeProject(project8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: project cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualificationSet5);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        edu.colostate.cs415.model.Company company3 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str4 = company3.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company3.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company3.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("", qualificationSet6, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Worker name cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!:0:0:0:0" + "'", str4, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(qualificationSet6);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str8 = company7.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company7.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company7.getQualifications();
        edu.colostate.cs415.model.Worker worker12 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet10, 0.0d);
        edu.colostate.cs415.model.Project project13 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker12, project13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!:0:0:0:0" + "'", str8, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(qualificationSet10);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        java.lang.Object obj6 = null;
        boolean boolean7 = company1.equals(obj6);
        java.lang.String str8 = company1.getName();
        java.lang.Class<?> wildcardClass9 = company1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!:0:0" + "'", str8, "hi!:0:0");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        boolean boolean15 = company11.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet16 = company11.getQualifications();
        edu.colostate.cs415.model.Worker worker18 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet16, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker20 = company1.createWorker("hi!", qualificationSet16, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Salary cannot be less than or equal to zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(qualification13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(qualificationSet16);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
        edu.colostate.cs415.model.Qualification qualification24 = company20.createQualification("hi!");
        edu.colostate.cs415.model.Company company26 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet27 = company26.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet28 = company26.getProjects();
        boolean boolean29 = qualification24.equals((java.lang.Object) projectSet28);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet30 = qualification24.getWorkers();
        edu.colostate.cs415.model.Company company33 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification35 = company33.createQualification("hi!");
        boolean boolean37 = company33.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet38 = company33.getQualifications();
        edu.colostate.cs415.model.Worker worker40 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet38, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            qualification24.removeWorker(worker40);
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
        org.junit.Assert.assertNotNull(qualification24);
        org.junit.Assert.assertNotNull(workerSet27);
        org.junit.Assert.assertNotNull(projectSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(workerSet30);
        org.junit.Assert.assertNotNull(qualification35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(qualificationSet38);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, 0.0d);
        edu.colostate.cs415.model.Project project8 = null;
        // The following exception was thrown during execution in test generation
        try {
            worker7.addProject(project8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: project can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualificationSet5);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company1.getQualifications();
        java.lang.String str8 = company1.getName();
        edu.colostate.cs415.model.Project project9 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(qualificationSet6);
        org.junit.Assert.assertNotNull(qualificationSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Project project6 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(workerSet5);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        boolean boolean10 = company6.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company6.getQualifications();
        edu.colostate.cs415.model.Worker worker13 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet11, (double) 10L);
        edu.colostate.cs415.model.Project project14 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker13, project14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(qualificationSet11);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getAssignedWorkers();
        java.lang.Class<?> wildcardClass3 = company1.getClass();
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        java.lang.String str4 = company1.getName();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification9 = company7.createQualification("hi!");
        boolean boolean11 = company7.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company7.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker14 = company1.createWorker("hi!", qualificationSet12, (double) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualification is not in the company set");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(qualificationSet12);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
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
        java.lang.String str20 = qualification3.toString();
        java.lang.Class<?> wildcardClass21 = qualification3.getClass();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, 0.0d);
        edu.colostate.cs415.model.Project project8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = worker7.willOverload(project8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: project can not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualificationSet5);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getEmployedWorkers();
        java.lang.String str10 = company1.toString();
        boolean boolean12 = company1.equals((java.lang.Object) (short) 1);
        edu.colostate.cs415.model.Company company15 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification17 = company15.createQualification("hi!");
        boolean boolean19 = company15.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet20 = company15.getQualifications();
        edu.colostate.cs415.model.Worker worker22 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet20, (double) 10L);
        edu.colostate.cs415.model.Project project23 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker22, project23);
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!:0:0" + "'", str10, "hi!:0:0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(qualification17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(qualificationSet20);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Worker worker4 = null;
        qualification3.addWorker(worker4);
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.dto.QualificationDTO qualificationDTO6 = qualification3.toDTO();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        edu.colostate.cs415.model.Project project4 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Project project6 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(qualification5);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnassignedWorkers();
        edu.colostate.cs415.model.Project project3 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Project project4 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getEmployedWorkers();
        java.lang.Class<?> wildcardClass8 = workerSet7.getClass();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Project project6 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(workerSet5);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Project project9 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project9);
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
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str9 = company8.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company8.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company8.getQualifications();
        edu.colostate.cs415.model.Worker worker13 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet11, 0.0d);
        edu.colostate.cs415.model.Project project14 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker13, project14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!:0:0:0:0" + "'", str9, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertNotNull(qualificationSet11);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = qualification13.getWorkers();
        edu.colostate.cs415.model.Company company16 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification18 = company16.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet19 = qualification18.getWorkers();
        boolean boolean20 = qualification13.equals((java.lang.Object) qualification18);
        edu.colostate.cs415.model.Worker worker21 = null;
        qualification18.addWorker(worker21);
        edu.colostate.cs415.model.Company company24 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification26 = company24.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet27 = qualification26.getWorkers();
        boolean boolean28 = qualification18.equals((java.lang.Object) workerSet27);
        edu.colostate.cs415.model.Company company30 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet31 = company30.getEmployedWorkers();
        boolean boolean32 = qualification18.equals((java.lang.Object) company30);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet33 = company30.getQualifications();
        boolean boolean34 = company1.equals((java.lang.Object) company30);
        java.lang.String str35 = company1.getName();
        edu.colostate.cs415.model.Company company37 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification39 = company37.createQualification("hi!");
        edu.colostate.cs415.model.Company company42 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification44 = company42.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet45 = company42.getUnassignedWorkers();
        java.lang.String str46 = company42.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet47 = company42.getProjects();
        java.lang.String str48 = company42.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet49 = company42.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet50 = company42.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet51 = company42.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet52 = company42.getQualifications();
        edu.colostate.cs415.model.Worker worker54 = company37.createWorker("hi!", qualificationSet52, 1.0d);
        edu.colostate.cs415.model.Project project55 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker54, project55);
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
        org.junit.Assert.assertNotNull(qualification13);
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertNotNull(qualification18);
        org.junit.Assert.assertNotNull(workerSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(qualification26);
        org.junit.Assert.assertNotNull(workerSet27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(workerSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(qualificationSet33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(qualification39);
        org.junit.Assert.assertNotNull(qualification44);
        org.junit.Assert.assertNotNull(workerSet45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!:0:0" + "'", str46, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!:0:0" + "'", str48, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet49);
        org.junit.Assert.assertNotNull(workerSet50);
        org.junit.Assert.assertNotNull(workerSet51);
        org.junit.Assert.assertNotNull(qualificationSet52);
        org.junit.Assert.assertNotNull(worker54);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str7 = company6.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company6.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet9 = company6.getQualifications();
        edu.colostate.cs415.model.Worker worker11 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet9, (double) ' ');
        edu.colostate.cs415.model.Project project12 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker11, project12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0:0:0" + "'", str7, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(qualificationSet9);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company1.getUnavailableWorkers();
        java.lang.Class<?> wildcardClass11 = workerSet10.getClass();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet5 = company1.getProjects();
        edu.colostate.cs415.model.Project project6 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(projectSet5);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.lang.String str4 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Project project6 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!:0:0" + "'", str4, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet5);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str11 = company10.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company10.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company10.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize14 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project15 = company1.createProject("hi!:0:0:0:0", qualificationSet13, projectSize14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!:0:0:0:0" + "'", str11, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet12);
        org.junit.Assert.assertNotNull(qualificationSet13);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("", qualificationSet5, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Worker name cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualificationSet5);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        edu.colostate.cs415.model.Project project19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = worker18.willOverload(project19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: project can not be null");
        } catch (java.lang.NullPointerException e) {
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

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        edu.colostate.cs415.model.Company company14 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification16 = company14.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = company14.getUnassignedWorkers();
        java.lang.String str18 = company14.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet19 = company14.getProjects();
        java.lang.String str20 = company14.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet21 = company14.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet22 = company14.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = company14.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet24 = company14.getQualifications();
        edu.colostate.cs415.model.Worker worker26 = company9.createWorker("hi!", qualificationSet24, 1.0d);
        edu.colostate.cs415.model.Project project27 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker26, project27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(qualification11);
        org.junit.Assert.assertNotNull(qualification16);
        org.junit.Assert.assertNotNull(workerSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!:0:0" + "'", str18, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!:0:0" + "'", str20, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet21);
        org.junit.Assert.assertNotNull(workerSet22);
        org.junit.Assert.assertNotNull(workerSet23);
        org.junit.Assert.assertNotNull(qualificationSet24);
        org.junit.Assert.assertNotNull(worker26);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        edu.colostate.cs415.model.Qualification qualification1 = new edu.colostate.cs415.model.Qualification("hi!:0:0");
        edu.colostate.cs415.model.Company company3 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str4 = company3.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company3.getAssignedWorkers();
        java.lang.String str6 = company3.getName();
        boolean boolean7 = qualification1.equals((java.lang.Object) str6);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = qualification1.getWorkers();
        java.lang.String str9 = qualification1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!:0:0:0:0" + "'", str4, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!:0:0" + "'", str6, "hi!:0:0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!:0:0" + "'", str9, "hi!:0:0");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company6.getAssignedWorkers();
        boolean boolean9 = company6.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company6.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize11 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project12 = company1.createProject("hi!", qualificationSet10, projectSize11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(qualificationSet10);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        java.lang.Class<?> wildcardClass20 = workerSet19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        boolean boolean10 = company6.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company6.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company6.getQualifications();
        boolean boolean13 = company2.equals((java.lang.Object) qualificationSet12);
        edu.colostate.cs415.model.ProjectSize projectSize14 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project15 = new edu.colostate.cs415.model.Project("hi!", qualificationSet12, projectSize14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(qualificationSet11);
        org.junit.Assert.assertNotNull(qualificationSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnassignedWorkers();
        edu.colostate.cs415.model.Project project8 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(workerSet7);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company1.getQualifications();
        edu.colostate.cs415.model.Project project8 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(qualificationSet6);
        org.junit.Assert.assertNotNull(qualificationSet7);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company1.getQualifications();
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0");
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification14 = company12.createQualification("hi!");
        boolean boolean16 = company12.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet17 = company12.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet18 = company12.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize19 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project20 = company1.createProject("hi!:0:0:0:0", qualificationSet18, projectSize19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(qualificationSet6);
        org.junit.Assert.assertNotNull(qualificationSet7);
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertNotNull(qualification14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(qualificationSet17);
        org.junit.Assert.assertNotNull(qualificationSet18);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        boolean boolean10 = company6.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company6.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company6.getQualifications();
        boolean boolean13 = company2.equals((java.lang.Object) qualificationSet12);
        edu.colostate.cs415.model.ProjectSize projectSize14 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project15 = new edu.colostate.cs415.model.Project("", qualificationSet12, projectSize14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(qualificationSet11);
        org.junit.Assert.assertNotNull(qualificationSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
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
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet37 = company29.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet38 = company29.getUnavailableWorkers();
        java.lang.Class<?> wildcardClass39 = company29.getClass();
        boolean boolean40 = company20.equals((java.lang.Object) wildcardClass39);
        edu.colostate.cs415.model.Project project41 = null;
        // The following exception was thrown during execution in test generation
        try {
            company20.start(project41);
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
        org.junit.Assert.assertNotNull(workerSet38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet1 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker3 = new edu.colostate.cs415.model.Worker("", qualificationSet1, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Worker name cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet24 = company20.getEmployedWorkers();
        edu.colostate.cs415.model.Qualification qualification26 = company20.createQualification("hi!:0:0");
        edu.colostate.cs415.model.Company company29 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str30 = company29.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet31 = company29.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet32 = company29.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize33 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project34 = company20.createProject("hi!:0:0", qualificationSet32, projectSize33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null or empty");
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
        org.junit.Assert.assertNotNull(qualification26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!:0:0:0:0" + "'", str30, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet31);
        org.junit.Assert.assertNotNull(qualificationSet32);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getAssignedWorkers();
        boolean boolean4 = company1.equals((java.lang.Object) 0);
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company11.getUnassignedWorkers();
        java.lang.String str15 = company11.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet16 = company11.getProjects();
        java.lang.String str17 = company11.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet18 = company11.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet19 = company11.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet20 = company11.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet21 = company11.getQualifications();
        edu.colostate.cs415.model.Worker worker23 = company6.createWorker("hi!", qualificationSet21, 1.0d);
        edu.colostate.cs415.model.Project project24 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker23, project24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertNotNull(qualification13);
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!:0:0" + "'", str15, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!:0:0" + "'", str17, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet18);
        org.junit.Assert.assertNotNull(workerSet19);
        org.junit.Assert.assertNotNull(workerSet20);
        org.junit.Assert.assertNotNull(qualificationSet21);
        org.junit.Assert.assertNotNull(worker23);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet5 = company1.getProjects();
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet7 = company1.getProjects();
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet11 = company10.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company10.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company14 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification16 = company14.createQualification("hi!");
        boolean boolean18 = company14.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet19 = company14.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet20 = company14.getQualifications();
        boolean boolean21 = company10.equals((java.lang.Object) qualificationSet20);
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker23 = company1.createWorker("", qualificationSet20, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Worker name cannot be empty or null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(projectSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!:0:0" + "'", str6, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet7);
        org.junit.Assert.assertNotNull(projectSet11);
        org.junit.Assert.assertNotNull(workerSet12);
        org.junit.Assert.assertNotNull(qualification16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(qualificationSet19);
        org.junit.Assert.assertNotNull(qualificationSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet24 = company20.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet25 = company20.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company28 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str29 = company28.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet30 = company28.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet31 = company28.getQualifications();
        edu.colostate.cs415.model.Worker worker33 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet31, 0.0d);
        edu.colostate.cs415.model.Project project34 = null;
        // The following exception was thrown during execution in test generation
        try {
            company20.unassign(worker33, project34);
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
        org.junit.Assert.assertNotNull(workerSet25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!:0:0:0:0" + "'", str29, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet30);
        org.junit.Assert.assertNotNull(qualificationSet31);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification10 = company8.createQualification("hi!");
        boolean boolean12 = company8.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company8.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company8.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize15 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project16 = company1.createProject("hi!:0:0:0:0", qualificationSet14, projectSize15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualification10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(qualificationSet13);
        org.junit.Assert.assertNotNull(qualificationSet14);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        boolean boolean4 = company1.equals((java.lang.Object) "");
        java.lang.String str5 = company1.getName();
        edu.colostate.cs415.model.Project project6 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.lang.String str4 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Qualification qualification7 = company1.createQualification("hi!:0:0:0:0");
        edu.colostate.cs415.model.Project project8 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!:0:0" + "'", str4, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(qualification7);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        boolean boolean4 = company1.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet5 = company1.getProjects();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification10 = company8.createQualification("hi!");
        boolean boolean12 = company8.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company8.getQualifications();
        edu.colostate.cs415.model.Worker worker15 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet13, (double) 10L);
        edu.colostate.cs415.model.Project project16 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker15, project16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(projectSet5);
        org.junit.Assert.assertNotNull(qualification10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(qualificationSet13);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        edu.colostate.cs415.model.Project project4 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet3);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.getName();
        edu.colostate.cs415.model.Qualification qualification4 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification9 = company7.createQualification("hi!");
        boolean boolean11 = company7.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company7.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company7.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize14 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project15 = company1.createProject("", qualificationSet13, projectSize14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(qualificationSet12);
        org.junit.Assert.assertNotNull(qualificationSet13);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet7 = company1.getProjects();
        java.lang.String str8 = company1.toString();
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str12 = company11.getName();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company11.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker15 = company1.createWorker("hi!", qualificationSet13, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be empty or null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertNotNull(projectSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!:0:0" + "'", str8, "hi!:0:0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!:0:0" + "'", str12, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualificationSet13);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        java.lang.String str4 = company1.getName();
        edu.colostate.cs415.model.Project project5 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!:0:0" + "'", str4, "hi!:0:0");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet2 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.lang.Class<?> wildcardClass5 = projectSet4.getClass();
        org.junit.Assert.assertNotNull(projectSet2);
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
        edu.colostate.cs415.model.Company company30 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification32 = company30.createQualification("hi!");
        boolean boolean34 = company30.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet35 = company30.getQualifications();
        edu.colostate.cs415.model.Worker worker37 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet35, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            qualification8.removeWorker(worker37);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(qualification32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(qualificationSet35);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
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
        java.lang.Class<?> wildcardClass21 = qualification3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.getName();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet4 = company2.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker6 = new edu.colostate.cs415.model.Worker("", qualificationSet4, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Worker name cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0" + "'", str3, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualificationSet4);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
        edu.colostate.cs415.model.Qualification qualification24 = company20.createQualification("hi!");
        edu.colostate.cs415.model.Company company26 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet27 = company26.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet28 = company26.getProjects();
        boolean boolean29 = qualification24.equals((java.lang.Object) projectSet28);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet30 = qualification24.getWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet31 = qualification24.getWorkers();
        java.lang.String str32 = qualification24.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet33 = qualification24.getWorkers();
        edu.colostate.cs415.model.Company company36 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str37 = company36.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet38 = company36.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet39 = company36.getQualifications();
        edu.colostate.cs415.model.Worker worker41 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet39, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            qualification24.removeWorker(worker41);
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
        org.junit.Assert.assertNotNull(qualification24);
        org.junit.Assert.assertNotNull(workerSet27);
        org.junit.Assert.assertNotNull(projectSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(workerSet30);
        org.junit.Assert.assertNotNull(workerSet31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(workerSet33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!:0:0:0:0" + "'", str37, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet38);
        org.junit.Assert.assertNotNull(qualificationSet39);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        boolean boolean4 = company1.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Project project6 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(workerSet5);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize6 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project7 = new edu.colostate.cs415.model.Project("hi!:0:0", qualificationSet5, projectSize6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertNotNull(qualificationSet5);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification12 = company10.createQualification("hi!");
        boolean boolean14 = company10.equals((java.lang.Object) 10L);
        java.lang.String str15 = company10.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company10.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet17 = company10.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker19 = company1.createWorker("hi!", qualificationSet17, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Salary cannot be less than or equal to zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(qualification12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(workerSet16);
        org.junit.Assert.assertNotNull(qualificationSet17);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        boolean boolean4 = company1.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        java.lang.String str7 = company1.toString();
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str12 = company11.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company11.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company11.getQualifications();
        edu.colostate.cs415.model.Worker worker16 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet14, (double) ' ');
        edu.colostate.cs415.model.ProjectSize projectSize17 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project18 = company1.createProject("hi!:0:0", qualificationSet14, projectSize17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(qualificationSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!:0:0:0:0" + "'", str12, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet13);
        org.junit.Assert.assertNotNull(qualificationSet14);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company11.getQualifications();
        edu.colostate.cs415.model.Worker worker16 = company1.createWorker("hi!", qualificationSet14, (double) (short) 1);
        edu.colostate.cs415.model.Project project17 = null;
        // The following exception was thrown during execution in test generation
        try {
            worker16.removeProject(project17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: project cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(qualification13);
        org.junit.Assert.assertNotNull(qualificationSet14);
        org.junit.Assert.assertNotNull(worker16);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.Class<?> wildcardClass7 = company1.getClass();
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet5 = company1.getProjects();
        edu.colostate.cs415.model.Project project6 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(projectSet5);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Qualification qualification10 = company1.createQualification("hi!:0:0");
        edu.colostate.cs415.model.Project project11 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(qualification10);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification10 = company8.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company8.getUnassignedWorkers();
        java.lang.String str12 = company8.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet13 = company8.getProjects();
        java.lang.String str14 = company8.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company8.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company8.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = company8.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet18 = company8.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize19 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project20 = company1.createProject("hi!:0:0", qualificationSet18, projectSize19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(qualification10);
        org.junit.Assert.assertNotNull(workerSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!:0:0" + "'", str12, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!:0:0" + "'", str14, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet15);
        org.junit.Assert.assertNotNull(workerSet16);
        org.junit.Assert.assertNotNull(workerSet17);
        org.junit.Assert.assertNotNull(qualificationSet18);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification12 = company10.createQualification("hi!");
        boolean boolean14 = company10.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet15 = company10.getQualifications();
        edu.colostate.cs415.model.Worker worker17 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet15, (double) 10L);
        edu.colostate.cs415.model.ProjectSize projectSize18 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project19 = company1.createProject("hi!", qualificationSet15, projectSize18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertNotNull(qualification12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(qualificationSet15);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet24 = company20.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet25 = company20.getUnassignedWorkers();
        edu.colostate.cs415.model.Project project26 = null;
        // The following exception was thrown during execution in test generation
        try {
            company20.finish(project26);
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
        org.junit.Assert.assertNotNull(workerSet25);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Project project9 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(workerSet8);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Worker worker4 = null;
        qualification3.addWorker(worker4);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = qualification3.getWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = qualification3.getWorkers();
        java.lang.Class<?> wildcardClass8 = workerSet7.getClass();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getAvailableWorkers();
        java.lang.String str7 = company1.toString();
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str11 = company10.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company10.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company10.getQualifications();
        edu.colostate.cs415.model.Worker worker15 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet13, (double) ' ');
        edu.colostate.cs415.model.Project project16 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker15, project16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!:0:0:0:0" + "'", str11, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet12);
        org.junit.Assert.assertNotNull(qualificationSet13);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet7 = company1.getProjects();
        edu.colostate.cs415.model.Project project8 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertNotNull(projectSet7);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet5 = company1.getProjects();
        java.lang.String str6 = company1.getName();
        edu.colostate.cs415.model.Project project7 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(projectSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!:0:0" + "'", str6, "hi!:0:0");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Qualification qualification6 = company1.createQualification("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Description cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(projectSet4);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Project project8 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(workerSet7);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize6 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project7 = new edu.colostate.cs415.model.Project("", qualificationSet5, projectSize6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertNotNull(qualificationSet5);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.lang.String str5 = company1.toString();
        edu.colostate.cs415.model.Project project6 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.Class<?> wildcardClass7 = projectSet6.getClass();
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.lang.String str9 = company1.toString();
        edu.colostate.cs415.model.Worker worker10 = null;
        edu.colostate.cs415.model.Project project11 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker10, project11);
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!:0:0" + "'", str9, "hi!:0:0");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        boolean boolean4 = company1.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Project project9 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(qualificationSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet8);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Project project7 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(workerSet6);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0:0:0");
        edu.colostate.cs415.model.Company company13 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification15 = company13.createQualification("hi!");
        boolean boolean17 = company13.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet18 = company13.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet19 = company13.getQualifications();
        edu.colostate.cs415.model.Worker worker21 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet19, (double) 0L);
        edu.colostate.cs415.model.ProjectSize projectSize22 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project23 = company1.createProject("hi!:0:0:0:0", qualificationSet19, projectSize22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertNotNull(qualification15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(qualificationSet18);
        org.junit.Assert.assertNotNull(qualificationSet19);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        edu.colostate.cs415.model.Company company3 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification5 = company3.createQualification("hi!");
        boolean boolean7 = company3.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company3.getQualifications();
        edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet8, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker12 = new edu.colostate.cs415.model.Worker("", qualificationSet8, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Worker name cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(qualificationSet8);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Qualification qualification8 = company1.createQualification("hi!:0:0");
        edu.colostate.cs415.model.Project project9 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(qualification8);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO21 = qualification3.toDTO();
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
        org.junit.Assert.assertNotNull(qualificationDTO21);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company11.getQualifications();
        edu.colostate.cs415.model.Worker worker16 = company1.createWorker("hi!", qualificationSet14, (double) (short) 1);
        edu.colostate.cs415.model.Project project17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = worker16.willOverload(project17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: project can not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(qualification13);
        org.junit.Assert.assertNotNull(qualificationSet14);
        org.junit.Assert.assertNotNull(worker16);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getEmployedWorkers();
        java.lang.String str10 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company1.getAssignedWorkers();
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
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!:0:0" + "'", str10, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet11);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getAssignedWorkers();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(workerSet4);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getUnavailableWorkers();
        boolean boolean5 = company2.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company2.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize8 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project9 = new edu.colostate.cs415.model.Project("hi!", qualificationSet7, projectSize8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(qualificationSet7);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnassignedWorkers();
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
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification12 = company10.createQualification("hi!");
        edu.colostate.cs415.model.Company company15 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification17 = company15.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet18 = company15.getUnassignedWorkers();
        java.lang.String str19 = company15.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet20 = company15.getProjects();
        java.lang.String str21 = company15.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet22 = company15.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = company15.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet24 = company15.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet25 = company15.getQualifications();
        edu.colostate.cs415.model.Worker worker27 = company10.createWorker("hi!", qualificationSet25, 1.0d);
        edu.colostate.cs415.model.Project project28 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker27, project28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(qualification12);
        org.junit.Assert.assertNotNull(qualification17);
        org.junit.Assert.assertNotNull(workerSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!:0:0" + "'", str19, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!:0:0" + "'", str21, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet22);
        org.junit.Assert.assertNotNull(workerSet23);
        org.junit.Assert.assertNotNull(workerSet24);
        org.junit.Assert.assertNotNull(qualificationSet25);
        org.junit.Assert.assertNotNull(worker27);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getEmployedWorkers();
        boolean boolean8 = company1.equals((java.lang.Object) 10);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company11.getUnassignedWorkers();
        java.lang.String str15 = company11.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet16 = company11.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = company11.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet18 = company11.getEmployedWorkers();
        edu.colostate.cs415.model.Company company21 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification23 = company21.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet24 = company21.getQualifications();
        edu.colostate.cs415.model.Worker worker26 = company11.createWorker("hi!", qualificationSet24, (double) (short) 1);
        edu.colostate.cs415.model.Project project27 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker26, project27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(qualification13);
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!:0:0" + "'", str15, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet16);
        org.junit.Assert.assertNotNull(workerSet17);
        org.junit.Assert.assertNotNull(workerSet18);
        org.junit.Assert.assertNotNull(qualification23);
        org.junit.Assert.assertNotNull(qualificationSet24);
        org.junit.Assert.assertNotNull(worker26);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        boolean boolean10 = company6.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company6.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company6.getQualifications();
        boolean boolean13 = company2.equals((java.lang.Object) qualificationSet12);
        edu.colostate.cs415.model.ProjectSize projectSize14 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project15 = new edu.colostate.cs415.model.Project("hi!:0:0:0:0", qualificationSet12, projectSize14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(qualificationSet11);
        org.junit.Assert.assertNotNull(qualificationSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.lang.String str6 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Project project8 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!:0:0" + "'", str6, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet7);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Company company4 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification6 = company4.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company4.getUnassignedWorkers();
        java.lang.String str8 = company4.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet9 = company4.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company4.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company4.getEmployedWorkers();
        edu.colostate.cs415.model.Company company14 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification16 = company14.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet17 = company14.getQualifications();
        edu.colostate.cs415.model.Worker worker19 = company4.createWorker("hi!", qualificationSet17, (double) (short) 1);
        edu.colostate.cs415.model.Project project20 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker19, project20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(qualification6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!:0:0" + "'", str8, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet9);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertNotNull(workerSet11);
        org.junit.Assert.assertNotNull(qualification16);
        org.junit.Assert.assertNotNull(qualificationSet17);
        org.junit.Assert.assertNotNull(worker19);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getUnavailableWorkers();
        edu.colostate.cs415.model.Qualification qualification6 = company2.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize8 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project9 = new edu.colostate.cs415.model.Project("hi!", qualificationSet7, projectSize8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualification6);
        org.junit.Assert.assertNotNull(qualificationSet7);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        edu.colostate.cs415.model.Company company3 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification5 = company3.createQualification("hi!");
        boolean boolean7 = company3.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company3.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet9 = company3.getQualifications();
        edu.colostate.cs415.model.Worker worker11 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet9, (double) 0L);
        edu.colostate.cs415.model.ProjectSize projectSize12 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project13 = new edu.colostate.cs415.model.Project("hi!:0:0:0:0", qualificationSet9, projectSize12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(qualificationSet8);
        org.junit.Assert.assertNotNull(qualificationSet9);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet8, (double) 0L);
        edu.colostate.cs415.model.Project project11 = null;
        // The following exception was thrown during execution in test generation
        try {
            worker10.addProject(project11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: project can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(qualificationSet7);
        org.junit.Assert.assertNotNull(qualificationSet8);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getEmployedWorkers();
        boolean boolean8 = company1.equals((java.lang.Object) 10);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Project project10 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(workerSet9);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        boolean boolean4 = company1.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet8 = company1.getProjects();
        java.lang.String str9 = company1.getName();
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company11.getUnassignedWorkers();
        java.lang.String str15 = company11.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet16 = company11.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = company11.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet18 = company11.getEmployedWorkers();
        edu.colostate.cs415.model.Company company21 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification23 = company21.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet24 = company21.getQualifications();
        edu.colostate.cs415.model.Worker worker26 = company11.createWorker("hi!", qualificationSet24, (double) (short) 1);
        edu.colostate.cs415.model.Project project27 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker26, project27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(qualificationSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(qualification13);
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!:0:0" + "'", str15, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet16);
        org.junit.Assert.assertNotNull(workerSet17);
        org.junit.Assert.assertNotNull(workerSet18);
        org.junit.Assert.assertNotNull(qualification23);
        org.junit.Assert.assertNotNull(qualificationSet24);
        org.junit.Assert.assertNotNull(worker26);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        edu.colostate.cs415.model.Company company3 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str4 = company3.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet5 = company3.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company3.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company3.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) '#');
        edu.colostate.cs415.model.ProjectSize projectSize10 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project11 = new edu.colostate.cs415.model.Project("hi!:0:0:0:0", qualificationSet7, projectSize10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!:0:0" + "'", str4, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet5);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(qualificationSet7);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet4 = company1.getQualifications();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification9 = company7.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company7.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize11 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project12 = company1.createProject("", qualificationSet10, projectSize11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(qualificationSet4);
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertNotNull(qualificationSet10);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet24 = company20.getEmployedWorkers();
        edu.colostate.cs415.model.Company company26 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification28 = company26.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet29 = company26.getUnassignedWorkers();
        java.lang.String str30 = company26.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet31 = company26.getProjects();
        java.lang.String str32 = company26.toString();
        edu.colostate.cs415.model.Qualification qualification34 = company26.createQualification("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet35 = company26.getAssignedWorkers();
        boolean boolean36 = company20.equals((java.lang.Object) workerSet35);
        edu.colostate.cs415.model.Company company40 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification42 = company40.createQualification("hi!");
        boolean boolean44 = company40.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet45 = company40.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet46 = company40.getQualifications();
        edu.colostate.cs415.model.Worker worker48 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet46, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker50 = company20.createWorker("hi!:0:0:0:0", qualificationSet46, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualification is not in the company set");
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
        org.junit.Assert.assertNotNull(qualification28);
        org.junit.Assert.assertNotNull(workerSet29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!:0:0" + "'", str30, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!:0:0" + "'", str32, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualification34);
        org.junit.Assert.assertNotNull(workerSet35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(qualification42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(qualificationSet45);
        org.junit.Assert.assertNotNull(qualificationSet46);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO34 = qualification32.toDTO();
        edu.colostate.cs415.model.Company company37 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str38 = company37.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet39 = company37.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet40 = company37.getQualifications();
        edu.colostate.cs415.model.Worker worker42 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet40, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            qualification32.removeWorker(worker42);
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
        org.junit.Assert.assertNotNull(qualificationDTO34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!:0:0:0:0" + "'", str38, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet39);
        org.junit.Assert.assertNotNull(qualificationSet40);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company7.getAssignedWorkers();
        boolean boolean9 = company1.equals((java.lang.Object) workerSet8);
        edu.colostate.cs415.model.Project project10 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company11.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company11.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company11.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker16 = company1.createWorker("hi!:0:0", qualificationSet14, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be empty or null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(workerSet12);
        org.junit.Assert.assertNotNull(workerSet13);
        org.junit.Assert.assertNotNull(qualificationSet14);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("", qualificationSet5, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Worker name cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualificationSet5);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet4 = company1.getQualifications();
        edu.colostate.cs415.model.Qualification qualification6 = company1.createQualification("hi!:0:0:0:0");
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        boolean boolean13 = company9.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company9.getQualifications();
        edu.colostate.cs415.model.Worker worker16 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet14, (double) 10L);
        edu.colostate.cs415.model.Project project17 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker16, project17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(qualificationSet4);
        org.junit.Assert.assertNotNull(qualification6);
        org.junit.Assert.assertNotNull(qualification11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(qualificationSet14);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company6.getUnassignedWorkers();
        java.lang.String str10 = company6.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet11 = company6.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company6.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company6.getEmployedWorkers();
        edu.colostate.cs415.model.Company company16 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification18 = company16.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet19 = company16.getQualifications();
        edu.colostate.cs415.model.Worker worker21 = company6.createWorker("hi!", qualificationSet19, (double) (short) 1);
        edu.colostate.cs415.model.Project project22 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker21, project22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!:0:0" + "'", str10, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet11);
        org.junit.Assert.assertNotNull(workerSet12);
        org.junit.Assert.assertNotNull(workerSet13);
        org.junit.Assert.assertNotNull(qualification18);
        org.junit.Assert.assertNotNull(qualificationSet19);
        org.junit.Assert.assertNotNull(worker21);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        java.lang.Object obj6 = null;
        boolean boolean7 = company1.equals(obj6);
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company9.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet11 = company9.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet12 = company9.getProjects();
        java.lang.String str13 = company9.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company9.getAssignedWorkers();
        boolean boolean15 = company1.equals((java.lang.Object) workerSet14);
        java.lang.Class<?> wildcardClass16 = workerSet14.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertNotNull(projectSet11);
        org.junit.Assert.assertNotNull(projectSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!:0:0" + "'", str13, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
        edu.colostate.cs415.model.Qualification qualification24 = company20.createQualification("hi!");
        edu.colostate.cs415.model.Company company27 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification29 = company27.createQualification("hi!");
        boolean boolean31 = company27.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet32 = company27.getQualifications();
        edu.colostate.cs415.model.Worker worker34 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet32, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            qualification24.removeWorker(worker34);
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
        org.junit.Assert.assertNotNull(qualification24);
        org.junit.Assert.assertNotNull(qualification29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(qualificationSet32);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.lang.String str6 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet7 = company2.getProjects();
        java.lang.String str8 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company2.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company2.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company2.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize13 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project14 = new edu.colostate.cs415.model.Project("hi!:0:0", qualificationSet12, projectSize13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!:0:0" + "'", str6, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!:0:0" + "'", str8, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertNotNull(workerSet11);
        org.junit.Assert.assertNotNull(qualificationSet12);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Qualification qualification8 = company1.createQualification("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Description cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(projectSet6);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification9 = company7.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company7.getUnassignedWorkers();
        java.lang.String str11 = company7.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet12 = company7.getProjects();
        java.lang.String str13 = company7.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company7.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company7.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company7.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet17 = company7.getQualifications();
        edu.colostate.cs415.model.Worker worker19 = company2.createWorker("hi!", qualificationSet17, 1.0d);
        edu.colostate.cs415.model.ProjectSize projectSize20 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project21 = new edu.colostate.cs415.model.Project("hi!:0:0:0:0:0:0", qualificationSet17, projectSize20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!:0:0" + "'", str11, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!:0:0" + "'", str13, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertNotNull(workerSet15);
        org.junit.Assert.assertNotNull(workerSet16);
        org.junit.Assert.assertNotNull(qualificationSet17);
        org.junit.Assert.assertNotNull(worker19);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.lang.String str4 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getEmployedWorkers();
        java.lang.Class<?> wildcardClass7 = company1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!:0:0" + "'", str4, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        edu.colostate.cs415.model.Qualification qualification24 = company20.createQualification("hi!");
        edu.colostate.cs415.model.Company company27 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification29 = company27.createQualification("hi!");
        boolean boolean31 = company27.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet32 = company27.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet33 = company27.getQualifications();
        edu.colostate.cs415.model.Worker worker35 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet33, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            qualification24.removeWorker(worker35);
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
        org.junit.Assert.assertNotNull(qualification24);
        org.junit.Assert.assertNotNull(qualification29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(qualificationSet32);
        org.junit.Assert.assertNotNull(qualificationSet33);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification9 = company7.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company7.getUnassignedWorkers();
        java.lang.String str11 = company7.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet12 = company7.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company7.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company7.getEmployedWorkers();
        edu.colostate.cs415.model.Company company17 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification19 = company17.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet20 = company17.getQualifications();
        edu.colostate.cs415.model.Worker worker22 = company7.createWorker("hi!", qualificationSet20, (double) (short) 1);
        edu.colostate.cs415.model.Project project23 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker22, project23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!:0:0" + "'", str11, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet12);
        org.junit.Assert.assertNotNull(workerSet13);
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertNotNull(qualification19);
        org.junit.Assert.assertNotNull(qualificationSet20);
        org.junit.Assert.assertNotNull(worker22);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.getName();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet4 = company2.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize5 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project6 = new edu.colostate.cs415.model.Project("hi!:0:0", qualificationSet4, projectSize5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0" + "'", str3, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualificationSet4);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Qualification qualification7 = company1.createQualification("hi!:0:0");
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification12 = company10.createQualification("hi!");
        boolean boolean14 = company10.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet15 = company10.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker17 = company1.createWorker("", qualificationSet15, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Worker name cannot be empty or null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertNotNull(qualification7);
        org.junit.Assert.assertNotNull(qualification12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(qualificationSet15);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker10 = company1.createWorker("hi!:0:0:0:0", qualificationSet8, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be empty or null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertNotNull(workerSet6);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.lang.String str4 = company1.getName();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str7 = company6.toString();
        boolean boolean8 = company1.equals((java.lang.Object) str7);
        edu.colostate.cs415.model.Project project9 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!:0:0" + "'", str4, "hi!:0:0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet10 = company1.getProjects();
        java.lang.String str11 = company1.getName();
        edu.colostate.cs415.model.Company company13 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company13.getUnavailableWorkers();
        boolean boolean16 = company13.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = company13.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet18 = company13.getProjects();
        boolean boolean19 = company1.equals((java.lang.Object) projectSet18);
        edu.colostate.cs415.model.Company company22 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification24 = company22.createQualification("hi!");
        boolean boolean26 = company22.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet27 = company22.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet28 = company22.getQualifications();
        edu.colostate.cs415.model.Worker worker30 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet28, (double) 0L);
        edu.colostate.cs415.model.Project project31 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker30, project31);
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
        org.junit.Assert.assertNotNull(projectSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(workerSet17);
        org.junit.Assert.assertNotNull(projectSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(qualification24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(qualificationSet27);
        org.junit.Assert.assertNotNull(qualificationSet28);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.Object obj7 = null;
        boolean boolean8 = company1.equals(obj7);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Company company13 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str14 = company13.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company13.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet16 = company13.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize17 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project18 = company1.createProject("", qualificationSet16, projectSize17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!:0:0:0:0" + "'", str14, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet15);
        org.junit.Assert.assertNotNull(qualificationSet16);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Company company4 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str5 = company4.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company4.getProjects();
        boolean boolean7 = company1.equals((java.lang.Object) projectSet6);
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str11 = company10.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet12 = company10.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company10.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company10.getQualifications();
        edu.colostate.cs415.model.Worker worker16 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet14, (double) '#');
        edu.colostate.cs415.model.Project project17 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker16, project17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!:0:0" + "'", str11, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet12);
        org.junit.Assert.assertNotNull(workerSet13);
        org.junit.Assert.assertNotNull(qualificationSet14);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.lang.String str9 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Company company13 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification15 = company13.createQualification("hi!");
        boolean boolean17 = company13.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet18 = company13.getQualifications();
        edu.colostate.cs415.model.Worker worker20 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet18, (double) 10L);
        edu.colostate.cs415.model.Project project21 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker20, project21);
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertNotNull(qualification15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(qualificationSet18);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        edu.colostate.cs415.model.Qualification qualification1 = new edu.colostate.cs415.model.Qualification("hi!");
        java.lang.Class<?> wildcardClass2 = qualification1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification14 = company12.createQualification("hi!");
        boolean boolean16 = company12.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet17 = company12.getQualifications();
        edu.colostate.cs415.model.Worker worker19 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet17, (double) 10L);
        edu.colostate.cs415.model.Project project20 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker19, project20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(qualification14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(qualificationSet17);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
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
        java.lang.String str39 = company29.toString();
        edu.colostate.cs415.model.Project project40 = null;
        // The following exception was thrown during execution in test generation
        try {
            company29.start(project40);
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!:0:0" + "'", str39, "hi!:0:0");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company6.getUnassignedWorkers();
        java.lang.String str10 = company6.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet11 = company6.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company6.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company6.getEmployedWorkers();
        edu.colostate.cs415.model.Company company16 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification18 = company16.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet19 = company16.getQualifications();
        edu.colostate.cs415.model.Worker worker21 = company6.createWorker("hi!", qualificationSet19, (double) (short) 1);
        edu.colostate.cs415.model.Project project22 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker21, project22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!:0:0" + "'", str10, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet11);
        org.junit.Assert.assertNotNull(workerSet12);
        org.junit.Assert.assertNotNull(workerSet13);
        org.junit.Assert.assertNotNull(qualification18);
        org.junit.Assert.assertNotNull(qualificationSet19);
        org.junit.Assert.assertNotNull(worker21);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet8, (double) 0L);
        edu.colostate.cs415.model.Project project11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = worker10.willOverload(project11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: project can not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(qualificationSet7);
        org.junit.Assert.assertNotNull(qualificationSet8);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO4 = qualification3.toDTO();
        boolean boolean6 = qualification3.equals((java.lang.Object) 10.0d);
        edu.colostate.cs415.model.Worker worker7 = null;
        qualification3.addWorker(worker7);
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company10.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet12 = company10.getProjects();
        edu.colostate.cs415.model.Qualification qualification14 = company10.createQualification("hi!");
        boolean boolean15 = qualification3.equals((java.lang.Object) company10);
        edu.colostate.cs415.model.Company company18 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification20 = company18.createQualification("hi!");
        boolean boolean22 = company18.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet23 = company18.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize24 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project25 = company10.createProject("hi!", qualificationSet23, projectSize24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(qualificationDTO4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(workerSet11);
        org.junit.Assert.assertNotNull(projectSet12);
        org.junit.Assert.assertNotNull(qualification14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(qualification20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(qualificationSet23);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = qualification8.getWorkers();
        boolean boolean10 = qualification3.equals((java.lang.Object) qualification8);
        edu.colostate.cs415.model.Worker worker11 = null;
        qualification8.addWorker(worker11);
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.dto.QualificationDTO qualificationDTO13 = qualification8.toDTO();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
        edu.colostate.cs415.model.Qualification qualification24 = company20.createQualification("hi!");
        edu.colostate.cs415.model.Company company27 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str28 = company27.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet29 = company27.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet30 = company27.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet31 = company27.getQualifications();
        edu.colostate.cs415.model.Worker worker33 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet31, (double) '#');
        edu.colostate.cs415.model.Project project34 = null;
        // The following exception was thrown during execution in test generation
        try {
            company20.unassign(worker33, project34);
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
        org.junit.Assert.assertNotNull(qualification24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!:0:0" + "'", str28, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet29);
        org.junit.Assert.assertNotNull(workerSet30);
        org.junit.Assert.assertNotNull(qualificationSet31);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        edu.colostate.cs415.model.Qualification qualification1 = new edu.colostate.cs415.model.Qualification("hi!:0:0:0:0:0:0");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Company company4 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str5 = company4.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company4.getProjects();
        boolean boolean7 = company1.equals((java.lang.Object) projectSet6);
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Worker worker10 = null;
        edu.colostate.cs415.model.Project project11 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker10, project11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(qualification9);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        boolean boolean4 = company1.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet5 = company1.getProjects();
        boolean boolean7 = company1.equals((java.lang.Object) (short) -1);
        java.lang.String str8 = company1.toString();
        edu.colostate.cs415.model.Project project9 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(projectSet5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!:0:0" + "'", str8, "hi!:0:0");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = qualification8.getWorkers();
        boolean boolean10 = qualification3.equals((java.lang.Object) qualification8);
        java.lang.String str11 = qualification3.toString();
        java.lang.String str12 = qualification3.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = qualification3.getWorkers();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(workerSet13);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        java.lang.Class<?> wildcardClass4 = company1.getClass();
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet5 = company1.getProjects();
        java.lang.String str6 = company1.getName();
        edu.colostate.cs415.model.Worker worker7 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassignAll(worker7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(projectSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification9 = company7.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company7.getUnassignedWorkers();
        java.lang.String str11 = company7.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet12 = company7.getProjects();
        java.lang.String str13 = company7.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company7.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company7.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company7.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet17 = company7.getQualifications();
        edu.colostate.cs415.model.Worker worker19 = company2.createWorker("hi!", qualificationSet17, 1.0d);
        edu.colostate.cs415.model.ProjectSize projectSize20 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project21 = new edu.colostate.cs415.model.Project("hi!", qualificationSet17, projectSize20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!:0:0" + "'", str11, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!:0:0" + "'", str13, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertNotNull(workerSet15);
        org.junit.Assert.assertNotNull(workerSet16);
        org.junit.Assert.assertNotNull(qualificationSet17);
        org.junit.Assert.assertNotNull(worker19);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        boolean boolean4 = company1.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        java.lang.String str7 = company1.toString();
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification12 = company10.createQualification("hi!");
        boolean boolean14 = company10.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet15 = company10.getQualifications();
        edu.colostate.cs415.model.Worker worker17 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet15, (double) 10L);
        edu.colostate.cs415.model.Project project18 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker17, project18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(qualificationSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualification12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(qualificationSet15);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        java.lang.Class<?> wildcardClass6 = company1.getClass();
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification6 = company2.createQualification("hi!");
        java.lang.Object obj7 = null;
        boolean boolean8 = company2.equals(obj7);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet9 = company2.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize10 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project11 = new edu.colostate.cs415.model.Project("hi!:0:0", qualificationSet9, projectSize10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualification6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(qualificationSet9);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str7 = company6.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company6.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet9 = company6.getQualifications();
        edu.colostate.cs415.model.Worker worker11 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet9, 0.0d);
        edu.colostate.cs415.model.Project project12 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker11, project12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0:0:0" + "'", str7, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(qualificationSet9);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        edu.colostate.cs415.model.Qualification qualification6 = company2.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company2.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!:0:0", qualificationSet8, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Salary must be positive number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(qualification6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(qualificationSet8);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.lang.String str6 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet7 = company2.getProjects();
        java.lang.String str8 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company2.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company2.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company2.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker14 = new edu.colostate.cs415.model.Worker("", qualificationSet12, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Worker name cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!:0:0" + "'", str6, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!:0:0" + "'", str8, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertNotNull(workerSet11);
        org.junit.Assert.assertNotNull(qualificationSet12);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
        edu.colostate.cs415.model.Company company18 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str19 = company18.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet20 = company18.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet21 = company18.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet22 = company18.getQualifications();
        edu.colostate.cs415.model.Worker worker24 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet22, (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker26 = company1.createWorker("hi!", qualificationSet22, (double) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be empty or null");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!:0:0" + "'", str19, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet20);
        org.junit.Assert.assertNotNull(workerSet21);
        org.junit.Assert.assertNotNull(qualificationSet22);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company1.getQualifications();
        java.lang.String str6 = company1.getName();
        edu.colostate.cs415.model.Worker worker7 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassignAll(worker7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualificationSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.lang.String str9 = company1.toString();
        edu.colostate.cs415.model.Project project10 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project10);
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!:0:0" + "'", str9, "hi!:0:0");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.lang.String str5 = company1.getName();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company7.getUnavailableWorkers();
        boolean boolean10 = company7.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet11 = company7.getProjects();
        boolean boolean13 = company7.equals((java.lang.Object) (short) -1);
        boolean boolean14 = company1.equals((java.lang.Object) company7);
        edu.colostate.cs415.model.Company company17 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str18 = company17.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet19 = company17.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet20 = company17.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet21 = company17.getQualifications();
        edu.colostate.cs415.model.Worker worker23 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet21, (double) '#');
        edu.colostate.cs415.model.Project project24 = null;
        // The following exception was thrown during execution in test generation
        try {
            company7.assign(worker23, project24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(projectSet11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!:0:0" + "'", str18, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet19);
        org.junit.Assert.assertNotNull(workerSet20);
        org.junit.Assert.assertNotNull(qualificationSet21);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnassignedWorkers();
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
        edu.colostate.cs415.model.Qualification qualification30 = company26.createQualification("hi!");
        boolean boolean31 = company1.equals((java.lang.Object) company26);
        edu.colostate.cs415.model.Company company34 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification36 = company34.createQualification("hi!");
        boolean boolean38 = company34.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet39 = company34.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet40 = company34.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize41 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project42 = company1.createProject("hi!:0:0:0:0", qualificationSet40, projectSize41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(workerSet5);
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
        org.junit.Assert.assertNotNull(qualification30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(qualification36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(qualificationSet39);
        org.junit.Assert.assertNotNull(qualificationSet40);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet5 = company1.getProjects();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification10 = company8.createQualification("hi!");
        boolean boolean12 = company8.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company8.getQualifications();
        edu.colostate.cs415.model.Worker worker15 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet13, (double) 10L);
        edu.colostate.cs415.model.Project project16 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker15, project16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(projectSet5);
        org.junit.Assert.assertNotNull(qualification10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(qualificationSet13);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        java.lang.String str6 = qualification5.toString();
        java.lang.String str7 = qualification5.toString();
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company1.getAssignedWorkers();
        java.lang.Class<?> wildcardClass11 = company1.getClass();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getAssignedWorkers();
        boolean boolean5 = company2.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!:0:0", qualificationSet6, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Salary must be positive number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(qualificationSet6);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.lang.String str4 = company1.getName();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company7.getAssignedWorkers();
        boolean boolean10 = company7.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company7.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize12 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project13 = company1.createProject("", qualificationSet11, projectSize12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!:0:0" + "'", str4, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(qualificationSet11);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        java.lang.String str4 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification9 = company7.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company7.getUnassignedWorkers();
        java.lang.String str11 = company7.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet12 = company7.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company7.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company7.getEmployedWorkers();
        edu.colostate.cs415.model.Company company17 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification19 = company17.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet20 = company17.getQualifications();
        edu.colostate.cs415.model.Worker worker22 = company7.createWorker("hi!", qualificationSet20, (double) (short) 1);
        edu.colostate.cs415.model.Project project23 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker22, project23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!:0:0" + "'", str4, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!:0:0" + "'", str11, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet12);
        org.junit.Assert.assertNotNull(workerSet13);
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertNotNull(qualification19);
        org.junit.Assert.assertNotNull(qualificationSet20);
        org.junit.Assert.assertNotNull(worker22);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company11.getQualifications();
        edu.colostate.cs415.model.Worker worker16 = company1.createWorker("hi!", qualificationSet14, (double) (short) 1);
        edu.colostate.cs415.model.Project project17 = null;
        // The following exception was thrown during execution in test generation
        try {
            worker16.addProject(project17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: project can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(qualification13);
        org.junit.Assert.assertNotNull(qualificationSet14);
        org.junit.Assert.assertNotNull(worker16);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        java.lang.Object obj6 = null;
        boolean boolean7 = company1.equals(obj6);
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company9.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet11 = company9.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet12 = company9.getProjects();
        java.lang.String str13 = company9.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company9.getAssignedWorkers();
        boolean boolean15 = company1.equals((java.lang.Object) workerSet14);
        edu.colostate.cs415.model.Qualification qualification17 = company1.createQualification("hi!:0:0:0:0:0:0");
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str21 = company20.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet22 = company20.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet23 = company20.getQualifications();
        edu.colostate.cs415.model.Worker worker25 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet23, (double) ' ');
        edu.colostate.cs415.model.Project project26 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker25, project26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertNotNull(projectSet11);
        org.junit.Assert.assertNotNull(projectSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!:0:0" + "'", str13, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(qualification17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!:0:0:0:0" + "'", str21, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet22);
        org.junit.Assert.assertNotNull(qualificationSet23);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet8, (double) 0L);
        edu.colostate.cs415.model.Project project11 = null;
        // The following exception was thrown during execution in test generation
        try {
            worker10.removeProject(project11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: project cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(qualificationSet7);
        org.junit.Assert.assertNotNull(qualificationSet8);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize6 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project7 = new edu.colostate.cs415.model.Project("hi!:0:0", qualificationSet5, projectSize6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualificationSet5);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.lang.String str4 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification6 = company1.createQualification("hi!:0:0");
        edu.colostate.cs415.model.Project project7 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!:0:0" + "'", str4, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualification6);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize6 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project7 = new edu.colostate.cs415.model.Project("", qualificationSet5, projectSize6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualificationSet5);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet4 = company1.getQualifications();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        boolean boolean7 = company1.equals((java.lang.Object) "hi!");
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company10.getUnavailableWorkers();
        boolean boolean13 = company10.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company10.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet15 = company10.getQualifications();
        java.lang.String str16 = company10.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet17 = company10.getProjects();
        java.lang.String str18 = company10.getName();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet19 = company10.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker21 = company1.createWorker("hi!:0:0:0:0:0:0", qualificationSet19, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be empty or null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(qualificationSet4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(workerSet11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertNotNull(qualificationSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!:0:0" + "'", str16, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(qualificationSet19);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company1.getEmployedWorkers();
        java.lang.Class<?> wildcardClass11 = workerSet10.getClass();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        edu.colostate.cs415.model.Qualification qualification24 = company20.createQualification("hi!");
        edu.colostate.cs415.model.Company company26 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet27 = company26.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet28 = company26.getProjects();
        boolean boolean29 = qualification24.equals((java.lang.Object) projectSet28);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet30 = qualification24.getWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet31 = qualification24.getWorkers();
        java.lang.String str32 = qualification24.toString();
        edu.colostate.cs415.model.Company company34 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification36 = company34.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet37 = company34.getUnassignedWorkers();
        java.lang.String str38 = company34.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet39 = company34.getProjects();
        java.lang.String str40 = company34.toString();
        boolean boolean41 = qualification24.equals((java.lang.Object) str40);
        edu.colostate.cs415.model.Company company44 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification46 = company44.createQualification("hi!");
        boolean boolean48 = company44.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet49 = company44.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet50 = company44.getQualifications();
        edu.colostate.cs415.model.Worker worker52 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet50, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            qualification24.removeWorker(worker52);
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
        org.junit.Assert.assertNotNull(qualification24);
        org.junit.Assert.assertNotNull(workerSet27);
        org.junit.Assert.assertNotNull(projectSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(workerSet30);
        org.junit.Assert.assertNotNull(workerSet31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(qualification36);
        org.junit.Assert.assertNotNull(workerSet37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!:0:0" + "'", str38, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!:0:0" + "'", str40, "hi!:0:0");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(qualification46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(qualificationSet49);
        org.junit.Assert.assertNotNull(qualificationSet50);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet5 = company1.getProjects();
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet7 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification12 = company10.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company10.getUnassignedWorkers();
        java.lang.String str14 = company10.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet15 = company10.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company10.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = company10.getEmployedWorkers();
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification22 = company20.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet23 = company20.getQualifications();
        edu.colostate.cs415.model.Worker worker25 = company10.createWorker("hi!", qualificationSet23, (double) (short) 1);
        edu.colostate.cs415.model.Project project26 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker25, project26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(projectSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!:0:0" + "'", str6, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(qualification12);
        org.junit.Assert.assertNotNull(workerSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!:0:0" + "'", str14, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet15);
        org.junit.Assert.assertNotNull(workerSet16);
        org.junit.Assert.assertNotNull(workerSet17);
        org.junit.Assert.assertNotNull(qualification22);
        org.junit.Assert.assertNotNull(qualificationSet23);
        org.junit.Assert.assertNotNull(worker25);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str8 = company7.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company7.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company7.getQualifications();
        edu.colostate.cs415.model.Worker worker12 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet10, 0.0d);
        edu.colostate.cs415.model.Project project13 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker12, project13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!:0:0:0:0" + "'", str8, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(qualificationSet10);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company1.getUnavailableWorkers();
        java.lang.Class<?> wildcardClass13 = company1.getClass();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertNotNull(qualificationSet11);
        org.junit.Assert.assertNotNull(workerSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) '#');
        edu.colostate.cs415.model.Project project9 = null;
        // The following exception was thrown during execution in test generation
        try {
            worker8.removeProject(project9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: project cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0" + "'", str3, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(qualificationSet6);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
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
        edu.colostate.cs415.model.Qualification qualification24 = company20.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO25 = qualification24.toDTO();
        java.lang.String str26 = qualification24.toString();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO27 = qualification24.toDTO();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet28 = qualification24.getWorkers();
        java.lang.Class<?> wildcardClass29 = workerSet28.getClass();
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
        org.junit.Assert.assertNotNull(qualification24);
        org.junit.Assert.assertNotNull(qualificationDTO25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(qualificationDTO27);
        org.junit.Assert.assertNotNull(workerSet28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet8, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            worker10.setSalary((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: salary can not be a negative number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(qualificationSet7);
        org.junit.Assert.assertNotNull(qualificationSet8);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet8 = company1.getProjects();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Qualification qualification10 = company1.createQualification("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Description cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(projectSet8);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("", qualificationSet5, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Worker name cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualificationSet5);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Company company3 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification5 = company3.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company3.getUnassignedWorkers();
        java.lang.String str7 = company3.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company3.getEmployedWorkers();
        boolean boolean10 = company3.equals((java.lang.Object) 10);
        boolean boolean11 = company1.equals((java.lang.Object) company3);
        edu.colostate.cs415.model.Company company14 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str15 = company14.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company14.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet17 = company14.getQualifications();
        edu.colostate.cs415.model.Worker worker19 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet17, (double) ' ');
        edu.colostate.cs415.model.Project project20 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker19, project20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!:0:0:0:0" + "'", str15, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet16);
        org.junit.Assert.assertNotNull(qualificationSet17);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Company company4 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str5 = company4.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company4.getProjects();
        boolean boolean7 = company1.equals((java.lang.Object) projectSet6);
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Company company13 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification15 = company13.createQualification("hi!");
        boolean boolean17 = company13.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet18 = company13.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet19 = company13.getQualifications();
        edu.colostate.cs415.model.Worker worker21 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet19, (double) 0L);
        edu.colostate.cs415.model.ProjectSize projectSize22 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project23 = company1.createProject("hi!:0:0:0:0:0:0", qualificationSet19, projectSize22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertNotNull(qualification15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(qualificationSet18);
        org.junit.Assert.assertNotNull(qualificationSet19);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) '#');
        edu.colostate.cs415.model.Project project9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = worker8.willOverload(project9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: project can not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0" + "'", str3, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(qualificationSet6);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet5 = company1.getProjects();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company8.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company8.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company8.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize12 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project13 = company1.createProject("hi!:0:0", qualificationSet11, projectSize12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(projectSet5);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertNotNull(qualificationSet11);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        java.lang.String str4 = company1.getName();
        edu.colostate.cs415.model.Project project5 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str10 = company9.toString();
        java.lang.String str11 = company9.toString();
        edu.colostate.cs415.model.Qualification qualification13 = company9.createQualification("hi!");
        boolean boolean14 = company1.equals((java.lang.Object) "hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company1.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company18 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification20 = company18.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet21 = company18.getUnassignedWorkers();
        java.lang.String str22 = company18.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet23 = company18.getProjects();
        java.lang.String str24 = company18.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet25 = company18.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet26 = company18.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet27 = company18.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet28 = company18.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize29 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project30 = company1.createProject("", qualificationSet28, projectSize29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!:0:0:0:0" + "'", str10, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!:0:0:0:0" + "'", str11, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(qualification13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(workerSet15);
        org.junit.Assert.assertNotNull(qualification20);
        org.junit.Assert.assertNotNull(workerSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!:0:0" + "'", str22, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!:0:0" + "'", str24, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet25);
        org.junit.Assert.assertNotNull(workerSet26);
        org.junit.Assert.assertNotNull(workerSet27);
        org.junit.Assert.assertNotNull(qualificationSet28);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Company company5 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company5.getProjects();
        boolean boolean7 = company1.equals((java.lang.Object) company5);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company5.getUnavailableWorkers();
        java.lang.Class<?> wildcardClass9 = workerSet8.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet7 = company1.getProjects();
        java.lang.String str8 = company1.toString();
        java.lang.String str9 = company1.getName();
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str13 = company12.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company12.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet15 = company12.getQualifications();
        edu.colostate.cs415.model.Worker worker17 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet15, 0.0d);
        edu.colostate.cs415.model.Project project18 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker17, project18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertNotNull(projectSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!:0:0" + "'", str8, "hi!:0:0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!:0:0:0:0" + "'", str13, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertNotNull(qualificationSet15);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO4 = qualification3.toDTO();
        boolean boolean6 = qualification3.equals((java.lang.Object) 10.0d);
        java.lang.String str7 = qualification3.toString();
        java.lang.String str8 = qualification3.toString();
        java.lang.String str9 = qualification3.toString();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(qualificationDTO4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        boolean boolean10 = company6.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company6.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company6.getQualifications();
        boolean boolean13 = company2.equals((java.lang.Object) qualificationSet12);
        edu.colostate.cs415.model.ProjectSize projectSize14 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project15 = new edu.colostate.cs415.model.Project("hi!:0:0", qualificationSet12, projectSize14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(qualificationSet11);
        org.junit.Assert.assertNotNull(qualificationSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = qualification13.getWorkers();
        edu.colostate.cs415.model.Company company16 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification18 = company16.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet19 = qualification18.getWorkers();
        boolean boolean20 = qualification13.equals((java.lang.Object) qualification18);
        edu.colostate.cs415.model.Worker worker21 = null;
        qualification18.addWorker(worker21);
        edu.colostate.cs415.model.Company company24 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification26 = company24.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet27 = qualification26.getWorkers();
        boolean boolean28 = qualification18.equals((java.lang.Object) workerSet27);
        edu.colostate.cs415.model.Company company30 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet31 = company30.getEmployedWorkers();
        boolean boolean32 = qualification18.equals((java.lang.Object) company30);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet33 = company30.getQualifications();
        boolean boolean34 = company1.equals((java.lang.Object) company30);
        java.lang.String str35 = company1.getName();
        edu.colostate.cs415.model.Company company37 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification39 = company37.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet40 = company37.getUnassignedWorkers();
        java.lang.String str41 = company37.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet42 = company37.getProjects();
        java.lang.Object obj43 = null;
        boolean boolean44 = company37.equals(obj43);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet45 = company37.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet46 = company37.getAssignedWorkers();
        boolean boolean47 = company1.equals((java.lang.Object) workerSet46);
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(qualification13);
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertNotNull(qualification18);
        org.junit.Assert.assertNotNull(workerSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(qualification26);
        org.junit.Assert.assertNotNull(workerSet27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(workerSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(qualificationSet33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(qualification39);
        org.junit.Assert.assertNotNull(workerSet40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!:0:0" + "'", str41, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(workerSet45);
        org.junit.Assert.assertNotNull(workerSet46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet28 = qualification27.getWorkers();
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
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) '#');
        edu.colostate.cs415.model.Project project9 = null;
        // The following exception was thrown during execution in test generation
        try {
            worker8.addProject(project9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: project can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0" + "'", str3, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(qualificationSet6);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification10 = company8.createQualification("hi!");
        boolean boolean12 = company8.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company8.getQualifications();
        edu.colostate.cs415.model.Worker worker15 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet13, (double) 10L);
        edu.colostate.cs415.model.Project project16 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker15, project16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(qualification10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(qualificationSet13);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.lang.String str4 = company1.toString();
        java.lang.String str5 = company1.toString();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification10 = company8.createQualification("hi!");
        boolean boolean12 = company8.equals((java.lang.Object) 10L);
        java.lang.String str13 = company8.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company8.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet15 = company8.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker17 = company1.createWorker("", qualificationSet15, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Worker name cannot be empty or null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!:0:0" + "'", str4, "hi!:0:0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualification10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertNotNull(qualificationSet15);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company1.getQualifications();
        edu.colostate.cs415.model.Company company14 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str15 = company14.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet16 = company14.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = company14.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet18 = company14.getQualifications();
        edu.colostate.cs415.model.Worker worker20 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet18, (double) '#');
        edu.colostate.cs415.model.Project project21 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker20, project21);
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
        org.junit.Assert.assertNotNull(qualificationSet11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!:0:0" + "'", str15, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet16);
        org.junit.Assert.assertNotNull(workerSet17);
        org.junit.Assert.assertNotNull(qualificationSet18);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        java.lang.String str4 = company1.getName();
        edu.colostate.cs415.model.Project project5 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!:0:0" + "'", str4, "hi!:0:0");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Company company5 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str6 = company5.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet7 = company5.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company5.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet9 = company5.getQualifications();
        edu.colostate.cs415.model.Worker worker11 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet9, (double) '#');
        edu.colostate.cs415.model.Project project12 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker11, project12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!:0:0" + "'", str6, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(qualificationSet9);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification9 = company7.createQualification("hi!");
        boolean boolean11 = company7.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company7.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company7.getQualifications();
        edu.colostate.cs415.model.Worker worker15 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet13, (double) 0L);
        edu.colostate.cs415.model.Project project16 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker15, project16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(qualificationSet12);
        org.junit.Assert.assertNotNull(qualificationSet13);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        java.lang.Class<?> wildcardClass48 = qualification3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company2.getQualifications();
        java.lang.String str9 = company2.getName();
        edu.colostate.cs415.model.Qualification qualification11 = company2.createQualification("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company2.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize13 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project14 = new edu.colostate.cs415.model.Project("hi!:0:0", qualificationSet12, projectSize13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(qualificationSet7);
        org.junit.Assert.assertNotNull(qualificationSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(qualification11);
        org.junit.Assert.assertNotNull(qualificationSet12);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = null;
        edu.colostate.cs415.model.ProjectSize projectSize9 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project10 = company1.createProject("hi!:0:0:0:0", qualificationSet8, projectSize9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet6);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification9 = company7.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company7.getUnassignedWorkers();
        java.lang.String str11 = company7.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet12 = company7.getProjects();
        java.lang.String str13 = company7.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company7.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company7.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company7.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet17 = company7.getQualifications();
        edu.colostate.cs415.model.Worker worker19 = company2.createWorker("hi!", qualificationSet17, 1.0d);
        edu.colostate.cs415.model.ProjectSize projectSize20 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project21 = new edu.colostate.cs415.model.Project("hi!:0:0:0:0", qualificationSet17, projectSize20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!:0:0" + "'", str11, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!:0:0" + "'", str13, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertNotNull(workerSet15);
        org.junit.Assert.assertNotNull(workerSet16);
        org.junit.Assert.assertNotNull(qualificationSet17);
        org.junit.Assert.assertNotNull(worker19);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet10 = company1.getProjects();
        java.lang.String str11 = company1.getName();
        edu.colostate.cs415.model.Company company13 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company13.getUnavailableWorkers();
        boolean boolean16 = company13.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = company13.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet18 = company13.getProjects();
        boolean boolean19 = company1.equals((java.lang.Object) projectSet18);
        java.util.Set<edu.colostate.cs415.model.Project> projectSet20 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet21 = company1.getEmployedWorkers();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(projectSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(workerSet17);
        org.junit.Assert.assertNotNull(projectSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(projectSet20);
        org.junit.Assert.assertNotNull(workerSet21);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str8 = company7.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company7.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company7.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company7.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize12 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project13 = company1.createProject("hi!:0:0", qualificationSet11, projectSize12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!:0:0" + "'", str8, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertNotNull(qualificationSet11);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Qualification qualification7 = company1.createQualification("hi!:0:0");
        edu.colostate.cs415.model.Worker worker8 = null;
        qualification7.addWorker(worker8);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = qualification7.getWorkers();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertNotNull(qualification7);
        org.junit.Assert.assertNotNull(workerSet10);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company1.getUnassignedWorkers();
        java.lang.String str11 = company1.toString();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!:0:0" + "'", str11, "hi!:0:0");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        edu.colostate.cs415.model.Company company3 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification5 = company3.createQualification("hi!");
        boolean boolean7 = company3.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company3.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet9 = company3.getQualifications();
        edu.colostate.cs415.model.Worker worker11 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet9, (double) 0L);
        edu.colostate.cs415.model.ProjectSize projectSize12 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project13 = new edu.colostate.cs415.model.Project("", qualificationSet9, projectSize12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(qualificationSet8);
        org.junit.Assert.assertNotNull(qualificationSet9);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("", qualificationSet5, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Worker name cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualificationSet5);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Project project6 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(workerSet5);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        edu.colostate.cs415.model.Company company3 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification5 = company3.createQualification("hi!");
        boolean boolean7 = company3.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company3.getQualifications();
        edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet8, (double) 10L);
        edu.colostate.cs415.model.ProjectSize projectSize11 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project12 = new edu.colostate.cs415.model.Project("", qualificationSet8, projectSize11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(qualificationSet8);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        java.lang.Object obj6 = null;
        boolean boolean7 = company1.equals(obj6);
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company9.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet11 = company9.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet12 = company9.getProjects();
        java.lang.String str13 = company9.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company9.getAssignedWorkers();
        boolean boolean15 = company1.equals((java.lang.Object) workerSet14);
        edu.colostate.cs415.model.Qualification qualification17 = company1.createQualification("hi!:0:0:0:0:0:0");
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str21 = company20.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet22 = company20.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = company20.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet24 = company20.getQualifications();
        edu.colostate.cs415.model.Worker worker26 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet24, (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            qualification17.removeWorker(worker26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertNotNull(projectSet11);
        org.junit.Assert.assertNotNull(projectSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!:0:0" + "'", str13, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(qualification17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!:0:0" + "'", str21, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet22);
        org.junit.Assert.assertNotNull(workerSet23);
        org.junit.Assert.assertNotNull(qualificationSet24);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Project project9 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(qualificationSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(workerSet8);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet3 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = null;
        edu.colostate.cs415.model.ProjectSize projectSize6 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project7 = company1.createProject("hi!:0:0", qualificationSet5, projectSize6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualificationSet3);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet5 = company1.getProjects();
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet7 = company1.getProjects();
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        edu.colostate.cs415.model.Company company14 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification16 = company14.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = company14.getUnassignedWorkers();
        java.lang.String str18 = company14.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet19 = company14.getProjects();
        java.lang.String str20 = company14.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet21 = company14.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet22 = company14.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = company14.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet24 = company14.getQualifications();
        edu.colostate.cs415.model.Worker worker26 = company9.createWorker("hi!", qualificationSet24, 1.0d);
        edu.colostate.cs415.model.Project project27 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker26, project27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(projectSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!:0:0" + "'", str6, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet7);
        org.junit.Assert.assertNotNull(qualification11);
        org.junit.Assert.assertNotNull(qualification16);
        org.junit.Assert.assertNotNull(workerSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!:0:0" + "'", str18, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!:0:0" + "'", str20, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet21);
        org.junit.Assert.assertNotNull(workerSet22);
        org.junit.Assert.assertNotNull(workerSet23);
        org.junit.Assert.assertNotNull(qualificationSet24);
        org.junit.Assert.assertNotNull(worker26);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification10 = company8.createQualification("hi!");
        edu.colostate.cs415.model.Company company13 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification15 = company13.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company13.getUnassignedWorkers();
        java.lang.String str17 = company13.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet18 = company13.getProjects();
        java.lang.String str19 = company13.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet20 = company13.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet21 = company13.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet22 = company13.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet23 = company13.getQualifications();
        edu.colostate.cs415.model.Worker worker25 = company8.createWorker("hi!", qualificationSet23, 1.0d);
        edu.colostate.cs415.model.Project project26 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker25, project26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(qualification10);
        org.junit.Assert.assertNotNull(qualification15);
        org.junit.Assert.assertNotNull(workerSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!:0:0" + "'", str17, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!:0:0" + "'", str19, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet20);
        org.junit.Assert.assertNotNull(workerSet21);
        org.junit.Assert.assertNotNull(workerSet22);
        org.junit.Assert.assertNotNull(qualificationSet23);
        org.junit.Assert.assertNotNull(worker25);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        java.lang.String str4 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str11 = company10.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company10.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company10.getQualifications();
        edu.colostate.cs415.model.Worker worker15 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet13, (double) ' ');
        edu.colostate.cs415.model.Project project16 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker15, project16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!:0:0" + "'", str4, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!:0:0:0:0" + "'", str11, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet12);
        org.junit.Assert.assertNotNull(qualificationSet13);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Company company5 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company5.getProjects();
        boolean boolean7 = company1.equals((java.lang.Object) company5);
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str11 = company10.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet12 = company10.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company10.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company10.getQualifications();
        edu.colostate.cs415.model.Worker worker16 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet14, (double) '#');
        edu.colostate.cs415.model.Project project17 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker16, project17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!:0:0" + "'", str11, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet12);
        org.junit.Assert.assertNotNull(workerSet13);
        org.junit.Assert.assertNotNull(qualificationSet14);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = qualification8.getWorkers();
        boolean boolean10 = qualification3.equals((java.lang.Object) qualification8);
        edu.colostate.cs415.model.Worker worker11 = null;
        qualification8.addWorker(worker11);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = qualification8.getWorkers();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.dto.QualificationDTO qualificationDTO14 = qualification8.toDTO();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(workerSet13);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!:0:0", qualificationSet6, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Salary must be positive number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0" + "'", str3, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(qualificationSet6);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet4 = company1.getQualifications();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        boolean boolean7 = company1.equals((java.lang.Object) "hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Project project9 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(qualificationSet4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(workerSet8);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet8 = company7.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company7.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet10 = company7.getProjects();
        java.lang.String str11 = company7.getName();
        boolean boolean12 = company1.equals((java.lang.Object) company7);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker16 = company1.createWorker("hi!", qualificationSet14, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be empty or null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(projectSet8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(projectSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!:0:0:0:0" + "'", str11, "hi!:0:0:0:0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getAssignedWorkers();
        boolean boolean4 = company1.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAvailableWorkers();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Qualification qualification7 = company1.createQualification("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Description cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(workerSet5);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getUnavailableWorkers();
        boolean boolean5 = company2.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company2.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("", qualificationSet7, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Worker name cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(qualificationSet7);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet4 = company1.getQualifications();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        boolean boolean7 = company1.equals((java.lang.Object) "hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Project project9 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(qualificationSet4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(workerSet8);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str10 = company9.toString();
        java.lang.String str11 = company9.toString();
        edu.colostate.cs415.model.Qualification qualification13 = company9.createQualification("hi!");
        boolean boolean14 = company1.equals((java.lang.Object) "hi!");
        edu.colostate.cs415.model.Company company17 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet18 = company17.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet19 = company17.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet20 = company17.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize21 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project22 = company1.createProject("hi!:0:0:0:0:0:0", qualificationSet20, projectSize21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!:0:0:0:0" + "'", str10, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!:0:0:0:0" + "'", str11, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(qualification13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(workerSet18);
        org.junit.Assert.assertNotNull(workerSet19);
        org.junit.Assert.assertNotNull(qualificationSet20);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification9 = company7.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company7.getUnassignedWorkers();
        java.lang.String str11 = company7.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet12 = company7.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company7.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company7.getEmployedWorkers();
        edu.colostate.cs415.model.Company company17 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification19 = company17.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet20 = company17.getQualifications();
        edu.colostate.cs415.model.Worker worker22 = company7.createWorker("hi!", qualificationSet20, (double) (short) 1);
        edu.colostate.cs415.model.Project project23 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker22, project23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!:0:0" + "'", str11, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet12);
        org.junit.Assert.assertNotNull(workerSet13);
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertNotNull(qualification19);
        org.junit.Assert.assertNotNull(qualificationSet20);
        org.junit.Assert.assertNotNull(worker22);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.lang.String str5 = company1.getName();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company7.getUnavailableWorkers();
        boolean boolean10 = company7.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet11 = company7.getProjects();
        boolean boolean13 = company7.equals((java.lang.Object) (short) -1);
        boolean boolean14 = company1.equals((java.lang.Object) company7);
        edu.colostate.cs415.model.Company company16 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification18 = company16.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet19 = company16.getUnassignedWorkers();
        java.lang.String str20 = company16.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet21 = company16.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet22 = company16.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = company16.getEmployedWorkers();
        edu.colostate.cs415.model.Company company26 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification28 = company26.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet29 = company26.getQualifications();
        edu.colostate.cs415.model.Worker worker31 = company16.createWorker("hi!", qualificationSet29, (double) (short) 1);
        edu.colostate.cs415.model.Project project32 = null;
        // The following exception was thrown during execution in test generation
        try {
            company7.assign(worker31, project32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(projectSet11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(qualification18);
        org.junit.Assert.assertNotNull(workerSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!:0:0" + "'", str20, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet21);
        org.junit.Assert.assertNotNull(workerSet22);
        org.junit.Assert.assertNotNull(workerSet23);
        org.junit.Assert.assertNotNull(qualification28);
        org.junit.Assert.assertNotNull(qualificationSet29);
        org.junit.Assert.assertNotNull(worker31);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            worker7.setSalary((double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: salary can not be a negative number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualificationSet5);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.lang.String str4 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAvailableWorkers();
        java.lang.String str6 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification8 = company1.createQualification("hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!:0:0" + "'", str4, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!:0:0:0:0" + "'", str6, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(qualification8);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
            edu.colostate.cs415.model.Project project13 = new edu.colostate.cs415.model.Project("hi!:0:0:0:0:0:0", qualificationSet11, projectSize12);
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
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
        edu.colostate.cs415.model.Company company33 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet34 = company33.getAssignedWorkers();
        boolean boolean36 = company33.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet37 = company33.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize38 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project39 = company26.createProject("hi!:0:0", qualificationSet37, projectSize38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(workerSet34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(qualificationSet37);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet3 = company1.getQualifications();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str7 = company6.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company6.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet9 = company6.getQualifications();
        edu.colostate.cs415.model.Worker worker11 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet9, (double) ' ');
        edu.colostate.cs415.model.Project project12 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker11, project12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualificationSet3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0:0:0" + "'", str7, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(qualificationSet9);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet4 = company1.getQualifications();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification9 = company7.createQualification("hi!");
        boolean boolean11 = company7.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company7.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company7.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker15 = company1.createWorker("", qualificationSet13, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Worker name cannot be empty or null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(qualificationSet4);
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(qualificationSet12);
        org.junit.Assert.assertNotNull(qualificationSet13);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company1.getEmployedWorkers();
        java.lang.String str11 = company1.toString();
        edu.colostate.cs415.model.Company company14 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company14.getAssignedWorkers();
        boolean boolean17 = company14.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet18 = company14.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize19 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project20 = company1.createProject("hi!:0:0:0:0:0:0", qualificationSet18, projectSize19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null or empty");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!:0:0" + "'", str11, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(qualificationSet18);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.lang.String str4 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification6 = company1.createQualification("hi!:0:0");
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str10 = company9.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company9.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company9.getQualifications();
        edu.colostate.cs415.model.Worker worker14 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet12, (double) ' ');
        edu.colostate.cs415.model.Project project15 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker14, project15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!:0:0" + "'", str4, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualification6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!:0:0:0:0" + "'", str10, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet11);
        org.junit.Assert.assertNotNull(qualificationSet12);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company1.getQualifications();
        java.lang.String str8 = company1.getName();
        edu.colostate.cs415.model.Qualification qualification10 = company1.createQualification("hi!:0:0:0:0");
        edu.colostate.cs415.model.Company company13 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str14 = company13.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet15 = company13.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company13.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet17 = company13.getQualifications();
        edu.colostate.cs415.model.Worker worker19 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet17, (double) '#');
        edu.colostate.cs415.model.Project project20 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker19, project20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(qualificationSet6);
        org.junit.Assert.assertNotNull(qualificationSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(qualification10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!:0:0" + "'", str14, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet15);
        org.junit.Assert.assertNotNull(workerSet16);
        org.junit.Assert.assertNotNull(qualificationSet17);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.lang.String str5 = company1.toString();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification10 = company8.createQualification("hi!");
        boolean boolean12 = company8.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company8.getQualifications();
        edu.colostate.cs415.model.Worker worker15 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet13, (double) 10L);
        edu.colostate.cs415.model.Project project16 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker15, project16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualification10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(qualificationSet13);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Company company4 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company4.getAssignedWorkers();
        boolean boolean7 = company4.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company4.getQualifications();
        edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet8, (double) 12);
        edu.colostate.cs415.model.Project project11 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker10, project11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(qualificationSet8);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getAvailableWorkers();
        java.lang.String str7 = company1.toString();
        edu.colostate.cs415.model.Project project8 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Company company3 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification5 = company3.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company3.getUnassignedWorkers();
        java.lang.String str7 = company3.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company3.getEmployedWorkers();
        boolean boolean10 = company3.equals((java.lang.Object) 10);
        boolean boolean11 = company1.equals((java.lang.Object) company3);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company3.getAssignedWorkers();
        edu.colostate.cs415.model.Company company16 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = company16.getAssignedWorkers();
        boolean boolean19 = company16.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet20 = company16.getQualifications();
        edu.colostate.cs415.model.Worker worker22 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet20, (double) 12);
        edu.colostate.cs415.model.ProjectSize projectSize23 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project24 = company3.createProject("hi!:0:0:0:0", qualificationSet20, projectSize23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(workerSet12);
        org.junit.Assert.assertNotNull(workerSet17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(qualificationSet20);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getUnassignedWorkers();
        edu.colostate.cs415.model.Project project10 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project10);
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
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize6 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project7 = new edu.colostate.cs415.model.Project("hi!:0:0:0:0:0:0", qualificationSet5, projectSize6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualificationSet5);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company7.getAssignedWorkers();
        boolean boolean9 = company1.equals((java.lang.Object) workerSet8);
        edu.colostate.cs415.model.Company company13 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification15 = company13.createQualification("hi!");
        boolean boolean17 = company13.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet18 = company13.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet19 = company13.getQualifications();
        edu.colostate.cs415.model.Worker worker21 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet19, (double) 0L);
        edu.colostate.cs415.model.ProjectSize projectSize22 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project23 = company1.createProject("hi!:0:0", qualificationSet19, projectSize22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(qualification15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(qualificationSet18);
        org.junit.Assert.assertNotNull(qualificationSet19);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Company company4 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str5 = company4.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company4.getProjects();
        boolean boolean7 = company1.equals((java.lang.Object) projectSet6);
        edu.colostate.cs415.model.Project project8 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.lang.String str6 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Company company13 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification15 = company13.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company13.getUnassignedWorkers();
        java.lang.String str17 = company13.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet18 = company13.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet19 = company13.getEmployedWorkers();
        edu.colostate.cs415.model.Qualification qualification21 = company13.createQualification("hi!:0:0:0:0:0:0");
        java.lang.String str22 = company13.getName();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet23 = company13.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker25 = company1.createWorker("hi!:0:0:0:0", qualificationSet23, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualification is not in the company set");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!:0:0" + "'", str6, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertNotNull(qualification15);
        org.junit.Assert.assertNotNull(workerSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!:0:0" + "'", str17, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet18);
        org.junit.Assert.assertNotNull(workerSet19);
        org.junit.Assert.assertNotNull(qualification21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(qualificationSet23);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        boolean boolean4 = company1.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAvailableWorkers();
        java.lang.String str6 = company1.getName();
        edu.colostate.cs415.model.Project project7 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str10 = company9.toString();
        java.lang.String str11 = company9.toString();
        edu.colostate.cs415.model.Qualification qualification13 = company9.createQualification("hi!");
        boolean boolean14 = company1.equals((java.lang.Object) "hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company1.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company18 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification20 = company18.createQualification("hi!");
        boolean boolean22 = company18.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet23 = company18.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet24 = company18.getQualifications();
        edu.colostate.cs415.model.Worker worker26 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet24, (double) 0L);
        edu.colostate.cs415.model.Project project27 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker26, project27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!:0:0:0:0" + "'", str10, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!:0:0:0:0" + "'", str11, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(qualification13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(workerSet15);
        org.junit.Assert.assertNotNull(qualification20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(qualificationSet23);
        org.junit.Assert.assertNotNull(qualificationSet24);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getAssignedWorkers();
        boolean boolean5 = company2.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) 12);
        edu.colostate.cs415.model.Project project9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = worker8.willOverload(project9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: project can not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(qualificationSet6);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Project project9 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(workerSet8);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Qualification qualification6 = company1.createQualification("hi!:0:0");
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str10 = company9.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company9.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company9.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize13 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project14 = company1.createProject("hi!", qualificationSet12, projectSize13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualification6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!:0:0:0:0" + "'", str10, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet11);
        org.junit.Assert.assertNotNull(qualificationSet12);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = qualification13.getWorkers();
        edu.colostate.cs415.model.Company company16 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification18 = company16.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet19 = qualification18.getWorkers();
        boolean boolean20 = qualification13.equals((java.lang.Object) qualification18);
        edu.colostate.cs415.model.Worker worker21 = null;
        qualification18.addWorker(worker21);
        edu.colostate.cs415.model.Company company24 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification26 = company24.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet27 = qualification26.getWorkers();
        boolean boolean28 = qualification18.equals((java.lang.Object) workerSet27);
        edu.colostate.cs415.model.Company company30 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet31 = company30.getEmployedWorkers();
        boolean boolean32 = qualification18.equals((java.lang.Object) company30);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet33 = company30.getQualifications();
        boolean boolean34 = company1.equals((java.lang.Object) company30);
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Qualification qualification36 = company1.createQualification("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Description cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(qualification13);
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertNotNull(qualification18);
        org.junit.Assert.assertNotNull(workerSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(qualification26);
        org.junit.Assert.assertNotNull(workerSet27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(workerSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(qualificationSet33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Worker worker4 = null;
        qualification3.addWorker(worker4);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str9 = company8.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company8.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet11 = company8.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company8.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company8.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company8.getEmployedWorkers();
        edu.colostate.cs415.model.Company company16 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str17 = company16.toString();
        java.lang.String str18 = company16.toString();
        edu.colostate.cs415.model.Qualification qualification20 = company16.createQualification("hi!");
        boolean boolean21 = company8.equals((java.lang.Object) "hi!");
        edu.colostate.cs415.model.Qualification qualification23 = company8.createQualification("hi!");
        boolean boolean24 = qualification3.equals((java.lang.Object) qualification23);
        java.lang.String str25 = qualification23.toString();
        edu.colostate.cs415.model.Company company28 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification30 = company28.createQualification("hi!");
        boolean boolean32 = company28.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet33 = company28.getQualifications();
        edu.colostate.cs415.model.Worker worker35 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet33, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            qualification23.removeWorker(worker35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!:0:0" + "'", str9, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertNotNull(projectSet11);
        org.junit.Assert.assertNotNull(workerSet12);
        org.junit.Assert.assertNotNull(workerSet13);
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!:0:0:0:0" + "'", str17, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!:0:0:0:0" + "'", str18, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(qualification20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(qualification23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(qualification30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(qualificationSet33);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        java.lang.String str6 = company1.toString();
        edu.colostate.cs415.model.Project project7 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!:0:0:0:0" + "'", str6, "hi!:0:0:0:0");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnavailableWorkers();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Description cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(workerSet7);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getEmployedWorkers();
        java.lang.String str5 = company1.toString();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str9 = company8.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet10 = company8.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company8.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company8.getQualifications();
        edu.colostate.cs415.model.Worker worker14 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet12, (double) '#');
        edu.colostate.cs415.model.Project project15 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker14, project15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!:0:0" + "'", str9, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet10);
        org.junit.Assert.assertNotNull(workerSet11);
        org.junit.Assert.assertNotNull(qualificationSet12);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAvailableWorkers();
        java.lang.Class<?> wildcardClass6 = workerSet5.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification6 = company2.createQualification("hi!");
        java.lang.Object obj7 = null;
        boolean boolean8 = company2.equals(obj7);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company2.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize11 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project12 = new edu.colostate.cs415.model.Project("hi!:0:0:0:0", qualificationSet10, projectSize11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualification6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(qualificationSet10);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getEmployedWorkers();
        java.lang.String str10 = company1.getName();
        edu.colostate.cs415.model.Company company13 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str14 = company13.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company13.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet16 = company13.getQualifications();
        edu.colostate.cs415.model.Worker worker18 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet16, (double) ' ');
        edu.colostate.cs415.model.Project project19 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker18, project19);
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!:0:0:0:0" + "'", str14, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet15);
        org.junit.Assert.assertNotNull(qualificationSet16);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        boolean boolean13 = company9.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company9.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet15 = company9.getQualifications();
        edu.colostate.cs415.model.Worker worker17 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet15, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker19 = company1.createWorker("", qualificationSet15, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Worker name cannot be empty or null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(qualification11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(qualificationSet14);
        org.junit.Assert.assertNotNull(qualificationSet15);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
        java.lang.Class<?> wildcardClass19 = company7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnavailableWorkers();
        java.lang.Class<?> wildcardClass8 = workerSet7.getClass();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        boolean boolean4 = company1.equals((java.lang.Object) "");
        java.lang.String str5 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification12 = company10.createQualification("hi!");
        boolean boolean14 = company10.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet15 = company10.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet16 = company10.getQualifications();
        edu.colostate.cs415.model.Worker worker18 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet16, (double) 0L);
        edu.colostate.cs415.model.Project project19 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker18, project19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(qualification12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(qualificationSet15);
        org.junit.Assert.assertNotNull(qualificationSet16);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0:0:0:0:0");
        java.lang.String str10 = company1.getName();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Qualification qualification12 = company1.createQualification("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Description cannot be empty");
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
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet5 = company1.getProjects();
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet7 = company1.getProjects();
        java.lang.String str8 = company1.getName();
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company11.getUnassignedWorkers();
        java.lang.String str15 = company11.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet16 = company11.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = company11.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet18 = company11.getEmployedWorkers();
        edu.colostate.cs415.model.Company company21 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification23 = company21.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet24 = company21.getQualifications();
        edu.colostate.cs415.model.Worker worker26 = company11.createWorker("hi!", qualificationSet24, (double) (short) 1);
        edu.colostate.cs415.model.ProjectSize projectSize27 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project28 = company1.createProject("hi!:0:0:0:0", qualificationSet24, projectSize27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(projectSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!:0:0" + "'", str6, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!:0:0" + "'", str8, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualification13);
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!:0:0" + "'", str15, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet16);
        org.junit.Assert.assertNotNull(workerSet17);
        org.junit.Assert.assertNotNull(workerSet18);
        org.junit.Assert.assertNotNull(qualification23);
        org.junit.Assert.assertNotNull(qualificationSet24);
        org.junit.Assert.assertNotNull(worker26);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        java.lang.String str4 = company1.getName();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company6.getUnassignedWorkers();
        java.lang.String str10 = company6.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet11 = company6.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company6.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company6.getEmployedWorkers();
        edu.colostate.cs415.model.Company company16 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification18 = company16.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet19 = company16.getQualifications();
        edu.colostate.cs415.model.Worker worker21 = company6.createWorker("hi!", qualificationSet19, (double) (short) 1);
        edu.colostate.cs415.model.Project project22 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker21, project22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!:0:0" + "'", str10, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet11);
        org.junit.Assert.assertNotNull(workerSet12);
        org.junit.Assert.assertNotNull(workerSet13);
        org.junit.Assert.assertNotNull(qualification18);
        org.junit.Assert.assertNotNull(qualificationSet19);
        org.junit.Assert.assertNotNull(worker21);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company1.getQualifications();
        java.lang.String str6 = company1.getName();
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str10 = company9.toString();
        java.lang.String str11 = company9.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company9.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company9.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company9.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize15 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project16 = company1.createProject("hi!:0:0", qualificationSet14, projectSize15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualificationSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!:0:0:0:0" + "'", str10, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!:0:0:0:0" + "'", str11, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet12);
        org.junit.Assert.assertNotNull(workerSet13);
        org.junit.Assert.assertNotNull(qualificationSet14);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Project project5 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(workerSet4);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Project project5 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(workerSet4);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        boolean boolean4 = company1.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet8 = company1.getProjects();
        java.lang.String str9 = company1.getName();
        java.lang.String str10 = company1.toString();
        edu.colostate.cs415.model.Project project11 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(qualificationSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!:0:0" + "'", str10, "hi!:0:0");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company11.getQualifications();
        edu.colostate.cs415.model.Worker worker16 = company1.createWorker("hi!", qualificationSet14, (double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            worker16.setSalary((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: salary can not be a negative number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(qualification13);
        org.junit.Assert.assertNotNull(qualificationSet14);
        org.junit.Assert.assertNotNull(worker16);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str8 = company7.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company7.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company7.getQualifications();
        edu.colostate.cs415.model.Worker worker12 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet10, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker14 = company1.createWorker("hi!:0:0:0:0:0:0", qualificationSet10, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be empty or null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!:0:0:0:0" + "'", str8, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(qualificationSet10);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        java.lang.String str4 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAssignedWorkers();
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getAvailableWorkers();
        java.lang.Class<?> wildcardClass8 = company1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!:0:0" + "'", str4, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!:0:0" + "'", str6, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Description cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet1 = null;
        edu.colostate.cs415.model.ProjectSize projectSize2 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project3 = new edu.colostate.cs415.model.Project("hi!", qualificationSet1, projectSize2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company9.getUnassignedWorkers();
        java.lang.String str13 = company9.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet14 = company9.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company9.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company9.getEmployedWorkers();
        edu.colostate.cs415.model.Company company19 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification21 = company19.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet22 = company19.getQualifications();
        edu.colostate.cs415.model.Worker worker24 = company9.createWorker("hi!", qualificationSet22, (double) (short) 1);
        edu.colostate.cs415.model.Project project25 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker24, project25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualification11);
        org.junit.Assert.assertNotNull(workerSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!:0:0" + "'", str13, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet14);
        org.junit.Assert.assertNotNull(workerSet15);
        org.junit.Assert.assertNotNull(workerSet16);
        org.junit.Assert.assertNotNull(qualification21);
        org.junit.Assert.assertNotNull(qualificationSet22);
        org.junit.Assert.assertNotNull(worker24);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet24 = company20.getEmployedWorkers();
        edu.colostate.cs415.model.Company company26 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification28 = company26.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet29 = company26.getUnassignedWorkers();
        java.lang.String str30 = company26.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet31 = company26.getProjects();
        java.lang.String str32 = company26.toString();
        edu.colostate.cs415.model.Qualification qualification34 = company26.createQualification("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet35 = company26.getAssignedWorkers();
        boolean boolean36 = company20.equals((java.lang.Object) workerSet35);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet37 = company20.getUnavailableWorkers();
        edu.colostate.cs415.model.Project project38 = null;
        // The following exception was thrown during execution in test generation
        try {
            company20.finish(project38);
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
        org.junit.Assert.assertNotNull(qualification28);
        org.junit.Assert.assertNotNull(workerSet29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!:0:0" + "'", str30, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!:0:0" + "'", str32, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualification34);
        org.junit.Assert.assertNotNull(workerSet35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(workerSet37);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize6 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project7 = new edu.colostate.cs415.model.Project("hi!:0:0", qualificationSet5, projectSize6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertNotNull(qualificationSet5);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Project project4 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        edu.colostate.cs415.model.Project project8 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company11.getQualifications();
        edu.colostate.cs415.model.Worker worker16 = company1.createWorker("hi!", qualificationSet14, (double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            worker16.setSalary((double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: salary can not be a negative number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(qualification13);
        org.junit.Assert.assertNotNull(qualificationSet14);
        org.junit.Assert.assertNotNull(worker16);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        boolean boolean10 = company6.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company6.getQualifications();
        edu.colostate.cs415.model.Worker worker13 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet11, (double) 10L);
        edu.colostate.cs415.model.Project project14 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker13, project14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(qualification8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(qualificationSet11);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getUnassignedWorkers();
        java.lang.Class<?> wildcardClass9 = workerSet8.getClass();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet5 = company1.getProjects();
        java.lang.String str6 = company1.toString();
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company9.getUnavailableWorkers();
        boolean boolean12 = company9.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company9.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company9.getQualifications();
        edu.colostate.cs415.model.Worker worker16 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet14, (double) 1L);
        edu.colostate.cs415.model.Project project17 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker16, project17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(projectSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!:0:0:0:0" + "'", str6, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(workerSet13);
        org.junit.Assert.assertNotNull(qualificationSet14);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet5 = company1.getProjects();
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet7 = company1.getProjects();
        java.lang.String str8 = company1.getName();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Qualification qualification10 = company1.createQualification("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Description cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0:0:0" + "'", str3, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(projectSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!:0:0" + "'", str6, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!:0:0" + "'", str8, "hi!:0:0");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Qualification qualification10 = company1.createQualification("hi!:0:0:0:0:0:0");
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification14 = company12.createQualification("hi!");
        edu.colostate.cs415.model.Company company17 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification19 = company17.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet20 = company17.getUnassignedWorkers();
        java.lang.String str21 = company17.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet22 = company17.getProjects();
        java.lang.String str23 = company17.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet24 = company17.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet25 = company17.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet26 = company17.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet27 = company17.getQualifications();
        edu.colostate.cs415.model.Worker worker29 = company12.createWorker("hi!", qualificationSet27, 1.0d);
        edu.colostate.cs415.model.Project project30 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.unassign(worker29, project30);
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
        org.junit.Assert.assertNotNull(qualification10);
        org.junit.Assert.assertNotNull(qualification14);
        org.junit.Assert.assertNotNull(qualification19);
        org.junit.Assert.assertNotNull(workerSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!:0:0" + "'", str21, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!:0:0" + "'", str23, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet24);
        org.junit.Assert.assertNotNull(workerSet25);
        org.junit.Assert.assertNotNull(workerSet26);
        org.junit.Assert.assertNotNull(qualificationSet27);
        org.junit.Assert.assertNotNull(worker29);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Company company3 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification5 = company3.createQualification("hi!");
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification10 = company8.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company8.getUnassignedWorkers();
        java.lang.String str12 = company8.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet13 = company8.getProjects();
        java.lang.String str14 = company8.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company8.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company8.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = company8.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet18 = company8.getQualifications();
        edu.colostate.cs415.model.Worker worker20 = company3.createWorker("hi!", qualificationSet18, 1.0d);
        edu.colostate.cs415.model.Project project21 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker20, project21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification5);
        org.junit.Assert.assertNotNull(qualification10);
        org.junit.Assert.assertNotNull(workerSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!:0:0" + "'", str12, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!:0:0" + "'", str14, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet15);
        org.junit.Assert.assertNotNull(workerSet16);
        org.junit.Assert.assertNotNull(workerSet17);
        org.junit.Assert.assertNotNull(qualificationSet18);
        org.junit.Assert.assertNotNull(worker20);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet24 = company20.getEmployedWorkers();
        edu.colostate.cs415.model.Company company26 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification28 = company26.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet29 = company26.getUnassignedWorkers();
        java.lang.String str30 = company26.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet31 = company26.getProjects();
        java.lang.String str32 = company26.toString();
        edu.colostate.cs415.model.Qualification qualification34 = company26.createQualification("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet35 = company26.getAssignedWorkers();
        boolean boolean36 = company20.equals((java.lang.Object) workerSet35);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet37 = company20.getUnavailableWorkers();
        edu.colostate.cs415.model.Project project38 = null;
        // The following exception was thrown during execution in test generation
        try {
            company20.start(project38);
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
        org.junit.Assert.assertNotNull(qualification28);
        org.junit.Assert.assertNotNull(workerSet29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!:0:0" + "'", str30, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!:0:0" + "'", str32, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualification34);
        org.junit.Assert.assertNotNull(workerSet35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(workerSet37);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.lang.String str6 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company2.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company2.getEmployedWorkers();
        edu.colostate.cs415.model.Qualification qualification10 = company2.createQualification("hi!:0:0:0:0:0:0");
        java.lang.String str11 = company2.getName();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company2.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize13 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project14 = new edu.colostate.cs415.model.Project("", qualificationSet12, projectSize13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!:0:0" + "'", str6, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(qualification10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(qualificationSet12);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        java.lang.String str4 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAssignedWorkers();
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getAvailableWorkers();
        java.lang.String str8 = company1.toString();
        edu.colostate.cs415.model.Project project9 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!:0:0" + "'", str4, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!:0:0" + "'", str6, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!:0:0:0:0" + "'", str8, "hi!:0:0:0:0");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        edu.colostate.cs415.model.Company company22 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str23 = company22.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet24 = company22.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet25 = company22.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet26 = company22.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize27 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project28 = company1.createProject("hi!", qualificationSet26, projectSize27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null or empty");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!:0:0" + "'", str23, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet24);
        org.junit.Assert.assertNotNull(workerSet25);
        org.junit.Assert.assertNotNull(qualificationSet26);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        java.lang.String str4 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        edu.colostate.cs415.model.Project project7 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!:0:0" + "'", str4, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(projectSet6);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.getName();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet4 = company2.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize5 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project6 = new edu.colostate.cs415.model.Project("", qualificationSet4, projectSize5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:0:0" + "'", str3, "hi!:0:0");
        org.junit.Assert.assertNotNull(qualificationSet4);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        edu.colostate.cs415.model.Company company17 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification19 = company17.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet20 = qualification19.getWorkers();
        edu.colostate.cs415.model.Company company22 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification24 = company22.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet25 = qualification24.getWorkers();
        boolean boolean26 = qualification19.equals((java.lang.Object) qualification24);
        edu.colostate.cs415.model.Worker worker27 = null;
        qualification24.addWorker(worker27);
        edu.colostate.cs415.model.Company company30 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification32 = company30.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet33 = qualification32.getWorkers();
        boolean boolean34 = qualification24.equals((java.lang.Object) workerSet33);
        edu.colostate.cs415.model.Company company36 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet37 = company36.getEmployedWorkers();
        boolean boolean38 = qualification24.equals((java.lang.Object) company36);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet39 = company36.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize40 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project41 = company1.createProject("hi!:0:0", qualificationSet39, projectSize40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null or empty");
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
        org.junit.Assert.assertNotNull(qualification19);
        org.junit.Assert.assertNotNull(workerSet20);
        org.junit.Assert.assertNotNull(qualification24);
        org.junit.Assert.assertNotNull(workerSet25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(qualification32);
        org.junit.Assert.assertNotNull(workerSet33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(workerSet37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(qualificationSet39);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnavailableWorkers();
        java.lang.String str8 = company1.toString();
        edu.colostate.cs415.model.Project project9 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.finish(project9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!:0:0" + "'", str8, "hi!:0:0");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification9 = company7.createQualification("hi!");
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification14 = company12.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company12.getUnassignedWorkers();
        java.lang.String str16 = company12.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet17 = company12.getProjects();
        java.lang.String str18 = company12.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet19 = company12.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet20 = company12.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet21 = company12.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet22 = company12.getQualifications();
        edu.colostate.cs415.model.Worker worker24 = company7.createWorker("hi!", qualificationSet22, 1.0d);
        edu.colostate.cs415.model.Project project25 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker24, project25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertNotNull(qualification14);
        org.junit.Assert.assertNotNull(workerSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!:0:0" + "'", str16, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!:0:0" + "'", str18, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet19);
        org.junit.Assert.assertNotNull(workerSet20);
        org.junit.Assert.assertNotNull(workerSet21);
        org.junit.Assert.assertNotNull(qualificationSet22);
        org.junit.Assert.assertNotNull(worker24);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company7.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet9 = company7.getProjects();
        edu.colostate.cs415.model.Qualification qualification11 = company7.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company7.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company7.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize14 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project15 = company1.createProject("hi!:0:0:0:0", qualificationSet13, projectSize14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(projectSet9);
        org.junit.Assert.assertNotNull(qualification11);
        org.junit.Assert.assertNotNull(workerSet12);
        org.junit.Assert.assertNotNull(qualificationSet13);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet2 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company5 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification7 = company5.createQualification("hi!");
        boolean boolean9 = company5.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company5.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company5.getQualifications();
        boolean boolean12 = company1.equals((java.lang.Object) qualificationSet11);
        java.lang.Class<?> wildcardClass13 = qualificationSet11.getClass();
        org.junit.Assert.assertNotNull(projectSet2);
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(qualification7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(qualificationSet10);
        org.junit.Assert.assertNotNull(qualificationSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("", qualificationSet5, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Worker name cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualificationSet5);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company11.getUnassignedWorkers();
        java.lang.String str15 = company11.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company11.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = company11.getEmployedWorkers();
        edu.colostate.cs415.model.Qualification qualification19 = company11.createQualification("hi!:0:0:0:0:0:0");
        java.lang.String str20 = company11.getName();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet21 = company11.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize22 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project23 = company1.createProject("hi!:0:0:0:0", qualificationSet21, projectSize22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(qualificationSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(qualification13);
        org.junit.Assert.assertNotNull(workerSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!:0:0" + "'", str15, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet16);
        org.junit.Assert.assertNotNull(workerSet17);
        org.junit.Assert.assertNotNull(qualification19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(qualificationSet21);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company1.getUnassignedWorkers();
        java.lang.String str11 = company1.toString();
        java.lang.Class<?> wildcardClass12 = company1.getClass();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!:0:0" + "'", str11, "hi!:0:0");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("", qualificationSet5, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Worker name cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(qualificationSet5);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.lang.String str6 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company2.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company2.getEmployedWorkers();
        edu.colostate.cs415.model.Qualification qualification10 = company2.createQualification("hi!:0:0:0:0:0:0");
        java.lang.String str11 = company2.getName();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company2.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize13 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project14 = new edu.colostate.cs415.model.Project("hi!:0:0", qualificationSet12, projectSize13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!:0:0" + "'", str6, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(qualification10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(qualificationSet12);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company11.getAssignedWorkers();
        boolean boolean14 = company11.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet15 = company11.getQualifications();
        edu.colostate.cs415.model.Worker worker17 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet15, (double) 12);
        edu.colostate.cs415.model.ProjectSize projectSize18 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project19 = company1.createProject("hi!:0:0", qualificationSet15, projectSize18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(qualificationSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(workerSet12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(qualificationSet15);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Project project6 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.start(project6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertNotNull(workerSet5);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getEmployedWorkers();
        java.lang.String str10 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company1.getAssignedWorkers();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!:0:0" + "'", str10, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet11);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getEmployedWorkers();
        java.lang.String str5 = company1.toString();
        edu.colostate.cs415.model.Worker worker6 = null;
        edu.colostate.cs415.model.Project project7 = null;
        // The following exception was thrown during execution in test generation
        try {
            company1.assign(worker6, project7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0:0:0" + "'", str5, "hi!:0:0:0:0");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
        java.lang.String str15 = company6.getName();
        edu.colostate.cs415.model.Company company19 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet20 = company19.getAssignedWorkers();
        boolean boolean22 = company19.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet23 = company19.getQualifications();
        edu.colostate.cs415.model.Worker worker25 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet23, (double) 12);
        edu.colostate.cs415.model.ProjectSize projectSize26 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project27 = company6.createProject("hi!", qualificationSet23, projectSize26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null or empty");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(workerSet20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(qualificationSet23);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str11 = company10.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company10.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company10.getQualifications();
        edu.colostate.cs415.model.Worker worker15 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet13, 0.0d);
        edu.colostate.cs415.model.ProjectSize projectSize16 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project17 = company1.createProject("hi!", qualificationSet13, projectSize16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0:0:0" + "'", str2, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(workerSet5);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!:0:0:0:0" + "'", str11, "hi!:0:0:0:0");
        org.junit.Assert.assertNotNull(workerSet12);
        org.junit.Assert.assertNotNull(qualificationSet13);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0:0:0:0:0");
        java.lang.String str10 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company1.getEmployedWorkers();
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(workerSet7);
        org.junit.Assert.assertNotNull(qualification9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(workerSet11);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        edu.colostate.cs415.model.Qualification qualification6 = company2.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.ProjectSize projectSize8 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Project project9 = new edu.colostate.cs415.model.Project("hi!:0:0:0:0:0:0", qualificationSet7, projectSize8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Project size cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertNotNull(projectSet4);
        org.junit.Assert.assertNotNull(qualification6);
        org.junit.Assert.assertNotNull(qualificationSet7);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.lang.String str5 = company1.getName();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company7.getUnavailableWorkers();
        boolean boolean10 = company7.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet11 = company7.getProjects();
        boolean boolean13 = company7.equals((java.lang.Object) (short) -1);
        boolean boolean14 = company1.equals((java.lang.Object) company7);
        edu.colostate.cs415.model.Project project15 = null;
        // The following exception was thrown during execution in test generation
        try {
            company7.start(project15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:0:0" + "'", str2, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(projectSet11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getEmployedWorkers();
        java.lang.String str10 = company1.getName();
        edu.colostate.cs415.model.Qualification qualification12 = company1.createQualification("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification14 = company1.createQualification("hi!:0:0:0:0:0:0");
        edu.colostate.cs415.model.Company company16 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str17 = company16.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet18 = company16.getProjects();
        boolean boolean19 = qualification14.equals((java.lang.Object) projectSet18);
        org.junit.Assert.assertNotNull(qualification3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!:0:0" + "'", str5, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!:0:0" + "'", str7, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet8);
        org.junit.Assert.assertNotNull(workerSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(qualification12);
        org.junit.Assert.assertNotNull(qualification14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!:0:0" + "'", str17, "hi!:0:0");
        org.junit.Assert.assertNotNull(projectSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getUnavailableWorkers();
        boolean boolean5 = company2.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company2.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 1L);
        edu.colostate.cs415.model.Project project10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = worker9.willOverload(project10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: project can not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(workerSet6);
        org.junit.Assert.assertNotNull(qualificationSet7);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getAvailableWorkers();
        java.lang.String str5 = company1.getName();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str9 = company8.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company8.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company8.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company8.getQualifications();
        // The following exception was thrown during execution in test generation
        try {
            edu.colostate.cs415.model.Worker worker14 = company1.createWorker("hi!:0:0:0:0", qualificationSet12, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qualifications cannot be empty or null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workerSet2);
        org.junit.Assert.assertNotNull(projectSet3);
        org.junit.Assert.assertNotNull(workerSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!:0:0" + "'", str9, "hi!:0:0");
        org.junit.Assert.assertNotNull(workerSet10);
        org.junit.Assert.assertNotNull(workerSet11);
        org.junit.Assert.assertNotNull(qualificationSet12);
    }
}

