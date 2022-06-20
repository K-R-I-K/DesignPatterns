package Adapter;

public class Truck extends Vehicle
{
    private Engine engine;

    {
        MINIMAL_ENGINE_POWER = 220;
        MAXIMAL_ENGINE_POWER = 1000;
    }

    public Truck(Engine engine) {
        if(Adapter.checkEngine(engine,MINIMAL_ENGINE_POWER,MAXIMAL_ENGINE_POWER)){
            this.engine = engine;
        }
    }

    public void deleteEngine() {
        System.out.println("Truck : engine was deleted");
        this.engine = null;
    }

    public void setEngine(Engine engine) {
        if(Adapter.checkEngine(engine,MINIMAL_ENGINE_POWER,MAXIMAL_ENGINE_POWER)){
            this.engine = engine;
        }
    }

    public Engine getEngine() {
        if (engine == null){
            System.out.println("This vehicle has no engine");
        }
        return engine;
    }

    @Override
    public String toString() {
        String engineString;
        if(engine == null){
            engineString = "no engine";
        } else {
            engineString = engine.toString();
        }
        return "Truck, " + engineString;
    }
}