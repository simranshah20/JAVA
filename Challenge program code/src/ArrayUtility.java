import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the size of an array: ");
        int size=input.nextInt();     //takes the size of an array  entered by user
        int number[]=new int[size];      //declare the size of an array
        int i=0;
        while(i<size){
            System.out.print("Enter the element "+(i+1)+" : ");
            number[i]=input.nextInt();
            i++;
        }
        return number;
    }
}
