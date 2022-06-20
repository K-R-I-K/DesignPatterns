package Facade;

public class Job
{
    private byte count = 0;
    public void doJob(){
        if(count == 0){
            count++;
            System.out.println(" -> Start doing some job");
        } else {
            System.out.println(" -> Job is already started");
        }
    }
}
