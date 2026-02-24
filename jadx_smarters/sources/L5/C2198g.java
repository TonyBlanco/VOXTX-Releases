package l5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import c5.C1274a;
import java.util.BitSet;
import k5.C2148a;
import l5.k;
import l5.l;
import l5.m;

/* JADX INFO: renamed from: l5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2198g extends Drawable implements H.b, n {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f44081y = "g";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Paint f44082z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f44083a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m.g[] f44084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m.g[] f44085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BitSet f44086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f44087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Matrix f44088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Path f44089h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Path f44090i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RectF f44091j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RectF f44092k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Region f44093l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Region f44094m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k f44095n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Paint f44096o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Paint f44097p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C2148a f44098q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l.b f44099r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f44100s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f44101t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public PorterDuffColorFilter f44102u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f44103v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final RectF f44104w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f44105x;

    /* JADX INFO: renamed from: l5.g$a */
    public class a implements l.b {
        public a() {
        }

        @Override // l5.l.b
        public void a(m mVar, Matrix matrix, int i9) {
            C2198g.this.f44086e.set(i9, mVar.e());
            C2198g.this.f44084c[i9] = mVar.f(matrix);
        }

        @Override // l5.l.b
        public void b(m mVar, Matrix matrix, int i9) {
            C2198g.this.f44086e.set(i9 + 4, mVar.e());
            C2198g.this.f44085d[i9] = mVar.f(matrix);
        }
    }

    /* JADX INFO: renamed from: l5.g$b */
    public class b implements k.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f44107a;

        public b(float f9) {
            this.f44107a = f9;
        }

        @Override // l5.k.c
        public InterfaceC2194c a(InterfaceC2194c interfaceC2194c) {
            return interfaceC2194c instanceof i ? interfaceC2194c : new C2193b(this.f44107a, interfaceC2194c);
        }
    }

    /* JADX INFO: renamed from: l5.g$c */
    public static final class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public k f44109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public C1274a f44110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ColorFilter f44111c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ColorStateList f44112d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ColorStateList f44113e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ColorStateList f44114f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ColorStateList f44115g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f44116h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Rect f44117i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f44118j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f44119k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f44120l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f44121m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f44122n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f44123o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public float f44124p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f44125q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f44126r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f44127s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f44128t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f44129u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Paint.Style f44130v;

        public c(c cVar) {
            this.f44112d = null;
            this.f44113e = null;
            this.f44114f = null;
            this.f44115g = null;
            this.f44116h = PorterDuff.Mode.SRC_IN;
            this.f44117i = null;
            this.f44118j = 1.0f;
            this.f44119k = 1.0f;
            this.f44121m = 255;
            this.f44122n = 0.0f;
            this.f44123o = 0.0f;
            this.f44124p = 0.0f;
            this.f44125q = 0;
            this.f44126r = 0;
            this.f44127s = 0;
            this.f44128t = 0;
            this.f44129u = false;
            this.f44130v = Paint.Style.FILL_AND_STROKE;
            this.f44109a = cVar.f44109a;
            this.f44110b = cVar.f44110b;
            this.f44120l = cVar.f44120l;
            this.f44111c = cVar.f44111c;
            this.f44112d = cVar.f44112d;
            this.f44113e = cVar.f44113e;
            this.f44116h = cVar.f44116h;
            this.f44115g = cVar.f44115g;
            this.f44121m = cVar.f44121m;
            this.f44118j = cVar.f44118j;
            this.f44127s = cVar.f44127s;
            this.f44125q = cVar.f44125q;
            this.f44129u = cVar.f44129u;
            this.f44119k = cVar.f44119k;
            this.f44122n = cVar.f44122n;
            this.f44123o = cVar.f44123o;
            this.f44124p = cVar.f44124p;
            this.f44126r = cVar.f44126r;
            this.f44128t = cVar.f44128t;
            this.f44114f = cVar.f44114f;
            this.f44130v = cVar.f44130v;
            if (cVar.f44117i != null) {
                this.f44117i = new Rect(cVar.f44117i);
            }
        }

        public c(k kVar, C1274a c1274a) {
            this.f44112d = null;
            this.f44113e = null;
            this.f44114f = null;
            this.f44115g = null;
            this.f44116h = PorterDuff.Mode.SRC_IN;
            this.f44117i = null;
            this.f44118j = 1.0f;
            this.f44119k = 1.0f;
            this.f44121m = 255;
            this.f44122n = 0.0f;
            this.f44123o = 0.0f;
            this.f44124p = 0.0f;
            this.f44125q = 0;
            this.f44126r = 0;
            this.f44127s = 0;
            this.f44128t = 0;
            this.f44129u = false;
            this.f44130v = Paint.Style.FILL_AND_STROKE;
            this.f44109a = kVar;
            this.f44110b = c1274a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C2198g c2198g = new C2198g(this, null);
            c2198g.f44087f = true;
            return c2198g;
        }
    }

    static {
        Paint paint = new Paint(1);
        f44082z = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C2198g() {
        this(new k());
    }

    public C2198g(Context context, AttributeSet attributeSet, int i9, int i10) {
        this(k.e(context, attributeSet, i9, i10).m());
    }

    public C2198g(c cVar) {
        this.f44084c = new m.g[4];
        this.f44085d = new m.g[4];
        this.f44086e = new BitSet(8);
        this.f44088g = new Matrix();
        this.f44089h = new Path();
        this.f44090i = new Path();
        this.f44091j = new RectF();
        this.f44092k = new RectF();
        this.f44093l = new Region();
        this.f44094m = new Region();
        Paint paint = new Paint(1);
        this.f44096o = paint;
        Paint paint2 = new Paint(1);
        this.f44097p = paint2;
        this.f44098q = new C2148a();
        this.f44100s = Looper.getMainLooper().getThread() == Thread.currentThread() ? l.k() : new l();
        this.f44104w = new RectF();
        this.f44105x = true;
        this.f44083a = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        f0();
        e0(getState());
        this.f44099r = new a();
    }

    public /* synthetic */ C2198g(c cVar, a aVar) {
        this(cVar);
    }

    public C2198g(k kVar) {
        this(new c(kVar, null));
    }

    public static int Q(int i9, int i10) {
        return (i9 * (i10 + (i10 >>> 7))) >>> 8;
    }

    public static C2198g m(Context context, float f9) {
        int iC = Z4.a.c(context, R4.b.f8678m, C2198g.class.getSimpleName());
        C2198g c2198g = new C2198g();
        c2198g.L(context);
        c2198g.W(ColorStateList.valueOf(iC));
        c2198g.V(f9);
        return c2198g;
    }

    public int A() {
        return (int) (((double) this.f44083a.f44127s) * Math.sin(Math.toRadians(r0.f44128t)));
    }

    public int B() {
        return (int) (((double) this.f44083a.f44127s) * Math.cos(Math.toRadians(r0.f44128t)));
    }

    public k C() {
        return this.f44083a.f44109a;
    }

    public final float D() {
        if (K()) {
            return this.f44097p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public float E() {
        return this.f44083a.f44109a.r().a(u());
    }

    public float F() {
        return this.f44083a.f44109a.t().a(u());
    }

    public float G() {
        return this.f44083a.f44124p;
    }

    public float H() {
        return w() + G();
    }

    public final boolean I() {
        c cVar = this.f44083a;
        int i9 = cVar.f44125q;
        return i9 != 1 && cVar.f44126r > 0 && (i9 == 2 || S());
    }

    public final boolean J() {
        Paint.Style style = this.f44083a.f44130v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    public final boolean K() {
        Paint.Style style = this.f44083a.f44130v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f44097p.getStrokeWidth() > 0.0f;
    }

    public void L(Context context) {
        this.f44083a.f44110b = new C1274a(context);
        g0();
    }

    public final void M() {
        super.invalidateSelf();
    }

    public boolean N() {
        C1274a c1274a = this.f44083a.f44110b;
        return c1274a != null && c1274a.d();
    }

    public boolean O() {
        return this.f44083a.f44109a.u(u());
    }

    public final void P(Canvas canvas) {
        if (I()) {
            canvas.save();
            R(canvas);
            if (this.f44105x) {
                int iWidth = (int) (this.f44104w.width() - getBounds().width());
                int iHeight = (int) (this.f44104w.height() - getBounds().height());
                if (iWidth < 0 || iHeight < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f44104w.width()) + (this.f44083a.f44126r * 2) + iWidth, ((int) this.f44104w.height()) + (this.f44083a.f44126r * 2) + iHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                float f9 = (getBounds().left - this.f44083a.f44126r) - iWidth;
                float f10 = (getBounds().top - this.f44083a.f44126r) - iHeight;
                canvas2.translate(-f9, -f10);
                n(canvas2);
                canvas.drawBitmap(bitmapCreateBitmap, f9, f10, (Paint) null);
                bitmapCreateBitmap.recycle();
            } else {
                n(canvas);
            }
            canvas.restore();
        }
    }

    public final void R(Canvas canvas) {
        canvas.translate(A(), B());
    }

    public boolean S() {
        return (O() || this.f44089h.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void T(float f9) {
        setShapeAppearanceModel(this.f44083a.f44109a.w(f9));
    }

    public void U(InterfaceC2194c interfaceC2194c) {
        setShapeAppearanceModel(this.f44083a.f44109a.x(interfaceC2194c));
    }

    public void V(float f9) {
        c cVar = this.f44083a;
        if (cVar.f44123o != f9) {
            cVar.f44123o = f9;
            g0();
        }
    }

    public void W(ColorStateList colorStateList) {
        c cVar = this.f44083a;
        if (cVar.f44112d != colorStateList) {
            cVar.f44112d = colorStateList;
            onStateChange(getState());
        }
    }

    public void X(float f9) {
        c cVar = this.f44083a;
        if (cVar.f44119k != f9) {
            cVar.f44119k = f9;
            this.f44087f = true;
            invalidateSelf();
        }
    }

    public void Y(int i9, int i10, int i11, int i12) {
        c cVar = this.f44083a;
        if (cVar.f44117i == null) {
            cVar.f44117i = new Rect();
        }
        this.f44083a.f44117i.set(i9, i10, i11, i12);
        invalidateSelf();
    }

    public void Z(float f9) {
        c cVar = this.f44083a;
        if (cVar.f44122n != f9) {
            cVar.f44122n = f9;
            g0();
        }
    }

    public void a0(float f9, int i9) {
        d0(f9);
        c0(ColorStateList.valueOf(i9));
    }

    public void b0(float f9, ColorStateList colorStateList) {
        d0(f9);
        c0(colorStateList);
    }

    public void c0(ColorStateList colorStateList) {
        c cVar = this.f44083a;
        if (cVar.f44113e != colorStateList) {
            cVar.f44113e = colorStateList;
            onStateChange(getState());
        }
    }

    public void d0(float f9) {
        this.f44083a.f44120l = f9;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f44096o.setColorFilter(this.f44101t);
        int alpha = this.f44096o.getAlpha();
        this.f44096o.setAlpha(Q(alpha, this.f44083a.f44121m));
        this.f44097p.setColorFilter(this.f44102u);
        this.f44097p.setStrokeWidth(this.f44083a.f44120l);
        int alpha2 = this.f44097p.getAlpha();
        this.f44097p.setAlpha(Q(alpha2, this.f44083a.f44121m));
        if (this.f44087f) {
            i();
            g(u(), this.f44089h);
            this.f44087f = false;
        }
        P(canvas);
        if (J()) {
            o(canvas);
        }
        if (K()) {
            r(canvas);
        }
        this.f44096o.setAlpha(alpha);
        this.f44097p.setAlpha(alpha2);
    }

    public final boolean e0(int[] iArr) {
        boolean z9;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f44083a.f44112d == null || color2 == (colorForState2 = this.f44083a.f44112d.getColorForState(iArr, (color2 = this.f44096o.getColor())))) {
            z9 = false;
        } else {
            this.f44096o.setColor(colorForState2);
            z9 = true;
        }
        if (this.f44083a.f44113e == null || color == (colorForState = this.f44083a.f44113e.getColorForState(iArr, (color = this.f44097p.getColor())))) {
            return z9;
        }
        this.f44097p.setColor(colorForState);
        return true;
    }

    public final PorterDuffColorFilter f(Paint paint, boolean z9) {
        if (!z9) {
            return null;
        }
        int color = paint.getColor();
        int iL = l(color);
        this.f44103v = iL;
        if (iL != color) {
            return new PorterDuffColorFilter(iL, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    public final boolean f0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f44101t;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f44102u;
        c cVar = this.f44083a;
        this.f44101t = k(cVar.f44115g, cVar.f44116h, this.f44096o, true);
        c cVar2 = this.f44083a;
        this.f44102u = k(cVar2.f44114f, cVar2.f44116h, this.f44097p, false);
        c cVar3 = this.f44083a;
        if (cVar3.f44129u) {
            this.f44098q.d(cVar3.f44115g.getColorForState(getState(), 0));
        }
        return (O.c.a(porterDuffColorFilter, this.f44101t) && O.c.a(porterDuffColorFilter2, this.f44102u)) ? false : true;
    }

    public final void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.f44083a.f44118j != 1.0f) {
            this.f44088g.reset();
            Matrix matrix = this.f44088g;
            float f9 = this.f44083a.f44118j;
            matrix.setScale(f9, f9, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f44088g);
        }
        path.computeBounds(this.f44104w, true);
    }

    public final void g0() {
        float fH = H();
        this.f44083a.f44126r = (int) Math.ceil(0.75f * fH);
        this.f44083a.f44127s = (int) Math.ceil(fH * 0.25f);
        f0();
        M();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f44083a.f44121m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f44083a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f44083a.f44125q == 2) {
            return;
        }
        if (O()) {
            outline.setRoundRect(getBounds(), E() * this.f44083a.f44119k);
            return;
        }
        g(u(), this.f44089h);
        if (this.f44089h.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.f44089h);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f44083a.f44117i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f44093l.set(getBounds());
        g(u(), this.f44089h);
        this.f44094m.setPath(this.f44089h, this.f44093l);
        this.f44093l.op(this.f44094m, Region.Op.DIFFERENCE);
        return this.f44093l;
    }

    public final void h(RectF rectF, Path path) {
        l lVar = this.f44100s;
        c cVar = this.f44083a;
        lVar.e(cVar.f44109a, cVar.f44119k, rectF, this.f44099r, path);
    }

    public final void i() {
        k kVarY = C().y(new b(-D()));
        this.f44095n = kVarY;
        this.f44100s.d(kVarY, this.f44083a.f44119k, v(), this.f44090i);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f44087f = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f44083a.f44115g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f44083a.f44114f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f44083a.f44113e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f44083a.f44112d) != null && colorStateList4.isStateful())));
    }

    public final PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z9) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z9) {
            colorForState = l(colorForState);
        }
        this.f44103v = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public final PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z9) {
        return (colorStateList == null || mode == null) ? f(paint, z9) : j(colorStateList, mode, z9);
    }

    public int l(int i9) {
        float fH = H() + y();
        C1274a c1274a = this.f44083a.f44110b;
        return c1274a != null ? c1274a.c(i9, fH) : i9;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f44083a = new c(this.f44083a);
        return this;
    }

    public final void n(Canvas canvas) {
        if (this.f44086e.cardinality() > 0) {
            Log.w(f44081y, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f44083a.f44127s != 0) {
            canvas.drawPath(this.f44089h, this.f44098q.c());
        }
        for (int i9 = 0; i9 < 4; i9++) {
            this.f44084c[i9].b(this.f44098q, this.f44083a.f44126r, canvas);
            this.f44085d[i9].b(this.f44098q, this.f44083a.f44126r, canvas);
        }
        if (this.f44105x) {
            int iA = A();
            int iB = B();
            canvas.translate(-iA, -iB);
            canvas.drawPath(this.f44089h, f44082z);
            canvas.translate(iA, iB);
        }
    }

    public final void o(Canvas canvas) {
        q(canvas, this.f44096o, this.f44089h, this.f44083a.f44109a, u());
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f44087f = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, f5.s.b
    public boolean onStateChange(int[] iArr) {
        boolean z9 = e0(iArr) || f0();
        if (z9) {
            invalidateSelf();
        }
        return z9;
    }

    public void p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        q(canvas, paint, path, this.f44083a.f44109a, rectF);
    }

    public final void q(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = kVar.t().a(rectF) * this.f44083a.f44119k;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public void r(Canvas canvas) {
        q(canvas, this.f44097p, this.f44090i, this.f44095n, v());
    }

    public float s() {
        return this.f44083a.f44109a.j().a(u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i9) {
        c cVar = this.f44083a;
        if (cVar.f44121m != i9) {
            cVar.f44121m = i9;
            M();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f44083a.f44111c = colorFilter;
        M();
    }

    @Override // l5.n
    public void setShapeAppearanceModel(k kVar) {
        this.f44083a.f44109a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i9) {
        setTintList(ColorStateList.valueOf(i9));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f44083a.f44115g = colorStateList;
        f0();
        M();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f44083a;
        if (cVar.f44116h != mode) {
            cVar.f44116h = mode;
            f0();
            M();
        }
    }

    public float t() {
        return this.f44083a.f44109a.l().a(u());
    }

    public RectF u() {
        this.f44091j.set(getBounds());
        return this.f44091j;
    }

    public final RectF v() {
        this.f44092k.set(u());
        float fD = D();
        this.f44092k.inset(fD, fD);
        return this.f44092k;
    }

    public float w() {
        return this.f44083a.f44123o;
    }

    public ColorStateList x() {
        return this.f44083a.f44112d;
    }

    public float y() {
        return this.f44083a.f44122n;
    }

    public int z() {
        return this.f44103v;
    }
}
