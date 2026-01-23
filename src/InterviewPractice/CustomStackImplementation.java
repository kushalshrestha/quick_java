/*
 * Copyright (c) 2025.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package InterviewPractice;

import java.util.EmptyStackException;



class Node {
    private int data;
    private Node nextNode;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public Node getNextNode(){
        return this.nextNode;
    }

    public void setData(int data){
        this.data = data;
    }

    public void setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }
}

class CustomStack {
    int length = 0;
    Node top = null;

    public boolean isEmpty(){
        return top == null;
    }

    public void push(int data){
        Node currentNode = new Node(data);
        currentNode.setNextNode(top);
        top = currentNode;
        length++;
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Node node = top;
        top = top.getNextNode();
        length--;
        return node.getData();
    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Node node = top;
        return node.getData();
    }
}

public class CustomStackImplementation {
    public static void main(String[] args) {
        CustomStack cs = new CustomStack();
        cs.push(2);
        cs.push(4);
        cs.push(6);
        cs.push(8);
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.peek());
        System.out.println(cs.pop());
    }
}
