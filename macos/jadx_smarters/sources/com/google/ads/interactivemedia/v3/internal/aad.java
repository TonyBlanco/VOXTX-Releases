package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class aad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f18630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18632d;

    public aad(int i9, byte[] bArr, int i10, int i11) {
        this.f18629a = i9;
        this.f18630b = bArr;
        this.f18631c = i10;
        this.f18632d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aad.class == obj.getClass()) {
            aad aadVar = (aad) obj;
            if (this.f18629a == aadVar.f18629a && this.f18631c == aadVar.f18631c && this.f18632d == aadVar.f18632d && Arrays.equals(this.f18630b, aadVar.f18630b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f18629a * 31) + Arrays.hashCode(this.f18630b)) * 31) + this.f18631c) * 31) + this.f18632d;
    }
}
