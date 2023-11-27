package ro.digitalNation.restuflWebService.controllers;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import java.util.List;

@Controller
public class RushJpaController {
    
    public RushJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Rush rush) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(rush);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public void edit(Rush rush) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            trainer = em.merge(rush);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = rush.getId();
                if (findRush(id) == null) {
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
            Rush rush = null;
            try {
                rush = em.getReference(Rush.class, id);
                rush.getId();
            } catch (EntityNotFoundException enfe) {
                
            }
            em.remove(rush);
            em.getTransaction().commit();
 
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    private List<Rush> findRushEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Rush.class));
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

    public Rush findRush(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Rush.class, id);
        } finally {
            em.close();
        }
    }

    public int getRushCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Rush> rt = cq.from(Rush.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    List<Rush> findRushEntities() {
        return null;
        
    }
}
