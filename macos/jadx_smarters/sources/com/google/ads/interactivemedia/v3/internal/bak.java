package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class bak implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f21001a;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        bak bakVar = (bak) obj;
        int length = this.f21001a.length;
        int length2 = bakVar.f21001a.length;
        if (length != length2) {
            return length - length2;
        }
        int i9 = 0;
        while (true) {
            byte[] bArr = this.f21001a;
            if (i9 >= bArr.length) {
                return 0;
            }
            byte b9 = bArr[i9];
            byte b10 = bakVar.f21001a[i9];
            if (b9 != b10) {
                return b9 - b10;
            }
            i9++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bak) {
            return Arrays.equals(this.f21001a, ((bak) obj).f21001a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f21001a);
    }

    public final String toString() {
        return bjh.g(this.f21001a);
    }
}
