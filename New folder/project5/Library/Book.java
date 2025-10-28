package library.books;

public class Book {
    public String title;
    public String author;
    public boolean isIssued;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public void displayBook() {
        System.out.println("Book: " + title + " by " + author + " | Issued: " + isIssued);
    }
}
