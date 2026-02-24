package o5;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import l5.C2198g;

/* JADX INFO: renamed from: o5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2351c extends C2198g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Paint f46080A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final RectF f46081B;

    public C2351c(l5.k kVar) {
        super(kVar == null ? new l5.k() : kVar);
        this.f46080A = new Paint(1);
        l0();
        this.f46081B = new RectF();
    }

    public boolean h0() {
        return !this.f46081B.isEmpty();
    }

    public void i0() {
        j0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void j0(float f9, float f10, float f11, float f12) {
        RectF rectF = this.f46081B;
        if (f9 == rectF.left && f10 == rectF.top && f11 == rectF.right && f12 == rectF.bottom) {
            return;
        }
        rectF.set(f9, f10, f11, f12);
        invalidateSelf();
    }

    public void k0(RectF rectF) {
        j0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void l0() {
        this.f46080A.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f46080A.setColor(-1);
        this.f46080A.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    @Override // l5.C2198g
    public void r(Canvas canvas) {
        if (this.f46081B.isEmpty()) {
            super.r(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f46081B);
        } else {
            canvas.clipRect(this.f46081B, Region.Op.DIFFERENCE);
        }
        super.r(canvas);
        canvas.restore();
    }
}
