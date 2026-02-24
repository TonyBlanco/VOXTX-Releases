package e5;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import l5.k;
import l5.l;

/* JADX INFO: renamed from: e5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1743a extends Drawable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f40416b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f40422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f40423i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f40424j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f40425k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f40426l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f40427m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public k f40429o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ColorStateList f40430p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f40415a = l.k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f40417c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f40418d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f40419e = new RectF();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f40420f = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f40421g = new b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f40428n = true;

    /* JADX INFO: renamed from: e5.a$b */
    public class b extends Drawable.ConstantState {
        public b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return C1743a.this;
        }
    }

    public C1743a(k kVar) {
        this.f40429o = kVar;
        Paint paint = new Paint(1);
        this.f40416b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public final Shader a() {
        copyBounds(this.f40418d);
        float fHeight = this.f40422h / r1.height();
        return new LinearGradient(0.0f, r1.top, 0.0f, r1.bottom, new int[]{G.a.j(this.f40423i, this.f40427m), G.a.j(this.f40424j, this.f40427m), G.a.j(G.a.o(this.f40424j, 0), this.f40427m), G.a.j(G.a.o(this.f40426l, 0), this.f40427m), G.a.j(this.f40426l, this.f40427m), G.a.j(this.f40425k, this.f40427m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP);
    }

    public RectF b() {
        this.f40420f.set(getBounds());
        return this.f40420f;
    }

    public void c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f40427m = colorStateList.getColorForState(getState(), this.f40427m);
        }
        this.f40430p = colorStateList;
        this.f40428n = true;
        invalidateSelf();
    }

    public void d(float f9) {
        if (this.f40422h != f9) {
            this.f40422h = f9;
            this.f40416b.setStrokeWidth(f9 * 1.3333f);
            this.f40428n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f40428n) {
            this.f40416b.setShader(a());
            this.f40428n = false;
        }
        float strokeWidth = this.f40416b.getStrokeWidth() / 2.0f;
        copyBounds(this.f40418d);
        this.f40419e.set(this.f40418d);
        float fMin = Math.min(this.f40429o.r().a(b()), this.f40419e.width() / 2.0f);
        if (this.f40429o.u(b())) {
            this.f40419e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f40419e, fMin, fMin, this.f40416b);
        }
    }

    public void e(int i9, int i10, int i11, int i12) {
        this.f40423i = i9;
        this.f40424j = i10;
        this.f40425k = i11;
        this.f40426l = i12;
    }

    public void f(k kVar) {
        this.f40429o = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f40421g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f40422h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f40429o.u(b())) {
            outline.setRoundRect(getBounds(), this.f40429o.r().a(b()));
            return;
        }
        copyBounds(this.f40418d);
        this.f40419e.set(this.f40418d);
        this.f40415a.d(this.f40429o, 1.0f, this.f40419e, this.f40417c);
        if (this.f40417c.isConvex()) {
            outline.setConvexPath(this.f40417c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (!this.f40429o.u(b())) {
            return true;
        }
        int iRound = Math.round(this.f40422h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f40430p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f40428n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f40430p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f40427m)) != this.f40427m) {
            this.f40428n = true;
            this.f40427m = colorForState;
        }
        if (this.f40428n) {
            invalidateSelf();
        }
        return this.f40428n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i9) {
        this.f40416b.setAlpha(i9);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f40416b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
