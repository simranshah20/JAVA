import java.util.Scanner;

class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("\nSwapping of two numbers\n");

        System.out.print("Enter First Number: ");  //asks user to enter number
        int firstNum=input.nextInt();  //takes input from user
        System.out.print("Enter  Second Number: ");
        int secondNum=input.nextInt();
        System.out.println("\nFirst Number Before swapping: "+firstNum);
        System.out.println("Second Number Before swapping: "+secondNum);
        int temp=firstNum;
        firstNum=secondNum;
        secondNum=temp;
        System.out.println("Swapping done.....\n");
        System.out.println("First Number After Swapping: "+firstNum);
        System.out.println("Second Number After Swapping: "+secondNum);
    }
}
