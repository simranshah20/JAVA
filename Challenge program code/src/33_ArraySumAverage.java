import java.util.Scanner;

class ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("\n...............Array Sum and average.................\n");

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the size of an array: ");
        int size=input.nextInt();     //takes the size of an array  entered by user
        int num[]=new int[size];      //declare the size of an array
        int i=0;
        while(i<size){
            System.out.println("Enter the element "+(i+1)+" : ");
            num[i]=input.nextInt();
            i++;
        }
    }
}
