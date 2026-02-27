package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cx f23625a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final aeq f23628d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nu f23626b = new nk();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ws f23629e = new ws();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f23627c = 30000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ws f23630f = new ws();

    public lc(cx cxVar) {
        this.f23628d = new aeq(cxVar);
        this.f23625a = cxVar;
    }

    public final lh a(ai aiVar) {
        af.s(aiVar.f19815b);
        lw lwVar = new lw();
        List list = aiVar.f19815b.f19031e;
        return new lh(aiVar, this.f23625a, !list.isEmpty() ? new rz(lwVar, list) : lwVar, this.f23628d, this.f23630f, this.f23626b.a(aiVar), this.f23629e, 30000L, null, null, null, null);
    }
}
