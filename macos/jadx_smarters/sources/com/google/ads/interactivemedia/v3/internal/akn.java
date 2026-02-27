package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.view.View;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.FriendlyObstruction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class akn implements AdEvent.AdEventListener, AdErrorEvent.AdErrorListener, aja, ajw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ajx f20031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final akm f20032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f20033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f20034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f20035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f20036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f20037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f20038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f20039i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private agq f20040j;

    public akn(ajx ajxVar, Context context) {
        akm akmVar = new akm();
        this.f20037g = false;
        this.f20038h = false;
        this.f20039i = null;
        this.f20031a = ajxVar;
        this.f20033c = context;
        this.f20032b = akmVar;
        this.f20036f = new HashSet();
    }

    private final void j(List list) {
        com.google.ads.interactivemedia.v3.impl.data.bv bvVarBuild;
        if (list == null) {
            bvVarBuild = null;
        } else if (list.isEmpty()) {
            return;
        } else {
            bvVarBuild = com.google.ads.interactivemedia.v3.impl.data.bv.builder().friendlyObstructions(list).build();
        }
        this.f20031a.o(new ajr(ajp.omid, ajq.registerFriendlyObstructions, this.f20035e, bvVarBuild));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajw
    public final void a() {
        this.f20037g = false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajw
    public final void b() {
        ago.b(this.f20033c);
        this.f20037g = true;
    }

    public final void c(FriendlyObstruction friendlyObstruction) {
        if (this.f20036f.contains(friendlyObstruction)) {
            return;
        }
        this.f20036f.add(friendlyObstruction);
        agq agqVar = this.f20040j;
        if (agqVar == null) {
            return;
        }
        agqVar.a(friendlyObstruction.getView(), friendlyObstruction.getPurpose().getOmidPurpose(), friendlyObstruction.getDetailedReason());
        j(Arrays.asList(friendlyObstruction));
    }

    public final void d(View view) {
        this.f20034d = view;
    }

    public final void e(String str) {
        this.f20039i = str;
    }

    public final void f(String str) {
        this.f20035e = str;
    }

    public final void g() {
        this.f20036f.clear();
        agq agqVar = this.f20040j;
        if (agqVar == null) {
            return;
        }
        agqVar.d();
        j(null);
    }

    public final void h() {
        agq agqVar;
        if (!this.f20037g || (agqVar = this.f20040j) == null) {
            return;
        }
        agqVar.b();
        this.f20040j = null;
    }

    public final void i() {
        this.f20038h = true;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener
    public final void onAdError(AdErrorEvent adErrorEvent) {
        agq agqVar;
        if (!this.f20037g || (agqVar = this.f20040j) == null) {
            return;
        }
        agqVar.b();
        this.f20040j = null;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdEvent.AdEventListener
    public final void onAdEvent(AdEvent adEvent) {
        if (this.f20037g) {
            AdEvent.AdEventType adEventType = AdEvent.AdEventType.ALL_ADS_COMPLETED;
            int iOrdinal = adEvent.getType().ordinal();
            if (iOrdinal == 3 || iOrdinal == 14) {
                h();
                return;
            }
            if (iOrdinal == 15 && this.f20037g && this.f20040j == null && this.f20034d != null) {
                agu aguVar = agu.DEFINED_BY_JAVASCRIPT;
                agw agwVar = agw.DEFINED_BY_JAVASCRIPT;
                agx agxVar = agx.JAVASCRIPT;
                agq agqVarF = agq.f(ly.k(aguVar, agwVar, agxVar, agxVar), agr.g(bdy.n(), this.f20031a.a(), this.f20039i, "{ssai:" + (true != this.f20038h ? "false" : "true") + "}"));
                agqVarF.c(this.f20034d);
                for (FriendlyObstruction friendlyObstruction : this.f20036f) {
                    agqVarF.a(friendlyObstruction.getView(), friendlyObstruction.getPurpose().getOmidPurpose(), friendlyObstruction.getDetailedReason());
                }
                j(new ArrayList(this.f20036f));
                agqVarF.e();
                this.f20040j = agqVarF;
            }
        }
    }
}
