import java.util.Scanner;

class MinimumOfTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter 1st number: ");
        int num1 = input.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter 2nd number: ");
        int num2 = input.nextInt();

        // Create an instance of MinimumOfTwoNumbers to call the min method
        MinimumOfTwoNumbers minimum = new MinimumOfTwoNumbers();

        // Call the min method to find the minimum of the two numbers
        int minNum = minimum.min(num1, num2);

        // Display the result
        System.out.println("Minimum number is: " + minNum);
    }

    // Method to find the minimum of two numbers
    public int min(int num1, int num2) {
        // Use a ternary operator to return the smaller of the two numbers
        return num1 < num2 ? num1 : num2;
    }
}
