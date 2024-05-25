import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0001");
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
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO18 = qualification17.toDTO();
        edu.colostate.cs415.model.Qualification[] qualificationArray19 = new edu.colostate.cs415.model.Qualification[] { qualification9, qualification17 };
        java.util.LinkedHashSet<edu.colostate.cs415.model.Qualification> qualificationSet20 = new java.util.LinkedHashSet<edu.colostate.cs415.model.Qualification>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<edu.colostate.cs415.model.Qualification>) qualificationSet20, qualificationArray19);
        edu.colostate.cs415.model.Worker worker23 = new edu.colostate.cs415.model.Worker("hi!:0:0", (java.util.Set<edu.colostate.cs415.model.Qualification>) qualificationSet20, (double) ' ');
        org.junit.Assert.assertTrue("Contract failed: worker23.equals(worker23)", worker23.equals(worker23));
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0002");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification4 = company1.createQualification("hi!:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnassignedWorkers();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification4.", company1.equals(qualification4) == qualification4.equals(company1));
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0003");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification4 = company1.createQualification("hi!:0:0");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet5 = company1.getProjects();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification4.", company1.equals(qualification4) == qualification4.equals(company1));
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0004");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification4 = company1.createQualification("hi!:0:0");
        java.lang.String str5 = company1.getName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification4.", company1.equals(qualification4) == qualification4.equals(company1));
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0005");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        edu.colostate.cs415.dto.WorkerDTO workerDTO10 = worker9.toDTO();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0006");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = qualification8.getWorkers();
        boolean boolean10 = qualification3.equals((java.lang.Object) qualification8);
        edu.colostate.cs415.model.Company company13 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification15 = company13.createQualification("hi!");
        boolean boolean17 = company13.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet18 = company13.getQualifications();
        edu.colostate.cs415.model.Worker worker20 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet18, (double) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification8.removeWorker(worker20);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0007");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification9 = company7.createQualification("hi!");
        boolean boolean11 = company7.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company7.getQualifications();
        edu.colostate.cs415.model.Worker worker14 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet12, (double) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification3.removeWorker(worker14);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0008");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        java.lang.String str10 = worker9.toString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0009");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification4 = company1.createQualification("hi!:0:0");
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification9 = company7.createQualification("hi!");
        boolean boolean11 = company7.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company7.getQualifications();
        edu.colostate.cs415.model.Worker worker14 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet12, (double) 10L);
        qualification4.addWorker(worker14);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification4.", company1.equals(qualification4) == qualification4.equals(company1));
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0010");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        java.lang.String str10 = worker9.getName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0011");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = qualification3.getWorkers();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO5 = qualification3.toDTO();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification10 = company8.createQualification("hi!");
        boolean boolean12 = company8.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company8.getQualifications();
        edu.colostate.cs415.model.Worker worker15 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet13, (double) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification3.removeWorker(worker15);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0012");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        boolean boolean10 = worker9.isAvailable();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0013");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        boolean boolean13 = company9.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company9.getQualifications();
        edu.colostate.cs415.model.Worker worker16 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet14, (double) 10L);
        company1.unassignAll(worker16);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0014");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        java.util.Set<edu.colostate.cs415.model.Project> projectSet10 = worker9.getProjects();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0015");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = worker9.getQualifications();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0016");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Worker worker4 = null;
        qualification3.addWorker(worker4);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        boolean boolean13 = company9.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company9.getQualifications();
        edu.colostate.cs415.model.Worker worker16 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet14, (double) 10L);
        qualification3.addWorker(worker16);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0017");
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
        edu.colostate.cs415.model.Company company22 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification24 = company22.createQualification("hi!");
        boolean boolean26 = company22.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet27 = company22.getQualifications();
        edu.colostate.cs415.model.Worker worker29 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet27, (double) 10L);
        qualification8.addWorker(worker29);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker29.", company1.equals(worker29) == worker29.equals(company1));
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0018");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getUnassignedWorkers();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification5.", company1.equals(qualification5) == qualification5.equals(company1));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0019");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company11.getUnassignedWorkers();
        java.lang.String str15 = company11.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet16 = company11.getProjects();
        java.lang.String str17 = company11.toString();
        edu.colostate.cs415.model.Qualification qualification19 = company11.createQualification("hi!:0:0:0:0");
        boolean boolean20 = worker9.equals((java.lang.Object) company11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0020");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        worker9.setSalary((double) '#');
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0021");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        worker9.setSalary(0.0d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0022");
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
        edu.colostate.cs415.model.Company company31 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification33 = company31.createQualification("hi!");
        boolean boolean35 = company31.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet36 = company31.getQualifications();
        edu.colostate.cs415.model.Worker worker38 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet36, (double) 10L);
        qualification8.addWorker(worker38);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker38.", company1.equals(worker38) == worker38.equals(company1));
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0023");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        worker9.setSalary((double) '4');
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0024");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
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
        edu.colostate.cs415.model.Qualification qualification34 = company30.createQualification("hi!");
        worker9.addQualification(qualification34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0025");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        double double10 = worker9.getSalary();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0026");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0:0:0");
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification14 = company12.createQualification("hi!");
        boolean boolean16 = company12.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet17 = company12.getQualifications();
        edu.colostate.cs415.model.Worker worker19 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet17, (double) 10L);
        qualification9.addWorker(worker19);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker19.", company1.equals(worker19) == worker19.equals(company1));
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0027");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Worker worker4 = null;
        qualification3.addWorker(worker4);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        boolean boolean13 = company9.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company9.getQualifications();
        edu.colostate.cs415.model.Worker worker16 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet14, (double) 10L);
        qualification3.removeWorker(worker16);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0028");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Company company5 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification7 = company5.createQualification("hi!");
        boolean boolean9 = company5.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company5.getQualifications();
        edu.colostate.cs415.model.Worker worker12 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet10, (double) 10L);
        company1.unassignAll(worker12);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker12.", company1.equals(worker12) == worker12.equals(company1));
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0029");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        worker9.setSalary((double) 100.0f);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0030");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        boolean boolean10 = company6.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company6.getQualifications();
        edu.colostate.cs415.model.Worker worker13 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet11, (double) 10L);
        qualification3.addWorker(worker13);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker13.", company1.equals(worker13) == worker13.equals(company1));
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0031");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
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
        edu.colostate.cs415.model.Qualification qualification34 = company30.createQualification("hi!");
        edu.colostate.cs415.model.Company company36 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet37 = company36.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet38 = company36.getProjects();
        boolean boolean39 = qualification34.equals((java.lang.Object) projectSet38);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet40 = qualification34.getWorkers();
        boolean boolean41 = worker9.equals((java.lang.Object) workerSet40);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0032");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        edu.colostate.cs415.model.Worker worker14 = null;
        qualification13.addWorker(worker14);
        worker9.addQualification(qualification13);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0033");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = qualification13.getWorkers();
        edu.colostate.cs415.model.Company company16 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification18 = company16.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet19 = qualification18.getWorkers();
        boolean boolean20 = qualification13.equals((java.lang.Object) qualification18);
        java.lang.String str21 = qualification18.toString();
        edu.colostate.cs415.model.Company company23 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification25 = company23.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet26 = qualification25.getWorkers();
        edu.colostate.cs415.model.Company company28 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification30 = company28.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet31 = qualification30.getWorkers();
        boolean boolean32 = qualification25.equals((java.lang.Object) qualification30);
        edu.colostate.cs415.model.Worker worker33 = null;
        qualification25.addWorker(worker33);
        java.lang.String str35 = qualification25.toString();
        boolean boolean36 = qualification18.equals((java.lang.Object) str35);
        boolean boolean38 = qualification18.equals((java.lang.Object) (byte) 10);
        worker9.addQualification(qualification18);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0034");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        boolean boolean15 = company11.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet16 = company11.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet17 = company11.getQualifications();
        boolean boolean18 = worker9.equals((java.lang.Object) qualificationSet17);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0035");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        edu.colostate.cs415.model.Company company4 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification6 = company4.createQualification("hi!");
        boolean boolean8 = company4.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet9 = company4.getQualifications();
        edu.colostate.cs415.model.Worker worker11 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet9, (double) 10L);
        company1.unassignAll(worker11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker11.", company1.equals(worker11) == worker11.equals(company1));
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0036");
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
        edu.colostate.cs415.model.Company company21 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification23 = company21.createQualification("hi!");
        boolean boolean25 = company21.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet26 = company21.getQualifications();
        edu.colostate.cs415.model.Worker worker28 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet26, (double) 10L);
        qualification8.removeWorker(worker28);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker28.", company1.equals(worker28) == worker28.equals(company1));
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0037");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Company company4 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification6 = company4.createQualification("hi!");
        boolean boolean8 = company4.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet9 = company4.getQualifications();
        edu.colostate.cs415.model.Worker worker11 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet9, (double) 10L);
        company1.unassignAll(worker11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker11.", company1.equals(worker11) == worker11.equals(company1));
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0038");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        boolean boolean10 = company6.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company6.getQualifications();
        edu.colostate.cs415.model.Worker worker13 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet11, (double) 10L);
        company1.unassignAll(worker13);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker13.", company1.equals(worker13) == worker13.equals(company1));
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0039");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company11.getUnavailableWorkers();
        boolean boolean13 = worker9.equals((java.lang.Object) company11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0040");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        boolean boolean11 = worker9.equals((java.lang.Object) 10.0f);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0041");
        edu.colostate.cs415.model.Qualification qualification1 = new edu.colostate.cs415.model.Qualification("hi!:0:0");
        edu.colostate.cs415.model.Company company4 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification6 = company4.createQualification("hi!");
        boolean boolean8 = company4.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet9 = company4.getQualifications();
        edu.colostate.cs415.model.Worker worker11 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet9, (double) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification1.removeWorker(worker11);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0042");
        edu.colostate.cs415.model.Qualification qualification1 = new edu.colostate.cs415.model.Qualification("hi!:0:0:0:0");
        edu.colostate.cs415.model.Company company4 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification6 = company4.createQualification("hi!");
        boolean boolean8 = company4.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet9 = company4.getQualifications();
        edu.colostate.cs415.model.Worker worker11 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet9, (double) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification1.removeWorker(worker11);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0043");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
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
        worker9.addQualification(qualification18);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0044");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
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
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet29 = qualification18.getWorkers();
        boolean boolean30 = worker9.equals((java.lang.Object) qualification18);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0045");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!:0:0");
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str8 = company7.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company7.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification11 = company7.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet12 = company7.getProjects();
        boolean boolean13 = company1.equals((java.lang.Object) projectSet12);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification5.", company1.equals(qualification5) == qualification5.equals(company1));
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0046");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        worker9.setSalary((double) 12);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0047");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company11.getUnassignedWorkers();
        java.lang.String str15 = company11.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet16 = company11.getProjects();
        java.lang.String str17 = company11.toString();
        edu.colostate.cs415.model.Qualification qualification19 = company11.createQualification("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet20 = company11.getEmployedWorkers();
        boolean boolean21 = worker9.equals((java.lang.Object) company11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0048");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        int int8 = worker7.getWorkload();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0049");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO4 = qualification3.toDTO();
        boolean boolean6 = qualification3.equals((java.lang.Object) 10.0d);
        java.lang.String str7 = qualification3.toString();
        java.lang.String str8 = qualification3.toString();
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str12 = company11.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company11.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company11.getQualifications();
        edu.colostate.cs415.model.Worker worker16 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet14, (double) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification3.removeWorker(worker16);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0050");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        boolean boolean8 = worker7.isAvailable();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0051");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        java.util.Set<edu.colostate.cs415.model.Project> projectSet8 = worker7.getProjects();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0052");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        worker7.setSalary((double) 10);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0053");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = qualification3.getWorkers();
        java.lang.String str5 = qualification3.toString();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str9 = company8.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company8.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company8.getQualifications();
        edu.colostate.cs415.model.Worker worker13 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet11, (double) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification3.removeWorker(worker13);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0054");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        java.lang.String str8 = worker7.getName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0055");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        worker9.setSalary((double) 0);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0056");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getAssignedWorkers();
        boolean boolean4 = company1.equals((java.lang.Object) 0);
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str8 = company7.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company7.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company7.getQualifications();
        edu.colostate.cs415.model.Worker worker12 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet10, (double) ' ');
        company1.unassignAll(worker12);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker12.", company1.equals(worker12) == worker12.equals(company1));
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0057");
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
        java.lang.String str27 = company20.toString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification26.", company1.equals(qualification26) == qualification26.equals(company1));
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0058");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        worker7.setSalary((double) 0L);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0059");
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
        edu.colostate.cs415.model.Company company17 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification19 = company17.createQualification("hi!");
        boolean boolean21 = company17.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet22 = company17.getQualifications();
        edu.colostate.cs415.model.Worker worker24 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet22, (double) 10L);
        qualification3.removeWorker(worker24);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker24.", company1.equals(worker24) == worker24.equals(company1));
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0060");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        java.lang.Object obj6 = null;
        boolean boolean7 = company1.equals(obj6);
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company1.getEmployedWorkers();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification9.", company1.equals(qualification9) == qualification9.equals(company1));
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0061");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        java.lang.Object obj6 = null;
        boolean boolean7 = company1.equals(obj6);
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        boolean boolean15 = company11.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet16 = company11.getQualifications();
        edu.colostate.cs415.model.Worker worker18 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet16, (double) 10L);
        edu.colostate.cs415.model.Worker worker20 = company1.createWorker("hi!:0:0", qualificationSet16, (double) 100.0f);
        org.junit.Assert.assertTrue("Contract failed: worker20.equals(worker20)", worker20.equals(worker20));
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0062");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        int int10 = worker9.getWorkload();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0063");
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
        edu.colostate.cs415.model.Company company21 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification23 = company21.createQualification("hi!");
        boolean boolean25 = company21.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet26 = company21.getQualifications();
        edu.colostate.cs415.model.Worker worker28 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet26, (double) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification3.removeWorker(worker28);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0064");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str12 = company11.toString();
        boolean boolean13 = worker9.equals((java.lang.Object) company11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0065");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        java.lang.String str8 = worker7.toString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0066");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = qualification8.getWorkers();
        boolean boolean10 = qualification3.equals((java.lang.Object) qualification8);
        edu.colostate.cs415.model.Company company13 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str14 = company13.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company13.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet16 = company13.getQualifications();
        edu.colostate.cs415.model.Worker worker18 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet16, (double) ' ');
        qualification3.addWorker(worker18);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0067");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!:0:0", qualificationSet7, (double) 1);
        org.junit.Assert.assertTrue("Contract failed: worker9.equals(worker9)", worker9.equals(worker9));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0068");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = worker7.getQualifications();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0069");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        worker7.setSalary((double) (byte) 0);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0070");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = qualification11.getWorkers();
        edu.colostate.cs415.model.Company company14 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification16 = company14.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = qualification16.getWorkers();
        boolean boolean18 = qualification11.equals((java.lang.Object) qualification16);
        edu.colostate.cs415.model.Worker worker19 = null;
        qualification11.addWorker(worker19);
        java.lang.String str21 = qualification11.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet22 = qualification11.getWorkers();
        worker7.addQualification(qualification11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0071");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company11.getUnavailableWorkers();
        edu.colostate.cs415.model.Company company14 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str15 = company14.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet16 = company14.getProjects();
        boolean boolean17 = company11.equals((java.lang.Object) projectSet16);
        edu.colostate.cs415.model.Qualification qualification19 = company11.createQualification("hi!");
        boolean boolean20 = worker9.equals((java.lang.Object) qualification19);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0072");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        worker7.setSalary((double) ' ');
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0073");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        boolean boolean4 = company1.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet5 = company1.getProjects();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str9 = company8.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company8.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company8.getQualifications();
        edu.colostate.cs415.model.Worker worker13 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet11, (double) ' ');
        company1.unassignAll(worker13);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker13.", company1.equals(worker13) == worker13.equals(company1));
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0074");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
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
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet29 = qualification18.getWorkers();
        worker9.addQualification(qualification18);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0075");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO4 = qualification3.toDTO();
        boolean boolean6 = qualification3.equals((java.lang.Object) 10.0d);
        java.lang.String str7 = qualification3.toString();
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str11 = company10.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company10.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company10.getQualifications();
        edu.colostate.cs415.model.Worker worker15 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet13, (double) ' ');
        qualification3.addWorker(worker15);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker15.", company1.equals(worker15) == worker15.equals(company1));
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0076");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = qualification8.getWorkers();
        boolean boolean10 = qualification3.equals((java.lang.Object) qualification8);
        java.lang.String str11 = qualification3.toString();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO12 = qualification3.toDTO();
        edu.colostate.cs415.model.Company company15 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str16 = company15.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = company15.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet18 = company15.getQualifications();
        edu.colostate.cs415.model.Worker worker20 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet18, (double) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification3.removeWorker(worker20);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0077");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = qualification11.getWorkers();
        worker7.addQualification(qualification11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0078");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        edu.colostate.cs415.dto.WorkerDTO workerDTO8 = worker7.toDTO();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0079");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        boolean boolean15 = company11.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet16 = company11.getQualifications();
        java.lang.Class<?> wildcardClass17 = company11.getClass();
        boolean boolean18 = worker9.equals((java.lang.Object) wildcardClass17);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0080");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO14 = qualification13.toDTO();
        boolean boolean16 = qualification13.equals((java.lang.Object) 10.0d);
        edu.colostate.cs415.model.Worker worker17 = null;
        qualification13.addWorker(worker17);
        worker9.addQualification(qualification13);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0081");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        worker7.setSalary((double) 10.0f);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0082");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO14 = qualification13.toDTO();
        boolean boolean16 = qualification13.equals((java.lang.Object) 10.0d);
        edu.colostate.cs415.model.Company company18 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification20 = company18.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet21 = qualification20.getWorkers();
        edu.colostate.cs415.model.Company company23 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification25 = company23.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet26 = qualification25.getWorkers();
        boolean boolean27 = qualification20.equals((java.lang.Object) qualification25);
        boolean boolean28 = qualification13.equals((java.lang.Object) boolean27);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet29 = qualification13.getWorkers();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO30 = qualification13.toDTO();
        worker9.addQualification(qualification13);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0083");
        edu.colostate.cs415.model.Company company3 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str4 = company3.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company3.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company3.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) ' ');
        edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) (byte) 10);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company3 and worker8.", company3.equals(worker8) == worker8.equals(company3));
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0084");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        worker7.setSalary((double) (short) 0);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0085");
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
        company1.unassignAll(worker17);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker17.", company1.equals(worker17) == worker17.equals(company1));
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0086");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
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
        company1.unassignAll(worker23);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker23.", company1.equals(worker23) == worker23.equals(company1));
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0087");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = qualification3.getWorkers();
        java.lang.String str5 = qualification3.toString();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification10 = company8.createQualification("hi!");
        boolean boolean12 = company8.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company8.getQualifications();
        edu.colostate.cs415.model.Worker worker15 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet13, (double) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification3.removeWorker(worker15);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0088");
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
        boolean boolean19 = worker18.isAvailable();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0089");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        java.lang.Object obj6 = null;
        boolean boolean7 = company1.equals(obj6);
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0:0:0");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO10 = qualification9.toDTO();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification9.", company1.equals(qualification9) == qualification9.equals(company1));
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0090");
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
        double double19 = worker18.getSalary();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0091");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        worker9.setSalary((double) (short) 1);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0092");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.lang.String str6 = company1.getName();
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str10 = company9.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company9.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company9.getQualifications();
        edu.colostate.cs415.model.Worker worker14 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet12, (double) ' ');
        company1.unassignAll(worker14);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker14.", company1.equals(worker14) == worker14.equals(company1));
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0093");
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
        java.util.Set<edu.colostate.cs415.model.Project> projectSet19 = worker18.getProjects();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0094");
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
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet19 = worker18.getQualifications();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0095");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
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
        worker7.addQualification(qualification16);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0096");
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
        edu.colostate.cs415.dto.WorkerDTO workerDTO19 = worker18.toDTO();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0097");
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
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification22 = company20.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = qualification22.getWorkers();
        edu.colostate.cs415.model.Company company25 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification27 = company25.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet28 = qualification27.getWorkers();
        boolean boolean29 = qualification22.equals((java.lang.Object) qualification27);
        edu.colostate.cs415.model.Worker worker30 = null;
        qualification22.addWorker(worker30);
        java.lang.String str32 = qualification22.toString();
        java.lang.String str33 = qualification22.toString();
        java.lang.String str34 = qualification22.toString();
        worker18.addQualification(qualification22);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0098");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
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
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet31 = company28.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet32 = company28.getEmployedWorkers();
        edu.colostate.cs415.model.Qualification qualification34 = company28.createQualification("hi!:0:0");
        worker7.addQualification(qualification34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0099");
        edu.colostate.cs415.model.Qualification qualification1 = new edu.colostate.cs415.model.Qualification("hi!:0:0");
        edu.colostate.cs415.model.Company company3 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str4 = company3.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company3.getAssignedWorkers();
        java.lang.String str6 = company3.getName();
        boolean boolean7 = qualification1.equals((java.lang.Object) str6);
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification1.removeWorker(worker26);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0100");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        double double8 = worker7.getSalary();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0101");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        worker9.setSalary(10.0d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0102");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Qualification qualification7 = company1.createQualification("hi!:0:0");
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company9.getUnassignedWorkers();
        java.lang.String str13 = company9.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet14 = company9.getProjects();
        java.lang.String str15 = company9.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company9.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = company9.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet18 = company9.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet19 = company9.getQualifications();
        boolean boolean20 = qualification7.equals((java.lang.Object) company9);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on qualification7 and company9.", qualification7.equals(company9) == company9.equals(qualification7));
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0103");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!:0:0:0:0", qualificationSet7, (double) 0);
        org.junit.Assert.assertTrue("Contract failed: worker9.equals(worker9)", worker9.equals(worker9));
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0104");
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
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet19 = company1.getEmployedWorkers();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0105");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0:0:0");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO10 = qualification9.toDTO();
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company12.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company12.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company12.getAvailableWorkers();
        boolean boolean16 = qualification9.equals((java.lang.Object) workerSet15);
        edu.colostate.cs415.model.Company company19 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str20 = company19.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet21 = company19.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet22 = company19.getQualifications();
        edu.colostate.cs415.model.Worker worker24 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet22, (double) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification9.removeWorker(worker24);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0106");
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
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification22 = company20.createQualification("hi!");
        edu.colostate.cs415.model.Worker worker23 = null;
        qualification22.addWorker(worker23);
        boolean boolean25 = worker18.equals((java.lang.Object) qualification22);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0107");
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
        edu.colostate.cs415.model.Company company30 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification32 = company30.createQualification("hi!");
        boolean boolean34 = company30.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet35 = company30.getQualifications();
        edu.colostate.cs415.model.Worker worker37 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet35, (double) 10L);
        company20.unassignAll(worker37);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker37.", company1.equals(worker37) == worker37.equals(company1));
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0108");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        boolean boolean9 = worker7.equals((java.lang.Object) 1.0f);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0109");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        worker7.setSalary((double) 1);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0110");
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
        company1.unassignAll(worker15);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker15.", company1.equals(worker15) == worker15.equals(company1));
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0111");
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
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str21 = company20.toString();
        java.lang.String str22 = company20.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = company20.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet24 = company20.getUnassignedWorkers();
        boolean boolean25 = worker18.equals((java.lang.Object) workerSet24);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0112");
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
        java.lang.String str19 = worker18.toString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0113");
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
        int int19 = worker18.getWorkload();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0114");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = qualification11.getWorkers();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO13 = qualification11.toDTO();
        boolean boolean15 = qualification11.equals((java.lang.Object) (short) 1);
        worker7.addQualification(qualification11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0115");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = qualification5.getWorkers();
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
        qualification5.addWorker(worker25);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker25.", company1.equals(worker25) == worker25.equals(company1));
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0116");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company9.getUnassignedWorkers();
        java.lang.String str13 = company9.toString();
        java.lang.String str14 = company9.getName();
        boolean boolean15 = worker7.equals((java.lang.Object) company9);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0117");
        edu.colostate.cs415.model.Company company3 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification5 = company3.createQualification("hi!");
        boolean boolean7 = company3.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company3.getQualifications();
        edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet8, (double) 10L);
        edu.colostate.cs415.model.Worker worker12 = new edu.colostate.cs415.model.Worker("hi!:0:0:0:0", qualificationSet8, (double) 1.0f);
        org.junit.Assert.assertTrue("Contract failed: worker12.equals(worker12)", worker12.equals(worker12));
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0118");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0:0:0");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO10 = qualification9.toDTO();
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company12.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company12.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company12.getAvailableWorkers();
        boolean boolean16 = qualification9.equals((java.lang.Object) workerSet15);
        edu.colostate.cs415.model.Company company18 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet19 = company18.getUnassignedWorkers();
        boolean boolean20 = qualification9.equals((java.lang.Object) company18);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on qualification9 and company18.", qualification9.equals(company18) == company18.equals(qualification9));
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0119");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, 0.0d);
        java.lang.String str8 = worker7.getName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0120");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        boolean boolean10 = company6.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company6.getQualifications();
        edu.colostate.cs415.model.Worker worker13 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet11, (double) 10L);
        qualification3.addWorker(worker13);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker13.", company1.equals(worker13) == worker13.equals(company1));
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0121");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, 0.0d);
        java.util.Set<edu.colostate.cs415.model.Project> projectSet8 = worker7.getProjects();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0122");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str12 = company11.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company11.getAssignedWorkers();
        java.lang.String str14 = company11.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company11.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company11.getEmployedWorkers();
        boolean boolean17 = worker9.equals((java.lang.Object) workerSet16);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0123");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, 0.0d);
        java.lang.String str8 = worker7.toString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0124");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, 0.0d);
        edu.colostate.cs415.dto.WorkerDTO workerDTO8 = worker7.toDTO();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0125");
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
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str21 = company20.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet22 = company20.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = company20.getUnavailableWorkers();
        java.lang.String str24 = company20.getName();
        edu.colostate.cs415.model.Company company26 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet27 = company26.getUnavailableWorkers();
        boolean boolean29 = company26.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet30 = company26.getProjects();
        boolean boolean32 = company26.equals((java.lang.Object) (short) -1);
        boolean boolean33 = company20.equals((java.lang.Object) company26);
        boolean boolean34 = worker18.equals((java.lang.Object) company20);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0126");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, 0.0d);
        int int8 = worker7.getWorkload();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0127");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company1.getQualifications();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str9 = company8.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company8.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company8.getQualifications();
        edu.colostate.cs415.model.Worker worker13 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet11, 0.0d);
        company1.unassignAll(worker13);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker13.", company1.equals(worker13) == worker13.equals(company1));
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0128");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAssignedWorkers();
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
        company1.unassignAll(worker27);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker27.", company1.equals(worker27) == worker27.equals(company1));
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0129");
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
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification22 = company20.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = qualification22.getWorkers();
        edu.colostate.cs415.model.Company company25 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification27 = company25.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet28 = qualification27.getWorkers();
        boolean boolean29 = qualification22.equals((java.lang.Object) qualification27);
        java.lang.String str30 = qualification22.toString();
        java.lang.String str31 = qualification22.toString();
        java.lang.String str32 = qualification22.toString();
        worker18.addQualification(qualification22);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0130");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.lang.String str4 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Qualification qualification7 = company1.createQualification("hi!:0:0:0:0");
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
        qualification7.addWorker(worker26);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification7.", company1.equals(qualification7) == qualification7.equals(company1));
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0131");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, 0.0d);
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = qualification11.getWorkers();
        edu.colostate.cs415.model.Company company14 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification16 = company14.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = qualification16.getWorkers();
        boolean boolean18 = qualification11.equals((java.lang.Object) qualification16);
        java.lang.String str19 = qualification11.toString();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO20 = qualification11.toDTO();
        java.lang.String str21 = qualification11.toString();
        edu.colostate.cs415.model.Company company23 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification25 = company23.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet26 = qualification25.getWorkers();
        edu.colostate.cs415.model.Company company28 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification30 = company28.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet31 = qualification30.getWorkers();
        boolean boolean32 = qualification25.equals((java.lang.Object) qualification30);
        edu.colostate.cs415.model.Worker worker33 = null;
        qualification25.addWorker(worker33);
        java.lang.String str35 = qualification25.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet36 = qualification25.getWorkers();
        boolean boolean37 = qualification11.equals((java.lang.Object) qualification25);
        boolean boolean38 = worker7.equals((java.lang.Object) qualification25);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0132");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, 0.0d);
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        edu.colostate.cs415.model.Worker worker12 = null;
        qualification11.addWorker(worker12);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = qualification11.getWorkers();
        worker7.addQualification(qualification11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0133");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
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
        edu.colostate.cs415.model.Qualification qualification34 = company30.createQualification("hi!");
        edu.colostate.cs415.model.Company company36 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet37 = company36.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet38 = company36.getProjects();
        boolean boolean39 = qualification34.equals((java.lang.Object) projectSet38);
        worker9.addQualification(qualification34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0134");
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
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification22 = company20.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = qualification22.getWorkers();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO24 = qualification22.toDTO();
        worker18.addQualification(qualification22);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0135");
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
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO27 = qualification26.toDTO();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification26.", company1.equals(qualification26) == qualification26.equals(company1));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0136");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = qualification11.getWorkers();
        edu.colostate.cs415.model.Company company14 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification16 = company14.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = qualification16.getWorkers();
        boolean boolean18 = qualification11.equals((java.lang.Object) qualification16);
        edu.colostate.cs415.model.Worker worker19 = null;
        qualification11.addWorker(worker19);
        java.lang.String str21 = qualification11.toString();
        java.lang.String str22 = qualification11.toString();
        edu.colostate.cs415.model.Worker worker23 = null;
        qualification11.addWorker(worker23);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet25 = qualification11.getWorkers();
        boolean boolean26 = worker7.equals((java.lang.Object) workerSet25);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0137");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company9.getAssignedWorkers();
        boolean boolean12 = company9.equals((java.lang.Object) 0);
        boolean boolean13 = worker7.equals((java.lang.Object) company9);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0138");
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
        qualification8.addWorker(worker55);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker55.", company1.equals(worker55) == worker55.equals(company1));
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0139");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet10 = company9.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company9.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company13 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification15 = company13.createQualification("hi!");
        boolean boolean17 = company13.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet18 = company13.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet19 = company13.getQualifications();
        boolean boolean20 = company9.equals((java.lang.Object) qualificationSet19);
        boolean boolean21 = worker7.equals((java.lang.Object) qualificationSet19);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0140");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = qualification11.getWorkers();
        edu.colostate.cs415.model.Company company14 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification16 = company14.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = qualification16.getWorkers();
        boolean boolean18 = qualification11.equals((java.lang.Object) qualification16);
        java.lang.String str19 = qualification11.toString();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO20 = qualification11.toDTO();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet21 = qualification11.getWorkers();
        worker7.addQualification(qualification11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0141");
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
        worker18.setSalary((double) (byte) 10);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0142");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO4 = qualification3.toDTO();
        java.lang.String str5 = qualification3.toString();
        java.lang.Object obj6 = null;
        boolean boolean7 = qualification3.equals(obj6);
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str11 = company10.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company10.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company10.getQualifications();
        edu.colostate.cs415.model.Worker worker15 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet13, 0.0d);
        qualification3.addWorker(worker15);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker15.", company1.equals(worker15) == worker15.equals(company1));
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0143");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getEmployedWorkers();
        java.lang.String str10 = company1.toString();
        edu.colostate.cs415.model.Company company13 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification15 = company13.createQualification("hi!");
        boolean boolean17 = company13.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet18 = company13.getQualifications();
        edu.colostate.cs415.model.Worker worker20 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet18, (double) 10L);
        company1.unassignAll(worker20);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker20.", company1.equals(worker20) == worker20.equals(company1));
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0144");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification4 = company1.createQualification("hi!:0:0");
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO9 = qualification8.toDTO();
        boolean boolean11 = qualification8.equals((java.lang.Object) 10.0d);
        edu.colostate.cs415.model.Worker worker12 = null;
        qualification8.addWorker(worker12);
        edu.colostate.cs415.model.Company company15 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company15.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet17 = company15.getProjects();
        edu.colostate.cs415.model.Qualification qualification19 = company15.createQualification("hi!");
        boolean boolean20 = qualification8.equals((java.lang.Object) company15);
        boolean boolean21 = qualification4.equals((java.lang.Object) qualification8);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification4.", company1.equals(qualification4) == qualification4.equals(company1));
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0145");
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
        edu.colostate.cs415.model.Qualification qualification20 = new edu.colostate.cs415.model.Qualification("hi!:0:0");
        edu.colostate.cs415.model.Company company22 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str23 = company22.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet24 = company22.getAssignedWorkers();
        java.lang.String str25 = company22.getName();
        boolean boolean26 = qualification20.equals((java.lang.Object) str25);
        worker18.addQualification(qualification20);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0146");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, 0.0d);
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = qualification11.getWorkers();
        edu.colostate.cs415.model.Company company14 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification16 = company14.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = qualification16.getWorkers();
        boolean boolean18 = qualification11.equals((java.lang.Object) qualification16);
        edu.colostate.cs415.model.Worker worker19 = null;
        qualification11.addWorker(worker19);
        java.lang.String str21 = qualification11.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet22 = qualification11.getWorkers();
        worker7.addQualification(qualification11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0147");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        worker9.setSalary((double) ' ');
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0148");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = qualification11.getWorkers();
        edu.colostate.cs415.model.Company company14 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification16 = company14.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = qualification16.getWorkers();
        boolean boolean18 = qualification11.equals((java.lang.Object) qualification16);
        edu.colostate.cs415.model.Worker worker19 = null;
        qualification11.addWorker(worker19);
        java.lang.String str21 = qualification11.toString();
        worker7.addQualification(qualification11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0149");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Qualification qualification10 = company1.createQualification("hi!:0:0");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO11 = qualification10.toDTO();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification10.", company1.equals(qualification10) == qualification10.equals(company1));
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0150");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getAssignedWorkers();
        boolean boolean5 = company2.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!:0:0", qualificationSet6, (double) 100);
        org.junit.Assert.assertTrue("Contract failed: worker8.equals(worker8)", worker8.equals(worker8));
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0151");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
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
        boolean boolean26 = company1.equals((java.lang.Object) 1.0d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker25.", company1.equals(worker25) == worker25.equals(company1));
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0152");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0:0:0");
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification14 = company12.createQualification("hi!");
        boolean boolean16 = company12.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet17 = company12.getQualifications();
        edu.colostate.cs415.model.Worker worker19 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet17, (double) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification9.removeWorker(worker19);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0153");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, 0.0d);
        boolean boolean8 = worker7.isAvailable();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0154");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        worker7.setSalary(10.0d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0155");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO4 = qualification3.toDTO();
        java.lang.String str5 = qualification3.toString();
        java.lang.Object obj6 = null;
        boolean boolean7 = qualification3.equals(obj6);
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str11 = company10.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company10.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company10.getQualifications();
        edu.colostate.cs415.model.Worker worker15 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet13, (double) ' ');
        qualification3.addWorker(worker15);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker15.", company1.equals(worker15) == worker15.equals(company1));
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0156");
        edu.colostate.cs415.model.Qualification qualification1 = new edu.colostate.cs415.model.Qualification("hi!:0:0");
        edu.colostate.cs415.model.Company company3 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str4 = company3.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company3.getAssignedWorkers();
        java.lang.String str6 = company3.getName();
        boolean boolean7 = qualification1.equals((java.lang.Object) str6);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = qualification1.getWorkers();
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str12 = company11.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company11.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company11.getQualifications();
        edu.colostate.cs415.model.Worker worker16 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet14, 0.0d);
        qualification1.addWorker(worker16);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on qualification1 and worker16.", qualification1.equals(worker16) == worker16.equals(qualification1));
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0157");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.lang.String str4 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Qualification qualification7 = company1.createQualification("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification7.", company1.equals(qualification7) == qualification7.equals(company1));
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0158");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, 0.0d);
        worker7.setSalary(10.0d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0159");
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
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet19 = company1.getQualifications();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0160");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, 0.0d);
        double double8 = worker7.getSalary();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0161");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        worker7.setSalary((double) 0.0f);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0162");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, 0.0d);
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str10 = company9.toString();
        java.lang.String str11 = company9.toString();
        boolean boolean12 = worker7.equals((java.lang.Object) company9);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0163");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, 0.0d);
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = qualification11.getWorkers();
        edu.colostate.cs415.model.Company company14 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification16 = company14.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = qualification16.getWorkers();
        boolean boolean18 = qualification11.equals((java.lang.Object) qualification16);
        edu.colostate.cs415.model.Worker worker19 = null;
        qualification11.addWorker(worker19);
        java.lang.String str21 = qualification11.toString();
        java.lang.String str22 = qualification11.toString();
        java.lang.String str23 = qualification11.toString();
        boolean boolean24 = worker7.equals((java.lang.Object) qualification11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0164");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAvailableWorkers();
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
        company1.unassignAll(worker27);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker27.", company1.equals(worker27) == worker27.equals(company1));
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0165");
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
        edu.colostate.cs415.model.Company company25 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str26 = company25.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet27 = company25.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet28 = company25.getQualifications();
        edu.colostate.cs415.model.Worker worker30 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet28, 0.0d);
        qualification8.addWorker(worker30);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker30.", company1.equals(worker30) == worker30.equals(company1));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0166");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        worker7.setSalary((double) (short) 1);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0167");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, 0.0d);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = worker7.getQualifications();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0168");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        boolean boolean15 = company11.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet16 = company11.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet17 = company11.getQualifications();
        java.lang.Class<?> wildcardClass18 = qualificationSet17.getClass();
        boolean boolean19 = worker9.equals((java.lang.Object) qualificationSet17);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0169");
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
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet21 = company20.getUnavailableWorkers();
        boolean boolean23 = company20.equals((java.lang.Object) "");
        edu.colostate.cs415.model.Qualification qualification25 = company20.createQualification("hi!");
        worker18.addQualification(qualification25);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0170");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company9.getUnavailableWorkers();
        boolean boolean12 = company9.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company9.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company9.getQualifications();
        boolean boolean15 = worker7.equals((java.lang.Object) company9);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0171");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = qualification13.getWorkers();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO15 = qualification13.toDTO();
        worker9.addQualification(qualification13);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0172");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!:0:0");
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
        qualification5.addWorker(worker24);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification5.", company1.equals(qualification5) == qualification5.equals(company1));
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0173");
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
        edu.colostate.cs415.model.Company company37 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str38 = company37.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet39 = company37.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification41 = company37.createQualification("hi!");
        java.lang.Object obj42 = null;
        boolean boolean43 = company37.equals(obj42);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet44 = company37.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet45 = company37.getQualifications();
        edu.colostate.cs415.model.Worker worker47 = company1.createWorker("hi!:0:0", qualificationSet45, 10.0d);
        org.junit.Assert.assertTrue("Contract failed: worker47.equals(worker47)", worker47.equals(worker47));
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0174");
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
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification22 = company20.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = qualification22.getWorkers();
        edu.colostate.cs415.model.Company company25 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification27 = company25.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet28 = qualification27.getWorkers();
        boolean boolean29 = qualification22.equals((java.lang.Object) qualification27);
        java.lang.String str30 = qualification27.toString();
        edu.colostate.cs415.model.Company company32 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification34 = company32.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet35 = qualification34.getWorkers();
        edu.colostate.cs415.model.Company company37 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification39 = company37.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet40 = qualification39.getWorkers();
        boolean boolean41 = qualification34.equals((java.lang.Object) qualification39);
        edu.colostate.cs415.model.Worker worker42 = null;
        qualification34.addWorker(worker42);
        java.lang.String str44 = qualification34.toString();
        boolean boolean45 = qualification27.equals((java.lang.Object) str44);
        boolean boolean47 = qualification27.equals((java.lang.Object) (byte) 10);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet48 = qualification27.getWorkers();
        worker18.addQualification(qualification27);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0175");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, 0.0d);
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str10 = company9.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company9.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification13 = company9.createQualification("hi!");
        edu.colostate.cs415.model.Qualification qualification15 = company9.createQualification("hi!:0:0");
        edu.colostate.cs415.model.Worker worker16 = null;
        qualification15.addWorker(worker16);
        worker7.addQualification(qualification15);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0176");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Qualification qualification8 = company1.createQualification("hi!:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = qualification8.getWorkers();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification8.", company1.equals(qualification8) == qualification8.equals(company1));
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0177");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet10 = company9.getProjects();
        boolean boolean11 = worker7.equals((java.lang.Object) company9);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0178");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        boolean boolean15 = company11.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet16 = company11.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = company11.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet18 = company11.getUnavailableWorkers();
        boolean boolean19 = worker9.equals((java.lang.Object) workerSet18);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0179");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Qualification qualification10 = company1.createQualification("hi!:0:0");
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company12.getUnavailableWorkers();
        boolean boolean15 = company12.equals((java.lang.Object) "");
        edu.colostate.cs415.model.Qualification qualification17 = company12.createQualification("hi!");
        boolean boolean18 = qualification10.equals((java.lang.Object) qualification17);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification10.", company1.equals(qualification10) == qualification10.equals(company1));
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0180");
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
        edu.colostate.cs415.dto.WorkerDTO workerDTO17 = worker16.toDTO();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0181");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        boolean boolean10 = company6.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company6.getQualifications();
        edu.colostate.cs415.model.Worker worker13 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet11, (double) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification3.removeWorker(worker13);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0182");
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
        worker16.setSalary((double) 10L);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0183");
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
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet17 = worker16.getQualifications();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0184");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification4 = company1.createQualification("hi!:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnavailableWorkers();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification4.", company1.equals(qualification4) == qualification4.equals(company1));
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0185");
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
        edu.colostate.cs415.model.Company company18 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str19 = company18.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet20 = company18.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification22 = company18.createQualification("hi!");
        java.lang.Object obj23 = null;
        boolean boolean24 = company18.equals(obj23);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet25 = company18.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet26 = company18.getQualifications();
        boolean boolean27 = worker16.equals((java.lang.Object) company18);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0186");
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
        java.lang.String str17 = worker16.getName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0187");
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
        java.lang.String str17 = worker16.toString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0188");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAvailableWorkers();
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
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet18 = company7.getUnavailableWorkers();
        boolean boolean19 = company1.equals((java.lang.Object) company7);
        edu.colostate.cs415.model.Company company21 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification23 = company21.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet24 = company21.getUnassignedWorkers();
        java.lang.String str25 = company21.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet26 = company21.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet27 = company21.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet28 = company21.getEmployedWorkers();
        edu.colostate.cs415.model.Company company31 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification33 = company31.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet34 = company31.getQualifications();
        edu.colostate.cs415.model.Worker worker36 = company21.createWorker("hi!", qualificationSet34, (double) (short) 1);
        company7.unassignAll(worker36);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker36.", company1.equals(worker36) == worker36.equals(company1));
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0189");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        boolean boolean15 = company11.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet16 = company11.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = company11.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet18 = company11.getUnavailableWorkers();
        java.lang.String str19 = company11.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet20 = company11.getUnavailableWorkers();
        boolean boolean21 = worker9.equals((java.lang.Object) company11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0190");
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
        java.util.Set<edu.colostate.cs415.model.Project> projectSet27 = company20.getProjects();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification26.", company1.equals(qualification26) == qualification26.equals(company1));
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0191");
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
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet19 = company1.getAssignedWorkers();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0192");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO4 = qualification3.toDTO();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str9 = company8.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company8.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company8.getQualifications();
        edu.colostate.cs415.model.Worker worker13 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet11, (double) ' ');
        qualification3.addWorker(worker13);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker13.", company1.equals(worker13) == worker13.equals(company1));
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0193");
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
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification22 = company20.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = qualification22.getWorkers();
        edu.colostate.cs415.model.Company company25 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification27 = company25.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet28 = qualification27.getWorkers();
        boolean boolean29 = qualification22.equals((java.lang.Object) qualification27);
        boolean boolean30 = worker18.equals((java.lang.Object) qualification27);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0194");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        boolean boolean4 = company1.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getUnavailableWorkers();
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
        company1.unassignAll(worker27);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker27.", company1.equals(worker27) == worker27.equals(company1));
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0195");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Qualification qualification8 = company1.createQualification("hi!:0:0");
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str12 = company11.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company11.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company11.getQualifications();
        edu.colostate.cs415.model.Worker worker16 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet14, (double) ' ');
        company1.unassignAll(worker16);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0196");
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
        edu.colostate.cs415.model.Company company34 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification36 = company34.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet37 = company34.getUnassignedWorkers();
        java.lang.String str38 = company34.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet39 = company34.getProjects();
        java.lang.String str40 = company34.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet41 = company34.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet42 = company34.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet43 = company34.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet44 = company34.getQualifications();
        edu.colostate.cs415.model.Worker worker46 = company29.createWorker("hi!", qualificationSet44, 1.0d);
        company20.unassignAll(worker46);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker46.", company1.equals(worker46) == worker46.equals(company1));
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0197");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification14 = company12.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company12.getUnassignedWorkers();
        java.lang.String str16 = company12.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet17 = company12.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet18 = company12.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet19 = company12.getEmployedWorkers();
        edu.colostate.cs415.model.Company company22 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification24 = company22.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet25 = company22.getQualifications();
        edu.colostate.cs415.model.Worker worker27 = company12.createWorker("hi!", qualificationSet25, (double) (short) 1);
        company1.unassignAll(worker27);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker27.", company1.equals(worker27) == worker27.equals(company1));
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0198");
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
        edu.colostate.cs415.model.Company company32 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str33 = company32.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet34 = company32.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet35 = company32.getQualifications();
        edu.colostate.cs415.model.Worker worker37 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet35, (double) ' ');
        qualification17.addWorker(worker37);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker37.", company1.equals(worker37) == worker37.equals(company1));
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0199");
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
        edu.colostate.cs415.model.Company company18 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification20 = company18.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet21 = qualification20.getWorkers();
        edu.colostate.cs415.model.Company company23 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification25 = company23.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet26 = qualification25.getWorkers();
        boolean boolean27 = qualification20.equals((java.lang.Object) qualification25);
        java.lang.String str28 = qualification20.toString();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO29 = qualification20.toDTO();
        java.lang.String str30 = qualification20.toString();
        edu.colostate.cs415.model.Company company32 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification34 = company32.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet35 = qualification34.getWorkers();
        edu.colostate.cs415.model.Company company37 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification39 = company37.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet40 = qualification39.getWorkers();
        boolean boolean41 = qualification34.equals((java.lang.Object) qualification39);
        edu.colostate.cs415.model.Worker worker42 = null;
        qualification34.addWorker(worker42);
        java.lang.String str44 = qualification34.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet45 = qualification34.getWorkers();
        boolean boolean46 = qualification20.equals((java.lang.Object) qualification34);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet47 = qualification20.getWorkers();
        worker16.addQualification(qualification20);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0200");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0:0:0");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO10 = qualification9.toDTO();
        edu.colostate.cs415.model.Company company13 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str14 = company13.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company13.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet16 = company13.getQualifications();
        edu.colostate.cs415.model.Worker worker18 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet16, 0.0d);
        qualification9.addWorker(worker18);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0201");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Company company5 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification7 = company5.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company5.getUnassignedWorkers();
        java.lang.String str9 = company5.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet10 = company5.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company5.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company5.getEmployedWorkers();
        edu.colostate.cs415.model.Company company15 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification17 = company15.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet18 = company15.getQualifications();
        edu.colostate.cs415.model.Worker worker20 = company5.createWorker("hi!", qualificationSet18, (double) (short) 1);
        company1.unassignAll(worker20);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker20.", company1.equals(worker20) == worker20.equals(company1));
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0202");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification4 = company1.createQualification("hi!:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getEmployedWorkers();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification4.", company1.equals(qualification4) == qualification4.equals(company1));
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0203");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.lang.String str4 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Qualification qualification7 = company1.createQualification("hi!:0:0:0:0");
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification12 = company10.createQualification("hi!");
        boolean boolean14 = company10.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet15 = company10.getQualifications();
        edu.colostate.cs415.model.Worker worker17 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet15, (double) 10L);
        qualification7.addWorker(worker17);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification7.", company1.equals(qualification7) == qualification7.equals(company1));
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0204");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company11.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company11.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company11.getEmployedWorkers();
        boolean boolean15 = worker9.equals((java.lang.Object) workerSet14);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0205");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Qualification qualification6 = company1.createQualification("hi!:0:0");
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str10 = company9.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company9.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company9.getQualifications();
        edu.colostate.cs415.model.Worker worker14 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet12, 0.0d);
        company1.unassignAll(worker14);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker14.", company1.equals(worker14) == worker14.equals(company1));
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0206");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        java.lang.Class<?> wildcardClass10 = qualificationSet7.getClass();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0207");
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
        edu.colostate.cs415.model.Company company18 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str19 = company18.getName();
        edu.colostate.cs415.model.Qualification qualification21 = company18.createQualification("hi!");
        edu.colostate.cs415.model.Company company23 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str24 = company23.toString();
        boolean boolean25 = qualification21.equals((java.lang.Object) str24);
        worker16.addQualification(qualification21);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0208");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet8, (double) 0L);
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str13 = company12.toString();
        java.lang.String str14 = company12.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company12.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet16 = company12.getProjects();
        java.lang.String str17 = company12.getName();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet18 = company12.getProjects();
        boolean boolean19 = worker10.equals((java.lang.Object) projectSet18);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker10.", company2.equals(worker10) == worker10.equals(company2));
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0209");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, 0.0d);
        worker7.setSalary((double) 0.0f);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0210");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO4 = qualification3.toDTO();
        boolean boolean6 = qualification3.equals((java.lang.Object) 10.0d);
        java.lang.String str7 = qualification3.toString();
        java.lang.String str8 = qualification3.toString();
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str12 = company11.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet13 = company11.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company11.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet15 = company11.getQualifications();
        edu.colostate.cs415.model.Worker worker17 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet15, (double) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification3.removeWorker(worker17);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0211");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) '#');
        java.util.Set<edu.colostate.cs415.model.Project> projectSet9 = worker8.getProjects();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0212");
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
        java.lang.String str19 = worker18.getName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0213");
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
        qualification24.addWorker(worker41);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker41.", company1.equals(worker41) == worker41.equals(company1));
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0214");
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
        worker18.setSalary((double) (short) 10);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0215");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet3 = company1.getQualifications();
        java.lang.String str4 = company1.getName();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str8 = company7.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company7.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company7.getQualifications();
        edu.colostate.cs415.model.Worker worker12 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet10, 0.0d);
        company1.unassignAll(worker12);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker12.", company1.equals(worker12) == worker12.equals(company1));
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0216");
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
        java.lang.Object obj19 = null;
        boolean boolean20 = worker18.equals(obj19);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0217");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet8, (double) 0L);
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification14 = company12.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = qualification14.getWorkers();
        edu.colostate.cs415.model.Company company17 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification19 = company17.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet20 = qualification19.getWorkers();
        boolean boolean21 = qualification14.equals((java.lang.Object) qualification19);
        edu.colostate.cs415.model.Worker worker22 = null;
        qualification14.addWorker(worker22);
        worker10.addQualification(qualification14);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker10.", company2.equals(worker10) == worker10.equals(company2));
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0218");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str8 = company7.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet9 = company7.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company7.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company7.getQualifications();
        edu.colostate.cs415.model.Worker worker13 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet11, (double) '#');
        company1.unassignAll(worker13);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker13.", company1.equals(worker13) == worker13.equals(company1));
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0219");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        java.lang.String str4 = company1.getName();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification9 = company7.createQualification("hi!");
        boolean boolean11 = company7.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company7.getQualifications();
        edu.colostate.cs415.model.Worker worker14 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet12, (double) 10L);
        company1.unassignAll(worker14);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker14.", company1.equals(worker14) == worker14.equals(company1));
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0220");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet7 = company1.getProjects();
        java.lang.String str8 = company1.toString();
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
        company1.unassignAll(worker25);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker25.", company1.equals(worker25) == worker25.equals(company1));
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0221");
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
        edu.colostate.cs415.model.Worker worker21 = new edu.colostate.cs415.model.Worker("hi!:0:0:0:0", qualificationSet17, (double) 0L);
        org.junit.Assert.assertTrue("Contract failed: worker21.equals(worker21)", worker21.equals(worker21));
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0222");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) '#');
        edu.colostate.cs415.dto.WorkerDTO workerDTO9 = worker8.toDTO();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0223");
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
        edu.colostate.cs415.model.Company company17 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification19 = company17.createQualification("hi!");
        edu.colostate.cs415.model.Company company22 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification24 = company22.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet25 = company22.getUnassignedWorkers();
        java.lang.String str26 = company22.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet27 = company22.getProjects();
        java.lang.String str28 = company22.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet29 = company22.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet30 = company22.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet31 = company22.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet32 = company22.getQualifications();
        edu.colostate.cs415.model.Worker worker34 = company17.createWorker("hi!", qualificationSet32, 1.0d);
        qualification3.addWorker(worker34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker34.", company1.equals(worker34) == worker34.equals(company1));
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0224");
        edu.colostate.cs415.model.Company company3 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str4 = company3.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company3.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company3.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) ' ');
        edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!:0:0:0:0:0:0", qualificationSet6, (double) '#');
        org.junit.Assert.assertTrue("Contract failed: worker10.equals(worker10)", worker10.equals(worker10));
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0225");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
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
        worker9.addQualification(qualification18);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0226");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, 0.0d);
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = qualification11.getWorkers();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO13 = qualification11.toDTO();
        boolean boolean15 = qualification11.equals((java.lang.Object) (short) 1);
        java.lang.String str16 = qualification11.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = qualification11.getWorkers();
        worker7.addQualification(qualification11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0227");
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
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet21 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company23 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification25 = company23.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet26 = company23.getUnassignedWorkers();
        java.lang.String str27 = company23.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet28 = company23.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet29 = company23.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet30 = company23.getEmployedWorkers();
        edu.colostate.cs415.model.Company company33 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification35 = company33.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet36 = company33.getQualifications();
        edu.colostate.cs415.model.Worker worker38 = company23.createWorker("hi!", qualificationSet36, (double) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification3.removeWorker(worker38);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0228");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!:0:0");
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company7.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet9 = company7.getProjects();
        boolean boolean10 = company1.equals((java.lang.Object) projectSet9);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification5.", company1.equals(qualification5) == qualification5.equals(company1));
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0229");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company1.getQualifications();
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0");
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str13 = company12.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet14 = company12.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company12.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet16 = company12.getQualifications();
        edu.colostate.cs415.model.Worker worker18 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet16, (double) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification9.removeWorker(worker18);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0230");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification10 = company8.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company8.getUnassignedWorkers();
        java.lang.String str12 = company8.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet13 = company8.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company8.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company8.getEmployedWorkers();
        edu.colostate.cs415.model.Company company18 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification20 = company18.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet21 = company18.getQualifications();
        edu.colostate.cs415.model.Worker worker23 = company8.createWorker("hi!", qualificationSet21, (double) (short) 1);
        company1.unassignAll(worker23);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker23.", company1.equals(worker23) == worker23.equals(company1));
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0231");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet8, (double) 0L);
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company12.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company12.getUnavailableWorkers();
        edu.colostate.cs415.model.Qualification qualification16 = company12.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO17 = qualification16.toDTO();
        boolean boolean18 = worker10.equals((java.lang.Object) qualificationDTO17);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker10.", company2.equals(worker10) == worker10.equals(company2));
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0232");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet8, (double) 0L);
        int int11 = worker10.getWorkload();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker10.", company2.equals(worker10) == worker10.equals(company2));
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0233");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) '#');
        boolean boolean9 = worker8.isAvailable();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0234");
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
        worker18.setSalary((double) 100L);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0235");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str10 = company9.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet11 = company9.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet12 = company9.getProjects();
        java.lang.String str13 = company9.toString();
        boolean boolean14 = worker7.equals((java.lang.Object) company9);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0236");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) '#');
        worker8.setSalary((double) (short) 0);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0237");
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
        boolean boolean17 = worker16.isAvailable();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0238");
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
        edu.colostate.cs415.model.Company company21 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification23 = company21.createQualification("hi!");
        boolean boolean25 = company21.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet26 = company21.getQualifications();
        edu.colostate.cs415.model.Worker worker28 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet26, (double) 10L);
        qualification3.addWorker(worker28);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker28.", company1.equals(worker28) == worker28.equals(company1));
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0239");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Qualification qualification10 = company1.createQualification("hi!:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company1.getAssignedWorkers();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification10.", company1.equals(qualification10) == qualification10.equals(company1));
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0240");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Qualification qualification8 = company1.createQualification("hi!:0:0");
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str12 = company11.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet13 = company11.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company11.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet15 = company11.getQualifications();
        edu.colostate.cs415.model.Worker worker17 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet15, (double) '#');
        qualification8.addWorker(worker17);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification8.", company1.equals(qualification8) == qualification8.equals(company1));
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0241");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = qualification5.getWorkers();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification5.", company1.equals(qualification5) == qualification5.equals(company1));
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0242");
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
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str21 = company20.toString();
        edu.colostate.cs415.model.Qualification qualification23 = company20.createQualification("hi!:0:0:0:0");
        worker18.addQualification(qualification23);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0243");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.lang.String str4 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification6 = company1.createQualification("hi!:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getAvailableWorkers();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification6.", company1.equals(qualification6) == qualification6.equals(company1));
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0244");
        edu.colostate.cs415.model.Company company3 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str4 = company3.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet5 = company3.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company3.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company3.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) '#');
        edu.colostate.cs415.model.Worker worker11 = new edu.colostate.cs415.model.Worker("hi!:0:0:0:0:0:0", qualificationSet7, (double) 10);
        org.junit.Assert.assertTrue("Contract failed: worker11.equals(worker11)", worker11.equals(worker11));
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0245");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet8, (double) 0L);
        boolean boolean11 = worker10.isAvailable();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker10.", company2.equals(worker10) == worker10.equals(company2));
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0246");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet8, (double) 0L);
        java.lang.String str11 = worker10.getName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker10.", company2.equals(worker10) == worker10.equals(company2));
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0247");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, 0.0d);
        worker7.setSalary((double) ' ');
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0248");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO4 = qualification3.toDTO();
        boolean boolean6 = qualification3.equals((java.lang.Object) 10.0d);
        java.lang.String str7 = qualification3.toString();
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str11 = company10.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company10.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company10.getQualifications();
        edu.colostate.cs415.model.Worker worker15 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet13, 0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification3.removeWorker(worker15);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0249");
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
        edu.colostate.cs415.model.Company company33 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification35 = company33.createQualification("hi!");
        boolean boolean37 = company33.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet38 = company33.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet39 = company33.getQualifications();
        edu.colostate.cs415.model.Worker worker41 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet39, (double) 0L);
        qualification3.addWorker(worker41);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker41.", company1.equals(worker41) == worker41.equals(company1));
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0250");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getUnavailableWorkers();
        edu.colostate.cs415.model.Qualification qualification6 = company2.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!:0:0:0:0:0:0", qualificationSet7, 0.0d);
        org.junit.Assert.assertTrue("Contract failed: worker9.equals(worker9)", worker9.equals(worker9));
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0251");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        java.lang.Object obj6 = null;
        boolean boolean7 = company1.equals(obj6);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet9 = company1.getQualifications();
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification14 = company12.createQualification("hi!");
        boolean boolean16 = company12.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet17 = company12.getQualifications();
        edu.colostate.cs415.model.Worker worker19 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet17, (double) 10L);
        company1.unassignAll(worker19);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker19.", company1.equals(worker19) == worker19.equals(company1));
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0252");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.lang.String str4 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification6 = company1.createQualification("hi!:0:0");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO7 = qualification6.toDTO();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification6.", company1.equals(qualification6) == qualification6.equals(company1));
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0253");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet8, (double) 0L);
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification14 = company12.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = qualification14.getWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = qualification14.getWorkers();
        worker10.addQualification(qualification14);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker10.", company2.equals(worker10) == worker10.equals(company2));
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0254");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        boolean boolean4 = company1.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        boolean boolean13 = company9.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company9.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet15 = company9.getQualifications();
        edu.colostate.cs415.model.Worker worker17 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet15, (double) 0L);
        company1.unassignAll(worker17);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker17.", company1.equals(worker17) == worker17.equals(company1));
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0255");
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
        worker18.setSalary((double) '4');
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0256");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet8, (double) 0L);
        edu.colostate.cs415.dto.WorkerDTO workerDTO11 = worker10.toDTO();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker10.", company2.equals(worker10) == worker10.equals(company2));
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0257");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet8, (double) 0L);
        worker10.setSalary((double) 1);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker10.", company2.equals(worker10) == worker10.equals(company2));
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0258");
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
        edu.colostate.cs415.model.Qualification qualification16 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Company company19 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str20 = company19.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet21 = company19.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet22 = company19.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet23 = company19.getQualifications();
        edu.colostate.cs415.model.Worker worker25 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet23, (double) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification16.removeWorker(worker25);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0259");
        edu.colostate.cs415.model.Qualification qualification1 = new edu.colostate.cs415.model.Qualification("hi!:0:0");
        java.lang.String str2 = qualification1.toString();
        edu.colostate.cs415.model.Company company4 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification6 = company4.createQualification("hi!");
        boolean boolean8 = company4.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet9 = company4.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company4.getQualifications();
        java.lang.String str11 = company4.getName();
        edu.colostate.cs415.model.Qualification qualification13 = company4.createQualification("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company4.getAvailableWorkers();
        boolean boolean15 = qualification1.equals((java.lang.Object) workerSet14);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on qualification1 and company4.", qualification1.equals(company4) == company4.equals(qualification1));
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0260");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = qualification8.getWorkers();
        boolean boolean10 = qualification3.equals((java.lang.Object) qualification8);
        java.lang.String str11 = qualification3.toString();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO12 = qualification3.toDTO();
        edu.colostate.cs415.model.Worker worker13 = null;
        qualification3.addWorker(worker13);
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
        qualification3.removeWorker(worker31);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker31.", company1.equals(worker31) == worker31.equals(company1));
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0261");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, 0.0d);
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
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet27 = qualification16.getWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet28 = qualification16.getWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet29 = qualification16.getWorkers();
        boolean boolean30 = worker7.equals((java.lang.Object) workerSet29);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0262");
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
        edu.colostate.cs415.model.Company company22 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str23 = company22.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet24 = company22.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet25 = company22.getQualifications();
        edu.colostate.cs415.model.Worker worker27 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet25, 0.0d);
        qualification8.removeWorker(worker27);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker27.", company1.equals(worker27) == worker27.equals(company1));
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0263");
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
        java.util.Set<edu.colostate.cs415.model.Project> projectSet17 = worker16.getProjects();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0264");
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
        worker18.setSalary((double) (byte) 1);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0265");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        boolean boolean4 = company1.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAvailableWorkers();
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
        company1.unassignAll(worker25);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker25.", company1.equals(worker25) == worker25.equals(company1));
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0266");
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
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet20 = qualification3.getWorkers();
        java.lang.String str21 = qualification3.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet22 = qualification3.getWorkers();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO23 = qualification3.toDTO();
        edu.colostate.cs415.model.Company company25 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification27 = company25.createQualification("hi!");
        edu.colostate.cs415.model.Company company30 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification32 = company30.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet33 = company30.getUnassignedWorkers();
        java.lang.String str34 = company30.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet35 = company30.getProjects();
        java.lang.String str36 = company30.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet37 = company30.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet38 = company30.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet39 = company30.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet40 = company30.getQualifications();
        edu.colostate.cs415.model.Worker worker42 = company25.createWorker("hi!", qualificationSet40, 1.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification3.removeWorker(worker42);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0267");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        boolean boolean15 = company11.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet16 = company11.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = company11.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet18 = company11.getAssignedWorkers();
        boolean boolean19 = worker9.equals((java.lang.Object) company11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0268");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company1.getQualifications();
        java.lang.String str8 = company1.getName();
        edu.colostate.cs415.model.Qualification qualification10 = company1.createQualification("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company1.getQualifications();
        edu.colostate.cs415.model.Company company14 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification16 = company14.createQualification("hi!");
        boolean boolean18 = company14.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet19 = company14.getQualifications();
        edu.colostate.cs415.model.Worker worker21 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet19, (double) 10L);
        company1.unassignAll(worker21);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker21.", company1.equals(worker21) == worker21.equals(company1));
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0269");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) '#');
        java.lang.String str9 = worker8.getName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0270");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str12 = company11.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet13 = company11.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company11.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet15 = company11.getQualifications();
        edu.colostate.cs415.model.Worker worker17 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet15, (double) '#');
        company1.unassignAll(worker17);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker17.", company1.equals(worker17) == worker17.equals(company1));
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0271");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.Object obj7 = null;
        boolean boolean8 = company1.equals(obj7);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Company company13 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification15 = company13.createQualification("hi!");
        boolean boolean17 = company13.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet18 = company13.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet19 = company13.getQualifications();
        edu.colostate.cs415.model.Worker worker21 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet19, (double) 0L);
        company1.unassignAll(worker21);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker21.", company1.equals(worker21) == worker21.equals(company1));
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0272");
        edu.colostate.cs415.model.Company company3 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification5 = company3.createQualification("hi!");
        boolean boolean7 = company3.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company3.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet9 = company3.getQualifications();
        edu.colostate.cs415.model.Worker worker11 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet9, (double) 0L);
        edu.colostate.cs415.model.Worker worker13 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet9, 1.0d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company3 and worker11.", company3.equals(worker11) == worker11.equals(company3));
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0273");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) '#');
        java.lang.String str9 = worker8.toString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0274");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Worker worker4 = null;
        qualification3.addWorker(worker4);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = qualification3.getWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str11 = company10.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet12 = company10.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company10.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company10.getQualifications();
        edu.colostate.cs415.model.Worker worker16 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet14, (double) '#');
        qualification3.removeWorker(worker16);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0275");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company7.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet9 = company7.getProjects();
        java.lang.String str10 = company7.toString();
        edu.colostate.cs415.model.Qualification qualification12 = company7.createQualification("hi!:0:0");
        boolean boolean13 = company1.equals((java.lang.Object) qualification12);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification12.", company1.equals(qualification12) == qualification12.equals(company1));
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0276");
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
        edu.colostate.cs415.model.Company company18 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification20 = company18.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet21 = qualification20.getWorkers();
        edu.colostate.cs415.model.Company company23 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification25 = company23.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet26 = qualification25.getWorkers();
        boolean boolean27 = qualification20.equals((java.lang.Object) qualification25);
        java.lang.String str28 = qualification25.toString();
        edu.colostate.cs415.model.Company company30 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification32 = company30.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet33 = qualification32.getWorkers();
        edu.colostate.cs415.model.Company company35 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification37 = company35.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet38 = qualification37.getWorkers();
        boolean boolean39 = qualification32.equals((java.lang.Object) qualification37);
        edu.colostate.cs415.model.Worker worker40 = null;
        qualification32.addWorker(worker40);
        java.lang.String str42 = qualification32.toString();
        boolean boolean43 = qualification25.equals((java.lang.Object) str42);
        java.lang.String str44 = qualification25.toString();
        edu.colostate.cs415.model.Company company46 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification48 = company46.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet49 = company46.getUnassignedWorkers();
        java.lang.String str50 = company46.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet51 = company46.getProjects();
        java.lang.String str52 = company46.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet53 = company46.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet54 = company46.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company56 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification58 = company56.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet59 = qualification58.getWorkers();
        edu.colostate.cs415.model.Company company61 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification63 = company61.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet64 = qualification63.getWorkers();
        boolean boolean65 = qualification58.equals((java.lang.Object) qualification63);
        edu.colostate.cs415.model.Worker worker66 = null;
        qualification63.addWorker(worker66);
        edu.colostate.cs415.model.Company company69 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification71 = company69.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet72 = qualification71.getWorkers();
        boolean boolean73 = qualification63.equals((java.lang.Object) workerSet72);
        edu.colostate.cs415.model.Company company75 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet76 = company75.getEmployedWorkers();
        boolean boolean77 = qualification63.equals((java.lang.Object) company75);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet78 = company75.getQualifications();
        boolean boolean79 = company46.equals((java.lang.Object) company75);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet80 = company75.getUnassignedWorkers();
        boolean boolean81 = qualification25.equals((java.lang.Object) workerSet80);
        worker16.addQualification(qualification25);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0277");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO4 = qualification3.toDTO();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification10 = company8.createQualification("hi!");
        boolean boolean12 = company8.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company8.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company8.getQualifications();
        edu.colostate.cs415.model.Worker worker16 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet14, (double) 0L);
        qualification3.addWorker(worker16);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0278");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, 0.0d);
        worker7.setSalary((double) 1.0f);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0279");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO4 = qualification3.toDTO();
        boolean boolean6 = qualification3.equals((java.lang.Object) 10.0d);
        edu.colostate.cs415.model.Worker worker7 = null;
        qualification3.addWorker(worker7);
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
        qualification3.addWorker(worker25);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker25.", company1.equals(worker25) == worker25.equals(company1));
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0280");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) '#');
        int int9 = worker8.getWorkload();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0281");
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
        edu.colostate.cs415.model.Company company18 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet19 = company18.getUnavailableWorkers();
        boolean boolean21 = company18.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet22 = company18.getAvailableWorkers();
        java.lang.String str23 = company18.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet24 = company18.getAvailableWorkers();
        boolean boolean25 = worker16.equals((java.lang.Object) workerSet24);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0282");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = qualification3.getWorkers();
        java.lang.String str5 = qualification3.toString();
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification3.removeWorker(worker24);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0283");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, 0.0d);
        java.lang.Class<?> wildcardClass8 = qualificationSet5.getClass();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0284");
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
        edu.colostate.cs415.model.Company company26 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification28 = company26.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet29 = company26.getUnassignedWorkers();
        java.lang.String str30 = company26.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet31 = company26.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet32 = company26.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet33 = company26.getEmployedWorkers();
        edu.colostate.cs415.model.Company company36 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification38 = company36.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet39 = company36.getQualifications();
        edu.colostate.cs415.model.Worker worker41 = company26.createWorker("hi!", qualificationSet39, (double) (short) 1);
        qualification3.addWorker(worker41);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker41.", company1.equals(worker41) == worker41.equals(company1));
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0285");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) '#');
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification12 = company10.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = qualification12.getWorkers();
        edu.colostate.cs415.model.Company company15 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification17 = company15.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet18 = qualification17.getWorkers();
        boolean boolean19 = qualification12.equals((java.lang.Object) qualification17);
        edu.colostate.cs415.model.Worker worker20 = null;
        qualification12.addWorker(worker20);
        java.lang.String str22 = qualification12.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = qualification12.getWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet24 = qualification12.getWorkers();
        worker8.addQualification(qualification12);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0286");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = qualification11.getWorkers();
        edu.colostate.cs415.model.Company company14 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification16 = company14.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = qualification16.getWorkers();
        boolean boolean18 = qualification11.equals((java.lang.Object) qualification16);
        edu.colostate.cs415.model.Worker worker19 = null;
        qualification11.addWorker(worker19);
        java.lang.String str21 = qualification11.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet22 = qualification11.getWorkers();
        java.lang.String str23 = qualification11.toString();
        worker7.addQualification(qualification11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0287");
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
        double double17 = worker16.getSalary();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0288");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company1.getQualifications();
        java.lang.String str8 = company1.getName();
        edu.colostate.cs415.model.Qualification qualification10 = company1.createQualification("hi!:0:0:0:0");
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification14 = company12.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company12.getUnassignedWorkers();
        java.lang.String str16 = company12.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet17 = company12.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet18 = company12.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet19 = company12.getEmployedWorkers();
        edu.colostate.cs415.model.Company company22 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification24 = company22.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet25 = company22.getQualifications();
        edu.colostate.cs415.model.Worker worker27 = company12.createWorker("hi!", qualificationSet25, (double) (short) 1);
        company1.unassignAll(worker27);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker27.", company1.equals(worker27) == worker27.equals(company1));
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0289");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        worker9.setSalary((double) (byte) 0);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0290");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, 0.0d);
        worker7.setSalary((double) 10);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0291");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company2.getQualifications();
        java.lang.String str9 = company2.getName();
        edu.colostate.cs415.model.Qualification qualification11 = company2.createQualification("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker14 = new edu.colostate.cs415.model.Worker("hi!:0:0:0:0:0:0", qualificationSet12, (double) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: worker14.equals(worker14)", worker14.equals(worker14));
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0292");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company1.getQualifications();
        java.lang.String str8 = company1.getName();
        edu.colostate.cs415.model.Qualification qualification10 = company1.createQualification("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Company company14 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str15 = company14.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company14.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet17 = company14.getQualifications();
        edu.colostate.cs415.model.Worker worker19 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet17, (double) ' ');
        company1.unassignAll(worker19);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker19.", company1.equals(worker19) == worker19.equals(company1));
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0293");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str10 = company9.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet11 = company9.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company9.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company9.getQualifications();
        edu.colostate.cs415.model.Worker worker15 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet13, (double) '#');
        company1.unassignAll(worker15);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker15.", company1.equals(worker15) == worker15.equals(company1));
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0294");
        edu.colostate.cs415.model.Qualification qualification1 = new edu.colostate.cs415.model.Qualification("hi!");
        edu.colostate.cs415.model.Company company4 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification6 = company4.createQualification("hi!");
        boolean boolean8 = company4.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet9 = company4.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company4.getQualifications();
        edu.colostate.cs415.model.Worker worker12 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet10, (double) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification1.removeWorker(worker12);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0295");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, 0.0d);
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company9.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet11 = company9.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet12 = company9.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company9.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company9.getAvailableWorkers();
        boolean boolean15 = worker7.equals((java.lang.Object) workerSet14);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0296");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.getName();
        java.lang.String str3 = company1.getName();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str7 = company6.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company6.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet9 = company6.getQualifications();
        edu.colostate.cs415.model.Worker worker11 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet9, 0.0d);
        company1.unassignAll(worker11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker11.", company1.equals(worker11) == worker11.equals(company1));
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0297");
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
        edu.colostate.cs415.model.Company company33 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str34 = company33.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet35 = company33.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet36 = company33.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet37 = company33.getQualifications();
        edu.colostate.cs415.model.Worker worker39 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet37, (double) '#');
        qualification3.addWorker(worker39);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker39.", company1.equals(worker39) == worker39.equals(company1));
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0298");
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
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet20 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company23 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification25 = company23.createQualification("hi!");
        boolean boolean27 = company23.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet28 = company23.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet29 = company23.getQualifications();
        edu.colostate.cs415.model.Worker worker31 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet29, (double) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification3.removeWorker(worker31);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0299");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str9 = company8.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company8.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company8.getQualifications();
        edu.colostate.cs415.model.Worker worker13 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet11, (double) ' ');
        company1.unassignAll(worker13);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker13.", company1.equals(worker13) == worker13.equals(company1));
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0300");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet8, (double) 0L);
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company12.getUnavailableWorkers();
        boolean boolean15 = company12.equals((java.lang.Object) "");
        java.lang.String str16 = company12.getName();
        edu.colostate.cs415.model.Qualification qualification18 = company12.createQualification("hi!:0:0");
        boolean boolean19 = worker10.equals((java.lang.Object) qualification18);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker10.", company2.equals(worker10) == worker10.equals(company2));
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0301");
        edu.colostate.cs415.model.Qualification qualification1 = new edu.colostate.cs415.model.Qualification("hi!:0:0");
        edu.colostate.cs415.model.Company company3 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification5 = company3.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company3.getUnassignedWorkers();
        java.lang.String str7 = company3.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet8 = company3.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company3.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company3.getEmployedWorkers();
        edu.colostate.cs415.model.Company company13 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification15 = company13.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet16 = company13.getQualifications();
        edu.colostate.cs415.model.Worker worker18 = company3.createWorker("hi!", qualificationSet16, (double) (short) 1);
        qualification1.addWorker(worker18);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on qualification1 and worker18.", qualification1.equals(worker18) == worker18.equals(qualification1));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0302");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Qualification qualification10 = company1.createQualification("hi!:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company1.getEmployedWorkers();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification10.", company1.equals(qualification10) == qualification10.equals(company1));
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0303");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) '#');
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str11 = company10.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet12 = company10.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet13 = company10.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet14 = company10.getProjects();
        boolean boolean15 = worker8.equals((java.lang.Object) projectSet14);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0304");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet8, (double) 0L);
        double double11 = worker10.getSalary();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker10.", company2.equals(worker10) == worker10.equals(company2));
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0305");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet8, (double) 0L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = worker10.getQualifications();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker10.", company2.equals(worker10) == worker10.equals(company2));
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0306");
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
        edu.colostate.cs415.model.Qualification qualification24 = company22.createQualification("hi!");
        boolean boolean26 = company22.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet27 = company22.getQualifications();
        edu.colostate.cs415.model.Worker worker29 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet27, (double) 10L);
        qualification16.addWorker(worker29);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker29.", company1.equals(worker29) == worker29.equals(company1));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0307");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
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
        boolean boolean33 = worker9.equals((java.lang.Object) company30);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0308");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) '#');
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company10.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company10.getUnavailableWorkers();
        edu.colostate.cs415.model.Qualification qualification14 = company10.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO15 = qualification14.toDTO();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = qualification14.getWorkers();
        worker8.addQualification(qualification14);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0309");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet8, (double) 0L);
        worker10.setSalary(0.0d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker10.", company2.equals(worker10) == worker10.equals(company2));
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0310");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, 0.0d);
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO12 = qualification11.toDTO();
        boolean boolean14 = qualification11.equals((java.lang.Object) 10.0d);
        edu.colostate.cs415.model.Company company16 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification18 = company16.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet19 = qualification18.getWorkers();
        edu.colostate.cs415.model.Company company21 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification23 = company21.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet24 = qualification23.getWorkers();
        boolean boolean25 = qualification18.equals((java.lang.Object) qualification23);
        boolean boolean26 = qualification11.equals((java.lang.Object) boolean25);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet27 = qualification11.getWorkers();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO28 = qualification11.toDTO();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet29 = qualification11.getWorkers();
        edu.colostate.cs415.model.Company company31 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification33 = company31.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO34 = qualification33.toDTO();
        boolean boolean36 = qualification33.equals((java.lang.Object) 10.0d);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet37 = qualification33.getWorkers();
        boolean boolean38 = qualification11.equals((java.lang.Object) workerSet37);
        boolean boolean39 = worker7.equals((java.lang.Object) boolean38);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0311");
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
        edu.colostate.cs415.model.Worker worker15 = null;
        qualification3.addWorker(worker15);
        edu.colostate.cs415.model.Company company19 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str20 = company19.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet21 = company19.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet22 = company19.getQualifications();
        edu.colostate.cs415.model.Worker worker24 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet22, 0.0d);
        qualification3.removeWorker(worker24);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker24.", company1.equals(worker24) == worker24.equals(company1));
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0312");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet8, (double) 0L);
        java.lang.String str11 = worker10.toString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker10.", company2.equals(worker10) == worker10.equals(company2));
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0313");
        edu.colostate.cs415.model.Qualification qualification1 = new edu.colostate.cs415.model.Qualification("hi!:0:0");
        edu.colostate.cs415.model.Company company3 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str4 = company3.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company3.getAssignedWorkers();
        java.lang.String str6 = company3.getName();
        boolean boolean7 = qualification1.equals((java.lang.Object) str6);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = qualification1.getWorkers();
        java.lang.String str9 = qualification1.toString();
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        edu.colostate.cs415.model.Company company16 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification18 = company16.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet19 = company16.getUnassignedWorkers();
        java.lang.String str20 = company16.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet21 = company16.getProjects();
        java.lang.String str22 = company16.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = company16.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet24 = company16.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet25 = company16.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet26 = company16.getQualifications();
        edu.colostate.cs415.model.Worker worker28 = company11.createWorker("hi!", qualificationSet26, 1.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification1.removeWorker(worker28);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0314");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0:0:0");
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str13 = company12.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet14 = company12.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company12.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet16 = company12.getQualifications();
        edu.colostate.cs415.model.Worker worker18 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet16, (double) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification9.removeWorker(worker18);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0315");
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
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str21 = company20.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet22 = company20.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = company20.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet24 = company20.getAvailableWorkers();
        boolean boolean25 = worker18.equals((java.lang.Object) company20);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0316");
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
        worker18.setSalary((double) 1L);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0317");
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
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str21 = company20.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet22 = company20.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet23 = company20.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet24 = company20.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet25 = company20.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet26 = company20.getEmployedWorkers();
        edu.colostate.cs415.model.Company company28 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str29 = company28.toString();
        java.lang.String str30 = company28.toString();
        edu.colostate.cs415.model.Qualification qualification32 = company28.createQualification("hi!");
        boolean boolean33 = company20.equals((java.lang.Object) "hi!");
        edu.colostate.cs415.model.Qualification qualification35 = company20.createQualification("hi!");
        boolean boolean36 = worker18.equals((java.lang.Object) qualification35);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0318");
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
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification22 = company20.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = qualification22.getWorkers();
        edu.colostate.cs415.model.Company company25 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification27 = company25.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet28 = qualification27.getWorkers();
        boolean boolean29 = qualification22.equals((java.lang.Object) qualification27);
        edu.colostate.cs415.model.Worker worker30 = null;
        qualification27.addWorker(worker30);
        edu.colostate.cs415.model.Company company33 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification35 = company33.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet36 = qualification35.getWorkers();
        boolean boolean37 = qualification27.equals((java.lang.Object) workerSet36);
        edu.colostate.cs415.model.Company company39 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet40 = company39.getEmployedWorkers();
        boolean boolean41 = qualification27.equals((java.lang.Object) company39);
        edu.colostate.cs415.model.Qualification qualification43 = company39.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO44 = qualification43.toDTO();
        java.lang.String str45 = qualification43.toString();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO46 = qualification43.toDTO();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet47 = qualification43.getWorkers();
        edu.colostate.cs415.model.Company company49 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet50 = company49.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet51 = company49.getProjects();
        edu.colostate.cs415.model.Qualification qualification53 = company49.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet54 = qualification53.getWorkers();
        boolean boolean55 = qualification43.equals((java.lang.Object) qualification53);
        worker18.addQualification(qualification43);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0319");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) '#');
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company10.getUnavailableWorkers();
        boolean boolean12 = worker8.equals((java.lang.Object) company10);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0320");
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
        edu.colostate.cs415.model.Qualification qualification41 = company37.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO42 = qualification41.toDTO();
        java.lang.String str43 = qualification41.toString();
        worker16.addQualification(qualification41);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0321");
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
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet39 = company33.getQualifications();
        edu.colostate.cs415.model.Worker worker41 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet39, (double) 0L);
        qualification24.addWorker(worker41);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker41.", company1.equals(worker41) == worker41.equals(company1));
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0322");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getAssignedWorkers();
        boolean boolean5 = company2.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) 12);
        boolean boolean9 = worker8.isAvailable();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0323");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str10 = company9.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company9.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company9.getQualifications();
        edu.colostate.cs415.model.Worker worker14 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet12, 0.0d);
        company1.unassignAll(worker14);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker14.", company1.equals(worker14) == worker14.equals(company1));
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0324");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getAssignedWorkers();
        boolean boolean5 = company2.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) 12);
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company10.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company10.getAvailableWorkers();
        boolean boolean13 = worker8.equals((java.lang.Object) workerSet12);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0325");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Worker worker4 = null;
        qualification3.addWorker(worker4);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        boolean boolean13 = company9.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company9.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet15 = company9.getQualifications();
        edu.colostate.cs415.model.Worker worker17 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet15, (double) 0L);
        qualification3.removeWorker(worker17);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker17.", company1.equals(worker17) == worker17.equals(company1));
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0326");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification9 = company7.createQualification("hi!");
        boolean boolean11 = company7.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company7.getQualifications();
        edu.colostate.cs415.model.Worker worker14 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet12, (double) 10L);
        company1.unassignAll(worker14);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker14.", company1.equals(worker14) == worker14.equals(company1));
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0327");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        java.lang.String str4 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAssignedWorkers();
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getAvailableWorkers();
        java.lang.String str8 = company1.toString();
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str12 = company11.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company11.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company11.getQualifications();
        edu.colostate.cs415.model.Worker worker16 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet14, (double) ' ');
        company1.unassignAll(worker16);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0328");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company11.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company11.getUnavailableWorkers();
        edu.colostate.cs415.model.Qualification qualification15 = company11.createQualification("hi!");
        worker9.addQualification(qualification15);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0329");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getAssignedWorkers();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification5.", company1.equals(qualification5) == qualification5.equals(company1));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0330");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getAssignedWorkers();
        boolean boolean5 = company2.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) 12);
        java.lang.String str9 = worker8.getName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0331");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.lang.String str4 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Qualification qualification7 = company1.createQualification("hi!:0:0:0:0");
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
        edu.colostate.cs415.model.Qualification qualification30 = company28.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet31 = qualification30.getWorkers();
        edu.colostate.cs415.model.Company company33 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification35 = company33.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet36 = qualification35.getWorkers();
        boolean boolean37 = qualification30.equals((java.lang.Object) qualification35);
        boolean boolean38 = qualification16.equals((java.lang.Object) qualification35);
        boolean boolean39 = qualification7.equals((java.lang.Object) boolean38);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification7.", company1.equals(qualification7) == qualification7.equals(company1));
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0332");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = qualification3.getWorkers();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO5 = qualification3.toDTO();
        boolean boolean7 = qualification3.equals((java.lang.Object) (short) 10);
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification12 = company10.createQualification("hi!");
        boolean boolean14 = company10.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet15 = company10.getQualifications();
        edu.colostate.cs415.model.Worker worker17 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet15, (double) 10L);
        qualification3.addWorker(worker17);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker17.", company1.equals(worker17) == worker17.equals(company1));
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0333");
        edu.colostate.cs415.model.Qualification qualification1 = new edu.colostate.cs415.model.Qualification("hi!:0:0");
        edu.colostate.cs415.model.Company company3 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str4 = company3.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company3.getAssignedWorkers();
        java.lang.String str6 = company3.getName();
        boolean boolean7 = qualification1.equals((java.lang.Object) str6);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = qualification1.getWorkers();
        java.lang.String str9 = qualification1.toString();
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str13 = company12.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet14 = company12.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company12.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet16 = company12.getQualifications();
        edu.colostate.cs415.model.Worker worker18 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet16, (double) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification1.removeWorker(worker18);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0334");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        worker9.setSalary((double) 1);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0335");
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
        edu.colostate.cs415.model.Company company30 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet31 = company30.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet32 = company30.getProjects();
        edu.colostate.cs415.model.Qualification qualification34 = company30.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet35 = qualification34.getWorkers();
        boolean boolean36 = qualification24.equals((java.lang.Object) qualification34);
        edu.colostate.cs415.model.Company company38 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification40 = company38.createQualification("hi!");
        edu.colostate.cs415.model.Company company43 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification45 = company43.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet46 = company43.getUnassignedWorkers();
        java.lang.String str47 = company43.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet48 = company43.getProjects();
        java.lang.String str49 = company43.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet50 = company43.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet51 = company43.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet52 = company43.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet53 = company43.getQualifications();
        edu.colostate.cs415.model.Worker worker55 = company38.createWorker("hi!", qualificationSet53, 1.0d);
        qualification24.addWorker(worker55);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker55.", company1.equals(worker55) == worker55.equals(company1));
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0336");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getAssignedWorkers();
        boolean boolean5 = company2.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) 12);
        worker8.setSalary((double) 100);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0337");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Qualification qualification7 = company1.createQualification("hi!:0:0");
        edu.colostate.cs415.model.Worker worker8 = null;
        qualification7.addWorker(worker8);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = qualification7.getWorkers();
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
        qualification7.addWorker(worker29);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker29.", company1.equals(worker29) == worker29.equals(company1));
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0338");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.lang.String str6 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company2.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company2.getEmployedWorkers();
        edu.colostate.cs415.model.Qualification qualification10 = company2.createQualification("hi!:0:0:0:0:0:0");
        java.lang.String str11 = company2.getName();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker14 = new edu.colostate.cs415.model.Worker("hi!:0:0", qualificationSet12, (double) 0.0f);
        org.junit.Assert.assertTrue("Contract failed: worker14.equals(worker14)", worker14.equals(worker14));
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0339");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getAssignedWorkers();
        boolean boolean5 = company2.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) 12);
        double double9 = worker8.getSalary();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0340");
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
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification22 = company20.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = qualification22.getWorkers();
        edu.colostate.cs415.model.Company company25 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification27 = company25.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet28 = qualification27.getWorkers();
        boolean boolean29 = qualification22.equals((java.lang.Object) qualification27);
        java.lang.String str30 = qualification22.toString();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO31 = qualification22.toDTO();
        worker18.addQualification(qualification22);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0341");
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
        edu.colostate.cs415.model.Company company18 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str19 = company18.toString();
        edu.colostate.cs415.model.Qualification qualification21 = company18.createQualification("hi!:0:0");
        worker16.addQualification(qualification21);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0342");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        java.lang.String str4 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Qualification qualification8 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        boolean boolean15 = company11.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet16 = company11.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet17 = company11.getQualifications();
        edu.colostate.cs415.model.Worker worker19 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet17, (double) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification8.removeWorker(worker19);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0343");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!:0:0", qualificationSet6, 10.0d);
        org.junit.Assert.assertTrue("Contract failed: worker8.equals(worker8)", worker8.equals(worker8));
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0344");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, 0.0d);
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
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO33 = qualification32.toDTO();
        java.lang.String str34 = qualification32.toString();
        worker7.addQualification(qualification32);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0345");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Worker worker4 = null;
        qualification3.addWorker(worker4);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str10 = company9.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company9.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company9.getQualifications();
        edu.colostate.cs415.model.Worker worker14 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet12, 0.0d);
        qualification3.removeWorker(worker14);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker14.", company1.equals(worker14) == worker14.equals(company1));
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0346");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Company company5 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str6 = company5.toString();
        edu.colostate.cs415.model.Qualification qualification8 = company5.createQualification("hi!:0:0");
        boolean boolean9 = company1.equals((java.lang.Object) company5);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification8.", company1.equals(qualification8) == qualification8.equals(company1));
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0347");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO4 = qualification3.toDTO();
        boolean boolean6 = qualification3.equals((java.lang.Object) 10.0d);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification12 = company10.createQualification("hi!");
        boolean boolean14 = company10.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet15 = company10.getQualifications();
        edu.colostate.cs415.model.Worker worker17 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet15, (double) 10L);
        qualification3.addWorker(worker17);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker17.", company1.equals(worker17) == worker17.equals(company1));
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0348");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Qualification qualification6 = company1.createQualification("hi!:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = qualification6.getWorkers();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification6.", company1.equals(qualification6) == qualification6.equals(company1));
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0349");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) '#');
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification12 = company10.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = qualification12.getWorkers();
        edu.colostate.cs415.model.Company company15 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification17 = company15.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet18 = qualification17.getWorkers();
        boolean boolean19 = qualification12.equals((java.lang.Object) qualification17);
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO20 = qualification12.toDTO();
        java.lang.String str21 = qualification12.toString();
        java.lang.String str22 = qualification12.toString();
        worker8.addQualification(qualification12);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0350");
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
        edu.colostate.cs415.model.Company company29 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str30 = company29.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet31 = company29.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet32 = company29.getQualifications();
        edu.colostate.cs415.model.Worker worker34 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet32, (double) ' ');
        qualification8.addWorker(worker34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker34.", company1.equals(worker34) == worker34.equals(company1));
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0351");
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
        worker18.setSalary((double) 100.0f);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0352");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet10 = company9.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company9.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet12 = company9.getProjects();
        edu.colostate.cs415.model.Qualification qualification14 = company9.createQualification("hi!:0:0");
        worker7.addQualification(qualification14);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0353");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) '#');
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str11 = company10.getName();
        edu.colostate.cs415.model.Qualification qualification13 = company10.createQualification("hi!");
        edu.colostate.cs415.model.Company company15 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str16 = company15.toString();
        boolean boolean17 = qualification13.equals((java.lang.Object) str16);
        boolean boolean18 = worker8.equals((java.lang.Object) boolean17);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0354");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!:0:0:0:0", qualificationSet5, (double) '#');
        org.junit.Assert.assertTrue("Contract failed: worker7.equals(worker7)", worker7.equals(worker7));
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0355");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) '#');
        double double9 = worker8.getSalary();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0356");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) '#');
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification12 = company10.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO13 = qualification12.toDTO();
        boolean boolean15 = qualification12.equals((java.lang.Object) 10.0d);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = qualification12.getWorkers();
        worker8.addQualification(qualification12);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0357");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, 0.0d);
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str11 = company10.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company10.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company10.getQualifications();
        edu.colostate.cs415.model.Worker worker15 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet13, 0.0d);
        boolean boolean16 = worker7.equals((java.lang.Object) worker15);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0358");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getAssignedWorkers();
        boolean boolean5 = company2.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) 12);
        java.util.Set<edu.colostate.cs415.model.Project> projectSet9 = worker8.getProjects();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0359");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) '#');
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str11 = company10.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet12 = company10.getProjects();
        edu.colostate.cs415.model.Qualification qualification14 = company10.createQualification("hi!");
        worker8.addQualification(qualification14);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0360");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getUnavailableWorkers();
        boolean boolean5 = company2.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company2.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!:0:0:0:0:0:0", qualificationSet7, (double) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: worker9.equals(worker9)", worker9.equals(worker9));
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0361");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, 0.0d);
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
        java.lang.String str33 = qualification32.toString();
        worker7.addQualification(qualification32);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0362");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getAssignedWorkers();
        boolean boolean5 = company2.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) 12);
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str11 = company10.toString();
        edu.colostate.cs415.model.Qualification qualification13 = company10.createQualification("hi!:0:0");
        worker8.addQualification(qualification13);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0363");
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
        worker16.setSalary(1.0d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0364");
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
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = qualification14.getWorkers();
        edu.colostate.cs415.model.Company company18 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str19 = company18.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet20 = company18.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet21 = company18.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet22 = company18.getQualifications();
        edu.colostate.cs415.model.Worker worker24 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet22, (double) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification14.removeWorker(worker24);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0365");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Worker worker4 = null;
        qualification3.addWorker(worker4);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = qualification3.getWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = qualification3.getWorkers();
        java.lang.String str8 = qualification3.toString();
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str12 = company11.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet13 = company11.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company11.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet15 = company11.getQualifications();
        edu.colostate.cs415.model.Worker worker17 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet15, (double) '#');
        qualification3.removeWorker(worker17);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker17.", company1.equals(worker17) == worker17.equals(company1));
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0366");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) '#');
        worker8.setSalary(0.0d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0367");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        java.lang.Object obj8 = null;
        boolean boolean9 = worker7.equals(obj8);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0368");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getUnavailableWorkers();
        boolean boolean5 = company2.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company2.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 1L);
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company11.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet13 = company11.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet14 = company11.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company11.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company11.getAvailableWorkers();
        edu.colostate.cs415.model.Qualification qualification18 = company11.createQualification("hi!:0:0");
        worker9.addQualification(qualification18);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0369");
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
        edu.colostate.cs415.model.Qualification qualification18 = company1.createQualification("hi!:0:0");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0370");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        boolean boolean4 = company1.equals((java.lang.Object) "");
        java.lang.String str5 = company1.getName();
        edu.colostate.cs415.model.Qualification qualification7 = company1.createQualification("hi!:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = qualification7.getWorkers();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification7.", company1.equals(qualification7) == qualification7.equals(company1));
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0371");
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
        worker16.setSalary((double) (byte) 10);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0372");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet2 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        edu.colostate.cs415.model.Qualification qualification6 = company1.createQualification("hi!:0:0");
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company9.getUnavailableWorkers();
        boolean boolean12 = company9.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company9.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company9.getQualifications();
        edu.colostate.cs415.model.Worker worker16 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet14, (double) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification6.removeWorker(worker16);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0373");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) '#');
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str11 = company10.toString();
        java.lang.String str12 = company10.toString();
        java.lang.String str13 = company10.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company10.getAvailableWorkers();
        java.lang.String str15 = company10.toString();
        edu.colostate.cs415.model.Qualification qualification17 = company10.createQualification("hi!:0:0:0:0");
        boolean boolean18 = worker8.equals((java.lang.Object) company10);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0374");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Qualification qualification10 = company1.createQualification("hi!:0:0");
        edu.colostate.cs415.model.Company company13 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str14 = company13.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet15 = company13.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company13.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet17 = company13.getQualifications();
        edu.colostate.cs415.model.Worker worker19 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet17, (double) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification10.removeWorker(worker19);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0375");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        java.lang.Object obj10 = null;
        boolean boolean11 = worker9.equals(obj10);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0376");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getAssignedWorkers();
        boolean boolean5 = company2.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) 12);
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification12 = company10.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = qualification12.getWorkers();
        edu.colostate.cs415.model.Company company15 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification17 = company15.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet18 = qualification17.getWorkers();
        boolean boolean19 = qualification12.equals((java.lang.Object) qualification17);
        java.lang.String str20 = qualification12.toString();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO21 = qualification12.toDTO();
        java.lang.String str22 = qualification12.toString();
        edu.colostate.cs415.model.Company company24 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification26 = company24.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet27 = qualification26.getWorkers();
        edu.colostate.cs415.model.Company company29 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification31 = company29.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet32 = qualification31.getWorkers();
        boolean boolean33 = qualification26.equals((java.lang.Object) qualification31);
        java.lang.String str34 = qualification26.toString();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO35 = qualification26.toDTO();
        java.lang.String str36 = qualification26.toString();
        edu.colostate.cs415.model.Company company38 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification40 = company38.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet41 = qualification40.getWorkers();
        edu.colostate.cs415.model.Company company43 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification45 = company43.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet46 = qualification45.getWorkers();
        boolean boolean47 = qualification40.equals((java.lang.Object) qualification45);
        edu.colostate.cs415.model.Worker worker48 = null;
        qualification40.addWorker(worker48);
        java.lang.String str50 = qualification40.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet51 = qualification40.getWorkers();
        boolean boolean52 = qualification26.equals((java.lang.Object) qualification40);
        boolean boolean53 = qualification12.equals((java.lang.Object) boolean52);
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO54 = qualification12.toDTO();
        worker8.addQualification(qualification12);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0377");
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
        edu.colostate.cs415.model.Company company23 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification25 = company23.createQualification("hi!");
        boolean boolean27 = company23.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet28 = company23.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet29 = company23.getQualifications();
        edu.colostate.cs415.model.Worker worker31 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet29, (double) 0L);
        qualification8.removeWorker(worker31);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker31.", company1.equals(worker31) == worker31.equals(company1));
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0378");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
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
        edu.colostate.cs415.model.Qualification qualification34 = company30.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO35 = qualification34.toDTO();
        worker9.addQualification(qualification34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0379");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        java.lang.String str9 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification14 = company12.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = qualification14.getWorkers();
        edu.colostate.cs415.model.Company company17 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification19 = company17.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet20 = qualification19.getWorkers();
        boolean boolean21 = qualification14.equals((java.lang.Object) qualification19);
        boolean boolean22 = company1.equals((java.lang.Object) qualification14);
        edu.colostate.cs415.model.Company company24 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification26 = company24.createQualification("hi!");
        edu.colostate.cs415.model.Company company29 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification31 = company29.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet32 = company29.getUnassignedWorkers();
        java.lang.String str33 = company29.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet34 = company29.getProjects();
        java.lang.String str35 = company29.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet36 = company29.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet37 = company29.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet38 = company29.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet39 = company29.getQualifications();
        edu.colostate.cs415.model.Worker worker41 = company24.createWorker("hi!", qualificationSet39, 1.0d);
        qualification14.addWorker(worker41);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker41.", company1.equals(worker41) == worker41.equals(company1));
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0380");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getUnavailableWorkers();
        boolean boolean5 = company2.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company2.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 1L);
        boolean boolean10 = worker9.isAvailable();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0381");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getUnavailableWorkers();
        boolean boolean5 = company2.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company2.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 1L);
        edu.colostate.cs415.dto.WorkerDTO workerDTO10 = worker9.toDTO();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0382");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification10 = company8.createQualification("hi!");
        boolean boolean12 = company8.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company8.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company8.getQualifications();
        edu.colostate.cs415.model.Worker worker16 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet14, (double) 0L);
        qualification5.addWorker(worker16);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0383");
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
        java.lang.String str19 = company1.getName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0384");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0:0:0");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO10 = qualification9.toDTO();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = qualification9.getWorkers();
        edu.colostate.cs415.model.Company company14 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification16 = company14.createQualification("hi!");
        boolean boolean18 = company14.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet19 = company14.getQualifications();
        edu.colostate.cs415.model.Worker worker21 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet19, (double) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification9.removeWorker(worker21);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0385");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification10 = company8.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company8.getUnassignedWorkers();
        java.lang.String str12 = company8.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet13 = company8.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company8.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company8.getEmployedWorkers();
        edu.colostate.cs415.model.Company company18 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification20 = company18.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet21 = company18.getQualifications();
        edu.colostate.cs415.model.Worker worker23 = company8.createWorker("hi!", qualificationSet21, (double) (short) 1);
        company1.unassignAll(worker23);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker23.", company1.equals(worker23) == worker23.equals(company1));
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0386");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company11.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company11.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company11.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company11.getEmployedWorkers();
        boolean boolean16 = worker9.equals((java.lang.Object) company11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0387");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str9 = company8.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company8.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification12 = company8.createQualification("hi!");
        java.lang.Object obj13 = null;
        boolean boolean14 = company8.equals(obj13);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company8.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet16 = company8.getQualifications();
        edu.colostate.cs415.model.Worker worker18 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet16, (double) 100.0f);
        company1.unassignAll(worker18);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0388");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet8, (double) 0L);
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification14 = company12.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = qualification14.getWorkers();
        edu.colostate.cs415.model.Company company17 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification19 = company17.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet20 = qualification19.getWorkers();
        boolean boolean21 = qualification14.equals((java.lang.Object) qualification19);
        edu.colostate.cs415.model.Worker worker22 = null;
        qualification19.addWorker(worker22);
        edu.colostate.cs415.model.Company company25 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification27 = company25.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet28 = qualification27.getWorkers();
        boolean boolean29 = qualification19.equals((java.lang.Object) workerSet28);
        edu.colostate.cs415.model.Company company31 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet32 = company31.getEmployedWorkers();
        boolean boolean33 = qualification19.equals((java.lang.Object) company31);
        edu.colostate.cs415.model.Qualification qualification35 = company31.createQualification("hi!");
        edu.colostate.cs415.model.Company company37 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet38 = company37.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet39 = company37.getProjects();
        boolean boolean40 = qualification35.equals((java.lang.Object) projectSet39);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet41 = qualification35.getWorkers();
        worker10.addQualification(qualification35);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker10.", company2.equals(worker10) == worker10.equals(company2));
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0389");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification6 = company2.createQualification("hi!");
        java.lang.Object obj7 = null;
        boolean boolean8 = company2.equals(obj7);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker12 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet10, (double) 100.0f);
        edu.colostate.cs415.model.Company company14 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet15 = company14.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company14.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company18 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification20 = company18.createQualification("hi!");
        boolean boolean22 = company18.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet23 = company18.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet24 = company18.getQualifications();
        boolean boolean25 = company14.equals((java.lang.Object) qualificationSet24);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet26 = company14.getUnavailableWorkers();
        boolean boolean27 = worker12.equals((java.lang.Object) company14);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker12.", company2.equals(worker12) == worker12.equals(company2));
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0390");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.lang.String str5 = company1.toString();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str9 = company8.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company8.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company8.getQualifications();
        edu.colostate.cs415.model.Worker worker13 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet11, 0.0d);
        company1.unassignAll(worker13);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker13.", company1.equals(worker13) == worker13.equals(company1));
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0391");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO4 = qualification3.toDTO();
        boolean boolean6 = qualification3.equals((java.lang.Object) 10.0d);
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification10 = company8.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company8.getUnassignedWorkers();
        java.lang.String str12 = company8.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet13 = company8.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company8.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company8.getEmployedWorkers();
        edu.colostate.cs415.model.Company company18 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification20 = company18.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet21 = company18.getQualifications();
        edu.colostate.cs415.model.Worker worker23 = company8.createWorker("hi!", qualificationSet21, (double) (short) 1);
        qualification3.addWorker(worker23);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker23.", company1.equals(worker23) == worker23.equals(company1));
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0392");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.lang.String str4 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company2.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!:0:0", qualificationSet7, (double) 0.0f);
        org.junit.Assert.assertTrue("Contract failed: worker9.equals(worker9)", worker9.equals(worker9));
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0393");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        edu.colostate.cs415.model.Worker worker12 = null;
        qualification11.addWorker(worker12);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = qualification11.getWorkers();
        worker7.addQualification(qualification11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0394");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        boolean boolean4 = company1.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet5 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str11 = company10.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company10.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company10.getQualifications();
        edu.colostate.cs415.model.Worker worker15 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet13, (double) ' ');
        company1.unassignAll(worker15);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker15.", company1.equals(worker15) == worker15.equals(company1));
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0395");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getUnavailableWorkers();
        java.lang.String str9 = company1.toString();
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification14 = company12.createQualification("hi!");
        boolean boolean16 = company12.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet17 = company12.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet18 = company12.getQualifications();
        edu.colostate.cs415.model.Worker worker20 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet18, (double) 0L);
        company1.unassignAll(worker20);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker20.", company1.equals(worker20) == worker20.equals(company1));
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0396");
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
        edu.colostate.cs415.model.Company company22 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = company22.getAssignedWorkers();
        boolean boolean25 = company22.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet26 = company22.getQualifications();
        edu.colostate.cs415.model.Worker worker28 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet26, (double) 12);
        company1.unassignAll(worker28);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker28.", company1.equals(worker28) == worker28.equals(company1));
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0397");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet8, (double) 0L);
        worker10.setSalary((double) '#');
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker10.", company2.equals(worker10) == worker10.equals(company2));
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0398");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.lang.String str4 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAvailableWorkers();
        java.lang.String str6 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification8 = company1.createQualification("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getEmployedWorkers();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification8.", company1.equals(qualification8) == qualification8.equals(company1));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0399");
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
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification22 = company20.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = qualification22.getWorkers();
        edu.colostate.cs415.model.Company company25 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification27 = company25.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet28 = qualification27.getWorkers();
        boolean boolean29 = qualification22.equals((java.lang.Object) qualification27);
        java.lang.String str30 = qualification22.toString();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO31 = qualification22.toDTO();
        java.lang.String str32 = qualification22.toString();
        edu.colostate.cs415.model.Company company34 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification36 = company34.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet37 = qualification36.getWorkers();
        edu.colostate.cs415.model.Company company39 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification41 = company39.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet42 = qualification41.getWorkers();
        boolean boolean43 = qualification36.equals((java.lang.Object) qualification41);
        edu.colostate.cs415.model.Worker worker44 = null;
        qualification36.addWorker(worker44);
        java.lang.String str46 = qualification36.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet47 = qualification36.getWorkers();
        boolean boolean48 = qualification22.equals((java.lang.Object) qualification36);
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
        boolean boolean84 = qualification22.equals((java.lang.Object) company79);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet85 = qualification22.getWorkers();
        worker18.addQualification(qualification22);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0400");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getAssignedWorkers();
        boolean boolean5 = company2.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) 12);
        worker8.setSalary(0.0d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0401");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str7 = company6.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company6.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification10 = company6.createQualification("hi!");
        java.lang.Object obj11 = null;
        boolean boolean12 = company6.equals(obj11);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company6.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company6.getQualifications();
        edu.colostate.cs415.model.Worker worker16 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet14, (double) 100.0f);
        company1.unassignAll(worker16);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0402");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) '#');
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet9 = worker8.getQualifications();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0403");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification6 = company2.createQualification("hi!");
        java.lang.Object obj7 = null;
        boolean boolean8 = company2.equals(obj7);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker12 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet10, (double) 100.0f);
        boolean boolean13 = worker12.isAvailable();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker12.", company2.equals(worker12) == worker12.equals(company2));
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0404");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!:0:0", qualificationSet5, (double) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: worker7.equals(worker7)", worker7.equals(worker7));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0405");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification6 = company2.createQualification("hi!");
        java.lang.Object obj7 = null;
        boolean boolean8 = company2.equals(obj7);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker12 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet10, (double) 100.0f);
        java.util.Set<edu.colostate.cs415.model.Project> projectSet13 = worker12.getProjects();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker12.", company2.equals(worker12) == worker12.equals(company2));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0406");
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
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification22 = company20.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = company20.getUnassignedWorkers();
        java.lang.String str24 = company20.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet25 = company20.getProjects();
        java.lang.String str26 = company20.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet27 = company20.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet28 = company20.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet29 = company20.getProjects();
        java.lang.String str30 = company20.getName();
        edu.colostate.cs415.model.Company company32 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet33 = company32.getUnavailableWorkers();
        boolean boolean35 = company32.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet36 = company32.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet37 = company32.getProjects();
        boolean boolean38 = company20.equals((java.lang.Object) projectSet37);
        java.util.Set<edu.colostate.cs415.model.Project> projectSet39 = company20.getProjects();
        edu.colostate.cs415.model.Company company41 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification43 = company41.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet44 = company41.getUnassignedWorkers();
        java.lang.String str45 = company41.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet46 = company41.getProjects();
        java.lang.String str47 = company41.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet48 = company41.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet49 = company41.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company51 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification53 = company51.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet54 = qualification53.getWorkers();
        edu.colostate.cs415.model.Company company56 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification58 = company56.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet59 = qualification58.getWorkers();
        boolean boolean60 = qualification53.equals((java.lang.Object) qualification58);
        edu.colostate.cs415.model.Worker worker61 = null;
        qualification58.addWorker(worker61);
        edu.colostate.cs415.model.Company company64 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification66 = company64.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet67 = qualification66.getWorkers();
        boolean boolean68 = qualification58.equals((java.lang.Object) workerSet67);
        edu.colostate.cs415.model.Company company70 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet71 = company70.getEmployedWorkers();
        boolean boolean72 = qualification58.equals((java.lang.Object) company70);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet73 = company70.getQualifications();
        boolean boolean74 = company41.equals((java.lang.Object) company70);
        java.lang.Class<?> wildcardClass75 = company70.getClass();
        boolean boolean76 = company20.equals((java.lang.Object) wildcardClass75);
        boolean boolean77 = worker18.equals((java.lang.Object) boolean76);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0407");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        worker7.setSalary(0.0d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0408");
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
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet32 = company1.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company35 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str36 = company35.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet37 = company35.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet38 = company35.getQualifications();
        edu.colostate.cs415.model.Worker worker40 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet38, 0.0d);
        company1.unassignAll(worker40);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker40.", company1.equals(worker40) == worker40.equals(company1));
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0409");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getAssignedWorkers();
        boolean boolean5 = company2.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) 12);
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company10.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet12 = company10.getProjects();
        edu.colostate.cs415.model.Qualification qualification14 = company10.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = qualification14.getWorkers();
        worker8.addQualification(qualification14);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0410");
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
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet20 = qualification3.getWorkers();
        java.lang.String str21 = qualification3.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet22 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company24 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification26 = company24.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet27 = qualification26.getWorkers();
        edu.colostate.cs415.model.Company company29 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification31 = company29.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet32 = qualification31.getWorkers();
        boolean boolean33 = qualification26.equals((java.lang.Object) qualification31);
        java.lang.String str34 = qualification26.toString();
        java.lang.String str35 = qualification26.toString();
        boolean boolean36 = qualification3.equals((java.lang.Object) qualification26);
        edu.colostate.cs415.model.Company company39 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str40 = company39.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet41 = company39.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet42 = company39.getQualifications();
        edu.colostate.cs415.model.Worker worker44 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet42, 0.0d);
        qualification3.addWorker(worker44);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker44.", company1.equals(worker44) == worker44.equals(company1));
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0411");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getAssignedWorkers();
        boolean boolean5 = company2.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) 12);
        edu.colostate.cs415.dto.WorkerDTO workerDTO9 = worker8.toDTO();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0412");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, 0.0d);
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company9.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company9.getUnavailableWorkers();
        edu.colostate.cs415.model.Qualification qualification13 = company9.createQualification("hi!");
        java.lang.String str14 = qualification13.toString();
        worker7.addQualification(qualification13);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0413");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        java.lang.String str7 = company1.toString();
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0:0:0");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO10 = qualification9.toDTO();
        edu.colostate.cs415.model.Company company13 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str14 = company13.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet15 = company13.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company13.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet17 = company13.getQualifications();
        edu.colostate.cs415.model.Worker worker19 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet17, (double) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification9.removeWorker(worker19);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0414");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet5 = company2.getProjects();
        java.lang.String str6 = company2.toString();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification10 = company8.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company8.getUnassignedWorkers();
        java.lang.String str12 = company8.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet13 = company8.getProjects();
        java.lang.Object obj14 = null;
        boolean boolean15 = company8.equals(obj14);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company8.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = company8.getAvailableWorkers();
        boolean boolean18 = company2.equals((java.lang.Object) company8);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet19 = company8.getQualifications();
        edu.colostate.cs415.model.Worker worker21 = new edu.colostate.cs415.model.Worker("hi!:0:0:0:0", qualificationSet19, 10.0d);
        org.junit.Assert.assertTrue("Contract failed: worker21.equals(worker21)", worker21.equals(worker21));
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0415");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0:0:0:0:0");
        java.lang.String str10 = company1.getName();
        edu.colostate.cs415.model.Company company13 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company13.getUnavailableWorkers();
        boolean boolean16 = company13.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = company13.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet18 = company13.getQualifications();
        edu.colostate.cs415.model.Worker worker20 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet18, (double) 1L);
        company1.unassignAll(worker20);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker20.", company1.equals(worker20) == worker20.equals(company1));
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0416");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.getName();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet4 = company2.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!:0:0", qualificationSet5, (double) 'a');
        org.junit.Assert.assertTrue("Contract failed: worker7.equals(worker7)", worker7.equals(worker7));
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0417");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = qualification3.getWorkers();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO5 = qualification3.toDTO();
        boolean boolean7 = qualification3.equals((java.lang.Object) (short) 1);
        java.lang.String str8 = qualification3.toString();
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str12 = company11.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company11.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification15 = company11.createQualification("hi!");
        java.lang.Object obj16 = null;
        boolean boolean17 = company11.equals(obj16);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet18 = company11.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet19 = company11.getQualifications();
        edu.colostate.cs415.model.Worker worker21 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet19, (double) 100.0f);
        qualification3.addWorker(worker21);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker21.", company1.equals(worker21) == worker21.equals(company1));
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0418");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!:0:0");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet6 = company1.getProjects();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification5.", company1.equals(qualification5) == qualification5.equals(company1));
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0419");
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
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str21 = company20.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet22 = company20.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification24 = company20.createQualification("hi!");
        java.lang.Object obj25 = null;
        boolean boolean26 = company20.equals(obj25);
        edu.colostate.cs415.model.Company company28 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet29 = company28.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet30 = company28.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet31 = company28.getProjects();
        java.lang.String str32 = company28.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet33 = company28.getAssignedWorkers();
        boolean boolean34 = company20.equals((java.lang.Object) workerSet33);
        edu.colostate.cs415.model.Qualification qualification36 = company20.createQualification("hi!:0:0:0:0:0:0");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO37 = qualification36.toDTO();
        boolean boolean38 = worker18.equals((java.lang.Object) qualificationDTO37);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0420");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company9.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet11 = company9.getProjects();
        edu.colostate.cs415.model.Qualification qualification13 = company9.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company9.getUnassignedWorkers();
        boolean boolean15 = worker7.equals((java.lang.Object) company9);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0421");
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
        worker18.setSalary((double) (short) 1);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0422");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getUnavailableWorkers();
        boolean boolean5 = company2.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company2.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!:0:0:0:0:0:0", qualificationSet7, (double) 10.0f);
        org.junit.Assert.assertTrue("Contract failed: worker9.equals(worker9)", worker9.equals(worker9));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0423");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Qualification qualification10 = company1.createQualification("hi!:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company1.getUnassignedWorkers();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification10.", company1.equals(qualification10) == qualification10.equals(company1));
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0424");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getAssignedWorkers();
        boolean boolean5 = company2.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) 12);
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str11 = company10.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet12 = company10.getProjects();
        boolean boolean13 = worker8.equals((java.lang.Object) company10);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0425");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str9 = company8.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company8.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company8.getQualifications();
        edu.colostate.cs415.model.Worker worker13 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet11, 0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification5.removeWorker(worker13);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0426");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getUnavailableWorkers();
        boolean boolean5 = company2.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company2.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 1L);
        java.util.Set<edu.colostate.cs415.model.Project> projectSet10 = worker9.getProjects();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0427");
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
        edu.colostate.cs415.model.Company company16 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = company16.getAssignedWorkers();
        boolean boolean19 = company16.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet20 = company16.getQualifications();
        edu.colostate.cs415.model.Worker worker22 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet20, (double) 12);
        boolean boolean23 = qualification3.equals((java.lang.Object) 12);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker22.", company1.equals(worker22) == worker22.equals(company1));
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0428");
        edu.colostate.cs415.model.Qualification qualification1 = new edu.colostate.cs415.model.Qualification("hi!:0:0:0:0:0:0");
        edu.colostate.cs415.model.Company company4 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company4.getUnavailableWorkers();
        boolean boolean7 = company4.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company4.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet9 = company4.getQualifications();
        edu.colostate.cs415.model.Worker worker11 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet9, (double) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification1.removeWorker(worker11);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0429");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, 0.0d);
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str10 = company9.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company9.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet12 = company9.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company9.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company9.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet15 = company9.getQualifications();
        boolean boolean16 = worker7.equals((java.lang.Object) company9);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0430");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        edu.colostate.cs415.model.Qualification qualification5 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getEmployedWorkers();
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str12 = company11.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company11.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company11.getQualifications();
        edu.colostate.cs415.model.Worker worker16 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet14, (double) ' ');
        company1.unassignAll(worker16);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0431");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Worker worker4 = null;
        qualification3.addWorker(worker4);
        boolean boolean7 = qualification3.equals((java.lang.Object) "hi!");
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str11 = company10.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company10.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company10.getQualifications();
        edu.colostate.cs415.model.Worker worker15 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet13, 0.0d);
        qualification3.removeWorker(worker15);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker15.", company1.equals(worker15) == worker15.equals(company1));
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0432");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getUnavailableWorkers();
        edu.colostate.cs415.model.Qualification qualification6 = company2.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!:0:0", qualificationSet7, 1.0d);
        org.junit.Assert.assertTrue("Contract failed: worker9.equals(worker9)", worker9.equals(worker9));
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0433");
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
        edu.colostate.cs415.model.Company company18 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str19 = company18.getName();
        edu.colostate.cs415.model.Qualification qualification21 = company18.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet22 = company18.getUnassignedWorkers();
        java.lang.String str23 = company18.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet24 = company18.getUnavailableWorkers();
        boolean boolean25 = worker16.equals((java.lang.Object) workerSet24);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0434");
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
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification22 = company20.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = company20.getUnassignedWorkers();
        java.lang.String str24 = company20.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet25 = company20.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet26 = company20.getEmployedWorkers();
        edu.colostate.cs415.model.Qualification qualification28 = company20.createQualification("hi!:0:0:0:0:0:0");
        worker18.addQualification(qualification28);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0435");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) '#');
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str11 = company10.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company10.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet13 = company10.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = company10.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company10.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company10.getEmployedWorkers();
        edu.colostate.cs415.model.Company company18 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str19 = company18.toString();
        java.lang.String str20 = company18.toString();
        edu.colostate.cs415.model.Qualification qualification22 = company18.createQualification("hi!");
        boolean boolean23 = company10.equals((java.lang.Object) "hi!");
        edu.colostate.cs415.model.Qualification qualification25 = company10.createQualification("hi!");
        edu.colostate.cs415.model.Company company27 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet28 = company27.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet29 = company27.getProjects();
        edu.colostate.cs415.model.Qualification qualification31 = company27.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet32 = company27.getQualifications();
        boolean boolean33 = qualification25.equals((java.lang.Object) company27);
        edu.colostate.cs415.model.Qualification qualification35 = company27.createQualification("hi!:0:0");
        worker8.addQualification(qualification35);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0436");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getUnavailableWorkers();
        boolean boolean5 = company2.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company2.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 1L);
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet14 = qualification13.getWorkers();
        edu.colostate.cs415.model.Company company16 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification18 = company16.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet19 = qualification18.getWorkers();
        boolean boolean20 = qualification13.equals((java.lang.Object) qualification18);
        java.lang.String str21 = qualification18.toString();
        edu.colostate.cs415.model.Company company23 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification25 = company23.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet26 = qualification25.getWorkers();
        edu.colostate.cs415.model.Company company28 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification30 = company28.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet31 = qualification30.getWorkers();
        boolean boolean32 = qualification25.equals((java.lang.Object) qualification30);
        edu.colostate.cs415.model.Worker worker33 = null;
        qualification25.addWorker(worker33);
        java.lang.String str35 = qualification25.toString();
        boolean boolean36 = qualification18.equals((java.lang.Object) str35);
        java.lang.String str37 = qualification18.toString();
        edu.colostate.cs415.model.Company company39 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification41 = company39.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO42 = qualification41.toDTO();
        boolean boolean44 = qualification41.equals((java.lang.Object) 10.0d);
        edu.colostate.cs415.model.Company company46 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification48 = company46.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet49 = qualification48.getWorkers();
        edu.colostate.cs415.model.Company company51 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification53 = company51.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet54 = qualification53.getWorkers();
        boolean boolean55 = qualification48.equals((java.lang.Object) qualification53);
        boolean boolean56 = qualification41.equals((java.lang.Object) boolean55);
        boolean boolean57 = qualification18.equals((java.lang.Object) boolean55);
        java.lang.Object obj58 = null;
        boolean boolean59 = qualification18.equals(obj58);
        worker9.addQualification(qualification18);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0437");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getUnavailableWorkers();
        boolean boolean5 = company2.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company2.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 1L);
        java.lang.String str10 = worker9.toString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0438");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = qualification4.getWorkers();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification9 = company7.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = qualification9.getWorkers();
        boolean boolean11 = qualification4.equals((java.lang.Object) qualification9);
        java.lang.String str12 = qualification4.toString();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO13 = qualification4.toDTO();
        java.lang.String str14 = qualification4.toString();
        edu.colostate.cs415.model.Company company16 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification18 = company16.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet19 = qualification18.getWorkers();
        edu.colostate.cs415.model.Company company21 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification23 = company21.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet24 = qualification23.getWorkers();
        boolean boolean25 = qualification18.equals((java.lang.Object) qualification23);
        edu.colostate.cs415.model.Worker worker26 = null;
        qualification18.addWorker(worker26);
        java.lang.String str28 = qualification18.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet29 = qualification18.getWorkers();
        boolean boolean30 = qualification4.equals((java.lang.Object) qualification18);
        edu.colostate.cs415.model.Company company32 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification34 = company32.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet35 = company32.getUnassignedWorkers();
        java.lang.String str36 = company32.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet37 = company32.getProjects();
        java.lang.String str38 = company32.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet39 = company32.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet40 = company32.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company42 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification44 = company42.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet45 = qualification44.getWorkers();
        edu.colostate.cs415.model.Company company47 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification49 = company47.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet50 = qualification49.getWorkers();
        boolean boolean51 = qualification44.equals((java.lang.Object) qualification49);
        edu.colostate.cs415.model.Worker worker52 = null;
        qualification49.addWorker(worker52);
        edu.colostate.cs415.model.Company company55 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification57 = company55.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet58 = qualification57.getWorkers();
        boolean boolean59 = qualification49.equals((java.lang.Object) workerSet58);
        edu.colostate.cs415.model.Company company61 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet62 = company61.getEmployedWorkers();
        boolean boolean63 = qualification49.equals((java.lang.Object) company61);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet64 = company61.getQualifications();
        boolean boolean65 = company32.equals((java.lang.Object) company61);
        boolean boolean66 = qualification4.equals((java.lang.Object) company61);
        edu.colostate.cs415.model.Qualification qualification68 = company61.createQualification("hi!:0:0:0:0");
        java.lang.String str69 = company61.getName();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet70 = company61.getQualifications();
        edu.colostate.cs415.model.Worker worker72 = new edu.colostate.cs415.model.Worker("hi!:0:0", qualificationSet70, (double) 1);
        org.junit.Assert.assertTrue("Contract failed: worker72.equals(worker72)", worker72.equals(worker72));
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0439");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Qualification qualification6 = company1.createQualification("hi!:0:0");
        java.lang.String str7 = qualification6.toString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification6.", company1.equals(qualification6) == qualification6.equals(company1));
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0440");
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
        int int17 = worker16.getWorkload();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0441");
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
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str21 = company20.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet22 = company20.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = company20.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet24 = company20.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet25 = company20.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet26 = company20.getProjects();
        boolean boolean27 = worker18.equals((java.lang.Object) company20);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0442");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        worker9.setSalary((double) 0L);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0443");
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
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str21 = company20.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet22 = company20.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = company20.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet24 = company20.getQualifications();
        edu.colostate.cs415.model.Worker worker26 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet24, (double) '#');
        company1.unassignAll(worker26);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker26.", company1.equals(worker26) == worker26.equals(company1));
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0444");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        worker7.setSalary((double) 100L);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0445");
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
        edu.colostate.cs415.model.Qualification qualification20 = new edu.colostate.cs415.model.Qualification("hi!");
        worker18.addQualification(qualification20);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0446");
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
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str21 = company20.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet22 = company20.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = company20.getAssignedWorkers();
        boolean boolean24 = worker18.equals((java.lang.Object) company20);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0447");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification6 = company2.createQualification("hi!");
        java.lang.Object obj7 = null;
        boolean boolean8 = company2.equals(obj7);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker12 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet10, (double) 100.0f);
        worker12.setSalary((double) 0);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker12.", company2.equals(worker12) == worker12.equals(company2));
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0448");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) '#');
        java.lang.Class<?> wildcardClass9 = qualificationSet6.getClass();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0449");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getUnavailableWorkers();
        boolean boolean5 = company2.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company2.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 1L);
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification13 = company11.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO14 = qualification13.toDTO();
        boolean boolean16 = qualification13.equals((java.lang.Object) 10.0d);
        edu.colostate.cs415.model.Company company18 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification20 = company18.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet21 = qualification20.getWorkers();
        edu.colostate.cs415.model.Company company23 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification25 = company23.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet26 = qualification25.getWorkers();
        boolean boolean27 = qualification20.equals((java.lang.Object) qualification25);
        boolean boolean28 = qualification13.equals((java.lang.Object) boolean27);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet29 = qualification13.getWorkers();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO30 = qualification13.toDTO();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet31 = qualification13.getWorkers();
        edu.colostate.cs415.model.Company company33 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification35 = company33.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO36 = qualification35.toDTO();
        boolean boolean38 = qualification35.equals((java.lang.Object) 10.0d);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet39 = qualification35.getWorkers();
        boolean boolean40 = qualification13.equals((java.lang.Object) workerSet39);
        worker9.addQualification(qualification13);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0450");
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
        worker18.setSalary((double) 0);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0451");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) '#');
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification12 = company10.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = qualification12.getWorkers();
        edu.colostate.cs415.model.Company company15 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification17 = company15.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet18 = qualification17.getWorkers();
        boolean boolean19 = qualification12.equals((java.lang.Object) qualification17);
        edu.colostate.cs415.model.Worker worker20 = null;
        qualification17.addWorker(worker20);
        edu.colostate.cs415.model.Company company23 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification25 = company23.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet26 = qualification25.getWorkers();
        boolean boolean27 = qualification17.equals((java.lang.Object) workerSet26);
        edu.colostate.cs415.model.Company company29 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet30 = company29.getEmployedWorkers();
        boolean boolean31 = qualification17.equals((java.lang.Object) company29);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet32 = company29.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet33 = company29.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet34 = company29.getProjects();
        edu.colostate.cs415.model.Qualification qualification36 = company29.createQualification("hi!");
        java.lang.String str37 = qualification36.toString();
        boolean boolean38 = worker8.equals((java.lang.Object) str37);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0452");
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
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification22 = company20.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = qualification22.getWorkers();
        edu.colostate.cs415.model.Company company25 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification27 = company25.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet28 = qualification27.getWorkers();
        boolean boolean29 = qualification22.equals((java.lang.Object) qualification27);
        java.lang.String str30 = qualification22.toString();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO31 = qualification22.toDTO();
        edu.colostate.cs415.model.Company company33 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification35 = company33.createQualification("hi!");
        boolean boolean37 = company33.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet38 = company33.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet39 = company33.getQualifications();
        java.lang.Class<?> wildcardClass40 = qualificationSet39.getClass();
        boolean boolean41 = qualification22.equals((java.lang.Object) qualificationSet39);
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO42 = qualification22.toDTO();
        boolean boolean43 = worker18.equals((java.lang.Object) qualification22);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0453");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification9 = company7.createQualification("hi!");
        boolean boolean11 = company7.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company7.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company7.getQualifications();
        edu.colostate.cs415.model.Worker worker15 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet13, (double) 0L);
        company1.unassignAll(worker15);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker15.", company1.equals(worker15) == worker15.equals(company1));
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0454");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str10 = company9.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company9.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification13 = company9.createQualification("hi!");
        edu.colostate.cs415.model.Qualification qualification15 = company9.createQualification("hi!:0:0");
        edu.colostate.cs415.model.Worker worker16 = null;
        qualification15.addWorker(worker16);
        boolean boolean18 = company1.equals((java.lang.Object) worker16);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification15.", company1.equals(qualification15) == qualification15.equals(company1));
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0455");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company1.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company1.getQualifications();
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO10 = qualification9.toDTO();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification9.", company1.equals(qualification9) == qualification9.equals(company1));
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0456");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 10L);
        worker9.setSalary((double) (short) 0);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0457");
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
        boolean boolean28 = qualification26.equals((java.lang.Object) (short) 1);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification26.", company1.equals(qualification26) == qualification26.equals(company1));
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0458");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet5 = company2.getProjects();
        java.lang.String str6 = company2.toString();
        edu.colostate.cs415.model.Company company8 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification10 = company8.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company8.getUnassignedWorkers();
        java.lang.String str12 = company8.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet13 = company8.getProjects();
        java.lang.Object obj14 = null;
        boolean boolean15 = company8.equals(obj14);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company8.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = company8.getAvailableWorkers();
        boolean boolean18 = company2.equals((java.lang.Object) company8);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet19 = company8.getQualifications();
        edu.colostate.cs415.model.Worker worker21 = new edu.colostate.cs415.model.Worker("hi!:0:0:0:0:0:0", qualificationSet19, (double) 100.0f);
        org.junit.Assert.assertTrue("Contract failed: worker21.equals(worker21)", worker21.equals(worker21));
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0459");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company9.getUnassignedWorkers();
        java.lang.String str13 = company9.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet14 = company9.getProjects();
        java.lang.String str15 = company9.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet16 = company9.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = company9.getEmployedWorkers();
        java.lang.String str18 = company9.getName();
        edu.colostate.cs415.model.Qualification qualification20 = company9.createQualification("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification22 = company9.createQualification("hi!:0:0:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = qualification22.getWorkers();
        boolean boolean24 = worker7.equals((java.lang.Object) qualification22);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0460");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.lang.String str6 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Qualification qualification9 = company1.createQualification("hi!:0:0:0:0");
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification14 = company12.createQualification("hi!");
        boolean boolean16 = company12.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet17 = company12.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet18 = company12.getQualifications();
        edu.colostate.cs415.model.Worker worker20 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet18, (double) 0L);
        qualification9.addWorker(worker20);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker20.", company1.equals(worker20) == worker20.equals(company1));
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0461");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, (double) ' ');
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = qualification11.getWorkers();
        edu.colostate.cs415.model.Company company14 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification16 = company14.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet17 = qualification16.getWorkers();
        boolean boolean18 = qualification11.equals((java.lang.Object) qualification16);
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO19 = qualification11.toDTO();
        worker7.addQualification(qualification11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0462");
        edu.colostate.cs415.model.Qualification qualification1 = new edu.colostate.cs415.model.Qualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO2 = qualification1.toDTO();
        edu.colostate.cs415.model.Company company5 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification7 = company5.createQualification("hi!");
        boolean boolean9 = company5.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company5.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company5.getQualifications();
        edu.colostate.cs415.model.Worker worker13 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet11, (double) 0L);
        qualification1.addWorker(worker13);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company5 and worker13.", company5.equals(worker13) == worker13.equals(company5));
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0463");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str2 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company6.getUnassignedWorkers();
        java.lang.String str10 = company6.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet11 = company6.getProjects();
        java.lang.String str12 = company6.toString();
        edu.colostate.cs415.model.Qualification qualification14 = company6.createQualification("hi!:0:0:0:0");
        edu.colostate.cs415.model.Qualification qualification16 = company6.createQualification("hi!:0:0");
        boolean boolean17 = company1.equals((java.lang.Object) qualification16);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification16.", company1.equals(qualification16) == qualification16.equals(company1));
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0464");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification6 = company2.createQualification("hi!");
        java.lang.Object obj7 = null;
        boolean boolean8 = company2.equals(obj7);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker12 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet10, (double) 100.0f);
        double double13 = worker12.getSalary();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker12.", company2.equals(worker12) == worker12.equals(company2));
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0465");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet8, (double) 0L);
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification14 = company12.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company12.getUnassignedWorkers();
        java.lang.String str16 = company12.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet17 = company12.getProjects();
        java.lang.Object obj18 = null;
        boolean boolean19 = company12.equals(obj18);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet20 = company12.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet21 = company12.getAvailableWorkers();
        boolean boolean22 = worker10.equals((java.lang.Object) workerSet21);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker10.", company2.equals(worker10) == worker10.equals(company2));
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0466");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        boolean boolean4 = company1.equals((java.lang.Object) "");
        edu.colostate.cs415.model.Company company7 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str8 = company7.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet9 = company7.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet10 = company7.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet11 = company7.getQualifications();
        edu.colostate.cs415.model.Worker worker13 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet11, (double) '#');
        company1.unassignAll(worker13);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker13.", company1.equals(worker13) == worker13.equals(company1));
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0467");
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
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet21 = qualification3.getWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet22 = qualification3.getWorkers();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO23 = qualification3.toDTO();
        edu.colostate.cs415.model.Company company25 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet26 = company25.getUnavailableWorkers();
        boolean boolean28 = company25.equals((java.lang.Object) "");
        edu.colostate.cs415.model.Qualification qualification30 = company25.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet31 = company25.getProjects();
        boolean boolean32 = qualification3.equals((java.lang.Object) company25);
        edu.colostate.cs415.model.Company company35 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet36 = company35.getUnavailableWorkers();
        boolean boolean38 = company35.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet39 = company35.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet40 = company35.getQualifications();
        edu.colostate.cs415.model.Worker worker42 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet40, (double) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification3.removeWorker(worker42);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0468");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnassignedWorkers();
        java.lang.String str5 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str10 = company9.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company9.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet12 = company9.getQualifications();
        edu.colostate.cs415.model.Worker worker14 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet12, 0.0d);
        company1.unassignAll(worker14);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker14.", company1.equals(worker14) == worker14.equals(company1));
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0469");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getUnavailableWorkers();
        boolean boolean5 = company2.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company2.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 1L);
        double double10 = worker9.getSalary();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0470");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getAssignedWorkers();
        boolean boolean5 = company2.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) 12);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet9 = worker8.getQualifications();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0471");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getAssignedWorkers();
        boolean boolean5 = company2.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) 12);
        int int9 = worker8.getWorkload();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0472");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification6 = company2.createQualification("hi!");
        java.lang.Object obj7 = null;
        boolean boolean8 = company2.equals(obj7);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker12 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet10, (double) 100.0f);
        java.lang.String str13 = worker12.getName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker12.", company2.equals(worker12) == worker12.equals(company2));
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0473");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification6 = company2.createQualification("hi!");
        java.lang.Object obj7 = null;
        boolean boolean8 = company2.equals(obj7);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker12 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet10, (double) 100.0f);
        edu.colostate.cs415.model.Company company14 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet15 = company14.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet16 = company14.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet17 = company14.getProjects();
        java.lang.String str18 = company14.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet19 = company14.getAvailableWorkers();
        boolean boolean20 = worker12.equals((java.lang.Object) company14);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker12.", company2.equals(worker12) == worker12.equals(company2));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0474");
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
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet41 = company37.getUnavailableWorkers();
        boolean boolean42 = worker16.equals((java.lang.Object) workerSet41);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0475");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getUnassignedWorkers();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company6.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet8 = company6.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet9 = company6.getProjects();
        java.lang.String str10 = company6.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company6.getAssignedWorkers();
        boolean boolean12 = company2.equals((java.lang.Object) company6);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = company6.getQualifications();
        edu.colostate.cs415.model.Worker worker15 = new edu.colostate.cs415.model.Worker("hi!:0:0:0:0", qualificationSet13, (double) 100);
        org.junit.Assert.assertTrue("Contract failed: worker15.equals(worker15)", worker15.equals(worker15));
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0476");
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
        edu.colostate.cs415.model.Company company18 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification20 = company18.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet21 = company18.getQualifications();
        edu.colostate.cs415.model.Qualification qualification23 = company18.createQualification("hi!:0:0:0:0");
        edu.colostate.cs415.model.Company company25 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification27 = company25.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO28 = qualification27.toDTO();
        boolean boolean30 = qualification27.equals((java.lang.Object) 10.0d);
        edu.colostate.cs415.model.Company company32 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification34 = company32.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet35 = qualification34.getWorkers();
        edu.colostate.cs415.model.Company company37 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification39 = company37.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet40 = qualification39.getWorkers();
        boolean boolean41 = qualification34.equals((java.lang.Object) qualification39);
        boolean boolean42 = qualification27.equals((java.lang.Object) boolean41);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet43 = qualification27.getWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet44 = qualification27.getWorkers();
        java.lang.String str45 = qualification27.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet46 = qualification27.getWorkers();
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO47 = qualification27.toDTO();
        boolean boolean48 = qualification23.equals((java.lang.Object) qualification27);
        worker16.addQualification(qualification23);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0477");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification6 = company2.createQualification("hi!");
        java.lang.Object obj7 = null;
        boolean boolean8 = company2.equals(obj7);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker12 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet10, (double) 100.0f);
        edu.colostate.cs415.model.Company company14 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification16 = company14.createQualification("hi!");
        boolean boolean18 = company14.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet19 = company14.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet20 = company14.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet21 = company14.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet22 = company14.getProjects();
        boolean boolean23 = worker12.equals((java.lang.Object) projectSet22);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker12.", company2.equals(worker12) == worker12.equals(company2));
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0478");
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
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet21 = company20.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet22 = company20.getUnavailableWorkers();
        edu.colostate.cs415.model.Qualification qualification24 = company20.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO25 = qualification24.toDTO();
        worker18.addQualification(qualification24);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0479");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        boolean boolean5 = company1.equals((java.lang.Object) 10L);
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet7 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification11 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Company company13 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification15 = company13.createQualification("hi!");
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
        edu.colostate.cs415.model.Worker worker30 = company13.createWorker("hi!", qualificationSet28, 1.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification11.removeWorker(worker30);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0480");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!:0:0", qualificationSet5, (double) '#');
        org.junit.Assert.assertTrue("Contract failed: worker7.equals(worker7)", worker7.equals(worker7));
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0481");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification6 = company2.createQualification("hi!");
        java.lang.Object obj7 = null;
        boolean boolean8 = company2.equals(obj7);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker12 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet10, (double) 100.0f);
        edu.colostate.cs415.dto.WorkerDTO workerDTO13 = worker12.toDTO();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker12.", company2.equals(worker12) == worker12.equals(company2));
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0482");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getUnavailableWorkers();
        boolean boolean5 = company2.equals((java.lang.Object) "");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company2.getAvailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet7, (double) 1L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = worker9.getQualifications();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker9.", company2.equals(worker9) == worker9.equals(company2));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0483");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet8, (double) 0L);
        worker10.setSalary((double) 1L);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker10.", company2.equals(worker10) == worker10.equals(company2));
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0484");
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
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification22 = company20.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = qualification22.getWorkers();
        edu.colostate.cs415.model.Company company25 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification27 = company25.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet28 = qualification27.getWorkers();
        boolean boolean29 = qualification22.equals((java.lang.Object) qualification27);
        java.lang.String str30 = qualification27.toString();
        edu.colostate.cs415.model.Company company32 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification34 = company32.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet35 = qualification34.getWorkers();
        edu.colostate.cs415.model.Company company37 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification39 = company37.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet40 = qualification39.getWorkers();
        boolean boolean41 = qualification34.equals((java.lang.Object) qualification39);
        edu.colostate.cs415.model.Worker worker42 = null;
        qualification34.addWorker(worker42);
        java.lang.String str44 = qualification34.toString();
        boolean boolean45 = qualification27.equals((java.lang.Object) str44);
        java.lang.String str46 = qualification27.toString();
        edu.colostate.cs415.model.Company company48 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification50 = company48.createQualification("hi!");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO51 = qualification50.toDTO();
        boolean boolean53 = qualification50.equals((java.lang.Object) 10.0d);
        edu.colostate.cs415.model.Company company55 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification57 = company55.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet58 = qualification57.getWorkers();
        edu.colostate.cs415.model.Company company60 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification62 = company60.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet63 = qualification62.getWorkers();
        boolean boolean64 = qualification57.equals((java.lang.Object) qualification62);
        boolean boolean65 = qualification50.equals((java.lang.Object) boolean64);
        boolean boolean66 = qualification27.equals((java.lang.Object) boolean64);
        java.lang.Object obj67 = null;
        boolean boolean68 = qualification27.equals(obj67);
        worker18.addQualification(qualification27);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0485");
        edu.colostate.cs415.model.Qualification qualification1 = new edu.colostate.cs415.model.Qualification("hi!");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification1.removeWorker(worker20);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0486");
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
        edu.colostate.cs415.model.Company company18 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet19 = company18.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet20 = company18.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet21 = company18.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet22 = company18.getAssignedWorkers();
        boolean boolean23 = worker16.equals((java.lang.Object) workerSet22);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0487");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company2.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) '#');
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification12 = company10.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = qualification12.getWorkers();
        edu.colostate.cs415.model.Company company15 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification17 = company15.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet18 = qualification17.getWorkers();
        boolean boolean19 = qualification12.equals((java.lang.Object) qualification17);
        edu.colostate.cs415.model.Worker worker20 = null;
        qualification17.addWorker(worker20);
        edu.colostate.cs415.model.Company company23 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification25 = company23.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet26 = qualification25.getWorkers();
        boolean boolean27 = qualification17.equals((java.lang.Object) workerSet26);
        edu.colostate.cs415.model.Company company29 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet30 = company29.getEmployedWorkers();
        boolean boolean31 = qualification17.equals((java.lang.Object) company29);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet32 = company29.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet33 = company29.getEmployedWorkers();
        edu.colostate.cs415.model.Company company35 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification37 = company35.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet38 = company35.getUnassignedWorkers();
        java.lang.String str39 = company35.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet40 = company35.getProjects();
        java.lang.String str41 = company35.toString();
        edu.colostate.cs415.model.Qualification qualification43 = company35.createQualification("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet44 = company35.getAssignedWorkers();
        boolean boolean45 = company29.equals((java.lang.Object) workerSet44);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet46 = company29.getUnavailableWorkers();
        boolean boolean47 = worker8.equals((java.lang.Object) company29);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0488");
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
        edu.colostate.cs415.model.Qualification qualification16 = company1.createQualification("hi!");
        edu.colostate.cs415.model.Company company18 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet19 = company18.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet20 = company18.getProjects();
        edu.colostate.cs415.model.Qualification qualification22 = company18.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet23 = company18.getQualifications();
        boolean boolean24 = qualification16.equals((java.lang.Object) company18);
        edu.colostate.cs415.model.Qualification qualification26 = company18.createQualification("hi!:0:0");
        edu.colostate.cs415.model.Company company28 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification30 = company28.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet31 = company28.getUnassignedWorkers();
        java.lang.String str32 = company28.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet33 = company28.getProjects();
        java.lang.String str34 = company28.toString();
        edu.colostate.cs415.model.Qualification qualification36 = company28.createQualification("hi!:0:0:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet37 = company28.getEmployedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet38 = company28.getUnavailableWorkers();
        boolean boolean39 = qualification26.equals((java.lang.Object) company28);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification26.", company1.equals(qualification26) == qualification26.equals(company1));
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0489");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet2 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet3 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet4 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet5 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Qualification qualification8 = company1.createQualification("hi!:0:0");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getUnassignedWorkers();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and qualification8.", company1.equals(qualification8) == qualification8.equals(company1));
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0490");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet5 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker7 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet5, 0.0d);
        edu.colostate.cs415.model.Company company9 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification11 = company9.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company9.getUnassignedWorkers();
        java.lang.String str13 = company9.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet14 = company9.getProjects();
        java.lang.String str15 = company9.toString();
        edu.colostate.cs415.model.Qualification qualification17 = company9.createQualification("hi!:0:0:0:0");
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO18 = qualification17.toDTO();
        edu.colostate.cs415.model.Company company20 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet21 = company20.getUnavailableWorkers();
        edu.colostate.cs415.model.Company company23 = new edu.colostate.cs415.model.Company("hi!");
        java.lang.String str24 = company23.toString();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet25 = company23.getProjects();
        boolean boolean26 = company20.equals((java.lang.Object) projectSet25);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet27 = company20.getAssignedWorkers();
        boolean boolean28 = qualification17.equals((java.lang.Object) workerSet27);
        worker7.addQualification(qualification17);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker7.", company2.equals(worker7) == worker7.equals(company2));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0491");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification4 = company2.createQualification("hi!");
        boolean boolean6 = company2.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker10 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet8, (double) 0L);
        worker10.setSalary((double) 0.0f);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker10.", company2.equals(worker10) == worker10.equals(company2));
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0492");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.getName();
        edu.colostate.cs415.model.Qualification qualification5 = company2.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet6 = company2.getUnassignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet7 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker9 = new edu.colostate.cs415.model.Worker("hi!:0:0", qualificationSet7, 0.0d);
        org.junit.Assert.assertTrue("Contract failed: worker9.equals(worker9)", worker9.equals(worker9));
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0493");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification6 = company2.createQualification("hi!");
        java.lang.Object obj7 = null;
        boolean boolean8 = company2.equals(obj7);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker12 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet10, (double) 100.0f);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet13 = worker12.getQualifications();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker12.", company2.equals(worker12) == worker12.equals(company2));
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0494");
        edu.colostate.cs415.model.Company company3 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification5 = company3.createQualification("hi!");
        boolean boolean7 = company3.equals((java.lang.Object) 10L);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet8 = company3.getQualifications();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet9 = company3.getQualifications();
        edu.colostate.cs415.model.Worker worker11 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet9, (double) 0L);
        edu.colostate.cs415.model.Worker worker13 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet9, (double) (short) 0);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company3 and worker11.", company3.equals(worker11) == worker11.equals(company3));
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0495");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet3 = company2.getAssignedWorkers();
        boolean boolean5 = company2.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet6 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker8 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet6, (double) 12);
        edu.colostate.cs415.model.Company company11 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet12 = company11.getAssignedWorkers();
        boolean boolean14 = company11.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet15 = company11.getQualifications();
        edu.colostate.cs415.model.Worker worker17 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet15, (double) 12);
        boolean boolean18 = worker8.equals((java.lang.Object) qualificationSet15);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker8.", company2.equals(worker8) == worker8.equals(company2));
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0496");
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
        edu.colostate.cs415.model.Company company21 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str22 = company21.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet23 = company21.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet24 = company21.getQualifications();
        edu.colostate.cs415.model.Worker worker26 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet24, 0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qualification3.removeWorker(worker26);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0497");
        edu.colostate.cs415.model.Company company2 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str3 = company2.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company2.getAssignedWorkers();
        edu.colostate.cs415.model.Qualification qualification6 = company2.createQualification("hi!");
        java.lang.Object obj7 = null;
        boolean boolean8 = company2.equals(obj7);
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company2.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet10 = company2.getQualifications();
        edu.colostate.cs415.model.Worker worker12 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet10, (double) 100.0f);
        worker12.setSalary((double) 10L);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company2 and worker12.", company2.equals(worker12) == worker12.equals(company2));
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0498");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet5 = company1.getProjects();
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet7 = company1.getProjects();
        edu.colostate.cs415.model.Company company10 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet11 = company10.getAssignedWorkers();
        boolean boolean13 = company10.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet14 = company10.getQualifications();
        edu.colostate.cs415.model.Worker worker16 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet14, (double) 12);
        company1.unassignAll(worker16);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker16.", company1.equals(worker16) == worker16.equals(company1));
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0499");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str2 = company1.toString();
        java.lang.String str3 = company1.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = company1.getUnavailableWorkers();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet5 = company1.getProjects();
        java.lang.String str6 = company1.getName();
        java.util.Set<edu.colostate.cs415.model.Project> projectSet7 = company1.getProjects();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet8 = company1.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = company1.getAvailableWorkers();
        edu.colostate.cs415.model.Company company12 = new edu.colostate.cs415.model.Company("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet13 = company12.getAssignedWorkers();
        boolean boolean15 = company12.equals((java.lang.Object) 0);
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet16 = company12.getQualifications();
        edu.colostate.cs415.model.Worker worker18 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet16, (double) 12);
        company1.unassignAll(worker18);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker18.", company1.equals(worker18) == worker18.equals(company1));
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0500");
        edu.colostate.cs415.model.Company company1 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification3 = company1.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet4 = qualification3.getWorkers();
        edu.colostate.cs415.model.Company company6 = new edu.colostate.cs415.model.Company("hi!");
        edu.colostate.cs415.model.Qualification qualification8 = company6.createQualification("hi!");
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet9 = qualification8.getWorkers();
        boolean boolean10 = qualification3.equals((java.lang.Object) qualification8);
        edu.colostate.cs415.dto.QualificationDTO qualificationDTO11 = qualification3.toDTO();
        java.lang.String str12 = qualification3.toString();
        java.lang.String str13 = qualification3.toString();
        edu.colostate.cs415.model.Company company16 = new edu.colostate.cs415.model.Company("hi!:0:0");
        java.lang.String str17 = company16.toString();
        java.util.Set<edu.colostate.cs415.model.Worker> workerSet18 = company16.getAssignedWorkers();
        java.util.Set<edu.colostate.cs415.model.Qualification> qualificationSet19 = company16.getQualifications();
        edu.colostate.cs415.model.Worker worker21 = new edu.colostate.cs415.model.Worker("hi!", qualificationSet19, 0.0d);
        qualification3.addWorker(worker21);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on company1 and worker21.", company1.equals(worker21) == worker21.equals(company1));
    }
}

