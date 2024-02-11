package com.herdeybayor.momento;

import java.util.Stack;

public class History {
    private final Stack<EditorState> states = new Stack<>();

    public void push(EditorState state) {
        states.push(state);
    }

    public EditorState pop() {
        if (states.isEmpty()) {
            System.out.println("History is empty");
        }
        return states.pop();
    }
}
