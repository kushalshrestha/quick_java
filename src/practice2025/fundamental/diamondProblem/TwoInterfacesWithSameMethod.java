/*
 * Copyright (c) 2025.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package practice2025.fundamental.diamondProblem;

public class TwoInterfacesWithSameMethod {
    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        myObj.conflictingMethod(); //class should have implementation of the method (This is general concept)

        MyAnotherClass myAnotherObj = new ConcreteClass();
        myAnotherObj.conflictingMethod(); // Calls the overridden method in ConcreteClass

    }
}

interface Interface1 {
    void conflictingMethod();

}

interface Interface2 {
    void conflictingMethod();
}

interface Interface3 {
    default void conflictingMethod(){
        System.out.println("Default Implementation of conflicting method");
    }
}

class MyClass implements Interface1, Interface2 {

    @Override
    public void conflictingMethod() {
        System.out.println("Custom Implementation of conflicting method");
    }
}

abstract class MyAnotherClass implements Interface1, Interface3 {

    // Inherits abstract method from Interface1 and default method from Interface3
    // Java forces : to override explictly or remain abstract
    @Override
    public abstract void conflictingMethod();
}

// Concrete class that extends MyAnotherClass and provides implementation
class ConcreteClass extends MyAnotherClass {
    @Override
    public void conflictingMethod() {
        System.out.println("ConcreteClass overriding conflictingMethod");
    }
}


