package ro.digitalNation.fm.shopManagementProject.controllers;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.h2.engine.User;

@RestController
public class MainController {
    
    private static MainController singleton;
    public static MainController getInstance(){
        if(singleton == null) singleton = new MainController();
        return singleton;
    }
    private EntityManagerFactory emf;
    private UsersJpaController usersController;
    
    
    private MainController() {
        emf = Persistence.createEntityManagerFactory("shopManagementProjectPU");
        usersController = new UsersJpaController(emf);
    }
    
    User user = new User();
    
    ArrayList<User> users = new ArrayList<User>();
    
    
    @PostMapping("/")
    public void addUser(User u){
        usersController.create(new User(0, u.getUserName(), u.getPassword()));
    }
    
    @GetMapping("/")
    public ArrayList<User> getUsers() {
        List<User> usrs = usersController.findUsersEntities();
        ArrayList<User> users = new ArrayList<User>();
        usrs.forEach((u) -> {
            users.add(new User(u.getId(), u.getUserName(), u.getPassword()));
        });
        return users;
    }
    
    public void deleteUser(User u) {
        try {
            usersController.destroy(u.getId());
        } catch (NonexistentEntityException ex) {
            //Logger.getLogger(MainController.class.getUserName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateUser(User u){
        try {
            Users usrs = new Users(u.getId(), u.getUserName(), u.getPassword());
            usersController.edit(usrs);
        } //Logger.getLogger(MainController.class.getUserName()).log(Level.SEVERE, null, ex);
        catch (Exception ex) {
            //Logger.getLogger(MainController.class.getUserName()).log(Level.SEVERE, null, ex);
        }
    }
}
