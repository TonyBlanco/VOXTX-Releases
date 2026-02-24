package j$.util.stream;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
final class J1 extends V1 implements U1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f42454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ BiFunction f42455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ BinaryOperator f42456d;

    J1(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        this.f42454b = obj;
        this.f42455c = biFunction;
        this.f42456d = binaryOperator;
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

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void q(Object obj) {
        this.f42554a = this.f42455c.apply(this.f42554a, obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // j$.util.stream.U1
    public final void h(U1 u12) {
        this.f42554a = this.f42456d.apply(this.f42554a, ((J1) u12).f42554a);
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ void l() {
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        this.f42554a = this.f42454b;
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ boolean o() {
        return false;
    }
}
