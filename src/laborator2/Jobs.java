package laborator2;

/**
 * Created by Cristian on 10/26/2014.
 */
public class Jobs {
    public String job_name;
    public double salary;
    int start_time;
    int finish_time;

    public void setStart_time(int start_time) {
        this.start_time = start_time;
    }

    public int getStart_time() {
        return start_time;
    }

    public void setFinish_time(int finish_time) {
        this.finish_time = finish_time;
    }

    public int getFinish_time() {
        return finish_time;
    }
}
