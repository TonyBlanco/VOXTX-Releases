package com.google.ads.interactivemedia.v3.internal;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes3.dex */
final class ady {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final aae f19232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f19233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f19234c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final zx f19237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f19238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f19239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f19240i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f19241j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f19242k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f19243l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f19246o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f19247p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f19248q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f19249r;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseArray f19235d = new SparseArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseArray f19236e = new SparseArray();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private adx f19244m = new adx(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private adx f19245n = new adx(null);

    public ady(aae aaeVar, boolean z9, boolean z10) {
        this.f19232a = aaeVar;
        this.f19233b = z9;
        this.f19234c = z10;
        byte[] bArr = new byte[128];
        this.f19238g = bArr;
        this.f19237f = new zx(bArr, 0, 0);
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(byte[] r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ady.a(byte[], int, int):void");
    }

    public final void b(zu zuVar) {
        this.f19236e.append(zuVar.f25296a, zuVar);
    }

    public final void c(zv zvVar) {
        this.f19235d.append(zvVar.f25302d, zvVar);
    }

    public final void d() {
        this.f19242k = false;
        this.f19246o = false;
        this.f19245n.a();
    }

    public final void e(long j9, int i9, long j10) {
        this.f19240i = i9;
        this.f19243l = j10;
        this.f19241j = j9;
        if (!this.f19233b || i9 != 1) {
            if (!this.f19234c) {
                return;
            }
            if (i9 != 5 && i9 != 1 && i9 != 2) {
                return;
            }
        }
        adx adxVar = this.f19244m;
        this.f19244m = this.f19245n;
        this.f19245n = adxVar;
        adxVar.a();
        this.f19239h = 0;
        this.f19242k = true;
    }

    public final boolean f(long j9, int i9, boolean z9, boolean z10) {
        boolean z11 = false;
        if (this.f19240i == 9 || (this.f19234c && adx.d(this.f19245n, this.f19244m))) {
            if (z9 && this.f19246o) {
                long j10 = this.f19241j;
                int i10 = i9 + ((int) (j9 - j10));
                long j11 = this.f19248q;
                if (j11 != -9223372036854775807L) {
                    this.f19232a.f(j11, this.f19249r ? 1 : 0, (int) (j10 - this.f19247p), i10, null);
                }
            }
            this.f19247p = this.f19241j;
            this.f19248q = this.f19243l;
            this.f19249r = false;
            this.f19246o = true;
        }
        boolean zE = this.f19233b ? this.f19245n.e() : z10;
        boolean z12 = this.f19249r;
        int i11 = this.f19240i;
        if (i11 == 5 || (zE && i11 == 1)) {
            z11 = true;
        }
        boolean z13 = z12 | z11;
        this.f19249r = z13;
        return z13;
    }

    public final boolean g() {
        return this.f19234c;
    }
}
