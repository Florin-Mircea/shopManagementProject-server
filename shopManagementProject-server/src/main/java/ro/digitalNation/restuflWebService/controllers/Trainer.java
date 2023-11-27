package ro.digitalNation.restuflWebService.controllers;

import ro.digitalNation.restuflWebService.dbbeans.*;
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
import java.awt.event.ActionListener;

@Bean
@Entity
@Table(name = "trainers", catalog = "trackdb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "trainers.findAll", query = "SELECT t FROM trainers t"),
    @NamedQuery(name = "trainers.findById", query = "SELECT t FROM trainers t WHERE t.id = :id")})
public class Trainer extends Person {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Lob
    @Column(name = "trainer", nullable = false, length = 65535)
    public String trainer;        

    public Trainer() {
        
    }

    public Trainer(String trainer) {
        this.trainer = trainer;
    }                

    Trainer(Integer id, String firstName, String lastName, String city, Integer age, boolean married, Integer cost, String explorer, String trainer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getResponsabilities() {        
        return null;        
    }
    
    public void addActionListener(ActionListener actionListener) {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }        

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    @Override
    public String toString() {
        return "Trainer{" + "trainer=" + trainer + '}';
    }            
    
}
