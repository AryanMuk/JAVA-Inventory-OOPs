public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product p1 = new ElectronicProduct(1, "Laptop", 1200, 5, 24);
        Product p2 = new PerishableProduct(2, "Milk", 5, 20, "2025-03-25");
        Product p3 = new ElectronicProduct(3, "Mouse", 25, 50, 12);

        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        inventory.displayAll();
        System.out.println("Total Inventory Value: $" + inventory.getTotalValue());

        inventory.updateQuantity(2, 15);
        inventory.removeProduct(3);

        inventory.displayAll();
        System.out.println("Updated Total Value: $" + inventory.getTotalValue());
    }
}