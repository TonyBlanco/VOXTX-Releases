package com.google.android.material.textfield;

import P.L;
import Q.AbstractC1011c;
import Q.C;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import f5.t;
import l5.C2198g;
import o5.AbstractC2352d;

/* JADX INFO: loaded from: classes3.dex */
public class b extends AbstractC2352d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final boolean f27702t = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextWatcher f27703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View.OnFocusChangeListener f27704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextInputLayout.e f27705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextInputLayout.f f27706h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextInputLayout.g f27707i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f27708j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AbstractC1011c.b f27709k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f27710l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f27711m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f27712n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public StateListDrawable f27713o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C2198g f27714p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public AccessibilityManager f27715q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ValueAnimator f27716r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ValueAnimator f27717s;

    public class a extends t {

        /* JADX INFO: renamed from: com.google.android.material.textfield.b$a$a, reason: collision with other inner class name */
        public class RunnableC0265a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AutoCompleteTextView f27719a;

            public RunnableC0265a(AutoCompleteTextView autoCompleteTextView) {
                this.f27719a = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean zIsPopupShowing = this.f27719a.isPopupShowing();
                b.this.J(zIsPopupShowing);
                b.this.f27710l = zIsPopupShowing;
            }
        }

        public a() {
        }

        @Override // f5.t, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView autoCompleteTextViewC = b.C(b.this.f46082a.getEditText());
            if (b.this.f27715q.isTouchExplorationEnabled() && b.H(autoCompleteTextViewC) && !b.this.f46084c.hasFocus()) {
                autoCompleteTextViewC.dismissDropDown();
            }
            autoCompleteTextViewC.post(new RunnableC0265a(autoCompleteTextViewC));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.b$b, reason: collision with other inner class name */
    public class C0266b implements AutoCompleteTextView.OnDismissListener {
        public C0266b() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            b.this.N();
            b.this.J(false);
        }
    }

    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b bVar = b.this;
            bVar.f46084c.setChecked(bVar.f27711m);
            b.this.f27717s.start();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            b.this.f46084c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public class e implements View.OnFocusChangeListener {
        public e() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            b.this.f46082a.setEndIconActivated(z9);
            if (z9) {
                return;
            }
            b.this.J(false);
            b.this.f27710l = false;
        }
    }

    public class f extends TextInputLayout.e {
        public f(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, P.C0959a
        public void g(View view, C c9) {
            super.g(view, c9);
            if (!b.H(b.this.f46082a.getEditText())) {
                c9.X(Spinner.class.getName());
            }
            if (c9.J()) {
                c9.h0(null);
            }
        }

        @Override // P.C0959a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            AutoCompleteTextView autoCompleteTextViewC = b.C(b.this.f46082a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && b.this.f27715q.isEnabled() && !b.H(b.this.f46082a.getEditText())) {
                b.this.M(autoCompleteTextViewC);
                b.this.N();
            }
        }
    }

    public class g implements TextInputLayout.f {
        public g() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView autoCompleteTextViewC = b.C(textInputLayout.getEditText());
            b.this.K(autoCompleteTextViewC);
            b.this.y(autoCompleteTextViewC);
            b.this.L(autoCompleteTextViewC);
            autoCompleteTextViewC.setThreshold(0);
            autoCompleteTextViewC.removeTextChangedListener(b.this.f27703e);
            autoCompleteTextViewC.addTextChangedListener(b.this.f27703e);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!b.H(autoCompleteTextViewC) && b.this.f27715q.isTouchExplorationEnabled()) {
                L.C0(b.this.f46084c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(b.this.f27705g);
            textInputLayout.setEndIconVisible(true);
        }
    }

    public class h implements TextInputLayout.g {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AutoCompleteTextView f27728a;

            public a(AutoCompleteTextView autoCompleteTextView) {
                this.f27728a = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f27728a.removeTextChangedListener(b.this.f27703e);
            }
        }

        public h() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i9) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i9 == 3) {
                autoCompleteTextView.post(new a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == b.this.f27704f) {
                    autoCompleteTextView.setOnFocusChangeListener(null);
                }
                autoCompleteTextView.setOnTouchListener(null);
                if (b.f27702t) {
                    autoCompleteTextView.setOnDismissListener(null);
                }
            }
            if (i9 == 3) {
                textInputLayout.removeOnAttachStateChangeListener(b.this.f27708j);
                b.this.I();
            }
        }
    }

    public class i implements View.OnAttachStateChangeListener {
        public i() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b.this.B();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            b.this.I();
        }
    }

    public class j implements AbstractC1011c.b {
        public j() {
        }

        @Override // Q.AbstractC1011c.b
        public void onTouchExplorationStateChanged(boolean z9) {
            AutoCompleteTextView autoCompleteTextView;
            TextInputLayout textInputLayout = b.this.f46082a;
            if (textInputLayout == null || (autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText()) == null || b.H(autoCompleteTextView)) {
                return;
            }
            L.C0(b.this.f46084c, z9 ? 2 : 1);
        }
    }

    public class k implements View.OnClickListener {
        public k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.M((AutoCompleteTextView) b.this.f46082a.getEditText());
        }
    }

    public class l implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AutoCompleteTextView f27733a;

        public l(AutoCompleteTextView autoCompleteTextView) {
            this.f27733a = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (b.this.G()) {
                    b.this.f27710l = false;
                }
                b.this.M(this.f27733a);
                b.this.N();
            }
            return false;
        }
    }

    public b(TextInputLayout textInputLayout, int i9) {
        super(textInputLayout, i9);
        this.f27703e = new a();
        this.f27704f = new e();
        this.f27705g = new f(this.f46082a);
        this.f27706h = new g();
        this.f27707i = new h();
        this.f27708j = new i();
        this.f27709k = new j();
        this.f27710l = false;
        this.f27711m = false;
        this.f27712n = Long.MAX_VALUE;
    }

    public static AutoCompleteTextView C(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private void F() {
        this.f27717s = D(67, 0.0f, 1.0f);
        ValueAnimator valueAnimatorD = D(50, 1.0f, 0.0f);
        this.f27716r = valueAnimatorD;
        valueAnimatorD.addListener(new c());
    }

    public static boolean H(EditText editText) {
        return editText.getKeyListener() != null;
    }

    public final void A(AutoCompleteTextView autoCompleteTextView, int i9, int[][] iArr, C2198g c2198g) {
        LayerDrawable layerDrawable;
        int iD = Z4.a.d(autoCompleteTextView, R4.b.f8678m);
        C2198g c2198g2 = new C2198g(c2198g.C());
        int iH = Z4.a.h(i9, iD, 0.1f);
        c2198g2.W(new ColorStateList(iArr, new int[]{iH, 0}));
        if (f27702t) {
            c2198g2.setTint(iD);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iH, iD});
            C2198g c2198g3 = new C2198g(c2198g.C());
            c2198g3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c2198g2, c2198g3), c2198g});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{c2198g2, c2198g});
        }
        L.w0(autoCompleteTextView, layerDrawable);
    }

    public final void B() {
        TextInputLayout textInputLayout;
        if (this.f27715q == null || (textInputLayout = this.f46082a) == null || !L.V(textInputLayout)) {
            return;
        }
        AbstractC1011c.a(this.f27715q, this.f27709k);
    }

    public final ValueAnimator D(int i9, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(S4.a.f9409a);
        valueAnimatorOfFloat.setDuration(i9);
        valueAnimatorOfFloat.addUpdateListener(new d());
        return valueAnimatorOfFloat;
    }

    public final C2198g E(float f9, float f10, float f11, int i9) {
        l5.k kVarM = l5.k.a().A(f9).E(f9).s(f10).w(f10).m();
        C2198g c2198gM = C2198g.m(this.f46083b, f11);
        c2198gM.setShapeAppearanceModel(kVarM);
        c2198gM.Y(0, i9, 0, i9);
        return c2198gM;
    }

    public final boolean G() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f27712n;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    public final void I() {
        AccessibilityManager accessibilityManager = this.f27715q;
        if (accessibilityManager != null) {
            AbstractC1011c.b(accessibilityManager, this.f27709k);
        }
    }

    public final void J(boolean z9) {
        if (this.f27711m != z9) {
            this.f27711m = z9;
            this.f27717s.cancel();
            this.f27716r.start();
        }
    }

    public final void K(AutoCompleteTextView autoCompleteTextView) {
        Drawable drawable;
        if (f27702t) {
            int boxBackgroundMode = this.f46082a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                drawable = this.f27714p;
            } else if (boxBackgroundMode != 1) {
                return;
            } else {
                drawable = this.f27713o;
            }
            autoCompleteTextView.setDropDownBackgroundDrawable(drawable);
        }
    }

    public final void L(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new l(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f27704f);
        if (f27702t) {
            autoCompleteTextView.setOnDismissListener(new C0266b());
        }
    }

    public final void M(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (G()) {
            this.f27710l = false;
        }
        if (this.f27710l) {
            this.f27710l = false;
            return;
        }
        if (f27702t) {
            J(!this.f27711m);
        } else {
            this.f27711m = !this.f27711m;
            this.f46084c.toggle();
        }
        if (!this.f27711m) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }

    public final void N() {
        this.f27710l = true;
        this.f27712n = System.currentTimeMillis();
    }

    public void O(AutoCompleteTextView autoCompleteTextView) {
        if (!H(autoCompleteTextView) && this.f46082a.getBoxBackgroundMode() == 2 && (autoCompleteTextView.getBackground() instanceof LayerDrawable)) {
            y(autoCompleteTextView);
        }
    }

    @Override // o5.AbstractC2352d
    public void a() {
        float dimensionPixelOffset = this.f46083b.getResources().getDimensionPixelOffset(R4.d.f8722U);
        float dimensionPixelOffset2 = this.f46083b.getResources().getDimensionPixelOffset(R4.d.f8718Q);
        int dimensionPixelOffset3 = this.f46083b.getResources().getDimensionPixelOffset(R4.d.f8719R);
        C2198g c2198gE = E(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C2198g c2198gE2 = E(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f27714p = c2198gE;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f27713o = stateListDrawable;
        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, c2198gE);
        this.f27713o.addState(new int[0], c2198gE2);
        int i9 = this.f46085d;
        if (i9 == 0) {
            i9 = f27702t ? R4.e.f8757d : R4.e.f8758e;
        }
        this.f46082a.setEndIconDrawable(i9);
        TextInputLayout textInputLayout = this.f46082a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R4.j.f8833g));
        this.f46082a.setEndIconOnClickListener(new k());
        this.f46082a.g(this.f27706h);
        this.f46082a.h(this.f27707i);
        F();
        this.f27715q = (AccessibilityManager) this.f46083b.getSystemService("accessibility");
        this.f46082a.addOnAttachStateChangeListener(this.f27708j);
        B();
    }

    @Override // o5.AbstractC2352d
    public boolean b(int i9) {
        return i9 != 0;
    }

    @Override // o5.AbstractC2352d
    public boolean d() {
        return true;
    }

    public final void y(AutoCompleteTextView autoCompleteTextView) {
        if (H(autoCompleteTextView)) {
            return;
        }
        int boxBackgroundMode = this.f46082a.getBoxBackgroundMode();
        C2198g boxBackground = this.f46082a.getBoxBackground();
        int iD = Z4.a.d(autoCompleteTextView, R4.b.f8674i);
        int[][] iArr = {new int[]{R.attr.state_pressed}, new int[0]};
        if (boxBackgroundMode == 2) {
            A(autoCompleteTextView, iD, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            z(autoCompleteTextView, iD, iArr, boxBackground);
        }
    }

    public final void z(AutoCompleteTextView autoCompleteTextView, int i9, int[][] iArr, C2198g c2198g) {
        int boxBackgroundColor = this.f46082a.getBoxBackgroundColor();
        int[] iArr2 = {Z4.a.h(i9, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f27702t) {
            L.w0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), c2198g, c2198g));
            return;
        }
        C2198g c2198g2 = new C2198g(c2198g.C());
        c2198g2.W(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c2198g, c2198g2});
        int iJ = L.J(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int I9 = L.I(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        L.w0(autoCompleteTextView, layerDrawable);
        L.F0(autoCompleteTextView, iJ, paddingTop, I9, paddingBottom);
    }
}
