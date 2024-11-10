import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Set the target number that the user needs to guess
        int num = 5, guess;

        // Loop until the user guesses the correct number
        do {
            System.out.print("Enter the number: ");
            guess = input.nextInt();  // Read the user's guess
        } while (num != guess);  // Continue looping if the guess is incorrect

        // If the user guesses correctly, print a success message
        System.out.println("You have successfully guessed the number!");
    }
}
