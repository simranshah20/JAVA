import java.util.Scanner;

class FahrenheitToCelsius {
    public static void main(String[] args) {
        System.out.println("\n......Temperature Converter.......\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Temperature in F: ");
        float fah=sc.nextFloat();

        float cel=((fah-32)*5)/9;

        System.out.println("your Temperature in Celsius is: "+cel+" c ");
    }
}
