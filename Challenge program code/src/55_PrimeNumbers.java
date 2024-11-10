import java.util.Scanner;

class PrimeNumbers {
    public static void main(String[] args) {
        // Print heading for the prime number check
        System.out.println("\n.................Check number is prime or not.................\n");

        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter your number: ");
        int num = sc.nextInt();  // Read the number entered by the user

        // Call the isPrime method to check if the number is prime
        boolean prime = isPrime(num);

        // If the number is prime, print a success message, else print that it's not prime
        if (prime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        // Loop through numbers from 2 to num-1 to check if num is divisible by any of them
        for (int i = 2; i < num; i++) {
            // If num is divisible by i, it's not a prime number
            if (num % i == 0) {
                return false;
            }
        }
        // If no divisors were found, the number is prime
        return true;
    }
}
