/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package quick_java_fpp.fundamental.anonymousClasses;


public class AnonymousClassExample1 {
    public static void main(String... args) {
        AnonymousClassExample1 myApp = new AnonymousClassExample1();
        myApp.sayHello();
    }

    public void sayHello() {
        class LocalClassEnglishGreeting implements HelloWorld {
            String name = "world";

            public void greet() {
                greetSomeone("world");
            }

            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }

        HelloWorld englishGreeting = new LocalClassEnglishGreeting();

        /** Anonymous Class is an expression i.e Declaration is as:
         HelloWorld <anonymousClassName> = new HelloWorld(){......};
         */
        HelloWorld AnonymousClassEnglishGreeting = new HelloWorld() {
            String name = "world";

            public void greet() {
                greetSomeone("world");
            }

            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        };

        // Execution
        englishGreeting.greet();
        englishGreeting.greetSomeone("Kushal");
        AnonymousClassEnglishGreeting.greet();
        AnonymousClassEnglishGreeting.greetSomeone("Kushal");
    }

    interface HelloWorld {
        void greet();

        void greetSomeone(String someone);
    }
}
