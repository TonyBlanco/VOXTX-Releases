package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class bjj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f21557a;

    private bjj(byte[] bArr, int i9) {
        byte[] bArr2 = new byte[i9];
        this.f21557a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i9);
    }

    public static bjj b(byte[] bArr) {
        if (bArr != null) {
            return new bjj(bArr, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final int a() {
        return this.f21557a.length;
    }

    public final byte[] c() {
        byte[] bArr = this.f21557a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bjj) {
            return Arrays.equals(((bjj) obj).f21557a, this.f21557a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f21557a);
    }

    public final String toString() {
        return "Bytes(" + bjh.g(this.f21557a) + ")";
    }
}
