package H3;

import B3.InterfaceC0501i;
import B3.InterfaceC0517z;
import B3.J;
import B3.Z;
import B3.g0;
import B3.i0;
import H3.q;
import J3.g;
import J3.k;
import O2.C0897l1;
import O2.C0936z0;
import O2.H1;
import P2.v0;
import V2.C1056m;
import V2.InterfaceC1065w;
import V2.y;
import android.net.Uri;
import android.text.TextUtils;
import b4.AbstractC1217h;
import b4.F;
import b4.InterfaceC1211b;
import b4.S;
import d4.AbstractC1684a;
import d4.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import q3.C2540a;
import z3.C3028H;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements InterfaceC0517z, k.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Z f2492A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f2493a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J3.k f2494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f2495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final S f2496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y f2497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC1065w.a f2498g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final F f2499h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final J.a f2500i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC1211b f2501j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InterfaceC0501i f2504m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f2505n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f2506o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f2507p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v0 f2508q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f2510s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public InterfaceC0517z.a f2511t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2512u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i0 f2513v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f2517z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q.b f2509r = new b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final IdentityHashMap f2502k = new IdentityHashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f2503l = new t();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public q[] f2514w = new q[0];

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public q[] f2515x = new q[0];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int[][] f2516y = new int[0][];

    public class b implements q.b {
        public b() {
        }

        @Override // B3.Z.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void j(q qVar) {
            l.this.f2511t.j(l.this);
        }

        @Override // H3.q.b
        public void n(Uri uri) {
            l.this.f2494c.g(uri);
        }

        @Override // H3.q.b
        public void onPrepared() {
            if (l.j(l.this) > 0) {
                return;
            }
            int i9 = 0;
            for (q qVar : l.this.f2514w) {
                i9 += qVar.u().f590a;
            }
            g0[] g0VarArr = new g0[i9];
            int i10 = 0;
            for (q qVar2 : l.this.f2514w) {
                int i11 = qVar2.u().f590a;
                int i12 = 0;
                while (i12 < i11) {
                    g0VarArr[i10] = qVar2.u().b(i12);
                    i12++;
                    i10++;
                }
            }
            l.this.f2513v = new i0(g0VarArr);
            l.this.f2511t.e(l.this);
        }
    }

    public l(h hVar, J3.k kVar, g gVar, S s9, AbstractC1217h abstractC1217h, y yVar, InterfaceC1065w.a aVar, F f9, J.a aVar2, InterfaceC1211b interfaceC1211b, InterfaceC0501i interfaceC0501i, boolean z9, int i9, boolean z10, v0 v0Var, long j9) {
        this.f2493a = hVar;
        this.f2494c = kVar;
        this.f2495d = gVar;
        this.f2496e = s9;
        this.f2497f = yVar;
        this.f2498g = aVar;
        this.f2499h = f9;
        this.f2500i = aVar2;
        this.f2501j = interfaceC1211b;
        this.f2504m = interfaceC0501i;
        this.f2505n = z9;
        this.f2506o = i9;
        this.f2507p = z10;
        this.f2508q = v0Var;
        this.f2510s = j9;
        this.f2492A = interfaceC0501i.a(new Z[0]);
    }

    public static Map A(List list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap map = new HashMap();
        int i9 = 0;
        while (i9 < arrayList.size()) {
            C1056m c1056mG = (C1056m) list.get(i9);
            String str = c1056mG.f10008d;
            i9++;
            int i10 = i9;
            while (i10 < arrayList.size()) {
                C1056m c1056m = (C1056m) arrayList.get(i10);
                if (TextUtils.equals(c1056m.f10008d, str)) {
                    c1056mG = c1056mG.g(c1056m);
                    arrayList.remove(i10);
                } else {
                    i10++;
                }
            }
            map.put(str, c1056mG);
        }
        return map;
    }

    public static C0936z0 B(C0936z0 c0936z0) {
        String strN = k0.N(c0936z0.f6464j, 2);
        return new C0936z0.b().U(c0936z0.f6456a).W(c0936z0.f6457c).M(c0936z0.f6466l).g0(d4.F.g(strN)).K(strN).Z(c0936z0.f6465k).I(c0936z0.f6461g).b0(c0936z0.f6462h).n0(c0936z0.f6472r).S(c0936z0.f6473s).R(c0936z0.f6474t).i0(c0936z0.f6459e).e0(c0936z0.f6460f).G();
    }

    public static /* synthetic */ int j(l lVar) {
        int i9 = lVar.f2512u - 1;
        lVar.f2512u = i9;
        return i9;
    }

    public static C0936z0 z(C0936z0 c0936z0, C0936z0 c0936z02, boolean z9) {
        String strN;
        C2540a c2540a;
        int i9;
        String str;
        String str2;
        int i10;
        int i11;
        if (c0936z02 != null) {
            strN = c0936z02.f6464j;
            c2540a = c0936z02.f6465k;
            i10 = c0936z02.f6480z;
            i9 = c0936z02.f6459e;
            i11 = c0936z02.f6460f;
            str = c0936z02.f6458d;
            str2 = c0936z02.f6457c;
        } else {
            strN = k0.N(c0936z0.f6464j, 1);
            c2540a = c0936z0.f6465k;
            if (z9) {
                i10 = c0936z0.f6480z;
                i9 = c0936z0.f6459e;
                i11 = c0936z0.f6460f;
                str = c0936z0.f6458d;
                str2 = c0936z0.f6457c;
            } else {
                i9 = 0;
                str = null;
                str2 = null;
                i10 = -1;
                i11 = 0;
            }
        }
        return new C0936z0.b().U(c0936z0.f6456a).W(str2).M(c0936z0.f6466l).g0(d4.F.g(strN)).K(strN).Z(c2540a).I(z9 ? c0936z0.f6461g : -1).b0(z9 ? c0936z0.f6462h : -1).J(i10).i0(i9).e0(i11).X(str).G();
    }

    public void C() {
        this.f2494c.f(this);
        for (q qVar : this.f2514w) {
            qVar.h0();
        }
        this.f2511t = null;
    }

    @Override // J3.k.b
    public boolean a(Uri uri, F.c cVar, boolean z9) {
        boolean zC0 = true;
        for (q qVar : this.f2514w) {
            zC0 &= qVar.c0(uri, cVar, z9);
        }
        this.f2511t.j(this);
        return zC0;
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public boolean b() {
        return this.f2492A.b();
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public long c() {
        return this.f2492A.c();
    }

    @Override // B3.InterfaceC0517z
    public long d(long j9, H1 h12) {
        for (q qVar : this.f2515x) {
            if (qVar.S()) {
                return qVar.d(j9, h12);
            }
        }
        return j9;
    }

    @Override // J3.k.b
    public void e() {
        for (q qVar : this.f2514w) {
            qVar.d0();
        }
        this.f2511t.j(this);
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public boolean f(long j9) {
        if (this.f2513v != null) {
            return this.f2492A.f(j9);
        }
        for (q qVar : this.f2514w) {
            qVar.B();
        }
        return false;
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public long g() {
        return this.f2492A.g();
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public void h(long j9) {
        this.f2492A.h(j9);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00df  */
    @Override // B3.InterfaceC0517z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long i(Z3.s[] r22, boolean[] r23, B3.Y[] r24, boolean[] r25, long r26) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H3.l.i(Z3.s[], boolean[], B3.Y[], boolean[], long):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    @Override // B3.InterfaceC0517z
    public List k(List list) {
        int[] iArr;
        i0 i0VarU;
        int iM;
        l lVar = this;
        J3.g gVar = (J3.g) AbstractC1684a.e(lVar.f2494c.e());
        boolean z9 = !gVar.f3172e.isEmpty();
        int length = lVar.f2514w.length - gVar.f3175h.size();
        int i9 = 0;
        if (z9) {
            q qVar = lVar.f2514w[0];
            iArr = lVar.f2516y[0];
            i0VarU = qVar.u();
            iM = qVar.M();
        } else {
            iArr = new int[0];
            i0VarU = i0.f587e;
            iM = 0;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z10 = false;
        boolean z11 = false;
        while (it.hasNext()) {
            Z3.s sVar = (Z3.s) it.next();
            g0 g0VarK = sVar.k();
            int iC = i0VarU.c(g0VarK);
            if (iC == -1) {
                ?? r15 = z9;
                while (true) {
                    q[] qVarArr = lVar.f2514w;
                    if (r15 >= qVarArr.length) {
                        break;
                    }
                    if (qVarArr[r15].u().c(g0VarK) != -1) {
                        int i10 = r15 < length ? 1 : 2;
                        int[] iArr2 = lVar.f2516y[r15];
                        for (int i11 = 0; i11 < sVar.length(); i11++) {
                            arrayList.add(new C3028H(i10, iArr2[sVar.d(i11)]));
                        }
                    } else {
                        lVar = this;
                        r15++;
                    }
                }
            } else if (iC == iM) {
                for (int i12 = 0; i12 < sVar.length(); i12++) {
                    arrayList.add(new C3028H(i9, iArr[sVar.d(i12)]));
                }
                z11 = true;
            } else {
                z10 = true;
            }
            lVar = this;
            i9 = 0;
        }
        if (z10 && !z11) {
            int i13 = iArr[0];
            int i14 = ((g.b) gVar.f3172e.get(i13)).f3186b.f6463i;
            for (int i15 = 1; i15 < iArr.length; i15++) {
                int i16 = ((g.b) gVar.f3172e.get(iArr[i15])).f3186b.f6463i;
                if (i16 < i14) {
                    i13 = iArr[i15];
                    i14 = i16;
                }
            }
            arrayList.add(new C3028H(0, i13));
        }
        return arrayList;
    }

    @Override // B3.InterfaceC0517z
    public long l(long j9) {
        q[] qVarArr = this.f2515x;
        if (qVarArr.length > 0) {
            boolean zK0 = qVarArr[0].k0(j9, false);
            int i9 = 1;
            while (true) {
                q[] qVarArr2 = this.f2515x;
                if (i9 >= qVarArr2.length) {
                    break;
                }
                qVarArr2[i9].k0(j9, zK0);
                i9++;
            }
            if (zK0) {
                this.f2503l.b();
            }
        }
        return j9;
    }

    @Override // B3.InterfaceC0517z
    public long m() {
        return -9223372036854775807L;
    }

    @Override // B3.InterfaceC0517z
    public void p() throws C0897l1 {
        for (q qVar : this.f2514w) {
            qVar.p();
        }
    }

    @Override // B3.InterfaceC0517z
    public void s(InterfaceC0517z.a aVar, long j9) {
        this.f2511t = aVar;
        this.f2494c.b(this);
        x(j9);
    }

    public final void t(long j9, List list, List list2, List list3, Map map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i9 = 0; i9 < list.size(); i9++) {
            String str = ((g.a) list.get(i9)).f3184d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z9 = true;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    if (k0.c(str, ((g.a) list.get(i10)).f3184d)) {
                        g.a aVar = (g.a) list.get(i10);
                        arrayList3.add(Integer.valueOf(i10));
                        arrayList.add(aVar.f3181a);
                        arrayList2.add(aVar.f3182b);
                        z9 &= k0.M(aVar.f3182b.f6464j, 1) == 1;
                    }
                }
                String str2 = "audio:" + str;
                q qVarY = y(str2, 1, (Uri[]) arrayList.toArray((Uri[]) k0.k(new Uri[0])), (C0936z0[]) arrayList2.toArray(new C0936z0[0]), null, Collections.emptyList(), map, j9);
                list3.add(w5.f.l(arrayList3));
                list2.add(qVarY);
                if (this.f2505n && z9) {
                    qVarY.f0(new g0[]{new g0(str2, (C0936z0[]) arrayList2.toArray(new C0936z0[0]))}, 0, new int[0]);
                }
            }
        }
    }

    @Override // B3.InterfaceC0517z
    public i0 u() {
        return (i0) AbstractC1684a.e(this.f2513v);
    }

    @Override // B3.InterfaceC0517z
    public void v(long j9, boolean z9) {
        for (q qVar : this.f2515x) {
            qVar.v(j9, z9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(J3.g r21, long r22, java.util.List r24, java.util.List r25, java.util.Map r26) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H3.l.w(J3.g, long, java.util.List, java.util.List, java.util.Map):void");
    }

    public final void x(long j9) {
        char c9 = 0;
        int i9 = 1;
        J3.g gVar = (J3.g) AbstractC1684a.e(this.f2494c.e());
        Map mapA = this.f2507p ? A(gVar.f3180m) : Collections.emptyMap();
        boolean z9 = !gVar.f3172e.isEmpty();
        List list = gVar.f3174g;
        List list2 = gVar.f3175h;
        this.f2512u = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z9) {
            w(gVar, j9, arrayList, arrayList2, mapA);
        }
        t(j9, list, arrayList, arrayList2, mapA);
        this.f2517z = arrayList.size();
        int i10 = 0;
        while (i10 < list2.size()) {
            g.a aVar = (g.a) list2.get(i10);
            String str = "subtitle:" + i10 + ":" + aVar.f3184d;
            Uri[] uriArr = new Uri[i9];
            uriArr[c9] = aVar.f3181a;
            C0936z0[] c0936z0Arr = new C0936z0[i9];
            c0936z0Arr[c9] = aVar.f3182b;
            ArrayList arrayList3 = arrayList2;
            int i11 = i10;
            q qVarY = y(str, 3, uriArr, c0936z0Arr, null, Collections.emptyList(), mapA, j9);
            arrayList3.add(new int[]{i11});
            arrayList.add(qVarY);
            qVarY.f0(new g0[]{new g0(str, aVar.f3182b)}, 0, new int[0]);
            i10 = i11 + 1;
            arrayList2 = arrayList3;
            c9 = 0;
            i9 = 1;
        }
        this.f2514w = (q[]) arrayList.toArray(new q[0]);
        this.f2516y = (int[][]) arrayList2.toArray(new int[0][]);
        this.f2512u = this.f2514w.length;
        for (int i12 = 0; i12 < this.f2517z; i12++) {
            this.f2514w[i12].o0(true);
        }
        for (q qVar : this.f2514w) {
            qVar.B();
        }
        this.f2515x = this.f2514w;
    }

    public final q y(String str, int i9, Uri[] uriArr, C0936z0[] c0936z0Arr, C0936z0 c0936z0, List list, Map map, long j9) {
        return new q(str, i9, this.f2509r, new f(this.f2493a, this.f2494c, uriArr, c0936z0Arr, this.f2495d, this.f2496e, this.f2503l, this.f2510s, list, this.f2508q, null), map, this.f2501j, j9, c0936z0, this.f2497f, this.f2498g, this.f2499h, this.f2500i, this.f2506o);
    }
}
