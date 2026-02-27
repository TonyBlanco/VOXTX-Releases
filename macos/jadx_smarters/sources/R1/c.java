package R1;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f8582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8584d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f8586f = new int[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f8587g = new int[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f8588h = new int[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f8589i = new int[32];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[][] f8585e = new int[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH][];

    public c(byte[] bArr, int i9, int i10) {
        this.f8582b = bArr;
        this.f8583c = i9;
        this.f8584d = i10;
        for (int i11 = 0; i11 < 256; i11++) {
            this.f8585e[i11] = new int[]{i, i, i, 0};
            int i12 = (i11 << 12) / JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
            this.f8588h[i11] = 256;
            this.f8587g[i11] = 0;
        }
    }

    public void a(int i9, int i10, int i11, int i12, int i13) {
        int i14 = i10 - i9;
        if (i14 < -1) {
            i14 = -1;
        }
        int i15 = i10 + i9;
        if (i15 > 256) {
            i15 = JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
        }
        int i16 = i10 + 1;
        int i17 = i10 - 1;
        int i18 = 1;
        while (true) {
            if (i16 >= i15 && i17 <= i14) {
                return;
            }
            int i19 = i18 + 1;
            int i20 = this.f8589i[i18];
            if (i16 < i15) {
                int i21 = i16 + 1;
                int[] iArr = this.f8585e[i16];
                try {
                    int i22 = iArr[0];
                    iArr[0] = i22 - (((i22 - i11) * i20) / 262144);
                    int i23 = iArr[1];
                    iArr[1] = i23 - (((i23 - i12) * i20) / 262144);
                    int i24 = iArr[2];
                    iArr[2] = i24 - (((i24 - i13) * i20) / 262144);
                } catch (Exception unused) {
                }
                i16 = i21;
            }
            if (i17 > i14) {
                int i25 = i17 - 1;
                int[] iArr2 = this.f8585e[i17];
                try {
                    int i26 = iArr2[0];
                    iArr2[0] = i26 - (((i26 - i11) * i20) / 262144);
                    int i27 = iArr2[1];
                    iArr2[1] = i27 - (((i27 - i12) * i20) / 262144);
                    int i28 = iArr2[2];
                    iArr2[2] = i28 - ((i20 * (i28 - i13)) / 262144);
                } catch (Exception unused2) {
                }
                i18 = i19;
                i17 = i25;
            } else {
                i18 = i19;
            }
        }
    }

    public void b(int i9, int i10, int i11, int i12, int i13) {
        int[] iArr = this.f8585e[i10];
        int i14 = iArr[0];
        iArr[0] = i14 - (((i14 - i11) * i9) / 1024);
        int i15 = iArr[1];
        iArr[1] = i15 - (((i15 - i12) * i9) / 1024);
        int i16 = iArr[2];
        iArr[2] = i16 - ((i9 * (i16 - i13)) / 1024);
    }

    public byte[] c() {
        byte[] bArr = new byte[768];
        int[] iArr = new int[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];
        for (int i9 = 0; i9 < 256; i9++) {
            iArr[this.f8585e[i9][3]] = i9;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            int[] iArr2 = this.f8585e[iArr[i11]];
            bArr[i10] = (byte) iArr2[0];
            int i12 = i10 + 2;
            bArr[i10 + 1] = (byte) iArr2[1];
            i10 += 3;
            bArr[i12] = (byte) iArr2[2];
        }
        return bArr;
    }

    public int d(int i9, int i10, int i11) {
        int i12 = a.e.API_PRIORITY_OTHER;
        int i13 = a.e.API_PRIORITY_OTHER;
        int i14 = -1;
        int i15 = -1;
        for (int i16 = 0; i16 < 256; i16++) {
            int[] iArr = this.f8585e[i16];
            int i17 = iArr[0] - i9;
            if (i17 < 0) {
                i17 = -i17;
            }
            int i18 = iArr[1] - i10;
            if (i18 < 0) {
                i18 = -i18;
            }
            int i19 = i17 + i18;
            int i20 = iArr[2] - i11;
            if (i20 < 0) {
                i20 = -i20;
            }
            int i21 = i19 + i20;
            if (i21 < i12) {
                i14 = i16;
                i12 = i21;
            }
            int[] iArr2 = this.f8587g;
            int i22 = i21 - (iArr2[i16] >> 12);
            if (i22 < i13) {
                i15 = i16;
                i13 = i22;
            }
            int[] iArr3 = this.f8588h;
            int i23 = iArr3[i16];
            int i24 = i23 >> 10;
            iArr3[i16] = i23 - i24;
            iArr2[i16] = iArr2[i16] + (i24 << 10);
        }
        int[] iArr4 = this.f8588h;
        iArr4[i14] = iArr4[i14] + 64;
        int[] iArr5 = this.f8587g;
        iArr5[i14] = iArr5[i14] - 65536;
        return i15;
    }

    public void e() {
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < 256) {
            int[] iArr = this.f8585e[i9];
            int i12 = iArr[1];
            int i13 = i9 + 1;
            int i14 = i9;
            for (int i15 = i13; i15 < 256; i15++) {
                int i16 = this.f8585e[i15][1];
                if (i16 < i12) {
                    i14 = i15;
                    i12 = i16;
                }
            }
            int[] iArr2 = this.f8585e[i14];
            if (i9 != i14) {
                int i17 = iArr2[0];
                iArr2[0] = iArr[0];
                iArr[0] = i17;
                int i18 = iArr2[1];
                iArr2[1] = iArr[1];
                iArr[1] = i18;
                int i19 = iArr2[2];
                iArr2[2] = iArr[2];
                iArr[2] = i19;
                int i20 = iArr2[3];
                iArr2[3] = iArr[3];
                iArr[3] = i20;
            }
            if (i12 != i10) {
                this.f8586f[i10] = (i11 + i9) >> 1;
                while (true) {
                    i10++;
                    if (i10 >= i12) {
                        break;
                    } else {
                        this.f8586f[i10] = i9;
                    }
                }
                i11 = i9;
                i10 = i12;
            }
            i9 = i13;
        }
        this.f8586f[i10] = (i11 + 255) >> 1;
        for (int i21 = i10 + 1; i21 < 256; i21++) {
            this.f8586f[i21] = 255;
        }
    }

    public void f() {
        int i9 = this.f8583c;
        if (i9 < 1509) {
            this.f8584d = 1;
        }
        int i10 = this.f8584d;
        this.f8581a = ((i10 - 1) / 3) + 30;
        byte[] bArr = this.f8582b;
        int i11 = i9 / (i10 * 3);
        int i12 = i11 / 100;
        for (int i13 = 0; i13 < 32; i13++) {
            this.f8589i[i13] = 1024 * (((1024 - (i13 * i13)) * JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) / 1024);
        }
        int i14 = this.f8583c;
        int i15 = i14 < 1509 ? 3 : i14 % 499 != 0 ? 1497 : i14 % 491 != 0 ? 1473 : i14 % 487 != 0 ? 1461 : 1509;
        int i16 = i12;
        int i17 = 0;
        int i18 = 2048;
        int i19 = 1024;
        int i20 = 32;
        int i21 = 0;
        while (i17 < i11) {
            int i22 = (bArr[i21] & 255) << 4;
            int i23 = (bArr[i21 + 1] & 255) << 4;
            int i24 = (bArr[i21 + 2] & 255) << 4;
            int iD = d(i22, i23, i24);
            int i25 = i17;
            b(i19, iD, i22, i23, i24);
            if (i20 != 0) {
                a(i20, iD, i22, i23, i24);
            }
            int i26 = i21 + i15;
            if (i26 >= i9) {
                i26 -= this.f8583c;
            }
            i21 = i26;
            i17 = i25 + 1;
            if (i16 == 0) {
                i16 = 1;
            }
            if (i17 % i16 == 0) {
                i19 -= i19 / this.f8581a;
                i18 -= i18 / 30;
                int i27 = i18 >> 6;
                if (i27 <= 1) {
                    i27 = 0;
                }
                for (int i28 = 0; i28 < i27; i28++) {
                    int i29 = i27 * i27;
                    this.f8589i[i28] = (((i29 - (i28 * i28)) * JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) / i29) * i19;
                }
                i20 = i27;
            }
        }
    }

    public int g(int i9, int i10, int i11) {
        int i12 = this.f8586f[i10];
        int i13 = i12 - 1;
        int i14 = 1000;
        int i15 = -1;
        while (true) {
            if (i12 >= 256 && i13 < 0) {
                return i15;
            }
            if (i12 < 256) {
                int[] iArr = this.f8585e[i12];
                int i16 = iArr[1] - i10;
                if (i16 >= i14) {
                    i12 = JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
                } else {
                    i12++;
                    if (i16 < 0) {
                        i16 = -i16;
                    }
                    int i17 = iArr[0] - i9;
                    if (i17 < 0) {
                        i17 = -i17;
                    }
                    int i18 = i16 + i17;
                    if (i18 < i14) {
                        int i19 = iArr[2] - i11;
                        if (i19 < 0) {
                            i19 = -i19;
                        }
                        int i20 = i18 + i19;
                        if (i20 < i14) {
                            i15 = iArr[3];
                            i14 = i20;
                        }
                    }
                }
            }
            if (i13 >= 0) {
                int[] iArr2 = this.f8585e[i13];
                int i21 = i10 - iArr2[1];
                if (i21 >= i14) {
                    i13 = -1;
                } else {
                    i13--;
                    if (i21 < 0) {
                        i21 = -i21;
                    }
                    int i22 = iArr2[0] - i9;
                    if (i22 < 0) {
                        i22 = -i22;
                    }
                    int i23 = i21 + i22;
                    if (i23 < i14) {
                        int i24 = iArr2[2] - i11;
                        if (i24 < 0) {
                            i24 = -i24;
                        }
                        int i25 = i24 + i23;
                        if (i25 < i14) {
                            i15 = iArr2[3];
                            i14 = i25;
                        }
                    }
                }
            }
        }
    }

    public byte[] h() {
        f();
        i();
        e();
        return c();
    }

    public void i() {
        for (int i9 = 0; i9 < 256; i9++) {
            int[] iArr = this.f8585e[i9];
            iArr[0] = iArr[0] >> 4;
            iArr[1] = iArr[1] >> 4;
            iArr[2] = iArr[2] >> 4;
            iArr[3] = i9;
        }
    }
}
