package androidx.appcompat.widget;

import G.f;
import N.m;
import T.j;
import T.m;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import d.AbstractC1617D;
import e.AbstractC1726a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import k.AbstractC2118m;
import k.C2105A;
import k.C2109d;
import k.C2117l;
import k.C2130z;
import k.Z;
import k.a0;
import k.m0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2109d f13966a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2105A f13967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2130z f13968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C2117l f13969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f13971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Future f13972h;

    public interface a {
        void a(int[] iArr, int i9);

        void b(int i9);

        int c();

        int d();

        int[] e();

        TextClassifier f();

        int g();

        void h(TextClassifier textClassifier);

        void i(int i9, int i10, int i11, int i12);

        void j(int i9);

        int k();

        void l(int i9);
    }

    public class b implements a {
        public b() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void a(int[] iArr, int i9) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i9);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void b(int i9) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int c() {
            return AppCompatTextView.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int d() {
            return AppCompatTextView.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int[] e() {
            return AppCompatTextView.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public TextClassifier f() {
            return AppCompatTextView.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int g() {
            return AppCompatTextView.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void h(TextClassifier textClassifier) {
            AppCompatTextView.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void i(int i9, int i10, int i11, int i12) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithConfiguration(i9, i10, i11, i12);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void j(int i9) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int k() {
            return AppCompatTextView.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void l(int i9) {
            AppCompatTextView.super.setAutoSizeTextTypeWithDefaults(i9);
        }
    }

    public class c extends b {
        public c() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public void b(int i9) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i9);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public void j(int i9) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i9);
        }
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i9) {
        super(a0.b(context), attributeSet, i9);
        this.f13970f = false;
        this.f13971g = null;
        Z.a(this, getContext());
        C2109d c2109d = new C2109d(this);
        this.f13966a = c2109d;
        c2109d.e(attributeSet, i9);
        C2105A c2105a = new C2105A(this);
        this.f13967c = c2105a;
        c2105a.m(attributeSet, i9);
        c2105a.b();
        this.f13968d = new C2130z(this);
        getEmojiTextViewHelper().c(attributeSet, i9);
    }

    private C2117l getEmojiTextViewHelper() {
        if (this.f13969e == null) {
            this.f13969e = new C2117l(this);
        }
        return this.f13969e;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2109d c2109d = this.f13966a;
        if (c2109d != null) {
            c2109d.b();
        }
        C2105A c2105a = this.f13967c;
        if (c2105a != null) {
            c2105a.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (m0.f43381b) {
            return getSuperCaller().g();
        }
        C2105A c2105a = this.f13967c;
        if (c2105a != null) {
            return c2105a.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (m0.f43381b) {
            return getSuperCaller().d();
        }
        C2105A c2105a = this.f13967c;
        if (c2105a != null) {
            return c2105a.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (m0.f43381b) {
            return getSuperCaller().k();
        }
        C2105A c2105a = this.f13967c;
        if (c2105a != null) {
            return c2105a.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (m0.f43381b) {
            return getSuperCaller().e();
        }
        C2105A c2105a = this.f13967c;
        return c2105a != null ? c2105a.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (m0.f43381b) {
            return getSuperCaller().c() == 1 ? 1 : 0;
        }
        C2105A c2105a = this.f13967c;
        if (c2105a != null) {
            return c2105a.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return j.q(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return j.b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return j.c(this);
    }

    public a getSuperCaller() {
        a bVar;
        if (this.f13971g == null) {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 28) {
                bVar = new c();
            } else if (i9 >= 26) {
                bVar = new b();
            }
            this.f13971g = bVar;
        }
        return this.f13971g;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2109d c2109d = this.f13966a;
        if (c2109d != null) {
            return c2109d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2109d c2109d = this.f13966a;
        if (c2109d != null) {
            return c2109d.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f13967c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f13967c.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        q();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C2130z c2130z;
        return (Build.VERSION.SDK_INT >= 28 || (c2130z = this.f13968d) == null) ? getSuperCaller().f() : c2130z.a();
    }

    public m.a getTextMetricsParamsCompat() {
        return j.g(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f13967c.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        return AbstractC2118m.a(inputConnectionOnCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        C2105A c2105a = this.f13967c;
        if (c2105a != null) {
            c2105a.o(z9, i9, i10, i11, i12);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i9, int i10) {
        q();
        super.onMeasure(i9, i10);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        super.onTextChanged(charSequence, i9, i10, i11);
        C2105A c2105a = this.f13967c;
        if (c2105a == null || m0.f43381b || !c2105a.l()) {
            return;
        }
        this.f13967c.c();
    }

    public final void q() {
        Future future = this.f13972h;
        if (future != null) {
            try {
                this.f13972h = null;
                AbstractC1617D.a(future.get());
                j.n(this, null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().d(z9);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i9, int i10, int i11, int i12) {
        if (m0.f43381b) {
            getSuperCaller().i(i9, i10, i11, i12);
            return;
        }
        C2105A c2105a = this.f13967c;
        if (c2105a != null) {
            c2105a.t(i9, i10, i11, i12);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i9) {
        if (m0.f43381b) {
            getSuperCaller().a(iArr, i9);
            return;
        }
        C2105A c2105a = this.f13967c;
        if (c2105a != null) {
            c2105a.u(iArr, i9);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i9) {
        if (m0.f43381b) {
            getSuperCaller().l(i9);
            return;
        }
        C2105A c2105a = this.f13967c;
        if (c2105a != null) {
            c2105a.v(i9);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2109d c2109d = this.f13966a;
        if (c2109d != null) {
            c2109d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i9) {
        super.setBackgroundResource(i9);
        C2109d c2109d = this.f13966a;
        if (c2109d != null) {
            c2109d.g(i9);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2105A c2105a = this.f13967c;
        if (c2105a != null) {
            c2105a.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2105A c2105a = this.f13967c;
        if (c2105a != null) {
            c2105a.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i9, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i9 != 0 ? AbstractC1726a.b(context, i9) : null, i10 != 0 ? AbstractC1726a.b(context, i10) : null, i11 != 0 ? AbstractC1726a.b(context, i11) : null, i12 != 0 ? AbstractC1726a.b(context, i12) : null);
        C2105A c2105a = this.f13967c;
        if (c2105a != null) {
            c2105a.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C2105A c2105a = this.f13967c;
        if (c2105a != null) {
            c2105a.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i9, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i9 != 0 ? AbstractC1726a.b(context, i9) : null, i10 != 0 ? AbstractC1726a.b(context, i10) : null, i11 != 0 ? AbstractC1726a.b(context, i11) : null, i12 != 0 ? AbstractC1726a.b(context, i12) : null);
        C2105A c2105a = this.f13967c;
        if (c2105a != null) {
            c2105a.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C2105A c2105a = this.f13967c;
        if (c2105a != null) {
            c2105a.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(j.r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().e(z9);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i9) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().j(i9);
        } else {
            j.k(this, i9);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i9) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i9);
        } else {
            j.l(this, i9);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i9) {
        j.m(this, i9);
    }

    public void setPrecomputedText(N.m mVar) {
        j.n(this, mVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2109d c2109d = this.f13966a;
        if (c2109d != null) {
            c2109d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2109d c2109d = this.f13966a;
        if (c2109d != null) {
            c2109d.j(mode);
        }
    }

    @Override // T.m
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f13967c.w(colorStateList);
        this.f13967c.b();
    }

    @Override // T.m
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f13967c.x(mode);
        this.f13967c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i9) {
        super.setTextAppearance(context, i9);
        C2105A c2105a = this.f13967c;
        if (c2105a != null) {
            c2105a.q(context, i9);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C2130z c2130z;
        if (Build.VERSION.SDK_INT >= 28 || (c2130z = this.f13968d) == null) {
            getSuperCaller().h(textClassifier);
        } else {
            c2130z.b(textClassifier);
        }
    }

    public void setTextFuture(Future<N.m> future) {
        this.f13972h = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(m.a aVar) {
        j.p(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i9, float f9) {
        if (m0.f43381b) {
            super.setTextSize(i9, f9);
            return;
        }
        C2105A c2105a = this.f13967c;
        if (c2105a != null) {
            c2105a.A(i9, f9);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i9) {
        if (this.f13970f) {
            return;
        }
        Typeface typefaceA = (typeface == null || i9 <= 0) ? null : f.a(getContext(), typeface, i9);
        this.f13970f = true;
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        try {
            super.setTypeface(typeface, i9);
        } finally {
            this.f13970f = false;
        }
    }
}
