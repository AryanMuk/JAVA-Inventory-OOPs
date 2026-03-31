// ElectronicProduct.java
public class ElectronicProduct extends Product {
    private int warrantyPeriod; // in months

    public ElectronicProduct(int id, String name, double price, int quantity, int warrantyPeriod) {
        super(id, name, price, quantity); // call parent constructor
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyPeriod() { return warrantyPeriod; }

    @Override
    public void displayInfo() {
        System.out.println("[Electronic] ID: " + getId()
                + " | " + getName()
                + " | $" + getPrice()
                + " x " + getQuantity()
                + " | Warranty: " + warrantyPeriod + " months"
                + " | Total: $" + getTotalValue());
    }
}