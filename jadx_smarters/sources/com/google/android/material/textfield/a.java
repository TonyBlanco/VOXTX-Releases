package com.google.android.material.textfield;

import R4.j;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import o5.AbstractC2352d;

/* JADX INFO: loaded from: classes3.dex */
public class a extends AbstractC2352d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextWatcher f27685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View.OnFocusChangeListener f27686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextInputLayout.f f27687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextInputLayout.g f27688h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AnimatorSet f27689i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ValueAnimator f27690j;

    /* JADX INFO: renamed from: com.google.android.material.textfield.a$a, reason: collision with other inner class name */
    public class C0263a implements TextWatcher {
        public C0263a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (a.this.f46082a.getSuffixText() != null) {
                return;
            }
            a aVar = a.this;
            aVar.i(aVar.m());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        }
    }

    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            a aVar = a.this;
            aVar.i(aVar.m());
        }
    }

    public class c implements TextInputLayout.f {
        public c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(a.this.m());
            editText.setOnFocusChangeListener(a.this.f27686f);
            a aVar = a.this;
            aVar.f46084c.setOnFocusChangeListener(aVar.f27686f);
            editText.removeTextChangedListener(a.this.f27685e);
            editText.addTextChangedListener(a.this.f27685e);
        }
    }

    public class d implements TextInputLayout.g {

        /* JADX INFO: renamed from: com.google.android.material.textfield.a$d$a, reason: collision with other inner class name */
        public class RunnableC0264a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ EditText f27695a;

            public RunnableC0264a(EditText editText) {
                this.f27695a = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f27695a.removeTextChangedListener(a.this.f27685e);
                a.this.i(true);
            }
        }

        public d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i9) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i9 != 2) {
                return;
            }
            editText.post(new RunnableC0264a(editText));
            if (editText.getOnFocusChangeListener() == a.this.f27686f) {
                editText.setOnFocusChangeListener(null);
            }
            if (a.this.f46084c.getOnFocusChangeListener() == a.this.f27686f) {
                a.this.f46084c.setOnFocusChangeListener(null);
            }
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = a.this.f46082a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            a.this.f46082a.U();
        }
    }

    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f46082a.setEndIconVisible(true);
        }
    }

    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f46082a.setEndIconVisible(false);
        }
    }

    public class h implements ValueAnimator.AnimatorUpdateListener {
        public h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.f46084c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public class i implements ValueAnimator.AnimatorUpdateListener {
        public i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f46084c.setScaleX(fFloatValue);
            a.this.f46084c.setScaleY(fFloatValue);
        }
    }

    public a(TextInputLayout textInputLayout, int i9) {
        super(textInputLayout, i9);
        this.f27685e = new C0263a();
        this.f27686f = new b();
        this.f27687g = new c();
        this.f27688h = new d();
    }

    @Override // o5.AbstractC2352d
    public void a() {
        TextInputLayout textInputLayout = this.f46082a;
        int i9 = this.f46085d;
        if (i9 == 0) {
            i9 = R4.e.f8759f;
        }
        textInputLayout.setEndIconDrawable(i9);
        TextInputLayout textInputLayout2 = this.f46082a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(j.f8831e));
        this.f46082a.setEndIconCheckable(false);
        this.f46082a.setEndIconOnClickListener(new e());
        this.f46082a.g(this.f27687g);
        this.f46082a.h(this.f27688h);
        l();
    }

    @Override // o5.AbstractC2352d
    public void c(boolean z9) {
        if (this.f46082a.getSuffixText() == null) {
            return;
        }
        i(z9);
    }

    public final void i(boolean z9) {
        boolean z10 = this.f46082a.K() == z9;
        if (z9 && !this.f27689i.isRunning()) {
            this.f27690j.cancel();
            this.f27689i.start();
            if (z10) {
                this.f27689i.end();
                return;
            }
            return;
        }
        if (z9) {
            return;
        }
        this.f27689i.cancel();
        this.f27690j.start();
        if (z10) {
            this.f27690j.end();
        }
    }

    public final ValueAnimator j(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(S4.a.f9409a);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.addUpdateListener(new h());
        return valueAnimatorOfFloat;
    }

    public final ValueAnimator k() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(S4.a.f9412d);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new i());
        return valueAnimatorOfFloat;
    }

    public final void l() {
        ValueAnimator valueAnimatorK = k();
        ValueAnimator valueAnimatorJ = j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f27689i = animatorSet;
        animatorSet.playTogether(valueAnimatorK, valueAnimatorJ);
        this.f27689i.addListener(new f());
        ValueAnimator valueAnimatorJ2 = j(1.0f, 0.0f);
        this.f27690j = valueAnimatorJ2;
        valueAnimatorJ2.addListener(new g());
    }

    public final boolean m() {
        EditText editText = this.f46082a.getEditText();
        return editText != null && (editText.hasFocus() || this.f46084c.hasFocus()) && editText.getText().length() > 0;
    }
}
