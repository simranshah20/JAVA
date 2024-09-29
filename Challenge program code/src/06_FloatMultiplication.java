import java.util.Scanner;

class FloatMultiplication {
    public static void main(String[] args) {
        System.out.println("\n.........Float Multiplication........\n");

        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter your 1st number: ");
        float a=sc.nextFloat();
        System.out.print("Enter your 2nd number: ");
        float b=sc.nextFloat();

        System.out.println("Multiplication of two Float numbers is: "+(a*b));
    }
}
