package com.herdeybayor.momento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private final List<EditorState> states = new ArrayList<>();

    public void push(EditorState state) {
        states.add(state);
    }

    public EditorState pop() {
        var lastIndex = states.size();
        return states.remove(lastIndex-1);
    }
}
