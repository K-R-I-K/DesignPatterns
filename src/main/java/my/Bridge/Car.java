package Bridge;

public abstract class Car
{
    protected String name;
    protected int enginePower;
    protected int price;
    protected int weight;

    public String getName() {
        return name;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + " has " + enginePower + "HP, costs about " + price + "$ with weight " + weight + "kg";
    }
}