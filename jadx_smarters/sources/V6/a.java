package V6;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D6.b f10102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f10103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f10104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10105d;

    public a(D6.b bVar) throws x6.g {
        int i9 = bVar.i();
        if (i9 < 21 || (i9 & 3) != 1) {
            throw x6.g.a();
        }
        this.f10102a = bVar;
    }

    public final int a(int i9, int i10, int i11) {
        return this.f10105d ? this.f10102a.f(i10, i9) : this.f10102a.f(i9, i10) ? (i11 << 1) | 1 : i11 << 1;
    }

    public void b() {
        int i9 = 0;
        while (i9 < this.f10102a.l()) {
            int i10 = i9 + 1;
            for (int i11 = i10; i11 < this.f10102a.i(); i11++) {
                if (this.f10102a.f(i9, i11) != this.f10102a.f(i11, i9)) {
                    this.f10102a.e(i11, i9);
                    this.f10102a.e(i9, i11);
                }
            }
            i9 = i10;
        }
    }

    public byte[] c() throws x6.g {
        g gVarD = d();
        j jVarE = e();
        c cVar = c.values()[gVarD.c()];
        int i9 = this.f10102a.i();
        cVar.unmaskBitMatrix(this.f10102a, i9);
        D6.b bVarA = jVarE.a();
        byte[] bArr = new byte[jVarE.h()];
        int i10 = i9 - 1;
        boolean z9 = true;
        int i11 = i10;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i11 > 0) {
            if (i11 == 6) {
                i11--;
            }
            for (int i15 = 0; i15 < i9; i15++) {
                int i16 = z9 ? i10 - i15 : i15;
                for (int i17 = 0; i17 < 2; i17++) {
                    int i18 = i11 - i17;
                    if (!bVarA.f(i18, i16)) {
                        i13++;
                        i14 <<= 1;
                        if (this.f10102a.f(i18, i16)) {
                            i14 |= 1;
                        }
                        if (i13 == 8) {
                            bArr[i12] = (byte) i14;
                            i12++;
                            i13 = 0;
                            i14 = 0;
                        }
                    }
                }
            }
            z9 = !z9;
            i11 -= 2;
        }
        if (i12 == jVarE.h()) {
            return bArr;
        }
        throw x6.g.a();
    }

    public g d() throws x6.g {
        g gVar = this.f10104c;
        if (gVar != null) {
            return gVar;
        }
        int iA = 0;
        int iA2 = 0;
        for (int i9 = 0; i9 < 6; i9++) {
            iA2 = a(i9, 8, iA2);
        }
        int iA3 = a(8, 7, a(8, 8, a(7, 8, iA2)));
        for (int i10 = 5; i10 >= 0; i10--) {
            iA3 = a(8, i10, iA3);
        }
        int i11 = this.f10102a.i();
        int i12 = i11 - 7;
        for (int i13 = i11 - 1; i13 >= i12; i13--) {
            iA = a(8, i13, iA);
        }
        for (int i14 = i11 - 8; i14 < i11; i14++) {
            iA = a(i14, 8, iA);
        }
        g gVarA = g.a(iA3, iA);
        this.f10104c = gVarA;
        if (gVarA != null) {
            return gVarA;
        }
        throw x6.g.a();
    }

    public j e() throws x6.g {
        j jVar = this.f10103b;
        if (jVar != null) {
            return jVar;
        }
        int i9 = this.f10102a.i();
        int i10 = (i9 - 17) / 4;
        if (i10 <= 6) {
            return j.i(i10);
        }
        int i11 = i9 - 11;
        int iA = 0;
        int iA2 = 0;
        for (int i12 = 5; i12 >= 0; i12--) {
            for (int i13 = i9 - 9; i13 >= i11; i13--) {
                iA2 = a(i13, i12, iA2);
            }
        }
        j jVarC = j.c(iA2);
        if (jVarC != null && jVarC.e() == i9) {
            this.f10103b = jVarC;
            return jVarC;
        }
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = i9 - 9; i15 >= i11; i15--) {
                iA = a(i14, i15, iA);
            }
        }
        j jVarC2 = j.c(iA);
        if (jVarC2 == null || jVarC2.e() != i9) {
            throw x6.g.a();
        }
        this.f10103b = jVarC2;
        return jVarC2;
    }

    public void f() {
        if (this.f10104c == null) {
            return;
        }
        c.values()[this.f10104c.c()].unmaskBitMatrix(this.f10102a, this.f10102a.i());
    }

    public void g(boolean z9) {
        this.f10103b = null;
        this.f10104c = null;
        this.f10105d = z9;
    }
}
