/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package InterviewQuestions.WhyStringsAreImmutable;

/**
 * Thread Safety: since they cannot be modified, multiple threads can safely access,
 * reducing the risk of race conditions and thread interference
 *
 * In this example, we have two threads, t1 and t2, operating on a shared string sharedString.
 * The first thread concatenates " World" to the string, while the second thread converts the string to uppercase.
 * Both threads modify the sharedString variable.
 *
 * Due to the immutability of strings, when a thread modifies a string, it creates a new string object with the desired
 * changes instead of modifying the original string. This ensures that each thread operates on its own copy of
 * the string, preventing any interference between threads.
 *
 * If strings were mutable, concurrent modifications by multiple threads could lead to unexpected results or data
 * corruption. However, in this example, the immutability of strings guarantees that the modifications performed by
 * each thread do not affect the other thread's operation. Each thread works independently on its own version of the string.
 *
 * Therefore, the output of the program will be consistent and thread-safe, regardless of the order in which the
 * threads execute. The immutability of strings ensures that no data races or inconsistencies occur during
 * concurrent operations on the shared string.
 */
public class ThreadSafetyExample {
    private static String sharedString = "Hello";
    private static StringBuilder sharedStringBuilder = new StringBuilder("Hello");


    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            sharedString = sharedString.concat(" World");
            System.out.println("t1 : " + sharedString);
        });

        Thread t2 = new Thread(() -> {
            sharedString = sharedString.toUpperCase();
            System.out.println("t2 : " + sharedString);
        });

        t1.start();
        t2.start();


//        Thread t3 = new Thread(() -> {
//            sharedStringBuilder.append(" World");
//            System.out.println(" t3 : " + sharedStringBuilder.toString());
//        });
//
//        Thread t4 = new Thread(() -> {
//            sharedStringBuilder.reverse();
//            System.out.println(" t4 : " + sharedStringBuilder.toString());
//        });
//
//        t3.start();
//        t4.start();

    }
}

