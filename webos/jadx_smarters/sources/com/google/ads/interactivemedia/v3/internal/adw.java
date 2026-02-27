package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class adw implements adr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float[] f19204a = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cj f19205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean[] f19206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final adu f19207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final aef f19208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private adv f19209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f19210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f19211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private aae f19212i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f19213j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f19214k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final aeq f19215l;

    public adw() {
        this(null, null);
    }

    public adw(aeq aeqVar, byte[] bArr) {
        this.f19215l = aeqVar;
        this.f19206c = new boolean[4];
        this.f19207d = new adu();
        this.f19214k = -9223372036854775807L;
        this.f19208e = new aef(178);
        this.f19205b = new cj();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x017c  */
    @Override // com.google.ads.interactivemedia.v3.internal.adr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.ads.interactivemedia.v3.internal.cj r19) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.adw.a(com.google.ads.interactivemedia.v3.internal.cj):void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void b(zk zkVar, aet aetVar) {
        aetVar.c();
        this.f19211h = aetVar.b();
        aae aaeVarI = zkVar.i(aetVar.a(), 2);
        this.f19212i = aaeVarI;
        this.f19209f = new adv(aaeVarI);
        this.f19215l.b(zkVar, aetVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void d(long j9, int i9) {
        if (j9 != -9223372036854775807L) {
            this.f19214k = j9;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void e() {
        zw.d(this.f19206c);
        this.f19207d.b();
        adv advVar = this.f19209f;
        if (advVar != null) {
            advVar.d();
        }
        this.f19208e.b();
        this.f19210g = 0L;
        this.f19214k = -9223372036854775807L;
    }
}
