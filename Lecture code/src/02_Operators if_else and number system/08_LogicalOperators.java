import java.util.Scanner;

class LogicalOperators{
    public static void main(String[] args) {
        System.out.println("\n..........Welcome to ticket discount calculator..........\n");

        Scanner input=new Scanner(System.in);
        System.out.print("Please Enter Your age: ");
        int age=input.nextInt();
        System.out.print("Are you a female?(true/false): ");
        boolean isFemale=input.nextBoolean();

        //checks the condition
        if(age<5){   //checks age
            System.out.println("You got 75% discount");
        }else if(isFemale){  //checks gender
            System.out.println("You got 50% discount");
        }else if(age>60 && !isFemale){  //checks if age is greater than 60 and user is male.here AND and NOT operator are used
            System.out.println("You got 25% discount");
        }else{
            System.out.println("You got no discount");
        }
    }
}