package j$.util;

import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
final class U implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f42246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f42248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f42249d;

    public U(Object[] objArr, int i9, int i10, int i11) {
        this.f42246a = objArr;
        this.f42247b = i9;
        this.f42248c = i10;
        this.f42249d = i11 | 16448;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f42249d;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f42248c - this.f42247b;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        int i9;
        consumer.getClass();
        Object[] objArr = this.f42246a;
        int length = objArr.length;
        int i10 = this.f42248c;
        if (length < i10 || (i9 = this.f42247b) < 0) {
            return;
        }
        this.f42247b = i10;
        if (i9 < i10) {
            do {
                consumer.accept(objArr[i9]);
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
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int i9 = this.f42247b;
        if (i9 < 0 || i9 >= this.f42248c) {
            return false;
        }
        this.f42247b = i9 + 1;
        consumer.accept(this.f42246a[i9]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i9 = this.f42247b;
        int i10 = (this.f42248c + i9) >>> 1;
        if (i9 >= i10) {
            return null;
        }
        this.f42247b = i10;
        return new U(this.f42246a, i9, i10, this.f42249d);
    }
}
