package org.apache.http.protocol;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class ChainBuilder<E> {
    private final LinkedList<E> list = new LinkedList<>();
    private final Map<Class<?>, E> uniqueClasses = new HashMap();

    private void ensureUnique(E e9) {
        E eRemove = this.uniqueClasses.remove(e9.getClass());
        if (eRemove != null) {
            this.list.remove(eRemove);
        }
        this.uniqueClasses.put(e9.getClass(), e9);
    }

    public ChainBuilder<E> addAllFirst(Collection<E> collection) {
        if (collection == null) {
            return this;
        }
        Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            addFirst(it.next());
        }
        return this;
    }

    public ChainBuilder<E> addAllFirst(E... eArr) {
        if (eArr == null) {
            return this;
        }
        for (E e9 : eArr) {
            addFirst(e9);
        }
        return this;
    }

    public ChainBuilder<E> addAllLast(Collection<E> collection) {
        if (collection == null) {
            return this;
        }
        Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            addLast(it.next());
        }
        return this;
    }

    public ChainBuilder<E> addAllLast(E... eArr) {
        if (eArr == null) {
            return this;
        }
        for (E e9 : eArr) {
            addLast(e9);
        }
        return this;
    }

    public ChainBuilder<E> addFirst(E e9) {
        if (e9 == null) {
            return this;
        }
        ensureUnique(e9);
        this.list.addFirst(e9);
        return this;
    }

    public ChainBuilder<E> addLast(E e9) {
        if (e9 == null) {
            return this;
        }
        ensureUnique(e9);
        this.list.addLast(e9);
        return this;
    }

    public LinkedList<E> build() {
        return new LinkedList<>(this.list);
    }
}
