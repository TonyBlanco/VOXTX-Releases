package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class mb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f23771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23772d;

    public mb(String str, long j9, long j10) {
        this.f23771c = str == null ? "" : str;
        this.f23769a = j9;
        this.f23770b = j10;
    }

    public final Uri a(String str) {
        return af.l(str, this.f23771c);
    }

    public final mb b(mb mbVar, String str) {
        String strC = c(str);
        if (mbVar != null && strC.equals(mbVar.c(str))) {
            long j9 = this.f23770b;
            if (j9 != -1) {
                long j10 = this.f23769a;
                if (j10 + j9 == mbVar.f23769a) {
                    long j11 = mbVar.f23770b;
                    return new mb(strC, j10, j11 == -1 ? -1L : j9 + j11);
                }
            }
            long j12 = mbVar.f23770b;
            if (j12 != -1) {
                long j13 = mbVar.f23769a;
                if (j13 + j12 == this.f23769a) {
                    return new mb(strC, j13, j9 == -1 ? -1L : j12 + j9);
                }
            }
        }
        return null;
    }

    public final String c(String str) {
        return af.m(str, this.f23771c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mb.class == obj.getClass()) {
            mb mbVar = (mb) obj;
            if (this.f23769a == mbVar.f23769a && this.f23770b == mbVar.f23770b && this.f23771c.equals(mbVar.f23771c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = this.f23772d;
        if (i9 != 0) {
            return i9;
        }
        int iHashCode = ((((((int) this.f23769a) + 527) * 31) + ((int) this.f23770b)) * 31) + this.f23771c.hashCode();
        this.f23772d = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return "RangedUri(referenceUri=" + this.f23771c + ", start=" + this.f23769a + ", length=" + this.f23770b + ")";
    }
}
