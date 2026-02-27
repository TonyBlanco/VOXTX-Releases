package Q2;

import O2.C0936z0;
import V2.C1056m;
import com.facebook.ads.AdError;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: Q2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1017c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f7775a = {AdError.CACHE_ERROR_CODE, AdError.SERVER_ERROR_CODE, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX INFO: renamed from: Q2.c$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7777b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7778c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f7779d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f7780e;

        public b(int i9, int i10, int i11, int i12, int i13) {
            this.f7776a = i9;
            this.f7778c = i10;
            this.f7777b = i11;
            this.f7779d = i12;
            this.f7780e = i13;
        }
    }

    public static void a(int i9, d4.M m9) {
        m9.Q(7);
        byte[] bArrE = m9.e();
        bArrE[0] = -84;
        bArrE[1] = 64;
        bArrE[2] = -1;
        bArrE[3] = -1;
        bArrE[4] = (byte) ((i9 >> 16) & 255);
        bArrE[5] = (byte) ((i9 >> 8) & 255);
        bArrE[6] = (byte) (i9 & 255);
    }

    public static C0936z0 b(d4.M m9, String str, String str2, C1056m c1056m) {
        m9.V(1);
        return new C0936z0.b().U(str).g0("audio/ac4").J(2).h0(((m9.H() & 32) >> 5) == 1 ? 48000 : 44100).O(c1056m).X(str2).G();
    }

    public static int c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return d(new d4.L(bArr)).f7780e;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static Q2.AbstractC1017c.b d(d4.L r11) {
        /*
            r0 = 16
            int r1 = r11.h(r0)
            int r0 = r11.h(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r11.h(r0)
            r2 = 7
            goto L19
        L18:
            r2 = 4
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r8 = r0
            r0 = 2
            int r1 = r11.h(r0)
            r2 = 3
            if (r1 != r2) goto L2f
            int r4 = f(r11, r0)
            int r1 = r1 + r4
        L2f:
            r5 = r1
            r1 = 10
            int r1 = r11.h(r1)
            boolean r4 = r11.g()
            if (r4 == 0) goto L45
            int r4 = r11.h(r2)
            if (r4 <= 0) goto L45
            r11.r(r0)
        L45:
            boolean r4 = r11.g()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r4 == 0) goto L55
            r9 = 48000(0xbb80, float:6.7262E-41)
            goto L58
        L55:
            r9 = 44100(0xac44, float:6.1797E-41)
        L58:
            int r11 = r11.h(r3)
            if (r9 != r6) goto L67
            r4 = 13
            if (r11 != r4) goto L67
            int[] r0 = Q2.AbstractC1017c.f7775a
            r11 = r0[r11]
            goto L95
        L67:
            if (r9 != r7) goto L94
            int[] r4 = Q2.AbstractC1017c.f7775a
            int r6 = r4.length
            if (r11 >= r6) goto L94
            r4 = r4[r11]
            int r1 = r1 % 5
            r6 = 8
            r7 = 1
            if (r1 == r7) goto L8f
            r7 = 11
            if (r1 == r0) goto L8a
            if (r1 == r2) goto L8f
            if (r1 == r3) goto L80
            goto L88
        L80:
            if (r11 == r2) goto L86
            if (r11 == r6) goto L86
            if (r11 != r7) goto L88
        L86:
            int r4 = r4 + 1
        L88:
            r11 = r4
            goto L95
        L8a:
            if (r11 == r6) goto L86
            if (r11 != r7) goto L88
            goto L86
        L8f:
            if (r11 == r2) goto L86
            if (r11 != r6) goto L88
            goto L86
        L94:
            r11 = 0
        L95:
            Q2.c$b r0 = new Q2.c$b
            r6 = 2
            r10 = 0
            r4 = r0
            r7 = r9
            r9 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.AbstractC1017c.d(d4.L):Q2.c$b");
    }

    public static int e(byte[] bArr, int i9) {
        int i10 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i11 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i11 == 65535) {
            i11 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i10 = 4;
        }
        if (i9 == 44097) {
            i10 += 2;
        }
        return i11 + i10;
    }

    public static int f(d4.L l9, int i9) {
        int i10 = 0;
        while (true) {
            int iH = i10 + l9.h(i9);
            if (!l9.g()) {
                return iH;
            }
            i10 = (iH + 1) << i9;
        }
    }
}
