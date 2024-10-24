class DiagonalSumOf2DArray {
    public static void main(String[] args) {
        System.out.println("\n................Diagonal sum of 2D array................\n");

        // Assuming ArrayUtility.input2DArray() is a method to input a 2D array
        int numArray[][] = ArrayUtility.input2DArray();

        // Calculate the sum of the diagonals
        long sum = sumOfDiagonals(numArray);
        System.out.println("Sum of diagonals of 2D array is: " + sum);
    }

    // Method to calculate the sum of the two diagonals of the 2D array
    public static long sumOfDiagonals(int num[][]) {
        long leftSum = sumOfLeftDiagonals(num);   // Sum of the left diagonal
        long rightSum = sumOfRightDiagonals(num); // Sum of the right diagonal
        long sum = leftSum + rightSum;             // Total sum of both diagonals

        // If the matrix is odd-sized, subtract the middle element (counted twice)
        if (num.length % 2 != 0) {
            int index = num.length / 2; // Calculate the index of the middle element
            sum = sum - num[index][index]; // Subtract the middle element from the total
        }
        return sum; // Return the final sum
    }

    // Method to calculate the sum of the left diagonal
    public static long sumOfLeftDiagonals(int num[][]) {
        long sum = 0; // Initialize the sum
        int i = 0;
        // Loop through the array to sum the left diagonal
        while (i < num.length) {
            sum = sum + num[i][i]; // Add the element at (i, i)
            i++;
        }
        return sum; // Return the sum of the left diagonal
    }

    // Method to calculate the sum of the right diagonal
    public static long sumOfRightDiagonals(int num[][]) {
        long sum = 0; // Initialize the sum
        int i = 0;
        // Loop through the array to sum the right diagonal
        while (i < num.length) {
            int col = num.length - 1 - i; // Calculate the column index for the right diagonal
            sum += num[i][col]; // Add the element at (i, col)
            i++;
        }
        return sum; // Return the sum of the right diagonal
    }
}
