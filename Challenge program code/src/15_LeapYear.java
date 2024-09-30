import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        System.out.println("\n................Checks Leap Year................\n");

        Scanner input=new Scanner(System.in);
        System.out.print("Please Enter the Year that you want to check: ");
        int  year=input.nextInt();

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(year+" is a leap year.");
        }else{
            System.out.println(year+" is not a leap year.");
        }
    }
}
