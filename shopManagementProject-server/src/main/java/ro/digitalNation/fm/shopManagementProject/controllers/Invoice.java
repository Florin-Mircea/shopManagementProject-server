package ro.digitalNation.fm.shopManagementProject.controllers;

import ro.digitalNation.fm.shopManagementProject.beans.*;
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
@Table(name = "invlices", catalog = "shopmanagementproject", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "clients.findAll", query = "SELECT c FROM clients c"),
    @NamedQuery(name = "clients.findById", query = "SELECT c FROM clients p WHERE c.id = :id")})
public class Invoice implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Lob
    @Column(name = "series", nullable = false, length = 65535)
    private String series;
    private Integer number;
    private Integer invoiceLine;

    public Invoice() {
        
    }

    public Invoice(String series) {
        this.series = series;
    }

    public Invoice(Integer number) {
        this.number = number;
    }

    public Invoice(String series, Integer number, Integer invoiceLine) {
        this.series = series;
        this.number = number;
        this.invoiceLine = invoiceLine;
    }

    Invoice(int i, String series, Integer number, Integer invoiceLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getSeries() {
        return series;
    }

    public Integer getNumber() {
        return number;
    }

    public Integer getInvoiceLine() {
        return invoiceLine;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setInvoiceLine(Integer invoiceLine) {
        this.invoiceLine = invoiceLine;
    }

    @Override
    public String toString() {
        return "Invoice{" + "series=" + series + ", number=" + number + ", invoiceLine=" + invoiceLine + '}';
    }    

    void getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
