package j$.util.stream;

import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class X1 extends AbstractC1938a2 implements InterfaceC2008o2 {
    @Override // j$.util.stream.AbstractC1938a2, j$.util.stream.InterfaceC2018q2
    public final void accept(int i9) {
        this.f42581b++;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void q(Object obj) {
        n((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.f(this, intConsumer);
    }

    @Override // j$.util.stream.V1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f42581b);
    }

    @Override // j$.util.stream.U1
    public final void h(U1 u12) {
        this.f42581b += ((AbstractC1938a2) u12).f42581b;
    }

    @Override // j$.util.stream.InterfaceC2008o2
    public final /* synthetic */ void n(Integer num) {
        AbstractC2055y0.g(this, num);
    }
}
