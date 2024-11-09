class Book {
    // Static variable to keep track of total number of books
    static int totalNoOfBooks;

    // Instance variables to store book details
    String tittle, author, isbn;
    boolean isBorrowed;  // Keeps track of whether the book is borrowed or not

    // Static block to initialize the static variable
    static {
        totalNoOfBooks = 0; // Initially, no books are available
    }

    // Instance block to increment the total number of books whenever a new object is created
    {
        totalNoOfBooks++;  // Increment the total number of books each time a new object is created
    }

    // Constructor to initialize a Book object with title, author, and ISBN
    Book(String t, String a, String bn) {
        tittle = t;  // Set book title
        author = a;  // Set book author
        isbn = bn;   // Set book ISBN
    }

    // Constructor to initialize a Book object with ISBN, default title and author
    Book(String isbn) {
        this(isbn, "unknown", "unknown");  // Call the parameterized constructor with default title and author
    }

    // Static method to get the total number of books
    static int getTotalNoOfBooks() {
        return totalNoOfBooks;  // Return the total count of books created
    }

    // Method to borrow a book
    void borrowBook() {
        if (isBorrowed) {
            System.out.println("Book is already borrowed");  // Check if the book is already borrowed
        } else {
            this.isBorrowed = true;  // Mark the book as borrowed
            System.out.println("Enjoy " + this.tittle + " book");  // Confirm the borrowing action
        }
    }

    // Method to return a borrowed book
    void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;  // Mark the book as returned
            System.out.println("Hope you enjoyed, please leave a review");  // Confirm the return action
        } else {
            System.out.println("This book is already in the library");  // If the book wasn't borrowed, show a message
        }
    }
}

class BookDetails {
    public static void main(String[] args) {
        // Create Book objects using the constructors
        Book designOfThings = new Book("Design", "ABC", "1");  // Create a book with title, author, and ISBN
        Book myBook = new Book("2");  // Create a book with only ISBN (defaults for title and author)

        // Print the total number of books created so far
        System.out.println("Total number of books are: " + Book.getTotalNoOfBooks());

        // Demonstrate borrowing the books
        System.out.println("\nYou borrowed the book 1: ");
        designOfThings.borrowBook();  // Borrow the first book

        System.out.println("\nYou borrowed the book 2: \n");
        myBook.borrowBook();  // Borrow the second book

        // Attempt to borrow the same book again
        designOfThings.borrowBook();  // This should show that the book is already borrowed

        // Demonstrate returning a borrowed book
        designOfThings.returnBook();  // Return the first book
        designOfThings.returnBook();  // Try returning the book again, should show that it's already in the library
    }
}
