import java.util.Scanner;

class ShortHandOperator{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("\n....Shorthand Operato....\n");
        int x=5;
        System.out.print("Enter a number: ");
        int a=input.nextInt();
        a+=x;   //a=a+x
        System.out.println("Number after adding "+x+" : "+a);

        System.out.print("Enter a number: ");
        int b=input.nextInt();
        b-=x;  //b=b-x
        System.out.println("Number after subtracting "+x+" : "+b);

        System.out.print("Enter a number: ");
        int c=input.nextInt();
        c*=x;  //b=b*x
        System.out.println("Number after multipling by  "+x+" : "+c);

        System.out.print("Enter a number: ");
        int d=input.nextInt();
        d/=x;  //d=d/x
        System.out.println("Number after dividing by "+x+" : "+d);

        System.out.print("Enter a number: ");
        int e=input.nextInt();
        e%=x;  //d=d%x
        System.out.println("Number after modulo by "+x+" : "+e);

    }
}