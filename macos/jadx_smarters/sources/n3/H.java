package n3;

import O2.C0897l1;
import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.extractor.g;
import d3.AbstractC1677n;
import d3.InterfaceC1672i;
import d3.InterfaceC1673j;
import d3.InterfaceC1674k;
import d3.InterfaceC1678o;
import d4.AbstractC1684a;
import d4.L;
import d4.M;
import d4.Z;
import d4.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import n3.I;
import okio.Segment;

/* JADX INFO: loaded from: classes3.dex */
public final class H implements InterfaceC1672i {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final InterfaceC1678o f44940t = new InterfaceC1678o() { // from class: n3.G
        @Override // d3.InterfaceC1678o
        public /* synthetic */ InterfaceC1672i[] a(Uri uri, Map map) {
            return AbstractC1677n.a(this, uri, map);
        }

        @Override // d3.InterfaceC1678o
        public final InterfaceC1672i[] b() {
            return H.w();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f44943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M f44944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseIntArray f44945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final I.c f44946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseArray f44947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f44948h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseBooleanArray f44949i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final F f44950j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public E f44951k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InterfaceC1674k f44952l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f44953m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f44954n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f44955o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f44956p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public I f44957q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f44958r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f44959s;

    public class a implements InterfaceC2247B {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final L f44960a = new L(new byte[4]);

        public a() {
        }

        @Override // n3.InterfaceC2247B
        public void a(Z z9, InterfaceC1674k interfaceC1674k, I.d dVar) {
        }

        @Override // n3.InterfaceC2247B
        public void b(M m9) {
            if (m9.H() == 0 && (m9.H() & 128) != 0) {
                m9.V(6);
                int iA = m9.a() / 4;
                for (int i9 = 0; i9 < iA; i9++) {
                    m9.k(this.f44960a, 4);
                    int iH = this.f44960a.h(16);
                    this.f44960a.r(3);
                    if (iH == 0) {
                        this.f44960a.r(13);
                    } else {
                        int iH2 = this.f44960a.h(13);
                        if (H.this.f44947g.get(iH2) == null) {
                            H.this.f44947g.put(iH2, new C(H.this.new b(iH2)));
                            H.k(H.this);
                        }
                    }
                }
                if (H.this.f44941a != 2) {
                    H.this.f44947g.remove(0);
                }
            }
        }
    }

    public class b implements InterfaceC2247B {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final L f44962a = new L(new byte[5]);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseArray f44963b = new SparseArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseIntArray f44964c = new SparseIntArray();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f44965d;

        public b(int i9) {
            this.f44965d = i9;
        }

        @Override // n3.InterfaceC2247B
        public void a(Z z9, InterfaceC1674k interfaceC1674k, I.d dVar) {
        }

        @Override // n3.InterfaceC2247B
        public void b(M m9) {
            Z z9;
            if (m9.H() != 2) {
                return;
            }
            if (H.this.f44941a == 1 || H.this.f44941a == 2 || H.this.f44953m == 1) {
                z9 = (Z) H.this.f44943c.get(0);
            } else {
                z9 = new Z(((Z) H.this.f44943c.get(0)).c());
                H.this.f44943c.add(z9);
            }
            if ((m9.H() & 128) == 0) {
                return;
            }
            m9.V(1);
            int iN = m9.N();
            int i9 = 3;
            m9.V(3);
            m9.k(this.f44962a, 2);
            this.f44962a.r(3);
            int i10 = 13;
            H.this.f44959s = this.f44962a.h(13);
            m9.k(this.f44962a, 2);
            int i11 = 4;
            this.f44962a.r(4);
            m9.V(this.f44962a.h(12));
            if (H.this.f44941a == 2 && H.this.f44957q == null) {
                I.b bVar = new I.b(21, null, null, k0.f39782f);
                H h9 = H.this;
                h9.f44957q = h9.f44946f.b(21, bVar);
                if (H.this.f44957q != null) {
                    H.this.f44957q.a(z9, H.this.f44952l, new I.d(iN, 21, Segment.SIZE));
                }
            }
            this.f44963b.clear();
            this.f44964c.clear();
            int iA = m9.a();
            while (iA > 0) {
                m9.k(this.f44962a, 5);
                int iH = this.f44962a.h(8);
                this.f44962a.r(i9);
                int iH2 = this.f44962a.h(i10);
                this.f44962a.r(i11);
                int iH3 = this.f44962a.h(12);
                I.b bVarC = c(m9, iH3);
                if (iH == 6 || iH == 5) {
                    iH = bVarC.f44970a;
                }
                iA -= iH3 + 5;
                int i12 = H.this.f44941a == 2 ? iH : iH2;
                if (!H.this.f44948h.get(i12)) {
                    I iB = (H.this.f44941a == 2 && iH == 21) ? H.this.f44957q : H.this.f44946f.b(iH, bVarC);
                    if (H.this.f44941a != 2 || iH2 < this.f44964c.get(i12, Segment.SIZE)) {
                        this.f44964c.put(i12, iH2);
                        this.f44963b.put(i12, iB);
                    }
                }
                i9 = 3;
                i11 = 4;
                i10 = 13;
            }
            int size = this.f44964c.size();
            for (int i13 = 0; i13 < size; i13++) {
                int iKeyAt = this.f44964c.keyAt(i13);
                int iValueAt = this.f44964c.valueAt(i13);
                H.this.f44948h.put(iKeyAt, true);
                H.this.f44949i.put(iValueAt, true);
                I i14 = (I) this.f44963b.valueAt(i13);
                if (i14 != null) {
                    if (i14 != H.this.f44957q) {
                        i14.a(z9, H.this.f44952l, new I.d(iN, iKeyAt, Segment.SIZE));
                    }
                    H.this.f44947g.put(iValueAt, i14);
                }
            }
            if (H.this.f44941a != 2) {
                H.this.f44947g.remove(this.f44965d);
                H h10 = H.this;
                h10.f44953m = h10.f44941a == 1 ? 0 : H.this.f44953m - 1;
                if (H.this.f44953m != 0) {
                    return;
                } else {
                    H.this.f44952l.q();
                }
            } else {
                if (H.this.f44954n) {
                    return;
                }
                H.this.f44952l.q();
                H.this.f44953m = 0;
            }
            H.this.f44954n = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final n3.I.b c(d4.M r14, int r15) {
            /*
                Method dump skipped, instruction units count: 210
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: n3.H.b.c(d4.M, int):n3.I$b");
        }
    }

    public H() {
        this(0);
    }

    public H(int i9) {
        this(1, i9, 112800);
    }

    public H(int i9, int i10, int i11) {
        this(i9, new Z(0L), new C2257j(i10), i11);
    }

    public H(int i9, Z z9, I.c cVar) {
        this(i9, z9, cVar, 112800);
    }

    public H(int i9, Z z9, I.c cVar, int i10) {
        this.f44946f = (I.c) AbstractC1684a.e(cVar);
        this.f44942b = i10;
        this.f44941a = i9;
        if (i9 == 1 || i9 == 2) {
            this.f44943c = Collections.singletonList(z9);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f44943c = arrayList;
            arrayList.add(z9);
        }
        this.f44944d = new M(new byte[9400], 0);
        this.f44948h = new SparseBooleanArray();
        this.f44949i = new SparseBooleanArray();
        this.f44947g = new SparseArray();
        this.f44945e = new SparseIntArray();
        this.f44950j = new F(i10);
        this.f44952l = InterfaceC1674k.f39600c0;
        this.f44959s = -1;
        y();
    }

    public static /* synthetic */ int k(H h9) {
        int i9 = h9.f44953m;
        h9.f44953m = i9 + 1;
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC1672i[] w() {
        return new InterfaceC1672i[]{new H()};
    }

    private void x(long j9) {
        InterfaceC1674k interfaceC1674k;
        com.google.android.exoplayer2.extractor.g bVar;
        if (this.f44955o) {
            return;
        }
        this.f44955o = true;
        if (this.f44950j.b() != -9223372036854775807L) {
            E e9 = new E(this.f44950j.c(), this.f44950j.b(), j9, this.f44959s, this.f44942b);
            this.f44951k = e9;
            interfaceC1674k = this.f44952l;
            bVar = e9.b();
        } else {
            interfaceC1674k = this.f44952l;
            bVar = new g.b(this.f44950j.b());
        }
        interfaceC1674k.n(bVar);
    }

    @Override // d3.InterfaceC1672i
    public void a(long j9, long j10) {
        E e9;
        AbstractC1684a.g(this.f44941a != 2);
        int size = this.f44943c.size();
        for (int i9 = 0; i9 < size; i9++) {
            Z z9 = (Z) this.f44943c.get(i9);
            boolean z10 = z9.e() == -9223372036854775807L;
            if (!z10) {
                long jC = z9.c();
                z10 = (jC == -9223372036854775807L || jC == 0 || jC == j10) ? false : true;
            }
            if (z10) {
                z9.h(j10);
            }
        }
        if (j10 != 0 && (e9 = this.f44951k) != null) {
            e9.h(j10);
        }
        this.f44944d.Q(0);
        this.f44945e.clear();
        for (int i10 = 0; i10 < this.f44947g.size(); i10++) {
            ((I) this.f44947g.valueAt(i10)).c();
        }
        this.f44958r = 0;
    }

    @Override // d3.InterfaceC1672i
    public void b(InterfaceC1674k interfaceC1674k) {
        this.f44952l = interfaceC1674k;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e4  */
    @Override // d3.InterfaceC1672i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int d(d3.InterfaceC1673j r17, d3.t r18) throws O2.C0897l1 {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.H.d(d3.j, d3.t):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // d3.InterfaceC1672i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean h(d3.InterfaceC1673j r7) {
        /*
            r6 = this;
            d4.M r0 = r6.f44944d
            byte[] r0 = r0.e()
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.s(r0, r2, r1)
            r1 = 0
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L29
            r3 = 0
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r1 = r1 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.q(r1)
            r7 = 1
            return r7
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.H.h(d3.j):boolean");
    }

    @Override // d3.InterfaceC1672i
    public void release() {
    }

    public final boolean u(InterfaceC1673j interfaceC1673j) {
        byte[] bArrE = this.f44944d.e();
        if (9400 - this.f44944d.f() < 188) {
            int iA = this.f44944d.a();
            if (iA > 0) {
                System.arraycopy(bArrE, this.f44944d.f(), bArrE, 0, iA);
            }
            this.f44944d.S(bArrE, iA);
        }
        while (this.f44944d.a() < 188) {
            int iG = this.f44944d.g();
            int i9 = interfaceC1673j.read(bArrE, iG, 9400 - iG);
            if (i9 == -1) {
                return false;
            }
            this.f44944d.T(iG + i9);
        }
        return true;
    }

    public final int v() throws C0897l1 {
        int iF = this.f44944d.f();
        int iG = this.f44944d.g();
        int iA = J.a(this.f44944d.e(), iF, iG);
        this.f44944d.U(iA);
        int i9 = iA + 188;
        if (i9 > iG) {
            int i10 = this.f44958r + (iA - iF);
            this.f44958r = i10;
            if (this.f44941a == 2 && i10 > 376) {
                throw C0897l1.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.f44958r = 0;
        }
        return i9;
    }

    public final void y() {
        this.f44948h.clear();
        this.f44947g.clear();
        SparseArray sparseArrayA = this.f44946f.a();
        int size = sparseArrayA.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.f44947g.put(sparseArrayA.keyAt(i9), (I) sparseArrayA.valueAt(i9));
        }
        this.f44947g.put(0, new C(new a()));
        this.f44957q = null;
    }

    public final boolean z(int i9) {
        return this.f44941a == 2 || this.f44954n || !this.f44949i.get(i9, false);
    }
}
