package Factory;

public class Truck implements Transport
{
    @Override
    public void deliver() {
        System.out.println("Delivering by truck");
    }

    @Override
    public void deliveringWay() {
        System.out.println("Earth delivering");
    }
}