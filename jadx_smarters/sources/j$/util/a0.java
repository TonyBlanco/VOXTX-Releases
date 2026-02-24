package j$.util;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class a0 implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f42257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f42259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f42260d;

    public a0(int[] iArr, int i9, int i10, int i11) {
        this.f42257a = iArr;
        this.f42258b = i9;
        this.f42259c = i10;
        this.f42260d = i11 | 16448;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f42260d;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f42259c - this.f42258b;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        A.b(this, consumer);
    }

    @Override // j$.util.N
    public final void forEachRemaining(IntConsumer intConsumer) {
        int i9;
        intConsumer.getClass();
        int[] iArr = this.f42257a;
        int length = iArr.length;
        int i10 = this.f42259c;
        if (length < i10 || (i9 = this.f42258b) < 0) {
            return;
        }
        this.f42258b = i10;
        if (i9 < i10) {
            do {
                intConsumer.accept(iArr[i9]);
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
        return A.h(this, consumer);
    }

    @Override // j$.util.N
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        int i9 = this.f42258b;
        if (i9 < 0 || i9 >= this.f42259c) {
            return false;
        }
        this.f42258b = i9 + 1;
        intConsumer.accept(this.f42257a[i9]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final H trySplit() {
        int i9 = this.f42258b;
        int i10 = (this.f42259c + i9) >>> 1;
        if (i9 >= i10) {
            return null;
        }
        this.f42258b = i10;
        return new a0(this.f42257a, i9, i10, this.f42260d);
    }
}
