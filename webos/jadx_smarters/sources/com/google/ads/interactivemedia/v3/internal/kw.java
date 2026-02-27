package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class kw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f23575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f23580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f23581g;

    private kw(int i9, int i10, int[] iArr, int i11, int i12, int i13, int i14) {
        this.f23576b = i9;
        this.f23575a = iArr;
        this.f23577c = i10;
        this.f23579e = i11;
        this.f23580f = i12;
        this.f23581g = i13;
        this.f23578d = i14;
    }

    public static kw a(int[] iArr, int i9) {
        return new kw(3, 1, iArr, i9, -1, -1, -1);
    }

    public static kw b(int[] iArr, int i9) {
        return new kw(5, 1, iArr, i9, -1, -1, -1);
    }

    public static kw c(int i9) {
        return new kw(5, 2, new int[0], -1, -1, -1, i9);
    }

    public static kw d(int i9, int[] iArr, int i10, int i11, int i12) {
        return new kw(i9, 0, iArr, i10, i11, i12, -1);
    }
}
