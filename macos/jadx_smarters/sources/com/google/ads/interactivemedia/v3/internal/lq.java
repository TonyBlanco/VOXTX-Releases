package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class lq implements aae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ lr f23700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ue f23701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final go f23702c = new go();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ef f23704e = new ef();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f23703d = -9223372036854775807L;

    public lq(lr lrVar, wr wrVar) {
        this.f23700a = lrVar;
        this.f23701b = ue.O(wrVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aae
    public final /* synthetic */ int a(InterfaceC1310k interfaceC1310k, int i9, boolean z9) {
        return fz.h(this, interfaceC1310k, i9, z9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aae
    public final void b(C1333s c1333s) {
        this.f23701b.b(c1333s);
    }

    public final void c(uu uuVar) {
        long j9 = this.f23703d;
        if (j9 == -9223372036854775807L || uuVar.f24786m > j9) {
            this.f23703d = uuVar.f24786m;
        }
        this.f23700a.h();
    }

    public final void d() {
        this.f23701b.A();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aae
    public final /* synthetic */ void e(cj cjVar, int i9) {
        fz.i(this, cjVar, i9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aae
    public final void f(long j9, int i9, int i10, int i11, aad aadVar) {
        ef efVar;
        long jU;
        this.f23701b.f(j9, i9, i10, i11, aadVar);
        while (this.f23701b.K(false)) {
            this.f23704e.b();
            if (this.f23701b.o(this.f23702c, this.f23704e, 0, false) == -4) {
                this.f23704e.j();
                efVar = this.f23704e;
            } else {
                efVar = null;
            }
            if (efVar != null) {
                long j10 = efVar.f22776d;
                ao aoVarA = this.f23700a.f23706b.a(efVar);
                if (aoVarA != null) {
                    aal aalVar = (aal) aoVarA.b(0);
                    String str = aalVar.f18664a;
                    String str2 = aalVar.f18665b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            jU = cq.u(cq.I(aalVar.f18668e));
                        } catch (as unused) {
                            jU = -9223372036854775807L;
                        }
                        if (jU != -9223372036854775807L) {
                            lo loVar = new lo(j10, jU);
                            lr lrVar = this.f23700a;
                            lrVar.f23707c.sendMessage(lrVar.f23707c.obtainMessage(1, loVar));
                        }
                    }
                }
            }
        }
        this.f23701b.v();
    }

    public final boolean g(uu uuVar) {
        long j9 = this.f23703d;
        boolean z9 = false;
        if (j9 != -9223372036854775807L && j9 < uuVar.f24785l) {
            z9 = true;
        }
        return this.f23700a.g(z9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aae
    public final int h(InterfaceC1310k interfaceC1310k, int i9, boolean z9) throws IOException {
        return fz.h(this.f23701b, interfaceC1310k, i9, z9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aae
    public final void i(cj cjVar, int i9) {
        fz.i(this.f23701b, cjVar, i9);
    }
}
