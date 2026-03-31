// PerishableProduct.java
public class PerishableProduct extends Product {
    private String expiryDate;

    public PerishableProduct(int id, String name, double price, int quantity, String expiryDate) {
        super(id, name, price, quantity);
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() { return expiryDate; }

    @Override
    public void displayInfo() {
        System.out.println("[Perishable] ID: " + getId()
                + " | " + getName()
                + " | $" + getPrice()
                + " x " + getQuantity()
                + " | Expires: " + expiryDate
                + " | Total: $" + getTotalValue());
    }
}