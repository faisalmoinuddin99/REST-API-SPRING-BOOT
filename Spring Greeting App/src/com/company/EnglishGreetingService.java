package com.company;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EnglishGreetingService implements GreetingService {

    private TimeService timeService;

    @Autowired
    public EnglishGreetingService(@Qualifier("timeService12HourFormat")
                                          TimeService timeService) {
        this.timeService = timeService;
    }
    @Override
    public void greet(String name) {
        int time = timeService.getCurrentTime();
        String greetingMessage ;
        if(time < 12){
            greetingMessage = "Good Morning";
        } else if(time < 17){
            greetingMessage = "Good Afternoon";
        }else{
            greetingMessage = "Good Evening";
        }
        System.out.println("Hello " + greetingMessage + " " + name);
    }
}
