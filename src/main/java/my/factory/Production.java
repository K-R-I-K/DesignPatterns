package Factory;

import AbstractFactory.ProductInteraction;

public class Production
{
    private static Production production;
    private Factory method;
    private Transport transport;

    private Production(){}

    public static Production getInstance(){
        if(production == null){
            production = new Production();
        }
        return production;
    }

    public Factory wayChoosing(String way){
        if(way.equals("Earth")){
            method = new Earth();
        } else if(way.equals("Sea")){
            method = new Sea();
        }
        if(method != null){
            transport = method.crateTransportWay();
        }
        return method;
    }

    public void way(){
        if (method != null) {
            method.transportWay(transport);
        } else {
            System.out.println("There is no factory method");
        }
    }

    public void deliver(){
        if (method != null) {
            method.deliveringWay(transport);
        } else {
            System.out.println("There is no factory method");
        }
    }
}