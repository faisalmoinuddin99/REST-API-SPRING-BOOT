package com.company;

public class SpanishGreeting implements GreetingService {
    @Override
    public void greeting(String name) {
        System.out.println("Hola" + name);
    }
}
