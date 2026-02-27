package d4;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f39651a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f39652b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f39653c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int[] f39654d = new int[10];

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f39655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f39656b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f39657c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f39658d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f39659e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f39660f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f39661g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int[] f39662h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f39663i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f39664j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f39665k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f39666l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final float f39667m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f39668n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f39669o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f39670p;

        public a(int i9, boolean z9, int i10, int i11, int i12, int i13, int i14, int[] iArr, int i15, int i16, int i17, int i18, float f9, int i19, int i20, int i21) {
            this.f39655a = i9;
            this.f39656b = z9;
            this.f39657c = i10;
            this.f39658d = i11;
            this.f39659e = i12;
            this.f39660f = i13;
            this.f39661g = i14;
            this.f39662h = iArr;
            this.f39663i = i15;
            this.f39664j = i16;
            this.f39665k = i17;
            this.f39666l = i18;
            this.f39667m = f9;
            this.f39668n = i19;
            this.f39669o = i20;
            this.f39670p = i21;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f39671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f39672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f39673c;

        public b(int i9, int i10, boolean z9) {
            this.f39671a = i9;
            this.f39672b = i10;
            this.f39673c = z9;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f39674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f39675b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f39676c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f39677d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f39678e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f39679f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f39680g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f39681h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f39682i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f39683j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f39684k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f39685l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f39686m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f39687n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f39688o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f39689p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f39690q;

        public c(int i9, int i10, int i11, int i12, int i13, int i14, int i15, float f9, boolean z9, boolean z10, int i16, int i17, int i18, boolean z11, int i19, int i20, int i21) {
            this.f39674a = i9;
            this.f39675b = i10;
            this.f39676c = i11;
            this.f39677d = i12;
            this.f39678e = i13;
            this.f39679f = i14;
            this.f39680g = i15;
            this.f39681h = f9;
            this.f39682i = z9;
            this.f39683j = z10;
            this.f39684k = i16;
            this.f39685l = i17;
            this.f39686m = i18;
            this.f39687n = z11;
            this.f39688o = i19;
            this.f39689p = i20;
            this.f39690q = i21;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int i11 = i9 + 1;
            if (i11 >= iPosition) {
                byteBuffer.clear();
                return;
            }
            int i12 = byteBuffer.get(i9) & 255;
            if (i10 == 3) {
                if (i12 == 1 && (byteBuffer.get(i11) & 31) == 7) {
                    ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                    byteBufferDuplicate.position(i9 - 3);
                    byteBufferDuplicate.limit(iPosition);
                    byteBuffer.position(0);
                    byteBuffer.put(byteBufferDuplicate);
                    return;
                }
            } else if (i12 == 0) {
                i10++;
            }
            if (i12 != 0) {
                i10 = 0;
            }
            i9 = i11;
        }
    }

    public static int c(byte[] bArr, int i9, int i10, boolean[] zArr) {
        int i11 = i10 - i9;
        AbstractC1684a.g(i11 >= 0);
        if (i11 == 0) {
            return i10;
        }
        if (zArr[0]) {
            a(zArr);
            return i9 - 3;
        }
        if (i11 > 1 && zArr[1] && bArr[i9] == 1) {
            a(zArr);
            return i9 - 2;
        }
        if (i11 > 2 && zArr[2] && bArr[i9] == 0 && bArr[i9 + 1] == 1) {
            a(zArr);
            return i9 - 1;
        }
        int i12 = i10 - 1;
        int i13 = i9 + 2;
        while (i13 < i12) {
            byte b9 = bArr[i13];
            if ((b9 & 254) == 0) {
                int i14 = i13 - 2;
                if (bArr[i14] == 0 && bArr[i13 - 1] == 0 && b9 == 1) {
                    a(zArr);
                    return i14;
                }
                i13 -= 2;
            }
            i13 += 3;
        }
        zArr[0] = i11 <= 2 ? !(i11 != 2 ? !(zArr[1] && bArr[i12] == 1) : !(zArr[2] && bArr[i10 + (-2)] == 0 && bArr[i12] == 1)) : bArr[i10 + (-3)] == 0 && bArr[i10 + (-2)] == 0 && bArr[i12] == 1;
        zArr[1] = i11 <= 1 ? zArr[2] && bArr[i12] == 0 : bArr[i10 + (-2)] == 0 && bArr[i12] == 0;
        zArr[2] = bArr[i12] == 0;
        return i10;
    }

    public static int d(byte[] bArr, int i9, int i10) {
        while (i9 < i10 - 2) {
            if (bArr[i9] == 0 && bArr[i9 + 1] == 0 && bArr[i9 + 2] == 3) {
                return i9;
            }
            i9++;
        }
        return i10;
    }

    public static int e(byte[] bArr, int i9) {
        return (bArr[i9 + 3] & 126) >> 1;
    }

    public static int f(byte[] bArr, int i9) {
        return bArr[i9 + 3] & 31;
    }

    public static boolean g(String str, byte b9) {
        if ("video/avc".equals(str) && (b9 & 31) == 6) {
            return true;
        }
        return "video/hevc".equals(str) && ((b9 & 126) >> 1) == 39;
    }

    public static a h(byte[] bArr, int i9, int i10) {
        return i(bArr, i9 + 2, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static d4.G.a i(byte[] r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.G.i(byte[], int, int):d4.G$a");
    }

    public static b j(byte[] bArr, int i9, int i10) {
        return k(bArr, i9 + 1, i10);
    }

    public static b k(byte[] bArr, int i9, int i10) {
        N n9 = new N(bArr, i9, i10);
        int iH = n9.h();
        int iH2 = n9.h();
        n9.k();
        return new b(iH, iH2, n9.d());
    }

    public static c l(byte[] bArr, int i9, int i10) {
        return m(bArr, i9 + 1, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x01b7 A[PHI: r16
      0x01b7: PHI (r16v5 float) = (r16v4 float), (r16v9 float) binds: [B:72:0x0133, B:89:0x0183] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static d4.G.c m(byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.G.m(byte[], int, int):d4.G$c");
    }

    public static void n(N n9) {
        for (int i9 = 0; i9 < 4; i9++) {
            int i10 = 0;
            while (i10 < 6) {
                int i11 = 1;
                if (n9.d()) {
                    int iMin = Math.min(64, 1 << ((i9 << 1) + 4));
                    if (i9 > 1) {
                        n9.g();
                    }
                    for (int i12 = 0; i12 < iMin; i12++) {
                        n9.g();
                    }
                } else {
                    n9.h();
                }
                if (i9 == 3) {
                    i11 = 3;
                }
                i10 += i11;
            }
        }
    }

    public static void o(N n9, int i9) {
        int iG = 8;
        int i10 = 8;
        for (int i11 = 0; i11 < i9; i11++) {
            if (iG != 0) {
                iG = ((n9.g() + i10) + JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) % JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
            }
            if (iG != 0) {
                i10 = iG;
            }
        }
    }

    public static void p(N n9) {
        int iH = n9.h();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i9 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < iH; i11++) {
            if (i11 == 0 || !n9.d()) {
                int iH2 = n9.h();
                int iH3 = n9.h();
                int[] iArr2 = new int[iH2];
                for (int i12 = 0; i12 < iH2; i12++) {
                    iArr2[i12] = n9.h() + 1;
                    n9.k();
                }
                int[] iArr3 = new int[iH3];
                for (int i13 = 0; i13 < iH3; i13++) {
                    iArr3[i13] = n9.h() + 1;
                    n9.k();
                }
                i9 = iH2;
                iArr = iArr2;
                i10 = iH3;
                iArrCopyOf = iArr3;
            } else {
                int i14 = i9 + i10;
                int iH4 = (1 - ((n9.d() ? 1 : 0) * 2)) * (n9.h() + 1);
                int i15 = i14 + 1;
                boolean[] zArr = new boolean[i15];
                for (int i16 = 0; i16 <= i14; i16++) {
                    if (n9.d()) {
                        zArr[i16] = true;
                    } else {
                        zArr[i16] = n9.d();
                    }
                }
                int[] iArr4 = new int[i15];
                int[] iArr5 = new int[i15];
                int i17 = 0;
                for (int i18 = i10 - 1; i18 >= 0; i18--) {
                    int i19 = iArrCopyOf[i18] + iH4;
                    if (i19 < 0 && zArr[i9 + i18]) {
                        iArr4[i17] = i19;
                        i17++;
                    }
                }
                if (iH4 < 0 && zArr[i14]) {
                    iArr4[i17] = iH4;
                    i17++;
                }
                for (int i20 = 0; i20 < i9; i20++) {
                    int i21 = iArr[i20] + iH4;
                    if (i21 < 0 && zArr[i20]) {
                        iArr4[i17] = i21;
                        i17++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i17);
                int i22 = 0;
                for (int i23 = i9 - 1; i23 >= 0; i23--) {
                    int i24 = iArr[i23] + iH4;
                    if (i24 > 0 && zArr[i23]) {
                        iArr5[i22] = i24;
                        i22++;
                    }
                }
                if (iH4 > 0 && zArr[i14]) {
                    iArr5[i22] = iH4;
                    i22++;
                }
                for (int i25 = 0; i25 < i10; i25++) {
                    int i26 = iArrCopyOf[i25] + iH4;
                    if (i26 > 0 && zArr[i9 + i25]) {
                        iArr5[i22] = i26;
                        i22++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr5, i22);
                iArr = iArrCopyOf2;
                i9 = i17;
                i10 = i22;
            }
        }
    }

    public static int q(byte[] bArr, int i9) {
        int i10;
        synchronized (f39653c) {
            int iD = 0;
            int i11 = 0;
            while (iD < i9) {
                try {
                    iD = d(bArr, iD, i9);
                    if (iD < i9) {
                        int[] iArr = f39654d;
                        if (iArr.length <= i11) {
                            f39654d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f39654d[i11] = iD;
                        iD += 3;
                        i11++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i10 = i9 - i11;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i11; i14++) {
                int i15 = f39654d[i14] - i13;
                System.arraycopy(bArr, i13, bArr, i12, i15);
                int i16 = i12 + i15;
                int i17 = i16 + 1;
                bArr[i16] = 0;
                i12 = i16 + 2;
                bArr[i17] = 0;
                i13 += i15 + 3;
            }
            System.arraycopy(bArr, i13, bArr, i12, i10 - i12);
        }
        return i10;
    }
}
