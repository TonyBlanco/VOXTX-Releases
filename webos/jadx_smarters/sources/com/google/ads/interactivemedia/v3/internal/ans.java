package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class ans implements asy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final arw f20347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final asg f20348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final aod f20349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final anr f20350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final anh f20351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final aof f20352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final anx f20353g;

    public ans(arw arwVar, asg asgVar, aod aodVar, anr anrVar, anh anhVar, aof aofVar, anx anxVar) {
        this.f20347a = arwVar;
        this.f20348b = asgVar;
        this.f20349c = aodVar;
        this.f20350d = anrVar;
        this.f20351e = anhVar;
        this.f20352f = aofVar;
        this.f20353g = anxVar;
    }

    private final Map e() {
        HashMap map = new HashMap();
        agc agcVarB = this.f20348b.b();
        map.put("v", this.f20347a.b());
        map.put("gms", Boolean.valueOf(this.f20347a.c()));
        map.put("int", agcVarB.f());
        map.put("up", Boolean.valueOf(this.f20350d.a()));
        map.put("t", new Throwable());
        anx anxVar = this.f20353g;
        if (anxVar != null) {
            map.put("tcq", Long.valueOf(anxVar.c()));
            map.put("tpq", Long.valueOf(this.f20353g.g()));
            map.put("tcv", Long.valueOf(this.f20353g.d()));
            map.put("tpv", Long.valueOf(this.f20353g.h()));
            map.put("tchv", Long.valueOf(this.f20353g.b()));
            map.put("tphv", Long.valueOf(this.f20353g.f()));
            map.put("tcc", Long.valueOf(this.f20353g.a()));
            map.put("tpc", Long.valueOf(this.f20353g.e()));
        }
        return map;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asy
    public final Map a() {
        Map mapE = e();
        mapE.put("lts", Long.valueOf(this.f20349c.a()));
        return mapE;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asy
    public final Map b() {
        Map mapE = e();
        agc agcVarA = this.f20348b.a();
        mapE.put("gai", Boolean.valueOf(this.f20347a.d()));
        mapE.put("did", agcVarA.e());
        mapE.put("dst", Integer.valueOf(aft.b(agcVarA.al())));
        mapE.put("doo", Boolean.valueOf(agcVarA.ai()));
        anh anhVar = this.f20351e;
        if (anhVar != null) {
            mapE.put("nt", Long.valueOf(anhVar.a()));
        }
        aof aofVar = this.f20352f;
        if (aofVar != null) {
            mapE.put("vs", Long.valueOf(aofVar.c()));
            mapE.put("vf", Long.valueOf(this.f20352f.b()));
        }
        return mapE;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asy
    public final Map c() {
        return e();
    }

    public final void d(View view) {
        this.f20349c.d(view);
    }
}
