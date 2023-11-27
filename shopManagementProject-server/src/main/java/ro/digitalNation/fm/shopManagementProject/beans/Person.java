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
@Table(name = "persons", catalog = "trackdb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "persons.findAll", query = "SELECT p FROM persons p"),
    @NamedQuery(name = "persons.findById", query = "SELECT p FROM persons p WHERE p.id = :id")})
public abstract class Person implements Serializable {
    
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
    @Column(name = "city", nullable = false, length = 65535)
    private String city;
    @Basic(optional = false)
    @Lob
    @Column(name = "age", nullable = false, length = 65535)
    private Integer age;
    @Basic(optional = false)
    @Lob
    @Column(name = "married", nullable = false, length = 65535)
    private boolean married;
    @Basic(optional = false)
    @Lob
    @Column(name = "cost", nullable = false, length = 65535)
    private Integer cost;
    @Basic(optional = false)
    @Lob
    @Column(name = "explorer", nullable = false, length = 65535)
    private String explorer;
    @Basic(optional = false)
    @Lob
    @Column(name = "trainer", nullable = false, length = 65535)
    private String trainer;

    public Person() {
        
    }

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public Person(Integer age) {
        this.age = age;
    }

    public Person(boolean married) {
        this.married = married;
    }

    public Person(String firstName, String lastName, String city, Integer age, boolean married, Integer cost, String explorer, String trainer) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.age = age;
        this.married = married;
        this.cost = cost;
        this.explorer = explorer;
        this.trainer = trainer;
    }        

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }        
    
    public String getIdentifier() {
	return firstName.toLowerCase().replaceAll(" ", "").replaceAll("-", "") + "_" + lastName.toUpperCase().replaceAll(" ", "").replaceAll("-", "") ;
	}
    
    public String getIdentifier(String explorer, String florin, String mircea) {
        return explorer.toLowerCase().replaceAll(" ", "").replaceAll("-", "") + "_" + firstName.toLowerCase().replaceAll(" ", "").replaceAll("-", "") + "_" + lastName.toUpperCase().replaceAll(" ", "").replaceAll("-", "") ;
        }
	
    public abstract String getResponsabilities(); 

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getExplorer() {
        return explorer;
    }

    public void setExplorer(String explorer) {
        this.explorer = explorer;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    @Override
    public String toString() {
        return "Person{" + "firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", age=" + age + ", married=" + married + ", cost=" + cost + ", explorer=" + explorer + ", trainer=" + trainer + '}';
    }           
    
}
