import java.util.Scanner;

class GCD {
    public static void main(String[] args) {
        System.out.println("\n.............Greatest common divisor................\n");

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your 1st number: ");
        int firstNum=sc.nextInt();
        System.out.print("Enter your 2nd number: ");
        int secondNum=sc.nextInt();

        int gcd=gcd(firstNum,secondNum);   //method call
        System.out.println("GCD of "+firstNum+" and "+secondNum+" is: "+ gcd);
    }

    public static int gcd(int num1,int num2) {
         int gcd=1;

         int i=2;
         int least=calculateSmallestNumber(num1,num2);   //method call
        while(i<=least){
            if(num1 % i == 0 && num2 % i == 0){
                gcd=i;       //return greatest gcd
            }
            i++;            //update
        }
        return gcd;
    }

    public static int calculateSmallestNumber(int num1,int num2){
        if(num1<num2){
            return num1;
        }else {
            return num2;
        }
    }
}
