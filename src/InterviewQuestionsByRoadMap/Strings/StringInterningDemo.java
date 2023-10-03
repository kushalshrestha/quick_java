/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package InterviewQuestionsByRoadMap.Strings;

/* Q: Coding Question: Write a Java program to demonstrate string interning and compare the performance
of string literals and string objects created using constructors.
 */

public class StringInterningDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println("s1 == s2: " + (s1 == s2)); // Output: true (Both from the string pool)
        System.out.println("s1 == s3: " + (s1 == s3)); // Output: false (s3 is a new string object)

        String s4 = s3.intern();
        System.out.println("s1 == s4: " + (s1 == s4)); // Output: true (s4 is interned from the pool)

        long startTime1 = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            String str1 = "Java";
            String str2 = new String("Java");
        }
        long endTime1 = System.nanoTime();
        long elapsedTime1 = endTime1 - startTime1;
        System.out.println("Time taken for string literals: " + elapsedTime1 + " nanoseconds");

        long startTime2 = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            String str3 = new String("Java");
        }
        long endTime2 = System.nanoTime();
        long elapsedTime2 = endTime2 - startTime2;
        System.out.println("Time taken for string objects: " + elapsedTime2 + " nanoseconds");
    }
}

