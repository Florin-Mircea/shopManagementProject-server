package ro.digitalNation.fm.shopManagementProject.beans;

public class InvoiceLine {
    
    private String productName;
    private Integer quantity;
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
