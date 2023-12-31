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
@Table(name = "invoices", catalog = "shopmanagementproject", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "invoices.findAll", query = "SELECT i FROM invoices i"),
    @NamedQuery(name = "invoices.findById", query = "SELECT i FROM invoices i WHERE i.id = :id"),
    @NamedQuery(name = "invoices.addInvoice", query = "INSERT INTO `shopmanagementproject`.`invoices` (`id`, `series`, `number`, `invoiceLine`) VALUES ('', '', '', '')"),
    @NamedQuery(name = "invoices.updateInvoice", query = "UPDATE invoices SET id = `id`, series = `series`, number = `number`, invoiceLine = `invoiceLine` WHERE id = `id`, series = `series`, number = `number`, invoiceLine = `invoiceLine`"),
    @NamedQuery(name = "invoices.deleteInvoice", query = "DELETE FROM invoices WHERE id = `id`")})
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
    @Basic(optional = false)
    @Lob
    @Column(name = "number", nullable = false, length = 65535)
    private Integer number;
    @Basic(optional = false)
    @Lob
    @Column(name = "invoiceLine", nullable = false, length = 65535)
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

    public Invoice(Integer id, String series, Integer number, Integer invoiceLine) {
        this.id = id;
        this.series = series;
        this.number = number;
        this.invoiceLine = invoiceLine;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    
}
