package in.kgcoding.challenge74;

/**
 * Abstract class Bird implements the Flyable interface, representing birds that can fly.
 */
public abstract class Bird implements Flyable {
    // Private field to store the breed of the bird
    private final String breed;

    /**
     * Constructor to initialize the Bird object with a specific breed.
     */
    public Bird(String breed) {
        this.breed = breed; // Assign the provided breed to the field
    }

    /**
     * Getter method to retrieve the breed of the bird.
     *
     * @return the breed of the bird as a String
     */
    public String getBreed() {
        return breed; // Return the breed of the bird
    }
}
