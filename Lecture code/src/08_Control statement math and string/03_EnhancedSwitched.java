import java.util.Scanner;

class EnhancedSwitched{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to day of the week detector\n");
        System.out.print("Enter your day in number: ");
        int day = input.nextInt();
        String output = switch (day){
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid day";
        };
        System.out.println(output);
    }
}