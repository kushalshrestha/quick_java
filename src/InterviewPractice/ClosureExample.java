/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package InterviewPractice;

/* Closure are the lambda expression, that can capture and use variables from the surrounding scope, as long as those
variables are effectively final or explicitly declared final.
effectively final -> value not changed. If changed gives compilation error
 */
public class ClosureExample {
    public static void main(String[] args) {
        int effectivelyFinalVar = 10;
        final int explicitlyFinalVar = 20;
//        effectivelyFinalVar = 100;   // Compilation error

        Runnable runnable1 = () -> {System.out.println("Effectively final : " + effectivelyFinalVar);};
        Runnable runnable2 = () -> {System.out.println("Explicitly final : " + explicitlyFinalVar);};

        runnable1.run();
        runnable2.run();

    }
}
