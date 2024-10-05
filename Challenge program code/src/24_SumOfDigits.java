import java.util.Scanner;

class SumOfDigits{
    public static void main(String[] args) {
        System.out.println("\n................Sum of Digits..................\n");

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Digit: ");
        int digit=sc.nextInt();

        System.out.println("Sum of digit ( "+digit+" ) is: "+sumOfDigits(digit));
    }

    public static int sumOfDigits(int digit) {
      int sum=0;             //initially sum = 0
      while(digit>0){        //checks the condition until digit is greater than zero
          int rem=digit%10;  //example;- digit=543 then rem = 543 % 10 = 3(1st iteration), rem = 54 % 10 = 4 (2nd iteration), rem = 5 % 10 = 5 (3rd iteration)
          sum=sum+rem;       //sum=0 + 3(rem)(1st iteration) , sum = 3 + 4(rem) = 7 (2nd iteration) , sum = 7 + 5(rem) = 12 (3rd iteration)
          digit=digit/10;    //example:- digit = 543 then digit = 543 / 10 = 54(1st iteration), digit = 54 / 10 = 5 (2nd iteration), digit = 5 / 10 = 0 (3rd iteration)
      }
        return sum;
    }

}