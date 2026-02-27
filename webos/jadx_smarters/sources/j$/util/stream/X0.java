package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
class X0 implements E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final double[] f42562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f42563b;

    X0(long j9) {
        if (j9 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f42562a = new double[(int) j9];
        this.f42563b = 0;
    }

    X0(double[] dArr) {
        this.f42562a = dArr;
        this.f42563b = dArr.length;
    }

    @Override // j$.util.stream.J0, j$.util.stream.K0
    public final J0 b(int i9) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.K0
    public final /* bridge */ /* synthetic */ K0 b(int i9) {
        b(i9);
        throw null;
    }

    @Override // j$.util.stream.K0
    public final long count() {
        return this.f42563b;
    }

    @Override // j$.util.stream.J0
    public final void d(Object obj, int i9) {
        int i10 = this.f42563b;
        System.arraycopy(this.f42562a, 0, (double[]) obj, i9, i10);
    }

    @Override // j$.util.stream.J0
    public final Object e() {
        double[] dArr = this.f42562a;
        int length = dArr.length;
        int i9 = this.f42563b;
        return length == i9 ? dArr : Arrays.copyOf(dArr, i9);
    }

    @Override // j$.util.stream.J0
    public final void f(Object obj) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i9 = 0; i9 < this.f42563b; i9++) {
            doubleConsumer.accept(this.f42562a[i9]);
        }
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC2055y0.q(this, consumer);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ Object[] p(IntFunction intFunction) {
        return AbstractC2055y0.m(this, intFunction);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ int r() {
        return 0;
    }

    @Override // j$.util.stream.K0
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void j(Double[] dArr, int i9) {
        AbstractC2055y0.n(this, dArr, i9);
    }

    @Override // j$.util.stream.J0, j$.util.stream.K0
    public final j$.util.N spliterator() {
        return Spliterators.j(this.f42562a, 0, this.f42563b);
    }

    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        return Spliterators.j(this.f42562a, 0, this.f42563b);
    }

    @Override // j$.util.stream.K0
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ E0 i(long j9, long j10, IntFunction intFunction) {
        return AbstractC2055y0.t(this, j9, j10);
    }

    public String toString() {
        double[] dArr = this.f42562a;
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(dArr.length - this.f42563b), Arrays.toString(dArr));
    }
}
