package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.CuePoint;

/* JADX INFO: loaded from: classes3.dex */
public final class aji implements CuePoint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f19941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f19942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f19943c;

    public aji(double d9, double d10, boolean z9) {
        this.f19941a = d9;
        this.f19942b = d10;
        this.f19943c = z9;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CuePoint
    public final double getEndTime() {
        return this.f19942b;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CuePoint
    public final long getEndTimeMs() {
        return (long) Math.floor(this.f19942b * 1000.0d);
    }

    @Override // com.google.ads.interactivemedia.v3.api.CuePoint
    public final double getStartTime() {
        return this.f19941a;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CuePoint
    public final long getStartTimeMs() {
        return (long) Math.floor(this.f19941a * 1000.0d);
    }

    @Override // com.google.ads.interactivemedia.v3.api.CuePoint
    public final boolean isPlayed() {
        return this.f19943c;
    }
}
