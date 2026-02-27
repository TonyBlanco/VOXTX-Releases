package org.simpleframework.xml.stream;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
class Stack<T> extends ArrayList<T> {
    public Stack(int i9) {
        super(i9);
    }

    public T bottom() {
        if (size() <= 0) {
            return null;
        }
        return get(0);
    }

    public T pop() {
        int size = size();
        if (size <= 0) {
            return null;
        }
        return remove(size - 1);
    }

    public T push(T t9) {
        add(t9);
        return t9;
    }

    public T top() {
        int size = size();
        if (size <= 0) {
            return null;
        }
        return get(size - 1);
    }
}
