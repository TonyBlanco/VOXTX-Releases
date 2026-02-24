package com.google.ads.interactivemedia.v3.internal;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class acx implements zh, aab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f19002a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cj f19003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final cj f19004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final cj f19005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final cj f19006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque f19007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f19008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f19009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f19010i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f19011j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f19012k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private cj f19013l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f19014m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f19015n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f19016o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f19017p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private zk f19018q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private acw[] f19019r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long[][] f19020s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f19021t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f19022u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f19023v;

    static {
        acu acuVar = acu.f18993a;
    }

    public acx() {
        this(null);
    }

    public acx(byte[] bArr) {
        this.f19009h = 0;
        new ArrayList();
        this.f19008g = new ArrayList();
        this.f19006e = new cj(16);
        this.f19007f = new ArrayDeque();
        this.f19003b = new cj(zw.f25312a);
        this.f19004c = new cj(4);
        this.f19005d = new cj();
        this.f19014m = -1;
        this.f19018q = zk.f25259b;
        this.f19019r = new acw[0];
    }

    private static int f(int i9) {
        if (i9 != 1751476579) {
            return i9 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int i(ade adeVar, long j9) {
        int iA = adeVar.a(j9);
        return iA == -1 ? adeVar.b(j9) : iA;
    }

    private static long j(ade adeVar, long j9, long j10) {
        int i9 = i(adeVar, j9);
        return i9 == -1 ? j10 : Math.min(adeVar.f19071c[i9], j10);
    }

    private final void k() {
        this.f19009h = 0;
        this.f19012k = 0;
    }

    private final void l(long j9) throws as {
        ao aoVar;
        ao aoVar2;
        long j10;
        List list;
        int i9;
        zp zpVar;
        int i10;
        int i11;
        while (!this.f19007f.isEmpty() && ((acc) this.f19007f.peek()).f18896a == j9) {
            acc accVar = (acc) this.f19007f.pop();
            if (accVar.f18900d == 1836019574) {
                ArrayList arrayList = new ArrayList();
                boolean z9 = this.f19023v == 1;
                zp zpVar2 = new zp();
                acd acdVarB = accVar.b(1969517665);
                if (acdVarB != null) {
                    Pair pairA = acm.a(acdVarB);
                    ao aoVar3 = (ao) pairA.first;
                    ao aoVar4 = (ao) pairA.second;
                    if (aoVar3 != null) {
                        zpVar2.b(aoVar3);
                    }
                    aoVar = aoVar4;
                    aoVar2 = aoVar3;
                } else {
                    aoVar = null;
                    aoVar2 = null;
                }
                acc accVarA = accVar.a(1835365473);
                long j11 = -9223372036854775807L;
                ao aoVarB = accVarA != null ? acm.b(accVarA) : null;
                List listD = acm.d(accVar, zpVar2, -9223372036854775807L, null, z9, new ati() { // from class: com.google.ads.interactivemedia.v3.internal.acv
                    @Override // com.google.ads.interactivemedia.v3.internal.ati
                    public final Object a(Object obj) {
                        adb adbVar = (adb) obj;
                        int i12 = acx.f19002a;
                        return adbVar;
                    }
                });
                int size = listD.size();
                long j12 = -9223372036854775807L;
                int i12 = 0;
                int size2 = -1;
                while (true) {
                    j10 = 0;
                    if (i12 >= size) {
                        break;
                    }
                    ade adeVar = (ade) listD.get(i12);
                    if (adeVar.f19070b == 0) {
                        list = listD;
                        i9 = size;
                        zpVar = zpVar2;
                    } else {
                        adb adbVar = adeVar.f19069a;
                        list = listD;
                        i9 = size;
                        long j13 = adbVar.f19040e;
                        if (j13 == j11) {
                            j13 = adeVar.f19076h;
                        }
                        long jMax = Math.max(j12, j13);
                        acw acwVar = new acw(adbVar, adeVar, this.f19018q.i(i12, adbVar.f19037b));
                        int i13 = "audio/true-hd".equals(adbVar.f19041f.f24467l) ? adeVar.f19073e * 16 : adeVar.f19073e + 30;
                        r rVarB = adbVar.f19041f.b();
                        rVarB.W(i13);
                        if (adbVar.f19037b == 2 && j13 > 0 && (i11 = adeVar.f19070b) > 1) {
                            rVarB.P(i11 / (j13 / 1000000.0f));
                        }
                        int i14 = adbVar.f19037b;
                        int i15 = act.f18992b;
                        if (i14 == 1 && zpVar2.a()) {
                            rVarB.N(zpVar2.f25267a);
                            rVarB.O(zpVar2.f25268b);
                        }
                        int i16 = adbVar.f19037b;
                        ao[] aoVarArr = {aoVar, this.f19008g.isEmpty() ? null : new ao(this.f19008g)};
                        zpVar = zpVar2;
                        ao aoVar5 = new ao(new an[0]);
                        if (i16 == 1) {
                            if (aoVar2 != null) {
                                aoVar5 = aoVar2;
                            }
                        } else if (i16 == 2 && aoVarB != null) {
                            for (int i17 = 0; i17 < aoVarB.a(); i17++) {
                                an anVarB = aoVarB.b(i17);
                                if (anVarB instanceof abg) {
                                    abg abgVar = (abg) anVarB;
                                    if ("com.android.capture.fps".equals(abgVar.f18726a)) {
                                        i10 = 1;
                                        aoVar5 = new ao(abgVar);
                                        break;
                                    }
                                }
                            }
                        }
                        i10 = 1;
                        for (int i18 = 0; i18 < 2; i18 += i10) {
                            aoVar5 = aoVar5.d(aoVarArr[i18]);
                        }
                        if (aoVar5.a() > 0) {
                            rVarB.X(aoVar5);
                        }
                        acwVar.f18999c.b(rVarB.v());
                        if (adbVar.f19037b == 2 && size2 == -1) {
                            size2 = arrayList.size();
                        }
                        arrayList.add(acwVar);
                        j12 = jMax;
                    }
                    i12++;
                    listD = list;
                    size = i9;
                    zpVar2 = zpVar;
                    j11 = -9223372036854775807L;
                }
                this.f19021t = size2;
                this.f19022u = j12;
                acw[] acwVarArr = (acw[]) arrayList.toArray(new acw[0]);
                this.f19019r = acwVarArr;
                int length = acwVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i19 = 0; i19 < acwVarArr.length; i19++) {
                    jArr[i19] = new long[acwVarArr[i19].f18998b.f19070b];
                    jArr2[i19] = acwVarArr[i19].f18998b.f19074f[0];
                }
                int i20 = 0;
                while (i20 < acwVarArr.length) {
                    long j14 = Long.MAX_VALUE;
                    int i21 = -1;
                    for (int i22 = 0; i22 < acwVarArr.length; i22++) {
                        if (!zArr[i22]) {
                            long j15 = jArr2[i22];
                            if (j15 <= j14) {
                                i21 = i22;
                                j14 = j15;
                            }
                        }
                    }
                    int i23 = iArr[i21];
                    long[] jArr3 = jArr[i21];
                    jArr3[i23] = j10;
                    ade adeVar2 = acwVarArr[i21].f18998b;
                    j10 += (long) adeVar2.f19072d[i23];
                    int i24 = i23 + 1;
                    iArr[i21] = i24;
                    if (i24 < jArr3.length) {
                        jArr2[i21] = adeVar2.f19074f[i24];
                    } else {
                        zArr[i21] = true;
                        i20++;
                    }
                }
                this.f19020s = jArr;
                this.f19018q.n();
                this.f19018q.x(this);
                this.f19007f.clear();
                this.f19009h = 2;
            } else if (!this.f19007f.isEmpty()) {
                ((acc) this.f19007f.peek()).c(accVar);
            }
        }
        if (this.f19009h != 2) {
            k();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final boolean C(zi ziVar) throws IOException {
        return ada.b(ziVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    @Override // com.google.ads.interactivemedia.v3.internal.zh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.google.ads.interactivemedia.v3.internal.zi r33, com.google.ads.interactivemedia.v3.internal.zy r34) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 989
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.acx.a(com.google.ads.interactivemedia.v3.internal.zi, com.google.ads.interactivemedia.v3.internal.zy):int");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final void b(zk zkVar) {
        this.f19018q = zkVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final void d(long j9, long j10) {
        this.f19007f.clear();
        this.f19012k = 0;
        this.f19014m = -1;
        this.f19015n = 0;
        this.f19016o = 0;
        this.f19017p = 0;
        if (j9 == 0) {
            k();
            return;
        }
        for (acw acwVar : this.f19019r) {
            ade adeVar = acwVar.f18998b;
            int iA = adeVar.a(j10);
            if (iA == -1) {
                iA = adeVar.b(j10);
            }
            acwVar.f19001e = iA;
            aaf aafVar = acwVar.f19000d;
            if (aafVar != null) {
                aafVar.b();
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aab
    public final long e() {
        return this.f19022u;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aab
    public final zz g(long j9) {
        long j10;
        long j11;
        int iB;
        acw[] acwVarArr = this.f19019r;
        if (acwVarArr.length == 0) {
            aac aacVar = aac.f18626a;
            return new zz(aacVar, aacVar);
        }
        int i9 = this.f19021t;
        long j12 = -1;
        if (i9 != -1) {
            ade adeVar = acwVarArr[i9].f18998b;
            int i10 = i(adeVar, j9);
            if (i10 == -1) {
                aac aacVar2 = aac.f18626a;
                return new zz(aacVar2, aacVar2);
            }
            long j13 = adeVar.f19074f[i10];
            j10 = adeVar.f19071c[i10];
            if (j13 >= j9 || i10 >= adeVar.f19070b - 1 || (iB = adeVar.b(j9)) == -1 || iB == i10) {
                j11 = -9223372036854775807L;
            } else {
                j11 = adeVar.f19074f[iB];
                j12 = adeVar.f19071c[iB];
            }
            j9 = j13;
        } else {
            j10 = Long.MAX_VALUE;
            j11 = -9223372036854775807L;
        }
        int i11 = 0;
        while (true) {
            acw[] acwVarArr2 = this.f19019r;
            if (i11 >= acwVarArr2.length) {
                break;
            }
            if (i11 != this.f19021t) {
                ade adeVar2 = acwVarArr2[i11].f18998b;
                long j14 = j(adeVar2, j9, j10);
                if (j11 != -9223372036854775807L) {
                    j12 = j(adeVar2, j11, j12);
                }
                j10 = j14;
            }
            i11++;
        }
        aac aacVar3 = new aac(j9, j10);
        return j11 == -9223372036854775807L ? new zz(aacVar3, aacVar3) : new zz(aacVar3, new aac(j11, j12));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aab
    public final boolean h() {
        return true;
    }
}
