package upgrad.calculator.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("upgrad.calculator.service");
        Calculator calculator = (Calculator) context.getBean("calculator");

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Operation (add,sub)");
            System.out.println("Choose from Above operation:");
            String op = scanner.next();
            System.out.print("x: ");
            int x = scanner.nextInt();
            System.out.print("y: ");
            int y = scanner.nextInt();
            System.out.println("Result: " + calculator.compute(op, x, y));
        } catch (RuntimeException re){
            System.out.println("Operation Not found");
        }


    }
}
