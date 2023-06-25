/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package quick_java_mpp.lesson7.diamondProblem;


interface Interface3 {
    void conflictingMethod();

}

interface Interface4 {
    default void conflictingMethod() {
        System.out.println("Default implementation of conflictingMethod from Interface2");
    }
}

/**
 * If two interfaces have same method but one of these is default. 1st Option: Override the method
 */
public class TwoInterfacesWithSameMethodButOneWithDefaultMethod {
    public static void main(String[] args) {
//        MyClass2 myObj = new MyClass2();
//        myObj.conflictingMethod(); // Output: Custom implementation of conflictingMethod in MyClass
    }
}

abstract class MyClass2 implements Interface3, Interface4 {

    @Override
    public abstract void conflictingMethod(); // override conflicting method by creating abstract method
}
