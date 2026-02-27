package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class hv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final be f23194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final te f23196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f23197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final be f23198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f23199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final te f23200h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f23201i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f23202j;

    public hv(long j9, be beVar, int i9, te teVar, long j10, be beVar2, int i10, te teVar2, long j11, long j12) {
        this.f23193a = j9;
        this.f23194b = beVar;
        this.f23195c = i9;
        this.f23196d = teVar;
        this.f23197e = j10;
        this.f23198f = beVar2;
        this.f23199g = i10;
        this.f23200h = teVar2;
        this.f23201i = j11;
        this.f23202j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hv.class == obj.getClass()) {
            hv hvVar = (hv) obj;
            if (this.f23193a == hvVar.f23193a && this.f23195c == hvVar.f23195c && this.f23197e == hvVar.f23197e && this.f23199g == hvVar.f23199g && this.f23201i == hvVar.f23201i && this.f23202j == hvVar.f23202j && com.google.ads.interactivemedia.v3.impl.data.k.c(this.f23194b, hvVar.f23194b) && com.google.ads.interactivemedia.v3.impl.data.k.c(this.f23196d, hvVar.f23196d) && com.google.ads.interactivemedia.v3.impl.data.k.c(this.f23198f, hvVar.f23198f) && com.google.ads.interactivemedia.v3.impl.data.k.c(this.f23200h, hvVar.f23200h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f23193a), this.f23194b, Integer.valueOf(this.f23195c), this.f23196d, Long.valueOf(this.f23197e), this.f23198f, Integer.valueOf(this.f23199g), this.f23200h, Long.valueOf(this.f23201i), Long.valueOf(this.f23202j)});
    }
}
