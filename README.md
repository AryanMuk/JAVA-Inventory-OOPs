# Java OOP Inventory Management System

## Overview
A Java-based inventory management system for a retail store, built using core Object-Oriented Programming principles. The system supports multiple product types, stock management, and inventory value calculation.

---

## Tech Stack
- Java 17+
- JUnit 5 (testing)
- IntelliJ IDEA

---

## Project Structure
src/
├── Product.java # Abstract base class
├── ElectronicProduct.java # Extends Product (warranty period)
├── PerishableProduct.java # Extends Product (expiry date)
├── Inventory.java # Manages list of products
└── Main.java # Entry point / demo

test/
└── InventoryTest.java # JUnit 5 test suite (8 tests)
--- 

## Features
- Add and remove products from inventory
- Update product quantity by ID
- Calculate total inventory value (`price × quantity`)
- Display all products with type-specific formatting

## Sample Output
Added: Laptop
Added: Milk
Added: Mouse

--- Inventory ---
[Electronic] ID: 1 | Laptop | $1200.0 x 5 | Warranty: 24 months | Total: $6000.0
[Perishable] ID: 2 | Milk | $5.0 x 20 | Expires: 2025-03-25 | Total: $100.0
[Electronic] ID: 3 | Mouse | $25.0 x 50 | Warranty: 12 months | Total: $1250.0

Total Inventory Value: $7350.0


---

## Running the Project

### Using IntelliJ IDEA
1. Open the project in IntelliJ IDEA
2. Navigate to `Main.java`
3. Click the ▶ button next to `main()`

### Running Tests
1. Right-click `InventoryTest.java`
2. Click **Run 'InventoryTest'**

---

## Test Results
✅ testAddProduct
✅ testRemoveProduct
✅ testGetTotalValue
✅ testUpdateQuantity
✅ testElectronicProductWarranty
✅ testPerishableProductExpiry
✅ testEmptyInventoryValue
✅ testRemoveNonExistentProduct

Tests passed: 8 of 8
