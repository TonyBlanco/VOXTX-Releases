package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C1967g1 implements G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int[] f42657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f42658b;

    C1967g1(long j9) {
        if (j9 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f42657a = new int[(int) j9];
        this.f42658b = 0;
    }

    C1967g1(int[] iArr) {
        this.f42657a = iArr;
        this.f42658b = iArr.length;
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
        return this.f42658b;
    }

    @Override // j$.util.stream.J0
    public final void d(Object obj, int i9) {
        int i10 = this.f42658b;
        System.arraycopy(this.f42657a, 0, (int[]) obj, i9, i10);
    }

    @Override // j$.util.stream.J0
    public final Object e() {
        int[] iArr = this.f42657a;
        int length = iArr.length;
        int i9 = this.f42658b;
        return length == i9 ? iArr : Arrays.copyOf(iArr, i9);
    }

    @Override // j$.util.stream.J0
    public final void f(Object obj) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i9 = 0; i9 < this.f42658b; i9++) {
            intConsumer.accept(this.f42657a[i9]);
        }
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC2055y0.r(this, consumer);
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
    public final /* synthetic */ void j(Integer[] numArr, int i9) {
        AbstractC2055y0.o(this, numArr, i9);
    }

    @Override // j$.util.stream.J0, j$.util.stream.K0
    public final j$.util.N spliterator() {
        return Spliterators.k(this.f42657a, 0, this.f42658b);
    }

    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        return Spliterators.k(this.f42657a, 0, this.f42658b);
    }

    @Override // j$.util.stream.K0
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ G0 i(long j9, long j10, IntFunction intFunction) {
        return AbstractC2055y0.u(this, j9, j10);
    }

    public String toString() {
        int[] iArr = this.f42657a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.f42658b), Arrays.toString(iArr));
    }
}
