class MergeTwoSortedArray {
    public static void main(String[] args) {
        System.out.println("\n...................Merging Two Sorted Array....................\n");

        int numArray1[] = ArrayUtility.inputArray();
        int numArray2[] = ArrayUtility.inputArray();

        int mergedArray[] = merge(numArray1 , numArray2);
        System.out.println("Your merged array is: ");
        ArrayUtility.displayArray(mergedArray);

    }
    public static int[] merge(int arr1[], int arr2[]){
        int newSize= arr1.length + arr2.length;
        int newArray[] = new int[newSize];

        int i = 0 , j = 0 , k = 0;
        while (i < arr1.length || j < arr2.length){
            if(j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])){
                newArray[k] = arr1[i];
                i++;
                k++;
            }else{
                newArray[k] = arr2[j];
                k++;
                j++;
            }
        }
        return newArray;
    }
}
