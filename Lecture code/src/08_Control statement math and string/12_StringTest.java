class StringTest {
    public static void main(String[] args) {
        // Create a StringBuilder object with an initial string
        StringBuilder sb = new StringBuilder("My name is ");

        // Append a string to the existing StringBuilder content
        sb.append("Simran Shah.");

        // Append another string to the StringBuilder
        sb.append("I am from Nepal");

        // Convert the StringBuilder to a String (though it's not needed here since we are printing sb directly)
        sb.toString();

        // Print the contents of the StringBuilder
        System.out.println(sb);
    }
}
