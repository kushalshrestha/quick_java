/*
 * Copyright (c) 2025.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package practice2025.fundamental.JavaOOP;

interface Floatable {
    int duration = 10;

    void floatOnWater();

    default void addEngine() {
        System.out.println("Add Float engine completed");
    }
}


interface Flyable {
    int duration = 20;

    void fly();

    default void addEngine() {
        System.out.println("Add Fly engine completed");
    }
}

interface SuperTraveller extends Floatable, Flyable {

    @Override
    default void floatOnWater() {

    }

    @Override
    default void addEngine() {
        Floatable.super.addEngine();
        Flyable.super.addEngine();
    }

    @Override
    default void fly() {

    }
}

/*
 * Tags: InterfaceExample, Interface, MultipleInheritance
 * */
public class InterfaceExample extends Car implements Floatable, Flyable {
    public static void main(String[] args) {
        System.out.println("Until Java 7, interfaces could only define abstract methods, that is, methods without any\n implementation. So if a class implemented multiple interfaces with the same method signature, it was not a problem.\n The implementing class eventually had just one method to implement.\n");
        System.out.println("Starting with Java 8, interfaces could choose to define default implementations for its methods\n.This means that if a class implements multiple interfaces, which define methods with the same signature, the child\n class would inherit separate implementations.This sounds complex and is not allowed.\n" + "\n" + "Java disallows inheritance of multiple implementations of the same methods, defined in separate interfaces.");
        System.out.println("* If we do want to implement both interfaces, we'll have to override the addEngine() method. ");
        System.out.println("=========");
        InterfaceExample ie = new InterfaceExample();
        ie.floatOnWater();
        ie.fly();
        ie.addEngine();

        System.out.println("=========");
        System.out.println("Interfaces Extending Other interfaces");
        System.out.println("See SuperTraveller interface for implementation");
    }

    @Override
    public void floatOnWater() {
        System.out.println("I can float on Water");
    }

    @Override
    public void addEngine() {
        System.out.println("duration value from Floatable interface : " + Floatable.duration);
        System.out.println("duration value from Flyable interface : " + Flyable.duration);
        Flyable.super.addEngine();
        Floatable.super.addEngine();
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}