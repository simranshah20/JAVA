class StringConcatination {
    public static void main(String[] args) {
        // Declare and initialize variables for first and last names
        String firstName = "Simran";
        String lastName = "Shah";

        // Concatenate firstName and lastName with a space in between using the '+' operator
        // String fullName = firstName + " " + lastName;

        // Another way to concatenate strings: using the concat() method
        String fullName = firstName.concat(" ").concat(lastName);

        // Convert fullName to uppercase and print it
        System.out.println(fullName.toUpperCase());
    }
}
