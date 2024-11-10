import java.util.Scanner;

class PrintEvenNumber {
    public static void main(String[] args) {
        // Uncomment this section to take an array input and print even numbers from the array
//        int arr[] = ArrayUtility.inputArray();  // Assumes ArrayUtility.inputArray() takes array input
//        for (int num : arr) {
//            if (num % 2 != 0) {  // If the number is odd, skip to the next iteration
//                continue;
//            }
//            System.out.print(num + " ");  // Print the even number
//        }

        // Another way: Printing even numbers up to a specified limit
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number up to which even numbers will be printed
        System.out.print("Enter the number up to which you want to print even numbers: ");
        int num = input.nextInt();

        // Loop through numbers from 1 to the specified limit (exclusive)
        for (int i = 1; i < num; i++) {
            // If the number is odd, skip it and move to the next iteration
            if (i % 2 != 0) {
                continue;
            }
            // Print the even number
            System.out.print(i + " ");
        }
    }
}
