package j$.util.stream;

import j$.util.Objects;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
abstract class Y2 implements j$.util.N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f42566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f42567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f42568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f42569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f42570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ Z2 f42571f;

    Y2(Z2 z22, int i9, int i10, int i11, int i12) {
        this.f42571f = z22;
        this.f42566a = i9;
        this.f42567b = i10;
        this.f42568c = i11;
        this.f42569d = i12;
        Object[] objArr = z22.f42576f;
        this.f42570e = objArr == null ? z22.f42575e : objArr[i9];
    }

    abstract void a(int i9, Object obj, Object obj2);

    abstract j$.util.N b(Object obj, int i9, int i10);

    abstract j$.util.N c(int i9, int i10, int i11, int i12);

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i9 = this.f42566a;
        int i10 = this.f42569d;
        int i11 = this.f42567b;
        if (i9 == i11) {
            return ((long) i10) - ((long) this.f42568c);
        }
        long[] jArr = this.f42571f.f42606d;
        return ((jArr[i11] + ((long) i10)) - jArr[i9]) - ((long) this.f42568c);
    }

    @Override // j$.util.N
    public final void forEachRemaining(Object obj) {
        Z2 z22;
        Objects.requireNonNull(obj);
        int i9 = this.f42566a;
        int i10 = this.f42569d;
        int i11 = this.f42567b;
        if (i9 < i11 || (i9 == i11 && this.f42568c < i10)) {
            int i12 = this.f42568c;
            while (true) {
                z22 = this.f42571f;
                if (i9 >= i11) {
                    break;
                }
                Object obj2 = z22.f42576f[i9];
                z22.s(obj2, i12, z22.t(obj2), obj);
                i9++;
                i12 = 0;
            }
            z22.s(this.f42566a == i11 ? this.f42570e : z22.f42576f[i11], i12, i10, obj);
            this.f42566a = i11;
            this.f42568c = i10;
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.A.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i9) {
        return j$.util.A.e(this, i9);
    }

    @Override // j$.util.N
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        int i9 = this.f42566a;
        int i10 = this.f42567b;
        if (i9 >= i10 && (i9 != i10 || this.f42568c >= this.f42569d)) {
            return false;
        }
        Object obj2 = this.f42570e;
        int i11 = this.f42568c;
        this.f42568c = i11 + 1;
        a(i11, obj2, obj);
        int i12 = this.f42568c;
        Object obj3 = this.f42570e;
        Z2 z22 = this.f42571f;
        if (i12 == z22.t(obj3)) {
            this.f42568c = 0;
            int i13 = this.f42566a + 1;
            this.f42566a = i13;
            Object[] objArr = z22.f42576f;
            if (objArr != null && i13 <= i10) {
                this.f42570e = objArr[i13];
            }
        }
        return true;
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    @Override // j$.util.N, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.E trySplit() {
        return (j$.util.E) trySplit();
    }

    @Override // j$.util.N, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.H trySplit() {
        return (j$.util.H) trySplit();
    }

    @Override // j$.util.N, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.K trySplit() {
        return (j$.util.K) trySplit();
    }

    @Override // j$.util.Spliterator
    public final j$.util.N trySplit() {
        int i9 = this.f42566a;
        int i10 = this.f42567b;
        if (i9 < i10) {
            int i11 = i10 - 1;
            int i12 = this.f42568c;
            Z2 z22 = this.f42571f;
            j$.util.N nC = c(i9, i11, i12, z22.t(z22.f42576f[i11]));
            this.f42566a = i10;
            this.f42568c = 0;
            this.f42570e = z22.f42576f[i10];
            return nC;
        }
        if (i9 != i10) {
            return null;
        }
        int i13 = this.f42568c;
        int i14 = (this.f42569d - i13) / 2;
        if (i14 == 0) {
            return null;
        }
        j$.util.N nB = b(this.f42570e, i13, i14);
        this.f42568c += i14;
        return nB;
    }
}
