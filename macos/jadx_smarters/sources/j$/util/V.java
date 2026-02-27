package j$.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class V implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double[] f42250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f42252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f42253d;

    public V(double[] dArr, int i9, int i10, int i11) {
        this.f42250a = dArr;
        this.f42251b = i9;
        this.f42252c = i10;
        this.f42253d = i11 | 16448;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f42253d;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f42252c - this.f42251b;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        A.a(this, consumer);
    }

    @Override // j$.util.N
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        int i9;
        doubleConsumer.getClass();
        double[] dArr = this.f42250a;
        int length = dArr.length;
        int i10 = this.f42252c;
        if (length < i10 || (i9 = this.f42251b) < 0) {
            return;
        }
        this.f42251b = i10;
        if (i9 < i10) {
            do {
                doubleConsumer.accept(dArr[i9]);
                i9++;
            } while (i9 < i10);
        }
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (A.e(this, 4)) {
            return null;
        }
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
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return A.g(this, consumer);
    }

    @Override // j$.util.N
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        int i9 = this.f42251b;
        if (i9 < 0 || i9 >= this.f42252c) {
            return false;
        }
        this.f42251b = i9 + 1;
        doubleConsumer.accept(this.f42250a[i9]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final E trySplit() {
        int i9 = this.f42251b;
        int i10 = (this.f42252c + i9) >>> 1;
        if (i9 >= i10) {
            return null;
        }
        this.f42251b = i10;
        return new V(this.f42250a, i9, i10, this.f42253d);
    }
}
