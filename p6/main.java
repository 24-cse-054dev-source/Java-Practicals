class Book {
    String title;
    String author;
    double price;

    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.print("Default Constructor Object: ");
        book1.display();

        Book book2 = new Book("Java Programming", "John Doe", 45.99);
        System.out.print("Parameterized Constructor Object: ");
        book2.display();

        Book book3 = new Book(book2);
        System.out.print("Copy Constructor Object (Initial): ");
        book3.display();

        book3.title = "Advanced Java";
        book3.price = 59.99;

        System.out.println("\nAfter modifying the copied object (book3):");
        System.out.print("Copied Object (book3): ");
        book3.display();
        System.out.print("Original Object (book2): ");
        book2.display();
    }
}
