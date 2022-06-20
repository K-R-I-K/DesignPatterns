package Factory;

public class FactoryDemo
{
    public static void main(String[] args) {

        Production production = Production.getInstance();

        production.wayChoosing("Earth");
        production.way();
        production.deliver();

        System.out.println();
        production.wayChoosing("Sea");
        production.way();
        production.deliver();
    }
}