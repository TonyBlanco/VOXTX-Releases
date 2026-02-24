package com.google.ads.interactivemedia.v3.internal;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
final class acm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f18929a = cq.ad("OpusHead");

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair a(com.google.ads.interactivemedia.v3.internal.acd r12) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.acm.a(com.google.ads.interactivemedia.v3.internal.acd):android.util.Pair");
    }

    public static ao b(acc accVar) {
        abg abgVar;
        acd acdVarB = accVar.b(1751411826);
        acd acdVarB2 = accVar.b(1801812339);
        acd acdVarB3 = accVar.b(1768715124);
        if (acdVarB == null || acdVarB2 == null || acdVarB3 == null || g(acdVarB.f18899a) != 1835299937) {
            return null;
        }
        cj cjVar = acdVarB2.f18899a;
        cjVar.F(12);
        int iE = cjVar.e();
        String[] strArr = new String[iE];
        for (int i9 = 0; i9 < iE; i9++) {
            int iE2 = cjVar.e();
            cjVar.G(4);
            strArr[i9] = cjVar.u(iE2 - 8);
        }
        cj cjVar2 = acdVarB3.f18899a;
        cjVar2.F(8);
        ArrayList arrayList = new ArrayList();
        while (cjVar2.a() > 8) {
            int iC = cjVar2.c();
            int iE3 = cjVar2.e();
            int iE4 = cjVar2.e() - 1;
            if (iE4 < 0 || iE4 >= iE) {
                cd.e("AtomParsers", "Skipped metadata with unknown key index: " + iE4);
            } else {
                String str = strArr[iE4];
                int i10 = iC + iE3;
                int i11 = act.f18992b;
                while (true) {
                    int iC2 = cjVar2.c();
                    if (iC2 >= i10) {
                        abgVar = null;
                        break;
                    }
                    int iE5 = cjVar2.e();
                    if (cjVar2.e() == 1684108385) {
                        int iE6 = cjVar2.e();
                        int iE7 = cjVar2.e();
                        int i12 = iE5 - 16;
                        byte[] bArr = new byte[i12];
                        cjVar2.A(bArr, 0, i12);
                        abgVar = new abg(str, bArr, iE7, iE6);
                        break;
                    }
                    cjVar2.F(iC2 + iE5);
                }
                if (abgVar != null) {
                    arrayList.add(abgVar);
                }
            }
            cjVar2.F(iC + iE3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ao(arrayList);
    }

    public static void c(cj cjVar) {
        int iC = cjVar.c();
        cjVar.G(4);
        if (cjVar.e() != 1751411826) {
            iC += 4;
        }
        cjVar.F(iC);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bc, code lost:
    
        r7 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0848  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x09f1 A[PHI: r6
      0x09f1: PHI (r6v41 int) = (r6v40 int), (r6v40 int), (r6v73 int), (r6v40 int) binds: [B:425:0x0934, B:432:0x094e, B:449:0x09f0, B:431:0x094c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0a12  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0aaf A[PHI: r20
      0x0aaf: PHI (r20v7 int) = (r20v6 int), (r20v9 int) binds: [B:477:0x0a96, B:479:0x0a9d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0aed  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0aff  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0b02  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0b4f  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0b64  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0b67  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0bc2  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0bd6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0e33  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:636:0x0ae2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List d(com.google.ads.interactivemedia.v3.internal.acc r59, com.google.ads.interactivemedia.v3.internal.zp r60, long r61, com.google.ads.interactivemedia.v3.internal.C1322o r63, boolean r64, com.google.ads.interactivemedia.v3.internal.ati r65) throws com.google.ads.interactivemedia.v3.internal.as {
        /*
            Method dump skipped, instruction units count: 3652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.acm.d(com.google.ads.interactivemedia.v3.internal.acc, com.google.ads.interactivemedia.v3.internal.zp, long, com.google.ads.interactivemedia.v3.internal.o, boolean, com.google.ads.interactivemedia.v3.internal.ati):java.util.List");
    }

    private static int e(int i9) {
        if (i9 == 1936684398) {
            return 1;
        }
        if (i9 == 1986618469) {
            return 2;
        }
        if (i9 == 1952807028 || i9 == 1935832172 || i9 == 1937072756 || i9 == 1668047728) {
            return 3;
        }
        return i9 == 1835365473 ? 5 : -1;
    }

    private static int f(cj cjVar) {
        int i9 = cjVar.i();
        int i10 = i9 & 127;
        while ((i9 & 128) == 128) {
            i9 = cjVar.i();
            i10 = (i10 << 7) | (i9 & 127);
        }
        return i10;
    }

    private static int g(cj cjVar) {
        cjVar.F(16);
        return cjVar.e();
    }

    private static Pair h(acc accVar) {
        acd acdVarB = accVar.b(1701606260);
        if (acdVarB == null) {
            return null;
        }
        cj cjVar = acdVarB.f18899a;
        cjVar.F(8);
        int iF = ace.f(cjVar.e());
        int iL = cjVar.l();
        long[] jArr = new long[iL];
        long[] jArr2 = new long[iL];
        for (int i9 = 0; i9 < iL; i9++) {
            jArr[i9] = iF == 1 ? cjVar.q() : cjVar.p();
            jArr2[i9] = iF == 1 ? cjVar.o() : cjVar.e();
            if (cjVar.x() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            cjVar.G(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair i(cj cjVar) {
        cjVar.F(8);
        int iF = ace.f(cjVar.e());
        cjVar.G(iF == 0 ? 8 : 16);
        long jP = cjVar.p();
        cjVar.G(iF == 0 ? 4 : 8);
        int iM = cjVar.m();
        StringBuilder sb = new StringBuilder();
        sb.append((char) (((iM >> 10) & 31) + 96));
        sb.append((char) (((iM >> 5) & 31) + 96));
        sb.append((char) ((iM & 31) + 96));
        return Pair.create(Long.valueOf(jP), sb.toString());
    }

    private static Pair j(cj cjVar, int i9, int i10) throws as {
        Integer num;
        adc adcVar;
        Pair pairCreate;
        int i11;
        int i12;
        byte[] bArr;
        int iC = cjVar.c();
        while (iC - i9 < i10) {
            cjVar.F(iC);
            int iE = cjVar.e();
            fz.k(iE > 0, "childAtomSize must be positive");
            if (cjVar.e() == 1936289382) {
                int i13 = iC + 8;
                int i14 = -1;
                int i15 = 0;
                String strU = null;
                Integer numValueOf = null;
                while (i13 - iC < iE) {
                    cjVar.F(i13);
                    int iE2 = cjVar.e();
                    int iE3 = cjVar.e();
                    if (iE3 == 1718775137) {
                        numValueOf = Integer.valueOf(cjVar.e());
                    } else if (iE3 == 1935894637) {
                        cjVar.G(4);
                        strU = cjVar.u(4);
                    } else if (iE3 == 1935894633) {
                        i14 = i13;
                        i15 = iE2;
                    }
                    i13 += iE2;
                }
                if ("cenc".equals(strU) || "cbc1".equals(strU) || "cens".equals(strU) || "cbcs".equals(strU)) {
                    fz.k(numValueOf != null, "frma atom is mandatory");
                    fz.k(i14 != -1, "schi atom is mandatory");
                    int i16 = i14 + 8;
                    while (true) {
                        if (i16 - i14 >= i15) {
                            num = numValueOf;
                            adcVar = null;
                            break;
                        }
                        cjVar.F(i16);
                        int iE4 = cjVar.e();
                        if (cjVar.e() == 1952804451) {
                            int iE5 = cjVar.e();
                            cjVar.G(1);
                            if (ace.f(iE5) == 0) {
                                cjVar.G(1);
                                i11 = 0;
                                i12 = 0;
                            } else {
                                int i17 = cjVar.i();
                                int i18 = (i17 & 240) >> 4;
                                i11 = i17 & 15;
                                i12 = i18;
                            }
                            boolean z9 = cjVar.i() == 1;
                            int i19 = cjVar.i();
                            byte[] bArr2 = new byte[16];
                            cjVar.A(bArr2, 0, 16);
                            if (z9 && i19 == 0) {
                                int i20 = cjVar.i();
                                byte[] bArr3 = new byte[i20];
                                cjVar.A(bArr3, 0, i20);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = numValueOf;
                            adcVar = new adc(z9, strU, i19, bArr2, i12, i11, bArr);
                        } else {
                            i16 += iE4;
                        }
                    }
                    fz.k(adcVar != null, "tenc atom is mandatory");
                    int i21 = cq.f22640a;
                    pairCreate = Pair.create(num, adcVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iC += iE;
        }
        return null;
    }

    private static acg k(cj cjVar, int i9) {
        cjVar.F(i9 + 12);
        cjVar.G(1);
        f(cjVar);
        cjVar.G(2);
        int i10 = cjVar.i();
        if ((i10 & 128) != 0) {
            cjVar.G(2);
        }
        if ((i10 & 64) != 0) {
            cjVar.G(cjVar.i());
        }
        if ((i10 & 32) != 0) {
            cjVar.G(2);
        }
        cjVar.G(1);
        f(cjVar);
        String strH = ar.h(cjVar.i());
        if ("audio/mpeg".equals(strH) || "audio/vnd.dts".equals(strH) || "audio/vnd.dts.hd".equals(strH)) {
            return new acg(strH, null, -1L, -1L);
        }
        cjVar.G(4);
        long jP = cjVar.p();
        long jP2 = cjVar.p();
        cjVar.G(1);
        int iF = f(cjVar);
        byte[] bArr = new byte[iF];
        cjVar.A(bArr, 0, iF);
        return new acg(strH, bArr, jP2 <= 0 ? -1L : jP2, jP > 0 ? jP : -1L);
    }

    private static ByteBuffer l() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m(com.google.ads.interactivemedia.v3.internal.cj r24, int r25, int r26, int r27, int r28, java.lang.String r29, boolean r30, com.google.ads.interactivemedia.v3.internal.C1322o r31, com.google.ads.interactivemedia.v3.internal.aci r32, int r33) throws com.google.ads.interactivemedia.v3.internal.as {
        /*
            Method dump skipped, instruction units count: 1013
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.acm.m(com.google.ads.interactivemedia.v3.internal.cj, int, int, int, int, java.lang.String, boolean, com.google.ads.interactivemedia.v3.internal.o, com.google.ads.interactivemedia.v3.internal.aci, int):void");
    }

    private static boolean n(long[] jArr, long j9, long j10, long j11) {
        int length = jArr.length;
        int i9 = length - 1;
        return jArr[0] <= j10 && j10 < jArr[cq.d(4, 0, i9)] && jArr[cq.d(length + (-4), 0, i9)] < j11 && j11 <= j9;
    }
}
