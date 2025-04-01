/*
 * Copyright (c) 2025.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package practice2025.fundamental.JavaOOP;

public class InheritanceInDepth {
    public static void main(String[] args) {
        System.out.println("See Person class. Waitress is a Person, Actress is a Person");
    }
}

class Person {
    private final String name;

    Person(String name) {
        this.name = name;
    }
}

class Waitress extends Person {

    Waitress(String name) {
        super(name);
    }

    public String serverStarter(String starter) {
        return "Serving a " + starter;
    }

}

class Actress extends Person {

    Actress(String name) {
        super(name);
    }

    public String readScript(String movie) {
        return "Reading the script of " + movie;
    }
}

