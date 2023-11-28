package ro.digitalNation.restuflWebService.controllers;

import jakarta.persistence.EntityManager;
import java.util.List;
import ro.digitalNation.fm.shopManagementProject.beans.User;
import ro.digitalNation.fm.shopManagementProject.controllers.Product;

@Autowired
public interface ExplorerController extends CrudRepository {
    public EntityManager getEntityManager();
    public void create(Explorer explorer);
    public void edit(Explorer explorer);
    public void destroy(Integer id);
    public List<Explorer> findExplorerEntities();
    public List<Explorer> findExplorerEntities(int maxResults, int firstResult);
    public List<Explorer> findExplorerEntities(boolean all, int maxResults, int firstResult);
    public Product findExplorer(Integer id);
    public int getExplorerCount();
}
