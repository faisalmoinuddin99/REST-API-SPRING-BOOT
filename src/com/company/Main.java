package com.company;

public class Main {

    public static void main(String[] args) {
        GreetingFactory gf = new GreetingFactory();
        GreetingService gs =   gf.getInstance("spanish") ;
                gs.greeting(" Faisal");
    }
}

/*
STEPS TO ACHIVE LOOSE COUPLING:

1. We can make applications loosely coupled by introducing the following:
○ Interfaces
○ Factory pattern

2. Factory Pattern :

○ Created GreetingService Interface
○ Implements that interface using two classes called EnglishGreeting and SpanishGreeting
○ Then created GreetingFactory --> ye isliye banaya gaya hai ki direct agar aap main method mai objects create kro gay
to user k samne pura implementation disclose ho jaiga. isliye Hum ne Ye factory class banaya hai jo hide kr degaya
acutal class name ko.

○ Now created the object of GreetingFactory and call the method, which ask the user whats your language

* */