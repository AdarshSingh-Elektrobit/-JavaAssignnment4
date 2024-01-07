package MiniProjects.InventoryManagementSystem;
import java.util.*;

class Warehouse {
    private List<Product> products;

    public Warehouse() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public int getProductStock(String productName) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                return product.getQuantity();
            }
        }
        return 0;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}