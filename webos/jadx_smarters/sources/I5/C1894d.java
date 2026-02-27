package i5;

import F.h;
import R4.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: renamed from: i5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1894d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f41869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f41870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f41871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f41872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f41873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f41874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f41875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f41876h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f41877i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f41878j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f41879k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f41880l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ColorStateList f41881m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f41882n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f41883o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f41884p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Typeface f41885q;

    /* JADX INFO: renamed from: i5.d$a */
    public class a extends h.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC1896f f41886a;

        public a(AbstractC1896f abstractC1896f) {
            this.f41886a = abstractC1896f;
        }

        @Override // F.h.e
        /* JADX INFO: renamed from: h */
        public void f(int i9) {
            C1894d.this.f41884p = true;
            this.f41886a.a(i9);
        }

        @Override // F.h.e
        /* JADX INFO: renamed from: i */
        public void g(Typeface typeface) {
            C1894d c1894d = C1894d.this;
            c1894d.f41885q = Typeface.create(typeface, c1894d.f41873e);
            C1894d.this.f41884p = true;
            this.f41886a.b(C1894d.this.f41885q, false);
        }
    }

    /* JADX INFO: renamed from: i5.d$b */
    public class b extends AbstractC1896f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f41888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextPaint f41889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AbstractC1896f f41890c;

        public b(Context context, TextPaint textPaint, AbstractC1896f abstractC1896f) {
            this.f41888a = context;
            this.f41889b = textPaint;
            this.f41890c = abstractC1896f;
        }

        @Override // i5.AbstractC1896f
        public void a(int i9) {
            this.f41890c.a(i9);
        }

        @Override // i5.AbstractC1896f
        public void b(Typeface typeface, boolean z9) {
            C1894d.this.p(this.f41888a, this.f41889b, typeface);
            this.f41890c.b(typeface, z9);
        }
    }

    public C1894d(Context context, int i9) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i9, l.f8965L5);
        l(typedArrayObtainStyledAttributes.getDimension(l.f8973M5, 0.0f));
        k(AbstractC1893c.a(context, typedArrayObtainStyledAttributes, l.f8997P5));
        this.f41869a = AbstractC1893c.a(context, typedArrayObtainStyledAttributes, l.f9005Q5);
        this.f41870b = AbstractC1893c.a(context, typedArrayObtainStyledAttributes, l.f9013R5);
        this.f41873e = typedArrayObtainStyledAttributes.getInt(l.f8989O5, 0);
        this.f41874f = typedArrayObtainStyledAttributes.getInt(l.f8981N5, 1);
        int iE = AbstractC1893c.e(typedArrayObtainStyledAttributes, l.f9061X5, l.f9053W5);
        this.f41883o = typedArrayObtainStyledAttributes.getResourceId(iE, 0);
        this.f41872d = typedArrayObtainStyledAttributes.getString(iE);
        this.f41875g = typedArrayObtainStyledAttributes.getBoolean(l.f9069Y5, false);
        this.f41871c = AbstractC1893c.a(context, typedArrayObtainStyledAttributes, l.f9021S5);
        this.f41876h = typedArrayObtainStyledAttributes.getFloat(l.f9029T5, 0.0f);
        this.f41877i = typedArrayObtainStyledAttributes.getFloat(l.f9037U5, 0.0f);
        this.f41878j = typedArrayObtainStyledAttributes.getFloat(l.f9045V5, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i9, l.f8995P3);
        this.f41879k = typedArrayObtainStyledAttributes2.hasValue(l.f9003Q3);
        this.f41880l = typedArrayObtainStyledAttributes2.getFloat(l.f9003Q3, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void d() {
        String str;
        if (this.f41885q == null && (str = this.f41872d) != null) {
            this.f41885q = Typeface.create(str, this.f41873e);
        }
        if (this.f41885q == null) {
            int i9 = this.f41874f;
            this.f41885q = i9 != 1 ? i9 != 2 ? i9 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f41885q = Typeface.create(this.f41885q, this.f41873e);
        }
    }

    public Typeface e() {
        d();
        return this.f41885q;
    }

    public Typeface f(Context context) {
        if (this.f41884p) {
            return this.f41885q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceH = F.h.h(context, this.f41883o);
                this.f41885q = typefaceH;
                if (typefaceH != null) {
                    this.f41885q = Typeface.create(typefaceH, this.f41873e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e9) {
                Log.d("TextAppearance", "Error loading font " + this.f41872d, e9);
            }
        }
        d();
        this.f41884p = true;
        return this.f41885q;
    }

    public void g(Context context, TextPaint textPaint, AbstractC1896f abstractC1896f) {
        p(context, textPaint, e());
        h(context, new b(context, textPaint, abstractC1896f));
    }

    public void h(Context context, AbstractC1896f abstractC1896f) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i9 = this.f41883o;
        if (i9 == 0) {
            this.f41884p = true;
        }
        if (this.f41884p) {
            abstractC1896f.b(this.f41885q, true);
            return;
        }
        try {
            F.h.j(context, i9, new a(abstractC1896f), null);
        } catch (Resources.NotFoundException unused) {
            this.f41884p = true;
            abstractC1896f.a(1);
        } catch (Exception e9) {
            Log.d("TextAppearance", "Error loading font " + this.f41872d, e9);
            this.f41884p = true;
            abstractC1896f.a(-3);
        }
    }

    public ColorStateList i() {
        return this.f41881m;
    }

    public float j() {
        return this.f41882n;
    }

    public void k(ColorStateList colorStateList) {
        this.f41881m = colorStateList;
    }

    public void l(float f9) {
        this.f41882n = f9;
    }

    public final boolean m(Context context) {
        if (AbstractC1895e.a()) {
            return true;
        }
        int i9 = this.f41883o;
        return (i9 != 0 ? F.h.c(context, i9) : null) != null;
    }

    public void n(Context context, TextPaint textPaint, AbstractC1896f abstractC1896f) {
        o(context, textPaint, abstractC1896f);
        ColorStateList colorStateList = this.f41881m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : DefaultRenderer.BACKGROUND_COLOR);
        float f9 = this.f41878j;
        float f10 = this.f41876h;
        float f11 = this.f41877i;
        ColorStateList colorStateList2 = this.f41871c;
        textPaint.setShadowLayer(f9, f10, f11, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void o(Context context, TextPaint textPaint, AbstractC1896f abstractC1896f) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            g(context, textPaint, abstractC1896f);
        }
    }

    public void p(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceA = AbstractC1900j.a(context, typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i9 = this.f41873e & (~typeface.getStyle());
        textPaint.setFakeBoldText((i9 & 1) != 0);
        textPaint.setTextSkewX((i9 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f41882n);
        if (this.f41879k) {
            textPaint.setLetterSpacing(this.f41880l);
        }
    }
}
