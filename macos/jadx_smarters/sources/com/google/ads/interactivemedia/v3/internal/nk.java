package com.google.ads.interactivemedia.v3.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class nk implements nu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f23891a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private aa f23892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private nt f23893c;

    @Override // com.google.ads.interactivemedia.v3.internal.nu
    public final nt a(ai aiVar) {
        nt ntVar;
        af.s(aiVar.f19815b);
        aa aaVar = aiVar.f19815b.f19029c;
        if (aaVar == null || cq.f22640a < 18) {
            return nt.f23901b;
        }
        synchronized (this.f23891a) {
            try {
                if (!cq.V(aaVar, this.f23892b)) {
                    this.f23892b = aaVar;
                    dg dgVar = new dg();
                    dgVar.b(null);
                    oh ohVar = new oh(null, dgVar);
                    axq axqVarListIterator = aaVar.f18622b.entrySet().listIterator();
                    while (axqVarListIterator.hasNext()) {
                        Map.Entry entry = (Map.Entry) axqVarListIterator.next();
                        ohVar.a((String) entry.getKey(), (String) entry.getValue());
                    }
                    mz mzVar = new mz();
                    mzVar.c(aaVar.f18621a, og.f23914a);
                    mzVar.b(axy.c(aaVar.f18623c));
                    nj njVarA = mzVar.a(ohVar);
                    njVarA.u(aaVar.a());
                    this.f23893c = njVarA;
                }
                ntVar = this.f23893c;
                af.s(ntVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return ntVar;
    }
}
