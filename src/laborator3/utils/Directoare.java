package laborator3.utils;

import java.time.Instant;
import java.util.Date;

/**
 * Clasa directoare;
 */
public class Directoare extends SistemFisiere {

    private int numarFisiere = 0;

    public Directoare(String nm) {
        nume = nm;
        dimensiune = 0;
        dataCreare = Date.from(Instant.now());
    }

    @Override
    public String Archive() {
        String archive_string = null;
        archive_string = this.nume;
        archive_string += this.dimensiune;
        archive_string += this.dataCreare.toString();
        archive_string += this.numarFisiere;
        return archive_string;
    }

    public void printHeader() {
        System.out.println(this.Archive());
    }

    public void setNumarFisiere() {
        numarFisiere += 1;
    }

    public void inserareFisier(double dim) {
        setNumarFisiere();
        dimensiune += dim;
    }
}
