import java.util.Scanner;

class Recursion {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter your number: ");
        int number = input.nextInt();

        // Calculate factorial using an iterative method
        long fact = factorial(number);  // Call the iterative factorial method

        // Display the result of the iterative factorial calculation
        System.out.println("Factorial of " + number + " is: " + fact);

        // Calculate factorial using a recursive method
        long recFact = factorialByRecursive(number);  // Call the recursive factorial method

        // Display the result of the recursive factorial calculation
        System.out.println("Factorial of a number by recursive is: " + recFact);
    }

    // Method to calculate factorial iteratively
    public static long factorial(int number) {
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;  // Multiply current fact by i
        }
        return fact;  // Return the final factorial result
    }

    // Method to calculate factorial recursively
    public static long factorialByRecursive(int num) {
        if (num == 1) {
            return 1;  // Base case: if num is 1, return 1
        }
        // Recursive call: multiply num by factorial of (num - 1)
        return num * factorialByRecursive(num - 1);
    }
}
