package com.kotlin;

import java.util.ArrayDeque;

public class Deque {
    private final ArrayDeque<Object> stack = new ArrayDeque<>();

    public ArrayDeque<Object> getStack() {
        return stack;
    }

    public Object popStack() {
        return stack.poll();
    }
}
