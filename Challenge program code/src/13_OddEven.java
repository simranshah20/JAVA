import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        System.out.println("\n............checks number is odd or even...............\n");

        Scanner input=new Scanner(System.in);
        System.out.print("Enter  your Number: ");
        int num=input.nextInt();

        if(num%2==0){  //condition for even number
            System.out.println(num+" is even number");
        }else{
            System.out.println(num+" is odd number");
        }
    }
}
