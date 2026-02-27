package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class lt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23724d;

    public lt(String str, String str2, int i9, int i10) {
        this.f23721a = str;
        this.f23722b = str2;
        this.f23723c = i9;
        this.f23724d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt)) {
            return false;
        }
        lt ltVar = (lt) obj;
        return this.f23723c == ltVar.f23723c && this.f23724d == ltVar.f23724d && com.google.ads.interactivemedia.v3.impl.data.k.c(this.f23721a, ltVar.f23721a) && com.google.ads.interactivemedia.v3.impl.data.k.c(this.f23722b, ltVar.f23722b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23721a, this.f23722b, Integer.valueOf(this.f23723c), Integer.valueOf(this.f23724d)});
    }
}
