package x2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends f {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Paint f51879F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f51880G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f51881H;

    public e() {
        u(-1);
        Paint paint = new Paint();
        this.f51879F = paint;
        paint.setAntiAlias(true);
        this.f51879F.setColor(this.f51880G);
    }

    public abstract void J(Canvas canvas, Paint paint);

    public final void K() {
        int alpha = getAlpha();
        int i9 = this.f51881H;
        this.f51880G = ((((i9 >>> 24) * (alpha + (alpha >> 7))) >> 8) << 24) | ((i9 << 8) >>> 8);
    }

    @Override // x2.f
    public final void b(Canvas canvas) {
        this.f51879F.setColor(this.f51880G);
        J(canvas, this.f51879F);
    }

    @Override // x2.f
    public int c() {
        return this.f51881H;
    }

    @Override // x2.f, android.graphics.drawable.Drawable
    public void setAlpha(int i9) {
        super.setAlpha(i9);
        K();
    }

    @Override // x2.f, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f51879F.setColorFilter(colorFilter);
    }

    @Override // x2.f
    public void u(int i9) {
        this.f51881H = i9;
        K();
    }
}
