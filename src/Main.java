
import laborator2.Jobs;
import laborator2.Work;
import laborator3.utils.Directoare;
import laborator3.utils.ExceptiiFisiere;
import laborator3.utils.Fisiere;
import laborator5.tema5.ip.mainpackage.AbstractFactoryGames;
import laborator5.tema5.ip.mainpackage.ChooseFactory;
import laborator5.tema5.ip.mainpackage.Games;

/**
 * Created by Cristian on 10/25/2014.
 * <p/>
 * Main class of all homeworks
 */
public class Main {

    /// Laborator 2
   /* public static void main(String[] args) {
        //  Display Worker
        Work Cristian = new Work();
        Cristian.Nume = "Noname";
        Cristian.Prenume = "Prename";
        Cristian.CNP = 123151231;

        Cristian.Job=new Jobs();
        Cristian.Job.job_name = "Engineer";
        Cristian.Job.salary = 1200.56;
        Cristian.Job.setStart_time(10);
        Cristian.Job.setFinish_time(19);

        System.out.println(Cristian.Nume + " " + Cristian.Prenume);
        System.out.println(Cristian.Prenume + " jobs is :");
        System.out.println(Cristian.Job.job_name + " with salary:" + Cristian.Job.salary);
        System.out.println("He starts job at:" + Cristian.Job.getStart_time() + " and finish it at:" + Cristian.Job.getFinish_time());

    }*/


    //--------------------------------------------------------------------------------------------------------------------


    //Laborator3
    /*public static void main(String[] args) throws ExceptiiFisiere {

        Directoare Dir1 = new Directoare("Folder");// creem director
        Dir1.inserareFisier(200);//introducem un fisier de dimensiune 200 O
        Dir1.setNumarFisiere();

        Fisiere fis1 = new Fisiere("primul_fisier", "Text eronat la prima tema :D", "txt");// creem fisier
        fis1.printHeader();// afisam o mini-arhivare a headerului.
        fis1.AfisareDate();// afiseaza doar datele din fisier fara sa arunce eroare

        fis1.modificareDirector(Dir1);
        //Fisiere fis1 = new Fisiere("primul_fisier", "Text eronat la prima tema :D", "txt");// creem fisier
        fis1.printHeader();// afisam o mini-arhivare a headerului.

        Fisiere fis2 = new Fisiere("Fisier_executabil", "Setup", "exe"); // creem un fisier "executabil"
        fis2.printHeader();
        fis2.AfisareDate();//ar trebui sa arunce eroare de tip Exceptii_fisiere


    }*/

    //Laborator5

    //Main tema5
    public static void main(String[] args)
    {
        //choose the factory
        AbstractFactoryGames gameFactory = ChooseFactory.factorySelection("Single");

        //create a doom game
        Games game1 = gameFactory.createGame("Doom");

        //calling start method
        game1.startPlaying();

        // create a tycoon game
        Games game2=gameFactory.createGame("Tycoon");

        // the game is starting
        game2.startPlaying();

        // change the factory
        gameFactory=ChooseFactory.factorySelection("Multi");

        // create a football game
        Games game3= gameFactory.createGame("Football");

        // football game is starting
        game3.startPlaying();

        // stop the doom game
        game1.stopPlaying();

        // pause the tycoon game
        game2.pauseGame();
    }
}