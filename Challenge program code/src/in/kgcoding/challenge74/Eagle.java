package in.kgcoding.challenge74;

/**
 * Eagle class extends the Bird class and implements the fly method.
 * This class represents an eagle, a specific type of bird.
 */
public class Eagle extends Bird {

    /**
     * Constructor to initialize the Eagle object with the breed "Eagle".
     */
    public Eagle() {
        super("Breed eagle"); // Call the Bird constructor with "Breed eagle"
    }

    /**
     * Override of the fly method from the Flyable interface.
     * Defines the behavior of how an eagle flies.
     */
    @Override
    public void fly() {
        System.out.println("Eagle is flying"); // Print a message indicating the eagle is flying
    }
}
