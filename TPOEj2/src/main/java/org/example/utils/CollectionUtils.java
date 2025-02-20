package org.example.utils;
import org.example.model.Stack;

public class CollectionUtils {
    public static Stack reverseStack(Stack stack) {
        Stack tempStack = new Stack();
        while (!stack.isEmpty()) {
            tempStack.add(stack.getTop());
            stack.remove();
        }
        return tempStack;
    }
}