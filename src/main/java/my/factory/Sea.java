package Factory;

public class Sea extends Factory
{
    @Override
    public Transport crateTransportWay() {
        return new Boat();
    }
}