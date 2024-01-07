package MiniProjects.OnlineShoppingSystem;

// import java.util.ArrayList;
// import java.util.List;
import java.util.Scanner;

public class OnlineShoppingMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart shoppingCart = new ShoppingCart(); // Assuming you have instantiated the ShoppingCart class
        
        int choice;
        do {
            System.out.println("----- Online Shopping Menu -----");
            System.out.println("1. Electronics");
            System.out.println("2. Clothing");
            System.out.println("3. View Cart");
            System.out.println("4. Place Order");
            System.out.println("5. View Previous Orders");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            
            switch (choice) {
                case 1:
                    showElectronicsMenu(shoppingCart);
                    break;
                case 2:
                    showClothingMenu(shoppingCart);
                    break;
                case 3:
                    shoppingCart.displayCart();
                    break;
                case 4:
                    shoppingCart.placeOrder();
                    break;
                case 5:
                    shoppingCart.viewOrders();
                    break;
                case 6:
                    System.out.println("Exiting the program. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 6);
        
        scanner.close();
    }
private static void showElectronicsMenu(ShoppingCart cart) {
        String[] electronicProducts = {"Laptop", "Smartphone", "Headphones", "Smartwatch", "Tablet"};
        
        System.out.println("Available Electronic Products:");
        for (int i = 0; i < electronicProducts.length; i++) {
            System.out.println((i + 1) + ". " + electronicProducts[i]);
        }
        
        int choice = getUserChoice(electronicProducts.length);
        
        if (choice != -1) {
            cart.addProduct(new ElectronicProduct(electronicProducts[choice - 1], generateRandomPrice(), "Description"));
            System.out.println("Product added to cart!");
        } else {
            System.out.println("Invalid choice. Please select a valid product.");
        }
    }

    private static void showClothingMenu(ShoppingCart cart) {
        String[] clothingProducts = {"T-Shirt", "Jeans", "Dress", "Jacket", "Sweater"};
        
        System.out.println("Available Clothing Products:");
        for (int i = 0; i < clothingProducts.length; i++) {
            System.out.println((i + 1) + ". " + clothingProducts[i]);
        }
        
        int choice = getUserChoice(clothingProducts.length);
        
        if (choice != -1) {
            cart.addProduct(new ClothingProduct(clothingProducts[choice - 1], generateRandomPrice(), "Description"));
            System.out.println("Product added to cart!");
        } else {
            System.out.println("Invalid choice. Please select a valid product.");
        }
    }

    private static int getUserChoice(int maxChoice) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        
        if (choice >= 1 && choice <= maxChoice) {
            return choice;
        }
        return -1; // Invalid choice
    }

    private static double generateRandomPrice() {
        // Generate a random price between 100 and 1000 for electronic products
        return Math.random() * (1000 - 100) + 100;
    }
}