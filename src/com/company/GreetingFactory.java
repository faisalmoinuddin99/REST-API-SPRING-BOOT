package com.company;

public class GreetingFactory {
    public GreetingService getInstance(String language){
        if (language.equals("english") || language.equals("English")){
            return new EnglishGreeting() ;
        }
        else  if (language.equals("Spanish") || language.equals("spanish")){
            return  new SpanishGreeting();
        }
        else{
            throw new RuntimeException("No greeting service exisit " + language + " language") ;
        }
    }
}
