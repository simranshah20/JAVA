package in.kgcoding.challenge73;

// Square class extends the Shape class, representing a square shape
public class Square extends Shape {
    // Private field to store the length of the side of the square
    private final double side;

    /**
     * Constructor to initialize the Square object with a specific side length.
     */
    public Square(double side) {
        this.side = side; // Assign the provided side length to the field
    }

    /**
     * Override of the calculateArea method from the Shape class.
     * Calculates the area of the square using the formula: side * side.
     *
     * @return the area of the square as a double
     */
    @Override
    public double calculateArea() {
        return side * side; // Calculate and return the area of the square
    }
}
