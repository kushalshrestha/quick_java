/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package quick_java_mpp.Lambda;

import java.util.function.Function;

public class MainLambdaFunctionAsReturnFromFunction {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplier = getMultiplier(2);
        System.out.println(multiplier.apply(5)); // Output: 10
    }

    public static Function<Integer, Integer> getMultiplier(int factor) {
        return number -> number * factor;
    }
}
