package ro.digitalNation.fm.shopManagementProject.controllers;

import jakarta.persistence.EntityManager;
import java.util.List;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductJpaControllerNGTest {
    
    public ProductJpaControllerNGTest() {
        
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
        ProductJpaController instance = null;
        EntityManager expResult = null;
        EntityManager result = instance.getEntityManager();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testCreate() {
        System.out.println("create");
        Product product = null;
        ProductJpaController instance = null;
        instance.create(product);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testDestroy() {
        System.out.println("destroy");
        Integer id = null;
        ProductJpaController instance = null;
        instance.destroy(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   
    @Test
    public void testFindProductEntities_3args() {
        System.out.println("findProductEntities");
        boolean par = false;
        int par1 = 0;
        int par2 = 0;
        ProductJpaController instance = null;
        List expResult = null;
        List result = instance.findProductEntities(par, par1, par2);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testFindProductEntities_int_int() {
        System.out.println("findProductEntities");
        int maxResults = 0;
        int firstResult = 0;
        ProductJpaController instance = null;
        List expResult = null;
        List result = instance.findProductEntities(maxResults, firstResult);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testFindProduct() {
        System.out.println("findProduct");
        Integer id = null;
        ProductJpaController instance = null;
        instance.findProduct(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetProductCount() {
        System.out.println("getProductCount");
        ProductJpaController instance = null;
        int expResult = 0;
        int result = instance.getProductCount();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   
    @Test
    public void testFindProductEntities_0args() {
        System.out.println("findProductEntities");
        ProductJpaController instance = null;
        List expResult = null;
        List result = instance.findProductEntities();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
