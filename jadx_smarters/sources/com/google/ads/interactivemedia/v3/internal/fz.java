package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fz {
    public static final er a(float f9, float f10, long j9, float f11, long j10, long j11, float f12) {
        return new er(0.97f, 1.03f, 1000L, 1.0E-7f, j10, j11, 0.999f);
    }

    public static int b(int i9) {
        return c(i9, 0, 0);
    }

    public static int c(int i9, int i10, int i11) {
        return d(i9, i10, i11, 0, 128);
    }

    @SuppressLint({"WrongConstant"})
    public static int d(int i9, int i10, int i11, int i12, int i13) {
        return i9 | i10 | i11 | i12 | i13;
    }

    @SuppressLint({"WrongConstant"})
    public static int e(int i9) {
        return i9 & 128;
    }

    @SuppressLint({"WrongConstant"})
    public static int f(int i9) {
        return i9 & 7;
    }

    @SuppressLint({"WrongConstant"})
    public static int g(int i9) {
        return i9 & 64;
    }

    public static int h(aae aaeVar, InterfaceC1310k interfaceC1310k, int i9, boolean z9) throws IOException {
        return aaeVar.h(interfaceC1310k, i9, z9);
    }

    public static void i(aae aaeVar, cj cjVar, int i9) {
        aaeVar.i(cjVar, i9);
    }

    public static List j(byte[] bArr) {
        byte b9 = bArr[11];
        byte b10 = bArr[10];
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(o(n(((b9 & 255) << 8) | (b10 & 255))));
        arrayList.add(o(n(3840L)));
        return arrayList;
    }

    public static void k(boolean z9, String str) throws as {
        if (!z9) {
            throw as.a(str, null);
        }
    }

    public static void l(long j9, cj cjVar, aae[] aaeVarArr) {
        int iE;
        while (true) {
            if (cjVar.a() <= 1) {
                return;
            }
            int iP = p(cjVar);
            int iP2 = p(cjVar);
            int iC = cjVar.c() + iP2;
            if (iP2 == -1 || iP2 > cjVar.a()) {
                cd.e("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iC = cjVar.d();
            } else if (iP == 4 && iP2 >= 8) {
                int i9 = cjVar.i();
                int iM = cjVar.m();
                if (iM == 49) {
                    iE = cjVar.e();
                    iM = 49;
                } else {
                    iE = 0;
                }
                int i10 = cjVar.i();
                if (iM == 47) {
                    cjVar.G(1);
                }
                boolean z9 = i9 == 181 && (iM == 49 || iM == 47) && i10 == 3;
                if (iM == 49) {
                    z9 &= iE == 1195456820;
                }
                if (z9) {
                    m(j9, cjVar, aaeVarArr);
                }
            }
            cjVar.F(iC);
        }
    }

    public static void m(long j9, cj cjVar, aae[] aaeVarArr) {
        int i9 = cjVar.i();
        if ((i9 & 64) != 0) {
            cjVar.G(1);
            int i10 = (i9 & 31) * 3;
            int iC = cjVar.c();
            for (aae aaeVar : aaeVarArr) {
                cjVar.F(iC);
                aaeVar.e(cjVar, i10);
                if (j9 != -9223372036854775807L) {
                    aaeVar.f(j9, 1, i10, 0, null);
                }
            }
        }
    }

    private static long n(long j9) {
        return (j9 * 1000000000) / 48000;
    }

    private static byte[] o(long j9) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j9).array();
    }

    private static int p(cj cjVar) {
        int i9 = 0;
        while (cjVar.a() != 0) {
            int i10 = cjVar.i();
            i9 += i10;
            if (i10 != 255) {
                return i9;
            }
        }
        return -1;
    }
}
