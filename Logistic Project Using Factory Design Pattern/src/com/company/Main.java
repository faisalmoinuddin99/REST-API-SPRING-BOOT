package com.company;

public class Main {

    public static void main(String[] args) {
	LogisticFactory lf = new LogisticFactory();
	TransportService tf = lf.getInstance("ship");
	tf.delivery("container"); // Delivery by sea in a container
    }
}
