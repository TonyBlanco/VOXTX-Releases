package x2;

import android.graphics.Canvas;
import android.graphics.Rect;

/* JADX INFO: renamed from: x2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2952a extends g {
    @Override // x2.g
    public void J(Canvas canvas) {
        for (int i9 = 0; i9 < L(); i9++) {
            f fVarK = K(i9);
            int iSave = canvas.save();
            canvas.rotate((i9 * 360) / L(), getBounds().centerX(), getBounds().centerY());
            fVarK.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // x2.g, x2.f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rectA = a(rect);
        int iWidth = (int) (((((double) rectA.width()) * 3.141592653589793d) / 3.5999999046325684d) / ((double) L()));
        int iCenterX = rectA.centerX() - iWidth;
        int iCenterX2 = rectA.centerX() + iWidth;
        for (int i9 = 0; i9 < L(); i9++) {
            f fVarK = K(i9);
            int i10 = rectA.top;
            fVarK.v(iCenterX, i10, iCenterX2, (iWidth * 2) + i10);
        }
    }
}
