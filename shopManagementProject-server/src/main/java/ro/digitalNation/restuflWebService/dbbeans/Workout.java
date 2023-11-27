package ro.digitalNation.restuflWebService.dbbeans;

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

@Bean
@Entity
@Table(name = "workouts", catalog = "trackdb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "workouts.findAll", query = "SELECT w FROM workouts w"),
    @NamedQuery(name = "workouts.findById", query = "SELECT w FROM workouts w WHERE w.id = :id")})
public class Workout implements Activity {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Lob
    @Column(name = "activOne", nullable = false, length = 65535)
    private String activOne;
    @Basic(optional = false)
    @Lob
    @Column(name = "activTwo", nullable = false, length = 65535)
    private String activTwo;

    public Workout() {
        
    }

    public Workout(String activOne) {
        this.activOne = activOne;
    }

    public Workout(String activOne, String activTwo) {
        this.activOne = activOne;
        this.activTwo = activTwo;
    }        

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }        
    
    @Override
    public String getDescribe() {        
        return null;        
    }

    @Override
    public String getDuration() {        
        return null;        
    }

    public String getActivOne() {
        return activOne;
    }

    public void setActivOne(String activOne) {
        this.activOne = activOne;
    }

    public String getActivTwo() {
        return activTwo;
    }

    public void setActivTwo(String activTwo) {
        this.activTwo = activTwo;
    }

    @Override
    public String toString() {
        return "Workout{" + "activOne=" + activOne + ", activTwo=" + activTwo + '}';
    }        
}
