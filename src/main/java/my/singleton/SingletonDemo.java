package Singleton;

public class SingletonDemo
{
    public static void main(String[] args) {

        String first = "Hello, I'm the most important object";
        String second = "Man, u r joking, I have more value then u";
        System.out.println("Parameters :" + "\n  - " + first +
                "\n  - " + second);
        System.out.println("-------------------\n");

        Singleton singleton1 = Singleton.getInstance(first);
        System.out.println("First one : " + singleton1.getInformation());

        Singleton singleton2 = Singleton.getInstance(second);
        System.out.println("Second one : " + singleton2.getInformation());
    }
}