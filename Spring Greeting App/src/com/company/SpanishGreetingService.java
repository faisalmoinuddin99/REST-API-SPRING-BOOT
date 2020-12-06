package com.company;


import org.springframework.stereotype.Component;

@Component
class SpanishGreetingService implements GreetingService {
    @Override
    public void greet(String name) {
        System.out.println("Hola " + name);
    }
}
