package R1;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.io.IOException;
import java.io.OutputStream;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f8560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8564g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8566i;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8573p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8574q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8575r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f8579v;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8565h = 12;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8567j = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f8568k = new int[5003];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f8569l = new int[5003];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8570m = 5003;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8571n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f8572o = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8576s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f8577t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int[] f8578u = {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, Settings.DEFAULT_INITIAL_WINDOW_SIZE};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte[] f8580w = new byte[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];

    public b(int i9, int i10, byte[] bArr, int i11) {
        this.f8558a = i9;
        this.f8559b = i10;
        this.f8560c = bArr;
        this.f8561d = Math.max(2, i11);
    }

    public final int a(int i9) {
        return (1 << i9) - 1;
    }

    public void b(byte b9, OutputStream outputStream) throws IOException {
        byte[] bArr = this.f8580w;
        int i9 = this.f8579v;
        int i10 = i9 + 1;
        this.f8579v = i10;
        bArr[i9] = b9;
        if (i10 >= 254) {
            g(outputStream);
        }
    }

    public void c(OutputStream outputStream) throws IOException {
        d(this.f8570m);
        int i9 = this.f8574q;
        this.f8571n = i9 + 2;
        this.f8572o = true;
        i(i9, outputStream);
    }

    public void d(int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            this.f8568k[i10] = -1;
        }
    }

    public void e(int i9, OutputStream outputStream) throws IOException {
        int i10;
        this.f8573p = i9;
        int i11 = 0;
        this.f8572o = false;
        this.f8564g = i9;
        this.f8566i = a(i9);
        int i12 = 1 << (i9 - 1);
        this.f8574q = i12;
        this.f8575r = i12 + 1;
        this.f8571n = i12 + 2;
        this.f8579v = 0;
        int iH = h();
        for (int i13 = this.f8570m; i13 < 65536; i13 *= 2) {
            i11++;
        }
        int i14 = 8 - i11;
        int i15 = this.f8570m;
        d(i15);
        i(this.f8574q, outputStream);
        while (true) {
            int iH2 = h();
            if (iH2 == -1) {
                i(iH, outputStream);
                i(this.f8575r, outputStream);
                return;
            }
            int i16 = (iH2 << this.f8565h) + iH;
            int i17 = (iH2 << i14) ^ iH;
            int i18 = this.f8568k[i17];
            if (i18 == i16) {
                iH = this.f8569l[i17];
            } else {
                if (i18 >= 0) {
                    int i19 = i15 - i17;
                    if (i17 == 0) {
                        i19 = 1;
                    }
                    do {
                        i17 -= i19;
                        if (i17 < 0) {
                            i17 += i15;
                        }
                        i10 = this.f8568k[i17];
                        if (i10 == i16) {
                            iH = this.f8569l[i17];
                            break;
                        }
                    } while (i10 >= 0);
                }
                i(iH, outputStream);
                int i20 = this.f8571n;
                if (i20 < this.f8567j) {
                    int[] iArr = this.f8569l;
                    this.f8571n = i20 + 1;
                    iArr[i17] = i20;
                    this.f8568k[i17] = i16;
                } else {
                    c(outputStream);
                }
                iH = iH2;
            }
        }
    }

    public void f(OutputStream outputStream) throws IOException {
        outputStream.write(this.f8561d);
        this.f8562e = this.f8558a * this.f8559b;
        this.f8563f = 0;
        e(this.f8561d + 1, outputStream);
        outputStream.write(0);
    }

    public void g(OutputStream outputStream) throws IOException {
        int i9 = this.f8579v;
        if (i9 > 0) {
            outputStream.write(i9);
            outputStream.write(this.f8580w, 0, this.f8579v);
            this.f8579v = 0;
        }
    }

    public final int h() {
        int i9 = this.f8562e;
        if (i9 == 0) {
            return -1;
        }
        this.f8562e = i9 - 1;
        byte[] bArr = this.f8560c;
        int i10 = this.f8563f;
        this.f8563f = i10 + 1;
        return bArr[i10] & 255;
    }

    public void i(int i9, OutputStream outputStream) throws IOException {
        int i10 = this.f8576s;
        int[] iArr = this.f8578u;
        int i11 = this.f8577t;
        int i12 = i10 & iArr[i11];
        this.f8576s = i12;
        if (i11 > 0) {
            this.f8576s = i12 | (i9 << i11);
        } else {
            this.f8576s = i9;
        }
        this.f8577t = i11 + this.f8564g;
        while (this.f8577t >= 8) {
            b((byte) (this.f8576s & 255), outputStream);
            this.f8576s >>= 8;
            this.f8577t -= 8;
        }
        if (this.f8571n > this.f8566i || this.f8572o) {
            if (this.f8572o) {
                int i13 = this.f8573p;
                this.f8564g = i13;
                this.f8566i = a(i13);
                this.f8572o = false;
            } else {
                int i14 = this.f8564g + 1;
                this.f8564g = i14;
                this.f8566i = i14 == this.f8565h ? this.f8567j : a(i14);
            }
        }
        if (i9 == this.f8575r) {
            while (this.f8577t > 0) {
                b((byte) (this.f8576s & 255), outputStream);
                this.f8576s >>= 8;
                this.f8577t -= 8;
            }
            g(outputStream);
        }
    }
}
