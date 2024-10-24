import java.util.Scanner;

public class ArrayUtility {

    // Method to take input from the user and create an array
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);   // Create a Scanner object to take user input
        System.out.print("Please enter the size of an array: ");
        int size = input.nextInt();    // Takes the size of the array entered by the user
        int number[] = new int[size];  // Declare an array with the specified size

        int i = 0;   // Initialize a counter for array index
        // Loop to take input for each element of the array
        while (i < size) {
            System.out.print("Enter the element " + (i + 1) + " : ");
            number[i] = input.nextInt();  // Store the entered value in the array
            i++;  // Increment the counter to move to the next element
        }
        return number;  // Return the populated array
    }

    // Method to display the elements of the array
    public static void displayArray(int num[]) {
        int i = 0;  // Initialize a counter for array index
        // Loop to iterate over the array and print each element
        while (i < num.length) {
            System.out.print(num[i] + " ");  // Print each element followed by a space
            i++;  // Move to the next element
        }
        System.out.println();  // Print a new line after the entire array is displayed
        return;  // Optional return since this method is void
    }
}
