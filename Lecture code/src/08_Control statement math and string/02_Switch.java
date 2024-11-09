import java.util.Scanner;

class Switch{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to day of the week detector\n");
        System.out.print("Enter your day in number: ");
        int day = input.nextInt();

        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
//            case 8:   //this is called as fall through where we do not write break
//            case 9:
//                System.out.println("Holiday");
            default:
                System.out.println("Invalid Day");
                break;
        }
    }
}