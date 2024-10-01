import java.util.Scanner;

class SumOfOddNumbers {
    public static void main(String[] args) {
        System.out.println("\n......................Sum Of odd Numbers............................\n");

        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number  up to which you want to sum: ");
        int num=input.nextInt();

        int sum=printOddSum(num);    //method call
        System.out.println("Sum of odd numbers up to "+num+" is: "+sum);
    }
    public static int printOddSum(int num){   //parameterised method
        int sum=0;    //initially sum is 0
         int i=1;
         while(i<=num){  //checks the condition up to given number
             sum=sum+i;   //value of i is added to previous value of sum i.e sum=0+1=1(at 1st iteration),sum=1+2=3(at 2nd iteration),sum=3+2=5........
             i=i+2;   //value of i  is increased by 2 so that  we can get an odd number
         }
          return sum;
    }
}
