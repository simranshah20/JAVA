import java.util.Scanner;

class OddEvenBitwise {
    public static void main(String[] args) {
        System.out.println("\n...............Odd/Even Bitwise calculator....................\n");

        Scanner input=new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num=input.nextInt();

        if((num & 1) == 1){
            System.out.println(num+" is odd number.");
        }else{
            System.out.println(num+" is even number.");
        }
    }
}
