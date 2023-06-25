/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package quick_java_mpp.Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

interface MyLambda {
    void doSomething(String value);
}

public class MainLambdaFunctionPassesAsArgument {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Mary", "Alice");

        // Passing lambda function as an argument
        printNames(names, (name) -> System.out.println("Hello, " + name + "!"));
        // Another example
        names.forEach(name -> System.out.println(name));
    }

    public static void printNames(
            List<String> names,
            MyLambda lambda
    ) {
        for (String name : names) {
            lambda.doSomething(name);
        }
    }
}
