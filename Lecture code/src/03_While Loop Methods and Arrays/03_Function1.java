class Function1{
    public static void main(String[] args) {
        System.out.println("In main method");
        greetUser();   //calling method
        System.out.println("Method calling complete.");
        System.out.println("\nMethod calling 2nd time.");
        greetUser(); //calling method 2nd time
    }

    //greetUser is a method and method must be written inside the class
    //In other programming language method is called as function.
    //Naming convention for method is camelCase
    public static void greetUser(){    //void is not return type
        System.out.println("Welcome to JAVA world.");
    }
}