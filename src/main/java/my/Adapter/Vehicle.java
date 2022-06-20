package Adapter;

public abstract class Vehicle
{
    protected int MINIMAL_ENGINE_POWER;
    protected int MAXIMAL_ENGINE_POWER;
    protected Engine engine;

    public abstract Engine getEngine();
    public int getMin() {
        return MINIMAL_ENGINE_POWER;
    }
    public  int getMax() {
        return MAXIMAL_ENGINE_POWER;
    }

    public abstract void deleteEngine();
    public abstract void setEngine(Engine tempEngine);
}