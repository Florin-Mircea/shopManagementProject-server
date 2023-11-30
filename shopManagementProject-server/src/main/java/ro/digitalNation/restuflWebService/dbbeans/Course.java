package ro.digitalNation.restuflWebService.dbbeans;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

@Bean
@Entity
@Table(name = "courses", catalog = "trackdb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "courses.findAll", query = "SELECT c FROM courses c"),
    @NamedQuery(name = "courses.findById", query = "SELECT c FROM courses c WHERE c.id = :id")})
public class Course implements Activity, Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    
    Explorer explorer = new Explorer();
    Trainer trainer = new Trainer();
    
    ArrayList<Explorer> explorers = new ArrayList<Explorer>();
    ArrayList<Trainer> trainers = new ArrayList<Trainer>();
    ArrayList<Activ> activs = new ArrayList<Activ>();
    HashMap<String, String> activities = new HashMap<String, String>();
    
    Person p = new Person() {
        @Override
        public String getResponsabilities() {            
            return null;            
        }
    };    

    public Course() {
        
    }        

    public Course(Integer id) {
        this.id = id;
    }     

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }        
    
    @Override
    public String getDescribe() {        
        return null;        
    }

    @Override
    public String getDuration() {        
        return null;        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Explorer getExplorer() {
        return explorer;
    }

    public void setExplorer(Explorer explorer) {
        this.explorer = explorer;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
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

    public ArrayList<Activ> getActivs() {
        return activs;
    }

    public void setActivs(ArrayList<Activ> activs) {
        this.activs = activs;
    }

    public HashMap<String, String> getActivities() {
        return activities;
    }

    public void setActivities(HashMap<String, String> activities) {
        this.activities = activities;
    }

    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }        
    
}
