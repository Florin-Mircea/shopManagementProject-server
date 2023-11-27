package ro.digitalNation.fm.shopManagementProject.beans;

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
@Table(name = "clients", catalog = "shopmanagementproject", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "clients.findAll", query = "SELECT c FROM clients c"),
    @NamedQuery(name = "clients.findById", query = "SELECT c FROM clients p WHERE c.id = :id")})
public class Client implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Lob
    @Column(name = "firstName", nullable = false, length = 65535)
    private String firstName;
    @Basic(optional = false)
    @Lob
    @Column(name = "lastName", nullable = false, length = 65535)
    private String lastName;
    @Basic(optional = false)
    @Lob
    @Column(name = "cnp", nullable = false, length = 65535)
    private String cnp;

    public Client() {
        
    }

    public Client(String firstName) {
        this.firstName = firstName;
    }

    public Client(String firstName, String lastName, String cnp) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cnp = cnp;
    }

    public Client(Integer id, String firstName, String lastName, String cnp) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cnp = cnp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
        
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCnp() {
        return cnp;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    @Override
    public String toString() {
        return "Client{" + "firstName=" + firstName + ", lastName=" + lastName + ", cnp=" + cnp + '}';
    }
        
}
