package A6;

import D6.b;
import D6.i;
import F6.c;
import F6.e;
import org.apache.http.message.TokenParser;
import x6.k;
import x6.q;
import y6.C2990a;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f150g = {3808, 476, 2107, 1799};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f156f;

    /* JADX INFO: renamed from: A6.a$a, reason: collision with other inner class name */
    public static final class C0003a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f158b;

        public C0003a(int i9, int i10) {
            this.f157a = i9;
            this.f158b = i10;
        }

        public int a() {
            return this.f157a;
        }

        public int b() {
            return this.f158b;
        }

        public q c() {
            return new q(this.f157a, this.f158b);
        }

        public String toString() {
            return "<" + this.f157a + TokenParser.SP + this.f158b + '>';
        }
    }

    public a(b bVar) {
        this.f151a = bVar;
    }

    public static float b(C0003a c0003a, C0003a c0003a2) {
        return E6.a.b(c0003a.a(), c0003a.b(), c0003a2.a(), c0003a2.b());
    }

    public static float c(q qVar, q qVar2) {
        return E6.a.a(qVar.c(), qVar.d(), qVar2.c(), qVar2.d());
    }

    public static q[] d(q[] qVarArr, int i9, int i10) {
        float f9 = i10 / (i9 * 2.0f);
        float fC = qVarArr[0].c() - qVarArr[2].c();
        float fD = qVarArr[0].d() - qVarArr[2].d();
        float fC2 = (qVarArr[0].c() + qVarArr[2].c()) / 2.0f;
        float fD2 = (qVarArr[0].d() + qVarArr[2].d()) / 2.0f;
        float f10 = fC * f9;
        float f11 = fD * f9;
        q qVar = new q(fC2 + f10, fD2 + f11);
        q qVar2 = new q(fC2 - f10, fD2 - f11);
        float fC3 = qVarArr[1].c() - qVarArr[3].c();
        float fD3 = qVarArr[1].d() - qVarArr[3].d();
        float fC4 = (qVarArr[1].c() + qVarArr[3].c()) / 2.0f;
        float fD4 = (qVarArr[1].d() + qVarArr[3].d()) / 2.0f;
        float f12 = fC3 * f9;
        float f13 = f9 * fD3;
        return new q[]{qVar, new q(fC4 + f12, fD4 + f13), qVar2, new q(fC4 - f12, fD4 - f13)};
    }

    public static int h(long j9, boolean z9) throws k {
        int i9;
        int i10;
        if (z9) {
            i9 = 7;
            i10 = 2;
        } else {
            i9 = 10;
            i10 = 4;
        }
        int i11 = i9 - i10;
        int[] iArr = new int[i9];
        for (int i12 = i9 - 1; i12 >= 0; i12--) {
            iArr[i12] = ((int) j9) & 15;
            j9 >>= 4;
        }
        try {
            new c(F6.a.f2029k).a(iArr, i11);
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                i13 = (i13 << 4) + iArr[i14];
            }
            return i13;
        } catch (e unused) {
            throw k.a();
        }
    }

    public static int m(int[] iArr, int i9) throws k {
        int i10 = 0;
        for (int i11 : iArr) {
            i10 = (i10 << 3) + ((i11 >> (i9 - 2)) << 1) + (i11 & 1);
        }
        int i12 = ((i10 & 1) << 11) + (i10 >> 1);
        for (int i13 = 0; i13 < 4; i13++) {
            if (Integer.bitCount(f150g[i13] ^ i12) <= 2) {
                return i13;
            }
        }
        throw k.a();
    }

    public C2990a a(boolean z9) throws k {
        q[] qVarArrF = f(k());
        if (z9) {
            q qVar = qVarArrF[0];
            qVarArrF[0] = qVarArrF[2];
            qVarArrF[2] = qVar;
        }
        e(qVarArrF);
        b bVar = this.f151a;
        int i9 = this.f156f;
        return new C2990a(q(bVar, qVarArrF[i9 % 4], qVarArrF[(i9 + 1) % 4], qVarArrF[(i9 + 2) % 4], qVarArrF[(i9 + 3) % 4]), l(qVarArrF), this.f152b, this.f154d, this.f153c);
    }

    public final void e(q[] qVarArr) throws k {
        int i9;
        long j9;
        long j10;
        if (!o(qVarArr[0]) || !o(qVarArr[1]) || !o(qVarArr[2]) || !o(qVarArr[3])) {
            throw k.a();
        }
        int i10 = this.f155e * 2;
        int[] iArr = {r(qVarArr[0], qVarArr[1], i10), r(qVarArr[1], qVarArr[2], i10), r(qVarArr[2], qVarArr[3], i10), r(qVarArr[3], qVarArr[0], i10)};
        this.f156f = m(iArr, i10);
        long j11 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = iArr[(this.f156f + i11) % 4];
            if (this.f152b) {
                j9 = j11 << 7;
                j10 = (i12 >> 1) & 127;
            } else {
                j9 = j11 << 10;
                j10 = ((i12 >> 2) & 992) + ((i12 >> 1) & 31);
            }
            j11 = j9 + j10;
        }
        int iH = h(j11, this.f152b);
        if (this.f152b) {
            this.f153c = (iH >> 6) + 1;
            i9 = iH & 63;
        } else {
            this.f153c = (iH >> 11) + 1;
            i9 = iH & 2047;
        }
        this.f154d = i9 + 1;
    }

    public final q[] f(C0003a c0003a) throws k {
        this.f155e = 1;
        C0003a c0003a2 = c0003a;
        C0003a c0003a3 = c0003a2;
        C0003a c0003a4 = c0003a3;
        C0003a c0003a5 = c0003a4;
        boolean z9 = true;
        while (this.f155e < 9) {
            C0003a c0003aJ = j(c0003a2, z9, 1, -1);
            C0003a c0003aJ2 = j(c0003a3, z9, 1, 1);
            C0003a c0003aJ3 = j(c0003a4, z9, -1, 1);
            C0003a c0003aJ4 = j(c0003a5, z9, -1, -1);
            if (this.f155e > 2) {
                double dB = (b(c0003aJ4, c0003aJ) * this.f155e) / (b(c0003a5, c0003a2) * (this.f155e + 2));
                if (dB < 0.75d || dB > 1.25d || !p(c0003aJ, c0003aJ2, c0003aJ3, c0003aJ4)) {
                    break;
                }
            }
            z9 = !z9;
            this.f155e++;
            c0003a5 = c0003aJ4;
            c0003a2 = c0003aJ;
            c0003a3 = c0003aJ2;
            c0003a4 = c0003aJ3;
        }
        int i9 = this.f155e;
        if (i9 != 5 && i9 != 7) {
            throw k.a();
        }
        this.f152b = i9 == 5;
        q[] qVarArr = {new q(c0003a2.a() + 0.5f, c0003a2.b() - 0.5f), new q(c0003a3.a() + 0.5f, c0003a3.b() + 0.5f), new q(c0003a4.a() - 0.5f, c0003a4.b() + 0.5f), new q(c0003a5.a() - 0.5f, c0003a5.b() - 0.5f)};
        int i10 = this.f155e;
        return d(qVarArr, (i10 * 2) - 3, i10 * 2);
    }

    public final int g(C0003a c0003a, C0003a c0003a2) {
        float fB = b(c0003a, c0003a2);
        float fA = (c0003a2.a() - c0003a.a()) / fB;
        float fB2 = (c0003a2.b() - c0003a.b()) / fB;
        float fA2 = c0003a.a();
        float fB3 = c0003a.b();
        boolean zF = this.f151a.f(c0003a.a(), c0003a.b());
        int iCeil = (int) Math.ceil(fB);
        int i9 = 0;
        for (int i10 = 0; i10 < iCeil; i10++) {
            fA2 += fA;
            fB3 += fB2;
            if (this.f151a.f(E6.a.c(fA2), E6.a.c(fB3)) != zF) {
                i9++;
            }
        }
        float f9 = i9 / fB;
        if (f9 <= 0.1f || f9 >= 0.9f) {
            return (f9 <= 0.1f) == zF ? 1 : -1;
        }
        return 0;
    }

    public final int i() {
        if (this.f152b) {
            return (this.f153c * 4) + 11;
        }
        int i9 = this.f153c;
        return i9 <= 4 ? (i9 * 4) + 15 : (i9 * 4) + ((((i9 - 4) / 8) + 1) * 2) + 15;
    }

    public final C0003a j(C0003a c0003a, boolean z9, int i9, int i10) {
        int iA = c0003a.a() + i9;
        int iB = c0003a.b();
        while (true) {
            iB += i10;
            if (!n(iA, iB) || this.f151a.f(iA, iB) != z9) {
                break;
            }
            iA += i9;
        }
        int i11 = iA - i9;
        int i12 = iB - i10;
        while (n(i11, i12) && this.f151a.f(i11, i12) == z9) {
            i11 += i9;
        }
        int i13 = i11 - i9;
        while (n(i13, i12) && this.f151a.f(i13, i12) == z9) {
            i12 += i10;
        }
        return new C0003a(i13, i12 - i10);
    }

    public final C0003a k() {
        q qVarC;
        q qVar;
        q qVar2;
        q qVar3;
        q qVarC2;
        q qVarC3;
        q qVarC4;
        q qVarC5;
        try {
            q[] qVarArrC = new E6.b(this.f151a).c();
            qVar2 = qVarArrC[0];
            qVar3 = qVarArrC[1];
            qVar = qVarArrC[2];
            qVarC = qVarArrC[3];
        } catch (k unused) {
            int iL = this.f151a.l() / 2;
            int i9 = this.f151a.i() / 2;
            int i10 = iL + 7;
            int i11 = i9 - 7;
            q qVarC6 = j(new C0003a(i10, i11), false, 1, -1).c();
            int i12 = i9 + 7;
            q qVarC7 = j(new C0003a(i10, i12), false, 1, 1).c();
            int i13 = iL - 7;
            q qVarC8 = j(new C0003a(i13, i12), false, -1, 1).c();
            qVarC = j(new C0003a(i13, i11), false, -1, -1).c();
            qVar = qVarC8;
            qVar2 = qVarC6;
            qVar3 = qVarC7;
        }
        int iC = E6.a.c((((qVar2.c() + qVarC.c()) + qVar3.c()) + qVar.c()) / 4.0f);
        int iC2 = E6.a.c((((qVar2.d() + qVarC.d()) + qVar3.d()) + qVar.d()) / 4.0f);
        try {
            q[] qVarArrC2 = new E6.b(this.f151a, 15, iC, iC2).c();
            qVarC2 = qVarArrC2[0];
            qVarC3 = qVarArrC2[1];
            qVarC4 = qVarArrC2[2];
            qVarC5 = qVarArrC2[3];
        } catch (k unused2) {
            int i14 = iC + 7;
            int i15 = iC2 - 7;
            qVarC2 = j(new C0003a(i14, i15), false, 1, -1).c();
            int i16 = iC2 + 7;
            qVarC3 = j(new C0003a(i14, i16), false, 1, 1).c();
            int i17 = iC - 7;
            qVarC4 = j(new C0003a(i17, i16), false, -1, 1).c();
            qVarC5 = j(new C0003a(i17, i15), false, -1, -1).c();
        }
        return new C0003a(E6.a.c((((qVarC2.c() + qVarC5.c()) + qVarC3.c()) + qVarC4.c()) / 4.0f), E6.a.c((((qVarC2.d() + qVarC5.d()) + qVarC3.d()) + qVarC4.d()) / 4.0f));
    }

    public final q[] l(q[] qVarArr) {
        return d(qVarArr, this.f155e * 2, i());
    }

    public final boolean n(int i9, int i10) {
        return i9 >= 0 && i9 < this.f151a.l() && i10 > 0 && i10 < this.f151a.i();
    }

    public final boolean o(q qVar) {
        return n(E6.a.c(qVar.c()), E6.a.c(qVar.d()));
    }

    public final boolean p(C0003a c0003a, C0003a c0003a2, C0003a c0003a3, C0003a c0003a4) {
        C0003a c0003a5 = new C0003a(c0003a.a() - 3, c0003a.b() + 3);
        C0003a c0003a6 = new C0003a(c0003a2.a() - 3, c0003a2.b() - 3);
        C0003a c0003a7 = new C0003a(c0003a3.a() + 3, c0003a3.b() - 3);
        C0003a c0003a8 = new C0003a(c0003a4.a() + 3, c0003a4.b() + 3);
        int iG = g(c0003a8, c0003a5);
        return iG != 0 && g(c0003a5, c0003a6) == iG && g(c0003a6, c0003a7) == iG && g(c0003a7, c0003a8) == iG;
    }

    public final b q(b bVar, q qVar, q qVar2, q qVar3, q qVar4) {
        i iVarB = i.b();
        int i9 = i();
        float f9 = i9 / 2.0f;
        int i10 = this.f155e;
        float f10 = f9 - i10;
        float f11 = f9 + i10;
        return iVarB.c(bVar, i9, i9, f10, f10, f11, f10, f11, f11, f10, f11, qVar.c(), qVar.d(), qVar2.c(), qVar2.d(), qVar3.c(), qVar3.d(), qVar4.c(), qVar4.d());
    }

    public final int r(q qVar, q qVar2, int i9) {
        float fC = c(qVar, qVar2);
        float f9 = fC / i9;
        float fC2 = qVar.c();
        float fD = qVar.d();
        float fC3 = ((qVar2.c() - qVar.c()) * f9) / fC;
        float fD2 = (f9 * (qVar2.d() - qVar.d())) / fC;
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            float f10 = i11;
            if (this.f151a.f(E6.a.c((f10 * fC3) + fC2), E6.a.c((f10 * fD2) + fD))) {
                i10 |= 1 << ((i9 - i11) - 1);
            }
        }
        return i10;
    }
}
