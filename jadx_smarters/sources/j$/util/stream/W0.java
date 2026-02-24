package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
final class W0 extends M0 {
    @Override // j$.util.stream.K0
    public final void forEach(Consumer consumer) {
        this.f42475a.forEach(consumer);
        this.f42476b.forEach(consumer);
    }

    @Override // j$.util.stream.K0
    public final K0 i(long j9, long j10, IntFunction intFunction) {
        if (j9 == 0 && j10 == count()) {
            return this;
        }
        long jCount = this.f42475a.count();
        if (j9 >= jCount) {
            return this.f42476b.i(j9 - jCount, j10 - jCount, intFunction);
        }
        if (j10 <= jCount) {
            return this.f42475a.i(j9, j10, intFunction);
        }
        return AbstractC2055y0.I(EnumC1964f3.REFERENCE, this.f42475a.i(j9, jCount, intFunction), this.f42476b.i(0L, j10 - jCount, intFunction));
    }

    @Override // j$.util.stream.K0
    public final void j(Object[] objArr, int i9) {
        Objects.requireNonNull(objArr);
        K0 k02 = this.f42475a;
        k02.j(objArr, i9);
        this.f42476b.j(objArr, i9 + ((int) k02.count()));
    }

    @Override // j$.util.stream.K0
    public final Object[] p(IntFunction intFunction) {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        j(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        return new C2002n1(this);
    }

    public final String toString() {
        return count() < 32 ? String.format("ConcNode[%s.%s]", this.f42475a, this.f42476b) : String.format("ConcNode[size=%d]", Long.valueOf(count()));
    }
}
