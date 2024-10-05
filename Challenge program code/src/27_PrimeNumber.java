import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("\n.................Check number is prime or not.................\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        boolean prime = isPrime(num);
        if (prime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
    public static boolean isPrime(int num){
        int i=2;
        while (i<num){
            if(num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
