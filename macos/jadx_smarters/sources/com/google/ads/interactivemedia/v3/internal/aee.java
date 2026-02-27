package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class aee implements adr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cj f19319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zr f19320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f19321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private aae f19322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f19323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f19326h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f19327i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f19328j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f19329k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f19330l;

    public aee() {
        this(null);
    }

    public aee(String str) {
        this.f19324f = 0;
        cj cjVar = new cj(4);
        this.f19319a = cjVar;
        cjVar.H()[0] = -1;
        this.f19320b = new zr();
        this.f19330l = -9223372036854775807L;
        this.f19321c = str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void a(cj cjVar) {
        af.t(this.f19322d);
        while (cjVar.a() > 0) {
            int i9 = this.f19324f;
            if (i9 == 0) {
                byte[] bArrH = cjVar.H();
                int iD = cjVar.d();
                for (int iC = cjVar.c(); iC < iD; iC++) {
                    byte b9 = bArrH[iC];
                    boolean z9 = (b9 & 255) == 255;
                    boolean z10 = this.f19327i && (b9 & 224) == 224;
                    this.f19327i = z9;
                    if (z10) {
                        cjVar.F(iC + 1);
                        this.f19327i = false;
                        this.f19319a.H()[1] = bArrH[iC];
                        this.f19325g = 2;
                        this.f19324f = 1;
                        break;
                        break;
                    }
                }
                cjVar.F(iD);
            } else if (i9 != 1) {
                int iMin = Math.min(cjVar.a(), this.f19329k - this.f19325g);
                this.f19322d.e(cjVar, iMin);
                int i10 = this.f19325g + iMin;
                this.f19325g = i10;
                int i11 = this.f19329k;
                if (i10 >= i11) {
                    long j9 = this.f19330l;
                    if (j9 != -9223372036854775807L) {
                        this.f19322d.f(j9, 1, i11, 0, null);
                        this.f19330l += this.f19328j;
                    }
                    this.f19325g = 0;
                    this.f19324f = 0;
                }
            } else {
                int iMin2 = Math.min(cjVar.a(), 4 - this.f19325g);
                cjVar.A(this.f19319a.H(), this.f19325g, iMin2);
                int i12 = this.f19325g + iMin2;
                this.f19325g = i12;
                if (i12 >= 4) {
                    this.f19319a.F(0);
                    if (!this.f19320b.a(this.f19319a.e())) {
                        this.f19325g = 0;
                        this.f19324f = 1;
                        break;
                    }
                    zr zrVar = this.f19320b;
                    this.f19329k = zrVar.f25275c;
                    if (!this.f19326h) {
                        this.f19328j = (((long) zrVar.f25279g) * 1000000) / ((long) zrVar.f25276d);
                        r rVar = new r();
                        rVar.S(this.f19323e);
                        rVar.ae(this.f19320b.f25274b);
                        rVar.W(4096);
                        rVar.H(this.f19320b.f25277e);
                        rVar.af(this.f19320b.f25276d);
                        rVar.V(this.f19321c);
                        this.f19322d.b(rVar.v());
                        this.f19326h = true;
                    }
                    this.f19319a.F(0);
                    this.f19322d.e(this.f19319a, 4);
                    this.f19324f = 2;
                }
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void b(zk zkVar, aet aetVar) {
        aetVar.c();
        this.f19323e = aetVar.b();
        this.f19322d = zkVar.i(aetVar.a(), 1);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void d(long j9, int i9) {
        if (j9 != -9223372036854775807L) {
            this.f19330l = j9;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void e() {
        this.f19324f = 0;
        this.f19325g = 0;
        this.f19327i = false;
        this.f19330l = -9223372036854775807L;
    }
}
