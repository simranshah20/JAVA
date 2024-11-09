import java.util.Scanner;

class MonthSwitch {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a month number
        System.out.print("Enter your month in number: ");
        int month = input.nextInt();

        // Call getMonthName method to get the name of the month
        String monthName = getMonthName(month);

        // Display the name of the month
        System.out.println("Your month name is: " + monthName);
    }

    // Method to return the name of the month based on the month number
    public static String getMonthName(int monthNum) {
        // Use an enhanced switch expression to map month number to month name
        String monthName = switch (monthNum) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid Month Number";  // Handles numbers outside the 1-12 range
        };
        return monthName;  // Return the month name or "Invalid Month Number"
    }
}
