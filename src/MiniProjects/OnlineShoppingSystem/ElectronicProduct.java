package MiniProjects.OnlineShoppingSystem;
import java.util.Random;

class ElectronicProduct extends Product {
    private String[] electronicProducts = {"Laptop", "Smartphone", "Headphones", "Smartwatch", "Tablet"};
    private Random random = new Random();

    public ElectronicProduct(String name, double price, String description) {
        super(name, price, description);
    }

    public void displayProducts() {
        System.out.println("Available Electronic Products:");
        for (int i = 0; i < electronicProducts.length; i++) {
            System.out.println((i + 1) + ". " + electronicProducts[i]);
        }
        System.out.print("Choose an electronic product: ");
    }

    public Product getProduct(int choice) {
        // Assuming the choice is within the range of products
        return new ElectronicProduct(electronicProducts[choice - 1], generateRandomPrice(), "Description");
    }

    private double generateRandomPrice() {
        // Generate a random price between 100 and 1000 for electronic products
        return random.nextDouble() * (1000 - 100) + 100;
    }
}