package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class S1 implements U1, InterfaceC2013p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f42532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f42533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ LongBinaryOperator f42534c;

    S1(long j9, LongBinaryOperator longBinaryOperator) {
        this.f42533b = j9;
        this.f42534c = longBinaryOperator;
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
    public final void accept(long j9) {
        this.f42532a = this.f42534c.applyAsLong(this.f42532a, j9);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void q(Object obj) {
        k((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.g(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f42532a);
    }

    @Override // j$.util.stream.U1
    public final void h(U1 u12) {
        accept(((S1) u12).f42532a);
    }

    @Override // j$.util.stream.InterfaceC2013p2
    public final /* synthetic */ void k(Long l9) {
        AbstractC2055y0.i(this, l9);
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ void l() {
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        this.f42532a = this.f42533b;
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ boolean o() {
        return false;
    }
}
