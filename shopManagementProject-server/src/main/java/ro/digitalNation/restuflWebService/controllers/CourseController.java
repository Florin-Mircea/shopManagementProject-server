package ro.digitalNation.restuflWebService.controllers;

import jakarta.persistence.EntityManager;
import java.util.List;

@Autowired
public interface CourseController extends CrudRepository {
    public EntityManager getEntityManager();
    public void create(Course course);
    public void edit(Course course);
    public void destroy(Integer id);
    public List<Course> findCourseEntities();
    public List<Course> findCourseEntities(int maxResults, int firstResult);
    public List<Course> findCourseEntities(boolean all, int maxResults, int firstResult);
    public Trainer findCourse(Integer id);
    public int getCourseCount();
}
