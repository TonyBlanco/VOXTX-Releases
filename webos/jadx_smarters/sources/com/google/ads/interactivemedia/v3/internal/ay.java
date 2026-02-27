package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ai f20922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f20923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f20925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f20926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f20927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f20928i;

    public ay(Object obj, int i9, ai aiVar, Object obj2, int i10, long j9, long j10, int i11, int i12) {
        this.f20920a = obj;
        this.f20921b = i9;
        this.f20922c = aiVar;
        this.f20923d = obj2;
        this.f20924e = i10;
        this.f20925f = j9;
        this.f20926g = j10;
        this.f20927h = i11;
        this.f20928i = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ay.class == obj.getClass()) {
            ay ayVar = (ay) obj;
            if (this.f20921b == ayVar.f20921b && this.f20924e == ayVar.f20924e && this.f20925f == ayVar.f20925f && this.f20926g == ayVar.f20926g && this.f20927h == ayVar.f20927h && this.f20928i == ayVar.f20928i && com.google.ads.interactivemedia.v3.impl.data.k.c(this.f20920a, ayVar.f20920a) && com.google.ads.interactivemedia.v3.impl.data.k.c(this.f20923d, ayVar.f20923d) && com.google.ads.interactivemedia.v3.impl.data.k.c(this.f20922c, ayVar.f20922c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20920a, Integer.valueOf(this.f20921b), this.f20922c, this.f20923d, Integer.valueOf(this.f20924e), Long.valueOf(this.f20925f), Long.valueOf(this.f20926g), Integer.valueOf(this.f20927h), Integer.valueOf(this.f20928i)});
    }
}
