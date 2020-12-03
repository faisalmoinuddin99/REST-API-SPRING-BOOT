package com.company;

public class Ship implements TransportService {
    @Override
    public void delivery(String vehicle) {
        System.out.println("Delivery by sea in a container");
    }
}
