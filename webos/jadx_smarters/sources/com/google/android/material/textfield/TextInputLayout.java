package com.google.android.material.textfield;

import K0.AbstractC0683n;
import K0.C0673d;
import P.AbstractC0976s;
import P.C0959a;
import P.L;
import Q.C;
import R4.j;
import R4.k;
import R4.l;
import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import e.AbstractC1726a;
import f5.u;
import f5.w;
import i5.AbstractC1893c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k.C2114i;
import k.M;
import k.d0;
import l5.C2198g;
import l5.k;
import o5.AbstractC2352d;
import o5.AbstractC2353e;
import o5.C2349a;
import o5.C2351c;
import o5.C2354f;
import o5.C2356h;
import o5.C2357i;
import p5.AbstractC2451a;

/* JADX INFO: loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout {

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public static final int f27591N0 = k.f8856j;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ColorStateList f27592A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public ColorStateList f27593A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public CharSequence f27594B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public int f27595B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final TextView f27596C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public int f27597C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f27598D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public int f27599D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public CharSequence f27600E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public int f27601E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f27602F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public int f27603F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public C2198g f27604G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public boolean f27605G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public C2198g f27606H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public final f5.b f27607H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public C2198g f27608I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public boolean f27609I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public l5.k f27610J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public boolean f27611J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f27612K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public ValueAnimator f27613K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int f27614L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public boolean f27615L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f27616M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public boolean f27617M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f27618N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f27619O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f27620P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f27621Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f27622R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f27623S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final Rect f27624T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final Rect f27625U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final RectF f27626V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Typeface f27627W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f27628a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2357i f27629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f27630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FrameLayout f27631e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Drawable f27632e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EditText f27633f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f27634f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CharSequence f27635g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final LinkedHashSet f27636g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f27637h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f27638h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f27639i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final SparseArray f27640i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f27641j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final CheckableImageButton f27642j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27643k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final LinkedHashSet f27644k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C2354f f27645l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public ColorStateList f27646l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f27647m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public PorterDuff.Mode f27648m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f27649n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public Drawable f27650n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f27651o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f27652o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f27653p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Drawable f27654p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f27655q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public View.OnLongClickListener f27656q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f27657r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public View.OnLongClickListener f27658r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f27659s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final CheckableImageButton f27660s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f27661t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ColorStateList f27662t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f27663u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public PorterDuff.Mode f27664u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f27665v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public ColorStateList f27666v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f27667w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ColorStateList f27668w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C0673d f27669x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f27670x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C0673d f27671y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f27672y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ColorStateList f27673z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f27674z0;

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.w0(!r0.f27617M0);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f27647m) {
                textInputLayout.m0(editable.length());
            }
            if (TextInputLayout.this.f27661t) {
                TextInputLayout.this.A0(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f27642j0.performClick();
            TextInputLayout.this.f27642j0.jumpDrawablesToCurrentState();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f27633f.requestLayout();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f27607H0.d0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends C0959a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextInputLayout f27679d;

        public e(TextInputLayout textInputLayout) {
            this.f27679d = textInputLayout;
        }

        @Override // P.C0959a
        public void g(View view, C c9) {
            super.g(view, c9);
            EditText editText = this.f27679d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f27679d.getHint();
            CharSequence error = this.f27679d.getError();
            CharSequence placeholderText = this.f27679d.getPlaceholderText();
            int counterMaxLength = this.f27679d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f27679d.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean z9 = !zIsEmpty;
            boolean z10 = true;
            boolean z11 = !TextUtils.isEmpty(hint);
            boolean z12 = !this.f27679d.N();
            boolean z13 = !TextUtils.isEmpty(error);
            if (!z13 && TextUtils.isEmpty(counterOverflowDescription)) {
                z10 = false;
            }
            String string = z11 ? hint.toString() : "";
            this.f27679d.f27629c.v(c9);
            if (z9) {
                c9.u0(text);
            } else if (!TextUtils.isEmpty(string)) {
                c9.u0(string);
                if (z12 && placeholderText != null) {
                    placeholderText = string + ", " + ((Object) placeholderText);
                    c9.u0(placeholderText);
                }
            } else if (placeholderText != null) {
                c9.u0(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    c9.h0(string);
                } else {
                    if (z9) {
                        string = ((Object) text) + ", " + string;
                    }
                    c9.u0(string);
                }
                c9.r0(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            c9.j0(counterMaxLength);
            if (z10) {
                if (!z13) {
                    error = counterOverflowDescription;
                }
                c9.d0(error);
            }
            View viewS = this.f27679d.f27645l.s();
            if (viewS != null) {
                c9.i0(viewS);
            }
        }
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a(TextInputLayout textInputLayout, int i9);
    }

    public static class h extends V.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CharSequence f27680d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f27681e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f27682f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public CharSequence f27683g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f27684h;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i9) {
                return new h[i9];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.f27680d = (CharSequence) creator.createFromParcel(parcel);
            this.f27681e = parcel.readInt() == 1;
            this.f27682f = (CharSequence) creator.createFromParcel(parcel);
            this.f27683g = (CharSequence) creator.createFromParcel(parcel);
            this.f27684h = (CharSequence) creator.createFromParcel(parcel);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f27680d) + " hint=" + ((Object) this.f27682f) + " helperText=" + ((Object) this.f27683g) + " placeholderText=" + ((Object) this.f27684h) + "}";
        }

        @Override // V.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i9) {
            super.writeToParcel(parcel, i9);
            TextUtils.writeToParcel(this.f27680d, parcel, i9);
            parcel.writeInt(this.f27681e ? 1 : 0);
            TextUtils.writeToParcel(this.f27682f, parcel, i9);
            TextUtils.writeToParcel(this.f27683g, parcel, i9);
            TextUtils.writeToParcel(this.f27684h, parcel, i9);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R4.b.f8663I);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v43 */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i9) {
        int i10;
        int colorForState;
        ?? r42;
        int i11 = f27591N0;
        super(AbstractC2451a.c(context, attributeSet, i9, i11), attributeSet, i9);
        this.f27637h = -1;
        this.f27639i = -1;
        this.f27641j = -1;
        this.f27643k = -1;
        this.f27645l = new C2354f(this);
        this.f27624T = new Rect();
        this.f27625U = new Rect();
        this.f27626V = new RectF();
        this.f27636g0 = new LinkedHashSet();
        this.f27638h0 = 0;
        SparseArray sparseArray = new SparseArray();
        this.f27640i0 = sparseArray;
        this.f27644k0 = new LinkedHashSet();
        f5.b bVar = new f5.b(this);
        this.f27607H0 = bVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f27628a = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f27631e = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context2);
        this.f27630d = linearLayout;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
        this.f27596C = appCompatTextView;
        linearLayout.setVisibility(8);
        frameLayout2.setVisibility(8);
        appCompatTextView.setVisibility(8);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context2);
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflaterFrom.inflate(R4.h.f8809d, (ViewGroup) linearLayout, false);
        this.f27660s0 = checkableImageButton;
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) layoutInflaterFrom.inflate(R4.h.f8809d, (ViewGroup) frameLayout2, false);
        this.f27642j0 = checkableImageButton2;
        frameLayout.setAddStatesFromChildren(true);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        TimeInterpolator timeInterpolator = S4.a.f9409a;
        bVar.i0(timeInterpolator);
        bVar.f0(timeInterpolator);
        bVar.S(8388659);
        d0 d0VarI = u.i(context2, attributeSet, l.f9095b6, i9, i11, l.f9302y6, l.f9284w6, l.f8966L6, l.f9006Q6, l.f9038U6);
        C2357i c2357i = new C2357i(this, d0VarI);
        this.f27629c = c2357i;
        this.f27598D = d0VarI.a(l.f9030T6, true);
        setHint(d0VarI.p(l.f9140g6));
        this.f27611J0 = d0VarI.a(l.f9022S6, true);
        this.f27609I0 = d0VarI.a(l.f8982N6, true);
        if (d0VarI.s(l.f9158i6)) {
            i10 = -1;
            setMinEms(d0VarI.k(l.f9158i6, -1));
        } else {
            i10 = -1;
            if (d0VarI.s(l.f9131f6)) {
                setMinWidth(d0VarI.f(l.f9131f6, -1));
            }
        }
        if (d0VarI.s(l.f9149h6)) {
            setMaxEms(d0VarI.k(l.f9149h6, i10));
        } else if (d0VarI.s(l.f9122e6)) {
            setMaxWidth(d0VarI.f(l.f9122e6, i10));
        }
        this.f27610J = l5.k.e(context2, attributeSet, i9, i11).m();
        this.f27614L = context2.getResources().getDimensionPixelOffset(R4.d.f8724W);
        this.f27618N = d0VarI.e(l.f9185l6, 0);
        this.f27620P = d0VarI.f(l.f9248s6, context2.getResources().getDimensionPixelSize(R4.d.f8725X));
        this.f27621Q = d0VarI.f(l.f9257t6, context2.getResources().getDimensionPixelSize(R4.d.f8726Y));
        this.f27619O = this.f27620P;
        float fD = d0VarI.d(l.f9221p6, -1.0f);
        float fD2 = d0VarI.d(l.f9212o6, -1.0f);
        float fD3 = d0VarI.d(l.f9194m6, -1.0f);
        float fD4 = d0VarI.d(l.f9203n6, -1.0f);
        k.b bVarV = this.f27610J.v();
        if (fD >= 0.0f) {
            bVarV.A(fD);
        }
        if (fD2 >= 0.0f) {
            bVarV.E(fD2);
        }
        if (fD3 >= 0.0f) {
            bVarV.w(fD3);
        }
        if (fD4 >= 0.0f) {
            bVarV.s(fD4);
        }
        this.f27610J = bVarV.m();
        ColorStateList colorStateListB = AbstractC1893c.b(context2, d0VarI, l.f9167j6);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.f27595B0 = defaultColor;
            this.f27623S = defaultColor;
            if (colorStateListB.isStateful()) {
                this.f27597C0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.f27599D0 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                colorForState = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f27599D0 = this.f27595B0;
                ColorStateList colorStateListA = AbstractC1726a.a(context2, R4.c.f8698g);
                this.f27597C0 = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                colorForState = colorStateListA.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            colorForState = 0;
            this.f27623S = 0;
            this.f27595B0 = 0;
            this.f27597C0 = 0;
            this.f27599D0 = 0;
        }
        this.f27601E0 = colorForState;
        if (d0VarI.s(l.f9113d6)) {
            ColorStateList colorStateListC = d0VarI.c(l.f9113d6);
            this.f27668w0 = colorStateListC;
            this.f27666v0 = colorStateListC;
        }
        ColorStateList colorStateListB2 = AbstractC1893c.b(context2, d0VarI, l.f9230q6);
        this.f27674z0 = d0VarI.b(l.f9230q6, 0);
        this.f27670x0 = E.b.getColor(context2, R4.c.f8699h);
        this.f27603F0 = E.b.getColor(context2, R4.c.f8700i);
        this.f27672y0 = E.b.getColor(context2, R4.c.f8701j);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        if (d0VarI.s(l.f9239r6)) {
            setBoxStrokeErrorColor(AbstractC1893c.b(context2, d0VarI, l.f9239r6));
        }
        if (d0VarI.n(l.f9038U6, -1) != -1) {
            r42 = 0;
            setHintTextAppearance(d0VarI.n(l.f9038U6, 0));
        } else {
            r42 = 0;
        }
        int iN = d0VarI.n(l.f8966L6, r42);
        CharSequence charSequenceP = d0VarI.p(l.f8926G6);
        boolean zA = d0VarI.a(l.f8934H6, r42);
        checkableImageButton.setId(R4.f.f8770J);
        if (AbstractC1893c.g(context2)) {
            AbstractC0976s.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), r42);
        }
        if (d0VarI.s(l.f8950J6)) {
            this.f27662t0 = AbstractC1893c.b(context2, d0VarI, l.f8950J6);
        }
        if (d0VarI.s(l.f8958K6)) {
            this.f27664u0 = w.f(d0VarI.k(l.f8958K6, -1), null);
        }
        if (d0VarI.s(l.f8942I6)) {
            setErrorIconDrawable(d0VarI.g(l.f8942I6));
        }
        checkableImageButton.setContentDescription(getResources().getText(j.f8832f));
        L.C0(checkableImageButton, 2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int iN2 = d0VarI.n(l.f9006Q6, 0);
        boolean zA2 = d0VarI.a(l.f8998P6, false);
        CharSequence charSequenceP2 = d0VarI.p(l.f8990O6);
        int iN3 = d0VarI.n(l.f9105c7, 0);
        CharSequence charSequenceP3 = d0VarI.p(l.f9096b7);
        int iN4 = d0VarI.n(l.f9204n7, 0);
        CharSequence charSequenceP4 = d0VarI.p(l.f9195m7);
        boolean zA3 = d0VarI.a(l.f9266u6, false);
        setCounterMaxLength(d0VarI.k(l.f9275v6, -1));
        this.f27657r = d0VarI.n(l.f9302y6, 0);
        this.f27655q = d0VarI.n(l.f9284w6, 0);
        setBoxBackgroundMode(d0VarI.k(l.f9176k6, 0));
        if (AbstractC1893c.g(context2)) {
            AbstractC0976s.d((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams(), 0);
        }
        int iN5 = d0VarI.n(l.f8894C6, 0);
        sparseArray.append(-1, new C2349a(this, iN5));
        sparseArray.append(0, new C2356h(this));
        sparseArray.append(1, new com.google.android.material.textfield.c(this, iN5 == 0 ? d0VarI.n(l.f9062X6, 0) : iN5));
        sparseArray.append(2, new com.google.android.material.textfield.a(this, iN5));
        sparseArray.append(3, new com.google.android.material.textfield.b(this, iN5));
        if (!d0VarI.s(l.f9070Y6)) {
            if (d0VarI.s(l.f8910E6)) {
                this.f27646l0 = AbstractC1893c.b(context2, d0VarI, l.f8910E6);
            }
            if (d0VarI.s(l.f8918F6)) {
                this.f27648m0 = w.f(d0VarI.k(l.f8918F6, -1), null);
            }
        }
        if (d0VarI.s(l.f8902D6)) {
            setEndIconMode(d0VarI.k(l.f8902D6, 0));
            if (d0VarI.s(l.f8885B6)) {
                setEndIconContentDescription(d0VarI.p(l.f8885B6));
            }
            setEndIconCheckable(d0VarI.a(l.f8876A6, true));
        } else if (d0VarI.s(l.f9070Y6)) {
            if (d0VarI.s(l.f9078Z6)) {
                this.f27646l0 = AbstractC1893c.b(context2, d0VarI, l.f9078Z6);
            }
            if (d0VarI.s(l.f9087a7)) {
                this.f27648m0 = w.f(d0VarI.k(l.f9087a7, -1), null);
            }
            setEndIconMode(d0VarI.a(l.f9070Y6, false) ? 1 : 0);
            setEndIconContentDescription(d0VarI.p(l.f9054W6));
        }
        appCompatTextView.setId(R4.f.f8776P);
        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        L.u0(appCompatTextView, 1);
        setErrorContentDescription(charSequenceP);
        setCounterOverflowTextAppearance(this.f27655q);
        setHelperTextTextAppearance(iN2);
        setErrorTextAppearance(iN);
        setCounterTextAppearance(this.f27657r);
        setPlaceholderText(charSequenceP3);
        setPlaceholderTextAppearance(iN3);
        setSuffixTextAppearance(iN4);
        if (d0VarI.s(l.f8974M6)) {
            setErrorTextColor(d0VarI.c(l.f8974M6));
        }
        if (d0VarI.s(l.f9014R6)) {
            setHelperTextColor(d0VarI.c(l.f9014R6));
        }
        if (d0VarI.s(l.f9046V6)) {
            setHintTextColor(d0VarI.c(l.f9046V6));
        }
        if (d0VarI.s(l.f9311z6)) {
            setCounterTextColor(d0VarI.c(l.f9311z6));
        }
        if (d0VarI.s(l.f9293x6)) {
            setCounterOverflowTextColor(d0VarI.c(l.f9293x6));
        }
        if (d0VarI.s(l.f9114d7)) {
            setPlaceholderTextColor(d0VarI.c(l.f9114d7));
        }
        if (d0VarI.s(l.f9213o7)) {
            setSuffixTextColor(d0VarI.c(l.f9213o7));
        }
        setEnabled(d0VarI.a(l.f9104c6, true));
        d0VarI.w();
        L.C0(this, 2);
        if (Build.VERSION.SDK_INT >= 26) {
            L.D0(this, 1);
        }
        frameLayout2.addView(checkableImageButton2);
        linearLayout.addView(appCompatTextView);
        linearLayout.addView(checkableImageButton);
        linearLayout.addView(frameLayout2);
        frameLayout.addView(c2357i);
        frameLayout.addView(linearLayout);
        addView(frameLayout);
        setHelperTextEnabled(zA2);
        setErrorEnabled(zA);
        setCounterEnabled(zA3);
        setHelperText(charSequenceP2);
        setSuffixText(charSequenceP4);
    }

    public static void T(ViewGroup viewGroup, boolean z9) {
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = viewGroup.getChildAt(i9);
            childAt.setEnabled(z9);
            if (childAt instanceof ViewGroup) {
                T((ViewGroup) childAt, z9);
            }
        }
    }

    public static void a0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zR = L.R(checkableImageButton);
        boolean z9 = onLongClickListener != null;
        boolean z10 = zR || z9;
        checkableImageButton.setFocusable(z10);
        checkableImageButton.setClickable(zR);
        checkableImageButton.setPressable(zR);
        checkableImageButton.setLongClickable(z9);
        L.C0(checkableImageButton, z10 ? 1 : 2);
    }

    public static void b0(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        a0(checkableImageButton, onLongClickListener);
    }

    public static void c0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        a0(checkableImageButton, onLongClickListener);
    }

    private AbstractC2352d getEndIconDelegate() {
        AbstractC2352d abstractC2352d = (AbstractC2352d) this.f27640i0.get(this.f27638h0);
        return abstractC2352d != null ? abstractC2352d : (AbstractC2352d) this.f27640i0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f27660s0.getVisibility() == 0) {
            return this.f27660s0;
        }
        if (I() && K()) {
            return this.f27642j0;
        }
        return null;
    }

    public static void n0(Context context, TextView textView, int i9, int i10, boolean z9) {
        textView.setContentDescription(context.getString(z9 ? j.f8829c : j.f8828b, Integer.valueOf(i9), Integer.valueOf(i10)));
    }

    private void setEditText(EditText editText) {
        if (this.f27633f != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.f27638h0 != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f27633f = editText;
        int i9 = this.f27637h;
        if (i9 != -1) {
            setMinEms(i9);
        } else {
            setMinWidth(this.f27641j);
        }
        int i10 = this.f27639i;
        if (i10 != -1) {
            setMaxEms(i10);
        } else {
            setMaxWidth(this.f27643k);
        }
        Q();
        setTextInputAccessibilityDelegate(new e(this));
        this.f27607H0.j0(this.f27633f.getTypeface());
        this.f27607H0.b0(this.f27633f.getTextSize());
        this.f27607H0.X(this.f27633f.getLetterSpacing());
        int gravity = this.f27633f.getGravity();
        this.f27607H0.S((gravity & (-113)) | 48);
        this.f27607H0.a0(gravity);
        this.f27633f.addTextChangedListener(new a());
        if (this.f27666v0 == null) {
            this.f27666v0 = this.f27633f.getHintTextColors();
        }
        if (this.f27598D) {
            if (TextUtils.isEmpty(this.f27600E)) {
                CharSequence hint = this.f27633f.getHint();
                this.f27635g = hint;
                setHint(hint);
                this.f27633f.setHint((CharSequence) null);
            }
            this.f27602F = true;
        }
        if (this.f27653p != null) {
            m0(this.f27633f.getText().length());
        }
        r0();
        this.f27645l.f();
        this.f27629c.bringToFront();
        this.f27630d.bringToFront();
        this.f27631e.bringToFront();
        this.f27660s0.bringToFront();
        B();
        C0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        x0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f27600E)) {
            return;
        }
        this.f27600E = charSequence;
        this.f27607H0.h0(charSequence);
        if (this.f27605G0) {
            return;
        }
        R();
    }

    private void setPlaceholderTextEnabled(boolean z9) {
        if (this.f27661t == z9) {
            return;
        }
        if (z9) {
            i();
        } else {
            X();
            this.f27663u = null;
        }
        this.f27661t = z9;
    }

    public final boolean A() {
        return this.f27598D && !TextUtils.isEmpty(this.f27600E) && (this.f27604G instanceof C2351c);
    }

    public final void A0(int i9) {
        if (i9 != 0 || this.f27605G0) {
            J();
        } else {
            h0();
        }
    }

    public final void B() {
        Iterator it = this.f27636g0.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(this);
        }
    }

    public final void B0(boolean z9, boolean z10) {
        int defaultColor = this.f27593A0.getDefaultColor();
        int colorForState = this.f27593A0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f27593A0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z9) {
            this.f27622R = colorForState2;
        } else if (z10) {
            this.f27622R = colorForState;
        } else {
            this.f27622R = defaultColor;
        }
    }

    public final void C(int i9) {
        Iterator it = this.f27644k0.iterator();
        while (it.hasNext()) {
            ((g) it.next()).a(this, i9);
        }
    }

    public final void C0() {
        if (this.f27633f == null) {
            return;
        }
        L.F0(this.f27596C, getContext().getResources().getDimensionPixelSize(R4.d.f8751x), this.f27633f.getPaddingTop(), (K() || L()) ? 0 : L.I(this.f27633f), this.f27633f.getPaddingBottom());
    }

    public final void D(Canvas canvas) {
        C2198g c2198g;
        if (this.f27608I == null || (c2198g = this.f27606H) == null) {
            return;
        }
        c2198g.draw(canvas);
        if (this.f27633f.isFocused()) {
            Rect bounds = this.f27608I.getBounds();
            Rect bounds2 = this.f27606H.getBounds();
            float fX = this.f27607H0.x();
            int iCenterX = bounds2.centerX();
            bounds.left = S4.a.c(iCenterX, bounds2.left, fX);
            bounds.right = S4.a.c(iCenterX, bounds2.right, fX);
            this.f27608I.draw(canvas);
        }
    }

    public final void D0() {
        int visibility = this.f27596C.getVisibility();
        int i9 = (this.f27594B == null || N()) ? 8 : 0;
        if (visibility != i9) {
            getEndIconDelegate().c(i9 == 0);
        }
        t0();
        this.f27596C.setVisibility(i9);
        q0();
    }

    public final void E(Canvas canvas) {
        if (this.f27598D) {
            this.f27607H0.l(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E0() {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.E0():void");
    }

    public final void F(boolean z9) {
        ValueAnimator valueAnimator = this.f27613K0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f27613K0.cancel();
        }
        if (z9 && this.f27611J0) {
            k(0.0f);
        } else {
            this.f27607H0.d0(0.0f);
        }
        if (A() && ((C2351c) this.f27604G).h0()) {
            x();
        }
        this.f27605G0 = true;
        J();
        this.f27629c.i(true);
        D0();
    }

    public final int G(int i9, boolean z9) {
        int compoundPaddingLeft = i9 + this.f27633f.getCompoundPaddingLeft();
        return (getPrefixText() == null || z9) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    public final int H(int i9, boolean z9) {
        int compoundPaddingRight = i9 - this.f27633f.getCompoundPaddingRight();
        return (getPrefixText() == null || !z9) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    public final boolean I() {
        return this.f27638h0 != 0;
    }

    public final void J() {
        TextView textView = this.f27663u;
        if (textView == null || !this.f27661t) {
            return;
        }
        textView.setText((CharSequence) null);
        AbstractC0683n.b(this.f27628a, this.f27671y);
        this.f27663u.setVisibility(4);
    }

    public boolean K() {
        return this.f27631e.getVisibility() == 0 && this.f27642j0.getVisibility() == 0;
    }

    public final boolean L() {
        return this.f27660s0.getVisibility() == 0;
    }

    public boolean M() {
        return this.f27645l.A();
    }

    public final boolean N() {
        return this.f27605G0;
    }

    public boolean O() {
        return this.f27602F;
    }

    public final boolean P() {
        return this.f27616M == 1 && this.f27633f.getMinLines() <= 1;
    }

    public final void Q() {
        o();
        Z();
        E0();
        j0();
        j();
        if (this.f27616M != 0) {
            v0();
        }
    }

    public final void R() {
        if (A()) {
            RectF rectF = this.f27626V;
            this.f27607H0.o(rectF, this.f27633f.getWidth(), this.f27633f.getGravity());
            n(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f27619O);
            ((C2351c) this.f27604G).k0(rectF);
        }
    }

    public final void S() {
        if (!A() || this.f27605G0) {
            return;
        }
        x();
        R();
    }

    public void U() {
        AbstractC2353e.c(this, this.f27642j0, this.f27646l0);
    }

    public void V() {
        AbstractC2353e.c(this, this.f27660s0, this.f27662t0);
    }

    public void W() {
        this.f27629c.j();
    }

    public final void X() {
        TextView textView = this.f27663u;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public void Y(float f9, float f10, float f11, float f12) {
        boolean zE = w.e(this);
        this.f27612K = zE;
        float f13 = zE ? f10 : f9;
        if (!zE) {
            f9 = f10;
        }
        float f14 = zE ? f12 : f11;
        if (!zE) {
            f11 = f12;
        }
        C2198g c2198g = this.f27604G;
        if (c2198g != null && c2198g.E() == f13 && this.f27604G.F() == f9 && this.f27604G.s() == f14 && this.f27604G.t() == f11) {
            return;
        }
        this.f27610J = this.f27610J.v().A(f13).E(f9).s(f14).w(f11).m();
        l();
    }

    public final void Z() {
        if (g0()) {
            L.w0(this.f27633f, this.f27604G);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i9, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f27628a.addView(view, layoutParams2);
        this.f27628a.setLayoutParams(layoutParams);
        v0();
        setEditText((EditText) view);
    }

    public void d0(TextView textView, int i9) {
        try {
            T.j.o(textView, i9);
            if (Build.VERSION.SDK_INT < 23) {
                return;
            }
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        T.j.o(textView, R4.k.f8847a);
        textView.setTextColor(E.b.getColor(getContext(), R4.c.f8692a));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i9) {
        EditText editText = this.f27633f;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i9);
            return;
        }
        if (this.f27635g != null) {
            boolean z9 = this.f27602F;
            this.f27602F = false;
            CharSequence hint = editText.getHint();
            this.f27633f.setHint(this.f27635g);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i9);
                return;
            } finally {
                this.f27633f.setHint(hint);
                this.f27602F = z9;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i9);
        onProvideAutofillVirtualStructure(viewStructure, i9);
        viewStructure.setChildCount(this.f27628a.getChildCount());
        for (int i10 = 0; i10 < this.f27628a.getChildCount(); i10++) {
            View childAt = this.f27628a.getChildAt(i10);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i10);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i9);
            if (childAt == this.f27633f) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f27617M0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f27617M0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f27615L0) {
            return;
        }
        this.f27615L0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        f5.b bVar = this.f27607H0;
        boolean zG0 = bVar != null ? bVar.g0(drawableState) : false;
        if (this.f27633f != null) {
            w0(L.W(this) && isEnabled());
        }
        r0();
        E0();
        if (zG0) {
            invalidate();
        }
        this.f27615L0 = false;
    }

    public final boolean e0() {
        return (this.f27660s0.getVisibility() == 0 || ((I() && K()) || this.f27594B != null)) && this.f27630d.getMeasuredWidth() > 0;
    }

    public final boolean f0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f27629c.getMeasuredWidth() > 0;
    }

    public void g(f fVar) {
        this.f27636g0.add(fVar);
        if (this.f27633f != null) {
            fVar.a(this);
        }
    }

    public final boolean g0() {
        EditText editText = this.f27633f;
        return (editText == null || this.f27604G == null || editText.getBackground() != null || this.f27616M == 0) ? false : true;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f27633f;
        return editText != null ? editText.getBaseline() + getPaddingTop() + u() : super.getBaseline();
    }

    public C2198g getBoxBackground() {
        int i9 = this.f27616M;
        if (i9 == 1 || i9 == 2) {
            return this.f27604G;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f27623S;
    }

    public int getBoxBackgroundMode() {
        return this.f27616M;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f27618N;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return (w.e(this) ? this.f27610J.j() : this.f27610J.l()).a(this.f27626V);
    }

    public float getBoxCornerRadiusBottomStart() {
        return (w.e(this) ? this.f27610J.l() : this.f27610J.j()).a(this.f27626V);
    }

    public float getBoxCornerRadiusTopEnd() {
        return (w.e(this) ? this.f27610J.r() : this.f27610J.t()).a(this.f27626V);
    }

    public float getBoxCornerRadiusTopStart() {
        return (w.e(this) ? this.f27610J.t() : this.f27610J.r()).a(this.f27626V);
    }

    public int getBoxStrokeColor() {
        return this.f27674z0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f27593A0;
    }

    public int getBoxStrokeWidth() {
        return this.f27620P;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f27621Q;
    }

    public int getCounterMaxLength() {
        return this.f27649n;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f27647m && this.f27651o && (textView = this.f27653p) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f27673z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f27673z;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f27666v0;
    }

    public EditText getEditText() {
        return this.f27633f;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f27642j0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f27642j0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f27638h0;
    }

    public CheckableImageButton getEndIconView() {
        return this.f27642j0;
    }

    public CharSequence getError() {
        if (this.f27645l.z()) {
            return this.f27645l.o();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f27645l.n();
    }

    public int getErrorCurrentTextColors() {
        return this.f27645l.p();
    }

    public Drawable getErrorIconDrawable() {
        return this.f27660s0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.f27645l.p();
    }

    public CharSequence getHelperText() {
        if (this.f27645l.A()) {
            return this.f27645l.r();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f27645l.t();
    }

    public CharSequence getHint() {
        if (this.f27598D) {
            return this.f27600E;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f27607H0.q();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.f27607H0.t();
    }

    public ColorStateList getHintTextColor() {
        return this.f27668w0;
    }

    public int getMaxEms() {
        return this.f27639i;
    }

    public int getMaxWidth() {
        return this.f27643k;
    }

    public int getMinEms() {
        return this.f27637h;
    }

    public int getMinWidth() {
        return this.f27641j;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f27642j0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f27642j0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f27661t) {
            return this.f27659s;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f27667w;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f27665v;
    }

    public CharSequence getPrefixText() {
        return this.f27629c.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f27629c.b();
    }

    public TextView getPrefixTextView() {
        return this.f27629c.c();
    }

    public CharSequence getStartIconContentDescription() {
        return this.f27629c.d();
    }

    public Drawable getStartIconDrawable() {
        return this.f27629c.e();
    }

    public CharSequence getSuffixText() {
        return this.f27594B;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f27596C.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f27596C;
    }

    public Typeface getTypeface() {
        return this.f27627W;
    }

    public void h(g gVar) {
        this.f27644k0.add(gVar);
    }

    public final void h0() {
        if (this.f27663u == null || !this.f27661t || TextUtils.isEmpty(this.f27659s)) {
            return;
        }
        this.f27663u.setText(this.f27659s);
        AbstractC0683n.b(this.f27628a, this.f27669x);
        this.f27663u.setVisibility(0);
        this.f27663u.bringToFront();
        announceForAccessibility(this.f27659s);
    }

    public final void i() {
        TextView textView = this.f27663u;
        if (textView != null) {
            this.f27628a.addView(textView);
            this.f27663u.setVisibility(0);
        }
    }

    public final void i0(boolean z9) {
        if (!z9 || getEndIconDrawable() == null) {
            AbstractC2353e.a(this, this.f27642j0, this.f27646l0, this.f27648m0);
            return;
        }
        Drawable drawableMutate = H.a.r(getEndIconDrawable()).mutate();
        H.a.n(drawableMutate, this.f27645l.p());
        this.f27642j0.setImageDrawable(drawableMutate);
    }

    public final void j() {
        EditText editText;
        int iJ;
        int dimensionPixelSize;
        int I9;
        Resources resources;
        int i9;
        if (this.f27633f == null || this.f27616M != 1) {
            return;
        }
        if (AbstractC1893c.h(getContext())) {
            editText = this.f27633f;
            iJ = L.J(editText);
            dimensionPixelSize = getResources().getDimensionPixelSize(R4.d.f8745r);
            I9 = L.I(this.f27633f);
            resources = getResources();
            i9 = R4.d.f8744q;
        } else {
            if (!AbstractC1893c.g(getContext())) {
                return;
            }
            editText = this.f27633f;
            iJ = L.J(editText);
            dimensionPixelSize = getResources().getDimensionPixelSize(R4.d.f8743p);
            I9 = L.I(this.f27633f);
            resources = getResources();
            i9 = R4.d.f8742o;
        }
        L.F0(editText, iJ, dimensionPixelSize, I9, resources.getDimensionPixelSize(i9));
    }

    public final void j0() {
        Resources resources;
        int i9;
        if (this.f27616M == 1) {
            if (AbstractC1893c.h(getContext())) {
                resources = getResources();
                i9 = R4.d.f8747t;
            } else {
                if (!AbstractC1893c.g(getContext())) {
                    return;
                }
                resources = getResources();
                i9 = R4.d.f8746s;
            }
            this.f27618N = resources.getDimensionPixelSize(i9);
        }
    }

    public void k(float f9) {
        if (this.f27607H0.x() == f9) {
            return;
        }
        if (this.f27613K0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f27613K0 = valueAnimator;
            valueAnimator.setInterpolator(S4.a.f9410b);
            this.f27613K0.setDuration(167L);
            this.f27613K0.addUpdateListener(new d());
        }
        this.f27613K0.setFloatValues(this.f27607H0.x(), f9);
        this.f27613K0.start();
    }

    public final void k0(Rect rect) {
        C2198g c2198g = this.f27606H;
        if (c2198g != null) {
            int i9 = rect.bottom;
            c2198g.setBounds(rect.left, i9 - this.f27620P, rect.right, i9);
        }
        C2198g c2198g2 = this.f27608I;
        if (c2198g2 != null) {
            int i10 = rect.bottom;
            c2198g2.setBounds(rect.left, i10 - this.f27621Q, rect.right, i10);
        }
    }

    public final void l() {
        C2198g c2198g = this.f27604G;
        if (c2198g == null) {
            return;
        }
        l5.k kVarC = c2198g.C();
        l5.k kVar = this.f27610J;
        if (kVarC != kVar) {
            this.f27604G.setShapeAppearanceModel(kVar);
            p0();
        }
        if (v()) {
            this.f27604G.a0(this.f27619O, this.f27622R);
        }
        int iP = p();
        this.f27623S = iP;
        this.f27604G.W(ColorStateList.valueOf(iP));
        if (this.f27638h0 == 3) {
            this.f27633f.getBackground().invalidateSelf();
        }
        m();
        invalidate();
    }

    public final void l0() {
        if (this.f27653p != null) {
            EditText editText = this.f27633f;
            m0(editText == null ? 0 : editText.getText().length());
        }
    }

    public final void m() {
        if (this.f27606H == null || this.f27608I == null) {
            return;
        }
        if (w()) {
            this.f27606H.W(ColorStateList.valueOf(this.f27633f.isFocused() ? this.f27670x0 : this.f27622R));
            this.f27608I.W(ColorStateList.valueOf(this.f27622R));
        }
        invalidate();
    }

    public void m0(int i9) {
        boolean z9 = this.f27651o;
        int i10 = this.f27649n;
        if (i10 == -1) {
            this.f27653p.setText(String.valueOf(i9));
            this.f27653p.setContentDescription(null);
            this.f27651o = false;
        } else {
            this.f27651o = i9 > i10;
            n0(getContext(), this.f27653p, i9, this.f27649n, this.f27651o);
            if (z9 != this.f27651o) {
                o0();
            }
            this.f27653p.setText(N.a.c().j(getContext().getString(j.f8830d, Integer.valueOf(i9), Integer.valueOf(this.f27649n))));
        }
        if (this.f27633f == null || z9 == this.f27651o) {
            return;
        }
        w0(false);
        E0();
        r0();
    }

    public final void n(RectF rectF) {
        float f9 = rectF.left;
        int i9 = this.f27614L;
        rectF.left = f9 - i9;
        rectF.right += i9;
    }

    public final void o() {
        int i9 = this.f27616M;
        if (i9 == 0) {
            this.f27604G = null;
        } else if (i9 == 1) {
            this.f27604G = new C2198g(this.f27610J);
            this.f27606H = new C2198g();
            this.f27608I = new C2198g();
            return;
        } else {
            if (i9 != 2) {
                throw new IllegalArgumentException(this.f27616M + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            this.f27604G = (!this.f27598D || (this.f27604G instanceof C2351c)) ? new C2198g(this.f27610J) : new C2351c(this.f27610J);
        }
        this.f27606H = null;
        this.f27608I = null;
    }

    public final void o0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f27653p;
        if (textView != null) {
            d0(textView, this.f27651o ? this.f27655q : this.f27657r);
            if (!this.f27651o && (colorStateList2 = this.f27673z) != null) {
                this.f27653p.setTextColor(colorStateList2);
            }
            if (!this.f27651o || (colorStateList = this.f27592A) == null) {
                return;
            }
            this.f27653p.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f27607H0.H(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        EditText editText = this.f27633f;
        if (editText != null) {
            Rect rect = this.f27624T;
            f5.c.a(this, editText, rect);
            k0(rect);
            if (this.f27598D) {
                this.f27607H0.b0(this.f27633f.getTextSize());
                int gravity = this.f27633f.getGravity();
                this.f27607H0.S((gravity & (-113)) | 48);
                this.f27607H0.a0(gravity);
                this.f27607H0.O(q(rect));
                this.f27607H0.W(t(rect));
                this.f27607H0.K();
                if (!A() || this.f27605G0) {
                    return;
                }
                R();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        boolean zS0 = s0();
        boolean zQ0 = q0();
        if (zS0 || zQ0) {
            this.f27633f.post(new c());
        }
        y0();
        C0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        setError(hVar.f27680d);
        if (hVar.f27681e) {
            this.f27642j0.post(new b());
        }
        setHint(hVar.f27682f);
        setHelperText(hVar.f27683g);
        setPlaceholderText(hVar.f27684h);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i9) {
        super.onRtlPropertiesChanged(i9);
        boolean z9 = false;
        boolean z10 = i9 == 1;
        boolean z11 = this.f27612K;
        if (z10 != z11) {
            if (z10 && !z11) {
                z9 = true;
            }
            float fA = this.f27610J.r().a(this.f27626V);
            float fA2 = this.f27610J.t().a(this.f27626V);
            float fA3 = this.f27610J.j().a(this.f27626V);
            float fA4 = this.f27610J.l().a(this.f27626V);
            float f9 = z9 ? fA : fA2;
            if (z9) {
                fA = fA2;
            }
            float f10 = z9 ? fA3 : fA4;
            if (z9) {
                fA3 = fA4;
            }
            Y(f9, fA, f10, fA3);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (this.f27645l.l()) {
            hVar.f27680d = getError();
        }
        hVar.f27681e = I() && this.f27642j0.isChecked();
        hVar.f27682f = getHint();
        hVar.f27683g = getHelperText();
        hVar.f27684h = getPlaceholderText();
        return hVar;
    }

    public final int p() {
        return this.f27616M == 1 ? Z4.a.g(Z4.a.e(this, R4.b.f8678m, 0), this.f27623S) : this.f27623S;
    }

    public final void p0() {
        if (this.f27638h0 == 3 && this.f27616M == 2) {
            ((com.google.android.material.textfield.b) this.f27640i0.get(3)).O((AutoCompleteTextView) this.f27633f);
        }
    }

    public final Rect q(Rect rect) {
        int paddingTop;
        int iH;
        if (this.f27633f == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f27625U;
        boolean zE = w.e(this);
        rect2.bottom = rect.bottom;
        int i9 = this.f27616M;
        if (i9 == 1) {
            rect2.left = G(rect.left, zE);
            paddingTop = rect.top + this.f27618N;
        } else {
            if (i9 == 2) {
                rect2.left = rect.left + this.f27633f.getPaddingLeft();
                rect2.top = rect.top - u();
                iH = rect.right - this.f27633f.getPaddingRight();
                rect2.right = iH;
                return rect2;
            }
            rect2.left = G(rect.left, zE);
            paddingTop = getPaddingTop();
        }
        rect2.top = paddingTop;
        iH = H(rect.right, zE);
        rect2.right = iH;
        return rect2;
    }

    public boolean q0() {
        boolean z9;
        Drawable drawable;
        EditText editText;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        if (this.f27633f == null) {
            return false;
        }
        boolean z10 = true;
        if (f0()) {
            int measuredWidth = this.f27629c.getMeasuredWidth() - this.f27633f.getPaddingLeft();
            if (this.f27632e0 == null || this.f27634f0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f27632e0 = colorDrawable;
                this.f27634f0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrA = T.j.a(this.f27633f);
            Drawable drawable5 = drawableArrA[0];
            Drawable drawable6 = this.f27632e0;
            if (drawable5 != drawable6) {
                T.j.j(this.f27633f, drawable6, drawableArrA[1], drawableArrA[2], drawableArrA[3]);
                z9 = true;
            }
            z9 = false;
        } else {
            if (this.f27632e0 != null) {
                Drawable[] drawableArrA2 = T.j.a(this.f27633f);
                T.j.j(this.f27633f, null, drawableArrA2[1], drawableArrA2[2], drawableArrA2[3]);
                this.f27632e0 = null;
                z9 = true;
            }
            z9 = false;
        }
        if (e0()) {
            int measuredWidth2 = this.f27596C.getMeasuredWidth() - this.f27633f.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = measuredWidth2 + endIconToUpdateDummyDrawable.getMeasuredWidth() + AbstractC0976s.b((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams());
            }
            Drawable[] drawableArrA3 = T.j.a(this.f27633f);
            Drawable drawable7 = this.f27650n0;
            if (drawable7 == null || this.f27652o0 == measuredWidth2) {
                if (drawable7 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f27650n0 = colorDrawable2;
                    this.f27652o0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable8 = drawableArrA3[2];
                drawable = this.f27650n0;
                if (drawable8 != drawable) {
                    this.f27654p0 = drawable8;
                    editText = this.f27633f;
                    drawable2 = drawableArrA3[0];
                    drawable3 = drawableArrA3[1];
                    drawable4 = drawableArrA3[3];
                } else {
                    z10 = z9;
                }
            } else {
                this.f27652o0 = measuredWidth2;
                drawable7.setBounds(0, 0, measuredWidth2, 1);
                editText = this.f27633f;
                drawable2 = drawableArrA3[0];
                drawable3 = drawableArrA3[1];
                drawable = this.f27650n0;
                drawable4 = drawableArrA3[3];
            }
            T.j.j(editText, drawable2, drawable3, drawable, drawable4);
        } else {
            if (this.f27650n0 == null) {
                return z9;
            }
            Drawable[] drawableArrA4 = T.j.a(this.f27633f);
            if (drawableArrA4[2] == this.f27650n0) {
                T.j.j(this.f27633f, drawableArrA4[0], drawableArrA4[1], this.f27654p0, drawableArrA4[3]);
            } else {
                z10 = z9;
            }
            this.f27650n0 = null;
        }
        return z10;
    }

    public final int r(Rect rect, Rect rect2, float f9) {
        return P() ? (int) (rect2.top + f9) : rect.bottom - this.f27633f.getCompoundPaddingBottom();
    }

    public void r0() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.f27633f;
        if (editText == null || this.f27616M != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (M.a(background)) {
            background = background.mutate();
        }
        if (this.f27645l.l()) {
            currentTextColor = this.f27645l.p();
        } else {
            if (!this.f27651o || (textView = this.f27653p) == null) {
                H.a.c(background);
                this.f27633f.refreshDrawableState();
                return;
            }
            currentTextColor = textView.getCurrentTextColor();
        }
        background.setColorFilter(C2114i.e(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    public final int s(Rect rect, float f9) {
        return P() ? (int) (rect.centerY() - (f9 / 2.0f)) : rect.top + this.f27633f.getCompoundPaddingTop();
    }

    public final boolean s0() {
        int iMax;
        if (this.f27633f == null || this.f27633f.getMeasuredHeight() >= (iMax = Math.max(this.f27630d.getMeasuredHeight(), this.f27629c.getMeasuredHeight()))) {
            return false;
        }
        this.f27633f.setMinimumHeight(iMax);
        return true;
    }

    public void setBoxBackgroundColor(int i9) {
        if (this.f27623S != i9) {
            this.f27623S = i9;
            this.f27595B0 = i9;
            this.f27599D0 = i9;
            this.f27601E0 = i9;
            l();
        }
    }

    public void setBoxBackgroundColorResource(int i9) {
        setBoxBackgroundColor(E.b.getColor(getContext(), i9));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f27595B0 = defaultColor;
        this.f27623S = defaultColor;
        this.f27597C0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f27599D0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f27601E0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        l();
    }

    public void setBoxBackgroundMode(int i9) {
        if (i9 == this.f27616M) {
            return;
        }
        this.f27616M = i9;
        if (this.f27633f != null) {
            Q();
        }
    }

    public void setBoxCollapsedPaddingTop(int i9) {
        this.f27618N = i9;
    }

    public void setBoxStrokeColor(int i9) {
        if (this.f27674z0 != i9) {
            this.f27674z0 = i9;
            E0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.f27674z0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            E0();
        } else {
            this.f27670x0 = colorStateList.getDefaultColor();
            this.f27603F0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f27672y0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        }
        this.f27674z0 = defaultColor;
        E0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f27593A0 != colorStateList) {
            this.f27593A0 = colorStateList;
            E0();
        }
    }

    public void setBoxStrokeWidth(int i9) {
        this.f27620P = i9;
        E0();
    }

    public void setBoxStrokeWidthFocused(int i9) {
        this.f27621Q = i9;
        E0();
    }

    public void setBoxStrokeWidthFocusedResource(int i9) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i9));
    }

    public void setBoxStrokeWidthResource(int i9) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i9));
    }

    public void setCounterEnabled(boolean z9) {
        if (this.f27647m != z9) {
            if (z9) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f27653p = appCompatTextView;
                appCompatTextView.setId(R4.f.f8771K);
                Typeface typeface = this.f27627W;
                if (typeface != null) {
                    this.f27653p.setTypeface(typeface);
                }
                this.f27653p.setMaxLines(1);
                this.f27645l.e(this.f27653p, 2);
                AbstractC0976s.d((ViewGroup.MarginLayoutParams) this.f27653p.getLayoutParams(), getResources().getDimensionPixelOffset(R4.d.f8727Z));
                o0();
                l0();
            } else {
                this.f27645l.B(this.f27653p, 2);
                this.f27653p = null;
            }
            this.f27647m = z9;
        }
    }

    public void setCounterMaxLength(int i9) {
        if (this.f27649n != i9) {
            if (i9 <= 0) {
                i9 = -1;
            }
            this.f27649n = i9;
            if (this.f27647m) {
                l0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i9) {
        if (this.f27655q != i9) {
            this.f27655q = i9;
            o0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f27592A != colorStateList) {
            this.f27592A = colorStateList;
            o0();
        }
    }

    public void setCounterTextAppearance(int i9) {
        if (this.f27657r != i9) {
            this.f27657r = i9;
            o0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f27673z != colorStateList) {
            this.f27673z = colorStateList;
            o0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f27666v0 = colorStateList;
        this.f27668w0 = colorStateList;
        if (this.f27633f != null) {
            w0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        T(this, z9);
        super.setEnabled(z9);
    }

    public void setEndIconActivated(boolean z9) {
        this.f27642j0.setActivated(z9);
    }

    public void setEndIconCheckable(boolean z9) {
        this.f27642j0.setCheckable(z9);
    }

    public void setEndIconContentDescription(int i9) {
        setEndIconContentDescription(i9 != 0 ? getResources().getText(i9) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f27642j0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i9) {
        setEndIconDrawable(i9 != 0 ? AbstractC1726a.b(getContext(), i9) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f27642j0.setImageDrawable(drawable);
        if (drawable != null) {
            AbstractC2353e.a(this, this.f27642j0, this.f27646l0, this.f27648m0);
            U();
        }
    }

    public void setEndIconMode(int i9) {
        int i10 = this.f27638h0;
        if (i10 == i9) {
            return;
        }
        this.f27638h0 = i9;
        C(i10);
        setEndIconVisible(i9 != 0);
        if (getEndIconDelegate().b(this.f27616M)) {
            getEndIconDelegate().a();
            AbstractC2353e.a(this, this.f27642j0, this.f27646l0, this.f27648m0);
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f27616M + " is not supported by the end icon mode " + i9);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        b0(this.f27642j0, onClickListener, this.f27656q0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f27656q0 = onLongClickListener;
        c0(this.f27642j0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f27646l0 != colorStateList) {
            this.f27646l0 = colorStateList;
            AbstractC2353e.a(this, this.f27642j0, colorStateList, this.f27648m0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f27648m0 != mode) {
            this.f27648m0 = mode;
            AbstractC2353e.a(this, this.f27642j0, this.f27646l0, mode);
        }
    }

    public void setEndIconVisible(boolean z9) {
        if (K() != z9) {
            this.f27642j0.setVisibility(z9 ? 0 : 8);
            t0();
            C0();
            q0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f27645l.z()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f27645l.v();
        } else {
            this.f27645l.O(charSequence);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f27645l.D(charSequence);
    }

    public void setErrorEnabled(boolean z9) {
        this.f27645l.E(z9);
    }

    public void setErrorIconDrawable(int i9) {
        setErrorIconDrawable(i9 != 0 ? AbstractC1726a.b(getContext(), i9) : null);
        V();
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f27660s0.setImageDrawable(drawable);
        u0();
        AbstractC2353e.a(this, this.f27660s0, this.f27662t0, this.f27664u0);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        b0(this.f27660s0, onClickListener, this.f27658r0);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f27658r0 = onLongClickListener;
        c0(this.f27660s0, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        if (this.f27662t0 != colorStateList) {
            this.f27662t0 = colorStateList;
            AbstractC2353e.a(this, this.f27660s0, colorStateList, this.f27664u0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        if (this.f27664u0 != mode) {
            this.f27664u0 = mode;
            AbstractC2353e.a(this, this.f27660s0, this.f27662t0, mode);
        }
    }

    public void setErrorTextAppearance(int i9) {
        this.f27645l.F(i9);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f27645l.G(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z9) {
        if (this.f27609I0 != z9) {
            this.f27609I0 = z9;
            w0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (M()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!M()) {
                setHelperTextEnabled(true);
            }
            this.f27645l.P(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f27645l.J(colorStateList);
    }

    public void setHelperTextEnabled(boolean z9) {
        this.f27645l.I(z9);
    }

    public void setHelperTextTextAppearance(int i9) {
        this.f27645l.H(i9);
    }

    public void setHint(int i9) {
        setHint(i9 != 0 ? getResources().getText(i9) : null);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f27598D) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z9) {
        this.f27611J0 = z9;
    }

    public void setHintEnabled(boolean z9) {
        if (z9 != this.f27598D) {
            this.f27598D = z9;
            if (z9) {
                CharSequence hint = this.f27633f.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f27600E)) {
                        setHint(hint);
                    }
                    this.f27633f.setHint((CharSequence) null);
                }
                this.f27602F = true;
            } else {
                this.f27602F = false;
                if (!TextUtils.isEmpty(this.f27600E) && TextUtils.isEmpty(this.f27633f.getHint())) {
                    this.f27633f.setHint(this.f27600E);
                }
                setHintInternal(null);
            }
            if (this.f27633f != null) {
                v0();
            }
        }
    }

    public void setHintTextAppearance(int i9) {
        this.f27607H0.P(i9);
        this.f27668w0 = this.f27607H0.p();
        if (this.f27633f != null) {
            w0(false);
            v0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f27668w0 != colorStateList) {
            if (this.f27666v0 == null) {
                this.f27607H0.R(colorStateList);
            }
            this.f27668w0 = colorStateList;
            if (this.f27633f != null) {
                w0(false);
            }
        }
    }

    public void setMaxEms(int i9) {
        this.f27639i = i9;
        EditText editText = this.f27633f;
        if (editText == null || i9 == -1) {
            return;
        }
        editText.setMaxEms(i9);
    }

    public void setMaxWidth(int i9) {
        this.f27643k = i9;
        EditText editText = this.f27633f;
        if (editText == null || i9 == -1) {
            return;
        }
        editText.setMaxWidth(i9);
    }

    public void setMaxWidthResource(int i9) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i9));
    }

    public void setMinEms(int i9) {
        this.f27637h = i9;
        EditText editText = this.f27633f;
        if (editText == null || i9 == -1) {
            return;
        }
        editText.setMinEms(i9);
    }

    public void setMinWidth(int i9) {
        this.f27641j = i9;
        EditText editText = this.f27633f;
        if (editText == null || i9 == -1) {
            return;
        }
        editText.setMinWidth(i9);
    }

    public void setMinWidthResource(int i9) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i9));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i9) {
        setPasswordVisibilityToggleContentDescription(i9 != 0 ? getResources().getText(i9) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f27642j0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i9) {
        setPasswordVisibilityToggleDrawable(i9 != 0 ? AbstractC1726a.b(getContext(), i9) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f27642j0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z9) {
        if (z9 && this.f27638h0 != 1) {
            setEndIconMode(1);
        } else {
            if (z9) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f27646l0 = colorStateList;
        AbstractC2353e.a(this, this.f27642j0, colorStateList, this.f27648m0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f27648m0 = mode;
        AbstractC2353e.a(this, this.f27642j0, this.f27646l0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f27663u == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f27663u = appCompatTextView;
            appCompatTextView.setId(R4.f.f8774N);
            L.C0(this.f27663u, 2);
            C0673d c0673dZ = z();
            this.f27669x = c0673dZ;
            c0673dZ.a0(67L);
            this.f27671y = z();
            setPlaceholderTextAppearance(this.f27667w);
            setPlaceholderTextColor(this.f27665v);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f27661t) {
                setPlaceholderTextEnabled(true);
            }
            this.f27659s = charSequence;
        }
        z0();
    }

    public void setPlaceholderTextAppearance(int i9) {
        this.f27667w = i9;
        TextView textView = this.f27663u;
        if (textView != null) {
            T.j.o(textView, i9);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f27665v != colorStateList) {
            this.f27665v = colorStateList;
            TextView textView = this.f27663u;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f27629c.k(charSequence);
    }

    public void setPrefixTextAppearance(int i9) {
        this.f27629c.l(i9);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f27629c.m(colorStateList);
    }

    public void setStartIconCheckable(boolean z9) {
        this.f27629c.n(z9);
    }

    public void setStartIconContentDescription(int i9) {
        setStartIconContentDescription(i9 != 0 ? getResources().getText(i9) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f27629c.o(charSequence);
    }

    public void setStartIconDrawable(int i9) {
        setStartIconDrawable(i9 != 0 ? AbstractC1726a.b(getContext(), i9) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f27629c.p(drawable);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f27629c.q(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f27629c.r(onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f27629c.s(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f27629c.t(mode);
    }

    public void setStartIconVisible(boolean z9) {
        this.f27629c.u(z9);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f27594B = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f27596C.setText(charSequence);
        D0();
    }

    public void setSuffixTextAppearance(int i9) {
        T.j.o(this.f27596C, i9);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f27596C.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f27633f;
        if (editText != null) {
            L.s0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f27627W) {
            this.f27627W = typeface;
            this.f27607H0.j0(typeface);
            this.f27645l.L(typeface);
            TextView textView = this.f27653p;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public final Rect t(Rect rect) {
        if (this.f27633f == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f27625U;
        float fW = this.f27607H0.w();
        rect2.left = rect.left + this.f27633f.getCompoundPaddingLeft();
        rect2.top = s(rect, fW);
        rect2.right = rect.right - this.f27633f.getCompoundPaddingRight();
        rect2.bottom = r(rect, rect2, fW);
        return rect2;
    }

    public final void t0() {
        this.f27631e.setVisibility((this.f27642j0.getVisibility() != 0 || L()) ? 8 : 0);
        this.f27630d.setVisibility(K() || L() || ((this.f27594B == null || N()) ? '\b' : (char) 0) == 0 ? 0 : 8);
    }

    public final int u() {
        float fQ;
        if (!this.f27598D) {
            return 0;
        }
        int i9 = this.f27616M;
        if (i9 == 0) {
            fQ = this.f27607H0.q();
        } else {
            if (i9 != 2) {
                return 0;
            }
            fQ = this.f27607H0.q() / 2.0f;
        }
        return (int) fQ;
    }

    public final void u0() {
        this.f27660s0.setVisibility(getErrorIconDrawable() != null && this.f27645l.z() && this.f27645l.l() ? 0 : 8);
        t0();
        C0();
        if (I()) {
            return;
        }
        q0();
    }

    public final boolean v() {
        return this.f27616M == 2 && w();
    }

    public final void v0() {
        if (this.f27616M != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f27628a.getLayoutParams();
            int iU = u();
            if (iU != layoutParams.topMargin) {
                layoutParams.topMargin = iU;
                this.f27628a.requestLayout();
            }
        }
    }

    public final boolean w() {
        return this.f27619O > -1 && this.f27622R != 0;
    }

    public void w0(boolean z9) {
        x0(z9, false);
    }

    public final void x() {
        if (A()) {
            ((C2351c) this.f27604G).i0();
        }
    }

    public final void x0(boolean z9, boolean z10) {
        ColorStateList textColors;
        f5.b bVar;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f27633f;
        boolean z11 = false;
        boolean z12 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f27633f;
        if (editText2 != null && editText2.hasFocus()) {
            z11 = true;
        }
        boolean zL = this.f27645l.l();
        ColorStateList colorStateList = this.f27666v0;
        if (colorStateList != null) {
            this.f27607H0.R(colorStateList);
            this.f27607H0.Z(this.f27666v0);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList2 = this.f27666v0;
            int colorForState = colorStateList2 != null ? colorStateList2.getColorForState(new int[]{-16842910}, this.f27603F0) : this.f27603F0;
            this.f27607H0.R(ColorStateList.valueOf(colorForState));
            this.f27607H0.Z(ColorStateList.valueOf(colorForState));
        } else if (zL) {
            this.f27607H0.R(this.f27645l.q());
        } else {
            if (this.f27651o && (textView = this.f27653p) != null) {
                bVar = this.f27607H0;
                textColors = textView.getTextColors();
            } else if (z11 && (textColors = this.f27668w0) != null) {
                bVar = this.f27607H0;
            }
            bVar.R(textColors);
        }
        if (z12 || !this.f27609I0 || (isEnabled() && z11)) {
            if (z10 || this.f27605G0) {
                y(z9);
                return;
            }
            return;
        }
        if (z10 || !this.f27605G0) {
            F(z9);
        }
    }

    public final void y(boolean z9) {
        ValueAnimator valueAnimator = this.f27613K0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f27613K0.cancel();
        }
        if (z9 && this.f27611J0) {
            k(1.0f);
        } else {
            this.f27607H0.d0(1.0f);
        }
        this.f27605G0 = false;
        if (A()) {
            R();
        }
        z0();
        this.f27629c.i(false);
        D0();
    }

    public final void y0() {
        EditText editText;
        if (this.f27663u == null || (editText = this.f27633f) == null) {
            return;
        }
        this.f27663u.setGravity(editText.getGravity());
        this.f27663u.setPadding(this.f27633f.getCompoundPaddingLeft(), this.f27633f.getCompoundPaddingTop(), this.f27633f.getCompoundPaddingRight(), this.f27633f.getCompoundPaddingBottom());
    }

    public final C0673d z() {
        C0673d c0673d = new C0673d();
        c0673d.V(87L);
        c0673d.X(S4.a.f9409a);
        return c0673d;
    }

    public final void z0() {
        EditText editText = this.f27633f;
        A0(editText == null ? 0 : editText.getText().length());
    }
}
