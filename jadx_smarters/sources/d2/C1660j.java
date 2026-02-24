package d2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import e2.AbstractC1732b;

/* JADX INFO: renamed from: d2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1660j extends AbstractC1732b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f39535a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f39538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f39539f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f39540g;

    /* JADX INFO: renamed from: d2.j$a */
    public static class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Paint f39541d = new Paint(6);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bitmap f39542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f39543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Paint f39544c;

        public a(Bitmap bitmap) {
            this.f39544c = f39541d;
            this.f39542a = bitmap;
        }

        public a(a aVar) {
            this(aVar.f39542a);
            this.f39543b = aVar.f39543b;
        }

        public void a() {
            if (f39541d == this.f39544c) {
                this.f39544c = new Paint(6);
            }
        }

        public void b(int i9) {
            a();
            this.f39544c.setAlpha(i9);
        }

        public void c(ColorFilter colorFilter) {
            a();
            this.f39544c.setColorFilter(colorFilter);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C1660j((Resources) null, this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C1660j(resources, this);
        }
    }

    public C1660j(Resources resources, Bitmap bitmap) {
        this(resources, new a(bitmap));
    }

    public C1660j(Resources resources, a aVar) {
        int i9;
        this.f39535a = new Rect();
        if (aVar == null) {
            throw new NullPointerException("BitmapState must not be null");
        }
        this.f39540g = aVar;
        if (resources != null) {
            i9 = resources.getDisplayMetrics().densityDpi;
            i9 = i9 == 0 ? 160 : i9;
            aVar.f39543b = i9;
        } else {
            i9 = aVar.f39543b;
        }
        this.f39536c = aVar.f39542a.getScaledWidth(i9);
        this.f39537d = aVar.f39542a.getScaledHeight(i9);
    }

    @Override // e2.AbstractC1732b
    public boolean b() {
        return false;
    }

    @Override // e2.AbstractC1732b
    public void c(int i9) {
    }

    public Bitmap d() {
        return this.f39540g.f39542a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f39538e) {
            Gravity.apply(119, this.f39536c, this.f39537d, getBounds(), this.f39535a);
            this.f39538e = false;
        }
        a aVar = this.f39540g;
        canvas.drawBitmap(aVar.f39542a, (Rect) null, this.f39535a, aVar.f39544c);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f39540g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f39537d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f39536c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap = this.f39540g.f39542a;
        return (bitmap == null || bitmap.hasAlpha() || this.f39540g.f39544c.getAlpha() < 255) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f39539f && super.mutate() == this) {
            this.f39540g = new a(this.f39540g);
            this.f39539f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f39538e = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i9) {
        if (this.f39540g.f39544c.getAlpha() != i9) {
            this.f39540g.b(i9);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f39540g.c(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
    }
}
