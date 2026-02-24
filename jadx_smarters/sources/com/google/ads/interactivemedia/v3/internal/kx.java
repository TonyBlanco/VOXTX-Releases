package com.google.ads.interactivemedia.v3.internal;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class kx implements td, ug, uy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f23582b = Pattern.compile("CC([1-4])=(.+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f23583c = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f23584a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dw f23585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final nt f23586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f23587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final xd f23588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final um f23589h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final kw[] f23590i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final lr f23591j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final tj f23593l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final nn f23594m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final iw f23595n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private tc f23596o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private lu f23600s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f23601t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private List f23602u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final wr f23603v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ly f23604w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final aeq f23605x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ws f23606y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final ws f23607z;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private uz[] f23597p = new uz[0];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ln[] f23598q = new ln[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final IdentityHashMap f23592k = new IdentityHashMap();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private uh f23599r = ws.f(this.f23597p);

    public kx(int i9, lu luVar, ly lyVar, int i10, aeq aeqVar, dw dwVar, nt ntVar, nn nnVar, ws wsVar, tj tjVar, long j9, xd xdVar, wr wrVar, ws wsVar2, lp lpVar, iw iwVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int[][] iArr;
        int i11;
        List list;
        int i12;
        boolean[] zArr;
        int i13;
        C1333s[] c1333sArrU;
        C1333s c1333sV;
        Pattern pattern;
        lx lxVarS;
        nt ntVar2 = ntVar;
        this.f23584a = i9;
        this.f23600s = luVar;
        this.f23604w = lyVar;
        this.f23601t = i10;
        this.f23605x = aeqVar;
        this.f23585d = dwVar;
        this.f23586e = ntVar2;
        this.f23594m = nnVar;
        this.f23606y = wsVar;
        this.f23593l = tjVar;
        this.f23587f = j9;
        this.f23588g = xdVar;
        this.f23603v = wrVar;
        this.f23607z = wsVar2;
        this.f23595n = iwVar;
        this.f23591j = new lr(luVar, lpVar, wrVar);
        lz lzVarD = luVar.d(i10);
        List list2 = lzVarD.f23762d;
        this.f23602u = list2;
        List list3 = lzVarD.f23761c;
        int size = list3.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i14 = 0; i14 < size; i14++) {
            sparseIntArray.put(((ls) list3.get(i14)).f23715a, i14);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i14));
            arrayList.add(arrayList2);
            sparseArray.put(i14, arrayList2);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ls lsVar = (ls) list3.get(i15);
            lx lxVarT = t(lsVar.f23719e);
            lxVarT = lxVarT == null ? t(lsVar.f23720f) : lxVarT;
            int iMin = (lxVarT == null || (iMin = sparseIntArray.get(Integer.parseInt(lxVarT.f23753b), -1)) == -1) ? i15 : iMin;
            if (iMin == i15 && (lxVarS = s(lsVar.f23720f, "urn:mpeg:dash:adaptation-set-switching:2016")) != null) {
                for (String str : cq.ak(lxVarS.f23753b, ",")) {
                    int i16 = sparseIntArray.get(Integer.parseInt(str), -1);
                    if (i16 != -1) {
                        iMin = Math.min(iMin, i16);
                    }
                }
            }
            if (iMin != i15) {
                List list4 = (List) sparseArray.get(i15);
                List list5 = (List) sparseArray.get(iMin);
                list5.addAll(list4);
                sparseArray.put(i15, list5);
                arrayList.remove(list4);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i17 = 0; i17 < size2; i17++) {
            int[] iArrC = axy.c((Collection) arrayList.get(i17));
            iArr2[i17] = iArrC;
            Arrays.sort(iArrC);
        }
        boolean[] zArr2 = new boolean[size2];
        C1333s[][] c1333sArr = new C1333s[size2][];
        int i18 = 0;
        int i19 = 0;
        while (i18 < size2) {
            int[] iArr3 = iArr2[i18];
            int length = iArr3.length;
            int i20 = 0;
            while (true) {
                if (i20 >= length) {
                    break;
                }
                List list6 = ((ls) list3.get(iArr3[i20])).f23717c;
                for (int i21 = 0; i21 < list6.size(); i21++) {
                    if (!((me) list6.get(i21)).f23780e.isEmpty()) {
                        zArr2[i18] = true;
                        i19++;
                        break;
                    }
                }
                i20++;
            }
            int[] iArr4 = iArr2[i18];
            int length2 = iArr4.length;
            int i22 = 0;
            while (i22 < length2) {
                int i23 = iArr4[i22];
                ls lsVar2 = (ls) list3.get(i23);
                List list7 = ((ls) list3.get(i23)).f23718d;
                int[] iArr5 = iArr4;
                int i24 = 0;
                while (i24 < list7.size()) {
                    lx lxVar = (lx) list7.get(i24);
                    int i25 = length2;
                    List list8 = list7;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(lxVar.f23752a)) {
                        r rVar = new r();
                        rVar.ae("application/cea-608");
                        rVar.S(lsVar2.f23715a + ":cea608");
                        c1333sV = rVar.v();
                        pattern = f23582b;
                    } else if ("urn:scte:dash:cc:cea-708:2015".equals(lxVar.f23752a)) {
                        r rVar2 = new r();
                        rVar2.ae("application/cea-708");
                        rVar2.S(lsVar2.f23715a + ":cea708");
                        c1333sV = rVar2.v();
                        pattern = f23583c;
                    } else {
                        i24++;
                        list7 = list8;
                        length2 = i25;
                    }
                    c1333sArrU = u(lxVar, pattern, c1333sV);
                    i13 = 1;
                }
                i22++;
                iArr4 = iArr5;
            }
            i13 = 1;
            c1333sArrU = new C1333s[0];
            c1333sArr[i18] = c1333sArrU;
            if (c1333sArrU.length != 0) {
                i19 += i13;
            }
            i18 += i13;
        }
        int size3 = i19 + size2 + list2.size();
        bf[] bfVarArr = new bf[size3];
        kw[] kwVarArr = new kw[size3];
        int i26 = 0;
        int i27 = 0;
        while (i27 < size2) {
            int[] iArr6 = iArr2[i27];
            ArrayList arrayList3 = new ArrayList();
            int length3 = iArr6.length;
            int i28 = size2;
            int i29 = 0;
            while (true) {
                iArr = iArr2;
                if (i29 >= length3) {
                    break;
                }
                arrayList3.addAll(((ls) list3.get(iArr6[i29])).f23717c);
                i29++;
                iArr2 = iArr;
            }
            int size4 = arrayList3.size();
            C1333s[] c1333sArr2 = new C1333s[size4];
            int i30 = 0;
            while (i30 < size4) {
                int i31 = size4;
                C1333s c1333s = ((me) arrayList3.get(i30)).f23777b;
                c1333sArr2[i30] = c1333s.c(ntVar2.b(c1333s));
                i30++;
                size4 = i31;
                arrayList3 = arrayList3;
            }
            ls lsVar3 = (ls) list3.get(iArr6[0]);
            int i32 = lsVar3.f23715a;
            String string = i32 != -1 ? Integer.toString(i32) : "unset:" + i27;
            int i33 = i26 + 1;
            if (zArr2[i27]) {
                i11 = i33;
                i33 = i26 + 2;
            } else {
                i11 = -1;
            }
            if (c1333sArr[i27].length != 0) {
                i12 = i33;
                i33++;
                list = list3;
            } else {
                list = list3;
                i12 = -1;
            }
            bfVarArr[i26] = new bf(string, c1333sArr2);
            int i34 = lsVar3.f23716b;
            int i35 = i11;
            kwVarArr[i26] = kw.d(i34, iArr6, i26, i35, i12);
            int i36 = -1;
            if (i35 != -1) {
                String strConcat = String.valueOf(string).concat(":emsg");
                r rVar3 = new r();
                rVar3.S(strConcat);
                rVar3.ae("application/x-emsg");
                zArr = zArr2;
                bfVarArr[i35] = new bf(strConcat, rVar3.v());
                kwVarArr[i35] = kw.b(iArr6, i26);
                i36 = -1;
            } else {
                zArr = zArr2;
            }
            if (i12 != i36) {
                bfVarArr[i12] = new bf(String.valueOf(string).concat(":cc"), c1333sArr[i27]);
                kwVarArr[i12] = kw.a(iArr6, i26);
            }
            i27++;
            size2 = i28;
            ntVar2 = ntVar;
            iArr2 = iArr;
            i26 = i33;
            list3 = list;
            zArr2 = zArr;
        }
        int i37 = 0;
        while (i37 < list2.size()) {
            ly lyVar2 = (ly) list2.get(i37);
            r rVar4 = new r();
            rVar4.S(lyVar2.a());
            rVar4.ae("application/x-emsg");
            bfVarArr[i26] = new bf(lyVar2.a() + ":" + i37, rVar4.v());
            kwVarArr[i26] = kw.c(i37);
            i37++;
            i26++;
        }
        Pair pairCreate = Pair.create(new um(bfVarArr), kwVarArr);
        this.f23589h = (um) pairCreate.first;
        this.f23590i = (kw[]) pairCreate.second;
    }

    private final int r(int i9, int[] iArr) {
        int i10 = iArr[i9];
        if (i10 == -1) {
            return -1;
        }
        int i11 = this.f23590i[i10].f23579e;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            int i13 = iArr[i12];
            if (i13 == i11 && this.f23590i[i13].f23577c == 0) {
                return i12;
            }
        }
        return -1;
    }

    private static lx s(List list, String str) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            lx lxVar = (lx) list.get(i9);
            if (str.equals(lxVar.f23752a)) {
                return lxVar;
            }
        }
        return null;
    }

    private static lx t(List list) {
        return s(list, "http://dashif.org/guidelines/trickmode");
    }

    private static C1333s[] u(lx lxVar, Pattern pattern, C1333s c1333s) {
        String str = lxVar.f23753b;
        if (str == null) {
            return new C1333s[]{c1333s};
        }
        String[] strArrAk = cq.ak(str, ";");
        C1333s[] c1333sArr = new C1333s[strArrAk.length];
        for (int i9 = 0; i9 < strArrAk.length; i9++) {
            Matcher matcher = pattern.matcher(strArrAk[i9]);
            if (!matcher.matches()) {
                return new C1333s[]{c1333s};
            }
            int i10 = Integer.parseInt(matcher.group(1));
            r rVarB = c1333s.b();
            rVarB.S(c1333s.f24456a + ":" + i10);
            rVarB.F(i10);
            rVarB.V(matcher.group(2));
            c1333sArr[i9] = rVarB.v();
        }
        return c1333sArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final long a(long j9, hl hlVar) {
        for (uz uzVar : this.f23597p) {
            if (uzVar.f24795a == 2) {
                return uzVar.f(j9, hlVar);
            }
        }
        return j9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final void bm() throws IOException {
        this.f23588g.a();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td, com.google.ads.interactivemedia.v3.internal.uh
    public final long bo() {
        return this.f23599r.bo();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td, com.google.ads.interactivemedia.v3.internal.uh
    public final long c() {
        return this.f23599r.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final long d() {
        return -9223372036854775807L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final long e(long j9) {
        for (uz uzVar : this.f23597p) {
            uzVar.m(j9);
        }
        for (ln lnVar : this.f23598q) {
            lnVar.e(j9);
        }
        return j9;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.google.ads.interactivemedia.v3.internal.ku, com.google.ads.interactivemedia.v3.internal.va] */
    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final long f(we[] weVarArr, boolean[] zArr, uf[] ufVarArr, boolean[] zArr2, long j9) {
        int i9;
        boolean z9;
        int[] iArr;
        int i10;
        int[] iArr2;
        uf[] ufVarArr2;
        kx kxVar;
        bf bfVarB;
        int i11;
        bf bfVarB2;
        int i12;
        kx kxVar2 = this;
        we[] weVarArr2 = weVarArr;
        uf[] ufVarArr3 = ufVarArr;
        int[] iArr3 = new int[weVarArr2.length];
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i9 = -1;
            if (i14 >= weVarArr2.length) {
                break;
            }
            we weVar = weVarArr2[i14];
            if (weVar != null) {
                iArr3[i14] = kxVar2.f23589h.a(weVar.q());
            } else {
                iArr3[i14] = -1;
            }
            i14++;
        }
        for (int i15 = 0; i15 < weVarArr2.length; i15++) {
            if (weVarArr2[i15] == null || !zArr[i15]) {
                uf ufVar = ufVarArr3[i15];
                if (ufVar instanceof uz) {
                    ((uz) ufVar).k(kxVar2);
                } else if (ufVar instanceof ux) {
                    ((ux) ufVar).c();
                }
                ufVarArr3[i15] = null;
            }
        }
        int i16 = 0;
        while (true) {
            z9 = true;
            if (i16 >= weVarArr2.length) {
                break;
            }
            uf ufVar2 = ufVarArr3[i16];
            if ((ufVar2 instanceof ss) || (ufVar2 instanceof ux)) {
                int iR = kxVar2.r(i16, iArr3);
                if (iR == -1) {
                    z9 = ufVarArr3[i16] instanceof ss;
                } else {
                    uf ufVar3 = ufVarArr3[i16];
                    if (!(ufVar3 instanceof ux) || ((ux) ufVar3).f24790a != ufVarArr3[iR]) {
                        z9 = false;
                    }
                }
                if (!z9) {
                    uf ufVar4 = ufVarArr3[i16];
                    if (ufVar4 instanceof ux) {
                        ((ux) ufVar4).c();
                    }
                    ufVarArr3[i16] = null;
                }
            }
            i16++;
        }
        int i17 = 0;
        while (i17 < weVarArr2.length) {
            we weVar2 = weVarArr2[i17];
            if (weVar2 == null) {
                i10 = i17;
                iArr2 = iArr3;
                ufVarArr2 = ufVarArr3;
                kxVar = kxVar2;
            } else {
                uf ufVar5 = ufVarArr3[i17];
                if (ufVar5 == null) {
                    zArr2[i17] = z9;
                    kw kwVar = kxVar2.f23590i[iArr3[i17]];
                    int i18 = kwVar.f23577c;
                    if (i18 == 0) {
                        int i19 = kwVar.f23580f;
                        boolean z10 = i19 != i9;
                        if (z10) {
                            bfVarB = kxVar2.f23589h.b(i19);
                            i11 = 1;
                        } else {
                            bfVarB = null;
                            i11 = 0;
                        }
                        int i20 = kwVar.f23581g;
                        boolean z11 = i20 != i9;
                        if (z11) {
                            bfVarB2 = kxVar2.f23589h.b(i20);
                            i11 += bfVarB2.f21163a;
                        } else {
                            bfVarB2 = null;
                        }
                        C1333s[] c1333sArr = new C1333s[i11];
                        int[] iArr4 = new int[i11];
                        if (z10) {
                            c1333sArr[i13] = bfVarB.b(i13);
                            iArr4[i13] = 5;
                            i12 = 1;
                        } else {
                            i12 = 0;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (z11) {
                            for (int i21 = 0; i21 < bfVarB2.f21163a; i21++) {
                                C1333s c1333sB = bfVarB2.b(i21);
                                c1333sArr[i12] = c1333sB;
                                iArr4[i12] = 3;
                                arrayList.add(c1333sB);
                                i12++;
                            }
                        }
                        lq lqVarB = (kxVar2.f23600s.f23728d && z10) ? kxVar2.f23591j.b() : null;
                        lq lqVar = lqVarB;
                        i10 = i17;
                        iArr2 = iArr3;
                        uz uzVar = new uz(kwVar.f23576b, iArr4, c1333sArr, kxVar2.f23605x.n(kxVar2.f23588g, kxVar2.f23600s, kxVar2.f23604w, kxVar2.f23601t, kwVar.f23575a, weVar2, kwVar.f23576b, kxVar2.f23587f, z10, arrayList, lqVarB, kxVar2.f23585d, kxVar2.f23595n), this, kxVar2.f23603v, j9, kxVar2.f23586e, kxVar2.f23594m, kxVar2.f23606y, kxVar2.f23593l, null, null, null);
                        kxVar = this;
                        synchronized (this) {
                            kxVar.f23592k.put(uzVar, lqVar);
                        }
                        ufVarArr2 = ufVarArr;
                        ufVarArr2[i10] = uzVar;
                    } else {
                        i10 = i17;
                        iArr2 = iArr3;
                        ufVarArr2 = ufVarArr3;
                        kxVar = kxVar2;
                        if (i18 == 2) {
                            ufVarArr2[i10] = new ln((ly) kxVar.f23602u.get(kwVar.f23578d), weVar2.q().b(0), kxVar.f23600s.f23728d);
                        }
                    }
                } else {
                    i10 = i17;
                    iArr2 = iArr3;
                    ufVarArr2 = ufVarArr3;
                    kxVar = kxVar2;
                    if (ufVar5 instanceof uz) {
                        ((uz) ufVar5).j().b(weVar2);
                    }
                }
                i17 = i10 + 1;
                weVarArr2 = weVarArr;
                kxVar2 = kxVar;
                ufVarArr3 = ufVarArr2;
                iArr3 = iArr2;
                i9 = -1;
                z9 = true;
                i13 = 0;
            }
            i17 = i10 + 1;
            weVarArr2 = weVarArr;
            kxVar2 = kxVar;
            ufVarArr3 = ufVarArr2;
            iArr3 = iArr2;
            i9 = -1;
            z9 = true;
            i13 = 0;
        }
        int[] iArr5 = iArr3;
        uf[] ufVarArr4 = ufVarArr3;
        kx kxVar3 = kxVar2;
        int i22 = 0;
        while (i22 < weVarArr.length) {
            if (ufVarArr4[i22] != null || weVarArr[i22] == null) {
                iArr = iArr5;
            } else {
                iArr = iArr5;
                kw kwVar2 = kxVar3.f23590i[iArr[i22]];
                if (kwVar2.f23577c == 1) {
                    int iR2 = kxVar3.r(i22, iArr);
                    if (iR2 == -1) {
                        ufVarArr4[i22] = new ss();
                    } else {
                        ufVarArr4[i22] = ((uz) ufVarArr4[iR2]).i(j9, kwVar2.f23576b);
                    }
                    i22++;
                    iArr5 = iArr;
                }
            }
            i22++;
            iArr5 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (uf ufVar6 : ufVarArr4) {
            if (ufVar6 instanceof uz) {
                arrayList2.add((uz) ufVar6);
            } else if (ufVar6 instanceof ln) {
                arrayList3.add((ln) ufVar6);
            }
        }
        uz[] uzVarArr = new uz[arrayList2.size()];
        kxVar3.f23597p = uzVarArr;
        arrayList2.toArray(uzVarArr);
        ln[] lnVarArr = new ln[arrayList3.size()];
        kxVar3.f23598q = lnVarArr;
        arrayList3.toArray(lnVarArr);
        kxVar3.f23599r = ws.f(kxVar3.f23597p);
        return j9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ug
    public final /* bridge */ /* synthetic */ void g(uh uhVar) {
        this.f23596o.g(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final um h() {
        return this.f23589h;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uy
    public final synchronized void j(uz uzVar) {
        lq lqVar = (lq) this.f23592k.remove(uzVar);
        if (lqVar != null) {
            lqVar.d();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final void k(tc tcVar, long j9) {
        this.f23596o = tcVar;
        tcVar.bl(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td, com.google.ads.interactivemedia.v3.internal.uh
    public final void l(long j9) {
        this.f23599r.l(j9);
    }

    public final void m() {
        this.f23591j.d();
        for (uz uzVar : this.f23597p) {
            uzVar.k(this);
        }
        this.f23596o = null;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.ads.interactivemedia.v3.internal.ku, com.google.ads.interactivemedia.v3.internal.va] */
    public final void n(lu luVar, int i9) {
        this.f23600s = luVar;
        this.f23601t = i9;
        this.f23591j.e(luVar);
        uz[] uzVarArr = this.f23597p;
        if (uzVarArr != null) {
            for (uz uzVar : uzVarArr) {
                uzVar.j().a(luVar, i9);
            }
            this.f23596o.g(this);
        }
        this.f23602u = luVar.d(i9).f23762d;
        for (ln lnVar : this.f23598q) {
            Iterator it = this.f23602u.iterator();
            while (true) {
                if (it.hasNext()) {
                    ly lyVar = (ly) it.next();
                    if (lyVar.a().equals(lnVar.c())) {
                        lnVar.f(lyVar, luVar.f23728d && i9 == luVar.a() + (-1));
                    }
                }
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td, com.google.ads.interactivemedia.v3.internal.uh
    public final boolean o(long j9) {
        return this.f23599r.o(j9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td, com.google.ads.interactivemedia.v3.internal.uh
    public final boolean p() {
        return this.f23599r.p();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final void q(long j9) {
        for (uz uzVar : this.f23597p) {
            uzVar.u(j9);
        }
    }
}
