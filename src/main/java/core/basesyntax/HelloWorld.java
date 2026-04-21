package core.basesyntax.model;

import java.time.LocalDate;

public class HelloWorld {
    private static final int START_NUMBER = 1;
    private static final int END_NUMBER = 10;
    private static final int DIVISOR = 2;
    private static final int AGE = 25;

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello("Hello");
        helloWorld.initializeVariables();
        System.out.println(helloWorld.getFromOneToTen());
    }

    private String getFromOneToTen() {
        String result = "";

        for (int i = START_NUMBER; i <= END_NUMBER; i++) {
            if (i % DIVISOR == 0) {
                result = result + i + " ";
            }
        }

        return result.trim();
    }

    private void sayHello(String hello) {
        System.out.println("Hello, Mate! I am happy to see you! This class looks weird!");
        System.out.println(hello);
    }

    private void initializeVariables() {
        String greeting = "Hello mates!";
        int currentYear = LocalDate.now().getYear();

        System.out.println(greeting);
        System.out.println("It is " + currentYear + " year");
        System.out.println("I'm " + AGE);
    }
}
