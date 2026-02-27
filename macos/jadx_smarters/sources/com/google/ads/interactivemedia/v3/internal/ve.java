package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ve extends uu {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f24838o;

    public ve(cy cyVar, dc dcVar, C1333s c1333s, int i9, long j9, long j10, long j11) {
        super(cyVar, dcVar, 1, c1333s, i9, j9, j10);
        af.s(c1333s);
        this.f24838o = j11;
    }

    public abstract boolean g();

    public long s() {
        long j9 = this.f24838o;
        if (j9 != -1) {
            return j9 + 1;
        }
        return -1L;
    }
}
