package ro.digitalNation.fm.shopManagementProject.controllers;

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
import ro.digitalNation.fm.shopManagementProject.beans.*;

@Bean
@Entity
@Table(name = "products", catalog = "shopmanagementproject", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "products.findAll", query = "SELECT p FROM products p"),
    @NamedQuery(name = "products.findById", query = "SELECT p FROM products p WHERE p.id = :id")})
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

    Product(int i, String productName, String series, double price) {
        
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

    void getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
