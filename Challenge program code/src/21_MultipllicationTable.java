import java.util.Scanner;

class MultipllicationTable {
    public static void main(String[] args) {
        System.out.println("\n...............Welcome to multiplication world.................\n");

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  Your Number: ");
        int num=sc.nextInt();

        System.out.println("Table of "+num+" is: \n");
        printMultiplicationTable(num);    //method call

    }

    public static void printMultiplicationTable(int num){     //parameterised method
            int i=1;   //initialization
            while(i<=10){     //checks condition unless  i=10
                System.out.println(+num+" X "+i+" = "+(num*i));
                i++;   //Update
            }
    }
}
