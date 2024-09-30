import java.util.Scanner;

class GreatestOfThree {
    public static void main(String[] args) {
        System.out.println("\n...........Greatest Number Among three Numbers..............\n");

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your 1st number: ");
        int a=sc.nextInt();
        System.out.print("Enter your 2nd number: ");
        int b=sc.nextInt();
        System.out.print("Enter your 3rd number: ");
        int c=sc.nextInt();

        //checks condition
        if(a>b && b>c){
            System.out.println(a+" is Greatest Number.");
        }else if(b>c && b>a){
            System.out.println(b+" is Greatest Number.");
        }else{
            System.out.println(c+" is greatest Number.");
        }
    }
}
