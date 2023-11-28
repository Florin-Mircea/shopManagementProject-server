package controllers.exceptions;

public class NonexistentEntityException extends Exception {

    public NonexistentEntityException() {
        
    }

    public NonexistentEntityException(String message) {
        super(message);
    }

    public NonexistentEntityException(String message, Throwable cause) {
        super(message, cause);
    }

    public NonexistentEntityException(Throwable cause) {
        super(cause);
    }

    public NonexistentEntityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }    
    
}
