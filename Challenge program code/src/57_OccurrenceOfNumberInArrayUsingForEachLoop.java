import java.util.Scanner;

class OccurrenceOfNumberInArrayUsingForEachLoop {
    public static void main(String[] args) {
        // Print a message to indicate the program's purpose
        System.out.println("\n.................Find Number of occurrences in an array....................\n");

        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Accessing the inputArray method (assumed to be in ArrayUtility class)
        // to get an array of numbers entered by the user
        int arrNum[] = ArrayUtility.inputArray();

        // Prompt the user to enter the number they want to find in the array
        System.out.print("Enter the number you want to find: ");
        int num = input.nextInt();  // Read the number from user input

        // Call the method noOfOccurances to find how many times 'num' appears in the array
        int occurrences = noOfOccurances(arrNum, num);

        // Print the result: the number of occurrences of the specified element
        System.out.println("Your element was found " + occurrences + " times in the array");
    }

    // Method to count the number of occurrences of 'element' in the array 'arrNum'
    public static int noOfOccurances(int arrNum[], int element) {
        int occurrence = 0;  // Initialize occurrence counter to 0

        // Use a for-each loop to iterate through each element in the array
        for (int num : arrNum) {
            // If the current number matches the element, increment the counter
            if (num == element) {
                occurrence++;
            }
        }

        // Return the final count of occurrences
        return occurrence;
    }
}
