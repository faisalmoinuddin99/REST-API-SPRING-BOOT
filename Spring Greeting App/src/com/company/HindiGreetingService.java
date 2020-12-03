package com.company;

import org.springframework.stereotype.Component;

@Component
public class HindiGreetingService implements GreetingService {
    @Override
    public void greet(String name) {
        System.out.println("शुभकामना " + name);
    }
}
