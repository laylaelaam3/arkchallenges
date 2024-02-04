package ma.arkAcademy.week2.day6.Book;

public class MainLibrary {
    public static void main(String[] args) {
        Library library=new Library();
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-3-16-148410-0");
        FictionBook fictionBook = new FictionBook("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4", "Classic");
         NonFictionBook nonFictionBook = new NonFictionBook("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "978-0-06-231609-7", "History");
        library.addBook(book);
        library.addBook(fictionBook);
        library.addBook(nonFictionBook);

        library.displaybook();
    }
}
