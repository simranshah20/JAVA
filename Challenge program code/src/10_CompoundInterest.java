import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        System.out.println("\n......Simple Interest.......\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("\nPlease enter your Principle amount Rs: ");
        int p = sc.nextInt();
        System.out.print("Now, tell me for how many years are you borrowing this money: ");
        float t = sc.nextFloat();
        System.out.print("Now, tell me your rate of Interest: ");
        float r = sc.nextFloat();

        double interest = p * Math.pow((1 + r / 100), t);
        System.out.println("\nYour Compound Interest is RS: " + interest);
    }
}
