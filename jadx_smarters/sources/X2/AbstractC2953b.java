package x2;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: renamed from: x2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2953b extends e {
    @Override // x2.e
    public void J(Canvas canvas, Paint paint) {
        if (d() != null) {
            canvas.drawCircle(d().centerX(), d().centerY(), Math.min(d().width(), d().height()) / 2, paint);
        }
    }
}
