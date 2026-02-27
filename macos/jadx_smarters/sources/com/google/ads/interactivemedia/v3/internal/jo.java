package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class jo extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1333s f23366c;

    public jo(int i9, C1333s c1333s, boolean z9) {
        super("AudioTrack write failed: " + i9);
        this.f23365b = z9;
        this.f23364a = i9;
        this.f23366c = c1333s;
    }
}
