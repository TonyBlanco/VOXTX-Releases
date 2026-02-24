package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class eu implements gp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ho f22854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final et f22855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private hh f22856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private gp f22857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22858e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f22859f;

    public eu(et etVar, bn bnVar) {
        this.f22855b = etVar;
        this.f22854a = new ho(bnVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.gp
    public final long a() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(boolean r6) {
        /*
            r5 = this;
            com.google.ads.interactivemedia.v3.internal.hh r0 = r5.f22856c
            if (r0 == 0) goto L66
            boolean r0 = r0.N()
            if (r0 != 0) goto L66
            com.google.ads.interactivemedia.v3.internal.hh r0 = r5.f22856c
            boolean r0 = r0.O()
            if (r0 != 0) goto L1d
            if (r6 != 0) goto L66
            com.google.ads.interactivemedia.v3.internal.hh r6 = r5.f22856c
            boolean r6 = r6.G()
            if (r6 == 0) goto L1d
            goto L66
        L1d:
            com.google.ads.interactivemedia.v3.internal.gp r6 = r5.f22857d
            com.google.ads.interactivemedia.v3.internal.af.s(r6)
            long r0 = r6.a()
            boolean r2 = r5.f22858e
            if (r2 == 0) goto L46
            com.google.ads.interactivemedia.v3.internal.ho r2 = r5.f22854a
            long r2 = r2.a()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L3a
            com.google.ads.interactivemedia.v3.internal.ho r6 = r5.f22854a
            r6.e()
            goto L72
        L3a:
            r2 = 0
            r5.f22858e = r2
            boolean r2 = r5.f22859f
            if (r2 == 0) goto L46
            com.google.ads.interactivemedia.v3.internal.ho r2 = r5.f22854a
            r2.d()
        L46:
            com.google.ads.interactivemedia.v3.internal.ho r2 = r5.f22854a
            r2.b(r0)
            com.google.ads.interactivemedia.v3.internal.au r6 = r6.c()
            com.google.ads.interactivemedia.v3.internal.ho r0 = r5.f22854a
            com.google.ads.interactivemedia.v3.internal.au r0 = r0.c()
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L72
            com.google.ads.interactivemedia.v3.internal.ho r0 = r5.f22854a
            r0.g(r6)
            com.google.ads.interactivemedia.v3.internal.et r0 = r5.f22855b
            r0.a(r6)
            goto L72
        L66:
            r6 = 1
            r5.f22858e = r6
            boolean r6 = r5.f22859f
            if (r6 == 0) goto L72
            com.google.ads.interactivemedia.v3.internal.ho r6 = r5.f22854a
            r6.d()
        L72:
            boolean r6 = r5.f22858e
            if (r6 == 0) goto L7d
            com.google.ads.interactivemedia.v3.internal.ho r6 = r5.f22854a
            long r0 = r6.a()
            goto L86
        L7d:
            com.google.ads.interactivemedia.v3.internal.gp r6 = r5.f22857d
            com.google.ads.interactivemedia.v3.internal.af.s(r6)
            long r0 = r6.a()
        L86:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.eu.b(boolean):long");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.gp
    public final au c() {
        gp gpVar = this.f22857d;
        return gpVar != null ? gpVar.c() : this.f22854a.c();
    }

    public final void d(hh hhVar) {
        if (hhVar == this.f22856c) {
            this.f22857d = null;
            this.f22856c = null;
            this.f22858e = true;
        }
    }

    public final void e(hh hhVar) throws ev {
        gp gpVar;
        gp gpVarJ = hhVar.j();
        if (gpVarJ == null || gpVarJ == (gpVar = this.f22857d)) {
            return;
        }
        if (gpVar != null) {
            throw ev.d(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f22857d = gpVarJ;
        this.f22856c = hhVar;
        gpVarJ.g(this.f22854a.c());
    }

    public final void f(long j9) {
        this.f22854a.b(j9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.gp
    public final void g(au auVar) {
        gp gpVar = this.f22857d;
        if (gpVar != null) {
            gpVar.g(auVar);
            auVar = this.f22857d.c();
        }
        this.f22854a.g(auVar);
    }

    public final void h() {
        this.f22859f = true;
        this.f22854a.d();
    }

    public final void i() {
        this.f22859f = false;
        this.f22854a.e();
    }
}
