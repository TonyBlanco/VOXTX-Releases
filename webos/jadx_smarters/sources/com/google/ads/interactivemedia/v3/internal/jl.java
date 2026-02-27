package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class jl extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1333s f23363c;

    public jl(int i9, int i10, int i11, int i12, C1333s c1333s, boolean z9, Exception exc) {
        super("AudioTrack init failed " + i9 + " Config(" + i10 + ", " + i11 + ", " + i12 + ")" + (true != z9 ? "" : " (recoverable)"), exc);
        this.f23361a = i9;
        this.f23362b = z9;
        this.f23363c = c1333s;
    }
}
