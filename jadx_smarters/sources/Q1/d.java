package Q1;

import android.util.Log;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f7520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f7521c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f7519a = new byte[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7522d = 0;

    public void a() {
        this.f7520b = null;
        this.f7521c = null;
    }

    public final boolean b() {
        return this.f7521c.f7507b != 0;
    }

    public c c() {
        if (this.f7520b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.f7521c;
        }
        j();
        if (!b()) {
            h();
            c cVar = this.f7521c;
            if (cVar.f7508c < 0) {
                cVar.f7507b = 1;
            }
        }
        return this.f7521c;
    }

    public final int d() {
        try {
            return this.f7520b.get() & 255;
        } catch (Exception unused) {
            this.f7521c.f7507b = 1;
            return 0;
        }
    }

    public final void e() {
        this.f7521c.f7509d.f7495a = m();
        this.f7521c.f7509d.f7496b = m();
        this.f7521c.f7509d.f7497c = m();
        this.f7521c.f7509d.f7498d = m();
        int iD = d();
        boolean z9 = (iD & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iD & 7) + 1);
        b bVar = this.f7521c.f7509d;
        bVar.f7499e = (iD & 64) != 0;
        if (z9) {
            bVar.f7505k = g(iPow);
        } else {
            bVar.f7505k = null;
        }
        this.f7521c.f7509d.f7504j = this.f7520b.position();
        q();
        if (b()) {
            return;
        }
        c cVar = this.f7521c;
        cVar.f7508c++;
        cVar.f7510e.add(cVar.f7509d);
    }

    public final int f() {
        int iD = d();
        this.f7522d = iD;
        int i9 = 0;
        if (iD > 0) {
            int i10 = 0;
            while (true) {
                try {
                    i10 = this.f7522d;
                    if (i9 >= i10) {
                        break;
                    }
                    i10 -= i9;
                    this.f7520b.get(this.f7519a, i9, i10);
                    i9 += i10;
                } catch (Exception e9) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i9 + " count: " + i10 + " blockSize: " + this.f7522d, e9);
                    }
                    this.f7521c.f7507b = 1;
                }
            }
        }
        return i9;
    }

    public final int[] g(int i9) {
        byte[] bArr = new byte[i9 * 3];
        int[] iArr = null;
        try {
            this.f7520b.get(bArr);
            iArr = new int[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];
            int i10 = 0;
            int i11 = 0;
            while (i10 < i9) {
                int i12 = bArr[i11] & 255;
                int i13 = i11 + 2;
                int i14 = bArr[i11 + 1] & 255;
                i11 += 3;
                int i15 = i10 + 1;
                iArr[i10] = (i14 << 8) | (i12 << 16) | DefaultRenderer.BACKGROUND_COLOR | (bArr[i13] & 255);
                i10 = i15;
            }
        } catch (BufferUnderflowException e9) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e9);
            }
            this.f7521c.f7507b = 1;
        }
        return iArr;
    }

    public final void h() {
        boolean z9 = false;
        while (!z9 && !b()) {
            int iD = d();
            if (iD == 33) {
                int iD2 = d();
                if (iD2 != 1) {
                    if (iD2 == 249) {
                        this.f7521c.f7509d = new b();
                        i();
                    } else if (iD2 != 254 && iD2 == 255) {
                        f();
                        String str = "";
                        for (int i9 = 0; i9 < 11; i9++) {
                            str = str + ((char) this.f7519a[i9]);
                        }
                        if (str.equals("NETSCAPE2.0")) {
                            l();
                        }
                    }
                }
                p();
            } else if (iD == 44) {
                c cVar = this.f7521c;
                if (cVar.f7509d == null) {
                    cVar.f7509d = new b();
                }
                e();
            } else if (iD != 59) {
                this.f7521c.f7507b = 1;
            } else {
                z9 = true;
            }
        }
    }

    public final void i() {
        d();
        int iD = d();
        b bVar = this.f7521c.f7509d;
        int i9 = (iD & 28) >> 2;
        bVar.f7501g = i9;
        if (i9 == 0) {
            bVar.f7501g = 1;
        }
        bVar.f7500f = (iD & 1) != 0;
        int iM = m();
        if (iM < 3) {
            iM = 10;
        }
        b bVar2 = this.f7521c.f7509d;
        bVar2.f7503i = iM * 10;
        bVar2.f7502h = d();
        d();
    }

    public final void j() {
        String str = "";
        for (int i9 = 0; i9 < 6; i9++) {
            str = str + ((char) d());
        }
        if (!str.startsWith("GIF")) {
            this.f7521c.f7507b = 1;
            return;
        }
        k();
        if (!this.f7521c.f7513h || b()) {
            return;
        }
        c cVar = this.f7521c;
        cVar.f7506a = g(cVar.f7514i);
        c cVar2 = this.f7521c;
        cVar2.f7517l = cVar2.f7506a[cVar2.f7515j];
    }

    public final void k() {
        this.f7521c.f7511f = m();
        this.f7521c.f7512g = m();
        int iD = d();
        c cVar = this.f7521c;
        cVar.f7513h = (iD & 128) != 0;
        cVar.f7514i = 2 << (iD & 7);
        cVar.f7515j = d();
        this.f7521c.f7516k = d();
    }

    public final void l() {
        do {
            f();
            byte[] bArr = this.f7519a;
            if (bArr[0] == 1) {
                this.f7521c.f7518m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f7522d <= 0) {
                return;
            }
        } while (!b());
    }

    public final int m() {
        return this.f7520b.getShort();
    }

    public final void n() {
        this.f7520b = null;
        Arrays.fill(this.f7519a, (byte) 0);
        this.f7521c = new c();
        this.f7522d = 0;
    }

    public d o(byte[] bArr) {
        n();
        if (bArr != null) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            this.f7520b = byteBufferWrap;
            byteBufferWrap.rewind();
            this.f7520b.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f7520b = null;
            this.f7521c.f7507b = 2;
        }
        return this;
    }

    public final void p() {
        int iD;
        do {
            iD = d();
            ByteBuffer byteBuffer = this.f7520b;
            byteBuffer.position(byteBuffer.position() + iD);
        } while (iD > 0);
    }

    public final void q() {
        d();
        p();
    }
}
