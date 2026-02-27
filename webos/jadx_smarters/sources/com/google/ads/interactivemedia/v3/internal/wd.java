package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class wd extends wj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f24959a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final awy f24960b = awy.b(vp.f24872e);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final awy f24961c = awy.b(vp.f24873f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f24962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f24963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private vu f24964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private vy f24965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C1295f f24966h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final vk f24967i;

    @Deprecated
    public wd() {
        vu vuVar = vu.f24908B;
        throw null;
    }

    public wd(Context context) {
        this(vu.a(context), new vk(), context);
    }

    private wd(bi biVar, vk vkVar, Context context) {
        super(null);
        this.f24962d = new Object();
        if (context != null) {
            context.getApplicationContext();
        }
        this.f24967i = vkVar;
        this.f24964f = (vu) biVar;
        this.f24966h = C1295f.f22871a;
        boolean z9 = false;
        if (context != null && cq.ab(context)) {
            z9 = true;
        }
        this.f24963e = z9;
        if (!z9 && context != null && cq.f22640a >= 32) {
            this.f24965g = vy.a(context);
        }
        if (this.f24964f.f24918L && context == null) {
            cd.e("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static /* bridge */ /* synthetic */ int a(int i9, int i10) {
        return (i9 == 0 || i9 != i10) ? Integer.bitCount(i9 & i10) : a.e.API_PRIORITY_OTHER;
    }

    public static int b(C1333s c1333s, String str, boolean z9) {
        if (!TextUtils.isEmpty(str) && str.equals(c1333s.f24458c)) {
            return 4;
        }
        String strE = e(str);
        String strE2 = e(c1333s.f24458c);
        if (strE2 == null || strE == null) {
            return (z9 && strE2 == null) ? 1 : 0;
        }
        if (strE2.startsWith(strE) || strE.startsWith(strE2)) {
            return 3;
        }
        return cq.al(strE2, "-")[0].equals(cq.al(strE, "-")[0]) ? 2 : 0;
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ boolean i(com.google.ads.interactivemedia.v3.internal.wd r8, com.google.ads.interactivemedia.v3.internal.C1333s r9) {
        /*
            java.lang.Object r0 = r8.f24962d
            monitor-enter(r0)
            com.google.ads.interactivemedia.v3.internal.vu r1 = r8.f24964f     // Catch: java.lang.Throwable -> L90
            boolean r1 = r1.f24918L     // Catch: java.lang.Throwable -> L90
            r2 = 1
            if (r1 == 0) goto L92
            boolean r1 = r8.f24963e     // Catch: java.lang.Throwable -> L90
            if (r1 != 0) goto L92
            int r1 = r9.f24480y     // Catch: java.lang.Throwable -> L90
            r3 = 2
            if (r1 <= r3) goto L92
            java.lang.String r1 = r9.f24467l     // Catch: java.lang.Throwable -> L90
            r4 = 32
            r5 = 0
            if (r1 != 0) goto L1b
            goto L65
        L1b:
            int r6 = r1.hashCode()     // Catch: java.lang.Throwable -> L90
            r7 = 3
            switch(r6) {
                case -2123537834: goto L42;
                case 187078296: goto L38;
                case 187078297: goto L2e;
                case 1504578661: goto L24;
                default: goto L23;
            }
        L23:
            goto L4c
        L24:
            java.lang.String r6 = "audio/eac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 1
            goto L4d
        L2e:
            java.lang.String r6 = "audio/ac4"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 3
            goto L4d
        L38:
            java.lang.String r6 = "audio/ac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 0
            goto L4d
        L42:
            java.lang.String r6 = "audio/eac3-joc"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 2
            goto L4d
        L4c:
            r1 = -1
        L4d:
            if (r1 == 0) goto L56
            if (r1 == r2) goto L56
            if (r1 == r3) goto L56
            if (r1 == r7) goto L56
            goto L65
        L56:
            int r1 = com.google.ads.interactivemedia.v3.internal.cq.f22640a     // Catch: java.lang.Throwable -> L90
            if (r1 < r4) goto L92
            com.google.ads.interactivemedia.v3.internal.vy r1 = r8.f24965g     // Catch: java.lang.Throwable -> L90
            if (r1 == 0) goto L92
            boolean r1 = r1.g()     // Catch: java.lang.Throwable -> L90
            if (r1 != 0) goto L65
            goto L92
        L65:
            int r1 = com.google.ads.interactivemedia.v3.internal.cq.f22640a     // Catch: java.lang.Throwable -> L90
            if (r1 < r4) goto L8e
            com.google.ads.interactivemedia.v3.internal.vy r1 = r8.f24965g     // Catch: java.lang.Throwable -> L90
            if (r1 == 0) goto L8e
            boolean r1 = r1.g()     // Catch: java.lang.Throwable -> L90
            if (r1 == 0) goto L8e
            com.google.ads.interactivemedia.v3.internal.vy r1 = r8.f24965g     // Catch: java.lang.Throwable -> L90
            boolean r1 = r1.e()     // Catch: java.lang.Throwable -> L90
            if (r1 == 0) goto L8e
            com.google.ads.interactivemedia.v3.internal.vy r1 = r8.f24965g     // Catch: java.lang.Throwable -> L90
            boolean r1 = r1.f()     // Catch: java.lang.Throwable -> L90
            if (r1 == 0) goto L8e
            com.google.ads.interactivemedia.v3.internal.vy r1 = r8.f24965g     // Catch: java.lang.Throwable -> L90
            com.google.ads.interactivemedia.v3.internal.f r8 = r8.f24966h     // Catch: java.lang.Throwable -> L90
            boolean r8 = r1.d(r8, r9)     // Catch: java.lang.Throwable -> L90
            if (r8 == 0) goto L8e
            goto L92
        L8e:
            r2 = 0
            goto L92
        L90:
            r8 = move-exception
            goto L94
        L92:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L90
            return r2
        L94:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L90
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.wd.i(com.google.ads.interactivemedia.v3.internal.wd, com.google.ads.interactivemedia.v3.internal.s):boolean");
    }

    public static boolean j(int i9, boolean z9) {
        int iF = fz.f(i9);
        if (iF != 4) {
            return z9 && iF == 3;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        boolean z9;
        vy vyVar;
        synchronized (this.f24962d) {
            try {
                z9 = false;
                if (this.f24964f.f24918L && !this.f24963e && cq.f22640a >= 32 && (vyVar = this.f24965g) != null && vyVar.g()) {
                    z9 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z9) {
            o();
        }
    }

    private static void r(um umVar, bi biVar) {
        for (int i9 = 0; i9 < umVar.f24749b; i9++) {
            if (((bg) biVar.f21468z.get(umVar.b(i9))) != null) {
                throw null;
            }
        }
    }

    private static final Pair s(int i9, wg wgVar, int[][][] iArr, wa waVar, Comparator comparator) {
        int i10;
        RandomAccess randomAccessP;
        wg wgVar2 = wgVar;
        ArrayList arrayList = new ArrayList();
        int iA = wgVar.a();
        int i11 = 0;
        while (i11 < iA) {
            if (i9 == wgVar2.b(i11)) {
                um umVarD = wgVar2.d(i11);
                for (int i12 = 0; i12 < umVarD.f24749b; i12++) {
                    bf bfVarB = umVarD.b(i12);
                    List listA = waVar.a(i11, bfVarB, iArr[i11][i12]);
                    boolean[] zArr = new boolean[bfVarB.f21163a];
                    int i13 = 0;
                    while (i13 < bfVarB.f21163a) {
                        wb wbVar = (wb) listA.get(i13);
                        int iB = wbVar.b();
                        if (zArr[i13] || iB == 0) {
                            i10 = iA;
                        } else {
                            if (iB == 1) {
                                randomAccessP = avo.p(wbVar);
                                i10 = iA;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(wbVar);
                                int i14 = i13 + 1;
                                while (i14 < bfVarB.f21163a) {
                                    wb wbVar2 = (wb) listA.get(i14);
                                    int i15 = iA;
                                    if (wbVar2.b() == 2 && wbVar.c(wbVar2)) {
                                        arrayList2.add(wbVar2);
                                        zArr[i14] = true;
                                    }
                                    i14++;
                                    iA = i15;
                                }
                                i10 = iA;
                                randomAccessP = arrayList2;
                            }
                            arrayList.add(randomAccessP);
                        }
                        i13++;
                        iA = i10;
                    }
                }
            }
            i11++;
            wgVar2 = wgVar;
            iA = iA;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i16 = 0; i16 < list.size(); i16++) {
            iArr2[i16] = ((wb) list.get(i16)).f24943c;
        }
        wb wbVar3 = (wb) list.get(0);
        return Pair.create(new zo(wbVar3.f24942b, iArr2), Integer.valueOf(wbVar3.f24941a));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wj
    public final void g() {
        vy vyVar;
        synchronized (this.f24962d) {
            try {
                if (cq.f22640a >= 32 && (vyVar = this.f24965g) != null) {
                    vyVar.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.g();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wj
    public final void h(C1295f c1295f) {
        boolean z9;
        synchronized (this.f24962d) {
            z9 = !this.f24966h.equals(c1295f);
            this.f24966h = c1295f;
        }
        if (z9) {
            q();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wj
    public final void k() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.wj
    public final Pair l(wg wgVar, int[][][] iArr, int[] iArr2) throws ev {
        final vu vuVar;
        final boolean z9;
        String str;
        int[] iArr3;
        int length;
        bf bfVar;
        vy vyVar;
        int[][][] iArr4 = iArr;
        synchronized (this.f24962d) {
            try {
                vuVar = this.f24964f;
                if (vuVar.f24918L && cq.f22640a >= 32 && (vyVar = this.f24965g) != null) {
                    Looper looperMyLooper = Looper.myLooper();
                    af.t(looperMyLooper);
                    vyVar.b(this, looperMyLooper);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int iA = wgVar.a();
        int iA2 = wgVar.a();
        zo[] zoVarArr = new zo[iA2];
        int i9 = 1;
        int i10 = 2;
        Pair pairS = s(2, wgVar, iArr4, new vq(vuVar, iArr2, i9), vp.f24870c);
        if (pairS != null) {
            zoVarArr[((Integer) pairS.second).intValue()] = (zo) pairS.first;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= wgVar.a()) {
                z9 = false;
                break;
            }
            if (wgVar.b(i12) == 2 && wgVar.d(i12).f24749b > 0) {
                z9 = true;
                break;
            }
            i12++;
        }
        Pair pairS2 = s(1, wgVar, iArr4, new wa() { // from class: com.google.ads.interactivemedia.v3.internal.vo
            @Override // com.google.ads.interactivemedia.v3.internal.wa
            public final List a(int i13, bf bfVar2, int[] iArr5) {
                final wd wdVar = this.f24865a;
                vu vuVar2 = vuVar;
                boolean z10 = z9;
                atm atmVar = new atm() { // from class: com.google.ads.interactivemedia.v3.internal.vn
                    @Override // com.google.ads.interactivemedia.v3.internal.atm
                    public final boolean a(Object obj) {
                        return wd.i(wdVar, (C1333s) obj);
                    }
                };
                avk avkVarJ = avo.j();
                for (int i14 = 0; i14 < bfVar2.f21163a; i14++) {
                    avkVarJ.g(new vr(i13, bfVar2, i14, vuVar2, iArr5[i14], z10, atmVar));
                }
                return avkVarJ.f();
            }
        }, vp.f24868a);
        if (pairS2 != null) {
            zoVarArr[((Integer) pairS2.second).intValue()] = (zo) pairS2.first;
        }
        if (pairS2 == null) {
            str = null;
        } else {
            Object obj = pairS2.first;
            str = ((bf) ((zo) obj).f25265b).b(((int[]) ((zo) obj).f25264a)[0]).f24458c;
        }
        int i13 = 3;
        Pair pairS3 = s(3, wgVar, iArr4, new vq(vuVar, str, i11), vp.f24871d);
        if (pairS3 != null) {
            zoVarArr[((Integer) pairS3.second).intValue()] = (zo) pairS3.first;
        }
        int i14 = 0;
        while (i14 < iA2) {
            int iB = wgVar.b(i14);
            if (iB != i10 && iB != i9 && iB != i13) {
                um umVarD = wgVar.d(i14);
                int[][] iArr5 = iArr4[i14];
                bf bfVar2 = null;
                int i15 = 0;
                int i16 = 0;
                vs vsVar = null;
                while (i15 < umVarD.f24749b) {
                    bf bfVarB = umVarD.b(i15);
                    int[] iArr6 = iArr5[i15];
                    vs vsVar2 = vsVar;
                    for (int i17 = 0; i17 < bfVarB.f21163a; i17++) {
                        if (j(iArr6[i17], vuVar.f24919M)) {
                            bfVar = bfVar2;
                            vs vsVar3 = new vs(bfVarB.b(i17), iArr6[i17]);
                            if (vsVar2 == null || vsVar3.compareTo(vsVar2) > 0) {
                                i16 = i17;
                                vsVar2 = vsVar3;
                                bfVar2 = bfVarB;
                            }
                        } else {
                            bfVar = bfVar2;
                        }
                        bfVar2 = bfVar;
                    }
                    i15++;
                    vsVar = vsVar2;
                }
                zoVarArr[i14] = bfVar2 == null ? null : new zo(bfVar2, i16);
            }
            i14++;
            iArr4 = iArr;
            i9 = 1;
            i10 = 2;
            i13 = 3;
        }
        int iA3 = wgVar.a();
        HashMap map = new HashMap();
        for (int i18 = 0; i18 < iA3; i18++) {
            r(wgVar.d(i18), vuVar);
        }
        r(wgVar.e(), vuVar);
        for (int i19 = 0; i19 < iA3; i19++) {
            if (((bg) map.get(Integer.valueOf(wgVar.b(i19)))) != null) {
                throw null;
            }
        }
        int iA4 = wgVar.a();
        for (int i20 = 0; i20 < iA4; i20++) {
            um umVarD2 = wgVar.d(i20);
            if (vuVar.d(i20, umVarD2)) {
                if (vuVar.b(i20, umVarD2) != null) {
                    throw null;
                }
                zoVarArr[i20] = null;
            }
        }
        for (int i21 = 0; i21 < iA; i21++) {
            int iB2 = wgVar.b(i21);
            if (vuVar.c(i21) || vuVar.f21443A.contains(Integer.valueOf(iB2))) {
                zoVarArr[i21] = null;
            }
        }
        vk vkVar = this.f24967i;
        wq wqVarM = m();
        avo avoVarI = vl.i(zoVarArr);
        we[] weVarArr = new we[iA2];
        for (int i22 = 0; i22 < iA2; i22++) {
            zo zoVar = zoVarArr[i22];
            if (zoVar != null && (length = (iArr3 = (int[]) zoVar.f25264a).length) != 0) {
                weVarArr[i22] = length == 1 ? new wf((bf) zoVar.f25265b, iArr3[0]) : vkVar.a((bf) zoVar.f25265b, iArr3, wqVarM, (avo) avoVarI.get(i22));
            }
        }
        hj[] hjVarArr = new hj[iA];
        for (int i23 = 0; i23 < iA; i23++) {
            hjVarArr[i23] = (vuVar.c(i23) || vuVar.f21443A.contains(Integer.valueOf(wgVar.b(i23))) || (wgVar.b(i23) != -2 && weVarArr[i23] == null)) ? null : hj.f23170a;
        }
        return Pair.create(hjVarArr, weVarArr);
    }
}
