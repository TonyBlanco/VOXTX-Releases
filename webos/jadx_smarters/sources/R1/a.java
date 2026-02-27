package R1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.io.IOException;
import java.io.OutputStream;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8538b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8540d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public OutputStream f8544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Bitmap f8545i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f8546j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f8547k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8548l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f8549m;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f8557u;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f8539c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8541e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8542f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8543g = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean[] f8550n = new boolean[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8551o = 7;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8552p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f8553q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f8554r = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f8555s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f8556t = 10;

    public boolean a(Bitmap bitmap) {
        if (bitmap == null || !this.f8543g) {
            return false;
        }
        try {
            if (!this.f8555s) {
                g(bitmap.getWidth(), bitmap.getHeight());
            }
            this.f8545i = bitmap;
            e();
            b();
            if (this.f8554r) {
                k();
                m();
                if (this.f8541e >= 0) {
                    l();
                }
            }
            i();
            j();
            if (!this.f8554r) {
                m();
            }
            n();
            this.f8554r = false;
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public final void b() {
        byte[] bArr = this.f8546j;
        int length = bArr.length;
        int i9 = length / 3;
        this.f8547k = new byte[i9];
        c cVar = new c(bArr, length, this.f8556t);
        this.f8549m = cVar.h();
        int iIntValue = 0;
        int i10 = 0;
        while (true) {
            byte[] bArr2 = this.f8549m;
            if (i10 >= bArr2.length) {
                break;
            }
            byte b9 = bArr2[i10];
            int i11 = i10 + 2;
            bArr2[i10] = bArr2[i11];
            bArr2[i11] = b9;
            this.f8550n[i10 / 3] = false;
            i10 += 3;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i9; i13++) {
            byte[] bArr3 = this.f8546j;
            int i14 = bArr3[i12] & 255;
            int i15 = i12 + 2;
            int i16 = bArr3[i12 + 1] & 255;
            i12 += 3;
            int iG = cVar.g(i14, i16, bArr3[i15] & 255);
            this.f8550n[iG] = true;
            this.f8547k[i13] = (byte) iG;
        }
        this.f8546j = null;
        this.f8548l = 8;
        this.f8551o = 7;
        Integer num = this.f8539c;
        if (num != null) {
            iIntValue = num.intValue();
        } else if (!this.f8557u) {
            return;
        }
        this.f8540d = c(iIntValue);
    }

    public final int c(int i9) {
        if (this.f8549m == null) {
            return -1;
        }
        int iRed = Color.red(i9);
        int iGreen = Color.green(i9);
        int iBlue = Color.blue(i9);
        int length = this.f8549m.length;
        int i10 = 0;
        int i11 = Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        for (int i12 = 0; i12 < length; i12 += 3) {
            byte[] bArr = this.f8549m;
            int i13 = iRed - (bArr[i12] & 255);
            int i14 = i12 + 2;
            int i15 = iGreen - (bArr[i12 + 1] & 255);
            int i16 = iBlue - (bArr[i14] & 255);
            int i17 = (i13 * i13) + (i15 * i15) + (i16 * i16);
            int i18 = i14 / 3;
            if (this.f8550n[i18] && i17 < i11) {
                i11 = i17;
                i10 = i18;
            }
        }
        return i10;
    }

    public boolean d() {
        boolean z9;
        if (!this.f8543g) {
            return false;
        }
        this.f8543g = false;
        try {
            this.f8544h.write(59);
            this.f8544h.flush();
            if (this.f8553q) {
                this.f8544h.close();
            }
            z9 = true;
        } catch (IOException unused) {
            z9 = false;
        }
        this.f8540d = 0;
        this.f8544h = null;
        this.f8545i = null;
        this.f8546j = null;
        this.f8547k = null;
        this.f8549m = null;
        this.f8553q = false;
        this.f8554r = true;
        return z9;
    }

    public final void e() {
        int width = this.f8545i.getWidth();
        int height = this.f8545i.getHeight();
        int i9 = this.f8537a;
        if (width != i9 || height != this.f8538b) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i9, this.f8538b, Bitmap.Config.ARGB_8888);
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
            this.f8545i = bitmapCreateBitmap;
        }
        int i10 = width * height;
        int[] iArr = new int[i10];
        this.f8545i.getPixels(iArr, 0, width, 0, 0, width, height);
        this.f8546j = new byte[i10 * 3];
        this.f8557u = false;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = iArr[i13];
            if (i14 == 0) {
                i11++;
            }
            byte[] bArr = this.f8546j;
            bArr[i12] = (byte) (i14 & 255);
            int i15 = i12 + 2;
            bArr[i12 + 1] = (byte) ((i14 >> 8) & 255);
            i12 += 3;
            bArr[i15] = (byte) ((i14 >> 16) & 255);
        }
        double d9 = ((double) (i11 * 100)) / ((double) i10);
        this.f8557u = d9 > 4.0d;
        if (Log.isLoggable("AnimatedGifEncoder", 3)) {
            Log.d("AnimatedGifEncoder", "got pixels for frame with " + d9 + "% transparent pixels");
        }
    }

    public void f(int i9) {
        this.f8542f = Math.round(i9 / 10.0f);
    }

    public void g(int i9, int i10) {
        if (!this.f8543g || this.f8554r) {
            this.f8537a = i9;
            this.f8538b = i10;
            if (i9 < 1) {
                this.f8537a = 320;
            }
            if (i10 < 1) {
                this.f8538b = 240;
            }
            this.f8555s = true;
        }
    }

    public boolean h(OutputStream outputStream) {
        boolean z9 = false;
        if (outputStream == null) {
            return false;
        }
        this.f8553q = false;
        this.f8544h = outputStream;
        try {
            p("GIF89a");
            z9 = true;
        } catch (IOException unused) {
        }
        this.f8543g = z9;
        return z9;
    }

    public final void i() throws IOException {
        int i9;
        int i10;
        this.f8544h.write(33);
        this.f8544h.write(249);
        this.f8544h.write(4);
        if (this.f8539c != null || this.f8557u) {
            i9 = 1;
            i10 = 2;
        } else {
            i9 = 0;
            i10 = 0;
        }
        int i11 = this.f8552p;
        if (i11 >= 0) {
            i10 = i11 & 7;
        }
        this.f8544h.write(i9 | (i10 << 2));
        o(this.f8542f);
        this.f8544h.write(this.f8540d);
        this.f8544h.write(0);
    }

    public final void j() throws IOException {
        this.f8544h.write(44);
        o(0);
        o(0);
        o(this.f8537a);
        o(this.f8538b);
        if (this.f8554r) {
            this.f8544h.write(0);
        } else {
            this.f8544h.write(this.f8551o | 128);
        }
    }

    public final void k() throws IOException {
        o(this.f8537a);
        o(this.f8538b);
        this.f8544h.write(this.f8551o | 240);
        this.f8544h.write(0);
        this.f8544h.write(0);
    }

    public final void l() throws IOException {
        this.f8544h.write(33);
        this.f8544h.write(255);
        this.f8544h.write(11);
        p("NETSCAPE2.0");
        this.f8544h.write(3);
        this.f8544h.write(1);
        o(this.f8541e);
        this.f8544h.write(0);
    }

    public final void m() throws IOException {
        OutputStream outputStream = this.f8544h;
        byte[] bArr = this.f8549m;
        outputStream.write(bArr, 0, bArr.length);
        int length = 768 - this.f8549m.length;
        for (int i9 = 0; i9 < length; i9++) {
            this.f8544h.write(0);
        }
    }

    public final void n() throws IOException {
        new b(this.f8537a, this.f8538b, this.f8547k, this.f8548l).f(this.f8544h);
    }

    public final void o(int i9) throws IOException {
        this.f8544h.write(i9 & 255);
        this.f8544h.write((i9 >> 8) & 255);
    }

    public final void p(String str) throws IOException {
        for (int i9 = 0; i9 < str.length(); i9++) {
            this.f8544h.write((byte) str.charAt(i9));
        }
    }
}
