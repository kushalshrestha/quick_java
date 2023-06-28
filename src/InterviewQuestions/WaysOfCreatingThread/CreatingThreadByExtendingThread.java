/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package InterviewQuestions.WaysOfCreatingThread;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}
public class CreatingThreadByExtendingThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
