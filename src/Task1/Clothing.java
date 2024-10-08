package Task1;

public class Clothing extends Product {
    private static final double Tax_rate = 0.1;

    public Clothing(String productName, int stockQuantity, double unitPrice) {
        super(productName, stockQuantity, unitPrice);
    }

    public double calculateTotalPrice() {
        return getUnitPrice() + (getUnitPrice()*  Tax_rate);
    }
}
