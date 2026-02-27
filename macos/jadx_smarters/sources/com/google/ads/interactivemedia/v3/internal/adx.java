package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class adx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f19216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f19217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private zv f19218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f19223h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f19224i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f19225j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f19226k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f19227l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f19228m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f19229n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f19230o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f19231p;

    private adx() {
    }

    public /* synthetic */ adx(byte[] bArr) {
    }

    public static /* bridge */ /* synthetic */ boolean d(adx adxVar, adx adxVar2) {
        int i9;
        int i10;
        int i11;
        boolean z9;
        if (!adxVar.f19216a) {
            return false;
        }
        if (!adxVar2.f19216a) {
            return true;
        }
        zv zvVar = adxVar.f19218c;
        af.t(zvVar);
        zv zvVar2 = adxVar2.f19218c;
        af.t(zvVar2);
        return (adxVar.f19221f == adxVar2.f19221f && adxVar.f19222g == adxVar2.f19222g && adxVar.f19223h == adxVar2.f19223h && (!adxVar.f19224i || !adxVar2.f19224i || adxVar.f19225j == adxVar2.f19225j) && (((i9 = adxVar.f19219d) == (i10 = adxVar2.f19219d) || (i9 != 0 && i10 != 0)) && ((i11 = zvVar.f25309k) != 0 ? !(i11 == 1 && zvVar2.f25309k == 1 && (adxVar.f19230o != adxVar2.f19230o || adxVar.f19231p != adxVar2.f19231p)) : zvVar2.f25309k != 0 || (adxVar.f19228m == adxVar2.f19228m && adxVar.f19229n == adxVar2.f19229n)) && (z9 = adxVar.f19226k) == adxVar2.f19226k && (!z9 || adxVar.f19227l == adxVar2.f19227l))) ? false : true;
    }

    public final void a() {
        this.f19217b = false;
        this.f19216a = false;
    }

    public final void b(zv zvVar, int i9, int i10, int i11, int i12, boolean z9, boolean z10, boolean z11, boolean z12, int i13, int i14, int i15, int i16, int i17) {
        this.f19218c = zvVar;
        this.f19219d = i9;
        this.f19220e = i10;
        this.f19221f = i11;
        this.f19222g = i12;
        this.f19223h = z9;
        this.f19224i = z10;
        this.f19225j = z11;
        this.f19226k = z12;
        this.f19227l = i13;
        this.f19228m = i14;
        this.f19229n = i15;
        this.f19230o = i16;
        this.f19231p = i17;
        this.f19216a = true;
        this.f19217b = true;
    }

    public final void c(int i9) {
        this.f19220e = i9;
        this.f19217b = true;
    }

    public final boolean e() {
        if (!this.f19217b) {
            return false;
        }
        int i9 = this.f19220e;
        return i9 == 7 || i9 == 2;
    }
}
