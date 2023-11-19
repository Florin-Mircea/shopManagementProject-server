package ro.digitalNation.fm.shopManagementProject.beans;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvoiceNGTest {
    
    public InvoiceNGTest() {
        
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
    public void testGetSeries() {
        System.out.println("getSeries");
        Invoice instance = new Invoice();
        String expResult = "";
        String result = instance.getSeries();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   
    @Test
    public void testGetNumber() {
        System.out.println("getNumber");
        Invoice instance = new Invoice();
        Integer expResult = null;
        Integer result = instance.getNumber();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
  
    @Test
    public void testGetInvoiceLine() {
        System.out.println("getInvoiceLine");
        Invoice instance = new Invoice();
        Integer expResult = null;
        Integer result = instance.getInvoiceLine();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetSeries() {
        System.out.println("setSeries");
        String series = "";
        Invoice instance = new Invoice();
        instance.setSeries(series);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetNumber() {
        System.out.println("setNumber");
        Integer number = null;
        Invoice instance = new Invoice();
        instance.setNumber(number);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   
    @Test
    public void testSetInvoiceLine() {
        System.out.println("setInvoiceLine");
        Integer invoiceLine = null;
        Invoice instance = new Invoice();
        instance.setInvoiceLine(invoiceLine);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   
    @Test
    public void testToString() {
        System.out.println("toString");
        Invoice instance = new Invoice();
        String expResult = "";
        String result = instance.toString();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
