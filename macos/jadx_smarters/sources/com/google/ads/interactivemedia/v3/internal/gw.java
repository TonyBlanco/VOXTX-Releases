package com.google.ads.interactivemedia.v3.internal;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class gw implements tk, no {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ha f23106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gy f23107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private tj f23108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private nn f23109d;

    public gw(ha haVar, gy gyVar) {
        this.f23106a = haVar;
        this.f23108c = haVar.f23124f;
        this.f23109d = haVar.f23125g;
        this.f23107b = gyVar;
    }

    private final boolean m(int i9, te teVar) {
        te teVarC = null;
        if (teVar != null) {
            gy gyVar = this.f23107b;
            int i10 = 0;
            while (true) {
                if (i10 >= gyVar.f23115c.size()) {
                    break;
                }
                if (((te) gyVar.f23115c.get(i10)).f20176d == teVar.f20176d) {
                    teVarC = teVar.c(Pair.create(gyVar.f23114b, teVar.f20173a));
                    break;
                }
                i10++;
            }
            if (teVarC == null) {
                return false;
            }
        }
        int i11 = i9 + this.f23107b.f23116d;
        tj tjVar = this.f23108c;
        if (tjVar.f24591a != i11 || !cq.V(tjVar.f24592b, teVarC)) {
            this.f23108c = this.f23106a.f23124f.a(i11, teVarC, 0L);
        }
        nn nnVar = this.f23109d;
        if (nnVar.f23895a == i11 && cq.V(nnVar.f23896b, teVarC)) {
            return true;
        }
        this.f23109d = this.f23106a.f23125g.a(i11, teVarC);
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tk
    public final void ae(int i9, te teVar, tb tbVar) {
        if (m(i9, teVar)) {
            this.f23108c.c(tbVar);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tk
    public final void af(int i9, te teVar, sw swVar, tb tbVar) {
        if (m(i9, teVar)) {
            this.f23108c.e(swVar, tbVar);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tk
    public final void ag(int i9, te teVar, sw swVar, tb tbVar) {
        if (m(i9, teVar)) {
            this.f23108c.g(swVar, tbVar);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tk
    public final void ah(int i9, te teVar, sw swVar, tb tbVar, IOException iOException, boolean z9) {
        if (m(i9, teVar)) {
            this.f23108c.i(swVar, tbVar, iOException, z9);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tk
    public final void ai(int i9, te teVar, sw swVar, tb tbVar) {
        if (m(i9, teVar)) {
            this.f23108c.k(swVar, tbVar);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tk
    public final void aj(int i9, te teVar, tb tbVar) {
        if (m(i9, teVar)) {
            this.f23108c.m(tbVar);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.no
    public final void ak(int i9, te teVar) {
        if (m(i9, teVar)) {
            this.f23109d.c();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.no
    public final void al(int i9, te teVar) {
        if (m(i9, teVar)) {
            this.f23109d.d();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.no
    public final void am(int i9, te teVar, int i10) {
        if (m(i9, teVar)) {
            this.f23109d.e(i10);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.no
    public final void an(int i9, te teVar, Exception exc) {
        if (m(i9, teVar)) {
            this.f23109d.f(exc);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.no
    public final void ao(int i9, te teVar) {
        if (m(i9, teVar)) {
            this.f23109d.g();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.no
    public final /* synthetic */ void ap() {
    }
}
