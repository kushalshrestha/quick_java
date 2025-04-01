/*
 * Copyright (c) 2025.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package practice2025.fundamental.JavaOOP;

public class Inheritance {
    public static void main(String[] args) {
    ArmoredCar ac = new ArmoredCar();
    ac.displayMode();
        System.out.println(ac.model);
        System.out.println(ac.wheels);
        System.out.println(ac.bulletProofWindows);
    }
}

class Car {
    int wheels;
    String model = "New Car Model";
}

class ArmoredCar extends Car {
    int bulletProofWindows;
    String model = "New Armored Car Model";

    ArmoredCar() {
        this.bulletProofWindows = 4;
    }

    public void displayMode() {
        System.out.println(model);
        System.out.println("Accessing parent variable using super : " + super.model);
    }
}
