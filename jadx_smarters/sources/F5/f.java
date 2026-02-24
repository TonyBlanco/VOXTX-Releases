package f5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f extends androidx.appcompat.widget.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable f40783q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Rect f40784r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f40785s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f40786t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f40787u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f40788v;

    public f(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f40784r = new Rect();
        this.f40785s = new Rect();
        this.f40786t = 119;
        this.f40787u = true;
        this.f40788v = false;
        TypedArray typedArrayH = u.h(context, attributeSet, R4.l.f9181l2, i9, 0, new int[0]);
        this.f40786t = typedArrayH.getInt(R4.l.f9199n2, this.f40786t);
        Drawable drawable = typedArrayH.getDrawable(R4.l.f9190m2);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f40787u = typedArrayH.getBoolean(R4.l.f9208o2, true);
        typedArrayH.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f40783q;
        if (drawable != null) {
            if (this.f40788v) {
                this.f40788v = false;
                Rect rect = this.f40784r;
                Rect rect2 = this.f40785s;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f40787u) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f40786t, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f9, float f10) {
        super.drawableHotspotChanged(f9, f10);
        Drawable drawable = this.f40783q;
        if (drawable != null) {
            drawable.setHotspot(f9, f10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f40783q;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f40783q.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f40783q;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f40786t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f40783q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        this.f40788v = z9 | this.f40788v;
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        this.f40788v = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f40783q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f40783q);
            }
            this.f40783q = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f40786t == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i9) {
        if (this.f40786t != i9) {
            if ((8388615 & i9) == 0) {
                i9 |= 8388611;
            }
            if ((i9 & 112) == 0) {
                i9 |= 48;
            }
            this.f40786t = i9;
            if (i9 == 119 && this.f40783q != null) {
                this.f40783q.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f40783q;
    }
}
