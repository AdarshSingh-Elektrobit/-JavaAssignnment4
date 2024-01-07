package MiniProjects.InventoryManagementSystem;
import java.util.*;
public class InventoryManager {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Inventory Management System ===");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Check Stock Level");
            System.out.println("4. Display Products");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character after reading int

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline character after reading double
                    System.out.print("Enter product category: ");
                    String category = scanner.nextLine();
                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character after reading int

                    Product newProduct = new Product(name, price, category, quantity);
                    warehouse.addProduct(newProduct);
                    System.out.println("Product added successfully!");
                    break;

                case 2:
                    System.out.print("Enter product name to remove: ");
                    String productNameToRemove = scanner.nextLine();

                    for (Product product : warehouse.getProducts()) {
                        if (product.getName().equals(productNameToRemove)) {
                            warehouse.removeProduct(product);
                            System.out.println("Product removed successfully!");
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter product name to check stock level: ");
                    String productNameToCheck = scanner.nextLine();
                    int stock = warehouse.getProductStock(productNameToCheck);
                    System.out.println("Stock of " + productNameToCheck + ": " + stock);
                    break;

                case 4:
                    System.out.println("=== Available Products ===");
                    warehouse.displayProducts();
                    break;

                case 5:
                    System.out.println("Exiting Inventory Management System. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
                    break;
            }
        }
    }
}