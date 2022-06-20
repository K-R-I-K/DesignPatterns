package Observer;

public class OldMan implements Subscriber
{
    @Override
    public String callUpSubscribers() {
        return "Old man was hanged";
    }

    @Override
    public String toString() {
        return "Old man";
    }
}