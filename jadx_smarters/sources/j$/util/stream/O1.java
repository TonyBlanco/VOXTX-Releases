package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class O1 implements U1, InterfaceC2008o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f42493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f42494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ IntBinaryOperator f42495c;

    O1(int i9, IntBinaryOperator intBinaryOperator) {
        this.f42494b = i9;
        this.f42495c = intBinaryOperator;
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ void accept(double d9) {
        AbstractC2055y0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final void accept(int i9) {
        this.f42493a = this.f42495c.applyAsInt(this.f42493a, i9);
    }

    @Override // j$.util.stream.InterfaceC2018q2, j$.util.stream.InterfaceC2013p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j9) {
        AbstractC2055y0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void q(Object obj) {
        n((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.f(this, intConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Integer.valueOf(this.f42493a);
    }

    @Override // j$.util.stream.U1
    public final void h(U1 u12) {
        accept(((O1) u12).f42493a);
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ void l() {
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        this.f42493a = this.f42494b;
    }

    @Override // j$.util.stream.InterfaceC2008o2
    public final /* synthetic */ void n(Integer num) {
        AbstractC2055y0.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ boolean o() {
        return false;
    }
}
