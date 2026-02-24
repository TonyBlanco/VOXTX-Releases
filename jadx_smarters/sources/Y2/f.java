package y2;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.animation.LinearInterpolator;
import v2.C2873d;
import x2.AbstractC2954c;

/* JADX INFO: loaded from: classes.dex */
public class f extends x2.g {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f52137H = false;

    public class a extends AbstractC2954c {
        public a() {
            setAlpha(0);
            A(-180);
        }

        @Override // x2.f
        public ValueAnimator r() {
            float[] fArr = {0.0f, 0.1f, 0.25f, 0.75f, 0.9f, 1.0f};
            return new C2873d(this).a(fArr, 0, 0, 255, 255, 0, 0).j(fArr, -180, -180, 0, 0, 0, 0).k(fArr, 0, 0, 0, 0, 180, 180).c(2400L).h(new LinearInterpolator()).b();
        }
    }

    @Override // x2.g
    public void J(Canvas canvas) {
        Rect rectA = a(getBounds());
        for (int i9 = 0; i9 < L(); i9++) {
            int iSave = canvas.save();
            canvas.rotate((i9 * 90) + 45, rectA.centerX(), rectA.centerY());
            K(i9).draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // x2.g
    public x2.f[] O() {
        a[] aVarArr = new a[4];
        for (int i9 = 0; i9 < 4; i9++) {
            a aVar = new a();
            aVarArr[i9] = aVar;
            aVar.t(Build.VERSION.SDK_INT >= 24 ? i9 * 300 : (i9 * 300) - 1200);
        }
        return aVarArr;
    }

    @Override // x2.g, x2.f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rectA = a(rect);
        int iMin = Math.min(rectA.width(), rectA.height());
        if (this.f52137H) {
            iMin = (int) Math.sqrt((iMin * iMin) / 2);
            int iWidth = (rectA.width() - iMin) / 2;
            int iHeight = (rectA.height() - iMin) / 2;
            rectA = new Rect(rectA.left + iWidth, rectA.top + iHeight, rectA.right - iWidth, rectA.bottom - iHeight);
        }
        int i9 = iMin / 2;
        int i10 = rectA.left + i9 + 1;
        int i11 = rectA.top + i9 + 1;
        for (int i12 = 0; i12 < L(); i12++) {
            x2.f fVarK = K(i12);
            fVarK.v(rectA.left, rectA.top, i10, i11);
            fVarK.x(fVarK.d().right);
            fVarK.y(fVarK.d().bottom);
        }
    }
}
