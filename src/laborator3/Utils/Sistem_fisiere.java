package laborator3.Utils;

import java.util.Date;

/**
 * Created by Cristian on 10/31/2014.
 */
public abstract class Sistem_fisiere {
    public String nume_fisier;
    public double dimensiune;
    public Date data_creare;
    String tip;

    abstract public String archive();
    abstract void print_header();


    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getTip() {
        return tip;
    }
}
