package Facade;

public class Tracker
{
    private boolean sprintTracker;

    public boolean isActiveSprint(){
        return sprintTracker;
    }

    public void startSprint(){
        System.out.println("Sprint started!");
        sprintTracker = true;
    }

    public void finishSprint(){
        System.out.println("Sprint finished!");
        sprintTracker = false;
    }
}
