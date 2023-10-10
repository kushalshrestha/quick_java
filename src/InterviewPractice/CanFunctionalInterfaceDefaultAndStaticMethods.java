/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package InterviewPractice;

/* Can Functional interface have default and static methods */

@FunctionalInterface
interface CustomFunctionalInterface {
    void operate(int a, int b);

    default void objective() {
        System.out.println("This is an functional interface with default method");
    }

    static void anotherObjective() {
        System.out.println("This is a functional interface with static method");
    }
}
public class CanFunctionalInterfaceDefaultAndStaticMethods {
    public static void main(String[] args) {
        CustomFunctionalInterface cfiAdd = (int a, int b) -> System.out.println(a + b);
        CustomFunctionalInterface cfiSubtract = (int a, int b) -> System.out.println(a - b);

        cfiAdd.operate(2, 3);
        cfiAdd.objective();
        CustomFunctionalInterface.anotherObjective();

        cfiSubtract.operate(2, 3);
        cfiSubtract.objective();
        CustomFunctionalInterface.anotherObjective();
    }
}
