import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("\n...............Fibonacci Series..................\n");

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number up to which series has to be printed: ");
        int num=sc.nextInt();

        System.out.println("Here is the Fibonacci Series: ");
        printFibonacciSeries(num);
    }

    public static void printFibonacciSeries(int num){
          int firstNum=0 , secondNum=1;
          if(num<0){
              System.out.print("Please enter a valid Number");
          }
          if(num == 0){
              System.out.print(firstNum+" ");
          }
          if(num>0){
              System.out.print(firstNum+" "+secondNum+" ");
          }
          while(firstNum+secondNum<num){
              int thirdNum=firstNum+secondNum;
              System.out.print(thirdNum+ " ");
              firstNum = secondNum;
              secondNum = thirdNum;
          }
    }
}
