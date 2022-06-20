package Bridge;

import java.util.ArrayList;
import java.util.List;

// It is a structural design pattern that separates
// one or more classes into two separate hierarchies - abstraction
// and implementation, allowing you to change the code in one branch
// classes, regardless of the other.
//
// Advantages :
//      + Allows you to build platform-independent programs.
//      + Hides unnecessary or dangerous sales details from customers code.
//
// Disadvantages :
//      - Complicates the program code due to the introduction of additional
//          classes.

public abstract class SalonBridge {

    private Car car;
    protected String salonName;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Car> deliverCars(int count){
        ArrayList<Car> temp = null;
        if(car!=null) {
            temp = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                temp.add(car);
            }
        }
        return temp;
    }

    public String getSalonName(){
        return salonName;
    }

    public String getFullCarName() {
        return "Salon : " + salonName + "\n" + car;
    }
}