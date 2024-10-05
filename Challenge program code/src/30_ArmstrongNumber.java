import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("\n...........Armstrong Number..............\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        boolean armstrong = isArmstrong(num);
        if (armstrong) {
            System.out.println(num + " is a armstrong number.");
        } else {
            System.out.println(num + " is not a armstrong number");
        }
    }

    public static boolean isArmstrong(int number){    //here in parameter number  copy of num will be passed
        int noOfDigit = numberOfDigits(number);   //got total no. of digits i.e 3

        int numCopy=number;   //get copy of number
        int finalNumber=0;

        while(number>0){      //to find digits one by one
             int lastDigit=number % 10;   //give last digit
            number /= 10;
            finalNumber = finalNumber + pow(lastDigit,noOfDigit);
        }
        return finalNumber==numCopy;
    }

    //find power of digits
    public static int pow(int a,int b){     // here a is for number and b is for power
          int result = 1;   //if user  pass power 1 then result = 1 will be returned

          int i = 0;           //initialization for while loop
          while(i < b){
              result = result * a;    //calculate power
              i++;
          }
          return result;
    }

    //find total number of digits
    public static int numberOfDigits(int num){
        int digits=0;                     //initialization
        while (num > 0){                 //checks the condition
            digits++;                    //digit = 0(initially), digit = 0 (previous value) + 1 = 1(increased by 1)(1st iteration), digit = 1(previous value) + 1(increased by 1) = 2(2nd iteration), digit = 2(previous value) + 1(increased by 1) = 3(3rd iteration)  so, total number of digit = 3
            num/=10;                     //example:- num=15 then num = 153 / 10 = 15(1st iteration),num = 15 / 10 = 1(2nd iteration), num = 1 / 10 = 0(3rd iteration)
        }
        return digits;
    }
}
