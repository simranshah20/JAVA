import java.util.Scanner;

class AddTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Addition of two numbers ");
        System.out.print("Enter Your first Number: ");
        Scanner input=new Scanner(System.in);
        int firstNum=input.nextInt();
        System.out.print("Enter Your Second Number: ");
        int secondNum=input.nextInt();
        int sum=firstNum+secondNum;
        System.out.print("Additon of "+firstNum+" and "+secondNum+" is: "+sum);

    }
}
