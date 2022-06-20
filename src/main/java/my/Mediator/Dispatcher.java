package Mediator;

public class Dispatcher implements Mediator {

    private String name;
    private String detailedInfo;
    private Helicopter helicopter;
    private Plane plane;

    @Override
    public void dispatch(Aircraft aircraft) {
        name = aircraft.fly();
        if(aircraft instanceof Helicopter helicopter){
            if(plane != null){
                plane = null;
            }
            this.helicopter = helicopter;
            detailedInfo = helicopter.fire();
        } else if(aircraft instanceof Plane plane) {
            if(helicopter != null){
                helicopter = null;
            }
            this.plane = plane;
            detailedInfo = plane.flyHigh();
        }
    }

    public String getName() {
        if(name == null){
            return "Aircraft was not selected";
        }
        return name;
    }

    public String getDetailedInfo() {
        if(detailedInfo == null){
            return "Aircraft was not selected";
        }
        return detailedInfo;
    }
}
