package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class mi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final long f23791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f23792b;

    public mi(long j9, long j10) {
        this.f23791a = j9;
        this.f23792b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mi.class == obj.getClass()) {
            mi miVar = (mi) obj;
            if (this.f23791a == miVar.f23791a && this.f23792b == miVar.f23792b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f23791a) * 31) + ((int) this.f23792b);
    }
}
