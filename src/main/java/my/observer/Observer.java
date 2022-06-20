package Observer;

import java.util.ArrayList;

// It is a behavioral design pattern that creates a
// subscription mechanism that allows some objects
// to track and respond to events that occur in other objects.
//
// The main class does not depend on specific classes,
// in this case subscribers, and vice versa.
// You can sign and unsubscribe recipients "on the fly".

public class Observer
{
    private static Observer observer;
    private static ArrayList<Subscriber> subscribers = new ArrayList<>();

    private Observer(){}

    public static Observer getInstance(){
        if(observer == null){
            observer = new Observer();
        }
        return observer;
    }

    public void addSubs(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void removeSubs(int index){
        try {
            subscribers.remove(--index);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Not correct number of subscriber");
        }
    }

    public void removeSubs(boolean del){
        if(del){
            subscribers.clear();
        }
    }

    public int subsCount(){
        return subscribers.size();
    }

    public ArrayList<Subscriber> subsList(){
        return subscribers;
    }

    public void notifySubs(){
        for (Subscriber subscriber : subscribers){
            System.out.println(subscriber.callUpSubscribers());
        }
    }
}