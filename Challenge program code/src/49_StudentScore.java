import java.util.Scanner;

class StudentScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter a number
        System.out.print("Enter your marks: ");
        int marks = input.nextInt();
        String result = marks > 80 ? "High" : (marks > 50 ? "Moderate" : "Low");
        System.out.println("Your score is: "+result);
    }
}
