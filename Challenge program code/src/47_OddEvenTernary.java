import java.util.Scanner;

class OddEvenTernary {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter your number: ");
        int num = input.nextInt();

        // Create an object of OddEvenTernary to call the oddEven method
        OddEvenTernary oddNumEvenNum = new OddEvenTernary();

        // Call the oddEven method to determine if the number is odd or even
        String result = oddNumEvenNum.oddEven(num);

        // Display the result
        System.out.println("Entered number is: " + result);
    }

    // Method to check if a number is odd or even
    public String oddEven(int num) {
        // Use a ternary operator to return "Even" if the number is divisible by 2, otherwise "Odd"
        return num % 2 == 0 ? "Even" : "Odd";
    }
}
