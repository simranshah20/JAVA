class ArrayToString {
    public static void main(String[] args) {
        String array[] = new String[]{"Hello", " Everyone!", " How ", " are ", " you all?"};

        // Create a StringBuilder to concatenate all elements in the array
        StringBuilder sb = new StringBuilder();

        // Append each string in the array to the StringBuilder
        for (String str : array) {
            sb.append(str);
        }

        // Print the full concatenated string after the loop
        System.out.println(sb);
    }
}
