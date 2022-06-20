package Facade;

public class Developer
{
    public void deadline(Tracker tracker){
        if(tracker.isActiveSprint()){
            System.out.println("Start doing his/her job...");
        } else {
            System.out.println("Job is not active.");
        }
    }
}