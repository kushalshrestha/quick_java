/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package quick_java_mpp.Consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTutorial {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>(Arrays.asList("John", "Mary", "Peter", "Alice"));

        Consumer<String> consumerObj = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        nameList.forEach(consumerObj);


        // this too works but foreach accepts instance of functional
        // interface, so you just need to pass an instance of functional interface i.e consumerObj
        nameList.forEach(s->consumerObj.accept(s));
    }
}

