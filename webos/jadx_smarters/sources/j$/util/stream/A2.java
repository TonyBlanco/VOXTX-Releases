package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
final class A2 extends AbstractC1945c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AbstractC1940b f42389j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final IntFunction f42390k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f42391l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f42392m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f42393n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile boolean f42394o;

    A2(A2 a22, Spliterator spliterator) {
        super(a22, spliterator);
        this.f42389j = a22.f42389j;
        this.f42390k = a22.f42390k;
        this.f42391l = a22.f42391l;
        this.f42392m = a22.f42392m;
    }

    A2(AbstractC1940b abstractC1940b, AbstractC1940b abstractC1940b2, Spliterator spliterator, IntFunction intFunction, long j9, long j10) {
        super(abstractC1940b2, spliterator);
        this.f42389j = abstractC1940b;
        this.f42390k = intFunction;
        this.f42391l = j9;
        this.f42392m = j10;
    }

    private long k(long j9) {
        if (this.f42394o) {
            return this.f42393n;
        }
        A2 a22 = (A2) this.f42617d;
        A2 a23 = (A2) this.f42618e;
        if (a22 == null || a23 == null) {
            return this.f42393n;
        }
        long jK = a22.k(j9);
        return jK >= j9 ? jK : jK + a23.k(j9);
    }

    @Override // j$.util.stream.AbstractC1955e
    protected final Object a() {
        if (d()) {
            C0 c0N = this.f42389j.N(EnumC1959e3.SIZED.t(this.f42389j.f42586c) ? this.f42389j.G(this.f42615b) : -1L, this.f42390k);
            InterfaceC2018q2 interfaceC2018q2R = this.f42389j.R(this.f42614a.K(), c0N);
            AbstractC1940b abstractC1940b = this.f42614a;
            abstractC1940b.B(this.f42615b, abstractC1940b.W(interfaceC2018q2R));
            return c0N.a();
        }
        C0 c0N2 = this.f42389j.N(-1L, this.f42390k);
        if (this.f42391l == 0) {
            InterfaceC2018q2 interfaceC2018q2R2 = this.f42389j.R(this.f42614a.K(), c0N2);
            AbstractC1940b abstractC1940b2 = this.f42614a;
            abstractC1940b2.B(this.f42615b, abstractC1940b2.W(interfaceC2018q2R2));
        } else {
            this.f42614a.V(this.f42615b, c0N2);
        }
        K0 k0A = c0N2.a();
        this.f42393n = k0A.count();
        this.f42394o = true;
        this.f42615b = null;
        return k0A;
    }

    @Override // j$.util.stream.AbstractC1955e
    protected final AbstractC1955e e(Spliterator spliterator) {
        return new A2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC1945c
    protected final void h() {
        this.f42600i = true;
        if (this.f42394o) {
            f(AbstractC2055y0.L(this.f42389j.I()));
        }
    }

    @Override // j$.util.stream.AbstractC1945c
    protected final Object j() {
        return AbstractC2055y0.L(this.f42389j.I());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    @Override // j$.util.stream.AbstractC1955e, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCompletion(java.util.concurrent.CountedCompleter r14) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.A2.onCompletion(java.util.concurrent.CountedCompleter):void");
    }
}
