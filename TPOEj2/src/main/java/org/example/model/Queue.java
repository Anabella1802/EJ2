package org.example.model;

public class Queue {
    private static final int MAX = 10000;
    private final int[] elements;
    private int front, rear, count;

    public Queue() {
        this.elements = new int[MAX];
        this.front = 0;
        this.rear = -1;
        this.count = 0;
    }

    public int getFirst() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return elements[front];
    }

    public void remove() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        front++;
        count--;
    }

    public void add(int value) {
        if (count == MAX) {
            throw new RuntimeException("Queue is full");
        }
        elements[++rear] = value;
        count++;
    }

    public boolean isEmpty() {
        return count == 0;
    }
}