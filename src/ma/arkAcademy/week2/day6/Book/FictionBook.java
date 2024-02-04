package ma.arkAcademy.week2.day6.Book;

public class FictionBook extends Book {
private String type;
    public FictionBook(String title, String author, String isbn,String type) {
        super(title, author, isbn);
this.type=type;
    }

    public String getType() {
        return type;
    }


    }

