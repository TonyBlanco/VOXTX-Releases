package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class sg implements tk, no {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ si f24502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f24503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private tj f24504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private nn f24505d;

    public sg(si siVar, Object obj) {
        this.f24502a = siVar;
        this.f24504c = siVar.x(null);
        this.f24505d = siVar.v(null);
        this.f24503b = obj;
    }

    private final tb m(tb tbVar) {
        long jC = this.f24502a.c(this.f24503b, tbVar.f24578f);
        long jC2 = this.f24502a.c(this.f24503b, tbVar.f24579g);
        return (jC == tbVar.f24578f && jC2 == tbVar.f24579g) ? tbVar : new tb(tbVar.f24573a, tbVar.f24574b, tbVar.f24575c, tbVar.f24576d, jC, jC2);
    }

    private final boolean n(int i9, te teVar) {
        te teVarD;
        if (teVar != null) {
            teVarD = this.f24502a.d(this.f24503b, teVar);
            if (teVarD == null) {
                return false;
            }
        } else {
            teVarD = null;
        }
        int iB = this.f24502a.b(this.f24503b, i9);
        tj tjVar = this.f24504c;
        if (tjVar.f24591a != iB || !cq.V(tjVar.f24592b, teVarD)) {
            this.f24504c = this.f24502a.M(iB, teVarD);
        }
        nn nnVar = this.f24505d;
        if (nnVar.f23895a == iB && cq.V(nnVar.f23896b, teVarD)) {
            return true;
        }
        this.f24505d = this.f24502a.w(iB, teVarD);
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tk
    public final void ae(int i9, te teVar, tb tbVar) {
        if (n(i9, teVar)) {
            this.f24504c.c(m(tbVar));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tk
    public final void af(int i9, te teVar, sw swVar, tb tbVar) {
        if (n(i9, teVar)) {
            this.f24504c.e(swVar, m(tbVar));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tk
    public final void ag(int i9, te teVar, sw swVar, tb tbVar) {
        if (n(i9, teVar)) {
            this.f24504c.g(swVar, m(tbVar));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tk
    public final void ah(int i9, te teVar, sw swVar, tb tbVar, IOException iOException, boolean z9) {
        if (n(i9, teVar)) {
            this.f24504c.i(swVar, m(tbVar), iOException, z9);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tk
    public final void ai(int i9, te teVar, sw swVar, tb tbVar) {
        if (n(i9, teVar)) {
            this.f24504c.k(swVar, m(tbVar));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tk
    public final void aj(int i9, te teVar, tb tbVar) {
        if (n(i9, teVar)) {
            this.f24504c.m(m(tbVar));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.no
    public final void ak(int i9, te teVar) {
        if (n(i9, teVar)) {
            this.f24505d.c();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.no
    public final void al(int i9, te teVar) {
        if (n(i9, teVar)) {
            this.f24505d.d();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.no
    public final void am(int i9, te teVar, int i10) {
        if (n(i9, teVar)) {
            this.f24505d.e(i10);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.no
    public final void an(int i9, te teVar, Exception exc) {
        if (n(i9, teVar)) {
            this.f24505d.f(exc);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.no
    public final void ao(int i9, te teVar) {
        if (n(i9, teVar)) {
            this.f24505d.g();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.no
    public final /* synthetic */ void ap() {
    }
}
