package MiniProjects.OnlineShoppingSystem;
import java.util.Random;


class ClothingProduct extends Product {
    private String[] clothingProducts = {"T-Shirt", "Jeans", "Dress", "Jacket", "Sweater"};
    private Random random = new Random();

    public ClothingProduct(String name, double price, String description) {
        super(name, price, description);
    }

    public void displayProducts() {
        System.out.println("Available Clothing Products:");
        for (int i = 0; i < clothingProducts.length; i++) {
            System.out.println((i + 1) + ". " + clothingProducts[i]);
        }
        System.out.print("Choose a clothing product: ");
    }

    public Product getProduct(int choice) {
        // Assuming the choice is within the range of products
        return new ClothingProduct(clothingProducts[choice - 1], generateRandomPrice(), "Description");
    }

    private double generateRandomPrice() {
        // Generate a random price between 20 and 100 for clothing products
        return random.nextDouble() * (100 - 20) + 20;
    }
}