package com.company;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ApplicationContext context = new AnnotationConfigApplicationContext("com.company");
        try {
            GreetingService greetingService = (GreetingService) context.getBean("hindiGreetingService");

            greetingService.greet("faisal");

            GreetingService greetingService1 = (GreetingService) context.getBean("englishGreetingService");
            greetingService1.greet("goku");

            GreetingService greetingService2 = (GreetingService) context.getBean("spanishGreetingService");
            greetingService2.greet("virat");
        }
        catch (NoSuchBeanDefinitionException ne){
            System.out.println("NoSuchBeanDefinitionException ! Please recheck the bean name");
        }


    }
}
