package Facade;

// The facade creates a simplified interface of the subsystem,
// without introducing any additional functionality. The subsystem
// itself does not know about the existence of the Facade.
// Classes communicate with each other during communication.
//
// The facade can be made the same, as usually only one facade object is needed.
//
// there is 1 problem : facade objects can become "God object"

public class Facade
{
    private Developer developer = new Developer();
    private Job job = new Job();
    private Tracker tracker = new Tracker();
    private static Facade facade;

    private Facade(){}

    public void wayToSolveProblems(boolean status){
        job.doJob();
        if(status){
            tracker.startSprint();
        } else {
            tracker.finishSprint();
        }
        developer.deadline(tracker);
    }

    public static Facade getInstance(){
        if(facade == null){
            facade = new Facade();
        }
        return facade;
    }
}