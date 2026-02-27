package j$.util.stream;

import j$.util.C1927k;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class F1 implements U1, InterfaceC2003n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f42421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f42422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ DoubleBinaryOperator f42423c;

    F1(DoubleBinaryOperator doubleBinaryOperator) {
        this.f42423c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final void accept(double d9) {
        if (this.f42421a) {
            this.f42421a = false;
        } else {
            d9 = this.f42423c.applyAsDouble(this.f42422b, d9);
        }
        this.f42422b = d9;
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
        return this.f42421a ? C1927k.a() : C1927k.d(this.f42422b);
    }

    @Override // j$.util.stream.U1
    public final void h(U1 u12) {
        F1 f12 = (F1) u12;
        if (f12.f42421a) {
            return;
        }
        accept(f12.f42422b);
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ void l() {
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        this.f42421a = true;
        this.f42422b = 0.0d;
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
