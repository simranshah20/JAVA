package in.kgcoding.challenge73;

// Circle class extends the Shape class, inheriting its properties and behaviors
public class Circle extends Shape {
    // Private field to store the radius of the circle
    private final double radius;

    // Constructor to initialize the Circle object with a specific radius
    public Circle(double radius) {
        this.radius = radius; // Assign the provided radius to the field
    }

    // Getter method to retrieve the radius of the circle
    public double getRadius() {
        return radius; // Returns the value of the radius
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        // Formula for the area of a circle: π * radius^2
        return Math.PI * Math.pow(radius, 2);
    }
}
