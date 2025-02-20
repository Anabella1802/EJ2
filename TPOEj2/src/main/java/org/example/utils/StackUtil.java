package org.example.utils;
import org.example.model.Stack;

public class StackUtil {
    public static Stack revert(Stack stack) {
        Stack tempStack = new Stack();
        while (!stack.isEmpty()) {
            tempStack.add(stack.getTop());
            stack.remove();
        }
        return tempStack;
    }
}