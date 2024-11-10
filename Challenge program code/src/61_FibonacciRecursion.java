import java.util.Scanner;

class FibonacciRecursion {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of Fibonacci elements to print
        System.out.print("Enter the number of elements to be printed: ");
        int count = input.nextInt();  // Read the user input

        // Loop to print Fibonacci numbers up to the specified count
        for (int i = 1; i <= count; i++) {
            // Call the recursive fibonacci method to get the i-th Fibonacci number
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Recursive method to calculate the Fibonacci number at a given position
    public static int fibonacci(int position) {
        // Base case: if position is 1, the first Fibonacci number is 0
        if (position == 1) {
            return 0;
        }
        // Base case: if position is 2, the second Fibonacci number is 1
        if (position == 2) {
            return 1;
        }
        // Recursive case: Fibonacci of position is the sum of the two previous numbers
        return fibonacci(position - 1) + fibonacci(position - 2);
    }
}
