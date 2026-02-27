package D3;

import B3.C0512u;
import B3.C0515x;
import B3.J;
import B3.X;
import B3.Y;
import B3.Z;
import O2.A0;
import O2.C0936z0;
import O2.H1;
import V2.InterfaceC1065w;
import V2.y;
import b4.F;
import b4.G;
import b4.InterfaceC1211b;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.k0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class i implements Y, Z, G.b, G.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1387a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f1388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0936z0[] f1389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean[] f1390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f1391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Z.a f1392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final J.a f1393h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final F f1394i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final G f1395j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h f1396k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f1397l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f1398m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final X f1399n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final X[] f1400o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f1401p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f f1402q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C0936z0 f1403r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b f1404s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f1405t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f1406u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1407v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public D3.a f1408w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f1409x;

    public final class a implements Y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f1410a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final X f1411c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f1412d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f1413e;

        public a(i iVar, X x9, int i9) {
            this.f1410a = iVar;
            this.f1411c = x9;
            this.f1412d = i9;
        }

        private void b() {
            if (this.f1413e) {
                return;
            }
            i.this.f1393h.h(i.this.f1388c[this.f1412d], i.this.f1389d[this.f1412d], 0, null, i.this.f1406u);
            this.f1413e = true;
        }

        @Override // B3.Y
        public void a() {
        }

        public void c() {
            AbstractC1684a.g(i.this.f1390e[this.f1412d]);
            i.this.f1390e[this.f1412d] = false;
        }

        @Override // B3.Y
        public boolean e() {
            return !i.this.I() && this.f1411c.K(i.this.f1409x);
        }

        @Override // B3.Y
        public int n(long j9) {
            if (i.this.I()) {
                return 0;
            }
            int iE = this.f1411c.E(j9, i.this.f1409x);
            if (i.this.f1408w != null) {
                iE = Math.min(iE, i.this.f1408w.i(this.f1412d + 1) - this.f1411c.C());
            }
            this.f1411c.e0(iE);
            if (iE > 0) {
                b();
            }
            return iE;
        }

        @Override // B3.Y
        public int q(A0 a02, U2.g gVar, int i9) {
            if (i.this.I()) {
                return -3;
            }
            if (i.this.f1408w != null && i.this.f1408w.i(this.f1412d + 1) <= this.f1411c.C()) {
                return -3;
            }
            b();
            return this.f1411c.S(a02, gVar, i9, i.this.f1409x);
        }
    }

    public interface b {
        void a(i iVar);
    }

    public i(int i9, int[] iArr, C0936z0[] c0936z0Arr, j jVar, Z.a aVar, InterfaceC1211b interfaceC1211b, long j9, y yVar, InterfaceC1065w.a aVar2, F f9, J.a aVar3) {
        this.f1387a = i9;
        int i10 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f1388c = iArr;
        this.f1389d = c0936z0Arr == null ? new C0936z0[0] : c0936z0Arr;
        this.f1391f = jVar;
        this.f1392g = aVar;
        this.f1393h = aVar3;
        this.f1394i = f9;
        this.f1395j = new G("ChunkSampleStream");
        this.f1396k = new h();
        ArrayList arrayList = new ArrayList();
        this.f1397l = arrayList;
        this.f1398m = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f1400o = new X[length];
        this.f1390e = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        X[] xArr = new X[i11];
        X xK = X.k(interfaceC1211b, yVar, aVar2);
        this.f1399n = xK;
        iArr2[0] = i9;
        xArr[0] = xK;
        while (i10 < length) {
            X xL = X.l(interfaceC1211b);
            this.f1400o[i10] = xL;
            int i12 = i10 + 1;
            xArr[i12] = xL;
            iArr2[i12] = this.f1388c[i10];
            i10 = i12;
        }
        this.f1401p = new c(iArr2, xArr);
        this.f1405t = j9;
        this.f1406u = j9;
    }

    public final void B(int i9) {
        int iMin = Math.min(O(i9, 0), this.f1407v);
        if (iMin > 0) {
            k0.a1(this.f1397l, 0, iMin);
            this.f1407v -= iMin;
        }
    }

    public final void C(int i9) {
        AbstractC1684a.g(!this.f1395j.j());
        int size = this.f1397l.size();
        while (true) {
            if (i9 >= size) {
                i9 = -1;
                break;
            } else if (!G(i9)) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 == -1) {
            return;
        }
        long j9 = F().f1383i;
        D3.a aVarD = D(i9);
        if (this.f1397l.isEmpty()) {
            this.f1405t = this.f1406u;
        }
        this.f1409x = false;
        this.f1393h.C(this.f1387a, aVarD.f1382h, j9);
    }

    public final D3.a D(int i9) {
        D3.a aVar = (D3.a) this.f1397l.get(i9);
        ArrayList arrayList = this.f1397l;
        k0.a1(arrayList, i9, arrayList.size());
        this.f1407v = Math.max(this.f1407v, this.f1397l.size());
        X x9 = this.f1399n;
        int i10 = 0;
        while (true) {
            x9.u(aVar.i(i10));
            X[] xArr = this.f1400o;
            if (i10 >= xArr.length) {
                return aVar;
            }
            x9 = xArr[i10];
            i10++;
        }
    }

    public j E() {
        return this.f1391f;
    }

    public final D3.a F() {
        return (D3.a) this.f1397l.get(r0.size() - 1);
    }

    public final boolean G(int i9) {
        int iC;
        D3.a aVar = (D3.a) this.f1397l.get(i9);
        if (this.f1399n.C() > aVar.i(0)) {
            return true;
        }
        int i10 = 0;
        do {
            X[] xArr = this.f1400o;
            if (i10 >= xArr.length) {
                return false;
            }
            iC = xArr[i10].C();
            i10++;
        } while (iC <= aVar.i(i10));
        return true;
    }

    public final boolean H(f fVar) {
        return fVar instanceof D3.a;
    }

    public boolean I() {
        return this.f1405t != -9223372036854775807L;
    }

    public final void J() {
        int iO = O(this.f1399n.C(), this.f1407v - 1);
        while (true) {
            int i9 = this.f1407v;
            if (i9 > iO) {
                return;
            }
            this.f1407v = i9 + 1;
            K(i9);
        }
    }

    public final void K(int i9) {
        D3.a aVar = (D3.a) this.f1397l.get(i9);
        C0936z0 c0936z0 = aVar.f1379e;
        if (!c0936z0.equals(this.f1403r)) {
            this.f1393h.h(this.f1387a, c0936z0, aVar.f1380f, aVar.f1381g, aVar.f1382h);
        }
        this.f1403r = c0936z0;
    }

    @Override // b4.G.b
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void t(f fVar, long j9, long j10, boolean z9) {
        this.f1402q = null;
        this.f1408w = null;
        C0512u c0512u = new C0512u(fVar.f1376a, fVar.f1377c, fVar.f(), fVar.e(), j9, j10, fVar.b());
        this.f1394i.d(fVar.f1376a);
        this.f1393h.q(c0512u, fVar.f1378d, this.f1387a, fVar.f1379e, fVar.f1380f, fVar.f1381g, fVar.f1382h, fVar.f1383i);
        if (z9) {
            return;
        }
        if (I()) {
            R();
        } else if (H(fVar)) {
            D(this.f1397l.size() - 1);
            if (this.f1397l.isEmpty()) {
                this.f1405t = this.f1406u;
            }
        }
        this.f1392g.j(this);
    }

    @Override // b4.G.b
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void W(f fVar, long j9, long j10) {
        this.f1402q = null;
        this.f1391f.c(fVar);
        C0512u c0512u = new C0512u(fVar.f1376a, fVar.f1377c, fVar.f(), fVar.e(), j9, j10, fVar.b());
        this.f1394i.d(fVar.f1376a);
        this.f1393h.t(c0512u, fVar.f1378d, this.f1387a, fVar.f1379e, fVar.f1380f, fVar.f1381g, fVar.f1382h, fVar.f1383i);
        this.f1392g.j(this);
    }

    @Override // b4.G.b
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public G.c j(f fVar, long j9, long j10, IOException iOException, int i9) {
        G.c cVarH;
        long jB = fVar.b();
        boolean zH = H(fVar);
        int size = this.f1397l.size() - 1;
        boolean z9 = (jB != 0 && zH && G(size)) ? false : true;
        C0512u c0512u = new C0512u(fVar.f1376a, fVar.f1377c, fVar.f(), fVar.e(), j9, j10, jB);
        F.c cVar = new F.c(c0512u, new C0515x(fVar.f1378d, this.f1387a, fVar.f1379e, fVar.f1380f, fVar.f1381g, k0.x1(fVar.f1382h), k0.x1(fVar.f1383i)), iOException, i9);
        if (!this.f1391f.g(fVar, z9, cVar, this.f1394i)) {
            cVarH = null;
        } else if (z9) {
            cVarH = G.f17500f;
            if (zH) {
                AbstractC1684a.g(D(size) == fVar);
                if (this.f1397l.isEmpty()) {
                    this.f1405t = this.f1406u;
                }
            }
        } else {
            AbstractC1681B.j("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            cVarH = null;
        }
        if (cVarH == null) {
            long jC = this.f1394i.c(cVar);
            cVarH = jC != -9223372036854775807L ? G.h(false, jC) : G.f17501g;
        }
        boolean z10 = !cVarH.c();
        this.f1393h.v(c0512u, fVar.f1378d, this.f1387a, fVar.f1379e, fVar.f1380f, fVar.f1381g, fVar.f1382h, fVar.f1383i, iOException, z10);
        if (z10) {
            this.f1402q = null;
            this.f1394i.d(fVar.f1376a);
            this.f1392g.j(this);
        }
        return cVarH;
    }

    public final int O(int i9, int i10) {
        do {
            i10++;
            if (i10 >= this.f1397l.size()) {
                return this.f1397l.size() - 1;
            }
        } while (((D3.a) this.f1397l.get(i10)).i(0) <= i9);
        return i10 - 1;
    }

    public void P() {
        Q(null);
    }

    public void Q(b bVar) {
        this.f1404s = bVar;
        this.f1399n.R();
        for (X x9 : this.f1400o) {
            x9.R();
        }
        this.f1395j.m(this);
    }

    public final void R() {
        this.f1399n.V();
        for (X x9 : this.f1400o) {
            x9.V();
        }
    }

    public void S(long j9) {
        D3.a aVar;
        this.f1406u = j9;
        if (I()) {
            this.f1405t = j9;
            return;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f1397l.size(); i10++) {
            aVar = (D3.a) this.f1397l.get(i10);
            long j10 = aVar.f1382h;
            if (j10 == j9 && aVar.f1349l == -9223372036854775807L) {
                break;
            } else {
                if (j10 > j9) {
                    break;
                }
            }
        }
        aVar = null;
        if (aVar != null ? this.f1399n.Y(aVar.i(0)) : this.f1399n.Z(j9, j9 < c())) {
            this.f1407v = O(this.f1399n.C(), 0);
            X[] xArr = this.f1400o;
            int length = xArr.length;
            while (i9 < length) {
                xArr[i9].Z(j9, true);
                i9++;
            }
            return;
        }
        this.f1405t = j9;
        this.f1409x = false;
        this.f1397l.clear();
        this.f1407v = 0;
        if (!this.f1395j.j()) {
            this.f1395j.g();
            R();
            return;
        }
        this.f1399n.r();
        X[] xArr2 = this.f1400o;
        int length2 = xArr2.length;
        while (i9 < length2) {
            xArr2[i9].r();
            i9++;
        }
        this.f1395j.f();
    }

    public a T(long j9, int i9) {
        for (int i10 = 0; i10 < this.f1400o.length; i10++) {
            if (this.f1388c[i10] == i9) {
                AbstractC1684a.g(!this.f1390e[i10]);
                this.f1390e[i10] = true;
                this.f1400o[i10].Z(j9, true);
                return new a(this, this.f1400o[i10], i10);
            }
        }
        throw new IllegalStateException();
    }

    @Override // B3.Y
    public void a() throws IOException {
        this.f1395j.a();
        this.f1399n.N();
        if (this.f1395j.j()) {
            return;
        }
        this.f1391f.a();
    }

    @Override // B3.Z
    public boolean b() {
        return this.f1395j.j();
    }

    @Override // B3.Z
    public long c() {
        if (I()) {
            return this.f1405t;
        }
        if (this.f1409x) {
            return Long.MIN_VALUE;
        }
        return F().f1383i;
    }

    public long d(long j9, H1 h12) {
        return this.f1391f.d(j9, h12);
    }

    @Override // B3.Y
    public boolean e() {
        return !I() && this.f1399n.K(this.f1409x);
    }

    @Override // B3.Z
    public boolean f(long j9) {
        List listEmptyList;
        long j10;
        if (this.f1409x || this.f1395j.j() || this.f1395j.i()) {
            return false;
        }
        boolean zI = I();
        if (zI) {
            listEmptyList = Collections.emptyList();
            j10 = this.f1405t;
        } else {
            listEmptyList = this.f1398m;
            j10 = F().f1383i;
        }
        this.f1391f.h(j9, j10, listEmptyList, this.f1396k);
        h hVar = this.f1396k;
        boolean z9 = hVar.f1386b;
        f fVar = hVar.f1385a;
        hVar.a();
        if (z9) {
            this.f1405t = -9223372036854775807L;
            this.f1409x = true;
            return true;
        }
        if (fVar == null) {
            return false;
        }
        this.f1402q = fVar;
        if (H(fVar)) {
            D3.a aVar = (D3.a) fVar;
            if (zI) {
                long j11 = aVar.f1382h;
                long j12 = this.f1405t;
                if (j11 != j12) {
                    this.f1399n.b0(j12);
                    for (X x9 : this.f1400o) {
                        x9.b0(this.f1405t);
                    }
                }
                this.f1405t = -9223372036854775807L;
            }
            aVar.k(this.f1401p);
            this.f1397l.add(aVar);
        } else if (fVar instanceof m) {
            ((m) fVar).g(this.f1401p);
        }
        this.f1393h.z(new C0512u(fVar.f1376a, fVar.f1377c, this.f1395j.n(fVar, this, this.f1394i.b(fVar.f1378d))), fVar.f1378d, this.f1387a, fVar.f1379e, fVar.f1380f, fVar.f1381g, fVar.f1382h, fVar.f1383i);
        return true;
    }

    @Override // B3.Z
    public long g() {
        if (this.f1409x) {
            return Long.MIN_VALUE;
        }
        if (I()) {
            return this.f1405t;
        }
        long jMax = this.f1406u;
        D3.a aVarF = F();
        if (!aVarF.h()) {
            if (this.f1397l.size() > 1) {
                aVarF = (D3.a) this.f1397l.get(r2.size() - 2);
            } else {
                aVarF = null;
            }
        }
        if (aVarF != null) {
            jMax = Math.max(jMax, aVarF.f1383i);
        }
        return Math.max(jMax, this.f1399n.z());
    }

    @Override // B3.Z
    public void h(long j9) {
        if (this.f1395j.i() || I()) {
            return;
        }
        if (!this.f1395j.j()) {
            int iJ = this.f1391f.j(j9, this.f1398m);
            if (iJ < this.f1397l.size()) {
                C(iJ);
                return;
            }
            return;
        }
        f fVar = (f) AbstractC1684a.e(this.f1402q);
        if (!(H(fVar) && G(this.f1397l.size() - 1)) && this.f1391f.e(j9, fVar, this.f1398m)) {
            this.f1395j.f();
            if (H(fVar)) {
                this.f1408w = (D3.a) fVar;
            }
        }
    }

    @Override // B3.Y
    public int n(long j9) {
        if (I()) {
            return 0;
        }
        int iE = this.f1399n.E(j9, this.f1409x);
        D3.a aVar = this.f1408w;
        if (aVar != null) {
            iE = Math.min(iE, aVar.i(0) - this.f1399n.C());
        }
        this.f1399n.e0(iE);
        J();
        return iE;
    }

    @Override // b4.G.f
    public void o() {
        this.f1399n.T();
        for (X x9 : this.f1400o) {
            x9.T();
        }
        this.f1391f.release();
        b bVar = this.f1404s;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    @Override // B3.Y
    public int q(A0 a02, U2.g gVar, int i9) {
        if (I()) {
            return -3;
        }
        D3.a aVar = this.f1408w;
        if (aVar != null && aVar.i(0) <= this.f1399n.C()) {
            return -3;
        }
        J();
        return this.f1399n.S(a02, gVar, i9, this.f1409x);
    }

    public void v(long j9, boolean z9) {
        if (I()) {
            return;
        }
        int iX = this.f1399n.x();
        this.f1399n.q(j9, z9, true);
        int iX2 = this.f1399n.x();
        if (iX2 > iX) {
            long jY = this.f1399n.y();
            int i9 = 0;
            while (true) {
                X[] xArr = this.f1400o;
                if (i9 >= xArr.length) {
                    break;
                }
                xArr[i9].q(jY, z9, this.f1390e[i9]);
                i9++;
            }
        }
        B(iX2);
    }
}
