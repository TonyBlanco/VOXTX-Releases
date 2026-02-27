package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C2012p1 implements I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final long[] f42731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f42732b;

    C2012p1(long j9) {
        if (j9 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f42731a = new long[(int) j9];
        this.f42732b = 0;
    }

    C2012p1(long[] jArr) {
        this.f42731a = jArr;
        this.f42732b = jArr.length;
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
        return this.f42732b;
    }

    @Override // j$.util.stream.J0
    public final void d(Object obj, int i9) {
        int i10 = this.f42732b;
        System.arraycopy(this.f42731a, 0, (long[]) obj, i9, i10);
    }

    @Override // j$.util.stream.J0
    public final Object e() {
        long[] jArr = this.f42731a;
        int length = jArr.length;
        int i9 = this.f42732b;
        return length == i9 ? jArr : Arrays.copyOf(jArr, i9);
    }

    @Override // j$.util.stream.J0
    public final void f(Object obj) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i9 = 0; i9 < this.f42732b; i9++) {
            longConsumer.accept(this.f42731a[i9]);
        }
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC2055y0.s(this, consumer);
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
    public final /* synthetic */ void j(Long[] lArr, int i9) {
        AbstractC2055y0.p(this, lArr, i9);
    }

    @Override // j$.util.stream.J0, j$.util.stream.K0
    public final j$.util.N spliterator() {
        return Spliterators.l(this.f42731a, 0, this.f42732b);
    }

    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        return Spliterators.l(this.f42731a, 0, this.f42732b);
    }

    @Override // j$.util.stream.K0
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ I0 i(long j9, long j10, IntFunction intFunction) {
        return AbstractC2055y0.v(this, j9, j10);
    }

    public String toString() {
        long[] jArr = this.f42731a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.f42732b), Arrays.toString(jArr));
    }
}
