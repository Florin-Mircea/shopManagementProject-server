package ro.digitalNation.restuflWebService.controllers;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import java.util.List;

public class TrainerJpaController {
    
    public TrainerJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Trainer trainer) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(trainer);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public void edit(Trainer trainer) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            trainer = em.merge(trainer);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = trainer.getId();
                if (findTrainer(id) == null) {
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
            Trainer trainer = null;
            try {
                trainer = em.getReference(Trainer.class, id);
                trainer.getId();
            } catch (EntityNotFoundException enfe) {
                
            }
            em.remove(trainer);
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
    private List<Trainer> findTrainerEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Trainer.class));
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

    public Trainer findTrainer(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Trainer.class, id);
        } finally {
            em.close();
        }
    }

    public int getTrainerCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Trainer> rt = cq.from(Trainer.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    List<Trainer> findTrainerEntities() {
        return null;
        
    }
}
