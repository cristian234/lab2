package laborator3.Utils;

import java.util.Date;

/**
 * Sistem de fisiere:
 * - Directoare;
 * - Fisiere Ordinare;
 */
public abstract class SistemFisiere {
    public String nume;
    public double dimensiune;
    public Date DataCreare;
    //String tip;

    abstract public String Archive();

    abstract void printHeader();

    public void updateDimension(double new_dim) {
        dimensiune += new_dim;
    }

}
