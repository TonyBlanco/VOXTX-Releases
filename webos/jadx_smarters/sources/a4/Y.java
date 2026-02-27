package a4;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import d4.AbstractC1684a;
import d4.k0;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes3.dex */
public final class Y {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f11572A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f11573B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f11574C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f11575D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public StaticLayout f11576E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public StaticLayout f11577F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f11578G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f11579H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f11580I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Rect f11581J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f11584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f11585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f11586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextPaint f11587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f11588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f11589h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f11590i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Layout.Alignment f11591j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Bitmap f11592k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f11593l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11594m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11595n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f11596o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f11597p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f11598q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f11599r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11600s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11601t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11602u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11603v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f11604w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f11605x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f11606y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f11607z;

    public Y(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f11586e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f11585d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f11582a = fRound;
        this.f11583b = fRound;
        this.f11584c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f11587f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f11588g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f11589h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    public void b(P3.b bVar, C1089c c1089c, float f9, float f10, float f11, Canvas canvas, int i9, int i10, int i11, int i12) {
        int i13;
        boolean z9 = bVar.f7195e == null;
        if (!z9) {
            i13 = DefaultRenderer.BACKGROUND_COLOR;
        } else if (TextUtils.isEmpty(bVar.f7192a)) {
            return;
        } else {
            i13 = bVar.f7203m ? bVar.f7204n : c1089c.f11614c;
        }
        if (a(this.f11590i, bVar.f7192a) && k0.c(this.f11591j, bVar.f7193c) && this.f11592k == bVar.f7195e && this.f11593l == bVar.f7196f && this.f11594m == bVar.f7197g && k0.c(Integer.valueOf(this.f11595n), Integer.valueOf(bVar.f7198h)) && this.f11596o == bVar.f7199i && k0.c(Integer.valueOf(this.f11597p), Integer.valueOf(bVar.f7200j)) && this.f11598q == bVar.f7201k && this.f11599r == bVar.f7202l && this.f11600s == c1089c.f11612a && this.f11601t == c1089c.f11613b && this.f11602u == i13 && this.f11604w == c1089c.f11615d && this.f11603v == c1089c.f11616e && k0.c(this.f11587f.getTypeface(), c1089c.f11617f) && this.f11605x == f9 && this.f11606y == f10 && this.f11607z == f11 && this.f11572A == i9 && this.f11573B == i10 && this.f11574C == i11 && this.f11575D == i12) {
            d(canvas, z9);
            return;
        }
        this.f11590i = bVar.f7192a;
        this.f11591j = bVar.f7193c;
        this.f11592k = bVar.f7195e;
        this.f11593l = bVar.f7196f;
        this.f11594m = bVar.f7197g;
        this.f11595n = bVar.f7198h;
        this.f11596o = bVar.f7199i;
        this.f11597p = bVar.f7200j;
        this.f11598q = bVar.f7201k;
        this.f11599r = bVar.f7202l;
        this.f11600s = c1089c.f11612a;
        this.f11601t = c1089c.f11613b;
        this.f11602u = i13;
        this.f11604w = c1089c.f11615d;
        this.f11603v = c1089c.f11616e;
        this.f11587f.setTypeface(c1089c.f11617f);
        this.f11605x = f9;
        this.f11606y = f10;
        this.f11607z = f11;
        this.f11572A = i9;
        this.f11573B = i10;
        this.f11574C = i11;
        this.f11575D = i12;
        if (z9) {
            AbstractC1684a.e(this.f11590i);
            g();
        } else {
            AbstractC1684a.e(this.f11592k);
            f();
        }
        d(canvas, z9);
    }

    public final void c(Canvas canvas) {
        canvas.drawBitmap(this.f11592k, (Rect) null, this.f11581J, this.f11589h);
    }

    public final void d(Canvas canvas, boolean z9) {
        if (z9) {
            e(canvas);
            return;
        }
        AbstractC1684a.e(this.f11581J);
        AbstractC1684a.e(this.f11592k);
        c(canvas);
    }

    public final void e(Canvas canvas) {
        StaticLayout staticLayout = this.f11576E;
        StaticLayout staticLayout2 = this.f11577F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f11578G, this.f11579H);
        if (Color.alpha(this.f11602u) > 0) {
            this.f11588g.setColor(this.f11602u);
            canvas.drawRect(-this.f11580I, 0.0f, staticLayout.getWidth() + this.f11580I, staticLayout.getHeight(), this.f11588g);
        }
        int i9 = this.f11604w;
        if (i9 == 1) {
            this.f11587f.setStrokeJoin(Paint.Join.ROUND);
            this.f11587f.setStrokeWidth(this.f11582a);
            this.f11587f.setColor(this.f11603v);
            this.f11587f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i9 == 2) {
            TextPaint textPaint = this.f11587f;
            float f9 = this.f11583b;
            float f10 = this.f11584c;
            textPaint.setShadowLayer(f9, f10, f10, this.f11603v);
        } else if (i9 == 3 || i9 == 4) {
            boolean z9 = i9 == 3;
            int i10 = z9 ? -1 : this.f11603v;
            int i11 = z9 ? this.f11603v : -1;
            float f11 = this.f11583b / 2.0f;
            this.f11587f.setColor(this.f11600s);
            this.f11587f.setStyle(Paint.Style.FILL);
            float f12 = -f11;
            this.f11587f.setShadowLayer(this.f11583b, f12, f12, i10);
            staticLayout2.draw(canvas);
            this.f11587f.setShadowLayer(this.f11583b, f11, f11, i11);
        }
        this.f11587f.setColor(this.f11600s);
        this.f11587f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f11587f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(iSave);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.f11592k
            int r1 = r7.f11574C
            int r2 = r7.f11572A
            int r1 = r1 - r2
            int r3 = r7.f11575D
            int r4 = r7.f11573B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.f11596o
            float r5 = r5 * r1
            float r2 = r2 + r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r5 = r7.f11593l
            float r5 = r5 * r3
            float r4 = r4 + r5
            float r5 = r7.f11598q
            float r1 = r1 * r5
            int r1 = java.lang.Math.round(r1)
            float r5 = r7.f11599r
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L32
        L2b:
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
            goto L3f
        L32:
            float r3 = (float) r1
            int r5 = r0.getHeight()
            float r5 = (float) r5
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            goto L2b
        L3f:
            int r3 = r7.f11597p
            r5 = 1
            r6 = 2
            if (r3 != r6) goto L48
            float r3 = (float) r1
        L46:
            float r2 = r2 - r3
            goto L4e
        L48:
            if (r3 != r5) goto L4e
            int r3 = r1 / 2
            float r3 = (float) r3
            goto L46
        L4e:
            int r2 = java.lang.Math.round(r2)
            int r3 = r7.f11595n
            if (r3 != r6) goto L59
            float r3 = (float) r0
        L57:
            float r4 = r4 - r3
            goto L5f
        L59:
            if (r3 != r5) goto L5f
            int r3 = r0 / 2
            float r3 = (float) r3
            goto L57
        L5f:
            int r3 = java.lang.Math.round(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r3
            r4.<init>(r2, r3, r1, r0)
            r7.f11581J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.Y.f():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.Y.g():void");
    }
}
