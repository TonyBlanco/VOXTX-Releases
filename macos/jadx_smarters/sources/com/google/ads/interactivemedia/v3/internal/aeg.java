package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class aeg implements aei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C1333s f19336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private co f19337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private aae f19338c;

    public aeg(String str) {
        r rVar = new r();
        rVar.ae(str);
        this.f19336a = rVar.v();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aei
    public final void a(cj cjVar) {
        af.t(this.f19337b);
        int i9 = cq.f22640a;
        long jD = this.f19337b.d();
        long jE = this.f19337b.e();
        if (jD == -9223372036854775807L || jE == -9223372036854775807L) {
            return;
        }
        C1333s c1333s = this.f19336a;
        if (jE != c1333s.f24471p) {
            r rVarB = c1333s.b();
            rVarB.ai(jE);
            C1333s c1333sV = rVarB.v();
            this.f19336a = c1333sV;
            this.f19338c.b(c1333sV);
        }
        int iA = cjVar.a();
        this.f19338c.e(cjVar, iA);
        this.f19338c.f(jD, 1, iA, 0, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aei
    public final void b(co coVar, zk zkVar, aet aetVar) {
        this.f19337b = coVar;
        aetVar.c();
        aae aaeVarI = zkVar.i(aetVar.a(), 5);
        this.f19338c = aaeVarI;
        aaeVarI.b(this.f19336a);
    }
}
