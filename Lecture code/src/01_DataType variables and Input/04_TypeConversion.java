class TypeConversion {
    public static void main(String[] args) {
        int myNumber=5;
        System.out.println("Number is: "+myNumber);

        System.out.println("\nInteger type to Float type");
        float myFloat=5;  //emplicit conversion/coercion(widening).converting int to float
        System.out.println("Int to Float: "+myFloat);

        float myNum=10L;  //emplicit conversion/coercion(widening).Converting long type to float
        System.out.println("\nLong to Float: "+myNum);

        int myInt=(int)66.0f;//explicit conversion/casting(narrowing).converting float to Int
        System.out.println("Float to Int: "+myInt);

    }
}