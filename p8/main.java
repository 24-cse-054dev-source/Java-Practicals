class Product {
    String productName;
    double price;
    int quantity;

    Product() {
        this.productName = "Unknown";
        this.price = 0.0;
        this.quantity = 0;
    }

    Product(String productName) {
        this.productName = productName;
        this.price = 0.0;
        this.quantity = 1;
    }

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        this.quantity = 1;
    }

    Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateTotalCost() {
        return this.price * this.quantity;
    }

    void display() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + calculateTotalCost());
        System.out.println("-------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Laptop");
        Product p3 = new Product("Mouse", 25.50);
        Product p4 = new Product("Keyboard", 45.00, 3);

        System.out.println("--- 1. No Arguments Constructor ---");
        p1.display();

        System.out.println("--- 2. Name Only Constructor ---");
        p2.display();

        System.out.println("--- 3. Name and Price Constructor ---");
        p3.display();

        System.out.println("--- 4. All Three Fields Constructor ---");
        p4.display();
    }
}
