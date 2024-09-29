class ArithmeticOperator{
    public static void main(String[] args) {
        System.out.println("....Arithmetic operator....");
        int a=9;
        int b=4;
        System.out.println("Addition: "+(a+b));
        System.out.println("Subtraction: "+(a-b));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Division: "+(a/b));   //result will be in int i.e Division: 2
        System.out.println("Modulo: "+(a%b));  //modulo is only used in int type. Modulo mean remainder

        double x=6;
        double y=4;
        //result will be double type
        System.out.println("\nAddition: "+(x+y));
        System.out.println("Subtraction: "+(x-y));
        System.out.println("Multiplication: "+(x*y));
        System.out.println("Division: "+(x/y));   //result will be in decimal i.e Division: 1.5

    }
}