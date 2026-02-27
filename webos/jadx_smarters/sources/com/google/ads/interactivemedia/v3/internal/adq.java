package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class adq implements adr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f19162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final aae[] f19163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f19167f = -9223372036854775807L;

    public adq(List list) {
        this.f19162a = list;
        this.f19163b = new aae[list.size()];
    }

    private final boolean f(cj cjVar, int i9) {
        if (cjVar.a() == 0) {
            return false;
        }
        if (cjVar.i() != i9) {
            this.f19164c = false;
        }
        this.f19165d--;
        return this.f19164c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void a(cj cjVar) {
        if (this.f19164c) {
            if (this.f19165d != 2 || f(cjVar, 32)) {
                if (this.f19165d != 1 || f(cjVar, 0)) {
                    int iC = cjVar.c();
                    int iA = cjVar.a();
                    for (aae aaeVar : this.f19163b) {
                        cjVar.F(iC);
                        aaeVar.e(cjVar, iA);
                    }
                    this.f19166e += iA;
                }
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void b(zk zkVar, aet aetVar) {
        for (int i9 = 0; i9 < this.f19163b.length; i9++) {
            aeq aeqVar = (aeq) this.f19162a.get(i9);
            aetVar.c();
            aae aaeVarI = zkVar.i(aetVar.a(), 3);
            r rVar = new r();
            rVar.S(aetVar.b());
            rVar.ae("application/dvbsubs");
            rVar.T(Collections.singletonList(aeqVar.f19397b));
            rVar.V((String) aeqVar.f19396a);
            aaeVarI.b(rVar.v());
            this.f19163b[i9] = aaeVarI;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void c() {
        if (this.f19164c) {
            if (this.f19167f != -9223372036854775807L) {
                for (aae aaeVar : this.f19163b) {
                    aaeVar.f(this.f19167f, 1, this.f19166e, 0, null);
                }
            }
            this.f19164c = false;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void d(long j9, int i9) {
        if ((i9 & 4) == 0) {
            return;
        }
        this.f19164c = true;
        if (j9 != -9223372036854775807L) {
            this.f19167f = j9;
        }
        this.f19166e = 0;
        this.f19165d = 2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void e() {
        this.f19164c = false;
        this.f19167f = -9223372036854775807L;
    }
}
