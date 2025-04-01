/*
 * Copyright (c) 2025.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package practice2025.fundamental.anonymousClasses;

public class AnonymousClassExample {
    public static void main(String[] args) {
        AnonymousClassExample ace = new AnonymousClassExample();
        ace.sayHello();
    }

    public void sayHello() {
        class LocalClassEnglishGreeting {
            String name = "world";

            public void greet() {
                System.out.println("Hello " + name);
            }
        }



        HelloWorld hw = new HelloWorld() {
            @Override
            public void greet() {
                System.out.println("Hello Kushal from anonymous class");
            }
        };



        LocalClassEnglishGreeting lceg = new LocalClassEnglishGreeting();
        lceg.greet();
        hw.greet();

    }



    interface HelloWorld {
        void greet();
    }


}
