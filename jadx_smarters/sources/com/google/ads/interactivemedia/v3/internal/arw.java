package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class arw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f20596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f20597c;

    public arw() {
    }

    public /* synthetic */ arw(String str, boolean z9, boolean z10) {
        this();
        this.f20595a = str;
        this.f20596b = z9;
        this.f20597c = z10;
    }

    public static arv a() {
        arv arvVar = new arv(null);
        arvVar.d(false);
        arvVar.c();
        return arvVar;
    }

    public final String b() {
        return this.f20595a;
    }

    public final boolean c() {
        return this.f20597c;
    }

    public final boolean d() {
        return this.f20596b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof arw) {
            arw arwVar = (arw) obj;
            if (this.f20595a.equals(arwVar.b()) && this.f20596b == arwVar.d() && this.f20597c == arwVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f20595a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f20596b ? 1237 : 1231)) * 1000003) ^ (true != this.f20597c ? 1237 : 1231);
    }

    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.f20595a + ", shouldGetAdvertisingId=" + this.f20596b + ", isGooglePlayServicesAvailable=" + this.f20597c + "}";
    }
}
