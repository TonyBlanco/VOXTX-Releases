package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
class N0 implements K0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object[] f42483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f42484b;

    N0(long j9, IntFunction intFunction) {
        if (j9 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f42483a = (Object[]) intFunction.apply((int) j9);
        this.f42484b = 0;
    }

    N0(Object[] objArr) {
        this.f42483a = objArr;
        this.f42484b = objArr.length;
    }

    @Override // j$.util.stream.K0
    public final K0 b(int i9) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.K0
    public final long count() {
        return this.f42484b;
    }

    @Override // j$.util.stream.K0
    public final void forEach(Consumer consumer) {
        for (int i9 = 0; i9 < this.f42484b; i9++) {
            consumer.q(this.f42483a[i9]);
        }
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ K0 i(long j9, long j10, IntFunction intFunction) {
        return AbstractC2055y0.w(this, j9, j10, intFunction);
    }

    @Override // j$.util.stream.K0
    public final void j(Object[] objArr, int i9) {
        System.arraycopy(this.f42483a, 0, objArr, i9, this.f42484b);
    }

    @Override // j$.util.stream.K0
    public final Object[] p(IntFunction intFunction) {
        Object[] objArr = this.f42483a;
        if (objArr.length == this.f42484b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ int r() {
        return 0;
    }

    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        return Spliterators.m(this.f42483a, 0, this.f42484b);
    }

    public String toString() {
        Object[] objArr = this.f42483a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.f42484b), Arrays.toString(objArr));
    }
}
