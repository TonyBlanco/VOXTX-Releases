package Q2;

import O2.C0936z0;
import V2.C1056m;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.nio.ByteBuffer;
import java.util.Arrays;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f7726a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f7727b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f7728c = {64, 112, 128, 192, 224, JceEncryptionConstants.SYMMETRIC_KEY_LENGTH, 384, 448, IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4f
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L20:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5e
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
        L36:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = 1
            goto L5e
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
            goto L36
        L4f:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L20
        L5e:
            if (r0 == 0) goto L64
            int r7 = r7 * 16
            int r7 = r7 / 14
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.Z.a(byte[]):int");
    }

    public static d4.L b(byte[] bArr) {
        if (bArr[0] == 127) {
            return new d4.L(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (c(bArrCopyOf)) {
            for (int i9 = 0; i9 < bArrCopyOf.length - 1; i9 += 2) {
                byte b9 = bArrCopyOf[i9];
                int i10 = i9 + 1;
                bArrCopyOf[i9] = bArrCopyOf[i10];
                bArrCopyOf[i10] = b9;
            }
        }
        d4.L l9 = new d4.L(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            d4.L l10 = new d4.L(bArrCopyOf);
            while (l10.b() >= 16) {
                l10.r(2);
                l9.f(l10.h(14), 14);
            }
        }
        l9.n(bArrCopyOf);
        return l9;
    }

    public static boolean c(byte[] bArr) {
        byte b9 = bArr[0];
        return b9 == -2 || b9 == -1;
    }

    public static boolean d(int i9) {
        return i9 == 2147385345 || i9 == -25230976 || i9 == 536864768 || i9 == -14745368;
    }

    public static int e(ByteBuffer byteBuffer) {
        int i9;
        int i10;
        int i11;
        int i12;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition = byteBuffer.position();
        byte b9 = byteBuffer.get(iPosition);
        if (b9 != -2) {
            if (b9 == -1) {
                i9 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                i12 = iPosition + 7;
            } else if (b9 != 31) {
                i9 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                i10 = iPosition + 5;
            } else {
                i9 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                i12 = iPosition + 6;
            }
            i11 = byteBuffer.get(i12) & 60;
            return (((i11 >> 2) | i9) + 1) * 32;
        }
        i9 = (byteBuffer.get(iPosition + 5) & 1) << 6;
        i10 = iPosition + 4;
        i11 = byteBuffer.get(i10) & 252;
        return (((i11 >> 2) | i9) + 1) * 32;
    }

    public static int f(byte[] bArr) {
        int i9;
        byte b9;
        int i10;
        byte b10;
        byte b11 = bArr[0];
        if (b11 != -2) {
            if (b11 == -1) {
                i9 = (bArr[4] & 7) << 4;
                b10 = bArr[7];
            } else if (b11 != 31) {
                i9 = (bArr[4] & 1) << 6;
                b9 = bArr[5];
            } else {
                i9 = (bArr[5] & 7) << 4;
                b10 = bArr[6];
            }
            i10 = b10 & 60;
            return (((i10 >> 2) | i9) + 1) * 32;
        }
        i9 = (bArr[5] & 1) << 6;
        b9 = bArr[4];
        i10 = b9 & 252;
        return (((i10 >> 2) | i9) + 1) * 32;
    }

    public static C0936z0 g(byte[] bArr, String str, String str2, C1056m c1056m) {
        d4.L lB = b(bArr);
        lB.r(60);
        int i9 = f7726a[lB.h(6)];
        int i10 = f7727b[lB.h(4)];
        int iH = lB.h(5);
        int[] iArr = f7728c;
        int i11 = iH >= iArr.length ? -1 : (iArr[iH] * 1000) / 2;
        lB.r(10);
        return new C0936z0.b().U(str).g0("audio/vnd.dts").I(i11).J(i9 + (lB.h(2) > 0 ? 1 : 0)).h0(i10).O(c1056m).X(str2).G();
    }
}
