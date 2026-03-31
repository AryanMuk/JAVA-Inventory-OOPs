// Inventory.java
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Product> products;

    public Inventory() {
        this.products = new ArrayList<>();
    }

    // Add a product
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Added: " + product.getName());
    }

    // Remove a product by ID
    public boolean removeProduct(int id) {
        return products.removeIf(p -> p.getId() == id);
    }

    // Update quantity for a product by ID
    public void updateQuantity(int id, int newQuantity) {
        for (Product p : products) {
            if (p.getId() == id) {
                p.setQuantity(newQuantity);
                System.out.println("Updated quantity for " + p.getName() + " to " + newQuantity);
                return;
            }
        }
        System.out.println("Product with ID " + id + " not found.");
    }

    // Calculate total value of all stock
    public double getTotalValue() {
        double total = 0;
        for (Product p : products) {
            total += p.getTotalValue();
        }
        return total;
    }

    // Display all products
    public void displayAll() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }
        System.out.println("\n--- Inventory ---");
        for (Product p : products) {
            p.displayInfo(); // polymorphism — each type prints differently
        }
        System.out.println("-----------------");
    }

    // Getter for use in tests
    public List<Product> getProducts() { return products; }
}