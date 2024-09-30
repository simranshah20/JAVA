import java.util.Scanner;

class BitWiseOperators {
    public static void main(String[] args) {
        System.out.println("\n...............Bitwise Operators...............\n");

        Scanner input=new Scanner(System.in);
        System.out.print("Enter your First Number: ");
        int firstNum=input.nextInt();
        System.out.print("Enter Your second Number: ");
        int secondNum=input.nextInt();

        System.out.println("Result of "+firstNum+" AND "+secondNum+" is: "+(firstNum & secondNum));
        System.out.println("Result of "+firstNum+" OR "+secondNum+" is: "+(firstNum | secondNum));
        System.out.println("Result of "+firstNum+" XOR "+secondNum+" is: "+(firstNum ^ secondNum));
        System.out.println("Complement of "+firstNum+" is: "+(~firstNum));
        System.out.println("Complement of "+secondNum+" is: "+(~secondNum));
        System.out.println("Left shift(<<) of "+firstNum+" is: "+(firstNum<<2));
        System.out.println("Left shift(<<) of "+secondNum+" is: "+(secondNum<<2));
        System.out.println("Right shift(>>) of "+firstNum+" is: "+(firstNum>>2));
        System.out.println("Right shift(>>) of "+secondNum+" is: "+(secondNum>>2));

    }
}
