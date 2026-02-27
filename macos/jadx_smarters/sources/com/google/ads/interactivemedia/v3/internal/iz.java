package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class iz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final iz f23328a = new iz(-1, -1, -1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23332e;

    public iz(int i9, int i10, int i11) {
        this.f23329b = i9;
        this.f23330c = i10;
        this.f23331d = i11;
        this.f23332e = cq.Y(i11) ? cq.l(i11, i10) : -1;
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f23329b + ", channelCount=" + this.f23330c + ", encoding=" + this.f23331d + "]";
    }
}
