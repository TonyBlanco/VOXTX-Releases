package j$.util.stream;

import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
abstract class V0 extends M0 implements J0 {
    @Override // j$.util.stream.J0
    public final void d(Object obj, int i9) {
        K0 k02 = this.f42475a;
        ((J0) k02).d(obj, i9);
        ((J0) this.f42476b).d(obj, i9 + ((int) ((J0) k02).count()));
    }

    @Override // j$.util.stream.J0
    public final Object e() {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object objC = c((int) jCount);
        d(objC, 0);
        return objC;
    }

    @Override // j$.util.stream.J0
    public final void f(Object obj) {
        ((J0) this.f42475a).f(obj);
        ((J0) this.f42476b).f(obj);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ Object[] p(IntFunction intFunction) {
        return AbstractC2055y0.m(this, intFunction);
    }

    public final String toString() {
        long jCount = count();
        String name = getClass().getName();
        return jCount < 32 ? String.format("%s[%s.%s]", name, this.f42475a, this.f42476b) : String.format("%s[size=%d]", name, Long.valueOf(count()));
    }
}
