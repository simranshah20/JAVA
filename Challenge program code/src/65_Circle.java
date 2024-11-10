import java.util.Scanner;

class Circle {
    // Instance variable to store the radius of the circle
    double radius;

    // Constructor that initializes the radius with the given value
    Circle(double r) {
        radius = r;
    }

    // Method to calculate the circumference of the circle
    double getCircumference() {
        return 2 * radius * Math.PI;
    }

    // Method to calculate the area of the circle
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Method to display the area and circumference of the circle
    void display() {
        System.out.println("Area of circle is: " + getArea());
        System.out.println("Circumference of circle is: " + getCircumference());
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.print("Enter the radius of a circle: ");

        // Read the radius value from the user
        int radius = input.nextInt();

        // Create a Circle object with the given radius
        Circle result = new Circle(radius);

        // Display the area and circumference of the circle
        result.display();
    }
}
