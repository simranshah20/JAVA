class SumOfPositiveNumbers {
    public static void main(String[] args) {
        // Accessing the inputArray method (assumed to be in ArrayUtility class)
        // to get the array of numbers entered by the user
        int arr[] = ArrayUtility.inputArray();

        // Initialize sum to 0, which will be used to accumulate the sum of positive numbers
        int sum = 0;

        // Loop through each number in the array using a for-each loop
        for (int num : arr) {
            // If the number is negative, skip it and move to the next iteration
            if (num < 0) {
                continue;
            }

            // Add the positive number to the sum
            sum = sum + num;
        }

        // After the loop, print the total sum of the positive numbers
        System.out.println("The sum of positive numbers is: " + sum);
    }
}
