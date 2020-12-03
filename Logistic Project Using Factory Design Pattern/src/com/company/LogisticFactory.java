package com.company;

public class LogisticFactory {
    public TransportService getInstance(String vehicle){
        if (vehicle.equals("truck") || vehicle.equals("Truck")){
            return  new Truck();
        }
        else if(vehicle.equals("ship") || vehicle.equals("Ship")){
            return  new Ship();
        }
        else {
            throw new RuntimeException("No Transport Sevice available " + vehicle + " vehicle") ;
        }
    }
}
