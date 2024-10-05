class Array{
    public static void main(String[] args) {
        System.out.println("\n...............Array................\n");

        int myArr[]=new int[5];      //initializing array and size of array
        myArr[0]=10;
        myArr[1]=100;
        myArr[3]=45;
        myArr[4]=89;
        myArr[2]=33;
        System.out.println("Number at 2nd position: "+myArr[1]);
        System.out.println("Number at 3rd position: "+myArr[2]);
        System.out.println("Number at 4th position: "+myArr[3]);
        System.out.println("Number at 5th position: "+myArr[4]);
        System.out.println("Number at 1st position: "+myArr[0]);

        System.out.println("\nArray using Loop:");
        arrayUsingLoop();
    }
    public static void arrayUsingLoop(){
        //Array traversal
        int myArr[]={34,55,67,90,45,12};
        int index=0;   //initialization for loop
        while(index<myArr.length){     //here myArr.length gives the size of array
            System.out.print(myArr[index]+"\t");
                index++;     //Update
        }
    }
}