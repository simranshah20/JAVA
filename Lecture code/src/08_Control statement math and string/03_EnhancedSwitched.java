import java.util.Scanner;

class EnhancedSwitched {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Display a welcome message
        System.out.println("Welcome to day of the week detector\n");

        // Prompt the user to enter a day as a number
        System.out.print("Enter your day in number: ");
        int day = input.nextInt();

        // Use an enhanced switch expression to determine the day of the week
        // The result is directly assigned to the 'output' variable
        String output = switch (day) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid day";  // Executes if 'day' does not match any case
        };

        // Display the result stored in the 'output' variable
        System.out.println(output);
    }
}
