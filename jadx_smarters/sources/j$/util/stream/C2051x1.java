package j$.util.stream;

import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2051x1 extends C1939a3 implements K0, C0 {
    @Override // j$.util.stream.C0
    public final K0 a() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ void accept(double d9) {
        AbstractC2055y0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ void accept(int i9) {
        AbstractC2055y0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC2018q2, j$.util.stream.InterfaceC2013p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j9) {
        AbstractC2055y0.l();
        throw null;
    }

    @Override // j$.util.stream.K0
    public final K0 b(int i9) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ K0 i(long j9, long j10, IntFunction intFunction) {
        return AbstractC2055y0.w(this, j9, j10, intFunction);
    }

    @Override // j$.util.stream.K0
    public final void j(Object[] objArr, int i9) {
        long j9 = i9;
        long jCount = count() + j9;
        if (jCount > objArr.length || jCount < j9) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f42605c == 0) {
            System.arraycopy(this.f42582e, 0, objArr, i9, this.f42604b);
            return;
        }
        for (int i10 = 0; i10 < this.f42605c; i10++) {
            Object[] objArr2 = this.f42583f[i10];
            System.arraycopy(objArr2, 0, objArr, i9, objArr2.length);
            i9 += this.f42583f[i10].length;
        }
        int i11 = this.f42604b;
        if (i11 > 0) {
            System.arraycopy(this.f42582e, 0, objArr, i9, i11);
        }
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final void l() {
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        clear();
        s(j9);
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ boolean o() {
        return false;
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
    public final /* synthetic */ int r() {
        return 0;
    }
}
