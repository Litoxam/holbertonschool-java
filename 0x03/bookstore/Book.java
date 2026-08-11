import exceptions.InvalidAuthorException;
import exceptions.InvalidBookException;

public class Book {
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price)
            throws InvalidAuthorException, InvalidBookException {
        setTitle(title);
        setAuthor(author);
        setPrice(price);
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) throws InvalidBookException {
        if (title.length() < 3) {
            throw new InvalidBookException("Invalid book title");
        }

        this.title = title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) throws InvalidAuthorException {
        if (!author.contains(" ")) {
            throw new InvalidAuthorException("Invalid author name");
        }

        this.author = author;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) throws InvalidBookException {
        if (price <= 0) {
            throw new InvalidBookException("Invalid book price");
        }

        this.price = price;
    }
}
