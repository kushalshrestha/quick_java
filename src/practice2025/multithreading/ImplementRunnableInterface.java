/*
 * Copyright (c) 2025.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package practice2025.multithreading;

public class ImplementRunnableInterface{

    public static void main(String[] args) {
        int n = 5;
        for (int i=0 ; i<5; i++){
            Thread t1 = new Thread(new SampleThread1());
            t1.start();
        }
    }

}

class SampleThread1 implements Runnable {
    @Override
    public void run() {
        try {
            // Displaying the thread that is running
            System.out.println(
                    "Thread " + Thread.currentThread().getId()
                            + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("An exception is caught");
        }
    }
}