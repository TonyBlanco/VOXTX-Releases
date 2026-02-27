package X6;

import V6.j;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.HttpStatus;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import x6.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[][] f10471a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[][] f10472b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[][] f10473c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, HttpStatus.SC_PROCESSING, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, IjkMediaMeta.FF_PROFILE_H264_HIGH_10, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, IjkMediaMeta.FF_PROFILE_H264_HIGH_422, -1}, new int[]{6, 30, 54, 78, HttpStatus.SC_PROCESSING, WebSocketProtocol.PAYLOAD_SHORT, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, HttpStatus.SC_PROCESSING, WebSocketProtocol.PAYLOAD_SHORT, 150}, new int[]{6, 24, 50, 76, HttpStatus.SC_PROCESSING, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, IjkMediaMeta.FF_PROFILE_H264_HIGH_10, 136, 162}, new int[]{6, 26, 54, 82, IjkMediaMeta.FF_PROFILE_H264_HIGH_10, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[][] f10474d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    public static void a(D6.a aVar, V6.f fVar, j jVar, int i9, b bVar) throws s {
        c(bVar);
        d(jVar, bVar);
        l(fVar, i9, bVar);
        s(jVar, bVar);
        f(aVar, i9, bVar);
    }

    public static int b(int i9, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int iN = n(i10);
        int iN2 = i9 << (iN - 1);
        while (n(iN2) >= iN) {
            iN2 ^= i10 << (n(iN2) - iN);
        }
        return iN2;
    }

    public static void c(b bVar) {
        bVar.a((byte) -1);
    }

    public static void d(j jVar, b bVar) throws s {
        j(bVar);
        e(bVar);
        r(jVar, bVar);
        k(bVar);
    }

    public static void e(b bVar) throws s {
        if (bVar.b(8, bVar.d() - 8) == 0) {
            throw new s();
        }
        bVar.f(8, bVar.d() - 8, 1);
    }

    public static void f(D6.a aVar, int i9, b bVar) throws s {
        boolean zH;
        int iE = bVar.e() - 1;
        int iD = bVar.d() - 1;
        int i10 = 0;
        int i11 = -1;
        while (iE > 0) {
            if (iE == 6) {
                iE--;
            }
            while (iD >= 0 && iD < bVar.d()) {
                for (int i12 = 0; i12 < 2; i12++) {
                    int i13 = iE - i12;
                    if (o(bVar.b(i13, iD))) {
                        if (i10 < aVar.l()) {
                            zH = aVar.h(i10);
                            i10++;
                        } else {
                            zH = false;
                        }
                        if (i9 != -1 && d.f(i9, i13, iD)) {
                            zH = !zH;
                        }
                        bVar.g(i13, iD, zH);
                    }
                }
                iD += i11;
            }
            i11 = -i11;
            iD += i11;
            iE -= 2;
        }
        if (i10 == aVar.l()) {
            return;
        }
        throw new s("Not all bits consumed: " + i10 + '/' + aVar.l());
    }

    public static void g(int i9, int i10, b bVar) throws s {
        for (int i11 = 0; i11 < 8; i11++) {
            int i12 = i9 + i11;
            if (!o(bVar.b(i12, i10))) {
                throw new s();
            }
            bVar.f(i12, i10, 0);
        }
    }

    public static void h(int i9, int i10, b bVar) {
        for (int i11 = 0; i11 < 5; i11++) {
            int[] iArr = f10472b[i11];
            for (int i12 = 0; i12 < 5; i12++) {
                bVar.f(i9 + i12, i10 + i11, iArr[i12]);
            }
        }
    }

    public static void i(int i9, int i10, b bVar) {
        for (int i11 = 0; i11 < 7; i11++) {
            int[] iArr = f10471a[i11];
            for (int i12 = 0; i12 < 7; i12++) {
                bVar.f(i9 + i12, i10 + i11, iArr[i12]);
            }
        }
    }

    public static void j(b bVar) throws s {
        int length = f10471a[0].length;
        i(0, 0, bVar);
        i(bVar.e() - length, 0, bVar);
        i(0, bVar.e() - length, bVar);
        g(0, 7, bVar);
        g(bVar.e() - 8, 7, bVar);
        g(0, bVar.e() - 8, bVar);
        m(7, 0, bVar);
        m(bVar.d() - 8, 0, bVar);
        m(7, bVar.d() - 7, bVar);
    }

    public static void k(b bVar) {
        int i9 = 8;
        while (i9 < bVar.e() - 8) {
            int i10 = i9 + 1;
            int i11 = i10 % 2;
            if (o(bVar.b(i9, 6))) {
                bVar.f(i9, 6, i11);
            }
            if (o(bVar.b(6, i9))) {
                bVar.f(6, i9, i11);
            }
            i9 = i10;
        }
    }

    public static void l(V6.f fVar, int i9, b bVar) throws s {
        int iD;
        D6.a aVar = new D6.a();
        p(fVar, i9, aVar);
        for (int i10 = 0; i10 < aVar.l(); i10++) {
            boolean zH = aVar.h((aVar.l() - 1) - i10);
            int[] iArr = f10474d[i10];
            bVar.g(iArr[0], iArr[1], zH);
            int iE = 8;
            if (i10 < 8) {
                iE = (bVar.e() - i10) - 1;
                iD = 8;
            } else {
                iD = (bVar.d() - 7) + (i10 - 8);
            }
            bVar.g(iE, iD, zH);
        }
    }

    public static void m(int i9, int i10, b bVar) throws s {
        for (int i11 = 0; i11 < 7; i11++) {
            int i12 = i10 + i11;
            if (!o(bVar.b(i9, i12))) {
                throw new s();
            }
            bVar.f(i9, i12, 0);
        }
    }

    public static int n(int i9) {
        return 32 - Integer.numberOfLeadingZeros(i9);
    }

    public static boolean o(int i9) {
        return i9 == -1;
    }

    public static void p(V6.f fVar, int i9, D6.a aVar) throws s {
        if (!f.b(i9)) {
            throw new s("Invalid mask pattern");
        }
        int bits = (fVar.getBits() << 3) | i9;
        aVar.d(bits, 5);
        aVar.d(b(bits, 1335), 10);
        D6.a aVar2 = new D6.a();
        aVar2.d(21522, 15);
        aVar.u(aVar2);
        if (aVar.l() == 15) {
            return;
        }
        throw new s("should not happen but we got: " + aVar.l());
    }

    public static void q(j jVar, D6.a aVar) throws s {
        aVar.d(jVar.j(), 6);
        aVar.d(b(jVar.j(), 7973), 12);
        if (aVar.l() == 18) {
            return;
        }
        throw new s("should not happen but we got: " + aVar.l());
    }

    public static void r(j jVar, b bVar) {
        if (jVar.j() < 2) {
            return;
        }
        int[] iArr = f10473c[jVar.j() - 1];
        for (int i9 : iArr) {
            if (i9 >= 0) {
                for (int i10 : iArr) {
                    if (i10 >= 0 && o(bVar.b(i10, i9))) {
                        h(i10 - 2, i9 - 2, bVar);
                    }
                }
            }
        }
    }

    public static void s(j jVar, b bVar) throws s {
        if (jVar.j() < 7) {
            return;
        }
        D6.a aVar = new D6.a();
        q(jVar, aVar);
        int i9 = 17;
        for (int i10 = 0; i10 < 6; i10++) {
            for (int i11 = 0; i11 < 3; i11++) {
                boolean zH = aVar.h(i9);
                i9--;
                bVar.g(i10, (bVar.d() - 11) + i11, zH);
                bVar.g((bVar.d() - 11) + i11, i10, zH);
            }
        }
    }
}
