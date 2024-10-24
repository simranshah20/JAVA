class SumAndAvgOf2DArray {
    public static void main(String[] args) {
        // Welcome message
        System.out.println("\n.................Sum and average of 2D array......................\n");

        // Input 2D array using ArrayUtility class (assumed defined elsewhere)
        int numArray[][] = ArrayUtility.input2DArray();

        // Call add method to calculate the sum of the 2D array elements
        long sum = add(numArray);

        // Output the sum
        System.out.println("Sum of the array is: " + sum);

        // Call average method to calculate the average of the 2D array elements
        double avg = average(numArray);

        // Output the average
        System.out.println("Average of the array is: " + avg);
    }

    // Method to calculate the sum of elements in a 2D array
    public static long add(int numArr[][]) {
        long sum = 0; // Use long to store the sum, as sum could be large

        // Loop through each row of the 2D array
        for (int i = 0; i < numArr.length; i++) {
            // Loop through each element in the current row
            for (int j = 0; j < numArr[i].length; j++) {
                sum += numArr[i][j]; // Add each element to the sum
            }
        }
        return sum; // Return the total sum
    }

    // Method to calculate the average of elements in a 2D array
    public static double average(int numArr[][]) {
        // Check if the array is empty, return 0 to avoid division by zero
        if (numArr.length == 0) {
            return 0;
        }

        // Get the number of rows and columns in the 2D array
        int rows = numArr.length;
        int cols = numArr[0].length;

        // Calculate the total number of elements in the 2D array
        double size = rows * cols;

        // Cast the sum to double for floating-point division and return the average
        return (double) add(numArr) / size;
    }
}
