import java.util.Scanner;

class NumberOfOccuranceInArray {
    public static void main(String[] args) {
        System.out.println("\n.................Find Number of occurrences in an array....................\n");

        Scanner input=new Scanner(System.in);
        int arrNum[]=ArrayUtility.inputArray();         //accessing inputArray(static) using ArrayUtility class to take input from user
        System.out.print("Enter the number you want to find: ");
        int num=input.nextInt();

        int occurrences=noOfOccurances(arrNum,num);     //method call
        System.out.println("Your element was found "+occurrences+" times in the array");
    }

    //
    public static int noOfOccurances(int arrNum[],int num){
        int occurrence=0;
        int i=0;
        while(i<arrNum.length){
            if(arrNum[i]==num){
                occurrence++;
            }
            i++;
        }
        return occurrence;
    }
}
