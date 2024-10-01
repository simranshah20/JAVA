class parametersInMethod{
    public static void main(String[] args) {

    int num=sumTwoNumbers(4,5);   //here we are passing the values i.e 4 abd 5 which    are arguments
        System.out.println("Sum of Two Numbers are: "+num);

        //we can also write the above code like written below
        System.out.println("\nAnother way of calling method:");
        System.out.println("Sum of two number: "+sumTwoNumbers(8,4));
    }

    //we can return single value at once.
    public static int sumTwoNumbers(int a,int b){   //here we are declaring a nd b which are parameters
        System.out.println("First Number received is: "+a);
        System.out.println("Second Number received is: "+b);

        int sum =a+b;
        return sum;
    }
}