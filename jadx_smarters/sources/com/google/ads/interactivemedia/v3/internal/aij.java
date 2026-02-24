package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdProgressInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class aij implements AdProgressInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f19837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f19838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f19839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f19840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f19841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double f19842f;

    public aij(double d9, double d10, int i9, int i10, double d11, double d12) {
        this.f19837a = d9;
        this.f19838b = d10;
        this.f19839c = i9;
        this.f19840d = i10;
        this.f19841e = d11;
        this.f19842f = d12;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdProgressInfo
    public final double getAdBreakDuration() {
        return this.f19841e;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdProgressInfo
    public final double getAdPeriodDuration() {
        return this.f19842f;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdProgressInfo
    public final int getAdPosition() {
        return this.f19839c;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdProgressInfo
    public final double getCurrentTime() {
        return this.f19837a;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdProgressInfo
    public final double getDuration() {
        return this.f19838b;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdProgressInfo
    public final int getTotalAds() {
        return this.f19840d;
    }
}
