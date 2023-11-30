package ro.digitalNation.fm.shopManagementProject.controllers;

import ch.qos.logback.core.model.Model;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.h2.engine.User;
import ro.digitalNation.fm.shopManagementProject.beans.User;

@Controller
//@RestController
public class MainController {
    
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);
    
    public static final String PROP_USER = "user";  
    public static final String PROP_PERSON = "person";
    public static final String PROP_PRODUCT = "product";
    
    private static MainController singleton;
    
    public static MainController getInstance() {
        if(singleton == null) singleton = new MainController();
        return singleton;
    }
    
    private EntityManagerFactory emf;
    private UserJpaController userController;   
    private PersonJpaController personController;
    private ProductJpaController productController;
    private InvoiceJpaController invoiceController;
    
    public MainController() {
        emf = Persistence.createEntityManagerFactory("shopmanagementprojectPU");
        userController = new UserJpaController(emf);
        personController = new PersonJpaController(emf);
        productController = new ProductJpaController(emf);
        invoiceController = new InvoiceJpaController(emf);
    }
    
    User user = new User();
    Person person = new Person() {
        @Override
        public String getResponsabilities() {
            return null;            
        }
    };
    Product product = new Product();
    Invoice invoice = new Invoice();        
    
    ArrayList<User> users = new ArrayList<User>();    
    ArrayList<Person> persons = new ArrayList<Person>();  
    ArrayList<Product> products = new ArrayList<Product>();
    ArrayList<Invoice> invoices = new ArrayList<Invoice>();
    
    /**
     *
     * @param u
     */
        
    @GetMapping("/")
    public ArrayList<User> getUsers(@RequestParam(name="userName", required=false)) {        
        List<User> usrs = userController.findUserEntities();
        ArrayList<User> users = new ArrayList<User>();
        usrs.forEach((u) -> {
            users.add(new User(u.getId(), u.getUserName(), u.getPassword()));
        });
        return users;
    }
    
    @PostMapping("/addUser")
    public void addUser(org.h2.engine.User u) {        
        userController.create(new User(0, u.getUserName(), u.getPassword()));
    }
    
    @GetMapping("/")
    public ArrayList<ro.digitalNation.restuflWebService.dbbeans.Person> getPersons(@RequestParam(name="firstName", required=false)) {        
        List<Person> pers = personController.findPersonEntities();
        ArrayList<Person> persons = new ArrayList<Person>();
        pers.forEach((p) -> {
            persons.add(new Person(p.getId(), p.getFirstName(), p.getLastName(), p.getCity(), p.getAge(), p.isMarried(), p.getCost(), p.getExplorer(), p.getTrainer()) {
                @Override
                public String getResponsabilities() {
                    return null;                    
                }
            });
        });
        return persons;
    }
    
    @PostMapping("/addPerson")
    public void addPerson(ro.digitalNation.restuflWebService.dbbeans.Person pers) {        
        personController.create(new Person(pers.getId(), pers.getFirstName(), pers.getLastName(), pers.getCity(), pers.getAge(), pers.isMarried(), pers.getCost(), pers.getExplorer(), pers.getTrainer()) {
            @Override
            public String getResponsabilities() {
                return null;                
            }
        });
    }
    
    @DeleteMapping
    public void deletePerson(ro.digitalNation.restuflWebService.dbbeans.Person pers2) {
        personController.destroy(pers2.getId()); 
    }
    
    @UpdateMapping
    public void updatePerson(ro.digitalNation.restuflWebService.dbbeans.Person pers3){
        try {
            Person person = new Person(pers3.getId(), pers3.getFirstName(), pers3.getLastName(), pers3.getCity(), pers3.getAge(), pers3.isMarried(), pers3.getCost(), pers3.getExplorer(), pers3.getTrainer()) {
                @Override
                public String getResponsabilities() {
                    return null;                    
                }
            };
            personController.edit(person);
        } catch (Exception ex) {
            System.out.println("Exception");
        }
    }
    
    @GetMapping("/")
    public ArrayList<Product> getProducts(@RequestParam(name="productName", required=false)) {        
        List<Product> prods = productController.findProductEntities();
        ArrayList<Product> products = new ArrayList<Product>();
        prods.forEach((p) -> {
            products.add(new Product(p.getId(), p.getProductName(), p.getSeries(), p.getPrice()));
        });
        return (ArrayList<Product>) prods;
    }
    
    @PostMapping("/addProduct")
    public void addProduct(@ModelAttribute Product p) {        
        productController.create(new Product(0, p.getProductName(), p.getSeries(), p.getPrice()));
    }
    
    @DeleteMapping
    public void deleteProduct(Product p2) {
        productController.destroy(p2.getId()); 
    }
    
    @UpdateMapping
    public void updateProduct(Product p3){
        try {
            Product product = new Product(p3.getId(), p3.getProductName(), p3.getSeries(), p3.getPrice());
            productController.edit(product);                      
        } catch (Exception ex) {
            System.out.println("Exception");
        }
    }
    
    @GetMapping("/")
    public ArrayList<Invoice> getInvoices(@RequestParam(name="series", required=false)) {        
        List<Invoice> invs = invoiceController.findInvoiceEntities();
        ArrayList<Invoice> invoices = new ArrayList<Invoice>();
        invs.forEach((i) -> {
            invoices.add(new Invoice(i.getId(), i.getSeries(), i.getNumber(), i.getInvoiceLine()));
        });
        return invoices;
    }
    
    @PostMapping("/addInvoice")
    public void addInvoice(@ModelAttribute Invoice i) {        
        invoiceController.create(new Invoice(0, i.getSeries(), i.getNumber(), i.getInvoiceLine()));
    }
    
    @DeleteMapping
    public void deleteInvoice(Invoice i2) {
        invoiceController.destroy(i2.getId()); 
    }
    
    @UpdateMapping
    public void updateInvoice(Invoice i3){
        try {
            Invoice invoice = new Invoice(i3.getId(), i3.getSeries(), i3.getNumber(), i3.getInvoiceLine());
            invoiceController.edit(invoice);                     
        } catch (Exception ex) {
            System.out.println("Exception");
        }
    }
    
    @DeleteMapping
    public void deleteUser(org.h2.engine.User u2) {
        userController.destroy(u2.getId()); 
    }
    
    @UpdateMapping
    public void updateUser(org.h2.engine.User u3){
        try {
            User user = new User(u3.getId(), u3.getUserName(), u3.getPassword());
            userController.edit(user);
        } catch (Exception ex) {
            System.out.println("Exception");
        }
    }

    /**
     * @return the user
     */
    
    public User getUser() {
        return user;
    }
    
    public void getProducts() {
        
    }

    /**
     * @param user the user to set
     */
    
    public void setUser(User user) {
        User oldUser = this.user;
        this.user = user;
        propertyChangeSupport.firePropertyChange(PROP_USER, oldUser, user);
    }
                                          
}
