package Adapter;

public class PassengerCar extends Vehicle
{

    {
        MINIMAL_ENGINE_POWER = 10;
        MAXIMAL_ENGINE_POWER = 350;
    }

    public PassengerCar(Engine engine) {
        if(Adapter.checkEngine(engine,MINIMAL_ENGINE_POWER,MAXIMAL_ENGINE_POWER)){
            this.engine = engine;
        }
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

    public void deleteEngine() {
        System.out.println("Passenger car : engine was deleted");
        this.engine = null;
    }

    @Override
    public String toString() {
        String engineString;
        if(engine == null){
            engineString = "no engine";
        } else {
            engineString = engine.toString();
        }
        return "Passenger car, " + engineString;
    }
}