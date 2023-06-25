/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package quick_java_mpp.lesson7.diamondProblem;


/**
 * If two interfaces have same method. 1st Option: Override the method
 * */
public class TwoInterfacesWithSameMethod {
    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        myObj.conflictingMethod(); // Output: Custom implementation of conflictingMethod in MyClass
    }
}

interface Interface1 {
    default void conflictingMethod() {
        System.out.println("Default implementation of conflictingMethod from Interface1");
    }
}

interface Interface2 {
    default void conflictingMethod() {
        System.out.println("Default implementation of conflictingMethod from Interface2");
    }
}

class MyClass implements Interface1, Interface2 {
    @Override
    public void conflictingMethod() {
        System.out.println("Custom implementation of conflictingMethod in MyClass");
    }
}



