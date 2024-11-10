import java.util.Scanner;

class PasswordChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        String password;

        // Loop until a valid password is entered
        do {
            System.out.print("Enter your password: ");
            password = input.next();  // Read the user's password input
        } while (!isValidPassword(password));  // Check password validity

        // If a valid password is entered, print a confirmation message
        System.out.println("Thanks for entering a valid password!");
    }

    // Method to check if the password meets validity requirements
    public static boolean isValidPassword(String password) {
        // Return true if the password is more than 6 characters, false otherwise
        return password.length() > 6;
    }
}
