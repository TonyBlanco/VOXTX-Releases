package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class adt implements adr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double[] f19173a = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f19174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private aae f19175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final cj f19176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final aef f19177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean[] f19178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ads f19179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f19180h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f19181i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f19182j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f19183k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f19184l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f19185m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f19186n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f19187o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f19188p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final aeq f19189q;

    public adt() {
        this(null, null);
    }

    public adt(aeq aeqVar, byte[] bArr) {
        cj cjVar;
        this.f19189q = aeqVar;
        this.f19178f = new boolean[4];
        this.f19179g = new ads();
        if (aeqVar != null) {
            this.f19177e = new aef(178);
            cjVar = new cj();
        } else {
            cjVar = null;
            this.f19177e = null;
        }
        this.f19176d = cjVar;
        this.f19184l = -9223372036854775807L;
        this.f19186n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0182  */
    @Override // com.google.ads.interactivemedia.v3.internal.adr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.ads.interactivemedia.v3.internal.cj r27) {
        /*
            Method dump skipped, instruction units count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.adt.a(com.google.ads.interactivemedia.v3.internal.cj):void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void b(zk zkVar, aet aetVar) {
        aetVar.c();
        this.f19174b = aetVar.b();
        this.f19175c = zkVar.i(aetVar.a(), 2);
        aeq aeqVar = this.f19189q;
        if (aeqVar != null) {
            aeqVar.b(zkVar, aetVar);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void d(long j9, int i9) {
        this.f19184l = j9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void e() {
        zw.d(this.f19178f);
        this.f19179g.b();
        aef aefVar = this.f19177e;
        if (aefVar != null) {
            aefVar.b();
        }
        this.f19180h = 0L;
        this.f19181i = false;
        this.f19184l = -9223372036854775807L;
        this.f19186n = -9223372036854775807L;
    }
}
