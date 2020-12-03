package com.company;

import org.springframework.stereotype.Component;

@Component
public class EnglishGreeting implements  GreetingService {

    @Override
    public void greeting(String name) {
        System.out.println("Hello" + name);
    }
}
