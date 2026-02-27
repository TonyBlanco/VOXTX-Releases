package net.orandja.shadowlayout;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.renderscript.Type;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w8.l;

/* JADX INFO: loaded from: classes4.dex */
public final class ShadowLayout extends FrameLayout {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final float f45666C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final float f45667D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f45668a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f45669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final N8.a f45670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final N8.a f45671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final N8.a f45672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final N8.a f45673g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final N8.a f45674h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final N8.a f45675i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final N8.a f45676j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final N8.a f45677k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final N8.a f45678l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final N8.a f45679m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Rect f45680n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Bitmap f45681o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Canvas f45682p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public RenderScript f45683q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ScriptIntrinsicBlur f45684r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Allocation f45685s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Allocation f45686t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Boolean f45687u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Rect f45688v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f45689w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Boolean f45690x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Boolean f45691y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Boolean f45692z;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ C8.i[] f45665B = {C.e(new q(C.b(ShadowLayout.class), "shadow_x_shift", "getShadow_x_shift()F")), C.e(new q(C.b(ShadowLayout.class), "shadow_y_shift", "getShadow_y_shift()F")), C.e(new q(C.b(ShadowLayout.class), "shadow_downscale", "getShadow_downscale()F")), C.e(new q(C.b(ShadowLayout.class), "shadow_radius", "getShadow_radius()F")), C.e(new q(C.b(ShadowLayout.class), "realRadius", "getRealRadius()F")), C.e(new q(C.b(ShadowLayout.class), "shadow_cast_only_background", "getShadow_cast_only_background()Z")), C.e(new q(C.b(ShadowLayout.class), "shadow_with_content", "getShadow_with_content()Z")), C.e(new q(C.b(ShadowLayout.class), "shadow_with_color", "getShadow_with_color()Z")), C.e(new q(C.b(ShadowLayout.class), "shadow_with_dpi_scale", "getShadow_with_dpi_scale()Z")), C.e(new q(C.b(ShadowLayout.class), "shadow_with_css_scale", "getShadow_with_css_scale()Z"))};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final a f45664A = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public static final class b extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
        }
    }

    public static final class c extends m implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f45693a = new c();

        public c() {
            super(1);
        }

        public final float a(float f9) {
            return B8.h.g(f9, 0.0f, 25.0f);
        }

        @Override // w8.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Float.valueOf(a(((Number) obj).floatValue()));
        }
    }

    public static final class d extends m implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f45694a = new d();

        public d() {
            super(1);
        }

        public final float a(float f9) {
            return B8.h.b(f9, 0.1f);
        }

        @Override // w8.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Float.valueOf(a(((Number) obj).floatValue()));
        }
    }

    public static final class e extends m implements l {
        public e() {
            super(1);
        }

        public final void a(float f9) {
            ShadowLayout shadowLayout = ShadowLayout.this;
            shadowLayout.setRealRadius(shadowLayout.getShadow_radius() / f9);
            ShadowLayout.this.j();
        }

        @Override // w8.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).floatValue());
            return k8.q.f43674a;
        }
    }

    public static final class f extends m implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f45696a = new f();

        public f() {
            super(1);
        }

        public final float a(float f9) {
            return B8.h.b(f9, 0.0f);
        }

        @Override // w8.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Float.valueOf(a(((Number) obj).floatValue()));
        }
    }

    public static final class g extends m implements l {
        public g() {
            super(1);
        }

        public final void a(float f9) {
            ShadowLayout shadowLayout = ShadowLayout.this;
            shadowLayout.setRealRadius(f9 / shadowLayout.getShadow_downscale());
        }

        @Override // w8.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).floatValue());
            return k8.q.f43674a;
        }
    }

    public static final class h extends m implements l {
        public h() {
            super(1);
        }

        public final void a(boolean z9) {
            ShadowLayout.this.h();
            ShadowLayout.this.j();
        }

        @Override // w8.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Boolean) obj).booleanValue());
            return k8.q.f43674a;
        }
    }

    public static final class i extends m implements l {
        public i() {
            super(1);
        }

        public final void a(boolean z9) {
            ShadowLayout.this.h();
            ShadowLayout.this.j();
        }

        @Override // w8.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Boolean) obj).booleanValue());
            return k8.q.f43674a;
        }
    }

    public static final class j extends m implements l {
        public j() {
            super(1);
        }

        public final void a(boolean z9) {
            ShadowLayout.this.h();
            ShadowLayout.this.j();
        }

        @Override // w8.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Boolean) obj).booleanValue());
            return k8.q.f43674a;
        }
    }

    static {
        float f9 = Resources.getSystem().getDisplayMetrics().densityDpi / 160;
        f45666C = f9;
        f45667D = (float) (1.0d / ((double) f9));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShadowLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.l.e(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowLayout(Context context, AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9, i10);
        kotlin.jvm.internal.l.e(context, "context");
        this.f45668a = new Paint(5);
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        k8.q qVar = k8.q.f43674a;
        this.f45669c = paint;
        Float fValueOf = Float.valueOf(0.0f);
        this.f45670d = new N8.a(fValueOf, null, null, 6, null);
        this.f45671e = new N8.a(fValueOf, null, null, 6, null);
        this.f45672f = new N8.a(Float.valueOf(1.0f), d.f45694a, new e());
        this.f45673g = new N8.a(fValueOf, f.f45696a, new g());
        this.f45674h = new N8.a(fValueOf, c.f45693a, null, 4, null);
        Boolean bool = Boolean.FALSE;
        this.f45675i = new N8.a(bool, null, null, 6, null);
        Boolean bool2 = Boolean.TRUE;
        this.f45676j = new N8.a(bool2, null, null, 6, null);
        this.f45677k = new N8.a(bool, null, new h(), 2, null);
        this.f45678l = new N8.a(bool2, null, new j(), 2, null);
        this.f45679m = new N8.a(bool2, null, new i(), 2, null);
        this.f45680n = new Rect();
        this.f45688v = new Rect();
        if (!isInEditMode()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, N8.c.f5389f, i9, i10);
            kotlin.jvm.internal.l.d(typedArrayObtainStyledAttributes, "context.obtainStyledAttributes(\n                attrs, R.styleable.ShadowLayout, defStyleAttr, defStyleRes\n            )");
            setShadow_color(typedArrayObtainStyledAttributes.getColor(N8.c.f5391h, 855638016));
            setShadow_with_color(typedArrayObtainStyledAttributes.getBoolean(N8.c.f5394k, false));
            setShadow_with_content(typedArrayObtainStyledAttributes.getBoolean(N8.c.f5395l, true));
            setShadow_with_dpi_scale(typedArrayObtainStyledAttributes.getBoolean(N8.c.f5397n, true));
            setShadow_with_css_scale(typedArrayObtainStyledAttributes.getBoolean(N8.c.f5396m, true));
            setShadow_x_shift(typedArrayObtainStyledAttributes.getDimension(N8.c.f5398o, 0.0f));
            setShadow_y_shift(typedArrayObtainStyledAttributes.getDimension(N8.c.f5399p, 0.0f));
            setShadow_downscale(typedArrayObtainStyledAttributes.getFloat(N8.c.f5392i, 1.0f));
            setShadow_radius(typedArrayObtainStyledAttributes.getFloat(N8.c.f5393j, 6.0f));
            setShadow_cast_only_background(typedArrayObtainStyledAttributes.getBoolean(N8.c.f5390g, false));
            typedArrayObtainStyledAttributes.recycle();
        }
        setWillNotDraw(false);
    }

    public /* synthetic */ ShadowLayout(Context context, AttributeSet attributeSet, int i9, int i10, int i11, kotlin.jvm.internal.g gVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? N8.b.f5383a : i9, (i11 & 8) != 0 ? 0 : i10);
    }

    private final Matrix getBlurSMatrix() {
        return G.c.a((getRatioPixelsToDp() / getShadow_downscale()) / getCssRatio(), (getRatioPixelsToDp() / getShadow_downscale()) / getCssRatio());
    }

    private final Matrix getBlurTMatrix() {
        return G.c.b(getPixelsOverBoundaries(), getPixelsOverBoundaries());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getCssRatio() {
        return getShadow_with_css_scale() ? 1.6666666f : 1.0f;
    }

    private final Matrix getDrawSMatrix() {
        return G.c.a(getRatioDpToPixels() * getShadow_downscale() * getCssRatio(), getRatioDpToPixels() * getShadow_downscale() * getCssRatio());
    }

    private final Matrix getDrawTMatrix() {
        return G.c.b(-(getPixelsOverBoundaries() * getRatioDpToPixels() * getShadow_downscale() * getCssRatio()), -(getPixelsOverBoundaries() * getRatioDpToPixels() * getShadow_downscale() * getCssRatio()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getPixelsOverBoundaries() {
        if (getShadow_downscale() < 1.0f) {
            return 25;
        }
        return (int) Math.ceil(getShadow_downscale() * 25.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getRatioDpToPixels() {
        if (getShadow_with_dpi_scale()) {
            return f45666C;
        }
        return 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getRatioPixelsToDp() {
        if (getShadow_with_dpi_scale()) {
            return f45667D;
        }
        return 1.0f;
    }

    private final float getRealRadius() {
        return ((Number) this.f45674h.a(this, f45665B[4])).floatValue();
    }

    private final k8.i getScript() {
        RenderScript renderScriptCreate = this.f45683q;
        if (renderScriptCreate == null) {
            renderScriptCreate = RenderScript.create(getContext());
        }
        if (!kotlin.jvm.internal.l.a(this.f45687u, Boolean.valueOf(getShadow_with_color()))) {
            this.f45687u = Boolean.valueOf(getShadow_with_color());
            this.f45684r = null;
        }
        ScriptIntrinsicBlur scriptIntrinsicBlur = this.f45684r;
        if (scriptIntrinsicBlur != null) {
            kotlin.jvm.internal.l.b(scriptIntrinsicBlur);
            kotlin.jvm.internal.l.b(renderScriptCreate);
            return new k8.i(scriptIntrinsicBlur, renderScriptCreate);
        }
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, getShadow_with_color() ? Element.U8_4(renderScriptCreate) : Element.U8(renderScriptCreate));
        this.f45684r = scriptIntrinsicBlurCreate;
        kotlin.jvm.internal.l.b(scriptIntrinsicBlurCreate);
        kotlin.jvm.internal.l.b(renderScriptCreate);
        return new k8.i(scriptIntrinsicBlurCreate, renderScriptCreate);
    }

    private final Matrix getShiftTMatrix() {
        return G.c.b((getShadow_x_shift() / getShadow_downscale()) / getCssRatio(), (getShadow_y_shift() / getShadow_downscale()) / getCssRatio());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRealRadius(float f9) {
        this.f45674h.c(this, f45665B[4], Float.valueOf(f9));
    }

    /* JADX WARN: Finally extract failed */
    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        if (isInEditMode()) {
            super.draw(canvas);
            return;
        }
        Canvas canvas2 = this.f45682p;
        if (canvas2 != null) {
            kotlin.jvm.internal.l.b(canvas2);
            Canvas canvas3 = this.f45682p;
            kotlin.jvm.internal.l.b(canvas3);
            canvas2.drawRect(canvas3.getClipBounds(), this.f45669c);
            Canvas canvas4 = this.f45682p;
            kotlin.jvm.internal.l.b(canvas4);
            Matrix matrixB = G.c.b(getPixelsOverBoundaries(), getPixelsOverBoundaries());
            Matrix matrixA = G.c.a((getRatioPixelsToDp() / getShadow_downscale()) / getCssRatio(), (getRatioPixelsToDp() / getShadow_downscale()) / getCssRatio());
            Matrix matrix = new Matrix(matrixB);
            matrix.preConcat(matrixA);
            int iSave = canvas4.save();
            canvas4.concat(matrix);
            try {
                if (getShadow_cast_only_background()) {
                    getBackground().setBounds(this.f45680n);
                    Drawable background = getBackground();
                    if (background != null) {
                        Canvas canvas5 = this.f45682p;
                        kotlin.jvm.internal.l.b(canvas5);
                        background.draw(canvas5);
                    }
                } else {
                    super.draw(this.f45682p);
                }
                canvas4.restoreToCount(iSave);
                if (getRealRadius() > 0.0f) {
                    ScriptIntrinsicBlur scriptIntrinsicBlur = (ScriptIntrinsicBlur) getScript().a();
                    scriptIntrinsicBlur.setRadius(getRealRadius());
                    Allocation allocation = this.f45685s;
                    if (allocation != null) {
                        allocation.copyFrom(this.f45681o);
                    }
                    scriptIntrinsicBlur.forEach(this.f45686t);
                    Allocation allocation2 = this.f45686t;
                    if (allocation2 != null) {
                        allocation2.copyTo(this.f45681o);
                    }
                }
                Matrix matrixB2 = G.c.b(-(getPixelsOverBoundaries() * getRatioDpToPixels() * getShadow_downscale() * getCssRatio()), -(getPixelsOverBoundaries() * getRatioDpToPixels() * getShadow_downscale() * getCssRatio()));
                Matrix matrixA2 = G.c.a(getRatioDpToPixels() * getShadow_downscale() * getCssRatio(), getRatioDpToPixels() * getShadow_downscale() * getCssRatio());
                Matrix matrix2 = new Matrix(matrixB2);
                matrix2.preConcat(matrixA2);
                Matrix matrixB3 = G.c.b((getShadow_x_shift() / getShadow_downscale()) / getCssRatio(), (getShadow_y_shift() / getShadow_downscale()) / getCssRatio());
                Matrix matrix3 = new Matrix(matrix2);
                matrix3.preConcat(matrixB3);
                int iSave2 = canvas.save();
                canvas.concat(matrix3);
                try {
                    Bitmap bitmap = this.f45681o;
                    kotlin.jvm.internal.l.b(bitmap);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f45668a);
                } finally {
                    canvas.restoreToCount(iSave2);
                }
            } catch (Throwable th) {
                canvas4.restoreToCount(iSave);
                throw th;
            }
        }
        if (getShadow_with_content()) {
            super.draw(canvas);
        }
    }

    @Override // android.view.View
    @NotNull
    public ViewOutlineProvider getOutlineProvider() {
        return new b();
    }

    public final boolean getShadow_cast_only_background() {
        return ((Boolean) this.f45675i.a(this, f45665B[5])).booleanValue();
    }

    public final int getShadow_color() {
        return this.f45668a.getColor();
    }

    public final float getShadow_downscale() {
        return ((Number) this.f45672f.a(this, f45665B[2])).floatValue();
    }

    public final float getShadow_radius() {
        return ((Number) this.f45673g.a(this, f45665B[3])).floatValue();
    }

    public final boolean getShadow_with_color() {
        return ((Boolean) this.f45677k.a(this, f45665B[7])).booleanValue();
    }

    public final boolean getShadow_with_content() {
        return ((Boolean) this.f45676j.a(this, f45665B[6])).booleanValue();
    }

    public final boolean getShadow_with_css_scale() {
        return ((Boolean) this.f45679m.a(this, f45665B[9])).booleanValue();
    }

    public final boolean getShadow_with_dpi_scale() {
        return ((Boolean) this.f45678l.a(this, f45665B[8])).booleanValue();
    }

    public final float getShadow_x_shift() {
        return ((Number) this.f45670d.a(this, f45665B[0])).floatValue();
    }

    public final float getShadow_y_shift() {
        return ((Number) this.f45671e.a(this, f45665B[1])).floatValue();
    }

    public final void h() {
        Bitmap bitmap = this.f45681o;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f45681o = null;
        this.f45682p = null;
        ScriptIntrinsicBlur scriptIntrinsicBlur = this.f45684r;
        if (scriptIntrinsicBlur != null) {
            scriptIntrinsicBlur.destroy();
        }
        this.f45684r = null;
        Allocation allocation = this.f45685s;
        if (allocation != null) {
            allocation.destroy();
        }
        this.f45685s = null;
        Allocation allocation2 = this.f45686t;
        if (allocation2 != null) {
            allocation2.destroy();
        }
        this.f45686t = null;
        this.f45688v.setEmpty();
        this.f45689w = 0.0f;
        this.f45687u = null;
        this.f45690x = null;
        this.f45691y = null;
        this.f45692z = null;
    }

    public final void i(int i9, int i10) {
        this.f45680n.set(0, 0, i9, i10);
        j();
    }

    public final void j() {
        if (this.f45680n.isEmpty()) {
            return;
        }
        if (isAttachedToWindow() && kotlin.jvm.internal.l.a(this.f45688v, this.f45680n) && getShadow_downscale() == this.f45689w && kotlin.jvm.internal.l.a(Boolean.valueOf(getShadow_with_color()), this.f45690x) && kotlin.jvm.internal.l.a(Boolean.valueOf(getShadow_with_dpi_scale()), this.f45691y) && kotlin.jvm.internal.l.a(Boolean.valueOf(getShadow_with_css_scale()), this.f45692z)) {
            return;
        }
        this.f45688v.set(this.f45680n);
        this.f45689w = getShadow_downscale();
        this.f45690x = Boolean.valueOf(getShadow_with_color());
        this.f45690x = Boolean.valueOf(getShadow_with_color());
        this.f45691y = Boolean.valueOf(getShadow_with_dpi_scale());
        this.f45692z = Boolean.valueOf(getShadow_with_css_scale());
        Bitmap bitmap = this.f45681o;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f45681o = Bitmap.createBitmap((int) (((float) Math.ceil(((this.f45680n.width() * getRatioPixelsToDp()) / getShadow_downscale()) / getCssRatio())) + (getPixelsOverBoundaries() * 2)), (int) (((float) Math.ceil(((this.f45680n.height() * getRatioPixelsToDp()) / getShadow_downscale()) / getCssRatio())) + (getPixelsOverBoundaries() * 2)), getShadow_with_color() ? Bitmap.Config.ARGB_8888 : Bitmap.Config.ALPHA_8);
        Bitmap bitmap2 = this.f45681o;
        kotlin.jvm.internal.l.b(bitmap2);
        this.f45682p = new Canvas(bitmap2);
        k8.i script = getScript();
        ScriptIntrinsicBlur scriptIntrinsicBlur = (ScriptIntrinsicBlur) script.a();
        RenderScript renderScript = (RenderScript) script.b();
        Allocation allocation = this.f45685s;
        if (allocation != null) {
            allocation.destroy();
        }
        this.f45685s = Allocation.createFromBitmap(renderScript, this.f45681o);
        Allocation allocation2 = this.f45686t;
        Type type = allocation2 == null ? null : allocation2.getType();
        Allocation allocation3 = this.f45685s;
        if (!kotlin.jvm.internal.l.a(type, allocation3 != null ? allocation3.getType() : null)) {
            Allocation allocation4 = this.f45686t;
            if (allocation4 != null) {
                allocation4.destroy();
            }
            Allocation allocation5 = this.f45685s;
            kotlin.jvm.internal.l.b(allocation5);
            this.f45686t = Allocation.createTyped(renderScript, allocation5.getType());
        }
        scriptIntrinsicBlur.setInput(this.f45685s);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (isInEditMode()) {
            return;
        }
        h();
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        if (isInEditMode()) {
            return;
        }
        i(i9, i10);
    }

    public final void setColorRes(int i9) {
        setShadow_color(F.h.d(getResources(), i9, getContext().getTheme()));
    }

    public final void setShadow_cast_only_background(boolean z9) {
        this.f45675i.c(this, f45665B[5], Boolean.valueOf(z9));
    }

    public final void setShadow_color(int i9) {
        if (this.f45668a.getColor() == i9) {
            return;
        }
        this.f45668a.setColor(i9);
        postInvalidate();
    }

    public final void setShadow_downscale(float f9) {
        this.f45672f.c(this, f45665B[2], Float.valueOf(f9));
    }

    public final void setShadow_radius(float f9) {
        this.f45673g.c(this, f45665B[3], Float.valueOf(f9));
    }

    public final void setShadow_with_color(boolean z9) {
        this.f45677k.c(this, f45665B[7], Boolean.valueOf(z9));
    }

    public final void setShadow_with_content(boolean z9) {
        this.f45676j.c(this, f45665B[6], Boolean.valueOf(z9));
    }

    public final void setShadow_with_css_scale(boolean z9) {
        this.f45679m.c(this, f45665B[9], Boolean.valueOf(z9));
    }

    public final void setShadow_with_dpi_scale(boolean z9) {
        this.f45678l.c(this, f45665B[8], Boolean.valueOf(z9));
    }

    public final void setShadow_x_shift(float f9) {
        this.f45670d.c(this, f45665B[0], Float.valueOf(f9));
    }

    public final void setShadow_y_shift(float f9) {
        this.f45671e.c(this, f45665B[1], Float.valueOf(f9));
    }

    public final void setXShift(int i9) {
        setShadow_x_shift(getContext().getResources().getDimension(i9));
    }

    public final void setYShift(int i9) {
        setShadow_y_shift(getContext().getResources().getDimension(i9));
    }
}
