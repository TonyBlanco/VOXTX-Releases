package j$.util.stream;

import j$.util.C1928l;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class Q1 implements U1, InterfaceC2008o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f42511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ IntBinaryOperator f42513c;

    Q1(IntBinaryOperator intBinaryOperator) {
        this.f42513c = intBinaryOperator;
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ void accept(double d9) {
        AbstractC2055y0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final void accept(int i9) {
        if (this.f42511a) {
            this.f42511a = false;
        } else {
            i9 = this.f42513c.applyAsInt(this.f42512b, i9);
        }
        this.f42512b = i9;
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
        return this.f42511a ? C1928l.a() : C1928l.d(this.f42512b);
    }

    @Override // j$.util.stream.U1
    public final void h(U1 u12) {
        Q1 q12 = (Q1) u12;
        if (q12.f42511a) {
            return;
        }
        accept(q12.f42512b);
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ void l() {
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        this.f42511a = true;
        this.f42512b = 0;
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
