package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f18884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f18885e;

    public /* synthetic */ ac(ab abVar) {
        long j9 = abVar.f18706a;
        long j10 = abVar.f18707b;
        long j11 = abVar.f18708c;
        float f9 = abVar.f18709d;
        float f10 = abVar.f18710e;
        this.f18881a = j9;
        this.f18882b = j10;
        this.f18883c = j11;
        this.f18884d = f9;
        this.f18885e = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return this.f18881a == acVar.f18881a && this.f18882b == acVar.f18882b && this.f18883c == acVar.f18883c && this.f18884d == acVar.f18884d && this.f18885e == acVar.f18885e;
    }

    public final int hashCode() {
        long j9 = this.f18881a;
        long j10 = this.f18882b;
        long j11 = this.f18883c;
        int i9 = ((((((int) (j9 ^ (j9 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31;
        float f9 = this.f18884d;
        int iFloatToIntBits = (i9 + (f9 != 0.0f ? Float.floatToIntBits(f9) : 0)) * 31;
        float f10 = this.f18885e;
        return iFloatToIntBits + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0);
    }
}
