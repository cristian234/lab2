package laborator3;

import laborator3.Utils.Directoare;
import laborator3.Utils.Exceptii_fisiere;
import laborator3.Utils.Fisiere;

/**
 * Clasa main pentru gestionarea Sistemului de fisiere
 */
public class Main {
    public static void main(String[] args) throws Exceptii_fisiere {
        Directoare Dir1 = new Directoare("root");// creem director
        Dir1.inserare_fisier(200);//introducem un fisier de dimensiune 200 O

        Fisiere fis1 = new Fisiere("primul_fisier", "Mata are cratima", "txt");// creem fisier
        fis1.print_header();// afisam o mini-arhivare a headerului.
        fis1.afisare_date();// afiseaza doar datele din fisier fara sa arunce eroare

        Fisiere fis2 = new Fisiere("Fisier_executabil","Setup","exe"); // creem un fisier "executabil"
        fis2.print_header();
        fis2.afisare_date();//ar trebui sa arunce eroare de tip Exceptii_fisiere
    }


}
