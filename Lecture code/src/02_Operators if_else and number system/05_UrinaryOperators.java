class UrinaryOperators{
    public static void main(String[] args) {
        int x=10;
        System.out.println("\n......Urinary Operators......\n");
        System.out.println("Number is: "+x);
        int y=-x; //converts positive number to negative  number i.e 10 to -10
        System.out.println("Positive number to Negative number: "+y);
        int z=-y;  //convert -10 to -(-10)=10
        System.out.println("Negative number to  positive number: "+z);

        int s=7;
        ++s;   //pre increment mean increment the value by 1 and then use it in our statement
        System.out.println("\nPre Increment: "+s);
        s++;  //post increment  mean use current value in the statement and then increment it by 1
        System.out.println("Post increment: "+s);

        --s;   //pre decrement mean decrement the value by 1 and then use it in our statement
        System.out.println("\nPre decrement: "+s);
        s--;  //post decrement  mean use current value in the statement and then decrement it by 1
        System.out.println("Post decrement: "+s);
    }
}