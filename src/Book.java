public class Book extends LibraryItem {
    private String author;
    private String isbn;

    public Book(String author, String isbn, String title, int yearPublished) {
        super(title, yearPublished);
        this.author = author;
        this.isbn = isbn;

    }



    @Override
    public String getDetails() {
        return "Book: " + getTitle() + ", Year: " + getYearPublished() + ", Author: " + author + ", ISBN: " + isbn;
    }

    }


