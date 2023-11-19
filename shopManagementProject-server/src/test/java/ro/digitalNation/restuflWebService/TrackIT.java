package ro.digitalNation.restuflWebService;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TrackIT {
    
    public TrackIT() {
        
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
    public void testTrack() {
        System.out.println("Track");
        long id = 0L;
        String content = "";
        Track instance = new Track();
        record expResult = null;
        record result = instance.Track(id, content);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
