class Vehicle {
    String brand;
    int speed;

    void displayVehicleInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    int doors;

    void displayCarInfo() {
        displayVehicleInfo();
        System.out.println("Doors: " + doors);
    }
}

class Person {
    String name;
    int age;

    void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    double salary;

    void displayEmployeeInfo() {
        displayPersonInfo();
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    String department;

    void displayManagerInfo() {
        displayEmployeeInfo();
        System.out.println("Department: " + department);
    }
}

class Shape {
    String color;

    void displayShapeInfo() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {
    double radius;

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    void displayCircleInfo() {
        displayShapeInfo();
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    double calculateArea() {
        return length * width;
    }

    void displayRectangleInfo() {
        displayShapeInfo();
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Single Inheritance Demonstration ---");
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.speed = 120;
        myCar.doors = 4;
        myCar.displayCarInfo();

        System.out.println("\n--- Multilevel Inheritance Demonstration ---");
        Manager myManager = new Manager();
        myManager.name = "Alice";
        myManager.age = 35;
        myManager.salary = 85000.0;
        myManager.department = "IT";
        myManager.displayManagerInfo();

        System.out.println("\n--- Hierarchical Inheritance Demonstration ---");
        Circle myCircle = new Circle();
        myCircle.color = "Red";
        myCircle.radius = 5.0;
        System.out.println("Circle Details:");
        myCircle.displayCircleInfo();

        System.out.println();

        Rectangle myRectangle = new Rectangle();
        myRectangle.color = "Blue";
        myRectangle.length = 4.0;
        myRectangle.width = 6.0;
        System.out.println("Rectangle Details:");
        myRectangle.displayRectangleInfo();
    }
}
