import java.util.Scanner;

class AreaOfTraingle {
    public static void main(String[] args) {
        System.out.println("\n......Perimeter of rectangle.......\n");

        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter Base of Triangle in cms: ");
        double base=sc.nextDouble();
        System.out.print("Enter perpendicular height of Triangle in cms: ");
        double height=sc.nextDouble();

        double area=(base*height)/2;
        System.out.println("Area of Triangle in cms is: "+area+" cms2");

    }
}
