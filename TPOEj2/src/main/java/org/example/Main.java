package org.example;
import org.example.model.Stack;
import org.example.model.Queue;
import org.example.utils.StackUtil;
import org.example.utils.QueueUtil;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        System.out.println("Original Stack: 3, 2, 1");

        Stack invertedStack = StackUtil.revert(stack);
        System.out.print("Inverted Stack: ");
        while (!invertedStack.isEmpty()) {
            System.out.print(invertedStack.getTop() + " ");
            invertedStack.remove();
        }
        System.out.println();

        Queue queue = new Queue();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue Dequeue: " + queue.getFirst());
        queue.remove();

        Queue reversedQueue = QueueUtil.revert(queue);
        System.out.print("Reversed Queue: ");
        while (!reversedQueue.isEmpty()) {
            System.out.print(reversedQueue.getFirst() + " ");
            reversedQueue.remove();
        }
        System.out.println();
    }
}