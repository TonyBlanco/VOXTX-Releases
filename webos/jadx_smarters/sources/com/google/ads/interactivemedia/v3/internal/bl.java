package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bl f21636a = new bl(0, 0, 0, 1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f21640e;

    public bl(int i9, int i10, int i11, float f9) {
        this.f21637b = i9;
        this.f21638c = i10;
        this.f21639d = i11;
        this.f21640e = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bl) {
            bl blVar = (bl) obj;
            if (this.f21637b == blVar.f21637b && this.f21638c == blVar.f21638c && this.f21639d == blVar.f21639d && this.f21640e == blVar.f21640e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f21637b + 217) * 31) + this.f21638c) * 31) + this.f21639d) * 31) + Float.floatToRawIntBits(this.f21640e);
    }
}
