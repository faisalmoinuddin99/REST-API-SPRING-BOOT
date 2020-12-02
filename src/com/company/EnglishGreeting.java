package com.company;

public class EnglishGreeting implements  GreetingService {

    @Override
    public void greeting(String name) {
        System.out.println("Hello" + name);
    }
}
