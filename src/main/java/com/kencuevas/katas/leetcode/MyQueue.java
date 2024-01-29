package com.kencuevas.katas.leetcode;

import java.util.Stack;

/*
 * kata name: Implement Queue using Stacks
 * Is difficult for me? Very easy
 * Difficult in Leet code: Easy
 * Status: Done
 * Date: 29/01/2024
 */
public class MyQueue {
    Stack<Integer> queue = new Stack<>();

    public MyQueue() {
    }

    //Pushes element x to the back of the queue.
    public void push(int x) {
        queue.push(x);
    }

    //Removes the element from the front of the queue and returns it.
    public int pop() {
        return queue.remove(0);
    }

    //Returns the element at the front of the queue.
    public int peek() {
        return queue.firstElement();
    }

    //Returns true if the queue is empty, false otherwise.
    public boolean empty() {
        return queue.empty();
    }
}