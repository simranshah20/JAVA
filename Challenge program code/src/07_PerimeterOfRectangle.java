import java.util.Scanner;

class PerimeterOfRectangle {
    public static void main(String[] args) {
        System.out.println("\n......Perimeter of rectangle.......\n");

        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter length of rectangle in cm: ");
        double l=sc.nextDouble();
        System.out.print("Enter width of rectangle in cm: ");
        double w=sc.nextDouble();

        double p=2*(l+w);
        System.out.println("Perimeter of rectangle in cm is: "+p+" cm");

    }
}
