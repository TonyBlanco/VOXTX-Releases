package W4;

import android.graphics.Canvas;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static int a(Canvas canvas, float f9, float f10, float f11, float f12, int i9) {
        return Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f9, f10, f11, f12, i9) : canvas.saveLayerAlpha(f9, f10, f11, f12, i9, 31);
    }
}
