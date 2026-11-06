class Employee {
    String name;
    double salary;
    static int employeeCount = 0;

    Employee() {
        this("Default Name", 30000.0);
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        employeeCount++;
    }

    void displayEmployeeInfo() {
        System.out.println("Name: " + this.name + ", Salary: $" + this.salary);
    }

    static void displayEmployeeCount() {
        System.out.println("Total Employees Created: " + employeeCount);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Initial Employee Count:");
        Employee.displayEmployeeCount();

        System.out.println("\nCreating Employee 1 using no-argument constructor (chains to parameterized):");
        Employee emp1 = new Employee();
        emp1.displayEmployeeInfo();
        Employee.displayEmployeeCount();

        System.out.println("\nCreating Employee 2 using parameterized constructor:");
        Employee emp2 = new Employee("Bob Smith", 65000.0);
        emp2.displayEmployeeInfo();
        Employee.displayEmployeeCount();

        System.out.println("\nCreating Employee 3 using parameterized constructor:");
        Employee emp3 = new Employee("Charlie Brown", 72000.0);
        emp3.displayEmployeeInfo();
        Employee.displayEmployeeCount();
    }
}
