package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class aif implements AdErrorEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdError f19829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f19830b;

    public aif(AdError adError) {
        this.f19829a = adError;
        this.f19830b = null;
    }

    public aif(AdError adError, Object obj) {
        this.f19829a = adError;
        this.f19830b = obj;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdErrorEvent
    public final AdError getError() {
        return this.f19829a;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdErrorEvent
    public final Object getUserRequestContext() {
        return this.f19830b;
    }
}
