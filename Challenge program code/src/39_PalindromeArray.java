class PalindromeArray {
    public static void main(String[] args) {
        // Display a welcome message for the user
        System.out.println("\n................Welcome to palindrome checker...................\n");

        // Call a method from the ArrayUtility class to input an array of integers
        int numArr[] = ArrayUtility.inputArray();

        // Check if the array is a palindrome by calling the isPalindrome method
        boolean palindrome = isPalindrome(numArr);

        // Print whether the array is a palindrome or not based on the boolean result
        if (palindrome) {
            System.out.println("Your Array is palindrome");
        } else {
            System.out.println("Your array is not palindrome");
        }
    }

    // Method to check if the array is a palindrome
    public static boolean isPalindrome(int numArr[]) {
        int i = 0;  // Initialize a counter to start from the beginning of the array
        // Loop through the first half of the array
        while (i < numArr.length / 2) {
            // Compare the element at the current index with the element at the corresponding position from the end
            if (numArr[i] != numArr[numArr.length - 1 - i]) {
                return false;  // If any mismatch is found, the array is not a palindrome
            }
            i++;  // Move to the next element
        }
        return true;  // If no mismatch is found, the array is a palindrome
    }
}
