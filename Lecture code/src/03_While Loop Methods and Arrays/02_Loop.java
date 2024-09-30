import java.util.Scanner;

class Loop{
    public static void main(String[] args) {
        System.out.println("\n..................While Loop.....................\n");

        int num = 1;  //initialization
        while(num <= 10){  //condition
            System.out.println(num);   //actual work
            num = num + 1;  //updating the condition(increment by 1)
        }


        System.out.println("\nAnother example....");
        int count=500;
        while(count>=200){
            System.out.println(count);
            count-=1;   //using short hand operator for increment
        }

        System.out.println("\n Another example.....");
        Scanner sc=new Scanner(System.in);
        int i=0;
        while(i<5){
            int input=sc.nextInt();
            System.out.println("Number is: "+input);
            i++;  //using urinary operator for increment
        }
    }
}