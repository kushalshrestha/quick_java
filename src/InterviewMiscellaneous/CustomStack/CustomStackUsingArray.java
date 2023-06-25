/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package InterviewMiscellaneous.CustomStack;

import java.util.Arrays;

/**
 * CUSTOM STACK USING ARRAY
 * Question: Custom implementation of stack where there are two additional methods
 * that return the min and max of the elements in the stack
 * Stack -> push(), pop(), peek(), size();
 */
public class CustomStackUsingArray {
    private final int capacity;
    private final int[] stack;
    private int top;
    private int max;
    private int min;

    public CustomStackUsingArray(int capacity) {
        this.stack = new int[capacity];
        this.top = -1;
        this.capacity = capacity;
        this.max = Integer.MIN_VALUE;
        this.min = Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        CustomStackUsingArray stack = new CustomStackUsingArray(5);
        stack.push(1);
        stack.push(13);
        stack.push(23);

        System.out.println("Size : " + stack.size());
        System.out.println("Top: " + stack.peek());
        stack.pop();

        System.out.println("Size: " + stack.size());
        System.out.println("Top: " + stack.peek());

        System.out.println("Min: " + stack.getMin());
        System.out.println("Max: " + stack.getMax());


    }

    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack full");
            return;
        }
        int index = top + 1;
        stack[index] = value;
        top = top + 1;

        min = Math.min(min, value);
        max = Math.max(max, value);
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack empty");
            return -1;
        }
        int index = top - 1;

        if (stack[index] == min || stack[index] == max) {
            updateMinMax();
        }

        return stack[index];
    }

    private void updateMinMax() {
        min = Arrays.stream(stack, 0, top + 1)
                    .min()
                    .orElse(Integer.MAX_VALUE);
        max = Arrays.stream(stack, 0, top + 1)
                    .max()
                    .orElse(Integer.MIN_VALUE);
    }

    public int getMin() {
        if (top == -1) {
            throw new IllegalStateException("Stack is empty.");
        }
        return min;
    }

    public int getMax() {
        if (top == -1) {
            throw new IllegalStateException("Stack is empty.");
        }
        return max;
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack empty, cannot peek");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

}
