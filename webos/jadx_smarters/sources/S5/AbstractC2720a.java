package s5;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: s5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2720a extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50042a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f50043c;

    public AbstractC2720a(int i9, int i10) {
        r5.m.m(i10, i9);
        this.f50042a = i9;
        this.f50043c = i10;
    }

    public abstract Object a(int i9);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f50043c < this.f50042a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f50043c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i9 = this.f50043c;
        this.f50043c = i9 + 1;
        return a(i9);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f50043c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i9 = this.f50043c - 1;
        this.f50043c = i9;
        return a(i9);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f50043c - 1;
    }
}
