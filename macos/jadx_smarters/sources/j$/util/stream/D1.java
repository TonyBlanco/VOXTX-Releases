package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class D1 implements U1, InterfaceC2003n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f42408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ double f42409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ DoubleBinaryOperator f42410c;

    D1(double d9, DoubleBinaryOperator doubleBinaryOperator) {
        this.f42409b = d9;
        this.f42410c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final void accept(double d9) {
        this.f42408a = this.f42410c.applyAsDouble(this.f42408a, d9);
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

    @Override // java.util.function.Supplier
    public final Object get() {
        return Double.valueOf(this.f42408a);
    }

    @Override // j$.util.stream.U1
    public final void h(U1 u12) {
        accept(((D1) u12).f42408a);
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ void l() {
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        this.f42408a = this.f42409b;
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
