class MaxArray {
    public static void main(String[] args) {
        // Call the inputArray method from ArrayUtility class to get the array of numbers
        int arr[] = ArrayUtility.inputArray();

        // Initialize the variable 'max' to the smallest possible integer value
        // This ensures that any number in the array will be larger than this initial value
        int max = Integer.MIN_VALUE;

        // Loop through each number in the array 'arr'
        for (int num : arr) {
            // If the current number is larger than the current max, update max
            if (max < num) {
                max = num;
            }
        }

        // After the loop, print out the maximum number found in the array
        System.out.println("Maximum number is: " + max);
    }
}
