import java.util.Scanner;

class RelationalOperators{
    public static void main(String[] args) {
        System.out.println("\n.......Relational Operators.......\n");

        Scanner input=new Scanner(System.in);
        System.out.println("\n Welcome to driving licence prortal......");
        System.out.print("Please enter your age: ");
        int age=input.nextInt();

        if(age>=18){   //checks the condition
            System.out.println("You are eligible to drive.");
        }else{
            System.out.println("You are not eligible.");
        }
    }
}