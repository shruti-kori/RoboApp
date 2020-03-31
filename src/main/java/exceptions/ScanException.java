package exceptions;

/**
 * Throws ScanException.
 */
public class ScanException extends RuntimeException {
    ScanException(String message) {
        super(message);
    }
}
