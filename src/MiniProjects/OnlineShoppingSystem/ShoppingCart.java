package MiniProjects.OnlineShoppingSystem;

import java.util.ArrayList;
import java.util.List;


class ShoppingCart {
    private List<Product> cartItems;
    private List<List<Product>> orders;

    public ShoppingCart() {
        cartItems = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public void addProduct(Product product) {
        cartItems.add(product);
    }

    public void removeProduct(int index) {
        if (index >= 0 && index < cartItems.size()) {
            cartItems.remove(index);
            System.out.println("Product removed from cart!");
        } else {
            System.out.println("Invalid index. No product removed.");
        }
    }

    public void displayCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Your shopping cart is empty.");
        } else {
            System.out.println("------ Shopping Cart ------");
            for (int i = 0; i < cartItems.size(); i++) {
                System.out.println((i + 1) + ". " + cartItems.get(i).getName() + " - $" + cartItems.get(i).getPrice());
            }
            System.out.println("---------------------------");
        }
    }


    public void placeOrder() {
        if (cartItems.isEmpty()) {
            System.out.println("Your cart is empty. Please add items before placing an order.");
        } else {
            System.out.println("Order placed successfully!");
            orders.add(new ArrayList<>(cartItems)); // Adding a copy of cart items to orders list
            cartItems.clear(); // Clearing the cart after placing an order
        }
    }

    public void viewOrders() {
        if (orders.isEmpty()) {
            System.out.println("No previous orders available.");
        } else {
            System.out.println("------ Previous Orders ------");
            for (int i = 0; i < orders.size(); i++) {
                System.out.println("Order " + (i + 1) + ":");
                List<Product> order = orders.get(i);
                for (Product product : order) {
                    System.out.println("- " + product.getName() + " - $" + product.getPrice());
                }
                System.out.println("-----------------------------");
            }
        }
    }
}