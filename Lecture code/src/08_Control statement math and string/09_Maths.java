class Maths {
    public static void main(String[] args) {
        // Print the absolute value of -147
        System.out.println(Math.abs(-147));

        // Print the ceiling of 45.89 (smallest integer greater than or equal to 45.89)
        System.out.println(Math.ceil(45.89));

        // Print the floor of 45.89 (largest integer less than or equal to 45.89)
        System.out.println(Math.floor(45.89));

        // Print the rounded value of 45.89
        System.out.println(Math.round(45.89));

        // Generate and print random integers between 0 and 9 in a loop
        for (int i = 0; i <= 5; i++) {
            // Generate a random integer between 0 and 9 (0 to 9 inclusive)
            int random = (int)(Math.random() * 10);
            System.out.print(random + " ");

            // Generate a rounded random integer between 0 and 10
            int random2 = (int)Math.round(Math.random() * 10);
            System.out.print(random2 + " ");
        }

        // Print the value of PI
        System.out.println(Math.PI);
    }
}
