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

@Bean
@Entity
@Table(name = "explorers", catalog = "trackdb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "explorers.findAll", query = "SELECT e FROM explorers e"),
    @NamedQuery(name = "explorers.findById", query = "SELECT e FROM explorers p WHERE e.id = :id"),
    @NamedQuery(name = "explorers.addExplorer", query = "INSERT INTO `trackdb`.`explorers` (`id`, `explorer`) VALUES ('', '')"),
    @NamedQuery(name = "trainers.updateExplorer", query = "UPDATE explorers SET id = `id`, explorer = `explorer` WHERE id = `id`, explorer = `explorer`"),
    @NamedQuery(name = "invoices.deleteExplorer", query = "DELETE FROM explorers WHERE id = `id`")})
public class Explorer extends Person {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Lob
    @Column(name = "explorer", nullable = false, length = 65535)
    public String explorer;

    public Explorer() {
        
    }

    public Explorer(String explorer) {
        this.explorer = explorer;
    }       

    Explorer(Integer id, String firstName, String lastName, String city, Integer age, boolean married, Integer cost, String explorer, String trainer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public String getExplorer() {
        return explorer;
    }

    public void setExplorer(String explorer) {
        this.explorer = explorer;
    }        
    
}
