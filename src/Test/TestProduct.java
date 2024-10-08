package Test;

import Task1.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestProduct {
    @Test
    void testElectronicsTotalPrice() {
        Product laptop = new Electronics("Laptop",5,1000);
        assertEquals(1150,laptop.calculateTotalPrice());
    }

    @Test
    void testClothingTotalPrice() {
        Product tshirt = new Clothing("Tshirt",3,1000);
        assertEquals(1100,tshirt.calculateTotalPrice());
    }

    @Test
    void testFurnitureTotalPrice() {
        Product sofa = new Furniture("Sofa",4,3000);
        assertEquals(3240,sofa.calculateTotalPrice());
    }
    @Test
    void testSortingByTotalPrice() {
        List<Product> products = new ArrayList<Product>();
        products.add(new Electronics("Laptop",5,1000));
        products.add(new Furniture("Sofa",4,3000));
        products.add(new Clothing("Tshirt",3,1000));

        OrderManager orderManager = new OrderManager(products);
        List<Product> sortedProducts = orderManager.sortProducts();


        assertEquals("Sofa",sortedProducts.get(2).getProductName());
        assertEquals("Laptop",sortedProducts.get(1).getProductName());
        assertEquals("Tshirt",sortedProducts.get(0).getProductName());
    }
    void testSortingByNameWhenPricesEqual() {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics("Phone", 10, 500));
        products.add(new Electronics("Camera", 4, 500));


        OrderManager orderManager = new OrderManager(products);
        List<Product> sortedProducts = orderManager.sortProducts();

        assertEquals("Camera", sortedProducts.get(0).getProductName());
        assertEquals("Phone", sortedProducts.get(1).getProductName());
    }

        @Test
                void  testSortingBystockQuantity(){
            List<Product> products = new ArrayList<>();
            products.add(new Electronics("Phone", 10, 500));
            products.add(new Electronics("Phone", 4, 500));

            OrderManager orderManager1 = new OrderManager(products);
            orderManager1.sortProducts();

            assertEquals(4 , products.get(0).getStockQuantity());
            assertEquals(10, products.get(1).getStockQuantity());


        }

    }

