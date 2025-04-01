/*
 * Copyright (c) 2025.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package practice2025.fundamental;

@FunctionalInterface
interface CustomFunctionalInterface {
    void operate(int a, int b);

    default void objective() {
        System.out.println("Default method");
    }

    static void objective2() {
        System.out.println("Static method");
    }
}

public class CanFunctionalInterfaceDefaultAndStaticMethods {
    public static void main(String[] args) {
        CustomFunctionalInterface cfiAdd = (int a, int b) -> System.out.println(a + b);
        CustomFunctionalInterface cfiSubtract = (int a, int b) -> System.out.println(a - b);

        cfiAdd.operate(2, 3);
        cfiAdd.objective();
        CustomFunctionalInterface.objective2(); // Static method needs to be called in this way


        cfiSubtract.operate(5, 2);
        cfiSubtract.objective();
        CustomFunctionalInterface.objective2(); // Static method needs to be called in this way


    }
}


