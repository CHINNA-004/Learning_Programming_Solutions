package Exercise6_LibraryManagementSystem.Code;

public class LibraryTest {
    public static void main(String[] args) {
        Book[] books = {
            new Book("B1", "Java Programming", "James Gosling"),
            new Book("B2", "Algorithms", "Robert Sedgewick"),
            new Book("B3", "Data Structures", "Mark Allen Weiss"),
            new Book("B4", "Clean Code", "Robert C. Martin"),
            new Book("B5", "Operating Systems", "Abraham Silberschatz")
        };

        Library library = new Library(books);

        System.out.println("Library Books:");
        library.displayAllBooks();

        System.out.println("Linear Search for 'Clean Code':");
        Book found1 = library.linearSearchByTitle("Clean Code");
        System.out.println(found1 != null ? found1 : "Book not found.");

        System.out.println("Binary Search for 'Algorithms':");
        Book found2 = library.binarySearchByTitle("Algorithms");
        System.out.println(found2 != null ? found2 : "Book not found.");

        System.out.println("Binary Search for 'Database Systems':");
        Book found3 = library.binarySearchByTitle("Database Systems");
        System.out.println(found3 != null ? found3 : "Book not found.");
    }
}

