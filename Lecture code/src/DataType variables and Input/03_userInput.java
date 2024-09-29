import java.util.Scanner;

class userInput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);   //object declaration for user's input
        System.out.print("Please Enter your Name: ");
        String name=input.nextLine();   //stores entered name by user in name variable.nextLine() is used for string
        System.out.println("Good Morning "+name);
        System.out.print(name+" , Also  tell me your age: ");
        int age=input.nextInt();
        System.out.println(name +" , your age is: "+age);   //nextInt() is used for integer

    }
}
