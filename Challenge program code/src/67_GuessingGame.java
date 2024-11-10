import java.util.Scanner;

class GuessingGame {
    // Instance variable to store the random target number
    int random;

    // Constructor to generate a random number between 1 and 100
    GuessingGame() {
        random = (int)(Math.ceil(Math.random() * 100));
    }

    /**
     * Method to compare the guessed number with the target number
     * @param guessNumber the number that the player guessed
     * @return
     *  - Negative if the guessed number is smaller
     *  - 0 if the guessed number is correct
     *  - Positive if the guessed number is higher
     **/
    int guess(int guessNumber) {
        return guessNumber - random;
    }

    // Main method to execute the game
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Create a GuessingGame object to start the game
        GuessingGame game = new GuessingGame();

        int guess, result;

        // Repeat until the correct guess is made
        do {
            // Prompt the user to guess a number
            System.out.print("Guess the number: ");
            guess = input.nextInt();

            // Get the result of the guess
            result = game.guess(guess);

            // Check the result and provide feedback
            if (result == 0) {
                System.out.print("Congrats, your guess is correct");
            } else if (result < 0) {
                System.out.println("Please guess higher");
            } else {
                System.out.println("Please guess lower");
            }

        } while (result != 0);  // Loop until the guess is correct
    }
}
