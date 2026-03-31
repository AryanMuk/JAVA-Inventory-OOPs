// InventoryTest.java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InventoryTest {

    private Inventory inventory;
    private Product laptop;
    private Product milk;

    @BeforeEach
    void setUp() {
        inventory = new Inventory();
        laptop = new ElectronicProduct(1, "Laptop", 1200, 5, 24);
        milk   = new PerishableProduct(2, "Milk", 5, 20, "2025-03-25");
    }

    @Test
    void testAddProduct() {
        inventory.addProduct(laptop);
        assertEquals(1, inventory.getProducts().size());
    }

    @Test
    void testRemoveProduct() {
        inventory.addProduct(laptop);
        inventory.addProduct(milk);
        inventory.removeProduct(1);
        assertEquals(1, inventory.getProducts().size());
    }

    @Test
    void testGetTotalValue() {
        inventory.addProduct(laptop); // 1200 × 5 = 6000
        inventory.addProduct(milk);  // 5 × 20 = 100
        assertEquals(6100.0, inventory.getTotalValue(), 0.001);
    }

    @Test
    void testUpdateQuantity() {
        inventory.addProduct(milk);
        inventory.updateQuantity(2, 10);
        assertEquals(10, milk.getQuantity());
    }

    @Test
    void testElectronicProductWarranty() {
        ElectronicProduct ep = (ElectronicProduct) laptop;
        assertEquals(24, ep.getWarrantyPeriod());
    }

    @Test
    void testPerishableProductExpiry() {
        PerishableProduct pp = (PerishableProduct) milk;
        assertEquals("2025-03-25", pp.getExpiryDate());
    }

    @Test
    void testEmptyInventoryValue() {
        assertEquals(0.0, inventory.getTotalValue(), 0.001);
    }

    @Test
    void testRemoveNonExistentProduct() {
        inventory.addProduct(laptop);
        boolean removed = inventory.removeProduct(999); // doesn't exist
        assertFalse(removed);
        assertEquals(1, inventory.getProducts().size());
    }
}


