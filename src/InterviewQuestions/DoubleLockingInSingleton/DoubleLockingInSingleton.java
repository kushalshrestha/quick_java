/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package InterviewQuestions.DoubleLockingInSingleton;


/**
 * Q. Explain double-level locking in a singleton design pattern
 * - a technique used in the singleton design pattern to ensure thread safety and efficient initialization of
 * a singleton instance
 *
 * - it checks if the instance is already created before acquiring a lock, and if not, acquiring a lock to
 * prevent multiple threads from simultaneously creating the instance
 * */

public class DoubleLockingInSingleton {
    private static volatile DoubleLockingInSingleton instance;  // Volatile ensures visibility across threads
    private static Object lock = new Object();  // Lock object for synchronization

    private DoubleLockingInSingleton() {
        // Private constructor to prevent external instantiation
    }

    public static DoubleLockingInSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleLockingInSingleton.class) {
                if (instance == null) {
                    instance = new DoubleLockingInSingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        DoubleLockingInSingleton singleton1 = DoubleLockingInSingleton.getInstance();
        DoubleLockingInSingleton singleton2 = DoubleLockingInSingleton.getInstance();

        System.out.println("Are the singleton objects the same? " + (singleton1 == singleton2));
    }
}


