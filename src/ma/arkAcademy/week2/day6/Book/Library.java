package ma.arkAcademy.week2.day6.Book;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displaybook() {
        System.out.println("Library Books:");
        for (Book book : books) {
            book.displayinfo();
            System.out.println(book.getAuthor()+" "+book.getTitle()+" "+book.getIsbn());
        }
    }
}