/*
 * Copyright (c) 2025.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package practice2025.multithreading;

public class ExtendThread extends Thread {
    public static void main(String[] args) {
        int n = 5;
        for (int i=0 ; i<5; i++){
            SampleThread t1 = new SampleThread();
            t1.start();
        }
    }
}

class SampleThread extends Thread {
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        }catch (Exception e){
            System.out.println("An exception is caught");
        }
    }
}
