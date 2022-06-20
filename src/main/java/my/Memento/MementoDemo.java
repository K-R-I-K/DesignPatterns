package Memento;

public class MementoDemo {
    public static void main(String[] args) throws InterruptedException {
        Memento memento = new Memento("Zack",18);
        System.out.print("Setting name");
        for(int i=0;i<3;i++) {
            Thread.sleep(500);
            System.out.print(".");
        }
        System.out.println();
        memento.setName("Julia");
        System.out.print("Setting age");
        for(int i=0;i<3;i++) {
            Thread.sleep(500);
            System.out.print(".");
        }
        System.out.println();
        memento.setAge(22);

        Helper.list();
    }
}
