package com.company;

public class Main {

    public static void main(String[] args) {
	// Tight Coupling
        Greeting g = new Greeting();
                g.greet("faisal");
    }
}

// Depedent Class

/*
In the future, if you want to change the greeting service to some other
service that greets in French, for example, you would need to make
changes in the Main class as well.
* */