class ForEachLoop {
    public static void main(String[] args) {
        // Initialize an array of strings with names
        String arr[] = new String[] {
                "Ram", "Hari", "Sita", "Gita", "Shyam"
        };

        // Print message to indicate the array will be displayed using a standard for loop
        System.out.print("Array using for loop is: ");

        // Call the printArray method to display the array elements using a standard for loop
        printArray(arr);

        // Print message to indicate the array will be displayed using a for-each loop
        System.out.print("\nArray using for each loop is: ");

        // Call the printArrayForEach method to display the array elements using a for-each loop
        printArrayForEach(arr);
    }

    // Method to print each element in the provided string array using a standard for loop
    public static void printArray(String arr[]) {
        // Loop through the array with an index variable
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Print each element followed by a space
        }
    }

    // Method to print each element in the provided string array using a for-each loop
    public static void printArrayForEach(String arr[]) {
        // Loop through the array directly with each element
        for (String name : arr) {
            System.out.print(name + " "); // Print each element followed by a space
        }
    }
}
