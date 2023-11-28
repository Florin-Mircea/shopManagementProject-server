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
@Table(name = "users", catalog = "shopmanagementproject", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "users.findAll", query = "SELECT u FROM users u"),
    @NamedQuery(name = "users.findById", query = "SELECT u FROM users u WHERE u.id = :id"),
    @NamedQuery(name = "users.addUser", query = "INSERT INTO `shopmanagementproject`.`users` (`id`, `username`, `password`) VALUES ('', '', '')"),
    @NamedQuery(name = "updateUser", query = "UPDATE users SET id = `id`, username = `username`, password = `password` WHERE id = `id`, username = `username`, password = `password` "),
    @NamedQuery(name = "deleteUser", query = "DELETE FROM users WHERE id = `id`")})
public class User implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Lob
    @Column(name = "userName", nullable = false, length = 65535)
    private String userName;
    @Basic(optional = false)
    @Lob
    @Column(name = "password", nullable = false, length = 65535)
    private String password;

    public User() {
        
    }

    public User(String userName) {
        this.userName = userName;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public User(Integer id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }        

    public User(int i, String userName, String password) {
        
    }        

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "userName=" + userName + ", password=" + password + '}';
    }

    public int getId() {
        return id;
    }
        
}
