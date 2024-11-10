import java.util.Scanner;

class DoWhile {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Uncommented Code: Using do-while loop to validate age input_

        // Variable to store the user's age
        int age;

        // The do-while loop will run at least once, prompting the user for a valid age
        do {
            System.out.print("Enter your age: ");
            age = input.nextInt(); // Read age input from the user
        } while (age < 0 || age > 100); // Repeat if the age is less than 0 or greater than 100

        // Display the valid age entered by the user
        System.out.println("Your age is: " + age);

        /* Commented Code: Using while loop to validate age input
           Uncomment this section if you prefer to use a while loop for validation.

        System.out.print("Enter your age: ");
        int age = input.nextInt(); // Read initial age input from the user

        // Continue prompting for age until a valid value is entered
        while(age < 0 || age > 100) {
            System.out.print("Enter your age: ");
            age = input.nextInt(); // Read age input again if the previous entry was invalid
        }

        // Display the valid age entered by the user
        System.out.println("Your age is: " + age);
        */
    }
}
