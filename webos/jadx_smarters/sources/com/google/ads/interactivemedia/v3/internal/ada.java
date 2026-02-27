package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class ada {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f19035a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(zi ziVar) throws IOException {
        return c(ziVar, true);
    }

    public static boolean b(zi ziVar) throws IOException {
        return c(ziVar, false);
    }

    private static boolean c(zi ziVar, boolean z9) throws IOException {
        long jO;
        int i9;
        long jB = ziVar.b();
        long j9 = 4096;
        long j10 = -1;
        if (jB != -1 && jB <= 4096) {
            j9 = jB;
        }
        int i10 = (int) j9;
        cj cjVar = new cj(64);
        boolean z10 = false;
        int i11 = 0;
        boolean z11 = false;
        while (i11 < i10) {
            cjVar.B(8);
            if (!ziVar.k(cjVar.H(), z10 ? 1 : 0, 8, true)) {
                break;
            }
            long jP = cjVar.p();
            int iE = cjVar.e();
            if (jP == 1) {
                ziVar.f(cjVar.H(), 8, 8);
                i9 = 16;
                cjVar.E(16);
                jO = cjVar.o();
            } else {
                if (jP == 0) {
                    long jB2 = ziVar.b();
                    if (jB2 != j10) {
                        jP = (jB2 - ziVar.c()) + 8;
                    }
                }
                jO = jP;
                i9 = 8;
            }
            long j11 = i9;
            if (jO < j11) {
                return z10;
            }
            i11 += i9;
            if (iE == 1836019574) {
                i10 += (int) jO;
                if (jB != -1 && i10 > jB) {
                    i10 = (int) jB;
                }
                j10 = -1;
            } else {
                if (iE == 1836019558 || iE == 1836475768) {
                    z10 = true;
                    break;
                }
                if ((((long) i11) + jO) - j11 >= i10) {
                    break;
                }
                int i12 = (int) (jO - j11);
                i11 += i12;
                if (iE == 1718909296) {
                    if (i12 < 8) {
                        return false;
                    }
                    cjVar.B(i12);
                    ziVar.f(cjVar.H(), 0, i12);
                    int i13 = i12 >> 2;
                    for (int i14 = 0; i14 < i13; i14++) {
                        if (i14 != 1) {
                            int iE2 = cjVar.e();
                            if ((iE2 >>> 8) != 3368816) {
                                if (iE2 == 1751476579) {
                                    iE2 = 1751476579;
                                }
                                int[] iArr = f19035a;
                                for (int i15 = 0; i15 < 29; i15++) {
                                    if (iArr[i15] != iE2) {
                                    }
                                }
                            }
                            z11 = true;
                            break;
                        }
                        cjVar.G(4);
                    }
                    if (!z11) {
                        return false;
                    }
                } else if (i12 != 0) {
                    ziVar.e(i12);
                }
                j10 = -1;
                z10 = false;
            }
        }
        z10 = false;
        return z11 && z9 == z10;
    }
}
