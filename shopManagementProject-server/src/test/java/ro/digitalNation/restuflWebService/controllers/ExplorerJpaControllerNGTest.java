package ro.digitalNation.restuflWebService.controllers;

import jakarta.persistence.EntityManager;
import java.util.List;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplorerJpaControllerNGTest {
    
    public ExplorerJpaControllerNGTest() {
        
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        
    }
   
    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        ExplorerJpaController instance = null;
        EntityManager expResult = null;
        EntityManager result = instance.getEntityManager();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testCreate() {
        System.out.println("create");
        Explorer explorer = null;
        ExplorerJpaController instance = null;
        instance.create(explorer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testEdit() {
        System.out.println("edit");
        Explorer explorer = null;
        ExplorerJpaController instance = null;
        instance.edit(explorer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testDestroy() {
        System.out.println("destroy");
        Integer id = null;
        ExplorerJpaController instance = null;
        instance.destroy(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testFindExplorer() {
        System.out.println("findExplorer");
        Integer id = null;
        ExplorerJpaController instance = null;
        instance.findExplorer(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetExplorerCount() {
        System.out.println("getExplorerCount");
        ExplorerJpaController instance = null;
        int expResult = 0;
        int result = instance.getExplorerCount();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   
    @Test
    public void testFindExplorerEntities() {
        System.out.println("findExplorerEntities");
        ExplorerJpaController instance = null;
        List expResult = null;
        List result = instance.findExplorerEntities();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
