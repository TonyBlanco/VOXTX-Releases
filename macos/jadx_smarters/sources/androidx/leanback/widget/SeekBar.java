package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import g0.AbstractC1798c;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes.dex */
public final class SeekBar extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f15566a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f15567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f15568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f15569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f15570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f15571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f15572h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15573i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15574j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15575k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15576l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f15577m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15578n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15579o;

    public static abstract class a {
    }

    public SeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15566a = new RectF();
        this.f15567c = new RectF();
        this.f15568d = new RectF();
        Paint paint = new Paint(1);
        this.f15569e = paint;
        Paint paint2 = new Paint(1);
        this.f15570f = paint2;
        Paint paint3 = new Paint(1);
        this.f15571g = paint3;
        Paint paint4 = new Paint(1);
        this.f15572h = paint4;
        setWillNotDraw(false);
        paint3.setColor(-7829368);
        paint.setColor(DefaultRenderer.TEXT_COLOR);
        paint2.setColor(-65536);
        paint4.setColor(-1);
        this.f15578n = context.getResources().getDimensionPixelSize(AbstractC1798c.f40988p);
        this.f15579o = context.getResources().getDimensionPixelSize(AbstractC1798c.f40986n);
        this.f15577m = context.getResources().getDimensionPixelSize(AbstractC1798c.f40987o);
    }

    public final void a() {
        int i9 = isFocused() ? this.f15579o : this.f15578n;
        int width = getWidth();
        int height = getHeight();
        int i10 = (height - i9) / 2;
        RectF rectF = this.f15568d;
        int i11 = this.f15578n;
        float f9 = i10;
        float f10 = height - i10;
        rectF.set(i11 / 2, f9, width - (i11 / 2), f10);
        int i12 = isFocused() ? this.f15577m : this.f15578n / 2;
        float f11 = width - (i12 * 2);
        float f12 = (this.f15573i / this.f15575k) * f11;
        RectF rectF2 = this.f15566a;
        int i13 = this.f15578n;
        rectF2.set(i13 / 2, f9, (i13 / 2) + f12, f10);
        this.f15567c.set(this.f15566a.right, f9, (this.f15578n / 2) + ((this.f15574j / this.f15575k) * f11), f10);
        this.f15576l = i12 + ((int) f12);
        invalidate();
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return android.widget.SeekBar.class.getName();
    }

    public int getMax() {
        return this.f15575k;
    }

    public int getProgress() {
        return this.f15573i;
    }

    public int getSecondProgress() {
        return this.f15574j;
    }

    public int getSecondaryProgressColor() {
        return this.f15569e.getColor();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f9 = isFocused() ? this.f15577m : this.f15578n / 2;
        canvas.drawRoundRect(this.f15568d, f9, f9, this.f15571g);
        RectF rectF = this.f15567c;
        if (rectF.right > rectF.left) {
            canvas.drawRoundRect(rectF, f9, f9, this.f15569e);
        }
        canvas.drawRoundRect(this.f15566a, f9, f9, this.f15570f);
        canvas.drawCircle(this.f15576l, getHeight() / 2, f9, this.f15572h);
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z9, int i9, Rect rect) {
        super.onFocusChanged(z9, i9, rect);
        a();
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        a();
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i9, Bundle bundle) {
        return super.performAccessibilityAction(i9, bundle);
    }

    public void setAccessibilitySeekListener(a aVar) {
    }

    public void setActiveBarHeight(int i9) {
        this.f15579o = i9;
        a();
    }

    public void setActiveRadius(int i9) {
        this.f15577m = i9;
        a();
    }

    public void setBarHeight(int i9) {
        this.f15578n = i9;
        a();
    }

    public void setMax(int i9) {
        this.f15575k = i9;
        a();
    }

    public void setProgress(int i9) {
        int i10 = this.f15575k;
        if (i9 > i10) {
            i9 = i10;
        } else if (i9 < 0) {
            i9 = 0;
        }
        this.f15573i = i9;
        a();
    }

    public void setProgressColor(int i9) {
        this.f15570f.setColor(i9);
    }

    public void setSecondaryProgress(int i9) {
        int i10 = this.f15575k;
        if (i9 > i10) {
            i9 = i10;
        } else if (i9 < 0) {
            i9 = 0;
        }
        this.f15574j = i9;
        a();
    }

    public void setSecondaryProgressColor(int i9) {
        this.f15569e.setColor(i9);
    }
}
