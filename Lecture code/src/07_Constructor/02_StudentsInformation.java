import java.util.Scanner;
class Students {
    String name;
    int age;
    String city;

    // Default constructor
    public Students() {
        name = "Devin";
        age = 30;
        city = "USA";
    }

    // Parameterized constructor
    public Students(String n, int a,String c) {
        name = n;
        age = a;
        city = c;
    }

    // Copy constructor
    public Students(Students other) {
        name = other.name;
        age = other.age;
        city = other.city;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age+", City: "+city);
    }
}

class StudentsInformation {
    public static void main(String[] args) {
        // Using the default constructor
        Students student1 = new Students();
        System.out.println("Default Constructor:");
        student1.display();

        // Taking input for the parameterized constructor
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the student: ");
        String name = input.nextLine();
        System.out.print("Enter the age of the student: ");
        int age = input.nextInt();
        // Consume the leftover newline
        input.nextLine();
        System.out.print("Enter the city of the student: ");
        String city = input.nextLine();

        // Using the parameterized constructor
        Students student2 = new Students(name,age,city);
        System.out.println("Parameterized Constructor:");
        student2.display();

        // Using the copy constructor
        Students student3 = new Students(student2);
        System.out.println("Copy Constructor:");
        student3.display();
    }
}
