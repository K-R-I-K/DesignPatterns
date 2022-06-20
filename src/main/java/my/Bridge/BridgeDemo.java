package Bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        SalonBridge salonBridge = new MitsubishiSalon();
        salonBridge.setCar(new SUV());
        System.out.println(salonBridge.getFullCarName());

        System.out.println("--------------------");
        salonBridge = new PorscheSalon();
        salonBridge.setCar(new PassengerCar());
        System.out.println(salonBridge.getFullCarName());

        System.out.println("--------------------");
        System.out.println(salonBridge.deliverCars(3));
    }
}