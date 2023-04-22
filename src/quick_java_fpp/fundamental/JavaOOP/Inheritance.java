/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package quick_java_fpp.fundamental.JavaOOP;
/*
Tags: Inheritance, AccessModifier
* A subclass doesn't inherit private and static members of parent class
* Subclass inherits non-static protected and non-static public members
* Default (package-private) is an access modifier which can access from parent class within the package
* Class can inherit using 'extends' keyword. Only one class can be extended.
* But multiple interface can be implemented by a class
*/
public class Inheritance {
    public static void main(String[] args) {
        System.out.println("* A subclass doesn't inherit private and static members of parent class\n" +
                "* Subclass inherits non-static protected and non-static public members\n" +
                "* Default (package-private) is an access modifier which can access from parent class within the package\n" +
                "* Class can inherit using 'extends' keyword. Only one class can be extended.\n" +
                "* But multiple interface can be implemented by a class");
        System.out.println("============");
        ArmoredCar ac = new ArmoredCar();
        ac.displayModel();
    }
}

class Car {
    int wheels;
    String model = "New Car Model";

}

class ArmoredCar extends Car {
    int bulletProofWindows;
    String model = "New Armored Car";

    ArmoredCar(){
        this.bulletProofWindows = 4;
    }

    public void displayModel(){
        System.out.println(model);
        System.out.println("Accessing parent variable using super : " + super.model);
    }
}
