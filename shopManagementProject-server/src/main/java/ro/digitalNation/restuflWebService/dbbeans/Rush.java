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
import java.io.Serializable;

@Bean
@Entity
@Table(name = "rushes", catalog = "trackdb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "rushes.findAll", query = "SELECT r FROM rushes r"),
    @NamedQuery(name = "rushes.findById", query = "SELECT r FROM materials r WHERE r.id = :id"),
    @NamedQuery(name = "rushes.addRush", query = "INSERT INTO `trackdb`.`rushes` (`id`, `activOne`, `activTwo`) VALUES ('', '', '')"),
    @NamedQuery(name = "rushes.updateRush", query = "UPDATE rushes SET id = `id`, activOne = `activOne`, activTwo = `activTwo` WHERE id = `id`, activOne = `activOne`, activTwo = `activTwo`"),
    @NamedQuery(name = "rushes.deleteRush", query = "DELETE FROM rushes WHERE id = `id`")})
public class Rush implements Activity, Serializable  {
    
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

    public Rush() {
        
    }

    public Rush(String activOne) {
        this.activOne = activOne;
    }

    public Rush(String activOne, String activTwo) {
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
        return "Rush{" + "activOne=" + activOne + ", activTwo=" + activTwo + '}';
    }            
}
