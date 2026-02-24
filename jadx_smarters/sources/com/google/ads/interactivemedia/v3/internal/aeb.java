package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class aeb implements adr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f19278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private aae f19279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private aea f19280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f19281d;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f19288k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final bdy f19291n;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean[] f19282e = new boolean[3];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final aef f19283f = new aef(32);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final aef f19284g = new aef(33);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final aef f19285h = new aef(34);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final aef f19286i = new aef(39);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final aef f19287j = new aef(40);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f19289l = -9223372036854775807L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final cj f19290m = new cj();

    public aeb(bdy bdyVar, byte[] bArr, byte[] bArr2) {
        this.f19291n = bdyVar;
    }

    private final void f(byte[] bArr, int i9, int i10) {
        this.f19280c.b(bArr, i9, i10);
        if (!this.f19281d) {
            this.f19283f.a(bArr, i9, i10);
            this.f19284g.a(bArr, i9, i10);
            this.f19285h.a(bArr, i9, i10);
        }
        this.f19286i.a(bArr, i9, i10);
        this.f19287j.a(bArr, i9, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x0345  */
    @Override // com.google.ads.interactivemedia.v3.internal.adr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.ads.interactivemedia.v3.internal.cj r38) {
        /*
            Method dump skipped, instruction units count: 1008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.aeb.a(com.google.ads.interactivemedia.v3.internal.cj):void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void b(zk zkVar, aet aetVar) {
        aetVar.c();
        this.f19278a = aetVar.b();
        aae aaeVarI = zkVar.i(aetVar.a(), 2);
        this.f19279b = aaeVarI;
        this.f19280c = new aea(aaeVarI);
        this.f19291n.l(zkVar, aetVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void d(long j9, int i9) {
        if (j9 != -9223372036854775807L) {
            this.f19289l = j9;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void e() {
        this.f19288k = 0L;
        this.f19289l = -9223372036854775807L;
        zw.d(this.f19282e);
        this.f19283f.b();
        this.f19284g.b();
        this.f19285h.b();
        this.f19286i.b();
        this.f19287j.b();
        aea aeaVar = this.f19280c;
        if (aeaVar != null) {
            aeaVar.c();
        }
    }
}
