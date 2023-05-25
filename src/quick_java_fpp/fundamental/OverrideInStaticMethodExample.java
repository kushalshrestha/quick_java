/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package quick_java_fpp.fundamental;

public class OverrideInStaticMethodExample {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        Animal anotherAnimal = new Animal();

        Animal.testClassMethod(); // static method in Animal
        Cat.testClassMethod();  // static method in Cat
        myAnimal.testInstanceMethod(); //instance method in Cat i.e got overridden
        anotherAnimal.testInstanceMethod(); //instance method in Animal
    }
}

class Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }
}

class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }
}
