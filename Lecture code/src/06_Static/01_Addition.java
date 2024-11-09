import java.util.Scanner;

class Calculator {
    // A static method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }
}

class Addition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Calling the static add method
        int result = Calculator.add(number1, number2);

        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + result);

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
