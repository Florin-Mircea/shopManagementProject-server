package ro.digitalNation.fm.shopManagementProject.beans;

public class Product {
    
    private String productName;
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
