package tareajunit;

/**
 *
 * @author alumno
 */
public class BRException extends Exception {

    /**
     * Creates a new instance of <code>BRException</code> without detail
     * message.
     */
    public BRException() {
    }

    /**
     * Constructs an instance of <code>BRException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public BRException(String msg) {
        super(msg);
    }
}
