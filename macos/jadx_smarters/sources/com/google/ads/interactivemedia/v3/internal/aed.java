package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class aed implements adr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cj f19299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ci f19300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private aae f19301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f19302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C1333s f19303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f19305h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f19306i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f19307j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f19308k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f19309l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f19310m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f19311n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f19312o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f19313p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f19314q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f19315r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f19316s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f19317t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f19318u;

    public aed(String str) {
        this.f19298a = str;
        cj cjVar = new cj(1024);
        this.f19299b = cjVar;
        this.f19300c = new ci(cjVar.H());
        this.f19308k = -9223372036854775807L;
    }

    private final int f(ci ciVar) throws as {
        int iA = ciVar.a();
        yl ylVarB = ym.b(ciVar, true);
        this.f19318u = ylVarB.f25175c;
        this.f19315r = ylVarB.f25173a;
        this.f19317t = ylVarB.f25174b;
        return iA - ciVar.a();
    }

    private static long g(ci ciVar) {
        return ciVar.c((ciVar.c(2) + 1) * 8);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void a(cj cjVar) throws as {
        int i9;
        int i10;
        int iC;
        boolean zK;
        af.t(this.f19301d);
        while (cjVar.a() > 0) {
            int i11 = this.f19304g;
            if (i11 != 0) {
                if (i11 == 1) {
                    int i12 = cjVar.i();
                    if ((i12 & 224) == 224) {
                        this.f19307j = i12;
                        this.f19304g = 2;
                    } else if (i12 != 86) {
                        this.f19304g = 0;
                    }
                } else if (i11 != 2) {
                    int iMin = Math.min(cjVar.a(), this.f19306i - this.f19305h);
                    cjVar.A(this.f19300c.f22621a, this.f19305h, iMin);
                    int i13 = this.f19305h + iMin;
                    this.f19305h = i13;
                    if (i13 == this.f19306i) {
                        this.f19300c.g(0);
                        ci ciVar = this.f19300c;
                        if (ciVar.k()) {
                            if (this.f19309l) {
                            }
                            this.f19304g = 0;
                        } else {
                            this.f19309l = true;
                            int iC2 = ciVar.c(1);
                            if (iC2 == 1) {
                                iC = ciVar.c(1);
                                i10 = 1;
                            } else {
                                i10 = iC2;
                                iC = 0;
                            }
                            this.f19310m = iC;
                            if (iC != 0) {
                                throw as.a(null, null);
                            }
                            if (i10 == 1) {
                                g(ciVar);
                            }
                            if (!ciVar.k()) {
                                throw as.a(null, null);
                            }
                            this.f19311n = ciVar.c(6);
                            int iC3 = ciVar.c(4);
                            int iC4 = ciVar.c(3);
                            if (iC3 != 0 || iC4 != 0) {
                                throw as.a(null, null);
                            }
                            if (i10 == 0) {
                                int iB = ciVar.b();
                                int iF = f(ciVar);
                                ciVar.g(iB);
                                byte[] bArr = new byte[(iF + 7) / 8];
                                ciVar.m(bArr, iF);
                                r rVar = new r();
                                rVar.S(this.f19302e);
                                rVar.ae("audio/mp4a-latm");
                                rVar.I(this.f19318u);
                                rVar.H(this.f19317t);
                                rVar.af(this.f19315r);
                                rVar.T(Collections.singletonList(bArr));
                                rVar.V(this.f19298a);
                                C1333s c1333sV = rVar.v();
                                if (!c1333sV.equals(this.f19303f)) {
                                    this.f19303f = c1333sV;
                                    this.f19316s = 1024000000 / ((long) c1333sV.f24481z);
                                    this.f19301d.b(c1333sV);
                                }
                            } else {
                                ciVar.i(((int) g(ciVar)) - f(ciVar));
                            }
                            int iC5 = ciVar.c(3);
                            this.f19312o = iC5;
                            if (iC5 == 0) {
                                ciVar.i(8);
                            } else if (iC5 == 1) {
                                ciVar.i(9);
                            } else if (iC5 == 3 || iC5 == 4 || iC5 == 5) {
                                ciVar.i(6);
                            } else {
                                if (iC5 != 6 && iC5 != 7) {
                                    throw new IllegalStateException();
                                }
                                ciVar.i(1);
                            }
                            boolean zK2 = ciVar.k();
                            this.f19313p = zK2;
                            this.f19314q = 0L;
                            if (zK2) {
                                if (i10 != 1) {
                                    do {
                                        zK = ciVar.k();
                                        this.f19314q = (this.f19314q << 8) + ((long) ciVar.c(8));
                                    } while (zK);
                                } else {
                                    this.f19314q = g(ciVar);
                                }
                            }
                            if (ciVar.k()) {
                                ciVar.i(8);
                            }
                        }
                        if (this.f19310m != 0) {
                            throw as.a(null, null);
                        }
                        if (this.f19311n != 0) {
                            throw as.a(null, null);
                        }
                        if (this.f19312o != 0) {
                            throw as.a(null, null);
                        }
                        int i14 = 0;
                        while (true) {
                            int iC6 = ciVar.c(8);
                            i9 = i14 + iC6;
                            if (iC6 != 255) {
                                break;
                            } else {
                                i14 = i9;
                            }
                        }
                        int iB2 = ciVar.b();
                        if ((iB2 & 7) == 0) {
                            this.f19299b.F(iB2 >> 3);
                        } else {
                            ciVar.m(this.f19299b.H(), i9 * 8);
                            this.f19299b.F(0);
                        }
                        this.f19301d.e(this.f19299b, i9);
                        long j9 = this.f19308k;
                        if (j9 != -9223372036854775807L) {
                            this.f19301d.f(j9, 1, i9, 0, null);
                            this.f19308k += this.f19316s;
                        }
                        if (this.f19313p) {
                            ciVar.i((int) this.f19314q);
                        }
                        this.f19304g = 0;
                    } else {
                        continue;
                    }
                } else {
                    int i15 = ((this.f19307j & (-225)) << 8) | cjVar.i();
                    this.f19306i = i15;
                    cj cjVar2 = this.f19299b;
                    if (i15 > cjVar2.H().length) {
                        cjVar2.B(i15);
                        this.f19300c.e(this.f19299b.H());
                    }
                    this.f19305h = 0;
                    this.f19304g = 3;
                }
            } else if (cjVar.i() == 86) {
                this.f19304g = 1;
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void b(zk zkVar, aet aetVar) {
        aetVar.c();
        this.f19301d = zkVar.i(aetVar.a(), 1);
        this.f19302e = aetVar.b();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void d(long j9, int i9) {
        if (j9 != -9223372036854775807L) {
            this.f19308k = j9;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void e() {
        this.f19304g = 0;
        this.f19308k = -9223372036854775807L;
        this.f19309l = false;
    }
}
