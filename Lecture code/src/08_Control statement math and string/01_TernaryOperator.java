import java.util.Scanner;

class TernaryOperator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter 1st number: ");
        int num1 = input.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter 2nd number: ");
        int num2 = input.nextInt();

        // Determine the greater number using an if-else statement (commented out)
        // int greaterNumber;
        // if(num1 > num2) {
        //     greaterNumber = num1;
        // } else {
        //     greaterNumber = num2;
        // }
        // System.out.println("Greater number is: " + greaterNumber);

        // Determine the greater number using a ternary operator
        int greaterNumber = num1 > num2 ? num1 : num2;  //if num1 > num2 then print num1 else print  num2

        // Display the result
        System.out.println("Greater number is: " + greaterNumber);
    }
}
