package laborator3.Utils;

/**
 * Created by Cristian on 11/1/2014.
 */
public class Exceptii_fisiere extends Exception{
    public Exceptii_fisiere()
    {
        super();
    }
    public Exceptii_fisiere(String message)
    {
        super(message);
    }
    public Exceptii_fisiere(String message, Throwable cause)
    {
        super(message, cause);
    }
    public Exceptii_fisiere(Throwable cause)
    {
        super(cause);
    }
}
