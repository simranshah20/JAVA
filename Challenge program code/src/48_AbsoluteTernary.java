import java.util.Scanner;

class AbsoluteTernary {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter your number: ");
        int num = input.nextInt();

        // Use a ternary operator to calculate the absolute value
        // If num is greater than or equal to 0, result is num; otherwise, result is -num
        int result = num >= 0 ? num : -num;

        // Display the absolute value
        System.out.println("Absolute value is: " + result);
    }
}
