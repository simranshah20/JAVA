import java.util.Scanner;

class Course {
    static int maxCapacity = 100;
    String courseName;
    int enrollments;
    String enrolledStudents[];

    // Constructor to initialize course details
    Course(String courseName) {
        this.courseName = courseName; // Set course name
        this.enrollments = 0;         // Initialize enrollments to 0
        this.enrolledStudents = new String[maxCapacity]; // Create array with max capacity
    }

    // Static method to change max capacity of the course
    static void setMaxCapacity(int capacity) {
        Course.maxCapacity = capacity;
    }

    // Method to enroll a student in the course
    void setEnrolledStudents(String studentName) {
        if (enrollments < maxCapacity) {
            enrolledStudents[enrollments] = studentName;
            enrollments++;
            System.out.println(studentName + " has been enrolled in " + courseName);
        } else {
            System.out.println("Course is full. Cannot enroll " + studentName);
        }
    }

    // Method to unenroll a student from the course
    void unEnrolledStudents(String studentName) {
        boolean found = false;
        for (int i = 0; i < enrollments; i++) {
            if (enrolledStudents[i].equals(studentName)) {
                enrolledStudents[i] = enrolledStudents[enrollments - 1]; // Swap with last student
                enrolledStudents[enrollments - 1] = null; // Remove last student
                enrollments--;
                System.out.println(studentName + " has been unenrolled from " + courseName);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(studentName + " is not enrolled in the course.");
        }
    }

    // Method to display course details
    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Number of Enrollments: " + enrollments);
        System.out.println("Enrolled Students:");
        for (int i = 0; i < enrollments; i++) {
            System.out.println((i + 1) + ". " + enrolledStudents[i]);
        }
    }
}

class CourseDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the course name from the user
        System.out.print("Enter the course name: ");
        String courseName = input.nextLine();

        // Create a course object with the provided name
        Course course = new Course(courseName);

        // Enroll students
        System.out.print("Enter student name to enroll: ");
        String student1 = input.nextLine();
        course.setEnrolledStudents(student1);

        System.out.print("Enter student name to enroll: ");
        String student2 = input.nextLine();
        course.setEnrolledStudents(student2);

        // Display course details
        course.displayCourseDetails();

        // Unenroll a student
        System.out.print("Enter student name to unenroll: ");
        String studentToUnenroll = input.nextLine();
        course.unEnrolledStudents(studentToUnenroll);

        // Display updated course details
        course.displayCourseDetails();
        input.close();
    }
}
