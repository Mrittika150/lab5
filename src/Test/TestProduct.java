package Test;

import Task1.Clothing;
import Task1.Electronics;
import Task1.Furniture;
import Task1.Product;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
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
}
