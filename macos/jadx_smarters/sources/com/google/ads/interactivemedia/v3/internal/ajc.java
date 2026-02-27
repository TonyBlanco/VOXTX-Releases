package com.google.ads.interactivemedia.v3.internal;

import android.app.Application;
import android.content.Context;
import com.google.ads.interactivemedia.v3.api.Ad;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.AdProgressInfo;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.v3.api.BaseManager;
import com.google.ads.interactivemedia.v3.api.FriendlyObstruction;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.v3.impl.data.ResizeAndPositionVideoMsgData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
abstract class ajc implements BaseManager, ajv, alf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ajx f19912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19913b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ajj f19915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f19916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final aid f19917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final akn f19918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final akw f19919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.google.ads.interactivemedia.v3.impl.data.c f19920i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private AdProgressInfo f19921j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final aly f19924m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private alg f19925n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f19914c = new ArrayList(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f19923l = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private AdsRenderingSettings f19922k = new com.google.ads.interactivemedia.v3.impl.data.g();

    public ajc(String str, ajx ajxVar, akw akwVar, BaseDisplayContainer baseDisplayContainer, aid aidVar, akn aknVar, ajj ajjVar, Context context, boolean z9) {
        this.f19913b = str;
        this.f19912a = ajxVar;
        this.f19919h = akwVar;
        this.f19916e = context;
        this.f19915d = ajjVar;
        this.f19917f = aidVar;
        aidVar.j(z9);
        if (aknVar == null) {
            aknVar = null;
        } else {
            aknVar.f(str);
            aknVar.d(baseDisplayContainer.getAdContainer());
            addAdErrorListener(aknVar);
            ajb ajbVar = (ajb) baseDisplayContainer;
            Iterator it = ajbVar.b().iterator();
            while (it.hasNext()) {
                aknVar.c((FriendlyObstruction) it.next());
            }
            ajbVar.c(aknVar);
        }
        this.f19918g = aknVar;
        this.f19924m = new aly(context, this.f19922k);
        ajxVar.g(this, str);
        ajxVar.i(this.f19919h, str);
        aidVar.f();
        Application applicationA = com.google.ads.interactivemedia.v3.impl.data.k.a(context);
        if (applicationA != null) {
            alg algVar = new alg(applicationA);
            this.f19925n = algVar;
            algVar.a(this);
        }
    }

    private final void o(AdErrorEvent adErrorEvent) {
        this.f19921j = null;
        this.f19915d.c(adErrorEvent);
    }

    private final void p(String str) {
        if (com.google.ads.interactivemedia.v3.impl.data.k.b(this.f19916e, this.f19912a.b())) {
            this.f19912a.a().requestFocus();
            this.f19912a.o(new ajr(ajp.userInteraction, ajq.focusUiElement, str));
        }
    }

    private final boolean q() {
        return this.f19922k.getFocusSkipButtonWhenAvailable();
    }

    public Map a(AdsRenderingSettings adsRenderingSettings) {
        HashMap map = new HashMap();
        map.put("adsRenderingSettings", com.google.ads.interactivemedia.v3.impl.data.f.builder(adsRenderingSettings).build());
        return map;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final void addAdErrorListener(AdErrorEvent.AdErrorListener adErrorListener) {
        this.f19915d.a(adErrorListener);
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final void addAdEventListener(AdEvent.AdEventListener adEventListener) {
        this.f19914c.add(adEventListener);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(com.google.ads.interactivemedia.v3.internal.aju r6) {
        /*
            r5 = this;
            com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType r0 = r6.f19961a
            com.google.ads.interactivemedia.v3.impl.data.c r1 = r6.f19962b
            com.google.ads.interactivemedia.v3.impl.data.az r2 = com.google.ads.interactivemedia.v3.impl.data.az.Html
            com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType r2 = com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.ALL_ADS_COMPLETED
            int r2 = r0.ordinal()
            r3 = 3
            r4 = 0
            if (r2 == r3) goto L51
            r3 = 24
            if (r2 == r3) goto L51
            r3 = 5
            if (r2 == r3) goto L4b
            r3 = 6
            if (r2 == r3) goto L45
            r3 = 20
            if (r2 == r3) goto L42
            r3 = 21
            if (r2 == r3) goto L3d
            switch(r2) {
                case 13: goto L36;
                case 14: goto L51;
                case 15: goto L26;
                default: goto L25;
            }
        L25:
            goto L53
        L26:
            if (r1 == 0) goto L2a
            r5.f19920i = r1
        L2a:
            boolean r1 = r5.q()
            if (r1 == 0) goto L53
        L30:
            java.lang.String r1 = r5.f19913b
            r5.p(r1)
            goto L53
        L36:
            boolean r1 = r5.q()
            if (r1 == 0) goto L53
            goto L30
        L3d:
            com.google.ads.interactivemedia.v3.api.AdProgressInfo r1 = r6.f19965e
            r5.f19921j = r1
            goto L53
        L42:
            r5.f19920i = r1
            goto L53
        L45:
            com.google.ads.interactivemedia.v3.internal.aid r1 = r5.f19917f
            r1.k()
            goto L53
        L4b:
            com.google.ads.interactivemedia.v3.internal.aid r1 = r5.f19917f
            r1.i()
            goto L53
        L51:
            r5.f19921j = r4
        L53:
            java.util.Map r6 = r6.f19963c
            com.google.ads.interactivemedia.v3.internal.aig r1 = new com.google.ads.interactivemedia.v3.internal.aig
            com.google.ads.interactivemedia.v3.impl.data.c r2 = r5.f19920i
            r1.<init>(r0, r2, r6)
            java.util.List r6 = r5.f19914c
            java.util.Iterator r6 = r6.iterator()
        L62:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L70
            java.lang.Object r2 = r6.next()
            com.google.ads.interactivemedia.v3.api.AdEvent$AdEventListener r2 = (com.google.ads.interactivemedia.v3.api.AdEvent.AdEventListener) r2
            goto L62
        L70:
            com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType r6 = com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.COMPLETED
            if (r0 == r6) goto L7a
            com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType r6 = com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.SKIPPED
            if (r0 != r6) goto L79
            goto L7a
        L79:
            return
        L7a:
            r5.f19920i = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ajc.b(com.google.ads.interactivemedia.v3.internal.aju):void");
    }

    public final akw c() {
        return this.f19919h;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alf
    public final void d() {
        this.f19912a.o(new ajr(ajp.adsManager, ajq.appBackgrounding, this.f19913b));
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public void destroy() {
        this.f19923l = true;
        this.f19918g.h();
        this.f19917f.g();
        this.f19917f.k();
        alg algVar = this.f19925n;
        if (algVar != null) {
            algVar.b();
        }
        this.f19919h.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alf
    public final void e() {
        this.f19912a.o(new ajr(ajp.adsManager, ajq.appForegrounding, this.f19913b));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajv
    public final void f(AdError.AdErrorType adErrorType, int i9, String str) {
        o(new aif(new AdError(adErrorType, i9, str)));
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final void focus() {
        p(this.f19913b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajv
    public final void g(AdError.AdErrorType adErrorType, AdError.AdErrorCode adErrorCode, String str) {
        o(new aif(new AdError(adErrorType, adErrorCode, str)));
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.AdProgressProvider
    public final VideoProgressUpdate getAdProgress() {
        return this.f19923l ? VideoProgressUpdate.VIDEO_TIME_NOT_READY : this.f19919h.getAdProgress();
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final AdProgressInfo getAdProgressInfo() {
        return this.f19921j;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final Ad getCurrentAd() {
        return this.f19920i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajv
    public final void h(String str) {
        this.f19924m.a(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    @Override // com.google.ads.interactivemedia.v3.internal.ajv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(android.view.ViewGroup r10, com.google.ads.interactivemedia.v3.impl.data.CompanionData r11, java.lang.String r12, com.google.ads.interactivemedia.v3.api.CompanionAdSlot r13, com.google.ads.interactivemedia.v3.internal.ajx r14, com.google.ads.interactivemedia.v3.internal.all r15) {
        /*
            r9 = this;
            r10.removeAllViews()
            com.google.ads.interactivemedia.v3.internal.ajd r13 = (com.google.ads.interactivemedia.v3.internal.ajd) r13
            java.util.List r6 = r13.a()
            com.google.ads.interactivemedia.v3.impl.data.az r0 = com.google.ads.interactivemedia.v3.impl.data.az.Html
            com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType r0 = com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.ALL_ADS_COMPLETED
            com.google.ads.interactivemedia.v3.impl.data.az r0 = r11.type()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L64
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == r3) goto L1f
            if (r0 == r2) goto L64
            goto L6f
        L1f:
            android.content.Context r4 = r10.getContext()
            java.lang.String r0 = r11.src()
            java.lang.String r5 = r11.size()
            if (r5 != 0) goto L2e
            goto L51
        L2e:
            java.lang.String r1 = "x"
            r7 = -1
            java.lang.String[] r1 = r5.split(r1, r7)
            int r5 = r1.length
            r7 = 0
            if (r5 == r2) goto L3f
            com.google.ads.interactivemedia.v3.impl.data.bh r1 = new com.google.ads.interactivemedia.v3.impl.data.bh
            r1.<init>(r7, r7)
            goto L51
        L3f:
            com.google.ads.interactivemedia.v3.impl.data.bh r2 = new com.google.ads.interactivemedia.v3.impl.data.bh
            r5 = r1[r7]
            int r5 = java.lang.Integer.parseInt(r5)
            r1 = r1[r3]
            int r1 = java.lang.Integer.parseInt(r1)
            r2.<init>(r5, r1)
            r1 = r2
        L51:
            com.google.android.gms.tasks.Task r15 = r15.b(r0, r1)
            com.google.ads.interactivemedia.v3.internal.ajn r8 = new com.google.ads.interactivemedia.v3.internal.ajn
            com.google.ads.interactivemedia.v3.internal.aly r7 = r9.f19924m
            r0 = r8
            r1 = r4
            r2 = r14
            r3 = r11
            r4 = r15
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r1 = r8
            goto L6f
        L64:
            com.google.ads.interactivemedia.v3.internal.ajg r1 = new com.google.ads.interactivemedia.v3.internal.ajg
            android.content.Context r14 = r10.getContext()
            com.google.ads.interactivemedia.v3.internal.aly r15 = r9.f19924m
            r1.<init>(r14, r11, r6, r15)
        L6f:
            if (r1 == 0) goto L7a
            r1.setTag(r12)
            r13.b(r12)
            r10.addView(r1)
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ajc.i(android.view.ViewGroup, com.google.ads.interactivemedia.v3.impl.data.CompanionData, java.lang.String, com.google.ads.interactivemedia.v3.api.CompanionAdSlot, com.google.ads.interactivemedia.v3.internal.ajx, com.google.ads.interactivemedia.v3.internal.all):void");
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final void init() {
        init(null);
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final void init(AdsRenderingSettings adsRenderingSettings) {
        if (adsRenderingSettings != null) {
            this.f19922k = adsRenderingSettings;
            this.f19924m.b(adsRenderingSettings);
        }
        this.f19912a.o(new ajr(ajp.adsManager, ajq.init, this.f19913b, a(this.f19922k)));
        this.f19919h.d();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajv
    public final void j(ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData) {
        this.f19919h.g(resizeAndPositionVideoMsgData);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajv
    public final void k() {
        this.f19919h.h();
    }

    public final void l() {
        this.f19912a.n(this.f19913b);
        this.f19914c.clear();
        this.f19915d.b();
    }

    public final void m(ajp ajpVar, ajq ajqVar, Object obj) {
        this.f19912a.o(new ajr(ajpVar, ajqVar, this.f19913b, obj));
    }

    public final void n(ajq ajqVar) {
        this.f19912a.o(new ajr(ajp.adsManager, ajqVar, this.f19913b));
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final void removeAdErrorListener(AdErrorEvent.AdErrorListener adErrorListener) {
        this.f19915d.d(adErrorListener);
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final void removeAdEventListener(AdEvent.AdEventListener adEventListener) {
        this.f19914c.remove(adEventListener);
    }
}
