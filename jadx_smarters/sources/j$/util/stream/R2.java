package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
final class R2 implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f42523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f42524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f42525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f42526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object[] f42527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ C1939a3 f42528f;

    R2(C1939a3 c1939a3, int i9, int i10, int i11, int i12) {
        this.f42528f = c1939a3;
        this.f42523a = i9;
        this.f42524b = i10;
        this.f42525c = i11;
        this.f42526d = i12;
        Object[][] objArr = c1939a3.f42583f;
        this.f42527e = objArr == null ? c1939a3.f42582e : objArr[i9];
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i9 = this.f42523a;
        int i10 = this.f42526d;
        int i11 = this.f42524b;
        if (i9 == i11) {
            return ((long) i10) - ((long) this.f42525c);
        }
        long[] jArr = this.f42528f.f42606d;
        return ((jArr[i11] + ((long) i10)) - jArr[i9]) - ((long) this.f42525c);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        C1939a3 c1939a3;
        Objects.requireNonNull(consumer);
        int i9 = this.f42523a;
        int i10 = this.f42526d;
        int i11 = this.f42524b;
        if (i9 < i11 || (i9 == i11 && this.f42525c < i10)) {
            int i12 = this.f42525c;
            while (true) {
                c1939a3 = this.f42528f;
                if (i9 >= i11) {
                    break;
                }
                Object[] objArr = c1939a3.f42583f[i9];
                while (i12 < objArr.length) {
                    consumer.accept(objArr[i12]);
                    i12++;
                }
                i9++;
                i12 = 0;
            }
            Object[] objArr2 = this.f42523a == i11 ? this.f42527e : c1939a3.f42583f[i11];
            while (i12 < i10) {
                consumer.accept(objArr2[i12]);
                i12++;
            }
            this.f42523a = i11;
            this.f42525c = i10;
        }
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

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int i9 = this.f42523a;
        int i10 = this.f42524b;
        if (i9 >= i10 && (i9 != i10 || this.f42525c >= this.f42526d)) {
            return false;
        }
        Object[] objArr = this.f42527e;
        int i11 = this.f42525c;
        this.f42525c = i11 + 1;
        consumer.accept(objArr[i11]);
        if (this.f42525c == this.f42527e.length) {
            this.f42525c = 0;
            int i12 = this.f42523a + 1;
            this.f42523a = i12;
            Object[][] objArr2 = this.f42528f.f42583f;
            if (objArr2 != null && i12 <= i10) {
                this.f42527e = objArr2[i12];
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i9 = this.f42523a;
        int i10 = this.f42524b;
        if (i9 < i10) {
            int i11 = i10 - 1;
            int i12 = this.f42525c;
            C1939a3 c1939a3 = this.f42528f;
            R2 r22 = new R2(c1939a3, i9, i11, i12, c1939a3.f42583f[i11].length);
            this.f42523a = i10;
            this.f42525c = 0;
            this.f42527e = c1939a3.f42583f[i10];
            return r22;
        }
        if (i9 != i10) {
            return null;
        }
        int i13 = this.f42525c;
        int i14 = (this.f42526d - i13) / 2;
        if (i14 == 0) {
            return null;
        }
        Spliterator spliteratorM = Spliterators.m(this.f42527e, i13, i13 + i14);
        this.f42525c += i14;
        return spliteratorM;
    }
}
