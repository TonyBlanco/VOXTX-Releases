package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes3.dex */
final class ow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ox f23946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cy f23947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final cy f23948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Uri[] f23949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1333s[] f23950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final qq f23951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final bf f23952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f23953h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final iw f23955j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f23956k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private IOException f23958m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Uri f23959n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f23960o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private we f23961p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f23963r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final vk f23964s;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final oq f23954i = new oq();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private byte[] f23957l = cq.f22645f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f23962q = -9223372036854775807L;

    public ow(ox oxVar, qq qqVar, Uri[] uriArr, C1333s[] c1333sArr, oq oqVar, dw dwVar, vk vkVar, List list, iw iwVar, byte[] bArr) {
        this.f23946a = oxVar;
        this.f23951f = qqVar;
        this.f23949d = uriArr;
        this.f23950e = c1333sArr;
        this.f23964s = vkVar;
        this.f23953h = list;
        this.f23955j = iwVar;
        cy cyVarD = oqVar.d();
        this.f23947b = cyVarD;
        if (dwVar != null) {
            cyVarD.f(dwVar);
        }
        this.f23948c = oqVar.d();
        this.f23952g = new bf("", c1333sArr);
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < uriArr.length; i9++) {
            if ((c1333sArr[i9].f24460e & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                arrayList.add(Integer.valueOf(i9));
            }
        }
        this.f23961p = new ou(this.f23952g, axy.c(arrayList));
    }

    private static Uri q(qd qdVar, qb qbVar) {
        String str;
        if (qbVar == null || (str = qbVar.f24172i) == null) {
            return null;
        }
        return af.l(qdVar.f24221t, str);
    }

    private final Pair r(oy oyVar, boolean z9, qd qdVar, long j9, long j10) {
        boolean z10 = true;
        if (oyVar != null && !z9) {
            if (!oyVar.g()) {
                return new Pair(Long.valueOf(oyVar.f24838o), Integer.valueOf(oyVar.f23984e));
            }
            Long lValueOf = Long.valueOf(oyVar.f23984e == -1 ? oyVar.s() : oyVar.f24838o);
            int i9 = oyVar.f23984e;
            return new Pair(lValueOf, Integer.valueOf(i9 != -1 ? i9 + 1 : -1));
        }
        long j11 = qdVar.f24199r + j9;
        if (oyVar != null && !this.f23960o) {
            j10 = oyVar.f24785l;
        }
        if (!qdVar.f24193l && j10 >= j11) {
            return new Pair(Long.valueOf(qdVar.f24189h + ((long) qdVar.f24196o.size())), -1);
        }
        long j12 = j10 - j9;
        List list = qdVar.f24196o;
        Long lValueOf2 = Long.valueOf(j12);
        int i10 = 0;
        if (this.f23951f.z() && oyVar != null) {
            z10 = false;
        }
        int iAp = cq.ap(list, lValueOf2, z10);
        long j13 = ((long) iAp) + qdVar.f24189h;
        if (iAp >= 0) {
            qa qaVar = (qa) qdVar.f24196o.get(iAp);
            List list2 = j12 < qaVar.f24170g + qaVar.f24168e ? qaVar.f24165b : qdVar.f24197p;
            while (true) {
                if (i10 >= list2.size()) {
                    break;
                }
                py pyVar = (py) list2.get(i10);
                if (j12 >= pyVar.f24170g + pyVar.f24168e) {
                    i10++;
                } else if (pyVar.f24158a) {
                    j13 += list2 == qdVar.f24197p ? 1L : 0L;
                    i = i10;
                }
            }
        }
        return new Pair(Long.valueOf(j13), Integer.valueOf(i));
    }

    private final uu s(Uri uri, int i9) {
        if (uri == null) {
            return null;
        }
        byte[] bArrB = this.f23954i.b(uri);
        if (bArrB != null) {
            this.f23954i.c(uri, bArrB);
            return null;
        }
        db dbVar = new db();
        dbVar.i(uri);
        dbVar.b(1);
        dc dcVarA = dbVar.a();
        cy cyVar = this.f23948c;
        C1333s c1333s = this.f23950e[i9];
        int iB = this.f23961p.b();
        this.f23961p.c();
        return new or(cyVar, dcVarA, c1333s, iB, this.f23957l);
    }

    public final int a(oy oyVar) {
        if (oyVar.f23984e == -1) {
            return 1;
        }
        qd qdVarI = this.f23951f.i(this.f23949d[this.f23952g.a(oyVar.f24782i)], false);
        af.s(qdVarI);
        int i9 = (int) (oyVar.f24838o - qdVarI.f24189h);
        if (i9 < 0) {
            return 1;
        }
        List list = i9 < qdVarI.f24196o.size() ? ((qa) qdVarI.f24196o.get(i9)).f24165b : qdVarI.f24197p;
        if (oyVar.f23984e >= list.size()) {
            return 2;
        }
        py pyVar = (py) list.get(oyVar.f23984e);
        if (pyVar.f24159b) {
            return 0;
        }
        return cq.V(Uri.parse(af.m(qdVarI.f24221t, pyVar.f24166c)), oyVar.f24780g.f22688a) ? 1 : 2;
    }

    public final int b(long j9, List list) {
        return (this.f23958m != null || this.f23961p.n() < 2) ? list.size() : this.f23961p.e(j9, list);
    }

    public final long c(long j9, hl hlVar) {
        int iA = this.f23961p.a();
        Uri[] uriArr = this.f23949d;
        qd qdVarI = null;
        if (iA < uriArr.length && iA != -1) {
            qdVarI = this.f23951f.i(uriArr[this.f23961p.k()], true);
        }
        if (qdVarI == null || qdVarI.f24196o.isEmpty() || !qdVarI.f24223v) {
            return j9;
        }
        long jD = qdVarI.f24186e - this.f23951f.d();
        long j10 = j9 - jD;
        int iAp = cq.ap(qdVarI.f24196o, Long.valueOf(j10), true);
        long j11 = ((qa) qdVarI.f24196o.get(iAp)).f24170g;
        return hlVar.a(j10, j11, iAp != qdVarI.f24196o.size() + (-1) ? ((qa) qdVarI.f24196o.get(iAp + 1)).f24170g : j11) + jD;
    }

    public final bf d() {
        return this.f23952g;
    }

    public final we e() {
        return this.f23961p;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(long r31, long r33, java.util.List r35, boolean r36, com.google.ads.interactivemedia.v3.internal.os r37) {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ow.f(long, long, java.util.List, boolean, com.google.ads.interactivemedia.v3.internal.os):void");
    }

    public final void g() throws IOException {
        IOException iOException = this.f23958m;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.f23959n;
        if (uri == null || !this.f23963r) {
            return;
        }
        this.f23951f.r(uri);
    }

    public final void h(uu uuVar) {
        if (uuVar instanceof or) {
            or orVar = (or) uuVar;
            this.f23957l = orVar.c();
            this.f23954i.c(orVar.f24780g.f22688a, (byte[]) af.s(orVar.b()));
        }
    }

    public final void i() {
        this.f23958m = null;
    }

    public final void j(boolean z9) {
        this.f23956k = z9;
    }

    public final void k(we weVar) {
        this.f23961p = weVar;
    }

    public final boolean l(uu uuVar, long j9) {
        we weVar = this.f23961p;
        return weVar.r(weVar.l(this.f23952g.a(uuVar.f24782i)), j9);
    }

    public final boolean m(Uri uri) {
        return cq.W(this.f23949d, uri);
    }

    public final boolean n(Uri uri, long j9) {
        int iL;
        int i9 = 0;
        while (true) {
            Uri[] uriArr = this.f23949d;
            if (i9 >= uriArr.length) {
                i9 = -1;
                break;
            }
            if (uriArr[i9].equals(uri)) {
                break;
            }
            i9++;
        }
        if (i9 == -1 || (iL = this.f23961p.l(i9)) == -1) {
            return true;
        }
        this.f23963r |= uri.equals(this.f23959n);
        return j9 == -9223372036854775807L || (this.f23961p.r(iL, j9) && this.f23951f.y(uri, j9));
    }

    public final vg[] o(oy oyVar, long j9) {
        List listO;
        int iA = oyVar == null ? -1 : this.f23952g.a(oyVar.f24782i);
        int iN = this.f23961p.n();
        vg[] vgVarArr = new vg[iN];
        boolean z9 = false;
        int i9 = 0;
        while (i9 < iN) {
            int iJ = this.f23961p.j(i9);
            Uri uri = this.f23949d[iJ];
            if (this.f23951f.A(uri)) {
                qd qdVarI = this.f23951f.i(uri, z9);
                af.s(qdVarI);
                long jD = qdVarI.f24186e - this.f23951f.d();
                Pair pairR = r(oyVar, iJ != iA, qdVarI, jD, j9);
                long jLongValue = ((Long) pairR.first).longValue();
                int iIntValue = ((Integer) pairR.second).intValue();
                int i10 = (int) (jLongValue - qdVarI.f24189h);
                if (i10 < 0 || qdVarI.f24196o.size() < i10) {
                    listO = avo.o();
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i10 < qdVarI.f24196o.size()) {
                        if (iIntValue != -1) {
                            qa qaVar = (qa) qdVarI.f24196o.get(i10);
                            if (iIntValue == 0) {
                                arrayList.add(qaVar);
                            } else if (iIntValue < qaVar.f24165b.size()) {
                                List list = qaVar.f24165b;
                                arrayList.addAll(list.subList(iIntValue, list.size()));
                            }
                            i10++;
                        }
                        List list2 = qdVarI.f24196o;
                        arrayList.addAll(list2.subList(i10, list2.size()));
                        iIntValue = 0;
                    }
                    if (qdVarI.f24192k != -9223372036854775807L) {
                        if (iIntValue == -1) {
                            iIntValue = 0;
                        }
                        if (iIntValue < qdVarI.f24197p.size()) {
                            List list3 = qdVarI.f24197p;
                            arrayList.addAll(list3.subList(iIntValue, list3.size()));
                        }
                    }
                    listO = Collections.unmodifiableList(arrayList);
                }
                vgVarArr[i9] = new ot(jD, listO);
            } else {
                vgVarArr[i9] = vg.f24839a;
            }
            i9++;
            z9 = false;
        }
        return vgVarArr;
    }

    public final void p(long j9, uu uuVar, List list) {
        if (this.f23958m != null) {
            return;
        }
        this.f23961p.t();
    }
}
