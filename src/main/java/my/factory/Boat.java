package Factory;

public class Boat implements Transport
{
    @Override
    public void deliver() {
        System.out.println("Delivering by boat");
    }

    @Override
    public void deliveringWay() {
        System.out.println("Sea delivering");
    }
}