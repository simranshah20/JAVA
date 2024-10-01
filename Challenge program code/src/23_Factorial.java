import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        System.out.println("\n..............Factorial of a number...............\n");

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter you number: ");
        int num=sc.nextInt();

        long factorial=calculateFactorial(num);    //method call
        System.out.println("Factorial of "+num+" is: "+factorial);

    }

    public static long calculateFactorial(int num){
        int i=2;
        if(num<2){
            return 1;
        }
        long fact=1;         //initialisation
        while(i<=num){       //checks the condition up to given number
            fact=fact*i;     //when i=2 then fact=1*2=2(1st iteration),i=3 then fact=2*3=6(2nd iteration),i=4 then fact=6*4=24(3rd iteration),.........
            i++;             //update
        }
        return fact;
    }
}
