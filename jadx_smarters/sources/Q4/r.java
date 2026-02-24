package q4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import t4.C2775b;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements InterfaceC2546a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f46881a;

    public r(w wVar) {
        this.f46881a = wVar;
    }

    @Override // q4.InterfaceC2546a
    public final void zza(Bitmap bitmap) {
        C2775b c2775b = w.f46885w;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f9 = width;
            int i9 = (int) (((9.0f * f9) / 16.0f) + 0.5f);
            float f10 = (i9 - r3) / 2.0f;
            RectF rectF = new RectF(0.0f, f10, f9, bitmap.getHeight() + f10);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, i9, config);
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = bitmapCreateBitmap;
        }
        this.f46881a.p(bitmap2, 0);
    }
}
