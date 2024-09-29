class OrderOfOperation{
    public static void main(String[] args) {
        System.out.println("\n....Order of operations....\n");
        // -> B(bracket()) O(order) D(Divide) M(Multiply) A(Addition) S(Subtraction)
        System.out.println(9/3/3);   //preference always left to right i.e 9/3/3 -> 9/3=3 -> 3/3=1
        System.out.println(9/(3/3+2));  //in this case preference is bracket() i.e 9/(3/3+2) -> (3/3+2)=(1+2)=3 -> 9/3=3
         }
}