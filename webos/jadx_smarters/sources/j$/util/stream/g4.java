package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
final class g4 extends AbstractC1945c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AbstractC1940b f42668j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final IntFunction f42669k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f42670l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f42671m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f42672n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile boolean f42673o;

    g4(AbstractC1940b abstractC1940b, AbstractC1940b abstractC1940b2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC1940b2, spliterator);
        this.f42668j = abstractC1940b;
        this.f42669k = intFunction;
        this.f42670l = EnumC1959e3.ORDERED.q(abstractC1940b2.K());
    }

    g4(g4 g4Var, Spliterator spliterator) {
        super(g4Var, spliterator);
        this.f42668j = g4Var.f42668j;
        this.f42669k = g4Var.f42669k;
        this.f42670l = g4Var.f42670l;
    }

    @Override // j$.util.stream.AbstractC1955e
    protected final Object a() {
        C0 c0N = this.f42614a.N(-1L, this.f42669k);
        InterfaceC2018q2 interfaceC2018q2R = this.f42668j.R(this.f42614a.K(), c0N);
        AbstractC1940b abstractC1940b = this.f42614a;
        boolean zB = abstractC1940b.B(this.f42615b, abstractC1940b.W(interfaceC2018q2R));
        this.f42672n = zB;
        if (zB) {
            i();
        }
        K0 k0A = c0N.a();
        this.f42671m = k0A.count();
        return k0A;
    }

    @Override // j$.util.stream.AbstractC1955e
    protected final AbstractC1955e e(Spliterator spliterator) {
        return new g4(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC1945c
    protected final void h() {
        this.f42600i = true;
        if (this.f42670l && this.f42673o) {
            f(AbstractC2055y0.L(this.f42668j.I()));
        }
    }

    @Override // j$.util.stream.AbstractC1945c
    protected final Object j() {
        return AbstractC2055y0.L(this.f42668j.I());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    @Override // j$.util.stream.AbstractC1955e, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCompletion(java.util.concurrent.CountedCompleter r9) {
        /*
            r8 = this;
            j$.util.stream.e r0 = r8.f42617d
            if (r0 != 0) goto L6
            goto L89
        L6:
            j$.util.stream.g4 r0 = (j$.util.stream.g4) r0
            boolean r0 = r0.f42672n
            j$.util.stream.e r1 = r8.f42618e
            j$.util.stream.g4 r1 = (j$.util.stream.g4) r1
            boolean r1 = r1.f42672n
            r0 = r0 | r1
            r8.f42672n = r0
            boolean r0 = r8.f42670l
            r1 = 0
            if (r0 == 0) goto L2a
            boolean r0 = r8.f42600i
            if (r0 == 0) goto L2a
            r8.f42671m = r1
            j$.util.stream.b r0 = r8.f42668j
            j$.util.stream.f3 r0 = r0.I()
            j$.util.stream.e1 r0 = j$.util.stream.AbstractC2055y0.L(r0)
            goto L86
        L2a:
            boolean r0 = r8.f42670l
            if (r0 == 0) goto L41
            j$.util.stream.e r0 = r8.f42617d
            j$.util.stream.g4 r0 = (j$.util.stream.g4) r0
            boolean r3 = r0.f42672n
            if (r3 == 0) goto L41
            long r1 = r0.f42671m
            r8.f42671m = r1
            java.lang.Object r0 = r0.c()
            j$.util.stream.K0 r0 = (j$.util.stream.K0) r0
            goto L86
        L41:
            j$.util.stream.e r0 = r8.f42617d
            j$.util.stream.g4 r0 = (j$.util.stream.g4) r0
            long r3 = r0.f42671m
            j$.util.stream.e r5 = r8.f42618e
            j$.util.stream.g4 r5 = (j$.util.stream.g4) r5
            long r6 = r5.f42671m
            long r3 = r3 + r6
            r8.f42671m = r3
            long r3 = r0.f42671m
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 != 0) goto L5d
            java.lang.Object r0 = r5.c()
        L5a:
            j$.util.stream.K0 r0 = (j$.util.stream.K0) r0
            goto L86
        L5d:
            long r3 = r5.f42671m
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L68
            java.lang.Object r0 = r0.c()
            goto L5a
        L68:
            j$.util.stream.b r0 = r8.f42668j
            j$.util.stream.f3 r0 = r0.I()
            j$.util.stream.e r1 = r8.f42617d
            j$.util.stream.g4 r1 = (j$.util.stream.g4) r1
            java.lang.Object r1 = r1.c()
            j$.util.stream.K0 r1 = (j$.util.stream.K0) r1
            j$.util.stream.e r2 = r8.f42618e
            j$.util.stream.g4 r2 = (j$.util.stream.g4) r2
            java.lang.Object r2 = r2.c()
            j$.util.stream.K0 r2 = (j$.util.stream.K0) r2
            j$.util.stream.M0 r0 = j$.util.stream.AbstractC2055y0.I(r0, r1, r2)
        L86:
            r8.f(r0)
        L89:
            r0 = 1
            r8.f42673o = r0
            super.onCompletion(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.g4.onCompletion(java.util.concurrent.CountedCompleter):void");
    }
}
