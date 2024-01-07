package MiniProjects.OnlineShoppingSystem;
// public class Products {
//     private String name;
//     private double price;
//     private String description;

//     public Products(String name, double price, String description) {
//         this.name = name;
//         this.price = price;
//         this.description = description;
//     }

    
// }

class Product {
    private String name;
    private double price;
    private String description;

    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // Getters for name, price, and description
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}