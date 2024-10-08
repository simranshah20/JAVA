class ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("\n...............Array Sum and average.................\n");

        int numArray[]=ArrayUtility.inputArray();     //accessing inputArray(static) using ArrayUtility class to take input from user

        long sum=sum(numArray);      //method call
        double avg=average(numArray);   //method call

        System.out.println("Sum of the number is: "+sum);
        System.out.println("Average if the number is: "+avg);
    }

    //find sum of the numbers
    public static long sum(int numArray[]){
        long sum=0;
        int i=0;
        while (i<numArray.length){
            sum+=numArray[i];
            i++;
        }
        return sum;
    }

    //find average of the numbers
    public static double average(int numArray[]){
         double sum=sum(numArray);    //calling sum method
        return (sum/numArray.length);      //return average of numbers
    }
}
