package ro.digitalNation.fm.shopManagementProject.main;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import oracle.jdbc.driver.Message;
import org.h2.engine.User;

public class ShopManagementProjectServerApplicationThread extends Thread {
    
    private Socket socket;
    private ObjectInputStream in;
    private ObjectOutputStream out;
    
    public ShopManagementProjectServerApplicationThread(Socket socket) throws Exception{
        this.socket = socket;
        out = new ObjectOutputStream(socket.getOutputStream());
        in = new ObjectInputStream(socket.getInputStream());
    }
    
    public void run(){
        try{
            
        Message message;
        
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
            }
        }
        
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
