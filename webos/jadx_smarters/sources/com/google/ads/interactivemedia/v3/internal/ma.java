package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class ma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f23767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f23768e;

    public ma(String str, String str2, String str3, String str4, String str5) {
        this.f23764a = str;
        this.f23765b = str2;
        this.f23766c = str3;
        this.f23767d = str4;
        this.f23768e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma)) {
            return false;
        }
        ma maVar = (ma) obj;
        return cq.V(this.f23764a, maVar.f23764a) && cq.V(this.f23765b, maVar.f23765b) && cq.V(this.f23766c, maVar.f23766c) && cq.V(this.f23767d, maVar.f23767d) && cq.V(this.f23768e, maVar.f23768e);
    }

    public final int hashCode() {
        String str = this.f23764a;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f23765b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f23766c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f23767d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f23768e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
