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
import java.awt.event.ActionListener;
import java.io.Serializable;

@Bean
@Entity
@Table(name = "trainers", catalog = "trackdb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "trainers.findAll", query = "SELECT t FROM trainers t"),
    @NamedQuery(name = "trainers.findById", query = "SELECT t FROM trainers t WHERE t.id = :id"),
    @NamedQuery(name = "trainers.addTrainer", query = "INSERT INTO `trackdb`.`trainers` (`id`, `trainer`) VALUES ('', '')"),
    @NamedQuery(name = "trainers.updateTrainer", query = "UPDATE trainers SET id = `id`, trainer = `trainer` WHERE id = `id`, trainer = `trainer`"),
    @NamedQuery(name = "invoices.deleteTrainer", query = "DELETE FROM trainers WHERE id = `id`")})
public class Trainer extends Person implements Serializable {
    
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
            
    @Override
    public String getResponsabilities() {        
        return null;        
    }
    
    public void addActionListener(ActionListener actionListener) {
        
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
