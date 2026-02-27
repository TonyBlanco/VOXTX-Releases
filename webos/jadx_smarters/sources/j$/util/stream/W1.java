package j$.util.stream;

import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class W1 extends AbstractC1938a2 implements InterfaceC2003n2 {
    @Override // j$.util.stream.AbstractC1938a2, j$.util.stream.InterfaceC2018q2
    public final void accept(double d9) {
        this.f42581b++;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void q(Object obj) {
        q((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    @Override // j$.util.stream.V1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f42581b);
    }

    @Override // j$.util.stream.U1
    public final void h(U1 u12) {
        this.f42581b += ((AbstractC1938a2) u12).f42581b;
    }

    @Override // j$.util.stream.InterfaceC2003n2
    public final /* synthetic */ void q(Double d9) {
        AbstractC2055y0.e(this, d9);
    }
}
