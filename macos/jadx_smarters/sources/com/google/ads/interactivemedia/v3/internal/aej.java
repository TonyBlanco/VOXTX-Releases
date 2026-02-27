package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class aej implements aeu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final aei f19351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cj f19352b = new cj(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19356f;

    public aej(aei aeiVar) {
        this.f19351a = aeiVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aeu
    public final void a(cj cjVar, int i9) {
        int i10 = i9 & 1;
        int iC = i10 != 0 ? cjVar.c() + cjVar.i() : -1;
        if (this.f19356f) {
            if (i10 == 0) {
                return;
            }
            this.f19356f = false;
            cjVar.F(iC);
            this.f19354d = 0;
        }
        while (cjVar.a() > 0) {
            int i11 = this.f19354d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int i12 = cjVar.i();
                    cjVar.F(cjVar.c() - 1);
                    if (i12 == 255) {
                        this.f19356f = true;
                        return;
                    }
                }
                int iMin = Math.min(cjVar.a(), 3 - this.f19354d);
                cjVar.A(this.f19352b.H(), this.f19354d, iMin);
                int i13 = this.f19354d + iMin;
                this.f19354d = i13;
                if (i13 == 3) {
                    this.f19352b.F(0);
                    this.f19352b.E(3);
                    this.f19352b.G(1);
                    int i14 = this.f19352b.i();
                    int i15 = this.f19352b.i();
                    this.f19355e = (i14 & 128) != 0;
                    this.f19353c = (((i14 & 15) << 8) | i15) + 3;
                    int iB = this.f19352b.b();
                    int i16 = this.f19353c;
                    if (iB < i16) {
                        int iB2 = this.f19352b.b();
                        this.f19352b.y(Math.min(4098, Math.max(i16, iB2 + iB2)));
                    }
                }
            } else {
                int iMin2 = Math.min(cjVar.a(), this.f19353c - i11);
                cjVar.A(this.f19352b.H(), this.f19354d, iMin2);
                int i17 = this.f19354d + iMin2;
                this.f19354d = i17;
                int i18 = this.f19353c;
                if (i17 != i18) {
                    continue;
                } else {
                    if (!this.f19355e) {
                        this.f19352b.E(i18);
                    } else {
                        if (cq.ar(this.f19352b.H(), i18) != 0) {
                            this.f19356f = true;
                            return;
                        }
                        this.f19352b.E(this.f19353c - 4);
                    }
                    this.f19352b.F(0);
                    this.f19351a.a(this.f19352b);
                    this.f19354d = 0;
                }
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aeu
    public final void b(co coVar, zk zkVar, aet aetVar) {
        this.f19351a.b(coVar, zkVar, aetVar);
        this.f19356f = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aeu
    public final void c() {
        this.f19356f = true;
    }
}
