package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class adb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f19038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f19039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f19040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1333s f19041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f19042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long[] f19043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long[] f19044i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f19045j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final adc[] f19046k;

    public adb(int i9, int i10, long j9, long j10, long j11, C1333s c1333s, int i11, adc[] adcVarArr, int i12, long[] jArr, long[] jArr2) {
        this.f19036a = i9;
        this.f19037b = i10;
        this.f19038c = j9;
        this.f19039d = j10;
        this.f19040e = j11;
        this.f19041f = c1333s;
        this.f19042g = i11;
        this.f19046k = adcVarArr;
        this.f19045j = i12;
        this.f19043h = jArr;
        this.f19044i = jArr2;
    }

    public final adc a(int i9) {
        adc[] adcVarArr = this.f19046k;
        if (adcVarArr == null) {
            return null;
        }
        return adcVarArr[i9];
    }
}
