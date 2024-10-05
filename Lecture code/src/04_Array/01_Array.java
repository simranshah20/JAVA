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

        System.out.println("\nStrings in array:");
        arrayForString();
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

    public static void arrayForString(){
        String strArr[]=new String[5];
        strArr[0]="Helllo";
        strArr[1]="Everyone";
        System.out.println(strArr[0]+"\t"+strArr[1]);
        System.out.println("Size of an array is: "+strArr.length);

        //another way of initializing array
        String myString[]={"How are you?","I am Simran Shah"};
        System.out.println("\nsize of  an array is: "+myString.length);
    }
}