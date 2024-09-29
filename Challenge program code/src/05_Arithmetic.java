import java.util.Scanner;

class Arithmetic {
    public static void main(String[] args) {
        System.out.println("\n......Arithmetic Calculator.......\n");
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter your 1st number: ");
        int a=sc.nextInt();
        System.out.print("Enter your 2nd number: ");
        int b=sc.nextInt();

        System.out.println("Addition of "+a+" and "+b+" is: "+(a+b));
        System.out.println("Subtraction of "+a+" and "+b+" is: "+(a-b));
        System.out.println("Multiplication of "+a+" and "+b+" is: "+(a*b));
        System.out.println("Division of "+a+" and "+b+" is: "+(a/b));
        System.out.println("Modulo of "+a+" and "+b+" is: "+(a%b));
    }
}
