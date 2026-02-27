package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class aac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aac f18626a = new aac(0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18628c;

    public aac(long j9, long j10) {
        this.f18627b = j9;
        this.f18628c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aac.class == obj.getClass()) {
            aac aacVar = (aac) obj;
            if (this.f18627b == aacVar.f18627b && this.f18628c == aacVar.f18628c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f18627b) * 31) + ((int) this.f18628c);
    }

    public final String toString() {
        return "[timeUs=" + this.f18627b + ", position=" + this.f18628c + "]";
    }
}
