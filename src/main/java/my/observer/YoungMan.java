package Observer;

public class YoungMan implements Subscriber
{
    @Override
    public String callUpSubscribers() {
       return "Young man was hanged";
    }

    @Override
    public String toString() {
        return "Young man";
    }
}