package androidx.appcompat.widget;

import P.L;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.e;
import c.AbstractC1238a;
import c.h;
import c.j;
import e.AbstractC1726a;
import h.C1844a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import k.C2105A;
import k.C2117l;
import k.M;
import k.Z;
import k.d0;
import k.m0;
import org.apache.http.message.TokenParser;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final Property f14062T = new a(Float.class, "thumbPos");

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final int[] f14063U = {R.attr.state_checked};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f14064A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f14065B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f14066C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f14067D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f14068E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f14069F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f14070G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f14071H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f14072I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final TextPaint f14073J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public ColorStateList f14074K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Layout f14075L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public Layout f14076M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public TransformationMethod f14077N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public ObjectAnimator f14078O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final C2105A f14079P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public C2117l f14080Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public c f14081R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final Rect f14082S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f14083a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f14084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f14085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f14088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f14089h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f14090i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f14091j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14092k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14093l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14094m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14095n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f14096o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f14097p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f14098q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f14099r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f14100s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f14101t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14102u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14103v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f14104w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f14105x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public VelocityTracker f14106y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f14107z;

    public class a extends Property {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f14064A);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f9) {
            switchCompat.setThumbPosition(f9.floatValue());
        }
    }

    public static class b {
        public static void a(ObjectAnimator objectAnimator, boolean z9) {
            objectAnimator.setAutoCancel(z9);
        }
    }

    public static class c extends e.AbstractC0170e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Reference f14108a;

        public c(SwitchCompat switchCompat) {
            this.f14108a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.e.AbstractC0170e
        public void a(Throwable th) {
            SwitchCompat switchCompat = (SwitchCompat) this.f14108a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }

        @Override // androidx.emoji2.text.e.AbstractC0170e
        public void b() {
            SwitchCompat switchCompat = (SwitchCompat) this.f14108a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1238a.f17738O);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f14084c = null;
        this.f14085d = null;
        this.f14086e = false;
        this.f14087f = false;
        this.f14089h = null;
        this.f14090i = null;
        this.f14091j = false;
        this.f14092k = false;
        this.f14106y = VelocityTracker.obtain();
        this.f14072I = true;
        this.f14082S = new Rect();
        Z.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f14073J = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        d0 d0VarV = d0.v(context, attributeSet, j.f17974L2, i9, 0);
        L.q0(this, context, j.f17974L2, attributeSet, d0VarV.r(), i9, 0);
        Drawable drawableG = d0VarV.g(j.f17989O2);
        this.f14083a = drawableG;
        if (drawableG != null) {
            drawableG.setCallback(this);
        }
        Drawable drawableG2 = d0VarV.g(j.f18034X2);
        this.f14088g = drawableG2;
        if (drawableG2 != null) {
            drawableG2.setCallback(this);
        }
        setTextOnInternal(d0VarV.p(j.f17979M2));
        setTextOffInternal(d0VarV.p(j.f17984N2));
        this.f14101t = d0VarV.a(j.f17994P2, true);
        this.f14093l = d0VarV.f(j.f18019U2, 0);
        this.f14094m = d0VarV.f(j.f18004R2, 0);
        this.f14095n = d0VarV.f(j.f18009S2, 0);
        this.f14096o = d0VarV.a(j.f17999Q2, false);
        ColorStateList colorStateListC = d0VarV.c(j.f18024V2);
        if (colorStateListC != null) {
            this.f14084c = colorStateListC;
            this.f14086e = true;
        }
        PorterDuff.Mode modeE = M.e(d0VarV.k(j.f18029W2, -1), null);
        if (this.f14085d != modeE) {
            this.f14085d = modeE;
            this.f14087f = true;
        }
        if (this.f14086e || this.f14087f) {
            b();
        }
        ColorStateList colorStateListC2 = d0VarV.c(j.f18039Y2);
        if (colorStateListC2 != null) {
            this.f14089h = colorStateListC2;
            this.f14091j = true;
        }
        PorterDuff.Mode modeE2 = M.e(d0VarV.k(j.f18044Z2, -1), null);
        if (this.f14090i != modeE2) {
            this.f14090i = modeE2;
            this.f14092k = true;
        }
        if (this.f14091j || this.f14092k) {
            c();
        }
        int iN = d0VarV.n(j.f18014T2, 0);
        if (iN != 0) {
            m(context, iN);
        }
        C2105A c2105a = new C2105A(this);
        this.f14079P = c2105a;
        c2105a.m(attributeSet, i9);
        d0VarV.w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f14103v = viewConfiguration.getScaledTouchSlop();
        this.f14107z = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i9);
        refreshDrawableState();
        setChecked(isChecked());
    }

    public static float f(float f9, float f10, float f11) {
        return f9 < f10 ? f10 : f9 > f11 ? f11 : f9;
    }

    private C2117l getEmojiTextViewHelper() {
        if (this.f14080Q == null) {
            this.f14080Q = new C2117l(this);
        }
        return this.f14080Q;
    }

    private boolean getTargetCheckedState() {
        return this.f14064A > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((m0.b(this) ? 1.0f - this.f14064A : this.f14064A) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f14088g;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f14082S;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f14083a;
        Rect rectD = drawable2 != null ? M.d(drawable2) : M.f43140c;
        return ((((this.f14065B - this.f14067D) - rect.left) - rect.right) - rectD.left) - rectD.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f14099r = charSequence;
        this.f14100s = g(charSequence);
        this.f14076M = null;
        if (this.f14101t) {
            p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f14097p = charSequence;
        this.f14098q = g(charSequence);
        this.f14075L = null;
        if (this.f14101t) {
            p();
        }
    }

    public final void a(boolean z9) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) f14062T, z9 ? 1.0f : 0.0f);
        this.f14078O = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        b.a(this.f14078O, true);
        this.f14078O.start();
    }

    public final void b() {
        Drawable drawable = this.f14083a;
        if (drawable != null) {
            if (this.f14086e || this.f14087f) {
                Drawable drawableMutate = H.a.r(drawable).mutate();
                this.f14083a = drawableMutate;
                if (this.f14086e) {
                    H.a.o(drawableMutate, this.f14084c);
                }
                if (this.f14087f) {
                    H.a.p(this.f14083a, this.f14085d);
                }
                if (this.f14083a.isStateful()) {
                    this.f14083a.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        Drawable drawable = this.f14088g;
        if (drawable != null) {
            if (this.f14091j || this.f14092k) {
                Drawable drawableMutate = H.a.r(drawable).mutate();
                this.f14088g = drawableMutate;
                if (this.f14091j) {
                    H.a.o(drawableMutate, this.f14089h);
                }
                if (this.f14092k) {
                    H.a.p(this.f14088g, this.f14090i);
                }
                if (this.f14088g.isStateful()) {
                    this.f14088g.setState(getDrawableState());
                }
            }
        }
    }

    public final void d() {
        ObjectAnimator objectAnimator = this.f14078O;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i9;
        int i10;
        Rect rect = this.f14082S;
        int i11 = this.f14068E;
        int i12 = this.f14069F;
        int i13 = this.f14070G;
        int i14 = this.f14071H;
        int thumbOffset = getThumbOffset() + i11;
        Drawable drawable = this.f14083a;
        Rect rectD = drawable != null ? M.d(drawable) : M.f43140c;
        Drawable drawable2 = this.f14088g;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i15 = rect.left;
            thumbOffset += i15;
            if (rectD != null) {
                int i16 = rectD.left;
                if (i16 > i15) {
                    i11 += i16 - i15;
                }
                int i17 = rectD.top;
                int i18 = rect.top;
                i9 = i17 > i18 ? (i17 - i18) + i12 : i12;
                int i19 = rectD.right;
                int i20 = rect.right;
                if (i19 > i20) {
                    i13 -= i19 - i20;
                }
                int i21 = rectD.bottom;
                int i22 = rect.bottom;
                if (i21 > i22) {
                    i10 = i14 - (i21 - i22);
                }
                this.f14088g.setBounds(i11, i9, i13, i10);
            } else {
                i9 = i12;
            }
            i10 = i14;
            this.f14088g.setBounds(i11, i9, i13, i10);
        }
        Drawable drawable3 = this.f14083a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i23 = thumbOffset - rect.left;
            int i24 = thumbOffset + this.f14067D + rect.right;
            this.f14083a.setBounds(i23, i12, i24, i14);
            Drawable background = getBackground();
            if (background != null) {
                H.a.l(background, i23, i12, i24, i14);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f9, float f10) {
        super.drawableHotspotChanged(f9, f10);
        Drawable drawable = this.f14083a;
        if (drawable != null) {
            H.a.k(drawable, f9, f10);
        }
        Drawable drawable2 = this.f14088g;
        if (drawable2 != null) {
            H.a.k(drawable2, f9, f10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f14083a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f14088g;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final CharSequence g(CharSequence charSequence) {
        TransformationMethod transformationMethodF = getEmojiTextViewHelper().f(this.f14077N);
        return transformationMethodF != null ? transformationMethodF.getTransformation(charSequence, this) : charSequence;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!m0.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f14065B;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f14095n : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (m0.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f14065B;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f14095n : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return T.j.q(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f14101t;
    }

    public boolean getSplitTrack() {
        return this.f14096o;
    }

    public int getSwitchMinWidth() {
        return this.f14094m;
    }

    public int getSwitchPadding() {
        return this.f14095n;
    }

    public CharSequence getTextOff() {
        return this.f14099r;
    }

    public CharSequence getTextOn() {
        return this.f14097p;
    }

    public Drawable getThumbDrawable() {
        return this.f14083a;
    }

    public final float getThumbPosition() {
        return this.f14064A;
    }

    public int getThumbTextPadding() {
        return this.f14093l;
    }

    public ColorStateList getThumbTintList() {
        return this.f14084c;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f14085d;
    }

    public Drawable getTrackDrawable() {
        return this.f14088g;
    }

    public ColorStateList getTrackTintList() {
        return this.f14089h;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f14090i;
    }

    public final boolean h(float f9, float f10) {
        if (this.f14083a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f14083a.getPadding(this.f14082S);
        int i9 = this.f14069F;
        int i10 = this.f14103v;
        int i11 = i9 - i10;
        int i12 = (this.f14068E + thumbOffset) - i10;
        int i13 = this.f14067D + i12;
        Rect rect = this.f14082S;
        return f9 > ((float) i12) && f9 < ((float) (((i13 + rect.left) + rect.right) + i10)) && f10 > ((float) i11) && f10 < ((float) (this.f14071H + i10));
    }

    public final Layout i(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.f14073J, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public void j() {
        setTextOnInternal(this.f14097p);
        setTextOffInternal(this.f14099r);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f14083a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f14088g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f14078O;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f14078O.end();
        this.f14078O = null;
    }

    public final void k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f14099r;
            if (string == null) {
                string = getResources().getString(h.f17898b);
            }
            L.J0(this, string);
        }
    }

    public final void l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f14097p;
            if (string == null) {
                string = getResources().getString(h.f17899c);
            }
            L.J0(this, string);
        }
    }

    public void m(Context context, int i9) {
        d0 d0VarT = d0.t(context, i9, j.f18050a3);
        ColorStateList colorStateListC = d0VarT.c(j.f18072e3);
        if (colorStateListC == null) {
            colorStateListC = getTextColors();
        }
        this.f14074K = colorStateListC;
        int iF = d0VarT.f(j.f18056b3, 0);
        if (iF != 0) {
            float f9 = iF;
            if (f9 != this.f14073J.getTextSize()) {
                this.f14073J.setTextSize(f9);
                requestLayout();
            }
        }
        o(d0VarT.k(j.f18062c3, -1), d0VarT.k(j.f18067d3, -1));
        this.f14077N = d0VarT.a(j.f18107l3, false) ? new C1844a(getContext()) : null;
        setTextOnInternal(this.f14097p);
        setTextOffInternal(this.f14099r);
        d0VarT.w();
    }

    public void n(Typeface typeface, int i9) {
        if (i9 <= 0) {
            this.f14073J.setFakeBoldText(false);
            this.f14073J.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i9) : Typeface.create(typeface, i9);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i10 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i9;
            this.f14073J.setFakeBoldText((i10 & 1) != 0);
            this.f14073J.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public final void o(int i9, int i10) {
        n(i9 != 1 ? i9 != 2 ? i9 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i10);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i9) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i9 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f14063U);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f14082S;
        Drawable drawable = this.f14088g;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i9 = this.f14069F;
        int i10 = this.f14071H;
        int i11 = i9 + rect.top;
        int i12 = i10 - rect.bottom;
        Drawable drawable2 = this.f14083a;
        if (drawable != null) {
            if (!this.f14096o || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectD = M.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectD.left;
                rect.right -= rectD.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f14075L : this.f14076M;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f14074K;
            if (colorStateList != null) {
                this.f14073J.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f14073J.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i11 + i12) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f14097p : this.f14099r;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(TokenParser.SP);
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        int iMax;
        int width;
        int paddingLeft;
        int i13;
        int paddingTop;
        int height;
        super.onLayout(z9, i9, i10, i11, i12);
        int iMax2 = 0;
        if (this.f14083a != null) {
            Rect rect = this.f14082S;
            Drawable drawable = this.f14088g;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectD = M.d(this.f14083a);
            iMax = Math.max(0, rectD.left - rect.left);
            iMax2 = Math.max(0, rectD.right - rect.right);
        } else {
            iMax = 0;
        }
        if (m0.b(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f14065B + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f14065B) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i13 = this.f14066C;
            paddingTop = paddingTop2 - (i13 / 2);
        } else {
            if (gravity == 80) {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.f14066C;
                this.f14068E = paddingLeft;
                this.f14069F = paddingTop;
                this.f14071H = height;
                this.f14070G = width;
            }
            paddingTop = getPaddingTop();
            i13 = this.f14066C;
        }
        height = i13 + paddingTop;
        this.f14068E = paddingLeft;
        this.f14069F = paddingTop;
        this.f14071H = height;
        this.f14070G = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i9, int i10) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.f14101t) {
            if (this.f14075L == null) {
                this.f14075L = i(this.f14098q);
            }
            if (this.f14076M == null) {
                this.f14076M = i(this.f14100s);
            }
        }
        Rect rect = this.f14082S;
        Drawable drawable = this.f14083a;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f14083a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f14083a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.f14067D = Math.max(this.f14101t ? Math.max(this.f14075L.getWidth(), this.f14076M.getWidth()) + (this.f14093l * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.f14088g;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f14088g.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f14083a;
        if (drawable3 != null) {
            Rect rectD = M.d(drawable3);
            iMax = Math.max(iMax, rectD.left);
            iMax2 = Math.max(iMax2, rectD.right);
        }
        int iMax3 = this.f14072I ? Math.max(this.f14094m, (this.f14067D * 2) + iMax + iMax2) : this.f14094m;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f14065B = iMax3;
        this.f14066C = iMax4;
        super.onMeasure(i9, i10);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f14097p : this.f14099r;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f14106y
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9f
            r2 = 2
            if (r0 == r1) goto L8b
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L8b
            goto Lb9
        L16:
            int r0 = r6.f14102u
            if (r0 == r1) goto L57
            if (r0 == r2) goto L1e
            goto Lb9
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f14104w
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3d
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L39
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L3d
        L39:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L3d:
            boolean r0 = k.m0.b(r6)
            if (r0 == 0) goto L44
            float r2 = -r2
        L44:
            float r0 = r6.f14064A
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.f14064A
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L56
            r6.f14104w = r7
            r6.setThumbPosition(r0)
        L56:
            return r1
        L57:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f14104w
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f14103v
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7d
            float r4 = r6.f14105x
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f14103v
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb9
        L7d:
            r6.f14102u = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f14104w = r0
            r6.f14105x = r3
            return r1
        L8b:
            int r0 = r6.f14102u
            if (r0 != r2) goto L96
            r6.q(r7)
            super.onTouchEvent(r7)
            return r1
        L96:
            r0 = 0
            r6.f14102u = r0
            android.view.VelocityTracker r0 = r6.f14106y
            r0.clear()
            goto Lb9
        L9f:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb9
            boolean r3 = r6.h(r0, r2)
            if (r3 == 0) goto Lb9
            r6.f14102u = r1
            r6.f14104w = r0
            r6.f14105x = r2
        Lb9:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (this.f14081R == null && this.f14080Q.b() && e.h()) {
            e eVarB = e.b();
            int iD = eVarB.d();
            if (iD == 3 || iD == 0) {
                c cVar = new c(this);
                this.f14081R = cVar;
                eVarB.s(cVar);
            }
        }
    }

    public final void q(MotionEvent motionEvent) {
        this.f14102u = 0;
        boolean targetCheckedState = true;
        boolean z9 = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z9) {
            this.f14106y.computeCurrentVelocity(1000);
            float xVelocity = this.f14106y.getXVelocity();
            if (Math.abs(xVelocity) <= this.f14107z) {
                targetCheckedState = getTargetCheckedState();
            } else if (!m0.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                targetCheckedState = false;
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        e(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().d(z9);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z9) {
        super.setChecked(z9);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            l();
        } else {
            k();
        }
        if (getWindowToken() != null && L.W(this)) {
            a(zIsChecked);
        } else {
            d();
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(T.j.r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().e(z9);
        setTextOnInternal(this.f14097p);
        setTextOffInternal(this.f14099r);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z9) {
        this.f14072I = z9;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z9) {
        if (this.f14101t != z9) {
            this.f14101t = z9;
            requestLayout();
            if (z9) {
                p();
            }
        }
    }

    public void setSplitTrack(boolean z9) {
        this.f14096o = z9;
        invalidate();
    }

    public void setSwitchMinWidth(int i9) {
        this.f14094m = i9;
        requestLayout();
    }

    public void setSwitchPadding(int i9) {
        this.f14095n = i9;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f14073J.getTypeface() == null || this.f14073J.getTypeface().equals(typeface)) && (this.f14073J.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f14073J.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        k();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f14083a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f14083a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f9) {
        this.f14064A = f9;
        invalidate();
    }

    public void setThumbResource(int i9) {
        setThumbDrawable(AbstractC1726a.b(getContext(), i9));
    }

    public void setThumbTextPadding(int i9) {
        this.f14093l = i9;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f14084c = colorStateList;
        this.f14086e = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f14085d = mode;
        this.f14087f = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f14088g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f14088g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i9) {
        setTrackDrawable(AbstractC1726a.b(getContext(), i9));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f14089h = colorStateList;
        this.f14091j = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f14090i = mode;
        this.f14092k = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f14083a || drawable == this.f14088g;
    }
}
