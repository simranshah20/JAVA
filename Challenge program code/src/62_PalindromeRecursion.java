import java.util.Scanner;

class PalindromeRecursion {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string to check for palindrome
        System.out.print("Enter the string to be checked: ");
        String str = input.next();  // Read the user input

        // Display the result by calling the isPalindrome method
        System.out.println("Your string is "
                + ((isPalindrome(str) ? " Palindrome " : " Not palindrome")));
    }

    // Recursive method to check if a given string is a palindrome
    public static boolean isPalindrome(String str) {
        // Base case: if the string has 0 or 1 character, it's a palindrome
        if (str.length() <= 1) {
            return true;
        }

        // Calculate the position of the last character in the string
        int lastPosition = str.length() - 1;

        // If the first and last characters don't match, it's not a palindrome
        if (str.charAt(0) != str.charAt(lastPosition)) {
            return false;
        }

        // Create a new substring by removing the first and last characters
        String newStr = str.substring(1, lastPosition);

        // Recursively call the isPalindrome method with the new substring
        return isPalindrome(newStr);
    }
}
