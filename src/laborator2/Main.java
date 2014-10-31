
package laborator2;

/**
 * Created by Cristian on 10/25/2014.
 * <p/>
 * Main class
 */
public class Main {
    public static void main(String[] args) {
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

    }
}
