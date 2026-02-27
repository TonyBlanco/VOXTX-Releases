package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: kotlin.jvm.internal.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2154a implements Iterator, x8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f43680a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43681c;

    public C2154a(Object[] array) {
        l.e(array, "array");
        this.f43680a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f43681c < this.f43680a.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f43680a;
            int i9 = this.f43681c;
            this.f43681c = i9 + 1;
            return objArr[i9];
        } catch (ArrayIndexOutOfBoundsException e9) {
            this.f43681c--;
            throw new NoSuchElementException(e9.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
