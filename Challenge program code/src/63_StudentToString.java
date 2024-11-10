class StudentToString {
    // Declaring instance variables for student details
    String name, rollNumber, house;
    int age;

    // Constructor to initialize the StudentToString object with provided values
    public StudentToString(String name, String rollNumber, String house, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.house = house;
        this.age = age;
    }

    // Overriding the toString() method to return a formatted string representation of the object
    public String toString() {
        return "Student Details: { name: " + name
                + ", age: " + age
                + ", roll number: " + rollNumber
                + ", house: " + house + " }";
    }

    // Main method to create and display a StudentToString object
    public static void main(String[] args) {
        // Creating a new StudentToString object with specified values
        StudentToString student = new StudentToString("Sita", "20", "Birgunj", 12);

        // Printing the StudentToString object, which calls the overridden toString() method
        System.out.println(student);
    }
}
