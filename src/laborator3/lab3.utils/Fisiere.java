package laborator3.Utils;


import java.time.Instant;
import java.util.Date;

/**
 * Clasa cu fisiere_ordinare
 */
public class Fisiere extends SistemFisiere implements FisiereText {

    public String extensie = null; // fiecare fisier in parte are extensie
    public String date = null; // fisierele ordinare contin date in interior

    //Implementare de constructori
    public Fisiere(String nm, String data, String ext) {
        nume = nm;
        date = data;
        dimensiune = 0;
        DataCreare = Date.from(Instant.now());
        extensie = ext;
    }

    public Fisiere(String num, String ext) {
        nume = num;
        dimensiune = 0;
        DataCreare = Date.from(Instant.now());
        extensie = ext;
    }

    //Declarare de metode abstracte

    @Override
    public String Archive() {
        String archive_string = null;

        archive_string = this.nume;
        archive_string += this.dimensiune;
        archive_string += this.DataCreare.toString();
        archive_string += this.extensie;
        archive_string += this.date;

        return archive_string;
    }

    public void printHeader() {
        System.out.println(this.Archive());
    }

    @Override
    public void AfisareDate() throws ExceptiiFisiere {
        if (extensie == "txt" || extensie == "doc" || extensie == "nfo") {
            System.out.println(date);
        } else {
            throw new ExceptiiFisiere("Fisier cu alta extensie");
        }
    }

    @Override
    public void ModificareDate(String new_data) {
        this.date = new_data;
    }

}
