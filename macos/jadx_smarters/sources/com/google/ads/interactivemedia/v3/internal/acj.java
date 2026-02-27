package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class acj implements ach {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final cj f18920c;

    public acj(acd acdVar, C1333s c1333s) {
        cj cjVar = acdVar.f18899a;
        this.f18920c = cjVar;
        cjVar.F(12);
        int iL = cjVar.l();
        if ("audio/raw".equals(c1333s.f24467l)) {
            int iL2 = cq.l(c1333s.f24450A, c1333s.f24480y);
            if (iL == 0 || iL % iL2 != 0) {
                cd.e("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iL2 + ", stsz sample size: " + iL);
                iL = iL2;
            }
        }
        this.f18918a = iL == 0 ? -1 : iL;
        this.f18919b = cjVar.l();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ach
    public final int a() {
        return this.f18918a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ach
    public final int b() {
        return this.f18919b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ach
    public final int c() {
        int i9 = this.f18918a;
        return i9 == -1 ? this.f18920c.l() : i9;
    }
}
