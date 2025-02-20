package org.example.model;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class QueueWithPriority<P extends Comparable<P>, V> {
    private PriorityQueue<Entry<P, V>> queue = new PriorityQueue<>(Comparator.comparing(Entry::getPriority));

    public void enqueue(P priority, V value) {
        queue.add(new Entry<>(priority, value));
    }

    public V dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue with priority is empty");
        }
        return queue.poll().getValue();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    private static class Entry<P, V> {
        private final P priority;
        private final V value;

        public Entry(P priority, V value) {
            this.priority = priority;
            this.value = value;
        }

        public P getPriority() {
            return priority;
        }

        public V getValue() {
            return value;
        }
    }
}