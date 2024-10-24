class ReverseArray {
    public static void main(String[] args) {
        // Printing a title message to introduce the purpose of the program
        System.out.println("\n...............Reverse of an Array....................\n");

        // Calling a method from ArrayUtility class to take user input and store it in the 'arr' array
        int arr[] = ArrayUtility.inputArray();

        // Calling the 'reverse' method to reverse the contents of the 'arr' array
        reverse(arr);

        // Printing the reversed array
        System.out.println("Your Reversed Array is: ");

        // Calling a method from ArrayUtility class to display the contents of the array
        ArrayUtility.displayArray(arr);

    }

    // Method to reverse the elements of the input array 'numArr'
    public static void reverse(int numArr[]) {
        // 'i' is initialized to 0 and used to track the index from the start of the array
        int i = 0;

        // The loop runs until the middle of the array is reached (numArr.length/2)
        while (i < numArr.length / 2) {
            // Storing the current element from the front of the array in 'swap'
            int swap = numArr[i];

            // Replacing the current front element with the corresponding element from the end of the array
            numArr[i] = numArr[(numArr.length - 1) - i];

            // Replacing the element from the end of the array with the stored value in 'swap'
            numArr[(numArr.length - 1) - i] = swap;

            // Incrementing 'i' to move to the next index from the front
            i++;
        }
        // Return statement is not necessary here, since the method returns nothing (void)
        return;
    }
}
