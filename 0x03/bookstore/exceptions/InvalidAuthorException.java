package exceptions;

public class InvalidAuthorException extends Exception{
    // Constructor
    public InvalidAuthorException(String message){
        super(message);
    }
}