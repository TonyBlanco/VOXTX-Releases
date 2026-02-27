package f;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import c.AbstractC1238a;
import c.i;
import c.j;

/* JADX INFO: renamed from: f.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1753d extends Drawable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float f40533m = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f40534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f40535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f40536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f40537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f40538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f40539f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f40540g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f40541h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f40542i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f40543j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f40544k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f40545l;

    public C1753d(Context context) {
        Paint paint = new Paint();
        this.f40534a = paint;
        this.f40540g = new Path();
        this.f40542i = false;
        this.f40545l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, j.f18042Z0, AbstractC1238a.f17767z, i.f17912b);
        d(typedArrayObtainStyledAttributes.getColor(j.f18065d1, 0));
        c(typedArrayObtainStyledAttributes.getDimension(j.f18085h1, 0.0f));
        f(typedArrayObtainStyledAttributes.getBoolean(j.f18080g1, true));
        e(Math.round(typedArrayObtainStyledAttributes.getDimension(j.f18075f1, 0.0f)));
        this.f40541h = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f18070e1, 0);
        this.f40536c = Math.round(typedArrayObtainStyledAttributes.getDimension(j.f18060c1, 0.0f));
        this.f40535b = Math.round(typedArrayObtainStyledAttributes.getDimension(j.f18048a1, 0.0f));
        this.f40537d = typedArrayObtainStyledAttributes.getDimension(j.f18054b1, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float b(float f9, float f10, float f11) {
        return f9 + ((f10 - f9) * f11);
    }

    public float a() {
        return this.f40543j;
    }

    public void c(float f9) {
        if (this.f40534a.getStrokeWidth() != f9) {
            this.f40534a.setStrokeWidth(f9);
            this.f40544k = (float) (((double) (f9 / 2.0f)) * Math.cos(f40533m));
            invalidateSelf();
        }
    }

    public void d(int i9) {
        if (i9 != this.f40534a.getColor()) {
            this.f40534a.setColor(i9);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i9 = this.f40545l;
        boolean z9 = false;
        if (i9 != 0 && (i9 == 1 || (i9 == 3 ? H.a.f(this) == 0 : H.a.f(this) == 1))) {
            z9 = true;
        }
        float f9 = this.f40535b;
        float fB = b(this.f40536c, (float) Math.sqrt(f9 * f9 * 2.0f), this.f40543j);
        float fB2 = b(this.f40536c, this.f40537d, this.f40543j);
        float fRound = Math.round(b(0.0f, this.f40544k, this.f40543j));
        float fB3 = b(0.0f, f40533m, this.f40543j);
        float fB4 = b(z9 ? 0.0f : -180.0f, z9 ? 180.0f : 0.0f, this.f40543j);
        double d9 = fB;
        double d10 = fB3;
        boolean z10 = z9;
        float fRound2 = Math.round(Math.cos(d10) * d9);
        float fRound3 = Math.round(d9 * Math.sin(d10));
        this.f40540g.rewind();
        float fB5 = b(this.f40538e + this.f40534a.getStrokeWidth(), -this.f40544k, this.f40543j);
        float f10 = (-fB2) / 2.0f;
        this.f40540g.moveTo(f10 + fRound, 0.0f);
        this.f40540g.rLineTo(fB2 - (fRound * 2.0f), 0.0f);
        this.f40540g.moveTo(f10, fB5);
        this.f40540g.rLineTo(fRound2, fRound3);
        this.f40540g.moveTo(f10, -fB5);
        this.f40540g.rLineTo(fRound2, -fRound3);
        this.f40540g.close();
        canvas.save();
        float strokeWidth = this.f40534a.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), ((((int) (fHeight - (2.0f * r5))) / 4) * 2) + (strokeWidth * 1.5f) + this.f40538e);
        if (this.f40539f) {
            canvas.rotate(fB4 * (this.f40542i ^ z10 ? -1 : 1));
        } else if (z10) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f40540g, this.f40534a);
        canvas.restore();
    }

    public void e(float f9) {
        if (f9 != this.f40538e) {
            this.f40538e = f9;
            invalidateSelf();
        }
    }

    public void f(boolean z9) {
        if (this.f40539f != z9) {
            this.f40539f = z9;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f40541h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f40541h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i9) {
        if (i9 != this.f40534a.getAlpha()) {
            this.f40534a.setAlpha(i9);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f40534a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f9) {
        if (this.f40543j != f9) {
            this.f40543j = f9;
            invalidateSelf();
        }
    }
}
