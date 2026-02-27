package j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class Y0 extends X0 implements InterfaceC2060z0 {
    @Override // j$.util.stream.InterfaceC2060z0, j$.util.stream.C0
    public final E0 a() {
        int i9 = this.f42563b;
        double[] dArr = this.f42562a;
        if (i9 >= dArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f42563b), Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.stream.C0
    public final /* bridge */ /* synthetic */ K0 a() {
        a();
        return this;
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final void accept(double d9) {
        int i9 = this.f42563b;
        double[] dArr = this.f42562a;
        if (i9 >= dArr.length) {
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(dArr.length)));
        }
        this.f42563b = 1 + i9;
        dArr[i9] = d9;
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

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void q(Object obj) {
        q((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final void l() {
        int i9 = this.f42563b;
        double[] dArr = this.f42562a;
        if (i9 < dArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f42563b), Integer.valueOf(dArr.length)));
        }
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        double[] dArr = this.f42562a;
        if (j9 != dArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j9), Integer.valueOf(dArr.length)));
        }
        this.f42563b = 0;
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC2003n2
    public final /* synthetic */ void q(Double d9) {
        AbstractC2055y0.e(this, d9);
    }

    @Override // j$.util.stream.X0
    public final String toString() {
        double[] dArr = this.f42562a;
        return String.format("DoubleFixedNodeBuilder[%d][%s]", Integer.valueOf(dArr.length - this.f42563b), Arrays.toString(dArr));
    }
}
