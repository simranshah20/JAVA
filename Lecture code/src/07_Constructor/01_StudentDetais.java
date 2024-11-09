import java.util.Scanner;

class Student {
    String name;
    int age;

    // Default constructor
    public Student() {
        name = "John";
        age = 20;
    }

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Student(Student other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Using the default constructor
        Student student1 = new Student();
        System.out.println("Default Constructor:");
        student1.display();

        // Taking input for the parameterized constructor
        System.out.print("Enter the name of the student: ");
        String name = scanner.nextLine();
        System.out.print("Enter the age of the student: ");
        int age = scanner.nextInt();

        // Using the parameterized constructor
        Student student2 = new Student(name, age);
        System.out.println("Parameterized Constructor:");
        student2.display();

        // Using the copy constructor
        Student student3 = new Student(student2);
        System.out.println("Copy Constructor:");
        student3.display();

        scanner.close();
    }
}
