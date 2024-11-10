class StringFormate {
    public static void main(String[] args) {
        // Declare and initialize an integer variable for marks
        int marks = 45;

        // Declare and initialize a String variable for name
        String name = "Hari";

        // Concatenate and print a message using the '+' operator
        System.out.println("Hello " + name + ", your mark is: " + marks);

        // Print a formatted message using printf with format specifiers
        // %s is a placeholder for a string, and %d is for an integer
        System.out.printf("Hello %s, your marks is: %d\n", name, marks);

        // Print the name in a field of width 10, right-aligned
        // %10s reserves 10 spaces for the string and right-aligns it within that space
        System.out.printf("Hello %10s, your marks is: %d\n", name, marks);

        // Print the name in a field of width 10, left-aligned
        // %-10s reserves 10 spaces for the string and left-aligns it within that space
        System.out.printf("Hello %-10s, your marks is: %d", name, marks);
    }
}
