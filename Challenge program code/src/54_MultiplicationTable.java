import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to print table of: ");
        int num = input.nextInt();

        for(int i = 1;i < 11;i++){
            System.out.println(num+" X "+i+" = "+num*i);
        }
    }
}
