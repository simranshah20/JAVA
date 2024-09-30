import java.sql.SQLOutput;
import java.util.Scanner;

class Grading {
    public static void main(String[] args) {
        System.out.println("\n.............Grade Calculator.................\n");

        Scanner input=new Scanner(System.in);
        System.out.print("Please Enter your percentage: ");
        float per= input.nextFloat();

        if(per>90){
            System.out.println("Great, You have got A Grade");
        }else if(per>=75){
            System.out.println("Good, You have got B Grade");
        }else if(per>=60){
            System.out.println("You have got C Grade,Work harder next time");
        }else if(per>=30){
            System.out.println("You have got D Grade,You seriously need to work harder");
        }else{
            System.out.println("Sorry, You have failed the test and got F Grade,.");
        }
    }
}
