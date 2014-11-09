package laborator3.utils;

import java.time.Instant;
import java.util.Date;

/**
 * Clasa cu fisiere_ordinare
 */
public class Fisiere extends SistemFisiere implements FisiereText {

    public String extensieFisier = null; // fiecare fisier in parte are extensie
    public String dateFisier = null; // fisierele ordinare contin date in interior
    String numeDirector = "root";

    //Implementare de constructori
    public Fisiere(String nm, String data, String ext) {
        nume = nm;
        dateFisier = data;
        dimensiune = 0;
        dataCreare = Date.from(Instant.now());
        extensieFisier = ext;
    }

    public Fisiere(String num, String ext) {
        nume = num;
        dimensiune = 0;
        dataCreare = Date.from(Instant.now());
        extensieFisier = ext;
    }

    //Declarare de metode abstracte

    @Override
    public String Archive() {
        String archive_string = null;

        archive_string = this.nume;
        archive_string += this.dimensiune;
        archive_string += this.dataCreare.toString();
        archive_string += this.extensieFisier;
        archive_string += this.dateFisier;
        archive_string += this.numeDirector;
        return archive_string;
    }

    public void printHeader() {
        System.out.println(this.Archive());
    }

    @Override
    public void AfisareDate() throws ExceptiiFisiere {
        if (extensieFisier == "txt" || extensieFisier == "doc" || extensieFisier == "nfo") {
            System.out.println(dateFisier);
        } else {
            throw new ExceptiiFisiere("Fisier cu alta extensie");
        }
    }

    @Override
    public void ModificareDate(String new_data) {
        this.dateFisier = new_data;
    }

    public void modificareDirector(Directoare dirNou) {
        this.numeDirector = dirNou.nume;
    }

}
