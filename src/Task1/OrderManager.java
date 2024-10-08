package Task1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderManager {
    private List<Product> products;

    public OrderManager(List<Product> products) {
        this.products = products;
    }
    public List<Product> sortProducts() {
        Collections.sort(products, Comparator.comparing(Product::calculateTotalPrice).thenComparing(Product::getProductName).thenComparing(Product::getStockQuantity));
        return products;
    }

    // Method to display sorted products
    public void showProducts() {
        List<Product> sortedProducts = sortProducts();
        for (Product product : sortedProducts) {
            System.out.printf("Name: %s, Stock: %d, Unit Price: %.2f, Total Price: %.2f%n",
                    product.getProductName(), product.getStockQuantity(), product.getUnitPrice(), product.calculateTotalPrice());
        }
    }
}
