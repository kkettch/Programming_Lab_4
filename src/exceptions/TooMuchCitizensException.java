package exceptions;


public class TooMuchCitizensException extends RuntimeException {
    public TooMuchCitizensException(String message) {
        super(message);
    }
}
