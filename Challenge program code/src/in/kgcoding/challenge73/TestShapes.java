package in.kgcoding.challenge73;

public class TestShapes {
    public static void main(String[] args) {
        // Shape shape = new Shape(); // Not allowed to create an object of Shape because it is abstract

        // Create a Circle object with a radius of 10
        Circle circle = new Circle(10);

        // Create a Square object with a side length of 12.78
        Square square = new Square(12.78);

        // Calculate and display the area of the Circle
        System.out.println("Area of Circle is: " + circle.calculateArea());

        // Calculate and display the area of the Square
        System.out.println("Area of Square is: " + square.calculateArea());
    }
}
