package org.example.model;
import java.util.HashSet;
import java.util.Iterator;

public class Set<T> implements Iterable<T> {
    private HashSet<T> elements = new HashSet<>();

    public void add(T value) {
        elements.add(value);
    }

    public void remove(T value) {
        elements.remove(value);
    }

    public boolean contains(T value) {
        return elements.contains(value);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public Iterator<T> iterator() {
        return elements.iterator();
    }
}