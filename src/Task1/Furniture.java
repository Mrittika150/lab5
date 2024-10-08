package Task1;

public class Furniture extends Product {

    private static final double Tax_rate = 0.08;

    public Furniture(String productName, int stockQuantity, double unitPrice) {
        super(productName, stockQuantity, unitPrice);
    }

    @Override
    public double calculateTotalPrice() {
        return getUnitPrice() + (getUnitPrice()* Tax_rate);
    }
}
