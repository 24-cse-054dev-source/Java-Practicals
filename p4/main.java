class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Employee {
    double calculatePay() {
        return 0.0;
    }
}

class FullTimeEmployee extends Employee {
    double calculatePay() {
        return 5000.0;
    }
}

class PartTimeEmployee extends Employee {
    double calculatePay() {
        return 2500.0;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Compile-Time Polymorphism (Method Overloading) ---");
        Calculator calc = new Calculator();
        System.out.println("Sum of two integers (10, 20): " + calc.add(10, 20));
        System.out.println("Sum of two doubles (5.5, 4.5): " + calc.add(5.5, 4.5));
        System.out.println("Sum of three integers (1, 2, 3): " + calc.add(1, 2, 3));

        System.out.println("\n--- Runtime Polymorphism (Method Overriding) ---");
        Employee emp1 = new FullTimeEmployee();
        Employee emp2 = new PartTimeEmployee();

        System.out.println("Full-Time Employee Pay: $" + emp1.calculatePay());
        System.out.println("Part-Time Employee Pay: $" + emp2.calculatePay());
    }
}
