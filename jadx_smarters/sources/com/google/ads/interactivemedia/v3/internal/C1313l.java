package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: renamed from: com.google.ads.interactivemedia.v3.internal.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1313l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23611a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23613c;

    public C1313l(int i9, int i10) {
        this.f23612b = i9;
        this.f23613c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1313l)) {
            return false;
        }
        C1313l c1313l = (C1313l) obj;
        int i9 = c1313l.f23611a;
        return this.f23612b == c1313l.f23612b && this.f23613c == c1313l.f23613c;
    }

    public final int hashCode() {
        return ((this.f23612b + 16337) * 31) + this.f23613c;
    }
}
