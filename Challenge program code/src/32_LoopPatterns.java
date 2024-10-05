import java.util.Scanner;

class LoopPatterns {
    public static void main(String[] args) {
        System.out.println("\n.............patterns using loop and method.............\n");

        Scanner input=new Scanner(System.in);
        System.out.print("please Enter number of rows: ");
        int rows=input.nextInt();

        System.out.println("Here is the Right Half Pyramid");
        printRightHalfPyramid(rows);

        System.out.println("\nHere is the Reversed Right Half Pyramid:");
        printReversedRightHalfPyramid(rows);

        System.out.println("\nHere is Left Half Pyramidd:");
        printLeftHalfPyramid(rows);

    }


//    *
//    **
//    ***
//    ****
//    *****
    public static void printRightHalfPyramid(int maxRows) {
        int rows = 0;
        while (rows < maxRows) {  //checks condition until rows is less than 5
            System.out.print("*");
            int cols = 0;
            while (cols < rows) {    //checks condition until cols is less than rows
                System.out.print(" *");
                cols++;
            }
            System.out.println();  //for new line
            rows++;
        }
    }

//    *****
//    ****
//    ***
//    **
//    *
    public static void printReversedRightHalfPyramid(int maxRows){
      int rows=maxRows;
      while (rows > 0){
          int cols=0;
          while (cols < rows){
              System.out.print("* ");
              cols++;
          }
          System.out.println();
          rows--;
      }
    }


//         *
//        **
//       ***
//      ****
//     *****
    public static void printLeftHalfPyramid(int maxRows){
        int rows=maxRows;
        while (rows > 0){

            //this loop prints space before star
            int j=0;
            while(j<rows-1){
                System.out.print("  ");
                j++;
            }

            //this loop prints starts
            int cols=0;
            while (cols <= (maxRows-rows)){
                System.out.print(" *");
                cols++;
            }
            System.out.println();
            rows--;
        }
    }

}
