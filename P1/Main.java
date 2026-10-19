
class Student {
    int rollNumber;
    String name;
    double marks1, marks2, marks3;

    Student(int rollNumber, String name, double marks1,
            double marks2, double marks3) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    double calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    double calculatePercentage() {
        return (calculateTotal() / 300.0) * 100;
    }

    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks in Subject 1: " + marks1);
        System.out.println("Marks in Subject 2: " + marks2);
        System.out.println("Marks in Subject 3: " + marks3);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.printf("Percentage: %.2f%%\n",
                calculatePercentage());
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Aman", 85, 90, 80);
        Student s2 = new Student(102, "riya", 92, 88, 95);
        Student s3 = new Student(103, "Rahul", 75, 80, 85);

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
