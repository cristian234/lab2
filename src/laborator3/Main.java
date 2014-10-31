package laborator3;

import laborator3.Utils.Directoare;
import laborator3.Utils.Fisiere;
//import laborator3.utils.Sistem_fisiere;

/**
 * Clasa main pentru gestionarea Sistemului de fisiere
 */
public class Main {
    public void main(String [] args)
    {
        Directoare Dir1=new Directoare("root");
        Dir1.inserare_fisier(200);

        Fisiere fis1=new Fisiere("primul_fisier","Mata are cratima","txt");


    }


}
