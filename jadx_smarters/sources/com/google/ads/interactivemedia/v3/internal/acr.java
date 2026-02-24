package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class acr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aae f18944a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ade f18947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public acn f18948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18951h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18952i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f18955l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final add f18945b = new add();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cj f18946c = new cj();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final cj f18953j = new cj(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final cj f18954k = new cj();

    public acr(aae aaeVar, ade adeVar, acn acnVar) {
        this.f18944a = aaeVar;
        this.f18947d = adeVar;
        this.f18948e = acnVar;
        g(adeVar, acnVar);
    }

    public final int a() {
        int i9 = !this.f18955l ? this.f18947d.f19075g[this.f18949f] : this.f18945b.f19061j[this.f18949f] ? 1 : 0;
        return f() != null ? i9 | 1073741824 : i9;
    }

    public final int b() {
        return !this.f18955l ? this.f18947d.f19072d[this.f18949f] : this.f18945b.f19059h[this.f18949f];
    }

    public final int c(int i9, int i10) {
        cj cjVar;
        adc adcVarF = f();
        if (adcVarF == null) {
            return 0;
        }
        int i11 = adcVarF.f19050d;
        if (i11 != 0) {
            cjVar = this.f18945b.f19065n;
        } else {
            byte[] bArr = (byte[]) cq.G(adcVarF.f19051e);
            cj cjVar2 = this.f18954k;
            int length = bArr.length;
            cjVar2.D(bArr, length);
            cjVar = this.f18954k;
            i11 = length;
        }
        boolean zC = this.f18945b.c(this.f18949f);
        boolean z9 = zC || i10 != 0;
        cj cjVar3 = this.f18953j;
        cjVar3.H()[0] = (byte) ((true != z9 ? 0 : 128) | i11);
        cjVar3.F(0);
        this.f18944a.i(this.f18953j, 1);
        this.f18944a.i(cjVar, i11);
        if (!z9) {
            return i11 + 1;
        }
        if (!zC) {
            this.f18946c.B(8);
            cj cjVar4 = this.f18946c;
            byte[] bArrH = cjVar4.H();
            bArrH[0] = 0;
            bArrH[1] = 1;
            bArrH[2] = 0;
            bArrH[3] = (byte) i10;
            bArrH[4] = (byte) ((i9 >> 24) & 255);
            bArrH[5] = (byte) ((i9 >> 16) & 255);
            bArrH[6] = (byte) ((i9 >> 8) & 255);
            bArrH[7] = (byte) (i9 & 255);
            this.f18944a.i(cjVar4, 8);
            return i11 + 9;
        }
        cj cjVar5 = this.f18945b.f19065n;
        int iM = cjVar5.m();
        cjVar5.G(-2);
        int i12 = (iM * 6) + 2;
        if (i10 != 0) {
            this.f18946c.B(i12);
            byte[] bArrH2 = this.f18946c.H();
            cjVar5.A(bArrH2, 0, i12);
            int i13 = (((bArrH2[2] & 255) << 8) | (bArrH2[3] & 255)) + i10;
            bArrH2[2] = (byte) ((i13 >> 8) & 255);
            bArrH2[3] = (byte) (i13 & 255);
            cjVar5 = this.f18946c;
        }
        this.f18944a.i(cjVar5, i12);
        return i11 + 1 + i12;
    }

    public final long d() {
        return !this.f18955l ? this.f18947d.f19071c[this.f18949f] : this.f18945b.f19057f[this.f18951h];
    }

    public final long e() {
        return !this.f18955l ? this.f18947d.f19074f[this.f18949f] : this.f18945b.a(this.f18949f);
    }

    public final adc f() {
        if (!this.f18955l) {
            return null;
        }
        add addVar = this.f18945b;
        acn acnVar = addVar.f19052a;
        int i9 = cq.f22640a;
        int i10 = acnVar.f18930a;
        adc adcVarA = addVar.f19064m;
        if (adcVarA == null) {
            adcVarA = this.f18947d.f19069a.a(i10);
        }
        if (adcVarA == null || !adcVarA.f19047a) {
            return null;
        }
        return adcVarA;
    }

    public final void g(ade adeVar, acn acnVar) {
        this.f18947d = adeVar;
        this.f18948e = acnVar;
        this.f18944a.b(adeVar.f19069a.f19041f);
        h();
    }

    public final void h() {
        add addVar = this.f18945b;
        addVar.f19055d = 0;
        addVar.f19067p = 0L;
        addVar.f19068q = false;
        addVar.f19062k = false;
        addVar.f19066o = false;
        addVar.f19064m = null;
        this.f18949f = 0;
        this.f18951h = 0;
        this.f18950g = 0;
        this.f18952i = 0;
        this.f18955l = false;
    }

    public final boolean j() {
        this.f18949f++;
        if (!this.f18955l) {
            return false;
        }
        int i9 = this.f18950g + 1;
        this.f18950g = i9;
        int[] iArr = this.f18945b.f19058g;
        int i10 = this.f18951h;
        if (i9 != iArr[i10]) {
            return true;
        }
        this.f18951h = i10 + 1;
        this.f18950g = 0;
        return false;
    }
}
