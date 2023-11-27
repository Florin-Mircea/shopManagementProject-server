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

@Bean
@Entity
@Table(name = "activs", catalog = "trackdb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "activs.findAll", query = "SELECT a FROM activs a"),
    @NamedQuery(name = "activs.findById", query = "SELECT a FROM activs a WHERE a.id = :id")})
public class Activ implements Activity {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;

    public Activ() {
        
    }

    public Activ(Integer id) {
        this.id = id;
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
    
}
