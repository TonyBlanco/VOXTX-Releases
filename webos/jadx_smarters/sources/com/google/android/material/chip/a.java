package com.google.android.material.chip;

import H.b;
import S4.f;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import b5.AbstractC1229a;
import e.AbstractC1726a;
import f5.s;
import f5.w;
import i5.C1894d;
import j5.AbstractC2100b;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import l5.C2198g;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes3.dex */
public class a extends C2198g implements b, Drawable.Callback, s.b {

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public static final int[] f27185O0 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public static final ShapeDrawable f27186P0 = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ColorStateList f27187A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public int f27188A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ColorStateList f27189B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public int f27190B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f27191C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public ColorFilter f27192C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f27193D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public PorterDuffColorFilter f27194D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ColorStateList f27195E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public ColorStateList f27196E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f27197F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public PorterDuff.Mode f27198F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ColorStateList f27199G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public int[] f27200G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public CharSequence f27201H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public boolean f27202H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f27203I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public ColorStateList f27204I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Drawable f27205J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public WeakReference f27206J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public ColorStateList f27207K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public TextUtils.TruncateAt f27208K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public float f27209L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public boolean f27210L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f27211M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public int f27212M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f27213N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public boolean f27214N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public Drawable f27215O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public Drawable f27216P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public ColorStateList f27217Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public float f27218R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public CharSequence f27219S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f27220T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f27221U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Drawable f27222V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public ColorStateList f27223W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public f f27224X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public f f27225Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public float f27226Z;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f27227e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f27228f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public float f27229g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public float f27230h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public float f27231i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public float f27232j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public float f27233k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final Context f27234l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final Paint f27235m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final Paint f27236n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final Paint.FontMetrics f27237o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final RectF f27238p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final PointF f27239q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Path f27240r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final s f27241s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f27242t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f27243u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f27244v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f27245w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f27246x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f27247y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f27248z0;

    /* JADX INFO: renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0258a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9, i10);
        this.f27193D = -1.0f;
        this.f27235m0 = new Paint(1);
        this.f27237o0 = new Paint.FontMetrics();
        this.f27238p0 = new RectF();
        this.f27239q0 = new PointF();
        this.f27240r0 = new Path();
        this.f27190B0 = 255;
        this.f27198F0 = PorterDuff.Mode.SRC_IN;
        this.f27206J0 = new WeakReference(null);
        L(context);
        this.f27234l0 = context;
        s sVar = new s(this);
        this.f27241s0 = sVar;
        this.f27201H = "";
        sVar.e().density = context.getResources().getDisplayMetrics().density;
        this.f27236n0 = null;
        int[] iArr = f27185O0;
        setState(iArr);
        i2(iArr);
        this.f27210L0 = true;
        if (AbstractC2100b.f43042a) {
            f27186P0.setTint(-1);
        }
    }

    public static boolean k1(int[] iArr, int i9) {
        if (iArr == null) {
            return false;
        }
        for (int i10 : iArr) {
            if (i10 == i9) {
                return true;
            }
        }
        return false;
    }

    public static boolean o1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean p1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static boolean q1(C1894d c1894d) {
        return (c1894d == null || c1894d.i() == null || !c1894d.i().isStateful()) ? false : true;
    }

    public static a s0(Context context, AttributeSet attributeSet, int i9, int i10) {
        a aVar = new a(context, attributeSet, i9, i10);
        aVar.r1(attributeSet, i9, i10);
        return aVar;
    }

    public final void A0(Canvas canvas, Rect rect) {
        Paint paint = this.f27236n0;
        if (paint != null) {
            paint.setColor(G.a.o(DefaultRenderer.BACKGROUND_COLOR, 127));
            canvas.drawRect(rect, this.f27236n0);
            if (K2() || J2()) {
                i0(rect, this.f27238p0);
                canvas.drawRect(this.f27238p0, this.f27236n0);
            }
            if (this.f27201H != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f27236n0);
            }
            if (L2()) {
                l0(rect, this.f27238p0);
                canvas.drawRect(this.f27238p0, this.f27236n0);
            }
            this.f27236n0.setColor(G.a.o(-65536, 127));
            k0(rect, this.f27238p0);
            canvas.drawRect(this.f27238p0, this.f27236n0);
            this.f27236n0.setColor(G.a.o(-16711936, 127));
            m0(rect, this.f27238p0);
            canvas.drawRect(this.f27238p0, this.f27236n0);
        }
    }

    public void A1(int i9) {
        B1(this.f27234l0.getResources().getBoolean(i9));
    }

    public void A2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.f27201H, charSequence)) {
            return;
        }
        this.f27201H = charSequence;
        this.f27241s0.i(true);
        invalidateSelf();
        s1();
    }

    public final void B0(Canvas canvas, Rect rect) {
        if (this.f27201H != null) {
            Paint.Align alignQ0 = q0(rect, this.f27239q0);
            o0(rect, this.f27238p0);
            if (this.f27241s0.d() != null) {
                this.f27241s0.e().drawableState = getState();
                this.f27241s0.j(this.f27234l0);
            }
            this.f27241s0.e().setTextAlign(alignQ0);
            int iSave = 0;
            boolean z9 = Math.round(this.f27241s0.f(e1().toString())) > Math.round(this.f27238p0.width());
            if (z9) {
                iSave = canvas.save();
                canvas.clipRect(this.f27238p0);
            }
            CharSequence charSequenceEllipsize = this.f27201H;
            if (z9 && this.f27208K0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f27241s0.e(), this.f27238p0.width(), this.f27208K0);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.f27239q0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.f27241s0.e());
            if (z9) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    public void B1(boolean z9) {
        if (this.f27221U != z9) {
            boolean zJ2 = J2();
            this.f27221U = z9;
            boolean zJ22 = J2();
            if (zJ2 != zJ22) {
                if (zJ22) {
                    h0(this.f27222V);
                } else {
                    M2(this.f27222V);
                }
                invalidateSelf();
                s1();
            }
        }
    }

    public void B2(C1894d c1894d) {
        this.f27241s0.h(c1894d, this.f27234l0);
    }

    public Drawable C0() {
        return this.f27222V;
    }

    public void C1(ColorStateList colorStateList) {
        if (this.f27189B != colorStateList) {
            this.f27189B = colorStateList;
            onStateChange(getState());
        }
    }

    public void C2(int i9) {
        B2(new C1894d(this.f27234l0, i9));
    }

    public ColorStateList D0() {
        return this.f27223W;
    }

    public void D1(int i9) {
        C1(AbstractC1726a.a(this.f27234l0, i9));
    }

    public void D2(float f9) {
        if (this.f27230h0 != f9) {
            this.f27230h0 = f9;
            invalidateSelf();
            s1();
        }
    }

    public ColorStateList E0() {
        return this.f27189B;
    }

    public void E1(float f9) {
        if (this.f27193D != f9) {
            this.f27193D = f9;
            setShapeAppearanceModel(C().w(f9));
        }
    }

    public void E2(int i9) {
        D2(this.f27234l0.getResources().getDimension(i9));
    }

    public float F0() {
        return this.f27214N0 ? E() : this.f27193D;
    }

    public void F1(int i9) {
        E1(this.f27234l0.getResources().getDimension(i9));
    }

    public void F2(float f9) {
        if (this.f27229g0 != f9) {
            this.f27229g0 = f9;
            invalidateSelf();
            s1();
        }
    }

    public float G0() {
        return this.f27233k0;
    }

    public void G1(float f9) {
        if (this.f27233k0 != f9) {
            this.f27233k0 = f9;
            invalidateSelf();
            s1();
        }
    }

    public void G2(int i9) {
        F2(this.f27234l0.getResources().getDimension(i9));
    }

    public Drawable H0() {
        Drawable drawable = this.f27205J;
        if (drawable != null) {
            return H.a.q(drawable);
        }
        return null;
    }

    public void H1(int i9) {
        G1(this.f27234l0.getResources().getDimension(i9));
    }

    public void H2(boolean z9) {
        if (this.f27202H0 != z9) {
            this.f27202H0 = z9;
            N2();
            onStateChange(getState());
        }
    }

    public float I0() {
        return this.f27209L;
    }

    public void I1(Drawable drawable) {
        Drawable drawableH0 = H0();
        if (drawableH0 != drawable) {
            float fJ0 = j0();
            this.f27205J = drawable != null ? H.a.r(drawable).mutate() : null;
            float fJ02 = j0();
            M2(drawableH0);
            if (K2()) {
                h0(this.f27205J);
            }
            invalidateSelf();
            if (fJ0 != fJ02) {
                s1();
            }
        }
    }

    public boolean I2() {
        return this.f27210L0;
    }

    public ColorStateList J0() {
        return this.f27207K;
    }

    public void J1(int i9) {
        I1(AbstractC1726a.b(this.f27234l0, i9));
    }

    public final boolean J2() {
        return this.f27221U && this.f27222V != null && this.f27248z0;
    }

    public float K0() {
        return this.f27191C;
    }

    public void K1(float f9) {
        if (this.f27209L != f9) {
            float fJ0 = j0();
            this.f27209L = f9;
            float fJ02 = j0();
            invalidateSelf();
            if (fJ0 != fJ02) {
                s1();
            }
        }
    }

    public final boolean K2() {
        return this.f27203I && this.f27205J != null;
    }

    public float L0() {
        return this.f27226Z;
    }

    public void L1(int i9) {
        K1(this.f27234l0.getResources().getDimension(i9));
    }

    public final boolean L2() {
        return this.f27213N && this.f27215O != null;
    }

    public ColorStateList M0() {
        return this.f27195E;
    }

    public void M1(ColorStateList colorStateList) {
        this.f27211M = true;
        if (this.f27207K != colorStateList) {
            this.f27207K = colorStateList;
            if (K2()) {
                H.a.o(this.f27205J, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public float N0() {
        return this.f27197F;
    }

    public void N1(int i9) {
        M1(AbstractC1726a.a(this.f27234l0, i9));
    }

    public final void N2() {
        this.f27204I0 = this.f27202H0 ? AbstractC2100b.d(this.f27199G) : null;
    }

    public Drawable O0() {
        Drawable drawable = this.f27215O;
        if (drawable != null) {
            return H.a.q(drawable);
        }
        return null;
    }

    public void O1(int i9) {
        P1(this.f27234l0.getResources().getBoolean(i9));
    }

    public final void O2() {
        this.f27216P = new RippleDrawable(AbstractC2100b.d(c1()), this.f27215O, f27186P0);
    }

    public CharSequence P0() {
        return this.f27219S;
    }

    public void P1(boolean z9) {
        if (this.f27203I != z9) {
            boolean zK2 = K2();
            this.f27203I = z9;
            boolean zK22 = K2();
            if (zK2 != zK22) {
                if (zK22) {
                    h0(this.f27205J);
                } else {
                    M2(this.f27205J);
                }
                invalidateSelf();
                s1();
            }
        }
    }

    public float Q0() {
        return this.f27232j0;
    }

    public void Q1(float f9) {
        if (this.f27191C != f9) {
            this.f27191C = f9;
            invalidateSelf();
            s1();
        }
    }

    public float R0() {
        return this.f27218R;
    }

    public void R1(int i9) {
        Q1(this.f27234l0.getResources().getDimension(i9));
    }

    public float S0() {
        return this.f27231i0;
    }

    public void S1(float f9) {
        if (this.f27226Z != f9) {
            this.f27226Z = f9;
            invalidateSelf();
            s1();
        }
    }

    public int[] T0() {
        return this.f27200G0;
    }

    public void T1(int i9) {
        S1(this.f27234l0.getResources().getDimension(i9));
    }

    public ColorStateList U0() {
        return this.f27217Q;
    }

    public void U1(ColorStateList colorStateList) {
        if (this.f27195E != colorStateList) {
            this.f27195E = colorStateList;
            if (this.f27214N0) {
                c0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void V0(RectF rectF) {
        m0(getBounds(), rectF);
    }

    public void V1(int i9) {
        U1(AbstractC1726a.a(this.f27234l0, i9));
    }

    public final float W0() {
        Drawable drawable = this.f27248z0 ? this.f27222V : this.f27205J;
        float fCeil = this.f27209L;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(w.b(this.f27234l0, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    public void W1(float f9) {
        if (this.f27197F != f9) {
            this.f27197F = f9;
            this.f27235m0.setStrokeWidth(f9);
            if (this.f27214N0) {
                super.d0(f9);
            }
            invalidateSelf();
        }
    }

    public final float X0() {
        Drawable drawable = this.f27248z0 ? this.f27222V : this.f27205J;
        float f9 = this.f27209L;
        return (f9 > 0.0f || drawable == null) ? f9 : drawable.getIntrinsicWidth();
    }

    public void X1(int i9) {
        W1(this.f27234l0.getResources().getDimension(i9));
    }

    public TextUtils.TruncateAt Y0() {
        return this.f27208K0;
    }

    public final void Y1(ColorStateList colorStateList) {
        if (this.f27187A != colorStateList) {
            this.f27187A = colorStateList;
            onStateChange(getState());
        }
    }

    public f Z0() {
        return this.f27225Y;
    }

    public void Z1(Drawable drawable) {
        Drawable drawableO0 = O0();
        if (drawableO0 != drawable) {
            float fN0 = n0();
            this.f27215O = drawable != null ? H.a.r(drawable).mutate() : null;
            if (AbstractC2100b.f43042a) {
                O2();
            }
            float fN02 = n0();
            M2(drawableO0);
            if (L2()) {
                h0(this.f27215O);
            }
            invalidateSelf();
            if (fN0 != fN02) {
                s1();
            }
        }
    }

    @Override // f5.s.b
    public void a() {
        s1();
        invalidateSelf();
    }

    public float a1() {
        return this.f27228f0;
    }

    public void a2(CharSequence charSequence) {
        if (this.f27219S != charSequence) {
            this.f27219S = N.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public float b1() {
        return this.f27227e0;
    }

    public void b2(float f9) {
        if (this.f27232j0 != f9) {
            this.f27232j0 = f9;
            invalidateSelf();
            if (L2()) {
                s1();
            }
        }
    }

    public ColorStateList c1() {
        return this.f27199G;
    }

    public void c2(int i9) {
        b2(this.f27234l0.getResources().getDimension(i9));
    }

    public f d1() {
        return this.f27224X;
    }

    public void d2(int i9) {
        Z1(AbstractC1726a.b(this.f27234l0, i9));
    }

    @Override // l5.C2198g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i9 = this.f27190B0;
        int iA = i9 < 255 ? W4.a.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i9) : 0;
        x0(canvas, bounds);
        u0(canvas, bounds);
        if (this.f27214N0) {
            super.draw(canvas);
        }
        w0(canvas, bounds);
        z0(canvas, bounds);
        v0(canvas, bounds);
        t0(canvas, bounds);
        if (this.f27210L0) {
            B0(canvas, bounds);
        }
        y0(canvas, bounds);
        A0(canvas, bounds);
        if (this.f27190B0 < 255) {
            canvas.restoreToCount(iA);
        }
    }

    public CharSequence e1() {
        return this.f27201H;
    }

    public void e2(float f9) {
        if (this.f27218R != f9) {
            this.f27218R = f9;
            invalidateSelf();
            if (L2()) {
                s1();
            }
        }
    }

    public C1894d f1() {
        return this.f27241s0.d();
    }

    public void f2(int i9) {
        e2(this.f27234l0.getResources().getDimension(i9));
    }

    public float g1() {
        return this.f27230h0;
    }

    public void g2(float f9) {
        if (this.f27231i0 != f9) {
            this.f27231i0 = f9;
            invalidateSelf();
            if (L2()) {
                s1();
            }
        }
    }

    @Override // l5.C2198g, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f27190B0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f27192C0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f27191C;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f27226Z + j0() + this.f27229g0 + this.f27241s0.f(e1().toString()) + this.f27230h0 + n0() + this.f27233k0), this.f27212M0);
    }

    @Override // l5.C2198g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // l5.C2198g, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f27214N0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f27193D);
        } else {
            outline.setRoundRect(bounds, this.f27193D);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public final void h0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        H.a.m(drawable, H.a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f27215O) {
            if (drawable.isStateful()) {
                drawable.setState(T0());
            }
            H.a.o(drawable, this.f27217Q);
            return;
        }
        Drawable drawable2 = this.f27205J;
        if (drawable == drawable2 && this.f27211M) {
            H.a.o(drawable2, this.f27207K);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public float h1() {
        return this.f27229g0;
    }

    public void h2(int i9) {
        g2(this.f27234l0.getResources().getDimension(i9));
    }

    public final void i0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (K2() || J2()) {
            float f9 = this.f27226Z + this.f27227e0;
            float fX0 = X0();
            if (H.a.f(this) == 0) {
                float f10 = rect.left + f9;
                rectF.left = f10;
                rectF.right = f10 + fX0;
            } else {
                float f11 = rect.right - f9;
                rectF.right = f11;
                rectF.left = f11 - fX0;
            }
            float fW0 = W0();
            float fExactCenterY = rect.exactCenterY() - (fW0 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fW0;
        }
    }

    public final ColorFilter i1() {
        ColorFilter colorFilter = this.f27192C0;
        return colorFilter != null ? colorFilter : this.f27194D0;
    }

    public boolean i2(int[] iArr) {
        if (Arrays.equals(this.f27200G0, iArr)) {
            return false;
        }
        this.f27200G0 = iArr;
        if (L2()) {
            return t1(getState(), iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // l5.C2198g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return o1(this.f27187A) || o1(this.f27189B) || o1(this.f27195E) || (this.f27202H0 && o1(this.f27204I0)) || q1(this.f27241s0.d()) || r0() || p1(this.f27205J) || p1(this.f27222V) || o1(this.f27196E0);
    }

    public float j0() {
        if (K2() || J2()) {
            return this.f27227e0 + X0() + this.f27228f0;
        }
        return 0.0f;
    }

    public boolean j1() {
        return this.f27202H0;
    }

    public void j2(ColorStateList colorStateList) {
        if (this.f27217Q != colorStateList) {
            this.f27217Q = colorStateList;
            if (L2()) {
                H.a.o(this.f27215O, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void k0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (L2()) {
            float f9 = this.f27233k0 + this.f27232j0 + this.f27218R + this.f27231i0 + this.f27230h0;
            if (H.a.f(this) == 0) {
                rectF.right = rect.right - f9;
            } else {
                rectF.left = rect.left + f9;
            }
        }
    }

    public void k2(int i9) {
        j2(AbstractC1726a.a(this.f27234l0, i9));
    }

    public final void l0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (L2()) {
            float f9 = this.f27233k0 + this.f27232j0;
            if (H.a.f(this) == 0) {
                float f10 = rect.right - f9;
                rectF.right = f10;
                rectF.left = f10 - this.f27218R;
            } else {
                float f11 = rect.left + f9;
                rectF.left = f11;
                rectF.right = f11 + this.f27218R;
            }
            float fExactCenterY = rect.exactCenterY();
            float f12 = this.f27218R;
            float f13 = fExactCenterY - (f12 / 2.0f);
            rectF.top = f13;
            rectF.bottom = f13 + f12;
        }
    }

    public boolean l1() {
        return this.f27220T;
    }

    public void l2(boolean z9) {
        if (this.f27213N != z9) {
            boolean zL2 = L2();
            this.f27213N = z9;
            boolean zL22 = L2();
            if (zL2 != zL22) {
                if (zL22) {
                    h0(this.f27215O);
                } else {
                    M2(this.f27215O);
                }
                invalidateSelf();
                s1();
            }
        }
    }

    public final void m0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (L2()) {
            float f9 = this.f27233k0 + this.f27232j0 + this.f27218R + this.f27231i0 + this.f27230h0;
            if (H.a.f(this) == 0) {
                float f10 = rect.right;
                rectF.right = f10;
                rectF.left = f10 - f9;
            } else {
                int i9 = rect.left;
                rectF.left = i9;
                rectF.right = i9 + f9;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public boolean m1() {
        return p1(this.f27215O);
    }

    public void m2(InterfaceC0258a interfaceC0258a) {
        this.f27206J0 = new WeakReference(interfaceC0258a);
    }

    public float n0() {
        if (L2()) {
            return this.f27231i0 + this.f27218R + this.f27232j0;
        }
        return 0.0f;
    }

    public boolean n1() {
        return this.f27213N;
    }

    public void n2(TextUtils.TruncateAt truncateAt) {
        this.f27208K0 = truncateAt;
    }

    public final void o0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f27201H != null) {
            float fJ0 = this.f27226Z + j0() + this.f27229g0;
            float fN0 = this.f27233k0 + n0() + this.f27230h0;
            if (H.a.f(this) == 0) {
                rectF.left = rect.left + fJ0;
                rectF.right = rect.right - fN0;
            } else {
                rectF.left = rect.left + fN0;
                rectF.right = rect.right - fJ0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public void o2(f fVar) {
        this.f27225Y = fVar;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i9) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i9);
        if (K2()) {
            zOnLayoutDirectionChanged |= H.a.m(this.f27205J, i9);
        }
        if (J2()) {
            zOnLayoutDirectionChanged |= H.a.m(this.f27222V, i9);
        }
        if (L2()) {
            zOnLayoutDirectionChanged |= H.a.m(this.f27215O, i9);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i9) {
        boolean zOnLevelChange = super.onLevelChange(i9);
        if (K2()) {
            zOnLevelChange |= this.f27205J.setLevel(i9);
        }
        if (J2()) {
            zOnLevelChange |= this.f27222V.setLevel(i9);
        }
        if (L2()) {
            zOnLevelChange |= this.f27215O.setLevel(i9);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // l5.C2198g, android.graphics.drawable.Drawable, f5.s.b
    public boolean onStateChange(int[] iArr) {
        if (this.f27214N0) {
            super.onStateChange(iArr);
        }
        return t1(iArr, T0());
    }

    public final float p0() {
        this.f27241s0.e().getFontMetrics(this.f27237o0);
        Paint.FontMetrics fontMetrics = this.f27237o0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    public void p2(int i9) {
        o2(f.c(this.f27234l0, i9));
    }

    public Paint.Align q0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f27201H != null) {
            float fJ0 = this.f27226Z + j0() + this.f27229g0;
            if (H.a.f(this) == 0) {
                pointF.x = rect.left + fJ0;
            } else {
                pointF.x = rect.right - fJ0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - p0();
        }
        return align;
    }

    public void q2(float f9) {
        if (this.f27228f0 != f9) {
            float fJ0 = j0();
            this.f27228f0 = f9;
            float fJ02 = j0();
            invalidateSelf();
            if (fJ0 != fJ02) {
                s1();
            }
        }
    }

    public final boolean r0() {
        return this.f27221U && this.f27222V != null && this.f27220T;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r1(android.util.AttributeSet r8, int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.r1(android.util.AttributeSet, int, int):void");
    }

    public void r2(int i9) {
        q2(this.f27234l0.getResources().getDimension(i9));
    }

    public void s1() {
        InterfaceC0258a interfaceC0258a = (InterfaceC0258a) this.f27206J0.get();
        if (interfaceC0258a != null) {
            interfaceC0258a.a();
        }
    }

    public void s2(float f9) {
        if (this.f27227e0 != f9) {
            float fJ0 = j0();
            this.f27227e0 = f9;
            float fJ02 = j0();
            invalidateSelf();
            if (fJ0 != fJ02) {
                s1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j9) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j9);
        }
    }

    @Override // l5.C2198g, android.graphics.drawable.Drawable
    public void setAlpha(int i9) {
        if (this.f27190B0 != i9) {
            this.f27190B0 = i9;
            invalidateSelf();
        }
    }

    @Override // l5.C2198g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f27192C0 != colorFilter) {
            this.f27192C0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // l5.C2198g, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f27196E0 != colorStateList) {
            this.f27196E0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // l5.C2198g, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f27198F0 != mode) {
            this.f27198F0 = mode;
            this.f27194D0 = AbstractC1229a.b(this, this.f27196E0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z9, boolean z10) {
        boolean visible = super.setVisible(z9, z10);
        if (K2()) {
            visible |= this.f27205J.setVisible(z9, z10);
        }
        if (J2()) {
            visible |= this.f27222V.setVisible(z9, z10);
        }
        if (L2()) {
            visible |= this.f27215O.setVisible(z9, z10);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void t0(Canvas canvas, Rect rect) {
        if (J2()) {
            i0(rect, this.f27238p0);
            RectF rectF = this.f27238p0;
            float f9 = rectF.left;
            float f10 = rectF.top;
            canvas.translate(f9, f10);
            this.f27222V.setBounds(0, 0, (int) this.f27238p0.width(), (int) this.f27238p0.height());
            this.f27222V.draw(canvas);
            canvas.translate(-f9, -f10);
        }
    }

    public final boolean t1(int[] iArr, int[] iArr2) {
        boolean z9;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f27187A;
        int iL = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.f27242t0) : 0);
        boolean state = true;
        if (this.f27242t0 != iL) {
            this.f27242t0 = iL;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.f27189B;
        int iL2 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f27243u0) : 0);
        if (this.f27243u0 != iL2) {
            this.f27243u0 = iL2;
            zOnStateChange = true;
        }
        int iG = Z4.a.g(iL, iL2);
        if ((this.f27244v0 != iG) | (x() == null)) {
            this.f27244v0 = iG;
            W(ColorStateList.valueOf(iG));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f27195E;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f27245w0) : 0;
        if (this.f27245w0 != colorForState) {
            this.f27245w0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f27204I0 == null || !AbstractC2100b.e(iArr)) ? 0 : this.f27204I0.getColorForState(iArr, this.f27246x0);
        if (this.f27246x0 != colorForState2) {
            this.f27246x0 = colorForState2;
            if (this.f27202H0) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.f27241s0.d() == null || this.f27241s0.d().i() == null) ? 0 : this.f27241s0.d().i().getColorForState(iArr, this.f27247y0);
        if (this.f27247y0 != colorForState3) {
            this.f27247y0 = colorForState3;
            zOnStateChange = true;
        }
        boolean z10 = k1(getState(), R.attr.state_checked) && this.f27220T;
        if (this.f27248z0 == z10 || this.f27222V == null) {
            z9 = false;
        } else {
            float fJ0 = j0();
            this.f27248z0 = z10;
            if (fJ0 != j0()) {
                zOnStateChange = true;
                z9 = true;
            } else {
                zOnStateChange = true;
                z9 = false;
            }
        }
        ColorStateList colorStateList4 = this.f27196E0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f27188A0) : 0;
        if (this.f27188A0 != colorForState4) {
            this.f27188A0 = colorForState4;
            this.f27194D0 = AbstractC1229a.b(this, this.f27196E0, this.f27198F0);
        } else {
            state = zOnStateChange;
        }
        if (p1(this.f27205J)) {
            state |= this.f27205J.setState(iArr);
        }
        if (p1(this.f27222V)) {
            state |= this.f27222V.setState(iArr);
        }
        if (p1(this.f27215O)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f27215O.setState(iArr3);
        }
        if (AbstractC2100b.f43042a && p1(this.f27216P)) {
            state |= this.f27216P.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z9) {
            s1();
        }
        return state;
    }

    public void t2(int i9) {
        s2(this.f27234l0.getResources().getDimension(i9));
    }

    public final void u0(Canvas canvas, Rect rect) {
        if (this.f27214N0) {
            return;
        }
        this.f27235m0.setColor(this.f27243u0);
        this.f27235m0.setStyle(Paint.Style.FILL);
        this.f27235m0.setColorFilter(i1());
        this.f27238p0.set(rect);
        canvas.drawRoundRect(this.f27238p0, F0(), F0(), this.f27235m0);
    }

    public void u1(boolean z9) {
        if (this.f27220T != z9) {
            this.f27220T = z9;
            float fJ0 = j0();
            if (!z9 && this.f27248z0) {
                this.f27248z0 = false;
            }
            float fJ02 = j0();
            invalidateSelf();
            if (fJ0 != fJ02) {
                s1();
            }
        }
    }

    public void u2(int i9) {
        this.f27212M0 = i9;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v0(Canvas canvas, Rect rect) {
        if (K2()) {
            i0(rect, this.f27238p0);
            RectF rectF = this.f27238p0;
            float f9 = rectF.left;
            float f10 = rectF.top;
            canvas.translate(f9, f10);
            this.f27205J.setBounds(0, 0, (int) this.f27238p0.width(), (int) this.f27238p0.height());
            this.f27205J.draw(canvas);
            canvas.translate(-f9, -f10);
        }
    }

    public void v1(int i9) {
        u1(this.f27234l0.getResources().getBoolean(i9));
    }

    public void v2(ColorStateList colorStateList) {
        if (this.f27199G != colorStateList) {
            this.f27199G = colorStateList;
            N2();
            onStateChange(getState());
        }
    }

    public final void w0(Canvas canvas, Rect rect) {
        if (this.f27197F <= 0.0f || this.f27214N0) {
            return;
        }
        this.f27235m0.setColor(this.f27245w0);
        this.f27235m0.setStyle(Paint.Style.STROKE);
        if (!this.f27214N0) {
            this.f27235m0.setColorFilter(i1());
        }
        RectF rectF = this.f27238p0;
        float f9 = rect.left;
        float f10 = this.f27197F;
        rectF.set(f9 + (f10 / 2.0f), rect.top + (f10 / 2.0f), rect.right - (f10 / 2.0f), rect.bottom - (f10 / 2.0f));
        float f11 = this.f27193D - (this.f27197F / 2.0f);
        canvas.drawRoundRect(this.f27238p0, f11, f11, this.f27235m0);
    }

    public void w1(Drawable drawable) {
        if (this.f27222V != drawable) {
            float fJ0 = j0();
            this.f27222V = drawable;
            float fJ02 = j0();
            M2(this.f27222V);
            h0(this.f27222V);
            invalidateSelf();
            if (fJ0 != fJ02) {
                s1();
            }
        }
    }

    public void w2(int i9) {
        v2(AbstractC1726a.a(this.f27234l0, i9));
    }

    public final void x0(Canvas canvas, Rect rect) {
        if (this.f27214N0) {
            return;
        }
        this.f27235m0.setColor(this.f27242t0);
        this.f27235m0.setStyle(Paint.Style.FILL);
        this.f27238p0.set(rect);
        canvas.drawRoundRect(this.f27238p0, F0(), F0(), this.f27235m0);
    }

    public void x1(int i9) {
        w1(AbstractC1726a.b(this.f27234l0, i9));
    }

    public void x2(boolean z9) {
        this.f27210L0 = z9;
    }

    public final void y0(Canvas canvas, Rect rect) {
        Drawable drawable;
        if (L2()) {
            l0(rect, this.f27238p0);
            RectF rectF = this.f27238p0;
            float f9 = rectF.left;
            float f10 = rectF.top;
            canvas.translate(f9, f10);
            this.f27215O.setBounds(0, 0, (int) this.f27238p0.width(), (int) this.f27238p0.height());
            if (AbstractC2100b.f43042a) {
                this.f27216P.setBounds(this.f27215O.getBounds());
                this.f27216P.jumpToCurrentState();
                drawable = this.f27216P;
            } else {
                drawable = this.f27215O;
            }
            drawable.draw(canvas);
            canvas.translate(-f9, -f10);
        }
    }

    public void y1(ColorStateList colorStateList) {
        if (this.f27223W != colorStateList) {
            this.f27223W = colorStateList;
            if (r0()) {
                H.a.o(this.f27222V, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void y2(f fVar) {
        this.f27224X = fVar;
    }

    public final void z0(Canvas canvas, Rect rect) {
        this.f27235m0.setColor(this.f27246x0);
        this.f27235m0.setStyle(Paint.Style.FILL);
        this.f27238p0.set(rect);
        if (!this.f27214N0) {
            canvas.drawRoundRect(this.f27238p0, F0(), F0(), this.f27235m0);
        } else {
            h(new RectF(rect), this.f27240r0);
            super.p(canvas, this.f27235m0, this.f27240r0, u());
        }
    }

    public void z1(int i9) {
        y1(AbstractC1726a.a(this.f27234l0, i9));
    }

    public void z2(int i9) {
        y2(f.c(this.f27234l0, i9));
    }
}
