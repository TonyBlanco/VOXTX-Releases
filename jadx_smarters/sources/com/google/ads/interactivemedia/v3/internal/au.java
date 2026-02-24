package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class au {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final au f20738a = new au(1.0f, 1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f20739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f20740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f20741d;

    public au(float f9, float f10) {
        af.u(f9 > 0.0f);
        af.u(f10 > 0.0f);
        this.f20739b = f9;
        this.f20740c = f10;
        this.f20741d = Math.round(f9 * 1000.0f);
    }

    public final long a(long j9) {
        return j9 * ((long) this.f20741d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && au.class == obj.getClass()) {
            au auVar = (au) obj;
            if (this.f20739b == auVar.f20739b && this.f20740c == auVar.f20740c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f20739b) + 527) * 31) + Float.floatToRawIntBits(this.f20740c);
    }

    public final String toString() {
        return cq.H("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f20739b), Float.valueOf(this.f20740c));
    }
}
