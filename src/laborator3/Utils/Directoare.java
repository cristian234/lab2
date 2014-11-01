package laborator3.Utils;

import java.time.Instant;
import java.util.Date;

/**
 * Clasa directoare;
 */
public class Directoare extends Sistem_fisiere {

    public int numar_fisiere = 0;

    public Directoare(String nm) {
        nume = nm;
        dimensiune = 0;
        data_creare = Date.from(Instant.now());
    }

    @Override
    public String archive() {
        String archive_string = null;
        archive_string = this.nume;
        archive_string += this.dimensiune;
        archive_string += this.data_creare.toString();
        archive_string += this.numar_fisiere;
        return archive_string;
    }

    public void print_header() {
        System.out.println(this.archive());
    }

    public void setNumar_fisiere() {
        numar_fisiere += 1;
    }

    public void inserare_fisier(double dim) {
        setNumar_fisiere();
        dimensiune += dim;
    }
}
