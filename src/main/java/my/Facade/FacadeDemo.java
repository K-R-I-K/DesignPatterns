package Facade;

public class FacadeDemo
{
    public static void main(String[] args) {

        /*
        Job job = new Job();
        job.doJob();
        Tracker tracker = new Tracker();
        tracker.startSprint();
        Developer developer = new Developer();
        developer.deadline(tracker);
        tracker.finishSprint();
        developer.deadline(tracker);
        */

        //--------^^^^--------
        // code before facade construction

        Facade facade = Facade.getInstance();
        facade.wayToSolveProblems(true);
        facade.wayToSolveProblems(false);

    }
}
