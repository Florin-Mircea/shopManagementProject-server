package ro.digitalNation.restuflWebService;

import ro.digitalNation.restuflWebService.dbbeans.Person;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PersonNGTest {
    
    public PersonNGTest() {
        
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
    public void testGetIdentifier_0args() {
        System.out.println("getIdentifier");
        Person instance = new PersonImpl();
        String expResult = "";
        String result = instance.getIdentifier();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetIdentifier_3args() {
        System.out.println("getIdentifier");
        String explorer = "";
        String florin = "";
        String mircea = "";
        Person instance = new PersonImpl();
        String expResult = "";
        String result = instance.getIdentifier(explorer, florin, mircea);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
  
    @Test
    public void testGetResponsabilities() {
        System.out.println("getResponsabilities");
        Person instance = new PersonImpl();
        String expResult = "";
        String result = instance.getResponsabilities();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Person instance = new PersonImpl();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        Person instance = new PersonImpl();
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Person instance = new PersonImpl();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        Person instance = new PersonImpl();
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   
    @Test
    public void testGetCity() {
        System.out.println("getCity");
        Person instance = new PersonImpl();
        String expResult = "";
        String result = instance.getCity();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetCity() {
        System.out.println("setCity");
        String city = "";
        Person instance = new PersonImpl();
        instance.setCity(city);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Person instance = new PersonImpl();
        Integer expResult = null;
        Integer result = instance.getAge();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        Integer age = null;
        Person instance = new PersonImpl();
        instance.setAge(age);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   
    @Test
    public void testIsMarried() {
        System.out.println("isMarried");
        Person instance = new PersonImpl();
        boolean expResult = false;
        boolean result = instance.isMarried();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetMarried() {
        System.out.println("setMarried");
        boolean married = false;
        Person instance = new PersonImpl();
        instance.setMarried(married);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   
    @Test
    public void testGetCost() {
        System.out.println("getCost");
        Person instance = new PersonImpl();
        Integer expResult = null;
        Integer result = instance.getCost();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   
    @Test
    public void testSetCost() {
        System.out.println("setCost");
        Integer cost = null;
        Person instance = new PersonImpl();
        instance.setCost(cost);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   
    @Test
    public void testGetExplorer() {
        System.out.println("getExplorer");
        Person instance = new PersonImpl();
        String expResult = "";
        String result = instance.getExplorer();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   
    @Test
    public void testSetExplorer() {
        System.out.println("setExplorer");
        String explorer = "";
        Person instance = new PersonImpl();
        instance.setExplorer(explorer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   
    @Test
    public void testGetTrainer() {
        System.out.println("getTrainer");
        Person instance = new PersonImpl();
        String expResult = "";
        String result = instance.getTrainer();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   
    @Test
    public void testSetTrainer() {
        System.out.println("setTrainer");
        String trainer = "";
        Person instance = new PersonImpl();
        instance.setTrainer(trainer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   
    @Test
    public void testToString() {
        System.out.println("toString");
        Person instance = new PersonImpl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PersonImpl extends Person {

        public String getResponsabilities() {
            return "";
        }
    }
    
}
