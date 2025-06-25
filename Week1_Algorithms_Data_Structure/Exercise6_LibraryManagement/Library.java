package Week1_Algorithms_Data_Structure.Exercise6_LibraryManagement;

import java.util.Arrays;
import java.util.Comparator;

public class Library {
    Book[] books;
    int count;
    public Library(int size) {
        books=new Book[size];
        count=0;
    }
    public void addBook(Book b) {
        if (count<books.length) {
            books[count++]=b;
        }
    }
    public Book linearSearch(String title) {
        for (int i=0;i<count;i++) {
            if (books[i].title.equalsIgnoreCase(title))
                return books[i];
        }
        return null;
    }
    public Book binarySearch(String title) {
        Arrays.sort(books, 0, count, Comparator.comparing(b -> b.title.toLowerCase()));
        int left=0,right=count-1;
        while (left<=right) {
            int mid=(left+right)/2;
            int cmp=books[mid].title.compareToIgnoreCase(title);
            if (cmp==0) return books[mid];
            else if (cmp<0)left=mid+1;
            else right=mid-1;
        }
        return null;
    }
    public void showAllBooks() {
        for (int i=0;i<count;i++) {
            System.out.println(books[i]);
        }
    }
}
