package org.example.utils;
import org.example.model.Queue;
import org.example.model.Stack;

public class QueueUtil {
    public static Queue revert(Queue queue) {
        Stack stack = new Stack();

        while (!queue.isEmpty()) {
            stack.add(queue.getFirst());
            queue.remove();
        }

        Queue reversedQueue = new Queue();
        while (!stack.isEmpty()) {
            reversedQueue.add(stack.getTop());
            stack.remove();
        }

        return reversedQueue;
    }
}