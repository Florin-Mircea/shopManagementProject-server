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
@Table(name = "messages", catalog = "shopmanagementproject", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "messages.findAll", query = "SELECT m FROM messages m"),
    @NamedQuery(name = "messages.findById", query = "SELECT m FROM messages m WHERE m.id = :id")})
public class Message implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Lob
    @Column(name = "code", nullable = false, length = 65535)
    private int code;

    public Message() {
        
    }

    public Message(int code) {
        this.code = code;
    }

    public Message(Integer id, int code) {
        this.id = id;
        this.code = code;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }        

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Message{" + "code=" + code + '}';
    }    
        
}
