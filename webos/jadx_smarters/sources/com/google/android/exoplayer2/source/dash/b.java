package com.google.android.exoplayer2.source.dash;

import B3.InterfaceC0501i;
import B3.InterfaceC0517z;
import B3.J;
import B3.Y;
import B3.Z;
import B3.g0;
import B3.i0;
import B3.r;
import D3.i;
import F3.e;
import F3.g;
import F3.j;
import O2.C0936z0;
import O2.H1;
import P2.v0;
import V2.InterfaceC1065w;
import V2.y;
import Z3.s;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import b4.AbstractC1217h;
import b4.F;
import b4.H;
import b4.InterfaceC1211b;
import b4.S;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.d;
import d4.k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import w5.f;
import z3.C3028H;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements InterfaceC0517z, Z.a, i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25504a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a.InterfaceC0241a f25505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S f25506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y f25507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final F f25508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final E3.b f25509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f25510h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final H f25511i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC1211b f25512j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i0 f25513k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a[] f25514l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InterfaceC0501i f25515m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d f25516n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final J.a f25518p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC1065w.a f25519q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v0 f25520r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public InterfaceC0517z.a f25521s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Z f25524v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public F3.c f25525w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f25526x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f25527y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Pattern f25503z = Pattern.compile("CC([1-4])=(.+)");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Pattern f25502A = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public i[] f25522t = F(0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public E3.i[] f25523u = new E3.i[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IdentityHashMap f25517o = new IdentityHashMap();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f25528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f25529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f25530c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f25531d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f25532e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f25533f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f25534g;

        public a(int i9, int i10, int[] iArr, int i11, int i12, int i13, int i14) {
            this.f25529b = i9;
            this.f25528a = iArr;
            this.f25530c = i10;
            this.f25532e = i11;
            this.f25533f = i12;
            this.f25534g = i13;
            this.f25531d = i14;
        }

        public static a a(int[] iArr, int i9) {
            return new a(3, 1, iArr, i9, -1, -1, -1);
        }

        public static a b(int[] iArr, int i9) {
            return new a(5, 1, iArr, i9, -1, -1, -1);
        }

        public static a c(int i9) {
            return new a(5, 2, new int[0], -1, -1, -1, i9);
        }

        public static a d(int i9, int[] iArr, int i10, int i11, int i12) {
            return new a(i9, 0, iArr, i10, i11, i12, -1);
        }
    }

    public b(int i9, F3.c cVar, E3.b bVar, int i10, a.InterfaceC0241a interfaceC0241a, S s9, AbstractC1217h abstractC1217h, y yVar, InterfaceC1065w.a aVar, F f9, J.a aVar2, long j9, H h9, InterfaceC1211b interfaceC1211b, InterfaceC0501i interfaceC0501i, d.b bVar2, v0 v0Var) {
        this.f25504a = i9;
        this.f25525w = cVar;
        this.f25509g = bVar;
        this.f25526x = i10;
        this.f25505c = interfaceC0241a;
        this.f25506d = s9;
        this.f25507e = yVar;
        this.f25519q = aVar;
        this.f25508f = f9;
        this.f25518p = aVar2;
        this.f25510h = j9;
        this.f25511i = h9;
        this.f25512j = interfaceC1211b;
        this.f25515m = interfaceC0501i;
        this.f25520r = v0Var;
        this.f25516n = new d(cVar, bVar2, interfaceC1211b);
        this.f25524v = interfaceC0501i.a(this.f25522t);
        g gVarD = cVar.d(i10);
        List list = gVarD.f1971d;
        this.f25527y = list;
        Pair pairT = t(yVar, gVarD.f1970c, list);
        this.f25513k = (i0) pairT.first;
        this.f25514l = (a[]) pairT.second;
    }

    public static int[][] A(List list) {
        int iMin;
        e eVarW;
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i9 = 0; i9 < size; i9++) {
            sparseIntArray.put(((F3.a) list.get(i9)).f1923a, i9);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i9));
            arrayList.add(arrayList2);
            sparseArray.put(i9, arrayList2);
        }
        for (int i10 = 0; i10 < size; i10++) {
            F3.a aVar = (F3.a) list.get(i10);
            e eVarY = y(aVar.f1927e);
            if (eVarY == null) {
                eVarY = y(aVar.f1928f);
            }
            if (eVarY == null || (iMin = sparseIntArray.get(Integer.parseInt(eVarY.f1961b), -1)) == -1) {
                iMin = i10;
            }
            if (iMin == i10 && (eVarW = w(aVar.f1928f)) != null) {
                for (String str : k0.i1(eVarW.f1961b, ",")) {
                    int i11 = sparseIntArray.get(Integer.parseInt(str), -1);
                    if (i11 != -1) {
                        iMin = Math.min(iMin, i11);
                    }
                }
            }
            if (iMin != i10) {
                List list2 = (List) sparseArray.get(i10);
                List list3 = (List) sparseArray.get(iMin);
                list3.addAll(list2);
                sparseArray.put(i10, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i12 = 0; i12 < size2; i12++) {
            int[] iArrL = f.l((Collection) arrayList.get(i12));
            iArr[i12] = iArrL;
            Arrays.sort(iArrL);
        }
        return iArr;
    }

    public static boolean D(List list, int[] iArr) {
        for (int i9 : iArr) {
            List list2 = ((F3.a) list.get(i9)).f1925c;
            for (int i10 = 0; i10 < list2.size(); i10++) {
                if (!((j) list2.get(i10)).f1986e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int E(int i9, List list, int[][] iArr, boolean[] zArr, C0936z0[][] c0936z0Arr) {
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            if (D(list, iArr[i11])) {
                zArr[i11] = true;
                i10++;
            }
            C0936z0[] c0936z0ArrZ = z(list, iArr[i11]);
            c0936z0Arr[i11] = c0936z0ArrZ;
            if (c0936z0ArrZ.length != 0) {
                i10++;
            }
        }
        return i10;
    }

    public static i[] F(int i9) {
        return new i[i9];
    }

    public static C0936z0[] H(e eVar, Pattern pattern, C0936z0 c0936z0) {
        String str = eVar.f1961b;
        if (str == null) {
            return new C0936z0[]{c0936z0};
        }
        String[] strArrI1 = k0.i1(str, ";");
        C0936z0[] c0936z0Arr = new C0936z0[strArrI1.length];
        for (int i9 = 0; i9 < strArrI1.length; i9++) {
            Matcher matcher = pattern.matcher(strArrI1[i9]);
            if (!matcher.matches()) {
                return new C0936z0[]{c0936z0};
            }
            int i10 = Integer.parseInt(matcher.group(1));
            c0936z0Arr[i9] = c0936z0.b().U(c0936z0.f6456a + ":" + i10).H(i10).X(matcher.group(2)).G();
        }
        return c0936z0Arr;
    }

    public static void o(List list, g0[] g0VarArr, a[] aVarArr, int i9) {
        int i10 = 0;
        while (i10 < list.size()) {
            F3.f fVar = (F3.f) list.get(i10);
            g0VarArr[i9] = new g0(fVar.a() + ":" + i10, new C0936z0.b().U(fVar.a()).g0("application/x-emsg").G());
            aVarArr[i9] = a.c(i10);
            i10++;
            i9++;
        }
    }

    public static int q(y yVar, List list, int[][] iArr, int i9, boolean[] zArr, C0936z0[][] c0936z0Arr, g0[] g0VarArr, a[] aVarArr) {
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i9) {
            int[] iArr2 = iArr[i12];
            ArrayList arrayList = new ArrayList();
            for (int i14 : iArr2) {
                arrayList.addAll(((F3.a) list.get(i14)).f1925c);
            }
            int size = arrayList.size();
            C0936z0[] c0936z0Arr2 = new C0936z0[size];
            for (int i15 = 0; i15 < size; i15++) {
                C0936z0 c0936z0 = ((j) arrayList.get(i15)).f1983b;
                c0936z0Arr2[i15] = c0936z0.c(yVar.a(c0936z0));
            }
            F3.a aVar = (F3.a) list.get(iArr2[0]);
            int i16 = aVar.f1923a;
            String string = i16 != -1 ? Integer.toString(i16) : "unset:" + i12;
            int i17 = i13 + 1;
            if (zArr[i12]) {
                i10 = i13 + 2;
            } else {
                i10 = i17;
                i17 = -1;
            }
            if (c0936z0Arr[i12].length != 0) {
                i11 = i10 + 1;
            } else {
                i11 = i10;
                i10 = -1;
            }
            g0VarArr[i13] = new g0(string, c0936z0Arr2);
            aVarArr[i13] = a.d(aVar.f1924b, iArr2, i13, i17, i10);
            if (i17 != -1) {
                String str = string + ":emsg";
                g0VarArr[i17] = new g0(str, new C0936z0.b().U(str).g0("application/x-emsg").G());
                aVarArr[i17] = a.b(iArr2, i13);
            }
            if (i10 != -1) {
                g0VarArr[i10] = new g0(string + ":cc", c0936z0Arr[i12]);
                aVarArr[i10] = a.a(iArr2, i13);
            }
            i12++;
            i13 = i11;
        }
        return i13;
    }

    public static Pair t(y yVar, List list, List list2) {
        int[][] iArrA = A(list);
        int length = iArrA.length;
        boolean[] zArr = new boolean[length];
        C0936z0[][] c0936z0Arr = new C0936z0[length][];
        int iE = E(length, list, iArrA, zArr, c0936z0Arr) + length + list2.size();
        g0[] g0VarArr = new g0[iE];
        a[] aVarArr = new a[iE];
        o(list2, g0VarArr, aVarArr, q(yVar, list, iArrA, length, zArr, c0936z0Arr, g0VarArr, aVarArr));
        return Pair.create(new i0(g0VarArr), aVarArr);
    }

    public static e w(List list) {
        return x(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    public static e x(List list, String str) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            e eVar = (e) list.get(i9);
            if (str.equals(eVar.f1960a)) {
                return eVar;
            }
        }
        return null;
    }

    public static e y(List list) {
        return x(list, "http://dashif.org/guidelines/trickmode");
    }

    public static C0936z0[] z(List list, int[] iArr) {
        C0936z0 c0936z0G;
        Pattern pattern;
        for (int i9 : iArr) {
            F3.a aVar = (F3.a) list.get(i9);
            List list2 = ((F3.a) list.get(i9)).f1926d;
            for (int i10 = 0; i10 < list2.size(); i10++) {
                e eVar = (e) list2.get(i10);
                if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f1960a)) {
                    c0936z0G = new C0936z0.b().g0("application/cea-608").U(aVar.f1923a + ":cea608").G();
                    pattern = f25503z;
                } else if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f1960a)) {
                    c0936z0G = new C0936z0.b().g0("application/cea-708").U(aVar.f1923a + ":cea708").G();
                    pattern = f25502A;
                }
                return H(eVar, pattern, c0936z0G);
            }
        }
        return new C0936z0[0];
    }

    public final int B(int i9, int[] iArr) {
        int i10 = iArr[i9];
        if (i10 == -1) {
            return -1;
        }
        int i11 = this.f25514l[i10].f25532e;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            int i13 = iArr[i12];
            if (i13 == i11 && this.f25514l[i13].f25530c == 0) {
                return i12;
            }
        }
        return -1;
    }

    public final int[] C(s[] sVarArr) {
        int[] iArr = new int[sVarArr.length];
        for (int i9 = 0; i9 < sVarArr.length; i9++) {
            s sVar = sVarArr[i9];
            if (sVar != null) {
                iArr[i9] = this.f25513k.c(sVar.k());
            } else {
                iArr[i9] = -1;
            }
        }
        return iArr;
    }

    @Override // B3.Z.a
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void j(i iVar) {
        this.f25521s.j(this);
    }

    public void I() {
        this.f25516n.o();
        for (i iVar : this.f25522t) {
            iVar.Q(this);
        }
        this.f25521s = null;
    }

    public final void J(s[] sVarArr, boolean[] zArr, Y[] yArr) {
        for (int i9 = 0; i9 < sVarArr.length; i9++) {
            if (sVarArr[i9] == null || !zArr[i9]) {
                Y y9 = yArr[i9];
                if (y9 instanceof i) {
                    ((i) y9).Q(this);
                } else if (y9 instanceof i.a) {
                    ((i.a) y9).c();
                }
                yArr[i9] = null;
            }
        }
    }

    public final void K(s[] sVarArr, Y[] yArr, int[] iArr) {
        boolean z9;
        for (int i9 = 0; i9 < sVarArr.length; i9++) {
            Y y9 = yArr[i9];
            if ((y9 instanceof r) || (y9 instanceof i.a)) {
                int iB = B(i9, iArr);
                if (iB == -1) {
                    z9 = yArr[i9] instanceof r;
                } else {
                    Y y10 = yArr[i9];
                    z9 = (y10 instanceof i.a) && ((i.a) y10).f1410a == yArr[iB];
                }
                if (!z9) {
                    Y y11 = yArr[i9];
                    if (y11 instanceof i.a) {
                        ((i.a) y11).c();
                    }
                    yArr[i9] = null;
                }
            }
        }
    }

    public final void L(s[] sVarArr, Y[] yArr, boolean[] zArr, long j9, int[] iArr) {
        for (int i9 = 0; i9 < sVarArr.length; i9++) {
            s sVar = sVarArr[i9];
            if (sVar != null) {
                Y y9 = yArr[i9];
                if (y9 == null) {
                    zArr[i9] = true;
                    a aVar = this.f25514l[iArr[i9]];
                    int i10 = aVar.f25530c;
                    if (i10 == 0) {
                        yArr[i9] = r(aVar, sVar, j9);
                    } else if (i10 == 2) {
                        yArr[i9] = new E3.i((F3.f) this.f25527y.get(aVar.f25531d), sVar.k().c(0), this.f25525w.f1936d);
                    }
                } else if (y9 instanceof i) {
                    ((com.google.android.exoplayer2.source.dash.a) ((i) y9).E()).b(sVar);
                }
            }
        }
        for (int i11 = 0; i11 < sVarArr.length; i11++) {
            if (yArr[i11] == null && sVarArr[i11] != null) {
                a aVar2 = this.f25514l[iArr[i11]];
                if (aVar2.f25530c == 1) {
                    int iB = B(i11, iArr);
                    if (iB == -1) {
                        yArr[i11] = new r();
                    } else {
                        yArr[i11] = ((i) yArr[iB]).T(j9, aVar2.f25529b);
                    }
                }
            }
        }
    }

    public void M(F3.c cVar, int i9) {
        this.f25525w = cVar;
        this.f25526x = i9;
        this.f25516n.q(cVar);
        i[] iVarArr = this.f25522t;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                ((com.google.android.exoplayer2.source.dash.a) iVar.E()).i(cVar, i9);
            }
            this.f25521s.j(this);
        }
        this.f25527y = cVar.d(i9).f1971d;
        for (E3.i iVar2 : this.f25523u) {
            Iterator it = this.f25527y.iterator();
            while (true) {
                if (it.hasNext()) {
                    F3.f fVar = (F3.f) it.next();
                    if (fVar.a().equals(iVar2.b())) {
                        iVar2.d(fVar, cVar.f1936d && i9 == cVar.e() - 1);
                    }
                }
            }
        }
    }

    @Override // D3.i.b
    public synchronized void a(i iVar) {
        d.c cVar = (d.c) this.f25517o.remove(iVar);
        if (cVar != null) {
            cVar.n();
        }
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public boolean b() {
        return this.f25524v.b();
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public long c() {
        return this.f25524v.c();
    }

    @Override // B3.InterfaceC0517z
    public long d(long j9, H1 h12) {
        for (i iVar : this.f25522t) {
            if (iVar.f1387a == 2) {
                return iVar.d(j9, h12);
            }
        }
        return j9;
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public boolean f(long j9) {
        return this.f25524v.f(j9);
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public long g() {
        return this.f25524v.g();
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public void h(long j9) {
        this.f25524v.h(j9);
    }

    @Override // B3.InterfaceC0517z
    public long i(s[] sVarArr, boolean[] zArr, Y[] yArr, boolean[] zArr2, long j9) {
        int[] iArrC = C(sVarArr);
        J(sVarArr, zArr, yArr);
        K(sVarArr, yArr, iArrC);
        L(sVarArr, yArr, zArr2, j9, iArrC);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Y y9 : yArr) {
            if (y9 instanceof i) {
                arrayList.add((i) y9);
            } else if (y9 instanceof E3.i) {
                arrayList2.add((E3.i) y9);
            }
        }
        i[] iVarArrF = F(arrayList.size());
        this.f25522t = iVarArrF;
        arrayList.toArray(iVarArrF);
        E3.i[] iVarArr = new E3.i[arrayList2.size()];
        this.f25523u = iVarArr;
        arrayList2.toArray(iVarArr);
        this.f25524v = this.f25515m.a(this.f25522t);
        return j9;
    }

    @Override // B3.InterfaceC0517z
    public List k(List list) {
        List list2 = this.f25525w.d(this.f25526x).f1970c;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s sVar = (s) it.next();
            a aVar = this.f25514l[this.f25513k.c(sVar.k())];
            if (aVar.f25530c == 0) {
                int[] iArr = aVar.f25528a;
                int length = sVar.length();
                int[] iArr2 = new int[length];
                for (int i9 = 0; i9 < sVar.length(); i9++) {
                    iArr2[i9] = sVar.d(i9);
                }
                Arrays.sort(iArr2);
                int size = ((F3.a) list2.get(iArr[0])).f1925c.size();
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < length; i12++) {
                    int i13 = iArr2[i12];
                    while (true) {
                        int i14 = i11 + size;
                        if (i13 >= i14) {
                            i10++;
                            size = ((F3.a) list2.get(iArr[i10])).f1925c.size();
                            i11 = i14;
                        }
                    }
                    arrayList.add(new C3028H(this.f25526x, iArr[i10], i13 - i11));
                }
            }
        }
        return arrayList;
    }

    @Override // B3.InterfaceC0517z
    public long l(long j9) {
        for (i iVar : this.f25522t) {
            iVar.S(j9);
        }
        for (E3.i iVar2 : this.f25523u) {
            iVar2.c(j9);
        }
        return j9;
    }

    @Override // B3.InterfaceC0517z
    public long m() {
        return -9223372036854775807L;
    }

    @Override // B3.InterfaceC0517z
    public void p() {
        this.f25511i.a();
    }

    public final i r(a aVar, s sVar, long j9) {
        g0 g0VarB;
        int i9;
        g0 g0VarB2;
        int i10;
        int i11 = aVar.f25533f;
        boolean z9 = i11 != -1;
        d.c cVarK = null;
        if (z9) {
            g0VarB = this.f25513k.b(i11);
            i9 = 1;
        } else {
            g0VarB = null;
            i9 = 0;
        }
        int i12 = aVar.f25534g;
        boolean z10 = i12 != -1;
        if (z10) {
            g0VarB2 = this.f25513k.b(i12);
            i9 += g0VarB2.f581a;
        } else {
            g0VarB2 = null;
        }
        C0936z0[] c0936z0Arr = new C0936z0[i9];
        int[] iArr = new int[i9];
        if (z9) {
            c0936z0Arr[0] = g0VarB.c(0);
            iArr[0] = 5;
            i10 = 1;
        } else {
            i10 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (z10) {
            for (int i13 = 0; i13 < g0VarB2.f581a; i13++) {
                C0936z0 c0936z0C = g0VarB2.c(i13);
                c0936z0Arr[i10] = c0936z0C;
                iArr[i10] = 3;
                arrayList.add(c0936z0C);
                i10++;
            }
        }
        if (this.f25525w.f1936d && z9) {
            cVarK = this.f25516n.k();
        }
        d.c cVar = cVarK;
        i iVar = new i(aVar.f25529b, iArr, c0936z0Arr, this.f25505c.a(this.f25511i, this.f25525w, this.f25509g, this.f25526x, aVar.f25528a, sVar, aVar.f25529b, this.f25510h, z9, arrayList, cVar, this.f25506d, this.f25520r, null), this, this.f25512j, j9, this.f25507e, this.f25519q, this.f25508f, this.f25518p);
        synchronized (this) {
            this.f25517o.put(iVar, cVar);
        }
        return iVar;
    }

    @Override // B3.InterfaceC0517z
    public void s(InterfaceC0517z.a aVar, long j9) {
        this.f25521s = aVar;
        aVar.e(this);
    }

    @Override // B3.InterfaceC0517z
    public i0 u() {
        return this.f25513k;
    }

    @Override // B3.InterfaceC0517z
    public void v(long j9, boolean z9) {
        for (i iVar : this.f25522t) {
            iVar.v(j9, z9);
        }
    }
}
