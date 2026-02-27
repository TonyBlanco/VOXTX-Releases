package com.google.android.exoplayer2.source.dash;

import B3.C0494b;
import D3.e;
import D3.g;
import D3.k;
import D3.m;
import D3.n;
import D3.o;
import D3.p;
import E3.f;
import E3.h;
import F3.i;
import F3.j;
import O2.C0936z0;
import O2.H1;
import P2.v0;
import Z3.s;
import android.os.SystemClock;
import b4.AbstractC1217h;
import b4.AbstractC1218i;
import b4.C;
import b4.F;
import b4.H;
import b4.InterfaceC1224o;
import b4.S;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.d;
import d4.k0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import s5.AbstractC2717A;

/* JADX INFO: loaded from: classes3.dex */
public class c implements com.google.android.exoplayer2.source.dash.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H f25535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E3.b f25536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f25537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1224o f25539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f25540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f25541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d.c f25542h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b[] f25543i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s f25544j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public F3.c f25545k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f25546l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IOException f25547m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f25548n;

    public static final class a implements a.InterfaceC0241a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC1224o.a f25549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f25550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g.a f25551c;

        public a(g.a aVar, InterfaceC1224o.a aVar2, int i9) {
            this.f25551c = aVar;
            this.f25549a = aVar2;
            this.f25550b = i9;
        }

        public a(InterfaceC1224o.a aVar) {
            this(aVar, 1);
        }

        public a(InterfaceC1224o.a aVar, int i9) {
            this(e.f1358k, aVar, i9);
        }

        @Override // com.google.android.exoplayer2.source.dash.a.InterfaceC0241a
        public com.google.android.exoplayer2.source.dash.a a(H h9, F3.c cVar, E3.b bVar, int i9, int[] iArr, s sVar, int i10, long j9, boolean z9, List list, d.c cVar2, S s9, v0 v0Var, AbstractC1217h abstractC1217h) {
            InterfaceC1224o interfaceC1224oA = this.f25549a.a();
            if (s9 != null) {
                interfaceC1224oA.g(s9);
            }
            return new c(this.f25551c, h9, cVar, bVar, i9, iArr, sVar, i10, interfaceC1224oA, j9, this.f25550b, z9, list, cVar2, v0Var, abstractC1217h);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f25552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f25553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final F3.b f25554c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final f f25555d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f25556e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f25557f;

        public b(long j9, j jVar, F3.b bVar, g gVar, long j10, f fVar) {
            this.f25556e = j9;
            this.f25553b = jVar;
            this.f25554c = bVar;
            this.f25557f = j10;
            this.f25552a = gVar;
            this.f25555d = fVar;
        }

        public b b(long j9, j jVar) throws C0494b {
            long jH;
            f fVarB = this.f25553b.b();
            f fVarB2 = jVar.b();
            if (fVarB == null) {
                return new b(j9, jVar, this.f25554c, this.f25552a, this.f25557f, fVarB);
            }
            if (!fVarB.j()) {
                return new b(j9, jVar, this.f25554c, this.f25552a, this.f25557f, fVarB2);
            }
            long jI = fVarB.i(j9);
            if (jI == 0) {
                return new b(j9, jVar, this.f25554c, this.f25552a, this.f25557f, fVarB2);
            }
            long jK = fVarB.k();
            long jC = fVarB.c(jK);
            long jH2 = jI + jK;
            long j10 = jH2 - 1;
            long jC2 = fVarB.c(j10) + fVarB.d(j10, j9);
            long jK2 = fVarB2.k();
            long jC3 = fVarB2.c(jK2);
            long j11 = this.f25557f;
            if (jC2 == jC3) {
                jH = j11 + (jH2 - jK2);
            } else {
                if (jC2 < jC3) {
                    throw new C0494b();
                }
                if (jC3 < jC) {
                    jH = j11 - (fVarB2.h(jC, j9) - jK);
                } else {
                    jH2 = fVarB.h(jC3, j9);
                    jH = j11 + (jH2 - jK2);
                }
            }
            return new b(j9, jVar, this.f25554c, this.f25552a, jH, fVarB2);
        }

        public b c(f fVar) {
            return new b(this.f25556e, this.f25553b, this.f25554c, this.f25552a, this.f25557f, fVar);
        }

        public b d(F3.b bVar) {
            return new b(this.f25556e, this.f25553b, bVar, this.f25552a, this.f25557f, this.f25555d);
        }

        public long e(long j9) {
            return this.f25555d.e(this.f25556e, j9) + this.f25557f;
        }

        public long f() {
            return this.f25555d.k() + this.f25557f;
        }

        public long g(long j9) {
            return (e(j9) + this.f25555d.l(this.f25556e, j9)) - 1;
        }

        public long h() {
            return this.f25555d.i(this.f25556e);
        }

        public long i(long j9) {
            return k(j9) + this.f25555d.d(j9 - this.f25557f, this.f25556e);
        }

        public long j(long j9) {
            return this.f25555d.h(j9, this.f25556e) + this.f25557f;
        }

        public long k(long j9) {
            return this.f25555d.c(j9 - this.f25557f);
        }

        public i l(long j9) {
            return this.f25555d.g(j9 - this.f25557f);
        }

        public boolean m(long j9, long j10) {
            return this.f25555d.j() || j10 == -9223372036854775807L || i(j9) <= j10;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.c$c, reason: collision with other inner class name */
    public static final class C0242c extends D3.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f25558e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f25559f;

        public C0242c(b bVar, long j9, long j10, long j11) {
            super(j9, j10);
            this.f25558e = bVar;
            this.f25559f = j11;
        }

        @Override // D3.o
        public long a() {
            c();
            return this.f25558e.k(d());
        }

        @Override // D3.o
        public long b() {
            c();
            return this.f25558e.i(d());
        }
    }

    public c(g.a aVar, H h9, F3.c cVar, E3.b bVar, int i9, int[] iArr, s sVar, int i10, InterfaceC1224o interfaceC1224o, long j9, int i11, boolean z9, List list, d.c cVar2, v0 v0Var, AbstractC1217h abstractC1217h) {
        this.f25535a = h9;
        this.f25545k = cVar;
        this.f25536b = bVar;
        this.f25537c = iArr;
        this.f25544j = sVar;
        this.f25538d = i10;
        this.f25539e = interfaceC1224o;
        this.f25546l = i9;
        this.f25540f = j9;
        this.f25541g = i11;
        this.f25542h = cVar2;
        long jG = cVar.g(i9);
        ArrayList arrayListN = n();
        this.f25543i = new b[sVar.length()];
        int i12 = 0;
        while (i12 < this.f25543i.length) {
            j jVar = (j) arrayListN.get(sVar.d(i12));
            F3.b bVarJ = bVar.j(jVar.f1984c);
            int i13 = i12;
            this.f25543i[i13] = new b(jG, jVar, bVarJ == null ? (F3.b) jVar.f1984c.get(0) : bVarJ, aVar.a(i10, jVar.f1983b, z9, list, cVar2, v0Var), 0L, jVar.b());
            i12 = i13 + 1;
        }
    }

    @Override // D3.j
    public void a() throws IOException {
        IOException iOException = this.f25547m;
        if (iOException != null) {
            throw iOException;
        }
        this.f25535a.a();
    }

    @Override // com.google.android.exoplayer2.source.dash.a
    public void b(s sVar) {
        this.f25544j = sVar;
    }

    @Override // D3.j
    public void c(D3.f fVar) {
        com.google.android.exoplayer2.extractor.b bVarB;
        if (fVar instanceof m) {
            int iL = this.f25544j.l(((m) fVar).f1379e);
            b bVar = this.f25543i[iL];
            if (bVar.f25555d == null && (bVarB = bVar.f25552a.b()) != null) {
                this.f25543i[iL] = bVar.c(new h(bVarB, bVar.f25553b.f1985d));
            }
        }
        d.c cVar = this.f25542h;
        if (cVar != null) {
            cVar.i(fVar);
        }
    }

    @Override // D3.j
    public long d(long j9, H1 h12) {
        for (b bVar : this.f25543i) {
            if (bVar.f25555d != null) {
                long jH = bVar.h();
                if (jH != 0) {
                    long j10 = bVar.j(j9);
                    long jK = bVar.k(j10);
                    return h12.a(j9, jK, (jK >= j9 || (jH != -1 && j10 >= (bVar.f() + jH) - 1)) ? jK : bVar.k(j10 + 1));
                }
            }
        }
        return j9;
    }

    @Override // D3.j
    public boolean e(long j9, D3.f fVar, List list) {
        if (this.f25547m != null) {
            return false;
        }
        return this.f25544j.j(j9, fVar, list);
    }

    @Override // D3.j
    public boolean g(D3.f fVar, boolean z9, F.c cVar, F f9) {
        F.b bVarA;
        if (!z9) {
            return false;
        }
        d.c cVar2 = this.f25542h;
        if (cVar2 != null && cVar2.j(fVar)) {
            return true;
        }
        if (!this.f25545k.f1936d && (fVar instanceof n)) {
            IOException iOException = cVar.f17496c;
            if ((iOException instanceof C.e) && ((C.e) iOException).f17480e == 404) {
                b bVar = this.f25543i[this.f25544j.l(fVar.f1379e)];
                long jH = bVar.h();
                if (jH != -1 && jH != 0) {
                    if (((n) fVar).g() > (bVar.f() + jH) - 1) {
                        this.f25548n = true;
                        return true;
                    }
                }
            }
        }
        b bVar2 = this.f25543i[this.f25544j.l(fVar.f1379e)];
        F3.b bVarJ = this.f25536b.j(bVar2.f25553b.f1984c);
        if (bVarJ != null && !bVar2.f25554c.equals(bVarJ)) {
            return true;
        }
        F.a aVarK = k(this.f25544j, bVar2.f25553b.f1984c);
        if ((!aVarK.a(2) && !aVarK.a(1)) || (bVarA = f9.a(aVarK, cVar)) == null || !aVarK.a(bVarA.f17492a)) {
            return false;
        }
        int i9 = bVarA.f17492a;
        if (i9 == 2) {
            s sVar = this.f25544j;
            return sVar.e(sVar.l(fVar.f1379e), bVarA.f17493b);
        }
        if (i9 != 1) {
            return false;
        }
        this.f25536b.e(bVar2.f25554c, bVarA.f17493b);
        return true;
    }

    @Override // D3.j
    public void h(long j9, long j10, List list, D3.h hVar) {
        int i9;
        int i10;
        o[] oVarArr;
        long j11;
        long j12;
        if (this.f25547m != null) {
            return;
        }
        long j13 = j10 - j9;
        long jP0 = k0.P0(this.f25545k.f1933a) + k0.P0(this.f25545k.d(this.f25546l).f1969b) + j10;
        d.c cVar = this.f25542h;
        if (cVar == null || !cVar.h(jP0)) {
            long jP02 = k0.P0(k0.g0(this.f25540f));
            long jM = m(jP02);
            n nVar = list.isEmpty() ? null : (n) list.get(list.size() - 1);
            int length = this.f25544j.length();
            o[] oVarArr2 = new o[length];
            int i11 = 0;
            while (i11 < length) {
                b bVar = this.f25543i[i11];
                if (bVar.f25555d == null) {
                    oVarArr2[i11] = o.f1428a;
                    i9 = i11;
                    i10 = length;
                    oVarArr = oVarArr2;
                    j11 = j13;
                    j12 = jP02;
                } else {
                    long jE = bVar.e(jP02);
                    long jG = bVar.g(jP02);
                    i9 = i11;
                    i10 = length;
                    oVarArr = oVarArr2;
                    j11 = j13;
                    j12 = jP02;
                    long jO = o(bVar, nVar, j10, jE, jG);
                    if (jO < jE) {
                        oVarArr[i9] = o.f1428a;
                    } else {
                        oVarArr[i9] = new C0242c(r(i9), jO, jG, jM);
                    }
                }
                i11 = i9 + 1;
                jP02 = j12;
                length = i10;
                oVarArr2 = oVarArr;
                j13 = j11;
            }
            long j14 = j13;
            long j15 = jP02;
            this.f25544j.r(j9, j14, l(j15, j9), list, oVarArr2);
            b bVarR = r(this.f25544j.b());
            g gVar = bVarR.f25552a;
            if (gVar != null) {
                j jVar = bVarR.f25553b;
                i iVarN = gVar.c() == null ? jVar.n() : null;
                i iVarM = bVarR.f25555d == null ? jVar.m() : null;
                if (iVarN != null || iVarM != null) {
                    hVar.f1385a = p(bVarR, this.f25539e, this.f25544j.p(), this.f25544j.q(), this.f25544j.g(), iVarN, iVarM);
                    return;
                }
            }
            long j16 = bVarR.f25556e;
            boolean z9 = j16 != -9223372036854775807L;
            if (bVarR.h() == 0) {
                hVar.f1386b = z9;
                return;
            }
            long jE2 = bVarR.e(j15);
            long jG2 = bVarR.g(j15);
            long jO2 = o(bVarR, nVar, j10, jE2, jG2);
            if (jO2 < jE2) {
                this.f25547m = new C0494b();
                return;
            }
            if (jO2 > jG2 || (this.f25548n && jO2 >= jG2)) {
                hVar.f1386b = z9;
                return;
            }
            if (z9 && bVarR.k(jO2) >= j16) {
                hVar.f1386b = true;
                return;
            }
            int iMin = (int) Math.min(this.f25541g, (jG2 - jO2) + 1);
            if (j16 != -9223372036854775807L) {
                while (iMin > 1 && bVarR.k((((long) iMin) + jO2) - 1) >= j16) {
                    iMin--;
                }
            }
            hVar.f1385a = q(bVarR, this.f25539e, this.f25538d, this.f25544j.p(), this.f25544j.q(), this.f25544j.g(), jO2, iMin, list.isEmpty() ? j10 : -9223372036854775807L, jM, null);
        }
    }

    @Override // com.google.android.exoplayer2.source.dash.a
    public void i(F3.c cVar, int i9) {
        try {
            this.f25545k = cVar;
            this.f25546l = i9;
            long jG = cVar.g(i9);
            ArrayList arrayListN = n();
            for (int i10 = 0; i10 < this.f25543i.length; i10++) {
                j jVar = (j) arrayListN.get(this.f25544j.d(i10));
                b[] bVarArr = this.f25543i;
                bVarArr[i10] = bVarArr[i10].b(jG, jVar);
            }
        } catch (C0494b e9) {
            this.f25547m = e9;
        }
    }

    @Override // D3.j
    public int j(long j9, List list) {
        return (this.f25547m != null || this.f25544j.length() < 2) ? list.size() : this.f25544j.n(j9, list);
    }

    public final F.a k(s sVar, List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = sVar.length();
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (sVar.a(i10, jElapsedRealtime)) {
                i9++;
            }
        }
        int iF = E3.b.f(list);
        return new F.a(iF, iF - this.f25536b.g(list), length, i9);
    }

    public final long l(long j9, long j10) {
        if (!this.f25545k.f1936d || this.f25543i[0].h() == 0) {
            return -9223372036854775807L;
        }
        return Math.max(0L, Math.min(m(j9), this.f25543i[0].i(this.f25543i[0].g(j9))) - j10);
    }

    public final long m(long j9) {
        F3.c cVar = this.f25545k;
        long j10 = cVar.f1933a;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j9 - k0.P0(j10 + cVar.d(this.f25546l).f1969b);
    }

    public final ArrayList n() {
        List list = this.f25545k.d(this.f25546l).f1970c;
        ArrayList arrayList = new ArrayList();
        for (int i9 : this.f25537c) {
            arrayList.addAll(((F3.a) list.get(i9)).f1925c);
        }
        return arrayList;
    }

    public final long o(b bVar, n nVar, long j9, long j10, long j11) {
        return nVar != null ? nVar.g() : k0.s(bVar.j(j9), j10, j11);
    }

    public D3.f p(b bVar, InterfaceC1224o interfaceC1224o, C0936z0 c0936z0, int i9, Object obj, i iVar, i iVar2) {
        i iVar3 = iVar;
        j jVar = bVar.f25553b;
        if (iVar3 != null) {
            i iVarA = iVar3.a(iVar2, bVar.f25554c.f1929a);
            if (iVarA != null) {
                iVar3 = iVarA;
            }
        } else {
            iVar3 = iVar2;
        }
        return new m(interfaceC1224o, E3.g.a(jVar, bVar.f25554c.f1929a, iVar3, 0), c0936z0, i9, obj, bVar.f25552a);
    }

    public D3.f q(b bVar, InterfaceC1224o interfaceC1224o, int i9, C0936z0 c0936z0, int i10, Object obj, long j9, int i11, long j10, long j11, AbstractC1218i abstractC1218i) {
        j jVar = bVar.f25553b;
        long jK = bVar.k(j9);
        i iVarL = bVar.l(j9);
        AbstractC2717A abstractC2717AK = AbstractC2717A.k();
        if (bVar.f25552a == null) {
            return new p(interfaceC1224o, E3.g.a(jVar, bVar.f25554c.f1929a, iVarL, bVar.m(j9, j11) ? 0 : 8).a().e(abstractC2717AK).a(), c0936z0, i10, obj, jK, bVar.i(j9), j9, i9, c0936z0);
        }
        int i12 = 1;
        int i13 = 1;
        while (i12 < i11) {
            i iVarA = iVarL.a(bVar.l(((long) i12) + j9), bVar.f25554c.f1929a);
            if (iVarA == null) {
                break;
            }
            i13++;
            i12++;
            iVarL = iVarA;
        }
        long j12 = (((long) i13) + j9) - 1;
        long jI = bVar.i(j12);
        long j13 = bVar.f25556e;
        return new k(interfaceC1224o, E3.g.a(jVar, bVar.f25554c.f1929a, iVarL, bVar.m(j12, j11) ? 0 : 8).a().e(abstractC2717AK).a(), c0936z0, i10, obj, jK, jI, j10, (j13 == -9223372036854775807L || j13 > jI) ? -9223372036854775807L : j13, j9, i13, -jVar.f1985d, bVar.f25552a);
    }

    public final b r(int i9) {
        b bVar = this.f25543i[i9];
        F3.b bVarJ = this.f25536b.j(bVar.f25553b.f1984c);
        if (bVarJ == null || bVarJ.equals(bVar.f25554c)) {
            return bVar;
        }
        b bVarD = bVar.d(bVarJ);
        this.f25543i[i9] = bVarD;
        return bVarD;
    }

    @Override // D3.j
    public void release() {
        for (b bVar : this.f25543i) {
            g gVar = bVar.f25552a;
            if (gVar != null) {
                gVar.release();
            }
        }
    }
}
