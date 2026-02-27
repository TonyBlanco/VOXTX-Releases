package j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
final class H1 extends V1 implements U1, InterfaceC2003n2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Supplier f42440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ObjDoubleConsumer f42441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ BinaryOperator f42442d;

    H1(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BinaryOperator binaryOperator) {
        this.f42440b = supplier;
        this.f42441c = objDoubleConsumer;
        this.f42442d = binaryOperator;
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final void accept(double d9) {
        this.f42441c.accept(this.f42554a, d9);
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

    @Override // j$.util.stream.U1
    public final void h(U1 u12) {
        this.f42554a = this.f42442d.apply(this.f42554a, ((H1) u12).f42554a);
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ void l() {
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        this.f42554a = this.f42440b.get();
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC2003n2
    public final /* synthetic */ void q(Double d9) {
        AbstractC2055y0.e(this, d9);
    }
}
