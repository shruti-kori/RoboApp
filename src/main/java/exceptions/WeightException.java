package exceptions;

/**
 * Throws WeightException in case of more weight.
 */
public class WeightException extends RuntimeException {
    public WeightException(String message) {
        super(message);
    }
}
