package j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class Y1 extends AbstractC1938a2 implements InterfaceC2013p2 {
    @Override // j$.util.stream.AbstractC1938a2, j$.util.stream.InterfaceC2018q2, j$.util.stream.InterfaceC2013p2, java.util.function.LongConsumer
    public final void accept(long j9) {
        this.f42581b++;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void q(Object obj) {
        k((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.g(this, longConsumer);
    }

    @Override // j$.util.stream.V1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f42581b);
    }

    @Override // j$.util.stream.U1
    public final void h(U1 u12) {
        this.f42581b += ((AbstractC1938a2) u12).f42581b;
    }

    @Override // j$.util.stream.InterfaceC2013p2
    public final /* synthetic */ void k(Long l9) {
        AbstractC2055y0.i(this, l9);
    }
}
