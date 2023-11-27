package ro.digitalNation.fm.shopManagementProject.controllers;

import jakarta.persistence.EntityManager;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PersonJpaControllerNGTest {
    
    public PersonJpaControllerNGTest() {
        
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
        PersonJpaController instance = null;
        EntityManager expResult = null;
        EntityManager result = instance.getEntityManager();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testCreate() {
        System.out.println("create");
        Person person = null;
        PersonJpaController instance = null;
        instance.create(person);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testEdit() {
        System.out.println("edit");
        Person person = null;
        PersonJpaController instance = null;
        instance.edit(person);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testDestroy() {
        System.out.println("destroy");
        Integer id = null;
        PersonJpaController instance = null;
        instance.destroy(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testFindPerson() {
        System.out.println("findPerson");
        Integer id = null;
        PersonJpaController instance = null;
        instance.findPerson(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetPersonCount() {
        System.out.println("getPersonCount");
        PersonJpaController instance = null;
        int expResult = 0;
        int result = instance.getPersonCount();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
