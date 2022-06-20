package Factory;

public class Earth extends Factory
{
    @Override
    public Transport crateTransportWay() {
        return new Truck();
    }
}