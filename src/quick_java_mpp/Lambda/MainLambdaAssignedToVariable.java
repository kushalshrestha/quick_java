/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package quick_java_mpp.Lambda;

public class MainLambdaAssignedToVariable {
    public static void main(String[] args) {
        // Lambda function assigned to a variable
        Runnable myLambda = () -> System.out.println("Hello, lambda!");

        // Invoking the lambda functxion through the variable
        myLambda.run();
    }
}
