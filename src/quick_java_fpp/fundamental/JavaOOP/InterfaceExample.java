/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package quick_java_fpp.fundamental.JavaOOP;

interface Floatable {
    void floatOnWater();
}


interface Flyable {
    void fly();
}

/*
 * Tags: InterfaceExample
 * */
public class InterfaceExample extends Car implements Floatable, Flyable {
    public static void main(String[] args) {
        InterfaceExample ie = new InterfaceExample();
        ie.floatOnWater();
        ie.fly();
    }

    @Override
    public void floatOnWater() {
        System.out.println("I can float on Water");
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}



