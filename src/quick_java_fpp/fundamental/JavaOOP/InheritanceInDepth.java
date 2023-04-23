/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package quick_java_fpp.fundamental.JavaOOP;

/*
* Tags: Inheritance (IS-A), Association, Composition(strongest form of association, HAS-A), IS-A, HAS-A
* Composition : If an object is composed by another object. During destory phase, both are destroyed.
*/
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
