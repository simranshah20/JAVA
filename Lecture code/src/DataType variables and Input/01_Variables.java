class Variables {
    public static void main(String[] args) {
        System.out.println("Integer type");
        int myNumber=55;  //initialization
        System.out.println("initialised Number is "+myNumber);

        int yourNumber;   //declaration
        yourNumber=80;
        System.out.println("Declared Number is "+yourNumber);

        yourNumber=90;  //value replaced
        System.out.println("updated  Number is "+yourNumber);

        System.out.println("\nFloat Type");
        float floatNumber=5;
        float number=10.0f;
        System.out.println("Float Number 1: "+floatNumber);
        System.out.println("Float Number 2:"+number);

        System.out.println("\nDouble Type");
        double myNum=56.87866;
        System.out.println("Double Type: "+myNum);

        System.out.println("\nBoolean Type");
        boolean isVegeterian=true;
        System.out.println(isVegeterian);

        System.out.println("\nString Type");
        String myString="How are you?";
        System.out.println("String: "+myString);

        System.out.println("\nCharacter Type");
        char myCharacter='S';   //only single character can be defined.
        System.out.println("Character: "+myCharacter);
    }

}
