class TwoDimensionalArray{
    public static void main(String[] args) {
        System.out.println("\n...................Two Dimensional Array.....................\n");

        int arr[][]={{6,7,9},{1,2,3},{9,87,7}};   //1st way to initialize array.it is homogenous array because no. of rows = no.of column
        System.out.println("\nSize of 1st array is: "+arr.length);

        int myArr[][]=new int[5][4];    //2nd way to initialize array where [5] mean no. of rows and [4] mean no. of columns
        myArr[0][1]=56;
        System.out.println("Size of 2nd Array is: "+myArr[0].length+"\n");

        //traversing 2D array
        int i=0;    //here i represents no. of rows and initializing the value at 1st
        while (i<arr.length){
            int j=0;     //here j represents no. of column and initializing the value at 1st
            while (j<arr[i].length) {      //arr[i].length mean size of row
                System.out.print(arr[i][j]+" ");
                j++;
            }
            System.out.println();  //for new line
          i++;
        }
    }
}