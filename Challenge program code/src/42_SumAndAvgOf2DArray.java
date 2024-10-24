class SumAndAvgOf2DArray {
    public static void main(String[] args) {
        // Welcome message
        System.out.println("\n.................Sum and average of 2D array......................\n");

        // Input 2D array (assuming ArrayUtility is defined elsewhere)
        int numArray[][] = ArrayUtility.input2DArray();

        // Calculate and print the sum of the array
        long sum = add(numArray);
        System.out.println("Sum of the array is: " + sum);

        // Calculate and print the average of the array
        double avg = average(numArray);
        System.out.println("Average of the array is: " + avg);
    }

    // Method to calculate the sum of the elements in a 2D array
    public static long add(int numArr[][]) {
        long sum = 0; // Changed to long to handle large sums
        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr[i].length; j++) {
                sum += numArr[i][j];
            }
        }
        return sum;
    }

    // Method to calculate the average of the elements in a 2D array
    public static double average(int numArr[][]) {
        if (numArr.length == 0) {
            return 0; // Return 0 if the array is empty to avoid division by zero
        }
        int rows = numArr.length;
        int cols = numArr[0].length;
        double size = rows * cols; // Total number of elements in the 2D array

        // Cast the sum to double for floating-point division
        return (double) add(numArr) / size;
    }
}
