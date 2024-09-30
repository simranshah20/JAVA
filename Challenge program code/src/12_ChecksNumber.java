import java.util.Scanner;

class ChecksNumber {
    public static void main(String[] args) {
        System.out.println("\n.........Checks whether the number is positive,negative or Zero...........\n");

        Scanner input=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num=input.nextInt();

        if(num>0){  //checks number is positive
            System.out.println(num+" is positive number.");
        }else if(num==0){  //checks number is zero
            System.out.println(num+" is zero.");
        }else{
            System.out.println(num+" is negative number.");
        }
    }
}
