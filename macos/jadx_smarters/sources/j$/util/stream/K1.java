package j$.util.stream;

import j$.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
final class K1 implements U1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f42461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f42462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinaryOperator f42463c;

    K1(BinaryOperator binaryOperator) {
        this.f42463c = binaryOperator;
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
        if (this.f42461a) {
            this.f42461a = false;
        } else {
            obj = this.f42463c.apply(this.f42462b, obj);
        }
        this.f42462b = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f42461a ? Optional.a() : Optional.d(this.f42462b);
    }

    @Override // j$.util.stream.U1
    public final void h(U1 u12) {
        K1 k12 = (K1) u12;
        if (k12.f42461a) {
            return;
        }
        q(k12.f42462b);
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ void l() {
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        this.f42461a = true;
        this.f42462b = null;
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ boolean o() {
        return false;
    }
}
