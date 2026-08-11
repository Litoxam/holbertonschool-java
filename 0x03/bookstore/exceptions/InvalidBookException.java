package exceptions;

public class InvalidBookException extends Exception{
    // Constructor
    public InvalidBookException(String message){
        super(message);
    }
}