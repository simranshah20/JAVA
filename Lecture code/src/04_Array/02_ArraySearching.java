import java.util.Scanner;

class Arraysearching{
    public static void main(String[] args) {
        System.out.println("\n..................Searching in an array.................\n");

        Scanner input=new Scanner(System.in);
        int arr[]={3,4,5,6,89,90,34,23,22,55,66,88};    //initializing array
        System.out.print("Enter the number you want to search: ");
        int num=input.nextInt();

        boolean found=isFound(arr,num);    //method  call
        if(found){
            System.out.println("Your number was found in an array");
        }else{
            System.out.println("your number was not found  in an array");
        }
    }

    public static boolean isFound(int arr[],int number){   //passing array and a number which you want to search
        int index=0;
        while(index<arr.length){
            if(arr[index]==number){     //if number found return true
                return true;
            }
            index++;     //updating index
        }
        return false;
    }
}