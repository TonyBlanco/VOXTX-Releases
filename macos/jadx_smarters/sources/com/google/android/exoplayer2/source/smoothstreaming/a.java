package com.google.android.exoplayer2.source.smoothstreaming;

import B3.C0494b;
import D3.e;
import D3.f;
import D3.g;
import D3.h;
import D3.k;
import D3.n;
import D3.o;
import N3.a;
import O2.C0936z0;
import O2.H1;
import Z3.A;
import Z3.s;
import android.net.Uri;
import b4.AbstractC1217h;
import b4.AbstractC1218i;
import b4.C1227s;
import b4.F;
import b4.H;
import b4.InterfaceC1224o;
import b4.S;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import d4.AbstractC1684a;
import java.io.IOException;
import java.util.List;
import l3.C2182g;
import l3.C2190o;
import l3.p;
import s5.AbstractC2717A;

/* JADX INFO: loaded from: classes3.dex */
public class a implements com.google.android.exoplayer2.source.smoothstreaming.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H f25772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g[] f25774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1224o f25775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s f25776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public N3.a f25777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f25778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public IOException f25779h;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.a$a, reason: collision with other inner class name */
    public static final class C0247a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC1224o.a f25780a;

        public C0247a(InterfaceC1224o.a aVar) {
            this.f25780a = aVar;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.b.a
        public com.google.android.exoplayer2.source.smoothstreaming.b a(H h9, N3.a aVar, int i9, s sVar, S s9, AbstractC1217h abstractC1217h) {
            InterfaceC1224o interfaceC1224oA = this.f25780a.a();
            if (s9 != null) {
                interfaceC1224oA.g(s9);
            }
            return new a(h9, aVar, i9, sVar, interfaceC1224oA, abstractC1217h);
        }
    }

    public static final class b extends D3.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final a.b f25781e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f25782f;

        public b(a.b bVar, int i9, int i10) {
            super(i10, bVar.f5312k - 1);
            this.f25781e = bVar;
            this.f25782f = i9;
        }

        @Override // D3.o
        public long a() {
            c();
            return this.f25781e.e((int) d());
        }

        @Override // D3.o
        public long b() {
            return a() + this.f25781e.c((int) d());
        }
    }

    public a(H h9, N3.a aVar, int i9, s sVar, InterfaceC1224o interfaceC1224o, AbstractC1217h abstractC1217h) {
        this.f25772a = h9;
        this.f25777f = aVar;
        this.f25773b = i9;
        this.f25776e = sVar;
        this.f25775d = interfaceC1224o;
        a.b bVar = aVar.f5296f[i9];
        this.f25774c = new g[sVar.length()];
        for (int i10 = 0; i10 < this.f25774c.length; i10++) {
            int iD = sVar.d(i10);
            C0936z0 c0936z0 = bVar.f5311j[iD];
            p[] pVarArr = c0936z0.f6470p != null ? ((a.C0071a) AbstractC1684a.e(aVar.f5295e)).f5301c : null;
            int i11 = bVar.f5302a;
            this.f25774c[i10] = new e(new C2182g(3, null, new C2190o(iD, i11, bVar.f5304c, -9223372036854775807L, aVar.f5297g, c0936z0, 0, pVarArr, i11 == 2 ? 4 : 0, null, null)), bVar.f5302a, c0936z0);
        }
    }

    public static n k(C0936z0 c0936z0, InterfaceC1224o interfaceC1224o, Uri uri, int i9, long j9, long j10, long j11, int i10, Object obj, g gVar, AbstractC1218i abstractC1218i) {
        return new k(interfaceC1224o, new C1227s.b().i(uri).e(AbstractC2717A.k()).a(), c0936z0, i10, obj, j9, j10, j11, -9223372036854775807L, i9, 1, j9, gVar);
    }

    @Override // D3.j
    public void a() throws IOException {
        IOException iOException = this.f25779h;
        if (iOException != null) {
            throw iOException;
        }
        this.f25772a.a();
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.b
    public void b(s sVar) {
        this.f25776e = sVar;
    }

    @Override // D3.j
    public void c(f fVar) {
    }

    @Override // D3.j
    public long d(long j9, H1 h12) {
        a.b bVar = this.f25777f.f5296f[this.f25773b];
        int iD = bVar.d(j9);
        long jE = bVar.e(iD);
        return h12.a(j9, jE, (jE >= j9 || iD >= bVar.f5312k + (-1)) ? jE : bVar.e(iD + 1));
    }

    @Override // D3.j
    public boolean e(long j9, f fVar, List list) {
        if (this.f25779h != null) {
            return false;
        }
        return this.f25776e.j(j9, fVar, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // com.google.android.exoplayer2.source.smoothstreaming.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(N3.a r9) {
        /*
            r8 = this;
            N3.a r0 = r8.f25777f
            N3.a$b[] r0 = r0.f5296f
            int r1 = r8.f25773b
            r0 = r0[r1]
            int r2 = r0.f5312k
            N3.a$b[] r3 = r9.f5296f
            r1 = r3[r1]
            if (r2 == 0) goto L29
            int r3 = r1.f5312k
            if (r3 != 0) goto L15
            goto L29
        L15:
            int r3 = r2 + (-1)
            long r4 = r0.e(r3)
            long r6 = r0.c(r3)
            long r4 = r4 + r6
            r3 = 0
            long r6 = r1.e(r3)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L2f
        L29:
            int r0 = r8.f25778g
            int r0 = r0 + r2
            r8.f25778g = r0
            goto L38
        L2f:
            int r1 = r8.f25778g
            int r0 = r0.d(r6)
            int r1 = r1 + r0
            r8.f25778g = r1
        L38:
            r8.f25777f = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.smoothstreaming.a.f(N3.a):void");
    }

    @Override // D3.j
    public boolean g(f fVar, boolean z9, F.c cVar, F f9) {
        F.b bVarA = f9.a(A.c(this.f25776e), cVar);
        if (z9 && bVarA != null && bVarA.f17492a == 2) {
            s sVar = this.f25776e;
            if (sVar.e(sVar.l(fVar.f1379e), bVarA.f17493b)) {
                return true;
            }
        }
        return false;
    }

    @Override // D3.j
    public final void h(long j9, long j10, List list, h hVar) {
        int iG;
        long j11 = j10;
        if (this.f25779h != null) {
            return;
        }
        a.b bVar = this.f25777f.f5296f[this.f25773b];
        if (bVar.f5312k == 0) {
            hVar.f1386b = !r4.f5294d;
            return;
        }
        if (list.isEmpty()) {
            iG = bVar.d(j11);
        } else {
            iG = (int) (((n) list.get(list.size() - 1)).g() - ((long) this.f25778g));
            if (iG < 0) {
                this.f25779h = new C0494b();
                return;
            }
        }
        if (iG >= bVar.f5312k) {
            hVar.f1386b = !this.f25777f.f5294d;
            return;
        }
        long j12 = j11 - j9;
        long jL = l(j9);
        int length = this.f25776e.length();
        o[] oVarArr = new o[length];
        for (int i9 = 0; i9 < length; i9++) {
            oVarArr[i9] = new b(bVar, this.f25776e.d(i9), iG);
        }
        this.f25776e.r(j9, j12, jL, list, oVarArr);
        long jE = bVar.e(iG);
        long jC = jE + bVar.c(iG);
        if (!list.isEmpty()) {
            j11 = -9223372036854775807L;
        }
        long j13 = j11;
        int i10 = iG + this.f25778g;
        int iB = this.f25776e.b();
        hVar.f1385a = k(this.f25776e.p(), this.f25775d, bVar.a(this.f25776e.d(iB), iG), i10, jE, jC, j13, this.f25776e.q(), this.f25776e.g(), this.f25774c[iB], null);
    }

    @Override // D3.j
    public int j(long j9, List list) {
        return (this.f25779h != null || this.f25776e.length() < 2) ? list.size() : this.f25776e.n(j9, list);
    }

    public final long l(long j9) {
        N3.a aVar = this.f25777f;
        if (!aVar.f5294d) {
            return -9223372036854775807L;
        }
        a.b bVar = aVar.f5296f[this.f25773b];
        int i9 = bVar.f5312k - 1;
        return (bVar.e(i9) + bVar.c(i9)) - j9;
    }

    @Override // D3.j
    public void release() {
        for (g gVar : this.f25774c) {
            gVar.release();
        }
    }
}
