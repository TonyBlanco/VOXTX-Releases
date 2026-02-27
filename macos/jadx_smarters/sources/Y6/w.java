package Y6;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f10738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Rect f10741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10742e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10743f;

    public w(byte[] bArr, int i9, int i10, int i11, int i12) {
        this.f10738a = new p(bArr, i9, i10);
        this.f10740c = i12;
        this.f10739b = i11;
        if (i9 * i10 <= bArr.length) {
            return;
        }
        throw new IllegalArgumentException("Image data does not match the resolution. " + i9 + "x" + i10 + " > " + bArr.length);
    }

    public x6.l a() {
        p pVarA = this.f10738a.h(this.f10740c).a(this.f10741d, this.f10742e);
        return new x6.l(pVarA.b(), pVarA.d(), pVarA.c(), 0, 0, pVarA.d(), pVarA.c(), false);
    }

    public Bitmap b(Rect rect, int i9) {
        if (rect == null) {
            rect = new Rect(0, 0, this.f10738a.d(), this.f10738a.c());
        } else if (c()) {
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        }
        YuvImage yuvImage = new YuvImage(this.f10738a.b(), this.f10739b, this.f10738a.d(), this.f10738a.c(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i9;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        if (this.f10740c == 0) {
            return bitmapDecodeByteArray;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(this.f10740c);
        return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
    }

    public boolean c() {
        return this.f10740c % 180 != 0;
    }

    public void d(Rect rect) {
        this.f10741d = rect;
    }

    public void e(boolean z9) {
        this.f10743f = z9;
    }

    public x6.q f(x6.q qVar) {
        float fC = (qVar.c() * this.f10742e) + this.f10741d.left;
        float fD = (qVar.d() * this.f10742e) + this.f10741d.top;
        if (this.f10743f) {
            fC = this.f10738a.d() - fC;
        }
        return new x6.q(fC, fD);
    }
}
