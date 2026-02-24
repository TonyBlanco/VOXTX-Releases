package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.ads.interactivemedia.v3.internal.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1307j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f23336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23337e;

    public C1307j(int i9, int i10, int i11, byte[] bArr) {
        this.f23333a = i9;
        this.f23334b = i10;
        this.f23335c = i11;
        this.f23336d = bArr;
    }

    public static int a(int i9) {
        if (i9 == 1) {
            return 1;
        }
        if (i9 != 9) {
            return (i9 == 4 || i9 == 5 || i9 == 6 || i9 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int b(int i9) {
        if (i9 == 1) {
            return 3;
        }
        if (i9 == 16) {
            return 6;
        }
        if (i9 != 18) {
            return (i9 == 6 || i9 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1307j.class == obj.getClass()) {
            C1307j c1307j = (C1307j) obj;
            if (this.f23333a == c1307j.f23333a && this.f23334b == c1307j.f23334b && this.f23335c == c1307j.f23335c && Arrays.equals(this.f23336d, c1307j.f23336d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = this.f23337e;
        if (i9 != 0) {
            return i9;
        }
        int iHashCode = ((((((this.f23333a + 527) * 31) + this.f23334b) * 31) + this.f23335c) * 31) + Arrays.hashCode(this.f23336d);
        this.f23337e = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return "ColorInfo(" + this.f23333a + ", " + this.f23334b + ", " + this.f23335c + ", " + (this.f23336d != null) + ")";
    }
}
