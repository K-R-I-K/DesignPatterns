package Adapter;

public class Engine implements Cloneable
{
    private int power;
    private String engineName;

    public Engine(String engineName, int power) {
        this.engineName = engineName;
        this.power = power;
    }

    public String getEngineName() {
        return engineName;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    Engine(Engine engine){        // copy constructor
        this(engine.getEngineName(),engine.getPower());
    }

    @Override
    public String toString() {
        return "Engine name = " + engineName + ", power = " + power + "HP";
    }
}