package com.company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.company") ;
        GreetingService greetingServiceEnglish = (GreetingService) context.getBean("englishGreeting");
        greetingServiceEnglish.greeting(" faisal ");

        GreetingService greetingServiceSpnaish = (GreetingService) context.getBean("spanishGreeting");
        greetingServiceSpnaish.greeting(" faisal");
    }
}
