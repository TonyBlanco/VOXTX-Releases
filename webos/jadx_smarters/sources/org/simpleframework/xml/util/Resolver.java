package org.simpleframework.xml.util;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.simpleframework.xml.util.Match;

/* JADX INFO: loaded from: classes4.dex */
public class Resolver<M extends Match> extends AbstractSet<M> {
    protected final Resolver<M>.Stack stack = new Stack();
    protected final Resolver<M>.Cache cache = new Cache();

    public class Cache extends LimitedCache<List<M>> {
        public Cache() {
            super(1024);
        }
    }

    public class Stack extends LinkedList<M> {

        public class Sequence implements Iterator<M> {
            private int cursor;

            public Sequence() {
                this.cursor = Stack.this.size();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.cursor > 0;
            }

            @Override // java.util.Iterator
            public M next() {
                if (!hasNext()) {
                    return null;
                }
                Stack stack = Stack.this;
                int i9 = this.cursor - 1;
                this.cursor = i9;
                return (M) stack.get(i9);
            }

            @Override // java.util.Iterator
            public void remove() {
                Stack.this.purge(this.cursor);
            }
        }

        private Stack() {
        }

        public void purge(int i9) {
            Resolver.this.cache.clear();
            remove(i9);
        }

        @Override // java.util.LinkedList, java.util.Deque
        public void push(M m9) {
            Resolver.this.cache.clear();
            addFirst(m9);
        }

        public Iterator<M> sequence() {
            return new Sequence();
        }
    }

    private boolean match(char[] cArr, int i9, char[] cArr2, int i10) {
        while (i10 < cArr2.length && i9 < cArr.length) {
            if (cArr2[i10] == '*') {
                do {
                    char c9 = cArr2[i10];
                    if (c9 == '*') {
                        i10++;
                    } else {
                        if (c9 == '?' && (i10 = i10 + 1) >= cArr2.length) {
                            return true;
                        }
                        while (i9 < cArr.length) {
                            char c10 = cArr[i9];
                            char c11 = cArr2[i10];
                            if (c10 == c11 || c11 == '?') {
                                if (cArr2[i10 - 1] == '?') {
                                    break;
                                }
                                if (match(cArr, i9, cArr2, i10)) {
                                    return true;
                                }
                            }
                            i9++;
                        }
                        if (cArr.length == i9) {
                            return false;
                        }
                    }
                } while (i10 < cArr2.length);
                return true;
            }
            int i11 = i9 + 1;
            int i12 = i10 + 1;
            if (cArr[i9] != cArr2[i10] && cArr2[i10] != '?') {
                return false;
            }
            i9 = i11;
            i10 = i12;
        }
        if (cArr2.length == i10) {
            return cArr.length == i9;
        }
        while (cArr2[i10] == '*') {
            i10++;
            if (i10 >= cArr2.length) {
                return true;
            }
        }
        return false;
    }

    private boolean match(char[] cArr, char[] cArr2) {
        return match(cArr, 0, cArr2, 0);
    }

    private List<M> resolveAll(String str, char[] cArr) {
        ArrayList arrayList = new ArrayList();
        for (M m9 : this.stack) {
            if (match(cArr, m9.getPattern().toCharArray())) {
                this.cache.put(str, arrayList);
                arrayList.add(m9);
            }
        }
        return arrayList;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(M m9) {
        this.stack.push((Match) m9);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.cache.clear();
        this.stack.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<M> iterator() {
        return this.stack.sequence();
    }

    public boolean remove(M m9) {
        this.cache.clear();
        return this.stack.remove(m9);
    }

    public M resolve(String str) {
        List<M> listResolveAll = (List) this.cache.get(str);
        if (listResolveAll == null) {
            listResolveAll = resolveAll(str);
        }
        if (listResolveAll.isEmpty()) {
            return null;
        }
        return listResolveAll.get(0);
    }

    public List<M> resolveAll(String str) {
        List<M> list = (List) this.cache.get(str);
        if (list != null) {
            return list;
        }
        char[] charArray = str.toCharArray();
        if (charArray == null) {
            return null;
        }
        return resolveAll(str, charArray);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.stack.size();
    }
}
