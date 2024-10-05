import java.util.Scanner;

class LCM {
    public static void main(String[] args) {
        System.out.println("\n...........Lowest Common Factor............\n");

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your 1st number Digit: ");
        int firstNum=sc.nextInt();
        System.out.print("Enter your 2nd number Digit: ");
        int secondNum=sc.nextInt();

        int lcm=lcm(firstNum,secondNum);   //method call
        System.out.println("Lcm of "+firstNum+" and "+secondNum+" is: "+lcm);
    }

    public static int lcm(int firstNum,int secondNum){
        int i=1;                            //initialize
        while(i<=secondNum){                //checks condition, or we can write while(true){} instead of (i<=secondNum){}
            int factor = firstNum * i;      //checks condition for table of 1st number
            if(factor % secondNum == 0) {   //checks the condition if factor modulo secondNumber is equal to zero or not,if yes then return factor
                return factor;              //return factor (LCM)
            }
            i++;                            //update i
        }
        return 0;                           //unreachable
    }
}
