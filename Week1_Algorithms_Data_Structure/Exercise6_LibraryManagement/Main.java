package Week1_Algorithms_Data_Structure.Exercise6_LibraryManagement;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(10);
        library.addBook(new Book(1,"Java Basics","John"));
        library.addBook(new Book(2,"Python Guide","Asha"));
        library.addBook(new Book(3,"C++ Primer","Ravi"));
        System.out.println("All Books:");
        library.showAllBooks();
        System.out.println("\nLinear Search: 'Python Guide'");
        System.out.println(library.linearSearch("Python Guide"));
        System.out.println("\nBinary Search: 'C++ Primer'");
        System.out.println(library.binarySearch("C++ Primer"));
    }
}
