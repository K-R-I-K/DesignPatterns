package Adapter;

public class AdapterDemo
{
    public static void main(String[] args) {
        Engine engine1 = new Engine("Small engine",150);
        Engine engine2 = new Engine("Big engine",450);

        Truck truck = new Truck(engine1);
        PassengerCar passengerCar = new PassengerCar(engine1);

        System.out.println("--------------------");
        System.out.println(truck);
        System.out.println(passengerCar);

        System.out.println("--------------------");
        truck.setEngine(engine2);
        passengerCar.setEngine(engine2);

        System.out.println("--------------------");
        passengerCar.deleteEngine();

        System.out.println("--------------------");
        System.out.println(truck);
        System.out.println(passengerCar);

        System.out.println("--------------------");
        Adapter.adaptEngine(passengerCar, engine2, true);

        System.out.println("--------------------");
        System.out.println(truck);
        System.out.println(passengerCar);

        System.out.println("--------------------");
        System.out.println(truck.getEngine());
        System.out.println(passengerCar.getEngine());
    }
}