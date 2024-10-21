class MaxMinArray {
    public static void main(String[] args) {
        System.out.println("\n....................Welcome to max and min..............................\n");

        int arr[]=ArrayUtility.inputArray();    //takes input from user

        int maxNum=max(arr);    //method call
        int minNum=min(arr);    //method call

        System.out.println("Max of the array is: "+maxNum);
        System.out.println("Min of the array is: "+minNum);
    }

    public static int max(int arr[]){    //method

        if(arr.length==0){
            return Integer.MAX_VALUE;    //here Integer ia a class provided by java in which MIN_VALUE is a constant
        }
        int max=arr[0];
        int i=1;
        while(i < arr.length){    //checks condition
            if(max < arr[i]){     //checks condition if maximum number is smaller than particular number in an array
                max = arr[i];
            }
            i++;
        }
        return max;
    }

    public static int min(int arr[]){      //method
        int min=Integer.MAX_VALUE;     //here Integer ia a class provided by java in which MAX_VALUE is a constant
        int i=0;
        while(i < arr.length){
            if(min > arr[i]){
                min = arr[i];
            }
            i++;
        }
        return min;
    }
}
