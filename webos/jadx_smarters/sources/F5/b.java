package f5;

import P.AbstractC0974p;
import P.L;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import f5.r;
import i5.AbstractC1900j;
import i5.C1891a;
import i5.C1894d;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final boolean f40703t0 = false;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final Paint f40704u0 = null;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Typeface f40705A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Typeface f40706B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Typeface f40707C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Typeface f40708D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public C1891a f40709E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public C1891a f40710F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public CharSequence f40711G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public CharSequence f40712H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f40713I;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f40715K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Bitmap f40716L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public Paint f40717M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public float f40718N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public float f40719O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public float f40720P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public float f40721Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public float f40722R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f40723S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int[] f40724T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f40725U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final TextPaint f40726V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final TextPaint f40727W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TimeInterpolator f40728X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TimeInterpolator f40729Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public float f40730Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f40731a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f40732a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f40733b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f40734b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f40735c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ColorStateList f40736c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f40737d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public float f40738d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f40739e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f40740e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f40741f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f40742f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f40743g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public ColorStateList f40744g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f40745h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public float f40746h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f40747i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public float f40748i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RectF f40749j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public float f40750j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public StaticLayout f40752k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public float f40754l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public float f40756m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public float f40758n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ColorStateList f40759o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public CharSequence f40760o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ColorStateList f40761p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f40763q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f40765r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f40767s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f40769t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f40770u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f40771v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f40772w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Typeface f40773x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Typeface f40774y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Typeface f40775z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f40751k = 16;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f40753l = 16;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f40755m = 15.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f40757n = 15.0f;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f40714J = true;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f40762p0 = 1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f40764q0 = 0.0f;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public float f40766r0 = 1.0f;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f40768s0 = r.f40796n;

    public class a implements C1891a.InterfaceC0346a {
        public a() {
        }

        @Override // i5.C1891a.InterfaceC0346a
        public void a(Typeface typeface) {
            b.this.T(typeface);
        }
    }

    public b(View view) {
        this.f40731a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f40726V = textPaint;
        this.f40727W = new TextPaint(textPaint);
        this.f40747i = new Rect();
        this.f40745h = new Rect();
        this.f40749j = new RectF();
        this.f40741f = e();
        H(view.getContext().getResources().getConfiguration());
    }

    public static boolean C(float f9, float f10) {
        return Math.abs(f9 - f10) < 1.0E-5f;
    }

    public static float G(float f9, float f10, float f11, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f11 = timeInterpolator.getInterpolation(f11);
        }
        return S4.a.a(f9, f10, f11);
    }

    public static boolean M(Rect rect, int i9, int i10, int i11, int i12) {
        return rect.left == i9 && rect.top == i10 && rect.right == i11 && rect.bottom == i12;
    }

    public static int a(int i9, int i10, float f9) {
        float f10 = 1.0f - f9;
        return Color.argb(Math.round((Color.alpha(i9) * f10) + (Color.alpha(i10) * f9)), Math.round((Color.red(i9) * f10) + (Color.red(i10) * f9)), Math.round((Color.green(i9) * f10) + (Color.green(i10) * f9)), Math.round((Color.blue(i9) * f10) + (Color.blue(i10) * f9)));
    }

    public final void A(TextPaint textPaint) {
        textPaint.setTextSize(this.f40755m);
        textPaint.setTypeface(this.f40705A);
        textPaint.setLetterSpacing(this.f40748i0);
    }

    public final void B(float f9) {
        if (this.f40737d) {
            this.f40749j.set(f9 < this.f40741f ? this.f40745h : this.f40747i);
            return;
        }
        this.f40749j.left = G(this.f40745h.left, this.f40747i.left, f9, this.f40728X);
        this.f40749j.top = G(this.f40765r, this.f40767s, f9, this.f40728X);
        this.f40749j.right = G(this.f40745h.right, this.f40747i.right, f9, this.f40728X);
        this.f40749j.bottom = G(this.f40745h.bottom, this.f40747i.bottom, f9, this.f40728X);
    }

    public final boolean D() {
        return L.E(this.f40731a) == 1;
    }

    public final boolean E() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f40761p;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f40759o) != null && colorStateList.isStateful());
    }

    public final boolean F(CharSequence charSequence, boolean z9) {
        return (z9 ? N.o.f5277d : N.o.f5276c).a(charSequence, 0, charSequence.length());
    }

    public void H(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f40775z;
            if (typeface != null) {
                this.f40774y = AbstractC1900j.b(configuration, typeface);
            }
            Typeface typeface2 = this.f40707C;
            if (typeface2 != null) {
                this.f40706B = AbstractC1900j.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f40774y;
            if (typeface3 == null) {
                typeface3 = this.f40775z;
            }
            this.f40773x = typeface3;
            Typeface typeface4 = this.f40706B;
            if (typeface4 == null) {
                typeface4 = this.f40707C;
            }
            this.f40705A = typeface4;
            L(true);
        }
    }

    public final float I(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public void J() {
        this.f40733b = this.f40747i.width() > 0 && this.f40747i.height() > 0 && this.f40745h.width() > 0 && this.f40745h.height() > 0;
    }

    public void K() {
        L(false);
    }

    public void L(boolean z9) {
        if ((this.f40731a.getHeight() <= 0 || this.f40731a.getWidth() <= 0) && !z9) {
            return;
        }
        b(z9);
        c();
    }

    public void N(int i9, int i10, int i11, int i12) {
        if (M(this.f40747i, i9, i10, i11, i12)) {
            return;
        }
        this.f40747i.set(i9, i10, i11, i12);
        this.f40725U = true;
        J();
    }

    public void O(Rect rect) {
        N(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void P(int i9) {
        C1894d c1894d = new C1894d(this.f40731a.getContext(), i9);
        if (c1894d.i() != null) {
            this.f40761p = c1894d.i();
        }
        if (c1894d.j() != 0.0f) {
            this.f40757n = c1894d.j();
        }
        ColorStateList colorStateList = c1894d.f41871c;
        if (colorStateList != null) {
            this.f40736c0 = colorStateList;
        }
        this.f40732a0 = c1894d.f41876h;
        this.f40734b0 = c1894d.f41877i;
        this.f40730Z = c1894d.f41878j;
        this.f40746h0 = c1894d.f41880l;
        C1891a c1891a = this.f40710F;
        if (c1891a != null) {
            c1891a.c();
        }
        this.f40710F = new C1891a(new a(), c1894d.e());
        c1894d.h(this.f40731a.getContext(), this.f40710F);
        K();
    }

    public final void Q(float f9) {
        this.f40756m0 = f9;
        L.j0(this.f40731a);
    }

    public void R(ColorStateList colorStateList) {
        if (this.f40761p != colorStateList) {
            this.f40761p = colorStateList;
            K();
        }
    }

    public void S(int i9) {
        if (this.f40753l != i9) {
            this.f40753l = i9;
            K();
        }
    }

    public void T(Typeface typeface) {
        if (U(typeface)) {
            K();
        }
    }

    public final boolean U(Typeface typeface) {
        C1891a c1891a = this.f40710F;
        if (c1891a != null) {
            c1891a.c();
        }
        if (this.f40775z == typeface) {
            return false;
        }
        this.f40775z = typeface;
        Typeface typefaceB = AbstractC1900j.b(this.f40731a.getContext().getResources().getConfiguration(), typeface);
        this.f40774y = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.f40775z;
        }
        this.f40773x = typefaceB;
        return true;
    }

    public void V(int i9, int i10, int i11, int i12) {
        if (M(this.f40745h, i9, i10, i11, i12)) {
            return;
        }
        this.f40745h.set(i9, i10, i11, i12);
        this.f40725U = true;
        J();
    }

    public void W(Rect rect) {
        V(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void X(float f9) {
        if (this.f40748i0 != f9) {
            this.f40748i0 = f9;
            K();
        }
    }

    public final void Y(float f9) {
        this.f40758n0 = f9;
        L.j0(this.f40731a);
    }

    public void Z(ColorStateList colorStateList) {
        if (this.f40759o != colorStateList) {
            this.f40759o = colorStateList;
            K();
        }
    }

    public void a0(int i9) {
        if (this.f40751k != i9) {
            this.f40751k = i9;
            K();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r10) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.b.b(boolean):void");
    }

    public void b0(float f9) {
        if (this.f40755m != f9) {
            this.f40755m = f9;
            K();
        }
    }

    public final void c() {
        g(this.f40735c);
    }

    public final boolean c0(Typeface typeface) {
        C1891a c1891a = this.f40709E;
        if (c1891a != null) {
            c1891a.c();
        }
        if (this.f40707C == typeface) {
            return false;
        }
        this.f40707C = typeface;
        Typeface typefaceB = AbstractC1900j.b(this.f40731a.getContext().getResources().getConfiguration(), typeface);
        this.f40706B = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.f40707C;
        }
        this.f40705A = typefaceB;
        return true;
    }

    public final float d(float f9) {
        float f10 = this.f40741f;
        return f9 <= f10 ? S4.a.b(1.0f, 0.0f, this.f40739e, f10, f9) : S4.a.b(0.0f, 1.0f, f10, 1.0f, f9);
    }

    public void d0(float f9) {
        float fA = J.a.a(f9, 0.0f, 1.0f);
        if (fA != this.f40735c) {
            this.f40735c = fA;
            c();
        }
    }

    public final float e() {
        float f9 = this.f40739e;
        return f9 + ((1.0f - f9) * 0.5f);
    }

    public final void e0(float f9) {
        h(f9);
        boolean z9 = f40703t0 && this.f40718N != 1.0f;
        this.f40715K = z9;
        if (z9) {
            n();
        }
        L.j0(this.f40731a);
    }

    public final boolean f(CharSequence charSequence) {
        boolean zD = D();
        return this.f40714J ? F(charSequence, zD) : zD;
    }

    public void f0(TimeInterpolator timeInterpolator) {
        this.f40728X = timeInterpolator;
        K();
    }

    public final void g(float f9) {
        float f10;
        B(f9);
        if (!this.f40737d) {
            this.f40771v = G(this.f40769t, this.f40770u, f9, this.f40728X);
            this.f40772w = G(this.f40765r, this.f40767s, f9, this.f40728X);
            e0(f9);
            f10 = f9;
        } else if (f9 < this.f40741f) {
            this.f40771v = this.f40769t;
            this.f40772w = this.f40765r;
            e0(0.0f);
            f10 = 0.0f;
        } else {
            this.f40771v = this.f40770u;
            this.f40772w = this.f40767s - Math.max(0, this.f40743g);
            e0(1.0f);
            f10 = 1.0f;
        }
        TimeInterpolator timeInterpolator = S4.a.f9410b;
        Q(1.0f - G(0.0f, 1.0f, 1.0f - f9, timeInterpolator));
        Y(G(1.0f, 0.0f, f9, timeInterpolator));
        if (this.f40761p != this.f40759o) {
            this.f40726V.setColor(a(v(), t(), f10));
        } else {
            this.f40726V.setColor(t());
        }
        float f11 = this.f40746h0;
        float f12 = this.f40748i0;
        if (f11 != f12) {
            this.f40726V.setLetterSpacing(G(f12, f11, f9, timeInterpolator));
        } else {
            this.f40726V.setLetterSpacing(f11);
        }
        this.f40720P = G(this.f40738d0, this.f40730Z, f9, null);
        this.f40721Q = G(this.f40740e0, this.f40732a0, f9, null);
        this.f40722R = G(this.f40742f0, this.f40734b0, f9, null);
        int iA = a(u(this.f40744g0), u(this.f40736c0), f9);
        this.f40723S = iA;
        this.f40726V.setShadowLayer(this.f40720P, this.f40721Q, this.f40722R, iA);
        if (this.f40737d) {
            this.f40726V.setAlpha((int) (d(f9) * this.f40726V.getAlpha()));
        }
        L.j0(this.f40731a);
    }

    public final boolean g0(int[] iArr) {
        this.f40724T = iArr;
        if (!E()) {
            return false;
        }
        K();
        return true;
    }

    public final void h(float f9) {
        i(f9, false);
    }

    public void h0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f40711G, charSequence)) {
            this.f40711G = charSequence;
            this.f40712H = null;
            j();
            K();
        }
    }

    public final void i(float f9, boolean z9) {
        boolean z10;
        float f10;
        float f11;
        boolean z11;
        if (this.f40711G == null) {
            return;
        }
        float fWidth = this.f40747i.width();
        float fWidth2 = this.f40745h.width();
        if (C(f9, 1.0f)) {
            f10 = this.f40757n;
            f11 = this.f40746h0;
            this.f40718N = 1.0f;
            Typeface typeface = this.f40708D;
            Typeface typeface2 = this.f40773x;
            if (typeface != typeface2) {
                this.f40708D = typeface2;
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            float f12 = this.f40755m;
            float f13 = this.f40748i0;
            Typeface typeface3 = this.f40708D;
            Typeface typeface4 = this.f40705A;
            if (typeface3 != typeface4) {
                this.f40708D = typeface4;
                z10 = true;
            } else {
                z10 = false;
            }
            if (C(f9, 0.0f)) {
                this.f40718N = 1.0f;
            } else {
                this.f40718N = G(this.f40755m, this.f40757n, f9, this.f40729Y) / this.f40755m;
            }
            float f14 = this.f40757n / this.f40755m;
            fWidth = (!z9 && fWidth2 * f14 > fWidth) ? Math.min(fWidth / f14, fWidth2) : fWidth2;
            f10 = f12;
            f11 = f13;
            z11 = z10;
        }
        if (fWidth > 0.0f) {
            z11 = ((this.f40719O > f10 ? 1 : (this.f40719O == f10 ? 0 : -1)) != 0) || ((this.f40750j0 > f11 ? 1 : (this.f40750j0 == f11 ? 0 : -1)) != 0) || this.f40725U || z11;
            this.f40719O = f10;
            this.f40750j0 = f11;
            this.f40725U = false;
        }
        if (this.f40712H == null || z11) {
            this.f40726V.setTextSize(this.f40719O);
            this.f40726V.setTypeface(this.f40708D);
            this.f40726V.setLetterSpacing(this.f40750j0);
            this.f40726V.setLinearText(this.f40718N != 1.0f);
            this.f40713I = f(this.f40711G);
            StaticLayout staticLayoutK = k(k0() ? this.f40762p0 : 1, fWidth, this.f40713I);
            this.f40752k0 = staticLayoutK;
            this.f40712H = staticLayoutK.getText();
        }
    }

    public void i0(TimeInterpolator timeInterpolator) {
        this.f40729Y = timeInterpolator;
        K();
    }

    public final void j() {
        Bitmap bitmap = this.f40716L;
        if (bitmap != null) {
            bitmap.recycle();
            this.f40716L = null;
        }
    }

    public void j0(Typeface typeface) {
        boolean zU = U(typeface);
        boolean zC0 = c0(typeface);
        if (zU || zC0) {
            K();
        }
    }

    public final StaticLayout k(int i9, float f9, boolean z9) {
        StaticLayout staticLayoutA;
        try {
            staticLayoutA = r.c(this.f40711G, this.f40726V, (int) f9).e(TextUtils.TruncateAt.END).h(z9).d(i9 == 1 ? Layout.Alignment.ALIGN_NORMAL : y()).g(false).j(i9).i(this.f40764q0, this.f40766r0).f(this.f40768s0).a();
        } catch (r.a e9) {
            Log.e("CollapsingTextHelper", e9.getCause().getMessage(), e9);
            staticLayoutA = null;
        }
        return (StaticLayout) O.h.f(staticLayoutA);
    }

    public final boolean k0() {
        return this.f40762p0 > 1 && (!this.f40713I || this.f40737d) && !this.f40715K;
    }

    public void l(Canvas canvas) {
        int iSave = canvas.save();
        if (this.f40712H == null || !this.f40733b) {
            return;
        }
        this.f40726V.setTextSize(this.f40719O);
        float f9 = this.f40771v;
        float f10 = this.f40772w;
        boolean z9 = this.f40715K && this.f40716L != null;
        float f11 = this.f40718N;
        if (f11 != 1.0f && !this.f40737d) {
            canvas.scale(f11, f11, f9, f10);
        }
        if (z9) {
            canvas.drawBitmap(this.f40716L, f9, f10, this.f40717M);
            canvas.restoreToCount(iSave);
            return;
        }
        if (!k0() || (this.f40737d && this.f40735c <= this.f40741f)) {
            canvas.translate(f9, f10);
            this.f40752k0.draw(canvas);
        } else {
            m(canvas, this.f40771v - this.f40752k0.getLineStart(0), f10);
        }
        canvas.restoreToCount(iSave);
    }

    public final void m(Canvas canvas, float f9, float f10) {
        int alpha = this.f40726V.getAlpha();
        canvas.translate(f9, f10);
        float f11 = alpha;
        this.f40726V.setAlpha((int) (this.f40758n0 * f11));
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 31) {
            TextPaint textPaint = this.f40726V;
            textPaint.setShadowLayer(this.f40720P, this.f40721Q, this.f40722R, Z4.a.a(this.f40723S, textPaint.getAlpha()));
        }
        this.f40752k0.draw(canvas);
        this.f40726V.setAlpha((int) (this.f40756m0 * f11));
        if (i9 >= 31) {
            TextPaint textPaint2 = this.f40726V;
            textPaint2.setShadowLayer(this.f40720P, this.f40721Q, this.f40722R, Z4.a.a(this.f40723S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f40752k0.getLineBaseline(0);
        CharSequence charSequence = this.f40760o0;
        float f12 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, this.f40726V);
        if (i9 >= 31) {
            this.f40726V.setShadowLayer(this.f40720P, this.f40721Q, this.f40722R, this.f40723S);
        }
        if (this.f40737d) {
            return;
        }
        String strTrim = this.f40760o0.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.f40726V.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f40752k0.getLineEnd(0), str.length()), 0.0f, f12, (Paint) this.f40726V);
    }

    public final void n() {
        if (this.f40716L != null || this.f40745h.isEmpty() || TextUtils.isEmpty(this.f40712H)) {
            return;
        }
        g(0.0f);
        int width = this.f40752k0.getWidth();
        int height = this.f40752k0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.f40716L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f40752k0.draw(new Canvas(this.f40716L));
        if (this.f40717M == null) {
            this.f40717M = new Paint(3);
        }
    }

    public void o(RectF rectF, int i9, int i10) {
        this.f40713I = f(this.f40711G);
        rectF.left = r(i9, i10);
        rectF.top = this.f40747i.top;
        rectF.right = s(rectF, i9, i10);
        rectF.bottom = this.f40747i.top + q();
    }

    public ColorStateList p() {
        return this.f40761p;
    }

    public float q() {
        z(this.f40727W);
        return -this.f40727W.ascent();
    }

    public final float r(int i9, int i10) {
        return (i10 == 17 || (i10 & 7) == 1) ? (i9 / 2.0f) - (this.f40754l0 / 2.0f) : ((i10 & 8388613) == 8388613 || (i10 & 5) == 5) ? this.f40713I ? this.f40747i.left : this.f40747i.right - this.f40754l0 : this.f40713I ? this.f40747i.right - this.f40754l0 : this.f40747i.left;
    }

    public final float s(RectF rectF, int i9, int i10) {
        return (i10 == 17 || (i10 & 7) == 1) ? (i9 / 2.0f) + (this.f40754l0 / 2.0f) : ((i10 & 8388613) == 8388613 || (i10 & 5) == 5) ? this.f40713I ? rectF.left + this.f40754l0 : this.f40747i.right : this.f40713I ? this.f40747i.right : rectF.left + this.f40754l0;
    }

    public int t() {
        return u(this.f40761p);
    }

    public final int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f40724T;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final int v() {
        return u(this.f40759o);
    }

    public float w() {
        A(this.f40727W);
        return -this.f40727W.ascent();
    }

    public float x() {
        return this.f40735c;
    }

    public final Layout.Alignment y() {
        int iB = AbstractC0974p.b(this.f40751k, this.f40713I ? 1 : 0) & 7;
        return iB != 1 ? iB != 5 ? this.f40713I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f40713I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
    }

    public final void z(TextPaint textPaint) {
        textPaint.setTextSize(this.f40757n);
        textPaint.setTypeface(this.f40773x);
        textPaint.setLetterSpacing(this.f40746h0);
    }
}
