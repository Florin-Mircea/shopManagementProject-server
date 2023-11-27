package ro.digitalNation.restuflWebService.controllers;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import java.util.List;

@Controller
public class ExplorerJpaController {
    
    public ExplorerJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Explorer explorer) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(explorer);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public void edit(Explorer explorer) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            explorer = em.merge(explorer);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = explorer.getId();
                if (findExplorer(id) == null) {
                    //return null;
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Explorer explorer = null;
            try {
                explorer = em.getReference(Explorer.class, id);
                explorer.getId();
            } catch (EntityNotFoundException enfe) {
                
            }
            em.remove(explorer);
            em.getTransaction().commit();
 
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    /*
    public List<Trainer> findTrainerEntities(boolean par, int par1, int par2) {
        return findTrainerEntities(true, -1, -1);
    }
    */
    /*
    public List<Trainer> findTrainerEntities(int maxResults, int firstResult) {
        return findTrainerEntities(false, maxResults, firstResult);
    }
    */
    private List<Explorer> findExplorerEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Explorer.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Explorer findExplorer(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Explorer.class, id);
        } finally {
            em.close();
        }
    }

    public int getExplorerCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Explorer> rt = cq.from(Explorer.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    List<Explorer> findExplorerEntities() {
        return null;
        
    }
    
}
