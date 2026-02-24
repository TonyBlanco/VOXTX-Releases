package j$.util;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class Spliterators {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Spliterator f42233a = new Z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final H f42234b = new X();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final K f42235c = new Y();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final E f42236d = new W();

    private static void a(int i9, int i10, int i11) {
        if (i10 <= i11) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException(i10);
            }
            if (i11 > i9) {
                throw new ArrayIndexOutOfBoundsException(i11);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i10 + ") > fence(" + i11 + ")");
    }

    public static E b() {
        return f42236d;
    }

    public static H c() {
        return f42234b;
    }

    public static K d() {
        return f42235c;
    }

    public static Spliterator e() {
        return f42233a;
    }

    public static InterfaceC1933q f(E e9) {
        Objects.requireNonNull(e9);
        return new T(e9);
    }

    public static InterfaceC2065u g(H h9) {
        Objects.requireNonNull(h9);
        return new Q(h9);
    }

    public static InterfaceC2069y h(K k9) {
        Objects.requireNonNull(k9);
        return new S(k9);
    }

    public static Iterator i(Spliterator spliterator) {
        Objects.requireNonNull(spliterator);
        return new P(spliterator);
    }

    public static E j(double[] dArr, int i9, int i10) {
        a(((double[]) Objects.requireNonNull(dArr)).length, i9, i10);
        return new V(dArr, i9, i10, 1040);
    }

    public static H k(int[] iArr, int i9, int i10) {
        a(((int[]) Objects.requireNonNull(iArr)).length, i9, i10);
        return new a0(iArr, i9, i10, 1040);
    }

    public static K l(long[] jArr, int i9, int i10) {
        a(((long[]) Objects.requireNonNull(jArr)).length, i9, i10);
        return new c0(jArr, i9, i10, 1040);
    }

    public static Spliterator m(Object[] objArr, int i9, int i10) {
        a(((Object[]) Objects.requireNonNull(objArr)).length, i9, i10);
        return new U(objArr, i9, i10, 1040);
    }

    public static Spliterator n(Iterator it, int i9) {
        return new b0((Iterator) Objects.requireNonNull(it), i9);
    }

    public static <T> Spliterator<T> spliterator(java.util.Collection<? extends T> collection, int i9) {
        return new b0((java.util.Collection) Objects.requireNonNull(collection), i9);
    }
}
