import java.util.Scanner;

class ForLoop {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number up to which they want to print
        System.out.print("Enter the number up to which you want to print: ");

        // Read the user's input and store it in the variable num
        int num = input.nextInt();

        // For loop to print numbers from 1 up to the entered number
        for(int i = 1; i < num + 1; i++) {
            System.out.print(i + " "); // Print each number followed by a space
        }
    }
}
