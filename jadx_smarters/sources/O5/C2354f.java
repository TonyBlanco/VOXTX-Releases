package o5;

import P.L;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;
import i5.AbstractC1893c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2354f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextInputLayout f46087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinearLayout f46088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FrameLayout f46090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Animator f46091f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f46092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f46093h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f46094i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f46095j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f46096k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f46097l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f46098m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f46099n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ColorStateList f46100o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f46101p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f46102q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f46103r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f46104s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ColorStateList f46105t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Typeface f46106u;

    /* JADX INFO: renamed from: o5.f$a */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f46107a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f46108c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f46109d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ TextView f46110e;

        public a(int i9, TextView textView, int i10, TextView textView2) {
            this.f46107a = i9;
            this.f46108c = textView;
            this.f46109d = i10;
            this.f46110e = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C2354f.this.f46093h = this.f46107a;
            C2354f.this.f46091f = null;
            TextView textView = this.f46108c;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f46109d == 1 && C2354f.this.f46097l != null) {
                    C2354f.this.f46097l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f46110e;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f46110e.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f46110e;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: o5.f$b */
    public class b extends View.AccessibilityDelegate {
        public b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = C2354f.this.f46087b.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public C2354f(TextInputLayout textInputLayout) {
        this.f46086a = textInputLayout.getContext();
        this.f46087b = textInputLayout;
        this.f46092g = r0.getResources().getDimensionPixelSize(R4.d.f8737j);
    }

    public boolean A() {
        return this.f46102q;
    }

    public void B(TextView textView, int i9) {
        ViewGroup viewGroup;
        if (this.f46088c == null) {
            return;
        }
        if (!y(i9) || (viewGroup = this.f46090e) == null) {
            viewGroup = this.f46088c;
        }
        viewGroup.removeView(textView);
        int i10 = this.f46089d - 1;
        this.f46089d = i10;
        M(this.f46088c, i10);
    }

    public final void C(int i9, int i10) {
        TextView textViewM;
        TextView textViewM2;
        if (i9 == i10) {
            return;
        }
        if (i10 != 0 && (textViewM2 = m(i10)) != null) {
            textViewM2.setVisibility(0);
            textViewM2.setAlpha(1.0f);
        }
        if (i9 != 0 && (textViewM = m(i9)) != null) {
            textViewM.setVisibility(4);
            if (i9 == 1) {
                textViewM.setText((CharSequence) null);
            }
        }
        this.f46093h = i10;
    }

    public void D(CharSequence charSequence) {
        this.f46098m = charSequence;
        TextView textView = this.f46097l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void E(boolean z9) {
        if (this.f46096k == z9) {
            return;
        }
        h();
        if (z9) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f46086a);
            this.f46097l = appCompatTextView;
            appCompatTextView.setId(R4.f.f8772L);
            this.f46097l.setTextAlignment(5);
            Typeface typeface = this.f46106u;
            if (typeface != null) {
                this.f46097l.setTypeface(typeface);
            }
            F(this.f46099n);
            G(this.f46100o);
            D(this.f46098m);
            this.f46097l.setVisibility(4);
            L.u0(this.f46097l, 1);
            e(this.f46097l, 0);
        } else {
            v();
            B(this.f46097l, 0);
            this.f46097l = null;
            this.f46087b.r0();
            this.f46087b.E0();
        }
        this.f46096k = z9;
    }

    public void F(int i9) {
        this.f46099n = i9;
        TextView textView = this.f46097l;
        if (textView != null) {
            this.f46087b.d0(textView, i9);
        }
    }

    public void G(ColorStateList colorStateList) {
        this.f46100o = colorStateList;
        TextView textView = this.f46097l;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void H(int i9) {
        this.f46104s = i9;
        TextView textView = this.f46103r;
        if (textView != null) {
            T.j.o(textView, i9);
        }
    }

    public void I(boolean z9) {
        if (this.f46102q == z9) {
            return;
        }
        h();
        if (z9) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f46086a);
            this.f46103r = appCompatTextView;
            appCompatTextView.setId(R4.f.f8773M);
            this.f46103r.setTextAlignment(5);
            Typeface typeface = this.f46106u;
            if (typeface != null) {
                this.f46103r.setTypeface(typeface);
            }
            this.f46103r.setVisibility(4);
            L.u0(this.f46103r, 1);
            H(this.f46104s);
            J(this.f46105t);
            e(this.f46103r, 1);
            this.f46103r.setAccessibilityDelegate(new b());
        } else {
            w();
            B(this.f46103r, 1);
            this.f46103r = null;
            this.f46087b.r0();
            this.f46087b.E0();
        }
        this.f46102q = z9;
    }

    public void J(ColorStateList colorStateList) {
        this.f46105t = colorStateList;
        TextView textView = this.f46103r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public final void K(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    public void L(Typeface typeface) {
        if (typeface != this.f46106u) {
            this.f46106u = typeface;
            K(this.f46097l, typeface);
            K(this.f46103r, typeface);
        }
    }

    public final void M(ViewGroup viewGroup, int i9) {
        if (i9 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    public final boolean N(TextView textView, CharSequence charSequence) {
        return L.W(this.f46087b) && this.f46087b.isEnabled() && !(this.f46094i == this.f46093h && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    public void O(CharSequence charSequence) {
        h();
        this.f46095j = charSequence;
        this.f46097l.setText(charSequence);
        int i9 = this.f46093h;
        if (i9 != 1) {
            this.f46094i = 1;
        }
        Q(i9, this.f46094i, N(this.f46097l, charSequence));
    }

    public void P(CharSequence charSequence) {
        h();
        this.f46101p = charSequence;
        this.f46103r.setText(charSequence);
        int i9 = this.f46093h;
        if (i9 != 2) {
            this.f46094i = 2;
        }
        Q(i9, this.f46094i, N(this.f46103r, charSequence));
    }

    public final void Q(int i9, int i10, boolean z9) {
        if (i9 == i10) {
            return;
        }
        if (z9) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f46091f = animatorSet;
            ArrayList arrayList = new ArrayList();
            i(arrayList, this.f46102q, this.f46103r, 2, i9, i10);
            i(arrayList, this.f46096k, this.f46097l, 1, i9, i10);
            S4.b.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i10, m(i9), i9, m(i10)));
            animatorSet.start();
        } else {
            C(i9, i10);
        }
        this.f46087b.r0();
        this.f46087b.w0(z9);
        this.f46087b.E0();
    }

    public void e(TextView textView, int i9) {
        if (this.f46088c == null && this.f46090e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f46086a);
            this.f46088c = linearLayout;
            linearLayout.setOrientation(0);
            this.f46087b.addView(this.f46088c, -1, -2);
            this.f46090e = new FrameLayout(this.f46086a);
            this.f46088c.addView(this.f46090e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f46087b.getEditText() != null) {
                f();
            }
        }
        if (y(i9)) {
            this.f46090e.setVisibility(0);
            this.f46090e.addView(textView);
        } else {
            this.f46088c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f46088c.setVisibility(0);
        this.f46089d++;
    }

    public void f() {
        if (g()) {
            EditText editText = this.f46087b.getEditText();
            boolean zG = AbstractC1893c.g(this.f46086a);
            L.F0(this.f46088c, u(zG, R4.d.f8749v, L.J(editText)), u(zG, R4.d.f8750w, this.f46086a.getResources().getDimensionPixelSize(R4.d.f8748u)), u(zG, R4.d.f8749v, L.I(editText)), 0);
        }
    }

    public final boolean g() {
        return (this.f46088c == null || this.f46087b.getEditText() == null) ? false : true;
    }

    public void h() {
        Animator animator = this.f46091f;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void i(List list, boolean z9, TextView textView, int i9, int i10, int i11) {
        if (textView == null || !z9) {
            return;
        }
        if (i9 == i11 || i9 == i10) {
            list.add(j(textView, i11 == i9));
            if (i11 == i9) {
                list.add(k(textView));
            }
        }
    }

    public final ObjectAnimator j(TextView textView, boolean z9) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z9 ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(167L);
        objectAnimatorOfFloat.setInterpolator(S4.a.f9409a);
        return objectAnimatorOfFloat;
    }

    public final ObjectAnimator k(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f46092g, 0.0f);
        objectAnimatorOfFloat.setDuration(217L);
        objectAnimatorOfFloat.setInterpolator(S4.a.f9412d);
        return objectAnimatorOfFloat;
    }

    public boolean l() {
        return x(this.f46094i);
    }

    public final TextView m(int i9) {
        if (i9 == 1) {
            return this.f46097l;
        }
        if (i9 != 2) {
            return null;
        }
        return this.f46103r;
    }

    public CharSequence n() {
        return this.f46098m;
    }

    public CharSequence o() {
        return this.f46095j;
    }

    public int p() {
        TextView textView = this.f46097l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public ColorStateList q() {
        TextView textView = this.f46097l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    public CharSequence r() {
        return this.f46101p;
    }

    public View s() {
        return this.f46103r;
    }

    public int t() {
        TextView textView = this.f46103r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final int u(boolean z9, int i9, int i10) {
        return z9 ? this.f46086a.getResources().getDimensionPixelSize(i9) : i10;
    }

    public void v() {
        this.f46095j = null;
        h();
        if (this.f46093h == 1) {
            this.f46094i = (!this.f46102q || TextUtils.isEmpty(this.f46101p)) ? 0 : 2;
        }
        Q(this.f46093h, this.f46094i, N(this.f46097l, ""));
    }

    public void w() {
        h();
        int i9 = this.f46093h;
        if (i9 == 2) {
            this.f46094i = 0;
        }
        Q(i9, this.f46094i, N(this.f46103r, ""));
    }

    public final boolean x(int i9) {
        return (i9 != 1 || this.f46097l == null || TextUtils.isEmpty(this.f46095j)) ? false : true;
    }

    public boolean y(int i9) {
        return i9 == 0 || i9 == 1;
    }

    public boolean z() {
        return this.f46096k;
    }
}
