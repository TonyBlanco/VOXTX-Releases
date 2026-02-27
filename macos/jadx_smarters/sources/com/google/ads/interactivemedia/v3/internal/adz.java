package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class adz implements adr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f19250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f19251b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f19255f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f19257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private aae f19258i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ady f19259j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f19260k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f19262m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final bdy f19264o;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean[] f19256g = new boolean[3];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final aef f19252c = new aef(7);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final aef f19253d = new aef(8);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final aef f19254e = new aef(6);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f19261l = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final cj f19263n = new cj();

    public adz(bdy bdyVar, boolean z9, boolean z10, byte[] bArr, byte[] bArr2) {
        this.f19264o = bdyVar;
        this.f19250a = z9;
        this.f19251b = z10;
    }

    private final void f(byte[] bArr, int i9, int i10) {
        if (!this.f19260k || this.f19259j.g()) {
            this.f19252c.a(bArr, i9, i10);
            this.f19253d.a(bArr, i9, i10);
        }
        this.f19254e.a(bArr, i9, i10);
        this.f19259j.a(bArr, i9, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    @Override // com.google.ads.interactivemedia.v3.internal.adr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.ads.interactivemedia.v3.internal.cj r21) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.adz.a(com.google.ads.interactivemedia.v3.internal.cj):void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void b(zk zkVar, aet aetVar) {
        aetVar.c();
        this.f19257h = aetVar.b();
        aae aaeVarI = zkVar.i(aetVar.a(), 2);
        this.f19258i = aaeVarI;
        this.f19259j = new ady(aaeVarI, this.f19250a, this.f19251b);
        this.f19264o.l(zkVar, aetVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void d(long j9, int i9) {
        if (j9 != -9223372036854775807L) {
            this.f19261l = j9;
        }
        this.f19262m |= (i9 & 2) != 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void e() {
        this.f19255f = 0L;
        this.f19262m = false;
        this.f19261l = -9223372036854775807L;
        zw.d(this.f19256g);
        this.f19252c.b();
        this.f19253d.b();
        this.f19254e.b();
        ady adyVar = this.f19259j;
        if (adyVar != null) {
            adyVar.d();
        }
    }
}
