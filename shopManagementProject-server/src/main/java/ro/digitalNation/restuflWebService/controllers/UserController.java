package ro.digitalNation.restuflWebService.controllers;

import jakarta.persistence.EntityManager;
import java.util.List;
import ro.digitalNation.fm.shopManagementProject.beans.User;

@Autowired
public interface UserController extends CrudRepository {
    
    public EntityManager getEntityManager();
    public void create(User user);
    public void edit(User user);
    public void destroy(Integer id);
    public List<User> findUserEntities();
    public List<User> findUserEntities(int maxResults, int firstResult);
    public List<User> findUserEntities(boolean all, int maxResults, int firstResult);
    public User findUser(Integer id);
    public int getUserCount();
}
