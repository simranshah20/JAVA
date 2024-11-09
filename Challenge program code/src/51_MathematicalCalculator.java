import java.util.Scanner; // Importing Scanner class for user input

class MathematicalCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter 1st number: ");
        int num1 = input.nextInt(); // Reading first number

        // Prompt the user to enter the second number
        System.out.print("Enter 2nd number: ");
        int num2 = input.nextInt(); // Reading second number

        // Prompt the user to enter the desired operation (+, -, *, /)
        System.out.print("Enter the operation: ");
        String operation = input.next(); // Reading the operation

        // Switch statement to handle different operations
        switch (operation) {
            case "+":
                int sum = num1 + num2; // Performing addition
                System.out.println("Addition of " + num1 + " and " + num2 + " is: " + sum); // Output the result
                break;
            case "-":
                // Subtraction operation - check which number is larger
                if (num1 > num2) {
                    int sub = num1 - num2; // Subtracting num2 from num1
                    System.out.println("Subtraction of " + num1 + " and " + num2 + " is: " + sub); // Output the result
                } else {
                    int sub = num2 - num1; // Subtracting num1 from num2
                    System.out.println("Subtraction of " + num2 + " and " + num1 + " is: " + sub); // Output the result
                }
                break;
            case "*":
                int mul = num1 * num2; // Performing multiplication
                System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + mul); // Output the result
                break;
            case "/":
                // Division operation - check which number is larger
                if (num1 > num2) {
                    int div = num1 / num2; // Dividing num1 by num2
                    System.out.println("Division of " + num1 + " and " + num2 + " is: " + div); // Output the result
                } else {
                    int div = num2 / num1; // Dividing num2 by num1
                    System.out.println("Division of " + num2 + " and " + num1 + " is: " + div); // Output the result
                }
                break;
            default:
                System.out.println("Invalid Operation"); // If the operation is not recognized
        }

        // Example of another way to handle the switch statement (commented out)
        // int result = switch (operation){
        //   case "+" -> num1 + num2;
        //   case "-" -> num1 - num2;
        //   case "*" -> num1 * num2;
        //   case "/" -> num1 / num2;
        //   default -> -1; // If the operation is invalid
        // };
        // System.out.println("Your answer is: "+result); // Output the result
    }
}
