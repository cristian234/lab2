package laborator3;

import laborator3.utils.Directoare;
import laborator3.utils.ExceptiiFisiere;
import laborator3.utils.Fisiere;

/**
 * Clasa main pentru gestionarea Sistemului de fisiere
 */
public class Main {
    public static void main(String[] args) throws ExceptiiFisiere {
        Directoare Dir1 = new Directoare("root");// creem director
        Dir1.inserareFisier(200);//introducem un fisier de dimensiune 200 O

        Fisiere fis1 = new Fisiere("primul_fisier", "Mata are cratima", "txt");// creem fisier
        fis1.printHeader();// afisam o mini-arhivare a headerului.
        fis1.AfisareDate();// afiseaza doar datele din fisier fara sa arunce eroare

        Fisiere fis2 = new Fisiere("Fisier_executabil","Setup","exe"); // creem un fisier "executabil"
        fis2.printHeader();
        fis2.AfisareDate();//ar trebui sa arunce eroare de tip Exceptii_fisiere
    }


}
