package org.coursera.lab.strategy;

import java.util.ArrayList;

/*
    Yousif Wali
    01/25/2025
    Object-Oriented Analysis and Design Pattern and Principles
*/

/**
 * Strategy interface for defining car handling algorithms.
 */

interface HandlingStrategy {
    /**
     * Executes the handling behavior for the car.
     */
    void handle();
}
/**
 * Concrete strategy for safety handling.
 */
class SafetyHandling implements HandlingStrategy {
    @Override
    public void handle() {
        System.out.println("Safety handling");
    }
}

/**
 * Concrete strategy for sport handling
 */
class SportHandling implements HandlingStrategy {
    @Override
    public void handle() {
        System.out.println("makes a tight turn");
    }
}
/**
 * Concrete strategy for racing handling
 */
class RacingHandling implements HandlingStrategy {
    @Override
    public void handle() {
        System.out.println("skids through a turn");
    }
}
/**
 * Abstract class representing a generic car.
 */
abstract class Car{
    protected String name;
    protected HandlingStrategy handlingStrategy;
    private static int carCounter = 0;

    /**
     * Constructor for creating a car with a specified handling strategy.
     *
     * @param type  the type of car (e.g., coupe, sedan, convertible)
     * @param handlingStrategy the handling strategy for the car
     */
    public Car(String type, HandlingStrategy handlingStrategy) {
        carCounter++;
        this.name = type + " " + carCounter;
        this.handlingStrategy = handlingStrategy;
    }

    /**
     * Sets a new handling strategy for the car.
     *
     * @param handlingStrategy the new handling strategy
     */
    public void setHandlingStrategy(HandlingStrategy handlingStrategy) {
        this.handlingStrategy = handlingStrategy;
    }

    /**
     * Executes the car's handling behavior
     */
    public void handle(){
        System.out.print(name = " ");
        handlingStrategy.handle();
    }
}
/**
 * Concrete class for a coupe car type
 */
class Coupe extends Car{
    /**
     * Constructor for creating a coupe with a specific handling strategy.
     *
     * @param handlingStrategy the handling strategy for the coupe
     */
    public Coupe( HandlingStrategy handlingStrategy) {
        super("coupe", handlingStrategy);
    }
}
/**
 * Concrete class for a sedan car type
 */
class Sedan extends Car{
    /**
     * Constructor for creating a sedan with a specific handling strategy.
     *
     * @param handlingStrategy the handling strategy for the sedan
     */
    public Sedan( HandlingStrategy handlingStrategy) {
        super("sedan", handlingStrategy);
    }
}

/**
 * Concrete class for a convertible car type
 */
class Convertible extends Car{
    /**
     * Constructor for creating a convertible with a specific handling strategy.
     *
     * @param handlingStrategy the handling strategy for the convertible
     */
    public Convertible( HandlingStrategy handlingStrategy) {
        super("convertible", handlingStrategy);
    }
}


/**
 * Main class to demonstrate the use of the Strategy pattern with cars and handling strategies.
 */
public class Main {
    /**
     * Main method to demonstrate the functionality of the program.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Instantiate handling strategies
        HandlingStrategy safety = new SafetyHandling();
        HandlingStrategy sport = new SportHandling();
        HandlingStrategy racing = new RacingHandling();

        // Create a list of cars with different handling strategies
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Coupe(safety));
        cars.add(new Coupe(sport));
        cars.add(new Coupe(racing));
        cars.add(new Sedan(safety));
        cars.add(new Sedan(sport));
        cars.add(new Sedan(racing));
        cars.add(new Convertible(safety));
        cars.add(new Convertible(sport));
        cars.add(new Convertible(racing));

        // Call the handle method for all cars
        for (Car car : cars) {
            car.handle();
        }
    }
}