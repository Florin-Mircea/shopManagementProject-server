package ro.digitalNation.restuflWebService.controllers;

import jakarta.persistence.EntityManager;
import java.util.List;
import ro.digitalNation.fm.shopManagementProject.beans.User;
import ro.digitalNation.restuflWebService.dbbeans.Material;

@Autowired
public interface MaterialController {
    public EntityManager getEntityManager();
    public void create(Material material);
    public void edit(Material material);
    public void destroy(Integer id);
    public List<Material> findMaterialEntities();
    public List<Material> findMaterialEntities(int maxResults, int firstResult);
    public List<Material> findMaterialEntities(boolean all, int maxResults, int firstResult);
    public Material findMaterial(Integer id);
    public int getMaterialCount();
}
