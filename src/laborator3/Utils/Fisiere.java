package laborator3.utils;

import java.time.Instant;
import java.util.Date;

/**
 * Clasa cu fisiere_ordinare
 *
 *
 *
 */
public class Fisiere extends Sistem_fisiere {

    public String extensie=null; // fiecare fisier in parte are extensie
    public String date=null; // fisierele ordinare contin date in interior

    //Implementare de constructori
    Fisiere(String nm, String data, String ext)
    {
        nume=nm;
        date=data;
        dimensiune=0;
        data_creare= Date.from(Instant.now());
        extensie=ext;
    }
    Fisiere(String num,String ext)
    {
        nume=num;
        dimensiune=0;
        data_creare=Date.from(Instant.now());
        extensie=ext;
    }

    //Declarare de metode abstracte

    @Override
    public String archive() {
        String archive_string= null;
        try {
            archive_string = null;
            archive_string=archive_string+this.nume;
            archive_string=archive_string+this.dimensiune;
            archive_string+=this.data_creare.toString();
            archive_string+=this.extensie;
            archive_string+=this.date;
        } catch (Exception e) {
            System.out.println("Nu se poate face arhivarea, termeni incompleti!");
        }
        return  archive_string;
    }
    public void print_header()
    {
        System.out.println(this.archive());
    }

}
