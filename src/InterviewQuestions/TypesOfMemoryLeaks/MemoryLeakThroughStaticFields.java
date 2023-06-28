/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package InterviewQuestions.TypesOfMemoryLeaks;

import java.util.ArrayList;
import java.util.List;

/**
 * One of the reason for memory leak is through heavy use of static variables
 *
 * In java, static fields have a life that usually matches the entire lifetime of the running applications (unless
 * ClassLoader becomes eligible for garbage collection).
 * */
public class MemoryLeakThroughStaticFields {
    public static List<Double> list = new ArrayList<>();

    public void populateList() {
        for (int i = 0; i < 10000000; i++) {
            list.add(Math.random());
        }
        System.out.println("Debug Point 2");
    }

    public static void main(String[] args) {
        System.out.println("Debug Point 1");
        new MemoryLeakThroughStaticFields().populateList();
        System.out.println("Debug Point 3");
    }
}
