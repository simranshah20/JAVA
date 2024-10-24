class ReverseArray {
    public static void main(String[] args) {
        System.out.println("\n...............Reverse of an Array....................\n");

        int arr[] = ArrayUtility.inputArray();   //takes input from user

        reverse(arr);     //method call
        System.out.println("Your Reversed Array is: ");
        ArrayUtility.displayArray(arr);

    }
    public static void reverse(int numArr[]){
        int i = 0;
        while(i < numArr.length/2){
            int swap = numArr[i];
            numArr[i] = numArr[(numArr.length - 1)-i];
            numArr[(numArr.length - 1)-i] = swap;
            i++;
        }
        return;
    }
}
