package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class aeh implements aeu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final adr f19339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ci f19340b = new ci(new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19341c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private co f19343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f19345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f19346h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f19347i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f19348j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f19349k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f19350l;

    public aeh(adr adrVar) {
        this.f19339a = adrVar;
    }

    private final void d(int i9) {
        this.f19341c = i9;
        this.f19342d = 0;
    }

    private final boolean e(cj cjVar, byte[] bArr, int i9) {
        int iMin = Math.min(cjVar.a(), i9 - this.f19342d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            cjVar.G(iMin);
        } else {
            cjVar.A(bArr, this.f19342d, iMin);
        }
        int i10 = this.f19342d + iMin;
        this.f19342d = i10;
        return i10 == i9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aeu
    public final void a(cj cjVar, int i9) throws as {
        af.t(this.f19343e);
        int i10 = -1;
        int i11 = 2;
        if ((i9 & 1) != 0) {
            int i12 = this.f19341c;
            if (i12 != 0 && i12 != 1) {
                if (i12 != 2) {
                    int i13 = this.f19348j;
                    if (i13 != -1) {
                        cd.e("PesReader", "Unexpected start indicator: expected " + i13 + " more bytes");
                    }
                    this.f19339a.c();
                } else {
                    cd.e("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            d(1);
        }
        int i14 = i9;
        while (cjVar.a() > 0) {
            int i15 = this.f19341c;
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 != i11) {
                        int iA = cjVar.a();
                        int i16 = this.f19348j;
                        int i17 = i16 != i10 ? iA - i16 : 0;
                        if (i17 > 0) {
                            iA -= i17;
                            cjVar.E(cjVar.c() + iA);
                        }
                        this.f19339a.a(cjVar);
                        int i18 = this.f19348j;
                        if (i18 != i10) {
                            int i19 = i18 - iA;
                            this.f19348j = i19;
                            if (i19 == 0) {
                                this.f19339a.c();
                                d(1);
                            }
                        }
                    } else {
                        if (e(cjVar, this.f19340b.f22621a, Math.min(10, this.f19347i)) && e(cjVar, null, this.f19347i)) {
                            this.f19340b.g(0);
                            long jB = -9223372036854775807L;
                            this.f19350l = -9223372036854775807L;
                            if (this.f19344f) {
                                this.f19340b.i(4);
                                int iC = this.f19340b.c(3);
                                this.f19340b.i(1);
                                int iC2 = this.f19340b.c(15);
                                this.f19340b.i(1);
                                long jC = ((long) (iC2 << 15)) | (((long) iC) << 30) | ((long) this.f19340b.c(15));
                                this.f19340b.i(1);
                                if (!this.f19346h && this.f19345g) {
                                    this.f19340b.i(4);
                                    int iC3 = this.f19340b.c(3);
                                    this.f19340b.i(1);
                                    int iC4 = this.f19340b.c(15);
                                    this.f19340b.i(1);
                                    int iC5 = this.f19340b.c(15);
                                    this.f19340b.i(1);
                                    this.f19343e.b((((long) iC3) << 30) | ((long) (iC4 << 15)) | ((long) iC5));
                                    this.f19346h = true;
                                }
                                jB = this.f19343e.b(jC);
                                this.f19350l = jB;
                            }
                            i14 |= true != this.f19349k ? 0 : 4;
                            this.f19339a.d(jB, i14);
                            d(3);
                            i10 = -1;
                        }
                    }
                } else if (e(cjVar, this.f19340b.f22621a, 9)) {
                    int i20 = 0;
                    this.f19340b.g(0);
                    int iC6 = this.f19340b.c(24);
                    if (iC6 != 1) {
                        cd.e("PesReader", "Unexpected start code prefix: " + iC6);
                        i10 = -1;
                        this.f19348j = -1;
                    } else {
                        this.f19340b.i(8);
                        int iC7 = this.f19340b.c(16);
                        this.f19340b.i(5);
                        this.f19349k = this.f19340b.k();
                        this.f19340b.i(2);
                        this.f19344f = this.f19340b.k();
                        this.f19345g = this.f19340b.k();
                        this.f19340b.i(6);
                        int iC8 = this.f19340b.c(8);
                        this.f19347i = iC8;
                        if (iC7 == 0) {
                            this.f19348j = -1;
                        } else {
                            int i21 = (iC7 - 3) - iC8;
                            this.f19348j = i21;
                            if (i21 < 0) {
                                cd.e("PesReader", "Found negative packet payload size: " + i21);
                                i10 = -1;
                                this.f19348j = -1;
                            }
                            i20 = 2;
                        }
                        i10 = -1;
                        i20 = 2;
                    }
                    d(i20);
                } else {
                    i10 = -1;
                }
            } else {
                cjVar.G(cjVar.a());
            }
            i11 = 2;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aeu
    public final void b(co coVar, zk zkVar, aet aetVar) {
        this.f19343e = coVar;
        this.f19339a.b(zkVar, aetVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aeu
    public final void c() {
        this.f19341c = 0;
        this.f19342d = 0;
        this.f19346h = false;
        this.f19339a.e();
    }
}
