package com.google.android.gms.cast.framework.internal.featurehighlight;

import C4.m;
import android.R;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.Keep;
import com.google.android.gms.internal.cast.zzek;
import com.google.android.gms.internal.cast.zzel;
import o4.AbstractC2337n;
import o4.AbstractC2338o;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
class OuterHighlightDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f26330d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f26331e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f26332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f26333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f26334h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f26335i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f26336j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f26337k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f26338l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f26339m;

    public OuterHighlightDrawable(Context context) {
        int color;
        Paint paint = new Paint();
        this.f26332f = paint;
        this.f26334h = 1.0f;
        this.f26337k = 0.0f;
        this.f26338l = 0.0f;
        this.f26339m = IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE;
        if (m.f()) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
            color = G.a.o(typedValue.data, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE);
        } else {
            color = context.getResources().getColor(AbstractC2337n.f45893a);
        }
        paint.setColor(color);
        this.f26339m = paint.getAlpha();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Resources resources = context.getResources();
        this.f26327a = resources.getDimensionPixelSize(AbstractC2338o.f45895b);
        this.f26328b = resources.getDimensionPixelSize(AbstractC2338o.f45894a);
        this.f26329c = resources.getDimensionPixelSize(AbstractC2338o.f45898e);
    }

    public static final float h(float f9, float f10, Rect rect) {
        float f11 = rect.left;
        float f12 = rect.top;
        float f13 = rect.right;
        float f14 = rect.bottom;
        float fZza = zzel.zza(f9, f10, f11, f12);
        float fZza2 = zzel.zza(f9, f10, f13, f12);
        float fZza3 = zzel.zza(f9, f10, f13, f14);
        float fZza4 = zzel.zza(f9, f10, f11, f14);
        if (fZza <= fZza2 || fZza <= fZza3 || fZza <= fZza4) {
            fZza = (fZza2 <= fZza3 || fZza2 <= fZza4) ? fZza3 <= fZza4 ? fZza4 : fZza3 : fZza2;
        }
        return (float) Math.ceil(fZza);
    }

    public final float a() {
        return this.f26335i;
    }

    public final float b() {
        return this.f26336j;
    }

    public final int c() {
        return this.f26332f.getColor();
    }

    public final Animator d(float f9, float f10) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scale", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("translationX", f9, 0.0f), PropertyValuesHolder.ofFloat("translationY", f10, 0.0f), PropertyValuesHolder.ofInt("alpha", 0, this.f26339m));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(zzek.zzc());
        return objectAnimatorOfPropertyValuesHolder.setDuration(350L);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawCircle(this.f26335i + this.f26337k, this.f26336j + this.f26338l, this.f26333g * this.f26334h, this.f26332f);
    }

    public final void e(int i9) {
        this.f26332f.setColor(i9);
        this.f26339m = this.f26332f.getAlpha();
        invalidateSelf();
    }

    public final void f(Rect rect, Rect rect2) {
        this.f26330d.set(rect);
        this.f26331e.set(rect2);
        float fExactCenterX = rect.exactCenterX();
        float fExactCenterY = rect.exactCenterY();
        Rect bounds = getBounds();
        if (Math.min(fExactCenterY - bounds.top, bounds.bottom - fExactCenterY) < this.f26327a) {
            this.f26335i = fExactCenterX;
        } else {
            this.f26335i = fExactCenterX <= bounds.exactCenterX() ? rect2.exactCenterX() + this.f26328b : rect2.exactCenterX() - this.f26328b;
            fExactCenterY = rect2.exactCenterY();
        }
        this.f26336j = fExactCenterY;
        this.f26333g = this.f26329c + Math.max(h(this.f26335i, fExactCenterY, rect), h(this.f26335i, this.f26336j, rect2));
        invalidateSelf();
    }

    public final boolean g(float f9, float f10) {
        return zzel.zza(f9, f10, this.f26335i, this.f26336j) < this.f26333g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f26332f.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.f26332f.setAlpha(i9);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f26332f.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Keep
    public void setScale(float f9) {
        this.f26334h = f9;
        invalidateSelf();
    }

    @Keep
    public void setTranslationX(float f9) {
        this.f26337k = f9;
        invalidateSelf();
    }

    @Keep
    public void setTranslationY(float f9) {
        this.f26338l = f9;
        invalidateSelf();
    }
}
