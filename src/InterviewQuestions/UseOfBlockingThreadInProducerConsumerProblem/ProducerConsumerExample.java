/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package InterviewQuestions.UseOfBlockingThreadInProducerConsumerProblem;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Q. How will you use BlockingQueue to implement a producer-consumer problem?
 * Blocking queue is a data structure in Java that provides thread-safe operations for adding and removing elements
 *
 * Blocking Queue provides blocking operations, meaning that if the queue is empty, a thread trying to remove an
 * element will be blocked until an element becomes available, and if the queue is full, a thread trying to
 * add an element will be blocked until space becomes available.
 *
 * */
public class ProducerConsumerExample {
    private static final int QUEUE_CAPACITY = 10;

    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(QUEUE_CAPACITY);

        Thread producerThread = new Thread(() -> {
            try {
                for (int i = 1; i <= 20; i++) {
                    queue.put(i);
                    System.out.println("Produced: " + i);
                }
            } catch (InterruptedException e) { // InterruptedException is thrown when a thread is interrupted while
                // it's waiting, sleeping,, or otherwise occupied
                Thread.currentThread().interrupt();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                while (true) {
                    int number = queue.take();
                    System.out.println("Consumed: " + number);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}

