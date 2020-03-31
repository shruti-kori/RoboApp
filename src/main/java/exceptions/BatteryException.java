package exceptions;

/**
 * Throws BatteryException in case of less charge.
 */
public class BatteryException extends RuntimeException {
    public BatteryException(String message) {
        super(message);
    }
}
