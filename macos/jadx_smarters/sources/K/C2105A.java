package k;

import F.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: renamed from: k.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2105A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f43100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b0 f43101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b0 f43102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b0 f43103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b0 f43104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b0 f43105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b0 f43106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b0 f43107h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final B f43108i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f43109j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f43110k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f43111l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f43112m;

    /* JADX INFO: renamed from: k.A$a */
    public class a extends h.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f43113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f43114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WeakReference f43115c;

        public a(int i9, int i10, WeakReference weakReference) {
            this.f43113a = i9;
            this.f43114b = i10;
            this.f43115c = weakReference;
        }

        @Override // F.h.e
        /* JADX INFO: renamed from: h */
        public void f(int i9) {
        }

        @Override // F.h.e
        /* JADX INFO: renamed from: i */
        public void g(Typeface typeface) {
            int i9;
            if (Build.VERSION.SDK_INT >= 28 && (i9 = this.f43113a) != -1) {
                typeface = g.a(typeface, i9, (this.f43114b & 2) != 0);
            }
            C2105A.this.n(this.f43115c, typeface);
        }
    }

    /* JADX INFO: renamed from: k.A$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextView f43117a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Typeface f43118c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f43119d;

        public b(TextView textView, Typeface typeface, int i9) {
            this.f43117a = textView;
            this.f43118c = typeface;
            this.f43119d = i9;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f43117a.setTypeface(this.f43118c, this.f43119d);
        }
    }

    /* JADX INFO: renamed from: k.A$c */
    public static class c {
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        public static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        public static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* JADX INFO: renamed from: k.A$d */
    public static class d {
        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* JADX INFO: renamed from: k.A$e */
    public static class e {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* JADX INFO: renamed from: k.A$f */
    public static class f {
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void b(TextView textView, int i9, int i10, int i11, int i12) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i9, i10, i11, i12);
        }

        public static void c(TextView textView, int[] iArr, int i9) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i9);
        }

        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* JADX INFO: renamed from: k.A$g */
    public static class g {
        public static Typeface a(Typeface typeface, int i9, boolean z9) {
            return Typeface.create(typeface, i9, z9);
        }
    }

    public C2105A(TextView textView) {
        this.f43100a = textView;
        this.f43108i = new B(textView);
    }

    public static b0 d(Context context, C2114i c2114i, int i9) {
        ColorStateList colorStateListF = c2114i.f(context, i9);
        if (colorStateListF == null) {
            return null;
        }
        b0 b0Var = new b0();
        b0Var.f43301d = true;
        b0Var.f43298a = colorStateListF;
        return b0Var;
    }

    public void A(int i9, float f9) {
        if (m0.f43381b || l()) {
            return;
        }
        B(i9, f9);
    }

    public final void B(int i9, float f9) {
        this.f43108i.t(i9, f9);
    }

    public final void C(Context context, d0 d0Var) {
        String strO;
        Typeface typefaceCreate;
        Typeface typeface;
        this.f43109j = d0Var.k(c.j.f18067d3, this.f43109j);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 28) {
            int iK = d0Var.k(c.j.f18092i3, -1);
            this.f43110k = iK;
            if (iK != -1) {
                this.f43109j &= 2;
            }
        }
        if (!d0Var.s(c.j.f18087h3) && !d0Var.s(c.j.f18097j3)) {
            if (d0Var.s(c.j.f18062c3)) {
                this.f43112m = false;
                int iK2 = d0Var.k(c.j.f18062c3, 1);
                if (iK2 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (iK2 == 2) {
                    typeface = Typeface.SERIF;
                } else if (iK2 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f43111l = typeface;
                return;
            }
            return;
        }
        this.f43111l = null;
        int i10 = d0Var.s(c.j.f18097j3) ? c.j.f18097j3 : c.j.f18087h3;
        int i11 = this.f43110k;
        int i12 = this.f43109j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceJ = d0Var.j(i10, this.f43109j, new a(i11, i12, new WeakReference(this.f43100a)));
                if (typefaceJ != null) {
                    if (i9 >= 28 && this.f43110k != -1) {
                        typefaceJ = g.a(Typeface.create(typefaceJ, 0), this.f43110k, (this.f43109j & 2) != 0);
                    }
                    this.f43111l = typefaceJ;
                }
                this.f43112m = this.f43111l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f43111l != null || (strO = d0Var.o(i10)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f43110k == -1) {
            typefaceCreate = Typeface.create(strO, this.f43109j);
        } else {
            typefaceCreate = g.a(Typeface.create(strO, 0), this.f43110k, (this.f43109j & 2) != 0);
        }
        this.f43111l = typefaceCreate;
    }

    public final void a(Drawable drawable, b0 b0Var) {
        if (drawable == null || b0Var == null) {
            return;
        }
        C2114i.i(drawable, b0Var, this.f43100a.getDrawableState());
    }

    public void b() {
        if (this.f43101b != null || this.f43102c != null || this.f43103d != null || this.f43104e != null) {
            Drawable[] compoundDrawables = this.f43100a.getCompoundDrawables();
            a(compoundDrawables[0], this.f43101b);
            a(compoundDrawables[1], this.f43102c);
            a(compoundDrawables[2], this.f43103d);
            a(compoundDrawables[3], this.f43104e);
        }
        if (this.f43105f == null && this.f43106g == null) {
            return;
        }
        Drawable[] drawableArrA = c.a(this.f43100a);
        a(drawableArrA[0], this.f43105f);
        a(drawableArrA[2], this.f43106g);
    }

    public void c() {
        this.f43108i.a();
    }

    public int e() {
        return this.f43108i.f();
    }

    public int f() {
        return this.f43108i.g();
    }

    public int g() {
        return this.f43108i.h();
    }

    public int[] h() {
        return this.f43108i.i();
    }

    public int i() {
        return this.f43108i.j();
    }

    public ColorStateList j() {
        b0 b0Var = this.f43107h;
        if (b0Var != null) {
            return b0Var.f43298a;
        }
        return null;
    }

    public PorterDuff.Mode k() {
        b0 b0Var = this.f43107h;
        if (b0Var != null) {
            return b0Var.f43299b;
        }
        return null;
    }

    public boolean l() {
        return this.f43108i.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(android.util.AttributeSet r18, int r19) {
        /*
            Method dump skipped, instruction units count: 823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C2105A.m(android.util.AttributeSet, int):void");
    }

    public void n(WeakReference weakReference, Typeface typeface) {
        if (this.f43112m) {
            this.f43111l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (P.L.V(textView)) {
                    textView.post(new b(textView, typeface, this.f43109j));
                } else {
                    textView.setTypeface(typeface, this.f43109j);
                }
            }
        }
    }

    public void o(boolean z9, int i9, int i10, int i11, int i12) {
        if (m0.f43381b) {
            return;
        }
        c();
    }

    public void p() {
        b();
    }

    public void q(Context context, int i9) {
        String strO;
        ColorStateList colorStateListC;
        ColorStateList colorStateListC2;
        ColorStateList colorStateListC3;
        d0 d0VarT = d0.t(context, i9, c.j.f18050a3);
        if (d0VarT.s(c.j.f18107l3)) {
            s(d0VarT.a(c.j.f18107l3, false));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23) {
            if (d0VarT.s(c.j.f18072e3) && (colorStateListC3 = d0VarT.c(c.j.f18072e3)) != null) {
                this.f43100a.setTextColor(colorStateListC3);
            }
            if (d0VarT.s(c.j.f18082g3) && (colorStateListC2 = d0VarT.c(c.j.f18082g3)) != null) {
                this.f43100a.setLinkTextColor(colorStateListC2);
            }
            if (d0VarT.s(c.j.f18077f3) && (colorStateListC = d0VarT.c(c.j.f18077f3)) != null) {
                this.f43100a.setHintTextColor(colorStateListC);
            }
        }
        if (d0VarT.s(c.j.f18056b3) && d0VarT.f(c.j.f18056b3, -1) == 0) {
            this.f43100a.setTextSize(0, 0.0f);
        }
        C(context, d0VarT);
        if (i10 >= 26 && d0VarT.s(c.j.f18102k3) && (strO = d0VarT.o(c.j.f18102k3)) != null) {
            f.d(this.f43100a, strO);
        }
        d0VarT.w();
        Typeface typeface = this.f43111l;
        if (typeface != null) {
            this.f43100a.setTypeface(typeface, this.f43109j);
        }
    }

    public void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        S.c.f(editorInfo, textView.getText());
    }

    public void s(boolean z9) {
        this.f43100a.setAllCaps(z9);
    }

    public void t(int i9, int i10, int i11, int i12) {
        this.f43108i.p(i9, i10, i11, i12);
    }

    public void u(int[] iArr, int i9) {
        this.f43108i.q(iArr, i9);
    }

    public void v(int i9) {
        this.f43108i.r(i9);
    }

    public void w(ColorStateList colorStateList) {
        if (this.f43107h == null) {
            this.f43107h = new b0();
        }
        b0 b0Var = this.f43107h;
        b0Var.f43298a = colorStateList;
        b0Var.f43301d = colorStateList != null;
        z();
    }

    public void x(PorterDuff.Mode mode) {
        if (this.f43107h == null) {
            this.f43107h = new b0();
        }
        b0 b0Var = this.f43107h;
        b0Var.f43299b = mode;
        b0Var.f43300c = mode != null;
        z();
    }

    public final void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] drawableArrA = c.a(this.f43100a);
            TextView textView = this.f43100a;
            if (drawable5 == null) {
                drawable5 = drawableArrA[0];
            }
            if (drawable2 == null) {
                drawable2 = drawableArrA[1];
            }
            if (drawable6 == null) {
                drawable6 = drawableArrA[2];
            }
            if (drawable4 == null) {
                drawable4 = drawableArrA[3];
            }
            c.b(textView, drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] drawableArrA2 = c.a(this.f43100a);
        Drawable drawable7 = drawableArrA2[0];
        if (drawable7 != null || drawableArrA2[2] != null) {
            TextView textView2 = this.f43100a;
            if (drawable2 == null) {
                drawable2 = drawableArrA2[1];
            }
            Drawable drawable8 = drawableArrA2[2];
            if (drawable4 == null) {
                drawable4 = drawableArrA2[3];
            }
            c.b(textView2, drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f43100a.getCompoundDrawables();
        TextView textView3 = this.f43100a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public final void z() {
        b0 b0Var = this.f43107h;
        this.f43101b = b0Var;
        this.f43102c = b0Var;
        this.f43103d = b0Var;
        this.f43104e = b0Var;
        this.f43105f = b0Var;
        this.f43106g = b0Var;
    }
}
