package j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class c0 implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f42271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f42273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f42274d;

    public c0(long[] jArr, int i9, int i10, int i11) {
        this.f42271a = jArr;
        this.f42272b = i9;
        this.f42273c = i10;
        this.f42274d = i11 | 16448;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f42274d;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f42273c - this.f42272b;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        A.c(this, consumer);
    }

    @Override // j$.util.N
    public final void forEachRemaining(LongConsumer longConsumer) {
        int i9;
        longConsumer.getClass();
        long[] jArr = this.f42271a;
        int length = jArr.length;
        int i10 = this.f42273c;
        if (length < i10 || (i9 = this.f42272b) < 0) {
            return;
        }
        this.f42272b = i10;
        if (i9 < i10) {
            do {
                longConsumer.accept(jArr[i9]);
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
        return A.i(this, consumer);
    }

    @Override // j$.util.N
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        int i9 = this.f42272b;
        if (i9 < 0 || i9 >= this.f42273c) {
            return false;
        }
        this.f42272b = i9 + 1;
        longConsumer.accept(this.f42271a[i9]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final K trySplit() {
        int i9 = this.f42272b;
        int i10 = (this.f42273c + i9) >>> 1;
        if (i9 >= i10) {
            return null;
        }
        this.f42272b = i10;
        return new c0(this.f42271a, i9, i10, this.f42274d);
    }
}
