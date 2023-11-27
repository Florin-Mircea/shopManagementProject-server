package ro.digitalNation.restuflWebService.controllers;

import jakarta.persistence.EntityManager;
import java.util.List;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TrainerJpaControllerNGTest {
    
    public TrainerJpaControllerNGTest() {
        
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
        TrainerJpaController instance = null;
        EntityManager expResult = null;
        EntityManager result = instance.getEntityManager();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testCreate() {
        System.out.println("create");
        Trainer trainer = null;
        TrainerJpaController instance = null;
        instance.create(trainer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testEdit() {
        System.out.println("edit");
        Trainer trainer = null;
        TrainerJpaController instance = null;
        instance.edit(trainer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testDestroy() {
        System.out.println("destroy");
        Integer id = null;
        TrainerJpaController instance = null;
        instance.destroy(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testFindTrainer() {
        System.out.println("findTrainer");
        Integer id = null;
        TrainerJpaController instance = null;
        instance.findTrainer(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetTrainerCount() {
        System.out.println("getTrainerCount");
        TrainerJpaController instance = null;
        int expResult = 0;
        int result = instance.getTrainerCount();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testFindTrainerEntities() {
        System.out.println("findTrainerEntities");
        TrainerJpaController instance = null;
        List expResult = null;
        List result = instance.findTrainerEntities();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
