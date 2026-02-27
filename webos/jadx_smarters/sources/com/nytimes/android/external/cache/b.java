package com.nytimes.android.external.cache;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f37956a;

    public b(Object obj) {
        this.f37956a = obj;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f37956a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        try {
            Object obj = this.f37956a;
            this.f37956a = a(obj);
            return obj;
        } catch (Throwable th) {
            this.f37956a = a(this.f37956a);
            throw th;
        }
    }
}
