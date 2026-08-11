import exceptions.InvalidAuthorException;
import exceptions.InvalidBookException;

public class GoldEditionBook extends Book {

    // Constructor
    public GoldEditionBook(String title, String author, double price)
            throws InvalidAuthorException, InvalidBookException {
        super(title, author, price);
    }

    // Gold Edition books have a 30% price increase
    @Override
    public double getPrice() {
        return super.getPrice() + (super.getPrice() * 0.3);
    }
}
