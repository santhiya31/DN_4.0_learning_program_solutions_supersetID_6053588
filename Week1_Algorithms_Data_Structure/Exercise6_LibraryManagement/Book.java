package Week1_Algorithms_Data_Structure.Exercise6_LibraryManagement;

public class Book {
    int bookId;
    String title;
    String author;
    public Book(int bookId,String title,String author) {
        this.bookId=bookId;
        this.title=title;
        this.author=author;
    }
    public String toString() {
        return "ID: "+bookId+", Title: "+title+", Author: "+author;
    }
}
