package laborator3.utils;

import java.time.Instant;
import java.util.Date;

/**
 * Clasa directoare;
 */
public class Directoare extends SistemFisiere {

    public int numar_fisiere = 0;

    public Directoare(String nm) {
        nume = nm;
        dimensiune = 0;
        DataCreare = Date.from(Instant.now());
    }

    @Override
    public String Archive() {
        String archive_string = null;
        archive_string = this.nume;
        archive_string += this.dimensiune;
        archive_string += this.DataCreare.toString();
        archive_string += this.numar_fisiere;
        return archive_string;
    }

    public void printHeader() {
        System.out.println(this.Archive());
    }

    public void setNumarFisiere() {
        numar_fisiere += 1;
    }

    public void inserareFisier(double dim) {
        setNumarFisiere();
        dimensiune += dim;
    }
}
