package ro.digitalNation.fm.shopManagementProject.controllers;

import jakarta.persistence.EntityManager;
import java.util.List;
import org.h2.engine.User;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ro.digitalNation.fm.shopManagementProject.beans.User;

public class UserJpaControllerNGTest {
    
    public UserJpaControllerNGTest() {
        
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
        UserJpaController instance = null;
        EntityManager expResult = null;
        EntityManager result = instance.getEntityManager();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testCreate() {
        System.out.println("create");
        User user = null;
        UserJpaController instance = null;
        UserJpaController.create(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testEdit() {
        System.out.println("edit");
        User user = null;
        UserJpaController instance = null;
        instance.edit(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testDestroy() {
        System.out.println("destroy");
        Integer id = null;
        UserJpaController instance = null;
        instance.destroy(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testFindUserEntities_0args() {
        System.out.println("findUserEntities");
        UserJpaController instance = null;
        List expResult = null;
        List result = instance.findUserEntities();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   
    @Test
    public void testFindUserEntities_int_int() {
        System.out.println("findUserEntities");
        int maxResults = 0;
        int firstResult = 0;
        UserJpaController instance = null;
        List expResult = null;
        List result = instance.findUserEntities(maxResults, firstResult);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   
    @Test
    public void testFindUser() {
        System.out.println("findUser");
        Integer id = null;
        UserJpaController instance = null;
        instance.findUser(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetUserCount() {
        System.out.println("getUserCount");
        UserJpaController instance = null;
        int expResult = 0;
        int result = instance.getUserCount();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
