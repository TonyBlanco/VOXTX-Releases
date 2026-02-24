package y;

import java.util.ArrayList;
import w.C2899d;
import x.d;
import x.e;

/* JADX INFO: renamed from: y.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2968b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f52017a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f52018b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x.f f52019c;

    /* JADX INFO: renamed from: y.b$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e.b f52020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e.b f52021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f52022c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f52023d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f52024e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f52025f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f52026g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f52027h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f52028i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f52029j;
    }

    /* JADX INFO: renamed from: y.b$b, reason: collision with other inner class name */
    public interface InterfaceC0481b {
        void a();

        void b(x.e eVar, a aVar);
    }

    public C2968b(x.f fVar) {
        this.f52019c = fVar;
    }

    public final boolean a(InterfaceC0481b interfaceC0481b, x.e eVar, boolean z9) {
        this.f52018b.f52020a = eVar.w();
        this.f52018b.f52021b = eVar.K();
        this.f52018b.f52022c = eVar.N();
        this.f52018b.f52023d = eVar.t();
        a aVar = this.f52018b;
        aVar.f52028i = false;
        aVar.f52029j = z9;
        e.b bVar = aVar.f52020a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f52021b == bVar2;
        boolean z12 = z10 && eVar.f51769Q > 0.0f;
        boolean z13 = z11 && eVar.f51769Q > 0.0f;
        if (z12 && eVar.f51805n[0] == 4) {
            aVar.f52020a = e.b.FIXED;
        }
        if (z13 && eVar.f51805n[1] == 4) {
            aVar.f52021b = e.b.FIXED;
        }
        interfaceC0481b.b(eVar, aVar);
        eVar.A0(this.f52018b.f52024e);
        eVar.e0(this.f52018b.f52025f);
        eVar.d0(this.f52018b.f52027h);
        eVar.Y(this.f52018b.f52026g);
        a aVar2 = this.f52018b;
        aVar2.f52029j = false;
        return aVar2.f52028i;
    }

    public final void b(x.f fVar) {
        int size = fVar.f51861w0.size();
        InterfaceC0481b interfaceC0481bQ0 = fVar.Q0();
        for (int i9 = 0; i9 < size; i9++) {
            x.e eVar = (x.e) fVar.f51861w0.get(i9);
            if (!(eVar instanceof x.g) && (!eVar.f51787e.f52071e.f52050j || !eVar.f51789f.f52071e.f52050j)) {
                e.b bVarQ = eVar.q(0);
                e.b bVarQ2 = eVar.q(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarQ != bVar || eVar.f51801l == 1 || bVarQ2 != bVar || eVar.f51803m == 1) {
                    a(interfaceC0481bQ0, eVar, false);
                }
            }
        }
        interfaceC0481bQ0.a();
    }

    public final void c(x.f fVar, String str, int i9, int i10) {
        int iC = fVar.C();
        int iB = fVar.B();
        fVar.q0(0);
        fVar.p0(0);
        fVar.A0(i9);
        fVar.e0(i10);
        fVar.q0(iC);
        fVar.p0(iB);
        this.f52019c.G0();
    }

    public long d(x.f fVar, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean zO0;
        int i18;
        boolean z9;
        boolean z10;
        int i19;
        int i20;
        int i21;
        InterfaceC0481b interfaceC0481b;
        int i22;
        InterfaceC0481b interfaceC0481bQ0 = fVar.Q0();
        int size = fVar.f51861w0.size();
        int iN = fVar.N();
        int iT = fVar.t();
        boolean zB = x.j.b(i9, 128);
        boolean z11 = zB || x.j.b(i9, 64);
        if (z11) {
            for (int i23 = 0; i23 < size; i23++) {
                x.e eVar = (x.e) fVar.f51861w0.get(i23);
                e.b bVarW = eVar.w();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                boolean z12 = (bVarW == bVar) && (eVar.K() == bVar) && eVar.r() > 0.0f;
                if ((eVar.T() && z12) || ((eVar.V() && z12) || eVar.T() || eVar.V())) {
                    z11 = false;
                    break;
                }
            }
        }
        if (z11) {
            int i24 = C2899d.f51495q;
        }
        if (z11 && ((i12 == 1073741824 && i14 == 1073741824) || zB)) {
            int iMin = Math.min(fVar.A(), i13);
            int iMin2 = Math.min(fVar.z(), i15);
            if (i12 == 1073741824 && fVar.N() != iMin) {
                fVar.A0(iMin);
                fVar.S0();
            }
            if (i14 == 1073741824 && fVar.t() != iMin2) {
                fVar.e0(iMin2);
                fVar.S0();
            }
            if (i12 == 1073741824 && i14 == 1073741824) {
                zO0 = fVar.N0(zB);
                i18 = 2;
            } else {
                zO0 = fVar.O0(zB);
                if (i12 == 1073741824) {
                    zO0 &= fVar.P0(zB, 0);
                    i18 = 1;
                } else {
                    i18 = 0;
                }
                if (i14 == 1073741824) {
                    zO0 &= fVar.P0(zB, 1);
                    i18++;
                }
            }
            if (zO0) {
                fVar.E0(i12 == 1073741824, i14 == 1073741824);
            }
        } else {
            zO0 = false;
            i18 = 0;
        }
        if (zO0 && i18 == 2) {
            return 0L;
        }
        if (size > 0) {
            b(fVar);
        }
        int iR0 = fVar.R0();
        int size2 = this.f52017a.size();
        if (size > 0) {
            c(fVar, "First pass", iN, iT);
        }
        if (size2 > 0) {
            e.b bVarW2 = fVar.w();
            e.b bVar2 = e.b.WRAP_CONTENT;
            boolean z13 = bVarW2 == bVar2;
            boolean z14 = fVar.K() == bVar2;
            int iMax = Math.max(fVar.N(), this.f52019c.C());
            int iMax2 = Math.max(fVar.t(), this.f52019c.B());
            for (int i25 = 0; i25 < size2; i25++) {
            }
            int i26 = 0;
            boolean z15 = false;
            for (int i27 = 2; i26 < i27; i27 = 2) {
                int i28 = 0;
                while (i28 < size2) {
                    x.e eVar2 = (x.e) this.f52017a.get(i28);
                    if ((eVar2 instanceof x.h) || (eVar2 instanceof x.g)) {
                        i19 = size2;
                    } else {
                        i19 = size2;
                        if (eVar2.M() != 8 && (!eVar2.f51787e.f52071e.f52050j || !eVar2.f51789f.f52071e.f52050j)) {
                            int iN2 = eVar2.N();
                            int iT2 = eVar2.t();
                            i20 = iR0;
                            int iL = eVar2.l();
                            i21 = i26;
                            boolean zA = z15 | a(interfaceC0481bQ0, eVar2, true);
                            int iN3 = eVar2.N();
                            interfaceC0481b = interfaceC0481bQ0;
                            int iT3 = eVar2.t();
                            if (iN3 != iN2) {
                                eVar2.A0(iN3);
                                if (z13 && eVar2.G() > iMax) {
                                    iMax = Math.max(iMax, eVar2.G() + eVar2.k(d.b.RIGHT).b());
                                }
                                zA = true;
                            }
                            if (iT3 != iT2) {
                                eVar2.e0(iT3);
                                if (z14 && eVar2.n() > iMax2) {
                                    iMax2 = Math.max(iMax2, eVar2.n() + eVar2.k(d.b.BOTTOM).b());
                                }
                                zA = true;
                            }
                            if (!eVar2.Q() || iL == eVar2.l()) {
                                z15 = zA;
                            } else {
                                i22 = 1;
                                z15 = true;
                                i28 += i22;
                                size2 = i19;
                                iR0 = i20;
                                i26 = i21;
                                interfaceC0481bQ0 = interfaceC0481b;
                            }
                        }
                        i22 = 1;
                        i28 += i22;
                        size2 = i19;
                        iR0 = i20;
                        i26 = i21;
                        interfaceC0481bQ0 = interfaceC0481b;
                    }
                    i20 = iR0;
                    interfaceC0481b = interfaceC0481bQ0;
                    i21 = i26;
                    i22 = 1;
                    i28 += i22;
                    size2 = i19;
                    iR0 = i20;
                    i26 = i21;
                    interfaceC0481bQ0 = interfaceC0481b;
                }
                int i29 = iR0;
                int i30 = size2;
                InterfaceC0481b interfaceC0481b2 = interfaceC0481bQ0;
                int i31 = i26;
                if (z15) {
                    c(fVar, "intermediate pass", iN, iT);
                    z15 = false;
                }
                i26 = i31 + 1;
                size2 = i30;
                iR0 = i29;
                interfaceC0481bQ0 = interfaceC0481b2;
            }
            int i32 = iR0;
            if (z15) {
                c(fVar, "2nd pass", iN, iT);
                if (fVar.N() < iMax) {
                    fVar.A0(iMax);
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (fVar.t() < iMax2) {
                    fVar.e0(iMax2);
                    z10 = true;
                } else {
                    z10 = z9;
                }
                if (z10) {
                    c(fVar, "3rd pass", iN, iT);
                }
            }
            iR0 = i32;
        }
        fVar.b1(iR0);
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(x.f r7) {
        /*
            r6 = this;
            java.util.ArrayList r0 = r6.f52017a
            r0.clear()
            java.util.ArrayList r0 = r7.f51861w0
            int r0 = r0.size()
            r1 = 0
        Lc:
            if (r1 >= r0) goto L3a
            java.util.ArrayList r2 = r7.f51861w0
            java.lang.Object r2 = r2.get(r1)
            x.e r2 = (x.e) r2
            x.e$b r3 = r2.w()
            x.e$b r4 = x.e.b.MATCH_CONSTRAINT
            if (r3 == r4) goto L32
            x.e$b r3 = r2.w()
            x.e$b r5 = x.e.b.MATCH_PARENT
            if (r3 == r5) goto L32
            x.e$b r3 = r2.K()
            if (r3 == r4) goto L32
            x.e$b r3 = r2.K()
            if (r3 != r5) goto L37
        L32:
            java.util.ArrayList r3 = r6.f52017a
            r3.add(r2)
        L37:
            int r1 = r1 + 1
            goto Lc
        L3a:
            r7.S0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y.C2968b.e(x.f):void");
    }
}
