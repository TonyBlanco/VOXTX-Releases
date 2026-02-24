package r;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class d extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f49615a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f49617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f49618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f49619e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f49622h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f49623i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f49624j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f49620f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f49621g = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f49625k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f49616b = new Paint(5);

    public d(ColorStateList colorStateList, float f9) {
        this.f49615a = f9;
        e(colorStateList);
        this.f49617c = new RectF();
        this.f49618d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public ColorStateList b() {
        return this.f49622h;
    }

    public float c() {
        return this.f49619e;
    }

    public float d() {
        return this.f49615a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z9;
        Paint paint = this.f49616b;
        if (this.f49623i == null || paint.getColorFilter() != null) {
            z9 = false;
        } else {
            paint.setColorFilter(this.f49623i);
            z9 = true;
        }
        RectF rectF = this.f49617c;
        float f9 = this.f49615a;
        canvas.drawRoundRect(rectF, f9, f9, paint);
        if (z9) {
            paint.setColorFilter(null);
        }
    }

    public final void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f49622h = colorStateList;
        this.f49616b.setColor(colorStateList.getColorForState(getState(), this.f49622h.getDefaultColor()));
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    public void g(float f9, boolean z9, boolean z10) {
        if (f9 == this.f49619e && this.f49620f == z9 && this.f49621g == z10) {
            return;
        }
        this.f49619e = f9;
        this.f49620f = z9;
        this.f49621g = z10;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f49618d, this.f49615a);
    }

    public void h(float f9) {
        if (f9 == this.f49615a) {
            return;
        }
        this.f49615a = f9;
        i(null);
        invalidateSelf();
    }

    public final void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f49617c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f49618d.set(rect);
        if (this.f49620f) {
            this.f49618d.inset((int) Math.ceil(e.a(this.f49619e, this.f49615a, this.f49621g)), (int) Math.ceil(e.b(this.f49619e, this.f49615a, this.f49621g)));
            this.f49617c.set(this.f49618d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f49624j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f49622h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f49622h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z9 = colorForState != this.f49616b.getColor();
        if (z9) {
            this.f49616b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f49624j;
        if (colorStateList2 == null || (mode = this.f49625k) == null) {
            return z9;
        }
        this.f49623i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i9) {
        this.f49616b.setAlpha(i9);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f49616b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f49624j = colorStateList;
        this.f49623i = a(colorStateList, this.f49625k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f49625k = mode;
        this.f49623i = a(this.f49624j, mode);
        invalidateSelf();
    }
}
