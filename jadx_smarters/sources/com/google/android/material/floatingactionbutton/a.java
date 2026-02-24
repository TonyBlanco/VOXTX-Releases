package com.google.android.material.floatingactionbutton;

import P.L;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import e5.C1743a;
import g5.AbstractC1837a;
import j5.AbstractC2100b;
import java.util.ArrayList;
import java.util.Iterator;
import k5.InterfaceC2149b;
import l5.C2198g;
import l5.n;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final TimeInterpolator f27402D = S4.a.f9411c;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int[] f27403E = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int[] f27404F = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int[] f27405G = {R.attr.state_focused, R.attr.state_enabled};

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int[] f27406H = {R.attr.state_hovered, R.attr.state_enabled};

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int[] f27407I = {R.attr.state_enabled};

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int[] f27408J = new int[0];

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ViewTreeObserver.OnPreDrawListener f27411C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l5.k f27412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C2198g f27413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f27414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1743a f27415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f27416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f27417f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f27419h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f27420i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f27421j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27422k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f5.i f27423l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Animator f27424m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public S4.f f27425n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public S4.f f27426o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f27427p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f27429r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f27431t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f27432u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f27433v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final FloatingActionButton f27434w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final InterfaceC2149b f27435x;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f27418g = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f27428q = 1.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f27430s = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Rect f27436y = new Rect();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final RectF f27437z = new RectF();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final RectF f27409A = new RectF();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Matrix f27410B = new Matrix();

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.a$a, reason: collision with other inner class name */
    public class C0261a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f27438a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f27439c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f27440d;

        public C0261a(boolean z9, k kVar) {
            this.f27439c = z9;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f27438a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f27430s = 0;
            a.this.f27424m = null;
            if (this.f27438a) {
                return;
            }
            FloatingActionButton floatingActionButton = a.this.f27434w;
            boolean z9 = this.f27439c;
            floatingActionButton.b(z9 ? 8 : 4, z9);
            k kVar = this.f27440d;
            if (kVar != null) {
                kVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f27434w.b(0, this.f27439c);
            a.this.f27430s = 1;
            a.this.f27424m = animator;
            this.f27438a = false;
        }
    }

    public class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f27442a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f27443c;

        public b(boolean z9, k kVar) {
            this.f27442a = z9;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f27430s = 0;
            a.this.f27424m = null;
            k kVar = this.f27443c;
            if (kVar != null) {
                kVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f27434w.b(0, this.f27442a);
            a.this.f27430s = 2;
            a.this.f27424m = animator;
        }
    }

    public class c extends S4.e {
        public c() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f9, Matrix matrix, Matrix matrix2) {
            a.this.f27428q = f9;
            return super.evaluate(f9, matrix, matrix2);
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f27446a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f27447c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f27448d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f27449e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f27450f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ float f27451g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ float f27452h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Matrix f27453i;

        public d(float f9, float f10, float f11, float f12, float f13, float f14, float f15, Matrix matrix) {
            this.f27446a = f9;
            this.f27447c = f10;
            this.f27448d = f11;
            this.f27449e = f12;
            this.f27450f = f13;
            this.f27451g = f14;
            this.f27452h = f15;
            this.f27453i = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f27434w.setAlpha(S4.a.b(this.f27446a, this.f27447c, 0.0f, 0.2f, fFloatValue));
            a.this.f27434w.setScaleX(S4.a.a(this.f27448d, this.f27449e, fFloatValue));
            a.this.f27434w.setScaleY(S4.a.a(this.f27450f, this.f27449e, fFloatValue));
            a.this.f27428q = S4.a.a(this.f27451g, this.f27452h, fFloatValue);
            a.this.e(S4.a.a(this.f27451g, this.f27452h, fFloatValue), this.f27453i);
            a.this.f27434w.setImageMatrix(this.f27453i);
        }
    }

    public class e implements TypeEvaluator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public FloatEvaluator f27455a = new FloatEvaluator();

        public e() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f9, Float f10, Float f11) {
            float fFloatValue = this.f27455a.evaluate(f9, (Number) f10, (Number) f11).floatValue();
            if (fFloatValue < 0.1f) {
                fFloatValue = 0.0f;
            }
            return Float.valueOf(fFloatValue);
        }
    }

    public class f implements ViewTreeObserver.OnPreDrawListener {
        public f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a.this.D();
            return true;
        }
    }

    public class g extends m {
        public g() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        public float a() {
            return 0.0f;
        }
    }

    public class h extends m {
        public h() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        public float a() {
            a aVar = a.this;
            return aVar.f27419h + aVar.f27420i;
        }
    }

    public class i extends m {
        public i() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        public float a() {
            a aVar = a.this;
            return aVar.f27419h + aVar.f27421j;
        }
    }

    public interface j {
        void a();

        void b();
    }

    public interface k {
        void a();

        void b();
    }

    public class l extends m {
        public l() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        public float a() {
            return a.this.f27419h;
        }
    }

    public abstract class m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f27462a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f27463c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f27464d;

        public m() {
        }

        public /* synthetic */ m(a aVar, C0261a c0261a) {
            this();
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.c0((int) this.f27464d);
            this.f27462a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f27462a) {
                C2198g c2198g = a.this.f27413b;
                this.f27463c = c2198g == null ? 0.0f : c2198g.w();
                this.f27464d = a();
                this.f27462a = true;
            }
            a aVar = a.this;
            float f9 = this.f27463c;
            aVar.c0((int) (f9 + ((this.f27464d - f9) * valueAnimator.getAnimatedFraction())));
        }
    }

    public a(FloatingActionButton floatingActionButton, InterfaceC2149b interfaceC2149b) {
        this.f27434w = floatingActionButton;
        this.f27435x = interfaceC2149b;
        f5.i iVar = new f5.i();
        this.f27423l = iVar;
        iVar.a(f27403E, h(new i()));
        iVar.a(f27404F, h(new h()));
        iVar.a(f27405G, h(new h()));
        iVar.a(f27406H, h(new h()));
        iVar.a(f27407I, h(new l()));
        iVar.a(f27408J, h(new g()));
        this.f27427p = floatingActionButton.getRotation();
    }

    public abstract void A(int[] iArr);

    public abstract void B(float f9, float f10, float f11);

    public void C(Rect rect) {
        InterfaceC2149b interfaceC2149b;
        Drawable insetDrawable;
        O.h.g(this.f27416e, "Didn't initialize content background");
        if (V()) {
            insetDrawable = new InsetDrawable(this.f27416e, rect.left, rect.top, rect.right, rect.bottom);
            interfaceC2149b = this.f27435x;
        } else {
            interfaceC2149b = this.f27435x;
            insetDrawable = this.f27416e;
        }
        interfaceC2149b.b(insetDrawable);
    }

    public void D() {
        float rotation = this.f27434w.getRotation();
        if (this.f27427p != rotation) {
            this.f27427p = rotation;
            Z();
        }
    }

    public void E() {
        ArrayList arrayList = this.f27433v;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((j) it.next()).b();
            }
        }
    }

    public void F() {
        ArrayList arrayList = this.f27433v;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((j) it.next()).a();
            }
        }
    }

    public abstract boolean G();

    public void H(ColorStateList colorStateList) {
        C2198g c2198g = this.f27413b;
        if (c2198g != null) {
            c2198g.setTintList(colorStateList);
        }
        C1743a c1743a = this.f27415d;
        if (c1743a != null) {
            c1743a.c(colorStateList);
        }
    }

    public void I(PorterDuff.Mode mode) {
        C2198g c2198g = this.f27413b;
        if (c2198g != null) {
            c2198g.setTintMode(mode);
        }
    }

    public final void J(float f9) {
        if (this.f27419h != f9) {
            this.f27419h = f9;
            B(f9, this.f27420i, this.f27421j);
        }
    }

    public void K(boolean z9) {
        this.f27417f = z9;
    }

    public final void L(S4.f fVar) {
        this.f27426o = fVar;
    }

    public final void M(float f9) {
        if (this.f27420i != f9) {
            this.f27420i = f9;
            B(this.f27419h, f9, this.f27421j);
        }
    }

    public final void N(float f9) {
        this.f27428q = f9;
        Matrix matrix = this.f27410B;
        e(f9, matrix);
        this.f27434w.setImageMatrix(matrix);
    }

    public final void O(int i9) {
        if (this.f27429r != i9) {
            this.f27429r = i9;
            a0();
        }
    }

    public void P(int i9) {
        this.f27422k = i9;
    }

    public final void Q(float f9) {
        if (this.f27421j != f9) {
            this.f27421j = f9;
            B(this.f27419h, this.f27420i, f9);
        }
    }

    public void R(ColorStateList colorStateList) {
        Drawable drawable = this.f27414c;
        if (drawable != null) {
            H.a.o(drawable, AbstractC2100b.d(colorStateList));
        }
    }

    public void S(boolean z9) {
        this.f27418g = z9;
        b0();
    }

    public final void T(l5.k kVar) {
        this.f27412a = kVar;
        C2198g c2198g = this.f27413b;
        if (c2198g != null) {
            c2198g.setShapeAppearanceModel(kVar);
        }
        Object obj = this.f27414c;
        if (obj instanceof n) {
            ((n) obj).setShapeAppearanceModel(kVar);
        }
        C1743a c1743a = this.f27415d;
        if (c1743a != null) {
            c1743a.f(kVar);
        }
    }

    public final void U(S4.f fVar) {
        this.f27425n = fVar;
    }

    public abstract boolean V();

    public final boolean W() {
        return L.W(this.f27434w) && !this.f27434w.isInEditMode();
    }

    public final boolean X() {
        return !this.f27417f || this.f27434w.getSizeDimension() >= this.f27422k;
    }

    public void Y(k kVar, boolean z9) {
        if (v()) {
            return;
        }
        Animator animator = this.f27424m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z10 = this.f27425n == null;
        if (!W()) {
            this.f27434w.b(0, z9);
            this.f27434w.setAlpha(1.0f);
            this.f27434w.setScaleY(1.0f);
            this.f27434w.setScaleX(1.0f);
            N(1.0f);
            if (kVar != null) {
                kVar.a();
                return;
            }
            return;
        }
        if (this.f27434w.getVisibility() != 0) {
            this.f27434w.setAlpha(0.0f);
            this.f27434w.setScaleY(z10 ? 0.4f : 0.0f);
            this.f27434w.setScaleX(z10 ? 0.4f : 0.0f);
            N(z10 ? 0.4f : 0.0f);
        }
        S4.f fVar = this.f27425n;
        AnimatorSet animatorSetF = fVar != null ? f(fVar, 1.0f, 1.0f, 1.0f) : g(1.0f, 1.0f, 1.0f);
        animatorSetF.addListener(new b(z9, kVar));
        ArrayList arrayList = this.f27431t;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetF.addListener((Animator.AnimatorListener) it.next());
            }
        }
        animatorSetF.start();
    }

    public abstract void Z();

    public final void a0() {
        N(this.f27428q);
    }

    public final void b0() {
        Rect rect = this.f27436y;
        o(rect);
        C(rect);
        this.f27435x.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void c0(float f9) {
        C2198g c2198g = this.f27413b;
        if (c2198g != null) {
            c2198g.V(f9);
        }
    }

    public final void d0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new e());
    }

    public final void e(float f9, Matrix matrix) {
        matrix.reset();
        if (this.f27434w.getDrawable() == null || this.f27429r == 0) {
            return;
        }
        RectF rectF = this.f27437z;
        RectF rectF2 = this.f27409A;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i9 = this.f27429r;
        rectF2.set(0.0f, 0.0f, i9, i9);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i10 = this.f27429r;
        matrix.postScale(f9, f9, i10 / 2.0f, i10 / 2.0f);
    }

    public final AnimatorSet f(S4.f fVar, float f9, float f10, float f11) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27434w, (Property<FloatingActionButton, Float>) View.ALPHA, f9);
        fVar.e("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f27434w, (Property<FloatingActionButton, Float>) View.SCALE_X, f10);
        fVar.e("scale").a(objectAnimatorOfFloat2);
        d0(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f27434w, (Property<FloatingActionButton, Float>) View.SCALE_Y, f10);
        fVar.e("scale").a(objectAnimatorOfFloat3);
        d0(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        e(f11, this.f27410B);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f27434w, new S4.d(), new c(), new Matrix(this.f27410B));
        fVar.e("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        S4.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet g(float f9, float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new d(this.f27434w.getAlpha(), f9, this.f27434w.getScaleX(), f10, this.f27434w.getScaleY(), this.f27428q, f11, new Matrix(this.f27410B)));
        arrayList.add(valueAnimatorOfFloat);
        S4.b.a(animatorSet, arrayList);
        animatorSet.setDuration(AbstractC1837a.d(this.f27434w.getContext(), R4.b.f8690y, this.f27434w.getContext().getResources().getInteger(R4.g.f8804b)));
        animatorSet.setInterpolator(AbstractC1837a.e(this.f27434w.getContext(), R4.b.f8691z, S4.a.f9410b));
        return animatorSet;
    }

    public final ValueAnimator h(m mVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f27402D);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(mVar);
        valueAnimator.addUpdateListener(mVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public final Drawable i() {
        return this.f27416e;
    }

    public abstract float j();

    public boolean k() {
        return this.f27417f;
    }

    public final S4.f l() {
        return this.f27426o;
    }

    public float m() {
        return this.f27420i;
    }

    public final ViewTreeObserver.OnPreDrawListener n() {
        if (this.f27411C == null) {
            this.f27411C = new f();
        }
        return this.f27411C;
    }

    public void o(Rect rect) {
        int sizeDimension = this.f27417f ? (this.f27422k - this.f27434w.getSizeDimension()) / 2 : 0;
        int iMax = Math.max(sizeDimension, (int) Math.ceil(this.f27418g ? j() + this.f27421j : 0.0f));
        int iMax2 = Math.max(sizeDimension, (int) Math.ceil(r1 * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    public float p() {
        return this.f27421j;
    }

    public final l5.k q() {
        return this.f27412a;
    }

    public final S4.f r() {
        return this.f27425n;
    }

    public void s(k kVar, boolean z9) {
        if (u()) {
            return;
        }
        Animator animator = this.f27424m;
        if (animator != null) {
            animator.cancel();
        }
        if (!W()) {
            this.f27434w.b(z9 ? 8 : 4, z9);
            if (kVar != null) {
                kVar.b();
                return;
            }
            return;
        }
        S4.f fVar = this.f27426o;
        AnimatorSet animatorSetF = fVar != null ? f(fVar, 0.0f, 0.0f, 0.0f) : g(0.0f, 0.4f, 0.4f);
        animatorSetF.addListener(new C0261a(z9, kVar));
        ArrayList arrayList = this.f27432u;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetF.addListener((Animator.AnimatorListener) it.next());
            }
        }
        animatorSetF.start();
    }

    public abstract void t(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i9);

    public boolean u() {
        return this.f27434w.getVisibility() == 0 ? this.f27430s == 1 : this.f27430s != 2;
    }

    public boolean v() {
        return this.f27434w.getVisibility() != 0 ? this.f27430s == 2 : this.f27430s != 1;
    }

    public abstract void w();

    public void x() {
        C2198g c2198g = this.f27413b;
        if (c2198g != null) {
            l5.h.f(this.f27434w, c2198g);
        }
        if (G()) {
            this.f27434w.getViewTreeObserver().addOnPreDrawListener(n());
        }
    }

    public abstract void y();

    public void z() {
        ViewTreeObserver viewTreeObserver = this.f27434w.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f27411C;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f27411C = null;
        }
    }
}
