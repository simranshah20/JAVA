import java.util.Scanner;

class DeleteFromArray {
    public static void main(String[] args) {
        System.out.println("\n..............Deleting an element from array..................\n");

        int arr[] = ArrayUtility.inputArray();   //takes input from user

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to delete: ");
        int numToDelete = sc.nextInt();

        int newArr[] = deleteNumber(arr , numToDelete);
        System.out.println("Here is your new array after deletion: ");

        //display new array
        System.out.println("Here is a new array");
        ArrayUtility.displayArray(newArr);    //method call from another file i.e ArrayUtility to display data
    }

    public static int[] deleteNumber(int num[] , int numToDelete){
        int occ = NumberOfOccuranceInArray.noOfOccurances(num,numToDelete);     //calling method from another file i.e NumberOfOccuranceInArray to check number of occurrences
        if(occ == 0){    //if we not found that number which we want to delete than return num
            return num;
        }
        int newSize = num.length - occ;    //define new size of an array
        int newArr[] = new int[newSize];   //created new array of having new size

        int i = 0 , j = 0;
        while(i < num.length){
            if(num[i] != numToDelete){
                newArr[j] = num[i];    //here newArr is new array created to store copy element of old array i.e num
                j++;
            }
            i++;
        }
        return  newArr;
    }

}

