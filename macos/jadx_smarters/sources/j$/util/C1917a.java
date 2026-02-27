package j$.util;

import java.util.ConcurrentModificationException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1917a implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f42254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42256c;

    private C1917a(C1917a c1917a, int i9, int i10) {
        this.f42254a = c1917a.f42254a;
        this.f42255b = i9;
        this.f42256c = i10;
    }

    C1917a(java.util.List list) {
        this.f42254a = list;
        this.f42255b = 0;
        this.f42256c = -1;
    }

    private int a() {
        int i9 = this.f42256c;
        if (i9 >= 0) {
            return i9;
        }
        int size = this.f42254a.size();
        this.f42256c = size;
        return size;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return a() - this.f42255b;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int iA = a();
        this.f42255b = iA;
        for (int i9 = this.f42255b; i9 < iA; i9++) {
            try {
                consumer.accept(this.f42254a.get(i9));
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return A.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i9) {
        return A.e(this, i9);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int iA = a();
        int i9 = this.f42255b;
        if (i9 >= iA) {
            return false;
        }
        this.f42255b = i9 + 1;
        try {
            consumer.accept(this.f42254a.get(i9));
            return true;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int iA = a();
        int i9 = this.f42255b;
        int i10 = (iA + i9) >>> 1;
        if (i9 >= i10) {
            return null;
        }
        this.f42255b = i10;
        return new C1917a(this, i9, i10);
    }
}
