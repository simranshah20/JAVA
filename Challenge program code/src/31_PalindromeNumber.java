import java.util.Scanner;

class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("\n.................checks number is palindrome or not....................\n");

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Digit: ");
        int num=sc.nextInt();

        boolean palindrome=isPalindrome(num);
        if (palindrome) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number");
        }
    }

    public static boolean isPalindrome(int num){
        int reverse=reverseOfDigits(num);      //called reverseOfDigits method
        return num==reverse;           //checks number is palindrome or not
    }


    //find reverse of number
    public static int reverseOfDigits(int digit) {
        int newDigit = 0;                          //initially sum = 0
        while(digit>0){                            //checks the condition until digit is greater than zero
            int rem = digit % 10;                  //example;- digit=543 then rem = 543 % 10 = 3(1st iteration), rem = 54 % 10 = 4 (2nd iteration), rem = 5 % 10 = 5 (3rd iteration)
            newDigit =  newDigit * 10 + rem;       //newDigit = 0 * 10 + 3(rem)(1st iteration) , sum = 3 * 10 + 4(rem) = 34 (2nd iteration) , sum = 34 * 10  + 5(rem) = 345 (3rd iteration)
            digit=digit/10;                        //example:- digit = 543 then digit = 543 / 10 = 54(1st iteration), digit = 54 / 10 = 5 (2nd iteration), digit = 5 / 10 = 0 (3rd iteration)
        }
        return newDigit;
    }
}
