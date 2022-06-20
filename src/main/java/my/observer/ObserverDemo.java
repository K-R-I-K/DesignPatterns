package Observer;

public class ObserverDemo
{
    public static void main(String[] args) {
        Observer observer = Observer.getInstance();
        observer.addSubs(new OldMan());
        observer.addSubs(new OldMan());
        observer.addSubs(new OldMan());
        observer.addSubs(new YoungMan());
        observer.addSubs(new YoungMan());
        observer.addSubs(new YoungMan());

        System.out.println(observer.subsList());
        observer.notifySubs();
    }
}