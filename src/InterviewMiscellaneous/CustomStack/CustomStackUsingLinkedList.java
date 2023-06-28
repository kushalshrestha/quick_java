/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package InterviewMiscellaneous.CustomStack;

import java.util.EmptyStackException;


public class CustomStackUsingLinkedList<T> {

    private Node<T> top;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        CustomStackUsingLinkedList<Integer> stack = new CustomStackUsingLinkedList<>();
        stack.push(1);
        stack.push(13);
        stack.push(23);

        System.out.println("Size: " + stack.size());
        System.out.println("Top: " + stack.peek());
        stack.pop();

        System.out.println("Size: " + stack.size());
        System.out.println("Top: " + stack.peek());
    }




    private void push(T value) {
        Node<T> newNode = new Node<>(value);
        if(isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        size = size + 1;
    }

    private T pop() {
        if(isEmpty()) throw new EmptyStackException();
        T value = top.data;
        top = top.next;
        size = size - 1;
        return value;
    }

    private T peek() {
        if (isEmpty()) throw new EmptyStackException();
        return top.data;
    }

    private int size() {
        return size;
    }

    private boolean isEmpty() {
        return top == null;
    }

}
