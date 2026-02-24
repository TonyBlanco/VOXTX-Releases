package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class lx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23754c;

    public lx(String str, String str2, String str3) {
        this.f23752a = str;
        this.f23753b = str2;
        this.f23754c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lx.class == obj.getClass()) {
            lx lxVar = (lx) obj;
            if (cq.V(this.f23752a, lxVar.f23752a) && cq.V(this.f23753b, lxVar.f23753b) && cq.V(this.f23754c, lxVar.f23754c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f23752a.hashCode() * 31;
        String str = this.f23753b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f23754c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
