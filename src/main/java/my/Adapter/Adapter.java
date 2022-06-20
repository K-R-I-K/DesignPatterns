package Adapter;

// It's a structural design pattern that gives
// opportunity objects with incompatible interfaces
// work together.
//
// Separates and hides from the client the details of the conversion
// different interfaces.
//
// Complicates the program code due to the adding of additional
// classes.

import static java.lang.System.out;

public class Adapter
{
    private Adapter(){}

    static public boolean checkEngine(Engine engine, int min, int max){
        if(engine.getPower() >= min && engine.getPower() <= max){
            out.println(engine + " fits to this type of vehicle");
            return true;
        } else {
            out.println(engine + " doesn't fit to this type of vehicle");
            return false;
        }
    }

    static public void adaptEngine(Vehicle vehicle, Engine engine, boolean put){
        String thisEngine = "This engine : ";
        if(vehicle.getMin() <= engine.getPower() && vehicle.getMax() >= engine.getPower()){
            out.println(thisEngine + engine + " not required to be adapted");
            if(put){
                vehicle.setEngine(engine);
            }
        } else {
            Engine tempEngine = put ? new Engine(engine) : null;
            if(vehicle.getMin() > engine.getPower()) {
                out.println(thisEngine + engine + " adapted to minimum " + vehicle.getMin() + "HP");
                if(put){
                    tempEngine.setPower(vehicle.getMin());
                    vehicle.setEngine(tempEngine);
                }
            } else if(vehicle.getMax() < engine.getPower()) {
                out.println(thisEngine + engine + " adapted to maximum " + vehicle.getMax() + "HP");
                if(put){
                    tempEngine.setPower(vehicle.getMax());
                    vehicle.setEngine(tempEngine);
                }
            }
        }
    }
}