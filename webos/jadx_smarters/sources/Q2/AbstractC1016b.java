package Q2;

import O2.C0936z0;
import V2.C1056m;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.nio.ByteBuffer;
import okio.Utf8;
import org.apache.http.HttpStatus;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: renamed from: Q2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1016b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f7748a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f7749b = {48000, 44100, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f7750c = {24000, 22050, 16000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f7751d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f7752e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, JceEncryptionConstants.SYMMETRIC_KEY_LENGTH, 320, 384, 448, IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED, 576, 640};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f7753f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, HttpStatus.SC_EXPECTATION_FAILED, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: Q2.b$b, reason: collision with other inner class name */
    public static final class C0088b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7756c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f7757d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f7758e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f7759f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f7760g;

        public C0088b(String str, int i9, int i10, int i11, int i12, int i13, int i14) {
            this.f7754a = str;
            this.f7755b = i9;
            this.f7757d = i10;
            this.f7756c = i11;
            this.f7758e = i12;
            this.f7759f = i13;
            this.f7760g = i14;
        }
    }

    public static int a(int i9, int i10, int i11) {
        return (i9 * i10) / (i11 * 32);
    }

    public static int b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i9 = iPosition; i9 <= iLimit; i9++) {
            if ((d4.k0.K(byteBuffer, i9 + 4) & (-2)) == -126718022) {
                return i9 - iPosition;
            }
        }
        return -1;
    }

    public static int c(int i9, int i10) {
        int i11 = i10 / 2;
        if (i9 < 0) {
            return -1;
        }
        int[] iArr = f7749b;
        if (i9 >= iArr.length || i10 < 0) {
            return -1;
        }
        int[] iArr2 = f7753f;
        if (i11 >= iArr2.length) {
            return -1;
        }
        int i12 = iArr[i9];
        if (i12 == 44100) {
            return (iArr2[i11] + (i10 % 2)) * 2;
        }
        int i13 = f7752e[i11];
        return i12 == 32000 ? i13 * 6 : i13 * 4;
    }

    public static C0936z0 d(d4.M m9, String str, String str2, C1056m c1056m) {
        d4.L l9 = new d4.L();
        l9.m(m9);
        int i9 = f7749b[l9.h(2)];
        l9.r(8);
        int i10 = f7751d[l9.h(3)];
        if (l9.h(1) != 0) {
            i10++;
        }
        int i11 = f7752e[l9.h(5)] * 1000;
        l9.c();
        m9.U(l9.d());
        return new C0936z0.b().U(str).g0("audio/ac3").J(i10).h0(i9).O(c1056m).X(str2).I(i11).b0(i11).G();
    }

    public static int e(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f7748a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
        }
        return 1536;
    }

    public static C0088b f(d4.L l9) {
        String str;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int iE = l9.e();
        l9.r(40);
        boolean z9 = l9.h(5) > 10;
        l9.p(iE);
        int i21 = -1;
        if (z9) {
            l9.r(16);
            int iH = l9.h(2);
            if (iH == 0) {
                i21 = 0;
            } else if (iH == 1) {
                i21 = 1;
            } else if (iH == 2) {
                i21 = 2;
            }
            l9.r(3);
            int iH2 = (l9.h(11) + 1) * 2;
            int iH3 = l9.h(2);
            if (iH3 == 3) {
                i16 = f7750c[l9.h(2)];
                i15 = 3;
                i17 = 6;
            } else {
                int iH4 = l9.h(2);
                int i22 = f7748a[iH4];
                i15 = iH4;
                i16 = f7749b[iH3];
                i17 = i22;
            }
            int i23 = i17 * JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
            int iA = a(iH2, i16, i17);
            int iH5 = l9.h(3);
            boolean zG = l9.g();
            int i24 = f7751d[iH5] + (zG ? 1 : 0);
            l9.r(10);
            if (l9.g()) {
                l9.r(8);
            }
            if (iH5 == 0) {
                l9.r(5);
                if (l9.g()) {
                    l9.r(8);
                }
            }
            if (i21 == 1 && l9.g()) {
                l9.r(16);
            }
            if (l9.g()) {
                if (iH5 > 2) {
                    l9.r(2);
                }
                if ((iH5 & 1) == 0 || iH5 <= 2) {
                    i19 = 6;
                } else {
                    i19 = 6;
                    l9.r(6);
                }
                if ((iH5 & 4) != 0) {
                    l9.r(i19);
                }
                if (zG && l9.g()) {
                    l9.r(5);
                }
                if (i21 == 0) {
                    if (l9.g()) {
                        i20 = 6;
                        l9.r(6);
                    } else {
                        i20 = 6;
                    }
                    if (iH5 == 0 && l9.g()) {
                        l9.r(i20);
                    }
                    if (l9.g()) {
                        l9.r(i20);
                    }
                    int iH6 = l9.h(2);
                    if (iH6 == 1) {
                        l9.r(5);
                    } else if (iH6 == 2) {
                        l9.r(12);
                    } else if (iH6 == 3) {
                        int iH7 = l9.h(5);
                        if (l9.g()) {
                            l9.r(5);
                            if (l9.g()) {
                                l9.r(4);
                            }
                            if (l9.g()) {
                                l9.r(4);
                            }
                            if (l9.g()) {
                                l9.r(4);
                            }
                            if (l9.g()) {
                                l9.r(4);
                            }
                            if (l9.g()) {
                                l9.r(4);
                            }
                            if (l9.g()) {
                                l9.r(4);
                            }
                            if (l9.g()) {
                                l9.r(4);
                            }
                            if (l9.g()) {
                                if (l9.g()) {
                                    l9.r(4);
                                }
                                if (l9.g()) {
                                    l9.r(4);
                                }
                            }
                        }
                        if (l9.g()) {
                            l9.r(5);
                            if (l9.g()) {
                                l9.r(7);
                                if (l9.g()) {
                                    l9.r(8);
                                }
                            }
                        }
                        l9.r((iH7 + 2) * 8);
                        l9.c();
                    }
                    if (iH5 < 2) {
                        if (l9.g()) {
                            l9.r(14);
                        }
                        if (iH5 == 0 && l9.g()) {
                            l9.r(14);
                        }
                    }
                    if (l9.g()) {
                        if (i15 == 0) {
                            l9.r(5);
                        } else {
                            for (int i25 = 0; i25 < i17; i25++) {
                                if (l9.g()) {
                                    l9.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (l9.g()) {
                l9.r(5);
                if (iH5 == 2) {
                    l9.r(4);
                }
                if (iH5 >= 6) {
                    l9.r(2);
                }
                if (l9.g()) {
                    l9.r(8);
                }
                if (iH5 == 0 && l9.g()) {
                    l9.r(8);
                }
                if (iH3 < 3) {
                    l9.q();
                }
            }
            if (i21 == 0 && i15 != 3) {
                l9.q();
            }
            if (i21 == 2 && (i15 == 3 || l9.g())) {
                i18 = 6;
                l9.r(6);
            } else {
                i18 = 6;
            }
            str = (l9.g() && l9.h(i18) == 1 && l9.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i13 = i21;
            i14 = i23;
            i10 = iH2;
            i11 = i16;
            i9 = iA;
            i12 = i24;
        } else {
            l9.r(32);
            int iH8 = l9.h(2);
            String str2 = iH8 == 3 ? null : "audio/ac3";
            int iH9 = l9.h(6);
            int i26 = f7752e[iH9 / 2] * 1000;
            int iC = c(iH8, iH9);
            l9.r(8);
            int iH10 = l9.h(3);
            if ((iH10 & 1) != 0 && iH10 != 1) {
                l9.r(2);
            }
            if ((iH10 & 4) != 0) {
                l9.r(2);
            }
            if (iH10 == 2) {
                l9.r(2);
            }
            int[] iArr = f7749b;
            str = str2;
            i9 = i26;
            i10 = iC;
            i11 = iH8 < iArr.length ? iArr[iH8] : -1;
            i12 = f7751d[iH10] + (l9.g() ? 1 : 0);
            i13 = -1;
            i14 = 1536;
        }
        return new C0088b(str, i13, i12, i11, i10, i14, i9);
    }

    public static int g(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b9 = bArr[4];
        return c((b9 & 192) >> 6, b9 & Utf8.REPLACEMENT_BYTE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static O2.C0936z0 h(d4.M r7, java.lang.String r8, java.lang.String r9, V2.C1056m r10) {
        /*
            d4.L r0 = new d4.L
            r0.<init>()
            r0.m(r7)
            r1 = 13
            int r1 = r0.h(r1)
            int r1 = r1 * 1000
            r2 = 3
            r0.r(r2)
            r3 = 2
            int r3 = r0.h(r3)
            int[] r4 = Q2.AbstractC1016b.f7749b
            r3 = r4[r3]
            r4 = 10
            r0.r(r4)
            int[] r4 = Q2.AbstractC1016b.f7751d
            int r5 = r0.h(r2)
            r4 = r4[r5]
            r5 = 1
            int r6 = r0.h(r5)
            if (r6 == 0) goto L33
            int r4 = r4 + 1
        L33:
            r0.r(r2)
            r2 = 4
            int r2 = r0.h(r2)
            r0.r(r5)
            if (r2 <= 0) goto L4f
            r2 = 6
            r0.s(r2)
            int r2 = r0.h(r5)
            if (r2 == 0) goto L4c
            int r4 = r4 + 2
        L4c:
            r0.r(r5)
        L4f:
            int r2 = r0.b()
            r6 = 7
            if (r2 <= r6) goto L62
            r0.r(r6)
            int r2 = r0.h(r5)
            if (r2 == 0) goto L62
            java.lang.String r2 = "audio/eac3-joc"
            goto L64
        L62:
            java.lang.String r2 = "audio/eac3"
        L64:
            r0.c()
            int r0 = r0.d()
            r7.U(r0)
            O2.z0$b r7 = new O2.z0$b
            r7.<init>()
            O2.z0$b r7 = r7.U(r8)
            O2.z0$b r7 = r7.g0(r2)
            O2.z0$b r7 = r7.J(r4)
            O2.z0$b r7 = r7.h0(r3)
            O2.z0$b r7 = r7.O(r10)
            O2.z0$b r7 = r7.X(r9)
            O2.z0$b r7 = r7.b0(r1)
            O2.z0 r7 = r7.G()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.AbstractC1016b.h(d4.M, java.lang.String, java.lang.String, V2.m):O2.z0");
    }

    public static int i(ByteBuffer byteBuffer, int i9) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i9) + ((byteBuffer.get((byteBuffer.position() + i9) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int j(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b9 = bArr[7];
            if ((b9 & 254) == 186) {
                return 40 << ((bArr[(b9 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }
}
