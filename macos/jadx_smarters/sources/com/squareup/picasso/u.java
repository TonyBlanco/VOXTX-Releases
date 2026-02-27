package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import com.squareup.picasso.t;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends BitmapDrawable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Paint f39157h = new Paint();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f39159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t.e f39160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f39161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f39162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f39163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f39164g;

    public u(Context context, Bitmap bitmap, Drawable drawable, t.e eVar, boolean z9, boolean z10) {
        super(context.getResources(), bitmap);
        this.f39164g = 255;
        this.f39158a = z10;
        this.f39159b = context.getResources().getDisplayMetrics().density;
        this.f39160c = eVar;
        if (eVar == t.e.MEMORY || z9) {
            return;
        }
        this.f39161d = drawable;
        this.f39163f = true;
        this.f39162e = SystemClock.uptimeMillis();
    }

    public static Path b(Point point, int i9) {
        Point point2 = new Point(point.x + i9, point.y);
        Point point3 = new Point(point.x, point.y + i9);
        Path path = new Path();
        path.moveTo(point.x, point.y);
        path.lineTo(point2.x, point2.y);
        path.lineTo(point3.x, point3.y);
        return path;
    }

    public static void c(ImageView imageView, Context context, Bitmap bitmap, t.e eVar, boolean z9, boolean z10) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        imageView.setImageDrawable(new u(context, bitmap, drawable, eVar, z9, z10));
    }

    public static void d(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof AnimationDrawable) {
            ((AnimationDrawable) imageView.getDrawable()).start();
        }
    }

    public final void a(Canvas canvas) {
        Paint paint = f39157h;
        paint.setColor(-1);
        canvas.drawPath(b(new Point(0, 0), (int) (this.f39159b * 16.0f)), paint);
        paint.setColor(this.f39160c.debugColor);
        canvas.drawPath(b(new Point(0, 0), (int) (this.f39159b * 15.0f)), paint);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f39163f) {
            float fUptimeMillis = (SystemClock.uptimeMillis() - this.f39162e) / 200.0f;
            if (fUptimeMillis >= 1.0f) {
                this.f39163f = false;
                this.f39161d = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.f39161d;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (this.f39164g * fUptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.f39164g);
            }
        } else {
            super.draw(canvas);
        }
        if (this.f39158a) {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f39161d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i9) {
        this.f39164g = i9;
        Drawable drawable = this.f39161d;
        if (drawable != null) {
            drawable.setAlpha(i9);
        }
        super.setAlpha(i9);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f39161d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
