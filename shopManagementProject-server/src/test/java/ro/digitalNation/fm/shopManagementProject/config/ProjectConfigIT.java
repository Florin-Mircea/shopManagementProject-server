package ro.digitalNation.fm.shopManagementProject.config;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProjectConfigIT {
    
    public ProjectConfigIT() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
        
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
        
    }
    
    @Test
    public void testWsExporter() {
        System.out.println("wsExporter");
        ProjectConfig instance = new ProjectConfig();
        SimpleJaxWsServiceExporter expResult = null;
        SimpleJaxWsServiceExporter result = instance.wsExporter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
