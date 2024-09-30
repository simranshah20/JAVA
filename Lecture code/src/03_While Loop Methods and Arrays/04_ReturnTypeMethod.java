import java.util.Scanner;

class ReturnTypeMethod{
    public static void main(String[] args) {
        statement();
        int firstNum=readNumber();  //number which is entered by user's for the 1st time is assigned to firstNum.
        int secondNum=readNumber(); //number which is entered by user's for the 2nd time is assigned to secondNum.

        int sum = firstNum+secondNum;  //add both number
        System.out.println("Sum of "+firstNum+" and "+secondNum+" is: "+sum);
    }

    public static void statement(){
        System.out.println("...........sum of two numbers.............");
    }

    /*This method is integer return type.
     this methods take input from user.
    */
    public static int readNumber(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Your number: ");
        int number=input.nextInt();
        return number;   //return the number  enter by user
    }
}