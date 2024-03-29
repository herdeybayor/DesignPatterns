package com.herdeybayor.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private final List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        var lastIndex = urls.size() - 1;
        return urls.remove(lastIndex);
    }

    public  Iterator createIterator() {
        return new ListIterator(this);
    }

    private static class ListIterator implements Iterator {
        private final BrowseHistory history;
        private int index;

        public ListIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.urls.size());
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
