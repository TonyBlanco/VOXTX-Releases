package com.google.android.gms.cast.framework.internal.featurehighlight;

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
import androidx.annotation.Keep;
import com.google.android.gms.internal.cast.zzek;
import o4.AbstractC2338o;
import o4.r;

/* JADX INFO: loaded from: classes3.dex */
class InnerZoneDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f26316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f26317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f26318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f26321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f26322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f26323h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f26324i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f26325j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f26326k;

    public InnerZoneDrawable(Context context) {
        Paint paint = new Paint();
        this.f26316a = paint;
        Paint paint2 = new Paint();
        this.f26317b = paint2;
        this.f26318c = new Rect();
        this.f26322g = 1.0f;
        Resources resources = context.getResources();
        this.f26319d = resources.getDimensionPixelSize(AbstractC2338o.f45897d);
        this.f26320e = resources.getInteger(r.f45986a);
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(-1);
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        paint2.setColor(-1);
    }

    public final Animator a() {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scale", 0.0f), PropertyValuesHolder.ofInt("alpha", 0), PropertyValuesHolder.ofFloat("pulseScale", 0.0f), PropertyValuesHolder.ofFloat("pulseAlpha", 0.0f));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(zzek.zza());
        return objectAnimatorOfPropertyValuesHolder.setDuration(200L);
    }

    public final void b(Rect rect) {
        this.f26318c.set(rect);
        this.f26323h = this.f26318c.exactCenterX();
        this.f26324i = this.f26318c.exactCenterY();
        this.f26321f = Math.max(this.f26319d, Math.max(this.f26318c.width() / 2.0f, this.f26318c.height() / 2.0f));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f9 = this.f26326k;
        if (f9 > 0.0f) {
            float f10 = this.f26321f * this.f26325j;
            this.f26317b.setAlpha((int) (this.f26320e * f9));
            canvas.drawCircle(this.f26323h, this.f26324i, f10, this.f26317b);
        }
        canvas.drawCircle(this.f26323h, this.f26324i, this.f26321f * this.f26322g, this.f26316a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.f26316a.setAlpha(i9);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f26316a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Keep
    public void setPulseAlpha(float f9) {
        this.f26326k = f9;
        invalidateSelf();
    }

    @Keep
    public void setPulseScale(float f9) {
        this.f26325j = f9;
        invalidateSelf();
    }

    @Keep
    public void setScale(float f9) {
        this.f26322g = f9;
        invalidateSelf();
    }
}
