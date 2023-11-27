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
@Table(name = "invoicelines", catalog = "shopmanagementproject", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "invoicelines.findAll", query = "SELECT il FROM invoicelines il"),
    @NamedQuery(name = "invoicelines.findById", query = "SELECT il FROM invoicelines il WHERE il.id = :id")})
public class InvoiceLine implements Serializable {
    
     private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Lob
    @Column(name = "productName", nullable = false, length = 65535)
    private String productName;
    @Basic(optional = false)
    @Lob
    @Column(name = "quantity", nullable = false, length = 65535)
    private Integer quantity;
    @Basic(optional = false)
    @Lob
    @Column(name = "price", nullable = false, length = 65535)
    private double price;

    public InvoiceLine() {
        
    }

    public InvoiceLine(String productName) {
        this.productName = productName;
    }

    public InvoiceLine(Integer quantity) {
        this.quantity = quantity;
    }

    public InvoiceLine(double price) {
        this.price = price;
    }

    public InvoiceLine(String productName, Integer quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
        
    public String getProductName() {
        return productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "InvoiceLine{" + "productName=" + productName + ", quantity=" + quantity + ", price=" + price + '}';
    }
        
}
