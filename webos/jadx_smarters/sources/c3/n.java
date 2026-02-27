package C3;

import B3.A;
import C3.b;
import O2.InterfaceC0920t1;
import O2.Q1;
import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n {
    public static b a(b bVar, long j9, long j10, long... jArr) {
        long jF = f(j9, -1, bVar);
        int i9 = bVar.f1047f;
        while (i9 < bVar.f1044c && bVar.e(i9).f1058a != Long.MIN_VALUE && bVar.e(i9).f1058a <= jF) {
            i9++;
        }
        b bVarU = bVar.y(i9, jF).v(i9, true).l(i9, jArr.length).m(i9, jArr).u(i9, j10);
        b bVarB = bVarU;
        for (int i10 = 0; i10 < jArr.length && jArr[i10] == 0; i10++) {
            bVarB = bVarB.B(i9, i10);
        }
        return b(bVarB, i9, k0.n1(jArr), j10);
    }

    public static b b(b bVar, int i9, long j9, long j10) {
        long j11 = (-j9) + j10;
        while (true) {
            i9++;
            if (i9 >= bVar.f1044c) {
                return bVar;
            }
            long j12 = bVar.e(i9).f1058a;
            if (j12 != Long.MIN_VALUE) {
                bVar = bVar.o(i9, j12 + j11);
            }
        }
    }

    public static int c(b bVar, int i9) {
        int i10 = bVar.e(i9).f1059c;
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    public static long d(long j9, A a9, b bVar) {
        return a9.b() ? e(j9, a9.f272b, a9.f273c, bVar) : f(j9, a9.f275e, bVar);
    }

    public static long e(long j9, int i9, int i10, b bVar) {
        int i11;
        b.C0010b c0010bE = bVar.e(i9);
        long j10 = j9 - c0010bE.f1058a;
        int i12 = bVar.f1047f;
        while (true) {
            i11 = 0;
            if (i12 >= i9) {
                break;
            }
            b.C0010b c0010bE2 = bVar.e(i12);
            while (i11 < c(bVar, i12)) {
                j10 -= c0010bE2.f1063g[i11];
                i11++;
            }
            j10 += c0010bE2.f1064h;
            i12++;
        }
        if (i10 < c(bVar, i9)) {
            while (i11 < i10) {
                j10 -= c0010bE.f1063g[i11];
                i11++;
            }
        }
        return j10;
    }

    public static long f(long j9, int i9, b bVar) {
        if (i9 == -1) {
            i9 = bVar.f1044c;
        }
        long j10 = 0;
        for (int i10 = bVar.f1047f; i10 < i9; i10++) {
            b.C0010b c0010bE = bVar.e(i10);
            long j11 = c0010bE.f1058a;
            if (j11 == Long.MIN_VALUE || j11 > j9 - j10) {
                break;
            }
            for (int i11 = 0; i11 < c(bVar, i10); i11++) {
                j10 += c0010bE.f1063g[i11];
            }
            long j12 = c0010bE.f1064h;
            j10 -= j12;
            long j13 = c0010bE.f1058a;
            long j14 = j9 - j10;
            if (j12 + j13 > j14) {
                return Math.max(j13, j14);
            }
        }
        return j9 - j10;
    }

    public static long g(long j9, A a9, b bVar) {
        return a9.b() ? i(j9, a9.f272b, a9.f273c, bVar) : j(j9, a9.f275e, bVar);
    }

    public static long h(InterfaceC0920t1 interfaceC0920t1, b bVar) {
        Q1 q1W = interfaceC0920t1.w();
        if (q1W.v()) {
            return -9223372036854775807L;
        }
        Q1.b bVarK = q1W.k(interfaceC0920t1.J(), new Q1.b());
        if (!k0.c(bVarK.m(), bVar.f1043a)) {
            return -9223372036854775807L;
        }
        if (!interfaceC0920t1.d()) {
            return j(k0.P0(interfaceC0920t1.getCurrentPosition()) - bVarK.t(), -1, bVar);
        }
        return i(k0.P0(interfaceC0920t1.getCurrentPosition()), interfaceC0920t1.s(), interfaceC0920t1.N(), bVar);
    }

    public static long i(long j9, int i9, int i10, b bVar) {
        int i11;
        b.C0010b c0010bE = bVar.e(i9);
        long j10 = j9 + c0010bE.f1058a;
        int i12 = bVar.f1047f;
        while (true) {
            i11 = 0;
            if (i12 >= i9) {
                break;
            }
            b.C0010b c0010bE2 = bVar.e(i12);
            while (i11 < c(bVar, i12)) {
                j10 += c0010bE2.f1063g[i11];
                i11++;
            }
            j10 -= c0010bE2.f1064h;
            i12++;
        }
        if (i10 < c(bVar, i9)) {
            while (i11 < i10) {
                j10 += c0010bE.f1063g[i11];
                i11++;
            }
        }
        return j10;
    }

    public static long j(long j9, int i9, b bVar) {
        if (i9 == -1) {
            i9 = bVar.f1044c;
        }
        long j10 = 0;
        for (int i10 = bVar.f1047f; i10 < i9; i10++) {
            b.C0010b c0010bE = bVar.e(i10);
            long j11 = c0010bE.f1058a;
            if (j11 == Long.MIN_VALUE || j11 > j9) {
                break;
            }
            long j12 = j11 + j10;
            for (int i11 = 0; i11 < c(bVar, i10); i11++) {
                j10 += c0010bE.f1063g[i11];
            }
            long j13 = c0010bE.f1064h;
            j10 -= j13;
            if (c0010bE.f1058a + j13 > j9) {
                return Math.max(j12, j9 + j10);
            }
        }
        return j9 + j10;
    }
}
