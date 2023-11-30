package ro.digitalNation.fm.shopManagementProject.main;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import oracle.jdbc.driver.Message;
import org.h2.engine.User;
import ro.digitalNation.fm.shopManagementProject.controllers.Invoice;
import ro.digitalNation.fm.shopManagementProject.controllers.MainController;
import ro.digitalNation.fm.shopManagementProject.controllers.Product;
import ro.digitalNation.restuflWebService.dbbeans.Person;

public class ShopManagementProjectServerApplicationThread extends Thread {
    
    private Socket socket;
    private ObjectInputStream in;
    private ObjectOutputStream out;
    
    public ShopManagementProjectServerApplicationThread(Socket socket) throws Exception {
        this.socket = socket;
        out = new ObjectOutputStream(socket.getOutputStream());
        in = new ObjectInputStream(socket.getInputStream());
    }
    
    public void run(){
        try{
            
        Message message = new Message() {
            @Override
            public String msg(String arg0, Object arg1) {
                return null;                
            }
        };
        
        while(true){
            message = (Message) in.readObject();
            
            switch( (int) message.getCod()) {
                case Message.ADD_USER:
                    User u = (User) in.readObject();
                    MainController.getInstance().addUser(u);
                break; 
                case Message.GET_USER:
                    ArrayList<User> usersList = MainController.getInstance().getUsers();
                    out.writeObject(usersList);
                break;    
                case Message.DELETE_USER:
                    User u2 = (User) in.readObject();
                    MainController.getInstance().deleteUser(u2);
                break;  
                case Message.UPDATE_USER:
                    User u3 = (User) in.readObject();
                    MainController.getInstance().updateUser(u3);
                break;     
                
                case Message.ADD_PERSON:
                    Person pers = (Person) in.readObject();
                    MainController.getInstance().addPerson(pers);
                break; 
                case Message.GET_PERSON:
                    ArrayList<Person> personsList = MainController.getInstance().getPersons();
                    out.writeObject(personsList);
                break;    
                case Message.DELETE_PERSON:
                    Person pers2 = (Person) in.readObject();
                    MainController.getInstance().deletePerson(pers2);
                break;  
                case Message.UPDATE_PERSON:
                    Person pers3 = (Person) in.readObject();
                    MainController.getInstance().updatePerson(pers3);
                break;   
                
                case Message.ADD_PRODUCT:
                    Product p = (Product) in.readObject();
                    MainController.getInstance().addProduct(p);
                break; 
                case Message.GET_PRODUCT:
                    ArrayList<Product> productsList = MainController.getInstance().getProducts();
                    out.writeObject(productsList);
                break;    
                case Message.DELETE_PRODUCT:
                    Product p2 = (Product) in.readObject();
                    MainController.getInstance().deleteProduct(p2);
                break;  
                case Message.UPDATE_PRODUCT:
                    Product p3 = (Product) in.readObject();
                    MainController.getInstance().updateProduct(p3);
                break;   
                
                case Message.ADD_INVOICE:
                    Invoice i = (Invoice) in.readObject();
                    MainController.getInstance().addInvoice(i);
                break; 
                case Message.GET_INVOICE:
                    ArrayList<Invoice> invoicesList = MainController.getInstance().getInvoices();
                    out.writeObject(invoicesList);
                break;    
                case Message.DELETE_INVOICE:
                    Invoice i2 = (Invoice) in.readObject();
                    MainController.getInstance().deleteInvoice(i2);
                break;  
                case Message.UPDATE_INVOICE:
                    Invoice i3 = (Invoice) in.readObject();
                    MainController.getInstance().updateInvoice(i3);
                break;   
            }
        }
        
        } catch(Exception e) {
            System.out.println("Exception");
        }
    }
}
