package Task1;

public class Electronics extends Product {
    private static final double Tax_rate = 0.15;
    public Electronics(String productName, int stockQuantity, double unitPrice) {
        super (productName, stockQuantity, unitPrice);

    }

    @Override
    public double calculateTotalPrice() {
        return getUnitPrice() + (getUnitPrice() * Tax_rate);
    }



}
