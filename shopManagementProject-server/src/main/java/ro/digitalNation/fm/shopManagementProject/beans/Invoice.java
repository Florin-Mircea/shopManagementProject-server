package ro.digitalNation.fm.shopManagementProject.beans;

@Bean
public class Invoice {
    
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
