package com.lambdaschool.unittestcodechallenges;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    List<T> data;

    public Stack() {
        data = new ArrayList<>();
    }

    private int lastIndex() {
        return data.size() - 1;
    }

    public T pop() {
        if(data.size() > 0) {
            return data.remove(lastIndex());
        }
        return null;
    }

    public void push(T item) {
        data.add(item);
    }

    public int size() {
        return data.size();
    }
}
