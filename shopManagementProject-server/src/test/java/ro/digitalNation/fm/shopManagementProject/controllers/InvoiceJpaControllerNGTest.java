package ro.digitalNation.fm.shopManagementProject.controllers;

import jakarta.persistence.EntityManager;
import java.util.List;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvoiceJpaControllerNGTest {
    
    public InvoiceJpaControllerNGTest() {
        
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
        InvoiceJpaController instance = null;
        EntityManager expResult = null;
        EntityManager result = instance.getEntityManager();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   
    @Test
    public void testCreate() {
        System.out.println("create");
        Invoice invoice = null;
        InvoiceJpaController instance = null;
        instance.create(invoice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testDestroy() {
        System.out.println("destroy");
        Integer id = null;
        InvoiceJpaController instance = null;
        instance.destroy(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testFindInvoiceEntities_3args() {
        System.out.println("findInvoiceEntities");
        boolean par = false;
        int par1 = 0;
        int par2 = 0;
        InvoiceJpaController instance = null;
        List expResult = null;
        List result = instance.findInvoiceEntities(par, par1, par2);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testFindInvoiceEntities_int_int() {
        System.out.println("findInvoiceEntities");
        int maxResults = 0;
        int firstResult = 0;
        InvoiceJpaController instance = null;
        List expResult = null;
        List result = instance.findInvoiceEntities(maxResults, firstResult);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testFindInvoice() {
        System.out.println("findInvoice");
        Integer id = null;
        InvoiceJpaController instance = null;
        instance.findInvoice(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetInvoiceCount() {
        System.out.println("getInvoiceCount");
        InvoiceJpaController instance = null;
        int expResult = 0;
        int result = instance.getInvoiceCount();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testFindInvoiceEntities_0args() {
        System.out.println("findInvoiceEntities");
        InvoiceJpaController instance = null;
        List expResult = null;
        List result = instance.findInvoiceEntities();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
