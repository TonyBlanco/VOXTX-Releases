package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdsManager;
import com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent;
import com.google.ads.interactivemedia.v3.api.StreamManager;

/* JADX INFO: loaded from: classes3.dex */
public final class ais implements AdsManagerLoadedEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdsManager f19885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StreamManager f19886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f19887c;

    public ais(AdsManager adsManager, Object obj) {
        this.f19885a = adsManager;
        this.f19886b = null;
        this.f19887c = obj;
    }

    public ais(StreamManager streamManager, Object obj) {
        this.f19885a = null;
        this.f19886b = streamManager;
        this.f19887c = obj;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent
    public final AdsManager getAdsManager() {
        return this.f19885a;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent
    public final StreamManager getStreamManager() {
        return this.f19886b;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent
    public final Object getUserRequestContext() {
        return this.f19887c;
    }
}
