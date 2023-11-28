package ro.digitalNation.restuflWebService.controllers;

import jakarta.persistence.EntityManager;
import java.util.List;
import ro.digitalNation.fm.shopManagementProject.controllers.Product;

@Autowired
public interface TrainerController extends CrudRepository {
    public EntityManager getEntityManager();
    public void create(Trainer trainer);
    public void edit(Trainer trainer);
    public void destroy(Integer id);
    public List<Trainer> findTrainerEntities();
    public List<Trainer> findTrainerEntities(int maxResults, int firstResult);
    public List<Trainer> findTrainerEntities(boolean all, int maxResults, int firstResult);
    public Trainer findTrainer(Integer id);
    public int getTrainerCount();
}
