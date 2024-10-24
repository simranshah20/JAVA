import java.util.Scanner; // Import the Scanner class for user input

class Search2DArray {
    public static void main(String[] args) {
        // Welcome message
        System.out.println("\n..............Welcome to 2D Search.................\n");

        // Input 2D array using ArrayUtility class (assumed that this class is defined elsewhere)
        int numArray[][] = ArrayUtility.input2DArray();

        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Ask the user for the number they want to search in the 2D array
        System.out.print("Enter the number you want to search: ");
        int num = sc.nextInt(); // Read the integer input from the user

        // Search for the number in the 2D array
        boolean isFound = searchArray(numArray , num);

        // Check the result and print whether the number was found or not
        if(isFound){
            System.out.println("Your number was found.");
        } else {
            System.out.println("Your number was not found.");
        }
    }

    // Function to search for a number in a 2D array
    public static boolean searchArray(int numArray[][] , int num){
        int i = 0;
        // Loop through each row of the 2D array
        while (i < numArray.length){
            int j = 0;
            // Loop through each column in the current row
            while (j < numArray[i].length){
                // Check if the current element matches the number being searched
                if(numArray[i][j] == num ){
                    return true; // Return true if the number is found
                }
                j++; // Move to the next column
            }
            i++; // Move to the next row
        }
        return false; // Return false if the number is not found after checking the entire array
    }
}
