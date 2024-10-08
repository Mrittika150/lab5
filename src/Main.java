import Task1.*;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics("Laptop", 5, 1000));
        products.add(new Clothing("T-Shirt", 10, 20));
        products.add(new Furniture("Chair", 15, 50));
        products.add(new Electronics("Smartphone", 7, 700));
        products.add(new Clothing("Jeans", 12, 40));
        products.add(new Furniture("Table", 3, 150));
        products.add(new Electronics("Tablet", 6, 400));
        products.add(new Clothing("Hat", 8, 15));
        products.add(new Furniture("Sofa", 2, 800));
        products.add(new Electronics("Camera", 4, 500));

        OrderManager orderManager = new OrderManager(products);
        orderManager.showProducts(); // Display sorted products
    }
}
