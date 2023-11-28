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
@Table(name = "products", catalog = "shopmanagementproject", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "products.findAll", query = "SELECT p FROM products p"),
    @NamedQuery(name = "products.findById", query = "SELECT p FROM products p WHERE p.id = :id"),
    @NamedQuery(name = "products.addProduct", query = "INSERT INTO `shopmanagementproject`.`products` (`id`, `productName`, `series`, `cost`) VALUES ('', '', '', '')"),
    @NamedQuery(name = "products.updateProduct", query = "UPDATE products SET id = `id`, productName = `productName`, series = `series`, cost = `cost` WHERE id = `id`, productName = `productName`, series = `series`, cost = `cost`"),
    @NamedQuery(name = "products.deleteProduct", query = "DELETE FROM products WHERE id = `id`")})
public class Product implements Serializable {
    
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
    @Column(name = "series", nullable = false, length = 65535)
    private String series;
    @Basic(optional = false)
    @Lob
    @Column(name = "price", nullable = false, length = 65535)
    private double price;

    public Product() {
        
    }

    public Product(String productName) {
        this.productName = productName;
    }

    public Product(double price) {
        this.price = price;
    }

    public Product(String productName, String series, double price) {
        this.productName = productName;
        this.series = series;
        this.price = price;
    }

    public Product(Integer id, String productName, String series, double price) {
        this.id = id;
        this.productName = productName;
        this.series = series;
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

    public String getSeries() {
        return series;
    }

    public double getPrice() {
        return price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "productName=" + productName + ", series=" + series + ", price=" + price + '}';
    }
        
}
