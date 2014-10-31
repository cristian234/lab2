package laborator3.Utils;

import java.util.Date;

/**
 * Sistem de fisiere:
 * - Directoare;
 * - Fisiere Ordinare;
 */
public abstract class Sistem_fisiere {
    public String nume;
    public double dimensiune;
    public Date data_creare;
    //String tip;

    abstract public String archive();
    abstract void print_header();

    public void update_dimension(double new_dim)
    {
        dimensiune+=new_dim;
    }

}
