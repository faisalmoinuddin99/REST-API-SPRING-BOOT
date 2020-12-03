package com.company;

import org.springframework.stereotype.Component;

@Component
public class SpanishGreeting implements GreetingService {
    @Override
    public void greeting(String name) {
        System.out.println("Hola" + name);
    }
}
