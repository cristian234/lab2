package laborator3.utils;

/**
 * Created by Cristian on 11/1/2014.
 */
public class ExceptiiFisiere extends Exception {
    public ExceptiiFisiere() {
        super();
    }

    public ExceptiiFisiere(String message) {
        super(message);
    }

    public ExceptiiFisiere(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptiiFisiere(Throwable cause) {
        super(cause);
    }
}
