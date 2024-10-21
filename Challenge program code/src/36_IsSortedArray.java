class IsSortedArray {
    public static void main(String[] args) {
        System.out.println("\n.................Checks Array is Sorted or not...................\n");

        int arr[]=ArrayUtility.inputArray();

        boolean isInc = isIncreasing(arr);       //method call
        boolean isDec = isDecreasing(arr);       //method call

        if(isInc || isDec ){
            System.out.println("Your Array is sorted.");
        }else{
            System.out.println("Your Array is not sorted.");
        }

    }
    public static boolean isIncreasing(int num[]){
        int i = 1;   //initial index
        while(i < num.length){     //checks condition from first element to last element
            if(num[i] < num[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasing(int num[]){
        int i = 1;   //initial index
        while(i < num.length){     //checks condition from first element to last element
            if(num[i] > num[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
