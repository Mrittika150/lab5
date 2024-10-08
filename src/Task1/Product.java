package Task1;

public abstract class Product  {
    private String productName;
    private int stockQuantity;
    private double unitPrice;

    public Product(String productName, int stockQuantity, double unitPrice) {
        this.productName = productName;
        this.stockQuantity = stockQuantity;
        this.unitPrice = unitPrice;
    }
    public abstract double calculateTotalPrice();

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public int getStockQuantity() {
        return stockQuantity;
    }
    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

}
