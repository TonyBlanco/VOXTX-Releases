package j$.util.stream;

import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1957e1 implements K0 {
    @Override // j$.util.stream.K0
    public K0 b(int i9) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.K0
    public final long count() {
        return 0L;
    }

    public final void d(Object obj, int i9) {
    }

    public final void f(Object obj) {
    }

    @Override // j$.util.stream.K0
    public /* synthetic */ K0 i(long j9, long j10, IntFunction intFunction) {
        return AbstractC2055y0.w(this, j9, j10, intFunction);
    }

    @Override // j$.util.stream.K0
    public final Object[] p(IntFunction intFunction) {
        return (Object[]) intFunction.apply(0);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ int r() {
        return 0;
    }
}
