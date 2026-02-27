package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pb {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final oq f24026h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nu f24021c = new nk();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ql f24020b = new pq();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final pr f24025g = pv.f24140a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ox f24019a = ox.f23965a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ws f24027i = new ws();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ws f24028j = new ws();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f24023e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f24024f = -9223372036854775807L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f24022d = true;

    public pb(cx cxVar) {
        this.f24026h = new oq(cxVar);
    }

    public final pc a(ai aiVar) {
        af.s(aiVar.f19815b);
        ql qlVar = this.f24020b;
        List list = aiVar.f19815b.f19031e;
        ql pwVar = !list.isEmpty() ? new pw(qlVar, list) : qlVar;
        oq oqVar = this.f24026h;
        ox oxVar = this.f24019a;
        ws wsVar = this.f24028j;
        nt ntVarA = this.f24021c.a(aiVar);
        ws wsVar2 = this.f24027i;
        return new pc(aiVar, oqVar, oxVar, wsVar, ntVarA, wsVar2, new pv(this.f24026h, wsVar2, pwVar, null, null, null), -9223372036854775807L, true, 1, null, null, null, null);
    }
}
