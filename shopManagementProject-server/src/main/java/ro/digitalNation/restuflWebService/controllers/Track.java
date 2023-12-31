package ro.digitalNation.restuflWebService.controllers;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import ro.digitalNation.restuflWebService.dbbeans.*;
import java.util.ArrayList;

@Bean
@Entity
@Table(name = "tracks", catalog = "trackdb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "tracks.findAll", query = "SELECT tr FROM tracks tr"),
    @NamedQuery(name = "tracks.findById", query = "SELECT tr FROM tracks t WHERE tr.id = :id")})
public class Track implements Serializable {
        
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Lob
    @Column(name = "trainer", nullable = false, length = 65535)
    private String trainer;
    @Basic(optional = false)
    @Lob
    @Column(name = "explorer", nullable = false, length = 65535)
    private String explorer;
    
        Course course = new Course();
        Explorer explorer = new Explorer();
        Trainer trainer = new Trainer();
        Activ activ = new Activ();
        
        ArrayList<Course> courses = new ArrayList<Course>();
        //private ArrayList<Explorer> explorers = new ArrayList<Explorer>();
        //private ArrayList<Trainer> trainers = new ArrayList<Trainer>();
        ArrayList<Activ> activities = new ArrayList<Activ>();
        
        
        public ArrayList<Course> getTrackCourses()  {
            int numCourses = courses.size();   
            for(int i = 0; i < numCourses; i++)    {                                  
                    System.out.println(courses.get(i).getDescribe() + "   " + courses.get(i).getDuration());                  
            }             
            
            return courses;
        }
        
        
        
        ArrayList<Trainer> trainers = new ArrayList<>();
        ArrayList<Explorer> explorers = new ArrayList<>();        
        
        //Trainer trainer = new Trainer();
        //Explorer explorer = new Explorer();                    
        //private String course;
    

    public Track() {
        
    }       

    Track(long incrementAndGet, String format) {
        
    }
    
    public record Track(long id, String content) {        
        return null;        
    }

    public Track(String trainer, String explorer) {
        this.trainer = trainer;
        this.explorer = explorer;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public String getExplorer() {
        return explorer;
    }

    public void setExplorer(String explorer) {
        this.explorer = explorer;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Activ getActiv() {
        return activ;
    }

    public void setActiv(Activ activ) {
        this.activ = activ;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public ArrayList<Explorer> getExplorers() {
        return explorers;
    }

    public void setExplorers(ArrayList<Explorer> explorers) {
        this.explorers = explorers;
    }

    public ArrayList<Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(ArrayList<Trainer> trainers) {
        this.trainers = trainers;
    }

    public ArrayList<Activ> getActivities() {
        return activities;
    }

    public void setActivities(ArrayList<Activ> activities) {
        this.activities = activities;
    }

    @Override
    public String toString() {
        return "Track{" + "trainer=" + trainer + ", explorer=" + explorer + ", course=" + course + ", activ=" + activ + ", courses=" + courses + ", explorers=" + getExplorers() + ", trainers=" + getTrainers() + ", activities=" + activities + '}';
    }            
}
