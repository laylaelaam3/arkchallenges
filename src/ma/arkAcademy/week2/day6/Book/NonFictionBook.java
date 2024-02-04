package ma.arkAcademy.week2.day6.Book;

public class NonFictionBook extends Book {
    private String topic;

    public NonFictionBook(String title, String author, String isbn,String topic) {
        super(title, author, isbn);
this.topic=topic;

    }

    public String getTopic() {
        return topic;
    }

    }

