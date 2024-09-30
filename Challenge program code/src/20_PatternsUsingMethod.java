class PatternsUsingMethod {
    public static void main(String[] args) {
        System.out.println("\n............Patterns Using Method.............\n");
        printFirstPattern();
        firstPatternUsingLoop();
        printSecondPattern();
        printThirdPattern();
    }
    public static void printFirstPattern(){
        System.out.println("First Pattern");
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *");
    }
    public static void firstPatternUsingLoop(){
        System.out.println("\n First pattern using loop");

        int rows=0;
        while(rows < 10){  //checks condition until rows is less than 5
            System.out.print("*");
            int cols=0;
            while(cols < rows){    //checks condition until cols is less than rows
                System.out.print(" *");
                cols++;
            }
            System.out.println();  //for new line
            rows++;
        }
    }
    public  static void printSecondPattern(){
        System.out.println("\nSecond Pattern");
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");
    }
    public static void printThirdPattern(){
        System.out.println("\nThird Pattern");
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");
    }
}
