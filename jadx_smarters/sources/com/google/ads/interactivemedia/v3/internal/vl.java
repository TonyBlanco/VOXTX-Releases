package com.google.ads.interactivemedia.v3.internal;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vl extends vm {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wq f24847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f24848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f24849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f24850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final avo f24851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final bn f24852i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f24853j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f24854k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f24855l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f24856m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ve f24857n;

    public vl(bf bfVar, int[] iArr, wq wqVar, List list, bn bnVar) {
        super(bfVar, iArr);
        this.f24847d = wqVar;
        this.f24848e = 10000000L;
        this.f24849f = 25000000L;
        this.f24850g = 25000000L;
        this.f24851h = avo.m(list);
        this.f24852i = bnVar;
        this.f24853j = 1.0f;
        this.f24855l = 0;
        this.f24856m = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ avo i(zo[] zoVarArr) {
        int length;
        int i9;
        int[] iArr;
        avk avkVarJ;
        ArrayList arrayList = new ArrayList();
        char c9 = 0;
        int i10 = 0;
        while (true) {
            length = zoVarArr.length;
            i9 = 1;
            if (i10 >= length) {
                break;
            }
            zo zoVar = zoVarArr[i10];
            if (zoVar == null || ((int[]) zoVar.f25264a).length <= 1) {
                avkVarJ = null;
            } else {
                avkVarJ = avo.j();
                avkVarJ.g(new vj(0L, 0L));
            }
            arrayList.add(avkVarJ);
            i10++;
        }
        long[][] jArr = new long[length][];
        for (int i11 = 0; i11 < zoVarArr.length; i11++) {
            zo zoVar2 = zoVarArr[i11];
            if (zoVar2 == null) {
                jArr[i11] = new long[0];
            } else {
                jArr[i11] = new long[((int[]) zoVar2.f25264a).length];
                int i12 = 0;
                while (true) {
                    if (i12 >= ((int[]) zoVar2.f25264a).length) {
                        break;
                    }
                    jArr[i11][i12] = ((bf) zoVar2.f25265b).b(r11[i12]).f24463h;
                    i12++;
                }
                Arrays.sort(jArr[i11]);
            }
        }
        int[] iArr2 = new int[length];
        long[] jArr2 = new long[length];
        for (int i13 = 0; i13 < length; i13++) {
            long[] jArr3 = jArr[i13];
            jArr2[i13] = jArr3.length == 0 ? 0L : jArr3[0];
        }
        u(arrayList, jArr2);
        awj awjVarB = awu.a().b().b();
        int i14 = 0;
        while (i14 < length) {
            int length2 = jArr[i14].length;
            if (length2 <= i9) {
                iArr = iArr2;
            } else {
                double[] dArr = new double[length2];
                int i15 = 0;
                while (true) {
                    long[] jArr4 = jArr[i14];
                    double dLog = 0.0d;
                    iArr = iArr2;
                    if (i15 >= jArr4.length) {
                        break;
                    }
                    long j9 = jArr4[i15];
                    if (j9 != -1) {
                        dLog = Math.log(j9);
                    }
                    dArr[i15] = dLog;
                    i15++;
                    iArr2 = iArr;
                }
                int i16 = length2 - 1;
                double d9 = dArr[i16] - dArr[c9];
                int i17 = 0;
                while (i17 < i16) {
                    int i18 = i17 + 1;
                    awjVarB.u(Double.valueOf(d9 == 0.0d ? 1.0d : (((dArr[i17] + dArr[i18]) * 0.5d) - dArr[c9]) / d9), Integer.valueOf(i14));
                    i17 = i18;
                    c9 = 0;
                }
            }
            i14++;
            iArr2 = iArr;
            c9 = 0;
            i9 = 1;
        }
        int[] iArr3 = iArr2;
        avo avoVarM = avo.m(awjVarB.v());
        for (int i19 = 0; i19 < avoVarM.size(); i19++) {
            int iIntValue = ((Integer) avoVarM.get(i19)).intValue();
            int i20 = iArr3[iIntValue] + 1;
            iArr3[iIntValue] = i20;
            jArr2[iIntValue] = jArr[iIntValue][i20];
            u(arrayList, jArr2);
        }
        for (int i21 = 0; i21 < zoVarArr.length; i21++) {
            if (arrayList.get(i21) != null) {
                long j10 = jArr2[i21];
                jArr2[i21] = j10 + j10;
            }
        }
        u(arrayList, jArr2);
        avk avkVarJ2 = avo.j();
        for (int i22 = 0; i22 < arrayList.size(); i22++) {
            avk avkVar = (avk) arrayList.get(i22);
            avkVarJ2.g(avkVar == null ? avo.o() : avkVar.f());
        }
        return avkVarJ2.f();
    }

    private static void u(List list, long[] jArr) {
        long j9 = 0;
        for (long j10 : jArr) {
            j9 += j10;
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            avk avkVar = (avk) list.get(i9);
            if (avkVar != null) {
                avkVar.g(new vj(j9, jArr[i9]));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int v(long j9) {
        long jE = (long) (((long) (this.f24847d.e() * 0.7f)) / this.f24853j);
        if (!this.f24851h.isEmpty()) {
            int i9 = 1;
            while (i9 < this.f24851h.size() - 1 && ((vj) this.f24851h.get(i9)).f24844a < jE) {
                i9++;
            }
            vj vjVar = (vj) this.f24851h.get(i9 - 1);
            vj vjVar2 = (vj) this.f24851h.get(i9);
            long j10 = vjVar.f24844a;
            long j11 = vjVar2.f24844a;
            jE = ((long) (((jE - j10) / (j11 - j10)) * (vjVar2.f24845b - r8))) + vjVar.f24845b;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f24859b; i11++) {
            if (j9 == Long.MIN_VALUE || !s(i11, j9)) {
                if (o(i11).f24463h <= jE) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    private static final long w(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        ve veVar = (ve) axo.z(list);
        long j9 = veVar.f24785l;
        if (j9 != -9223372036854775807L) {
            long j10 = veVar.f24786m;
            if (j10 != -9223372036854775807L) {
                return j10 - j9;
            }
        }
        return -9223372036854775807L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.we
    public final int a() {
        return this.f24854k;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.we
    public final int b() {
        return this.f24855l;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.we
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.we
    public final void d(long j9, long j10, List list, vg[] vgVarArr) {
        long jW;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i9 = this.f24854k;
        int length = vgVarArr.length;
        int i10 = 0;
        if (i9 >= length || !vgVarArr[i9].e()) {
            while (true) {
                if (i10 >= length) {
                    jW = w(list);
                    break;
                }
                vg vgVar = vgVarArr[i10];
                if (vgVar.e()) {
                    jW = vgVar.a() - vgVar.b();
                    break;
                }
                i10++;
            }
        } else {
            vg vgVar2 = vgVarArr[this.f24854k];
            jW = vgVar2.a() - vgVar2.b();
        }
        int i11 = this.f24855l;
        if (i11 == 0) {
            this.f24855l = 1;
            this.f24854k = v(jElapsedRealtime);
            return;
        }
        int i12 = this.f24854k;
        int iM = list.isEmpty() ? -1 : m(((ve) axo.z(list)).f24782i);
        if (iM != -1) {
            i11 = ((ve) axo.z(list)).f24783j;
            i12 = iM;
        }
        int iV = v(jElapsedRealtime);
        if (!s(i12, jElapsedRealtime)) {
            C1333s c1333sO = o(i12);
            C1333s c1333sO2 = o(iV);
            long jMin = 10000000;
            if (j10 != -9223372036854775807L) {
                jMin = Math.min((long) ((jW != -9223372036854775807L ? j10 - jW : j10) * 0.75f), 10000000L);
            }
            int i13 = c1333sO2.f24463h;
            int i14 = c1333sO.f24463h;
            if ((i13 > i14 && j9 < jMin) || (i13 < i14 && j9 >= 25000000)) {
                iV = i12;
            }
        }
        if (iV != i12) {
            i11 = 3;
        }
        this.f24855l = i11;
        this.f24854k = iV;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vm, com.google.ads.interactivemedia.v3.internal.we
    public final int e(long j9, List list) {
        int i9;
        int i10;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f24856m;
        if (j10 != -9223372036854775807L && jElapsedRealtime - j10 < 1000 && (list.isEmpty() || ((ve) axo.z(list)).equals(this.f24857n))) {
            return list.size();
        }
        this.f24856m = jElapsedRealtime;
        this.f24857n = list.isEmpty() ? null : (ve) axo.z(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        if (cq.s(((ve) list.get(size - 1)).f24785l - j9, this.f24853j) < 25000000) {
            return size;
        }
        w(list);
        C1333s c1333sO = o(v(jElapsedRealtime));
        for (int i11 = 0; i11 < size; i11++) {
            ve veVar = (ve) list.get(i11);
            C1333s c1333s = veVar.f24782i;
            if (cq.s(veVar.f24785l - j9, this.f24853j) >= 25000000 && c1333s.f24463h < c1333sO.f24463h && (i9 = c1333s.f24473r) != -1 && i9 <= 719 && (i10 = c1333s.f24472q) != -1 && i10 <= 1279 && i9 < c1333sO.f24473r) {
                return i11;
            }
        }
        return size;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vm, com.google.ads.interactivemedia.v3.internal.we
    public final void f() {
        this.f24857n = null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vm, com.google.ads.interactivemedia.v3.internal.we
    public final void g() {
        this.f24856m = -9223372036854775807L;
        this.f24857n = null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vm, com.google.ads.interactivemedia.v3.internal.we
    public final void h(float f9) {
        this.f24853j = f9;
    }
}
