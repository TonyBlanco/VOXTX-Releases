package androidx.leanback.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: androidx.leanback.widget.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1168x extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f15822a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f15824d;

    public AbstractC1168x(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f15824d = new Rect();
        if (context.getApplicationInfo().targetSdkVersion < 23 || Build.VERSION.SDK_INT < 23) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.foreground});
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            if (drawable != null) {
                a(drawable);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void a(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            AbstractC1156k.b(this, drawable);
            return;
        }
        if (this.f15822a != drawable) {
            this.f15822a = drawable;
            this.f15823c = true;
            setWillNotDraw(false);
            this.f15822a.setCallback(this);
            if (this.f15822a.isStateful()) {
                this.f15822a.setState(getDrawableState());
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f15822a;
        if (drawable != null) {
            if (this.f15823c) {
                this.f15823c = false;
                Rect rect = this.f15824d;
                rect.set(0, 0, getRight() - getLeft(), getBottom() - getTop());
                drawable.setBounds(rect);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f15822a;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f15822a.setState(getDrawableState());
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f15822a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        this.f15823c = z9 | this.f15823c;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f15822a;
    }
}
