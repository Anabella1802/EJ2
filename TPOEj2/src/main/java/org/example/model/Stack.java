package org.example.model;

public class Stack {
    private static final int MAX = 10000;
    private final int[] elements;
    private int count;

    public Stack() {
        this.elements = new int[MAX];
        this.count = 0;
    }

    public int getTop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return elements[count - 1];
    }

    public void remove() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        count--;
    }

    public void add(int value) {
        elements[count++] = value;
    }

    public boolean isEmpty() {
        return count == 0;
    }
}
