package l8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class C extends AbstractC2208c implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f44229a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44232e;

    public static final class a extends AbstractC2207b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f44233d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f44234e;

        public a() {
            this.f44233d = C.this.size();
            this.f44234e = C.this.f44231d;
        }

        @Override // l8.AbstractC2207b
        public void b() {
            if (this.f44233d == 0) {
                c();
                return;
            }
            d(C.this.f44229a[this.f44234e]);
            this.f44234e = (this.f44234e + 1) % C.this.f44230c;
            this.f44233d--;
        }
    }

    public C(int i9) {
        this(new Object[i9], 0);
    }

    public C(Object[] buffer, int i9) {
        kotlin.jvm.internal.l.e(buffer, "buffer");
        this.f44229a = buffer;
        if (i9 < 0) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i9).toString());
        }
        if (i9 <= buffer.length) {
            this.f44230c = buffer.length;
            this.f44232e = i9;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i9 + " cannot be larger than the buffer size: " + buffer.length).toString());
    }

    public final void d(Object obj) {
        if (f()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.f44229a[(this.f44231d + size()) % this.f44230c] = obj;
        this.f44232e = size() + 1;
    }

    public final C e(int i9) {
        Object[] array;
        int i10 = this.f44230c;
        int iE = B8.h.e(i10 + (i10 >> 1) + 1, i9);
        if (this.f44231d == 0) {
            array = Arrays.copyOf(this.f44229a, iE);
            kotlin.jvm.internal.l.d(array, "copyOf(this, newSize)");
        } else {
            array = toArray(new Object[iE]);
        }
        return new C(array, size());
    }

    public final boolean f() {
        return size() == this.f44230c;
    }

    public final void g(int i9) {
        if (i9 < 0) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i9).toString());
        }
        if (i9 > size()) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i9 + ", size = " + size()).toString());
        }
        if (i9 > 0) {
            int i10 = this.f44231d;
            int i11 = (i10 + i9) % this.f44230c;
            Object[] objArr = this.f44229a;
            if (i10 > i11) {
                AbstractC2212g.j(objArr, null, i10, this.f44230c);
                AbstractC2212g.j(this.f44229a, null, 0, i11);
            } else {
                AbstractC2212g.j(objArr, null, i10, i11);
            }
            this.f44231d = i11;
            this.f44232e = size() - i9;
        }
    }

    @Override // l8.AbstractC2208c, java.util.List
    public Object get(int i9) {
        AbstractC2208c.Companion.a(i9, size());
        return this.f44229a[(this.f44231d + i9) % this.f44230c];
    }

    @Override // l8.AbstractC2206a
    public int getSize() {
        return this.f44232e;
    }

    @Override // l8.AbstractC2208c, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new a();
    }

    @Override // l8.AbstractC2206a, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // l8.AbstractC2206a, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        kotlin.jvm.internal.l.e(array, "array");
        if (array.length < size()) {
            array = Arrays.copyOf(array, size());
            kotlin.jvm.internal.l.d(array, "copyOf(this, newSize)");
        }
        int size = size();
        int i9 = 0;
        int i10 = 0;
        for (int i11 = this.f44231d; i10 < size && i11 < this.f44230c; i11++) {
            array[i10] = this.f44229a[i11];
            i10++;
        }
        while (i10 < size) {
            array[i10] = this.f44229a[i9];
            i10++;
            i9++;
        }
        if (array.length > size()) {
            array[size()] = null;
        }
        kotlin.jvm.internal.l.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.RingBuffer.toArray>");
        return array;
    }
}
