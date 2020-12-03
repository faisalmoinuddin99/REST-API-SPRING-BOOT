package com.company;

public class Truck implements  TransportService{
    @Override
    public void delivery(String vehicle) {
        System.out.println("Deliver by land in a box");
    }
}
