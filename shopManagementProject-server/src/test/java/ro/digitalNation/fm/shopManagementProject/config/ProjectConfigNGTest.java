package ro.digitalNation.fm.shopManagementProject.config;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class ProjectConfigNGTest {
    
    public ProjectConfigNGTest() {
        
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
            
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
        
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
        
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
        
    }

    @org.testng.annotations.Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of wsExporter method, of class ProjectConfig.
     */
    @Test
    public void testWsExporter() {
        System.out.println("wsExporter");
        ProjectConfig instance = new ProjectConfig();
        SimpleJaxWsServiceExporter expResult = null;
        SimpleJaxWsServiceExporter result = instance.wsExporter();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
