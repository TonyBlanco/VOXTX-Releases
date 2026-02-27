package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.AdsManager;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
public final class air extends ajc implements AdsManager, AdErrorEvent.AdErrorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f19881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ajh f19882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private akq f19883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final aeq f19884d;

    public air(String str, ajx ajxVar, AdDisplayContainer adDisplayContainer, akq akqVar, List list, SortedSet sortedSet, akn aknVar, ajj ajjVar, Context context, boolean z9) {
        akf akfVar = new akf(str, ajxVar, ajjVar, adDisplayContainer);
        aid aidVar = new aid(str, ajxVar, adDisplayContainer.getAdContainer());
        aeq aeqVar = new aeq(ajxVar.a(), adDisplayContainer.getAdContainer());
        super(str, ajxVar, akfVar, adDisplayContainer, aidVar, aknVar, ajjVar, context, z9);
        this.f19881a = list;
        this.f19883c = akqVar;
        this.f19884d = aeqVar;
        if (akqVar != null) {
            ajh ajhVar = new ajh(ajxVar, sortedSet, str);
            this.f19882b = ajhVar;
            akqVar.b(ajhVar);
            akqVar.d();
        }
        addAdErrorListener(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajc
    public final Map a(AdsRenderingSettings adsRenderingSettings) {
        Map mapA = super.a(adsRenderingSettings);
        akq akqVar = this.f19883c;
        if (akqVar != null) {
            if (!akqVar.f().equals(VideoProgressUpdate.VIDEO_TIME_NOT_READY)) {
                double currentTimeMs = r0.getCurrentTimeMs() / 1000.0f;
                com.google.ads.interactivemedia.v3.impl.data.m.c("AdsManager.init -> Setting contentStartTime " + currentTimeMs);
                mapA.put("contentStartTime", Double.valueOf(currentTimeMs));
            }
        }
        return mapA;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajc, com.google.ads.interactivemedia.v3.internal.ajv
    public final void b(aju ajuVar) {
        akf akfVar = (akf) c();
        AdEvent.AdEventType adEventType = ajuVar.f19961a;
        AdEvent.AdEventType adEventType2 = AdEvent.AdEventType.ALL_ADS_COMPLETED;
        int iOrdinal = adEventType.ordinal();
        if (iOrdinal == 0) {
            super.destroy();
            akq akqVar = this.f19883c;
            if (akqVar != null) {
                akqVar.e();
                this.f19883c = null;
            }
            this.f19884d.c();
            n(ajq.destroy);
            super.b(ajuVar);
            l();
            return;
        }
        if (iOrdinal == 5) {
            akq akqVar2 = this.f19883c;
            if (akqVar2 != null) {
                akqVar2.e();
            }
        } else if (iOrdinal == 6) {
            this.f19884d.c();
            akfVar.e();
            akq akqVar3 = this.f19883c;
            if (akqVar3 != null) {
                akqVar3.d();
            }
        } else if (iOrdinal == 14) {
            this.f19884d.c();
        } else if (iOrdinal == 15) {
            this.f19884d.d();
        }
        super.b(ajuVar);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManager
    public final void clicked() {
        n(ajq.click);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajc, com.google.ads.interactivemedia.v3.api.BaseManager
    public final void destroy() {
        super.destroy();
        akq akqVar = this.f19883c;
        if (akqVar != null) {
            akqVar.e();
            this.f19883c = null;
        }
        this.f19884d.c();
        n(ajq.destroy);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManager
    public final void discardAdBreak() {
        n(ajq.discardAdBreak);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManager
    public final List<Float> getAdCuePoints() {
        return this.f19881a;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final boolean isCustomPlaybackUsed() {
        return ((akf) c()).i();
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener
    public final void onAdError(AdErrorEvent adErrorEvent) {
        this.f19884d.c();
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManager
    public final void pause() {
        n(ajq.pause);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManager
    public final void requestNextAdBreak() {
        akq akqVar = this.f19883c;
        if (akqVar != null) {
            m(ajp.contentTimeUpdate, ajq.contentTimeUpdate, com.google.ads.interactivemedia.v3.impl.data.bz.create(akqVar.f()));
            n(ajq.requestNextAdBreak);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManager
    public final void resume() {
        n(ajq.resume);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManager
    public final void skip() {
        n(ajq.skip);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManager
    public final void start() {
        n(ajq.start);
    }
}
