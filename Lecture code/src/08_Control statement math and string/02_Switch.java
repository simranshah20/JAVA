import java.util.Scanner;

class Switch {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Display a welcome message
        System.out.println("Welcome to day of the week detector\n");

        // Prompt the user to enter a day as a number
        System.out.print("Enter your day in number: ");
        int day = input.nextInt();

        // Use a switch statement to determine the day of the week
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;  // Exit switch after printing Sunday
            case 2:
                System.out.println("Monday");
                break;  // Exit switch after printing Monday
            case 3:
                System.out.println("Tuesday");
                break;  // Exit switch after printing Tuesday
            case 4:
                System.out.println("Wednesday");
                break;  // Exit switch after printing Wednesday
            case 5:
                System.out.println("Thursday");
                break;  // Exit switch after printing Thursday
            case 6:
                System.out.println("Friday");
                break;  // Exit switch after printing Friday
            case 7:
                System.out.println("Saturday");
                break;  // Exit switch after printing Saturday

            // Uncomment the following lines for a fall-through example:
            // Fall-through: cases 8 and 9 will both print "Holiday" without a break statement
            // case 8:
            // case 9:
            //     System.out.println("Holiday");

            default:
                System.out.println("Invalid Day");  // If no cases match, this line executes
                break;  // Break is optional here since it's the last statement in the switch
        }
    }
}
