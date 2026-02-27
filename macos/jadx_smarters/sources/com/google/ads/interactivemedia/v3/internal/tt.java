package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class tt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24617b;

    public tt(int i9, boolean z9) {
        this.f24616a = i9;
        this.f24617b = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tt.class == obj.getClass()) {
            tt ttVar = (tt) obj;
            if (this.f24616a == ttVar.f24616a && this.f24617b == ttVar.f24617b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f24616a * 31) + (this.f24617b ? 1 : 0);
    }
}
