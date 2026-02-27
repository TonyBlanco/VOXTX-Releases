package a4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class X {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f11531A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f11532B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.ui.e f11534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f11535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f11536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ViewGroup f11537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ViewGroup f11538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ViewGroup f11539f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ViewGroup f11540g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ViewGroup f11541h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ViewGroup f11542i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f11543j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f11544k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AnimatorSet f11545l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AnimatorSet f11546m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AnimatorSet f11547n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AnimatorSet f11548o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AnimatorSet f11549p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ValueAnimator f11550q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ValueAnimator f11551r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Runnable f11552s = new Runnable() { // from class: a4.J
        @Override // java.lang.Runnable
        public final void run() {
            this.f11518a.c0();
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Runnable f11553t = new Runnable() { // from class: a4.P
        @Override // java.lang.Runnable
        public final void run() {
            this.f11524a.D();
        }
    };

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Runnable f11554u = new Runnable() { // from class: a4.Q
        @Override // java.lang.Runnable
        public final void run() {
            this.f11525a.H();
        }
    };

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Runnable f11555v = new Runnable() { // from class: a4.S
        @Override // java.lang.Runnable
        public final void run() {
            this.f11526a.G();
        }
    };

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Runnable f11556w = new Runnable() { // from class: a4.T
        @Override // java.lang.Runnable
        public final void run() {
            this.f11527a.E();
        }
    };

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final View.OnLayoutChangeListener f11557x = new View.OnLayoutChangeListener() { // from class: a4.U
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f11528a.R(view, i9, i10, i11, i12, i13, i14, i15, i16);
        }
    };

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f11533C = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f11559z = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List f11558y = new ArrayList();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (X.this.f11535b != null) {
                X.this.f11535b.setVisibility(4);
            }
            if (X.this.f11536c != null) {
                X.this.f11536c.setVisibility(4);
            }
            if (X.this.f11538e != null) {
                X.this.f11538e.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!(X.this.f11543j instanceof com.google.android.exoplayer2.ui.b) || X.this.f11531A) {
                return;
            }
            ((com.google.android.exoplayer2.ui.b) X.this.f11543j).h(250L);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (X.this.f11535b != null) {
                X.this.f11535b.setVisibility(0);
            }
            if (X.this.f11536c != null) {
                X.this.f11536c.setVisibility(0);
            }
            if (X.this.f11538e != null) {
                X.this.f11538e.setVisibility(X.this.f11531A ? 0 : 4);
            }
            if (!(X.this.f11543j instanceof com.google.android.exoplayer2.ui.b) || X.this.f11531A) {
                return;
            }
            ((com.google.android.exoplayer2.ui.b) X.this.f11543j).u(250L);
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.exoplayer2.ui.e f11562a;

        public c(com.google.android.exoplayer2.ui.e eVar) {
            this.f11562a = eVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            X.this.Z(1);
            if (X.this.f11532B) {
                this.f11562a.post(X.this.f11552s);
                X.this.f11532B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            X.this.Z(3);
        }
    }

    public class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.exoplayer2.ui.e f11564a;

        public d(com.google.android.exoplayer2.ui.e eVar) {
            this.f11564a = eVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            X.this.Z(2);
            if (X.this.f11532B) {
                this.f11564a.post(X.this.f11552s);
                X.this.f11532B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            X.this.Z(3);
        }
    }

    public class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.exoplayer2.ui.e f11566a;

        public e(com.google.android.exoplayer2.ui.e eVar) {
            this.f11566a = eVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            X.this.Z(2);
            if (X.this.f11532B) {
                this.f11566a.post(X.this.f11552s);
                X.this.f11532B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            X.this.Z(3);
        }
    }

    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            X.this.Z(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            X.this.Z(4);
        }
    }

    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            X.this.Z(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            X.this.Z(4);
        }
    }

    public class h extends AnimatorListenerAdapter {
        public h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (X.this.f11539f != null) {
                X.this.f11539f.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (X.this.f11541h != null) {
                X.this.f11541h.setVisibility(0);
                X.this.f11541h.setTranslationX(X.this.f11541h.getWidth());
                X.this.f11541h.scrollTo(X.this.f11541h.getWidth(), 0);
            }
        }
    }

    public class i extends AnimatorListenerAdapter {
        public i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (X.this.f11541h != null) {
                X.this.f11541h.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (X.this.f11539f != null) {
                X.this.f11539f.setVisibility(0);
            }
        }
    }

    public X(com.google.android.exoplayer2.ui.e eVar) {
        this.f11534a = eVar;
        this.f11535b = eVar.findViewById(AbstractC1104s.f11685l);
        this.f11536c = (ViewGroup) eVar.findViewById(AbstractC1104s.f11680g);
        this.f11538e = (ViewGroup) eVar.findViewById(AbstractC1104s.f11695v);
        ViewGroup viewGroup = (ViewGroup) eVar.findViewById(AbstractC1104s.f11678e);
        this.f11537d = viewGroup;
        this.f11542i = (ViewGroup) eVar.findViewById(AbstractC1104s.f11670T);
        View viewFindViewById = eVar.findViewById(AbstractC1104s.f11658H);
        this.f11543j = viewFindViewById;
        this.f11539f = (ViewGroup) eVar.findViewById(AbstractC1104s.f11677d);
        this.f11540g = (ViewGroup) eVar.findViewById(AbstractC1104s.f11688o);
        this.f11541h = (ViewGroup) eVar.findViewById(AbstractC1104s.f11689p);
        View viewFindViewById2 = eVar.findViewById(AbstractC1104s.f11699z);
        this.f11544k = viewFindViewById2;
        View viewFindViewById3 = eVar.findViewById(AbstractC1104s.f11698y);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: a4.V
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f11529a.T(view);
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: a4.V
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f11529a.T(view);
                }
            });
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: a4.W
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f11530a.J(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new a());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: a4.K
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f11519a.K(valueAnimator);
            }
        });
        valueAnimatorOfFloat2.addListener(new b());
        Resources resources = eVar.getResources();
        float dimension = resources.getDimension(AbstractC1102p.f11628b) - resources.getDimension(AbstractC1102p.f11629c);
        float dimension2 = resources.getDimension(AbstractC1102p.f11628b);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f11545l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new c(eVar));
        animatorSet.play(valueAnimatorOfFloat).with(N(0.0f, dimension, viewFindViewById)).with(N(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f11546m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new d(eVar));
        animatorSet2.play(N(dimension, dimension2, viewFindViewById)).with(N(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f11547n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new e(eVar));
        animatorSet3.play(valueAnimatorOfFloat).with(N(0.0f, dimension2, viewFindViewById)).with(N(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f11548o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new f());
        animatorSet4.play(valueAnimatorOfFloat2).with(N(dimension, 0.0f, viewFindViewById)).with(N(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f11549p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new g());
        animatorSet5.play(valueAnimatorOfFloat2).with(N(dimension2, 0.0f, viewFindViewById)).with(N(dimension2, 0.0f, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f11550q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: a4.N
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f11522a.L(valueAnimator);
            }
        });
        valueAnimatorOfFloat3.addListener(new h());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f11551r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: a4.O
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f11523a.M(valueAnimator);
            }
        });
        valueAnimatorOfFloat4.addListener(new i());
    }

    public static int B(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    public static ObjectAnimator N(float f9, float f10, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f9, f10);
    }

    public static int z(View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return height;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public boolean A(View view) {
        return view != null && this.f11558y.contains(view);
    }

    public void C() {
        int i9 = this.f11559z;
        if (i9 == 3 || i9 == 2) {
            return;
        }
        V();
        if (!this.f11533C) {
            E();
        } else if (this.f11559z == 1) {
            H();
        } else {
            D();
        }
    }

    public final void D() {
        this.f11547n.start();
    }

    public final void E() {
        Z(2);
    }

    public void F() {
        int i9 = this.f11559z;
        if (i9 == 3 || i9 == 2) {
            return;
        }
        V();
        E();
    }

    public final void G() {
        this.f11545l.start();
        U(this.f11554u, 2000L);
    }

    public final void H() {
        this.f11546m.start();
    }

    public boolean I() {
        return this.f11559z == 0 && this.f11534a.d0();
    }

    public final /* synthetic */ void J(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f11535b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = this.f11536c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = this.f11538e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    public final /* synthetic */ void K(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f11535b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = this.f11536c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = this.f11538e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    public final /* synthetic */ void L(ValueAnimator valueAnimator) {
        y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public final /* synthetic */ void M(ValueAnimator valueAnimator) {
        y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void O() {
        this.f11534a.addOnLayoutChangeListener(this.f11557x);
    }

    public void P() {
        this.f11534a.removeOnLayoutChangeListener(this.f11557x);
    }

    public void Q(boolean z9, int i9, int i10, int i11, int i12) {
        View view = this.f11535b;
        if (view != null) {
            view.layout(0, 0, i11 - i9, i12 - i10);
        }
    }

    public final void R(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean zE0 = e0();
        if (this.f11531A != zE0) {
            this.f11531A = zE0;
            view.post(new Runnable() { // from class: a4.L
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11520a.d0();
                }
            });
        }
        boolean z9 = i11 - i9 != i15 - i13;
        if (this.f11531A || !z9) {
            return;
        }
        view.post(new Runnable() { // from class: a4.M
            @Override // java.lang.Runnable
            public final void run() {
                this.f11521a.S();
            }
        });
    }

    public final void S() {
        int i9;
        if (this.f11539f == null || this.f11540g == null) {
            return;
        }
        int width = (this.f11534a.getWidth() - this.f11534a.getPaddingLeft()) - this.f11534a.getPaddingRight();
        while (true) {
            if (this.f11540g.getChildCount() <= 1) {
                break;
            }
            int childCount = this.f11540g.getChildCount() - 2;
            View childAt = this.f11540g.getChildAt(childCount);
            this.f11540g.removeViewAt(childCount);
            this.f11539f.addView(childAt, 0);
        }
        View view = this.f11544k;
        if (view != null) {
            view.setVisibility(8);
        }
        int iB = B(this.f11542i);
        int childCount2 = this.f11539f.getChildCount() - 1;
        for (int i10 = 0; i10 < childCount2; i10++) {
            iB += B(this.f11539f.getChildAt(i10));
        }
        if (iB <= width) {
            ViewGroup viewGroup = this.f11541h;
            if (viewGroup == null || viewGroup.getVisibility() != 0 || this.f11551r.isStarted()) {
                return;
            }
            this.f11550q.cancel();
            this.f11551r.start();
            return;
        }
        View view2 = this.f11544k;
        if (view2 != null) {
            view2.setVisibility(0);
            iB += B(this.f11544k);
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = this.f11539f.getChildAt(i11);
            iB -= B(childAt2);
            arrayList.add(childAt2);
            if (iB <= width) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f11539f.removeViews(0, arrayList.size());
        for (i9 = 0; i9 < arrayList.size(); i9++) {
            this.f11540g.addView((View) arrayList.get(i9), this.f11540g.getChildCount() - 1);
        }
    }

    public final void T(View view) {
        ValueAnimator valueAnimator;
        W();
        if (view.getId() == AbstractC1104s.f11699z) {
            valueAnimator = this.f11550q;
        } else if (view.getId() != AbstractC1104s.f11698y) {
            return;
        } else {
            valueAnimator = this.f11551r;
        }
        valueAnimator.start();
    }

    public final void U(Runnable runnable, long j9) {
        if (j9 >= 0) {
            this.f11534a.postDelayed(runnable, j9);
        }
    }

    public void V() {
        this.f11534a.removeCallbacks(this.f11556w);
        this.f11534a.removeCallbacks(this.f11553t);
        this.f11534a.removeCallbacks(this.f11555v);
        this.f11534a.removeCallbacks(this.f11554u);
    }

    public void W() {
        Runnable runnable;
        if (this.f11559z == 3) {
            return;
        }
        V();
        int showTimeoutMs = this.f11534a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.f11533C) {
                runnable = this.f11556w;
            } else {
                if (this.f11559z == 1) {
                    U(this.f11554u, 2000L);
                    return;
                }
                runnable = this.f11555v;
            }
            U(runnable, showTimeoutMs);
        }
    }

    public void X(boolean z9) {
        this.f11533C = z9;
    }

    public void Y(View view, boolean z9) {
        if (view == null) {
            return;
        }
        if (z9) {
            view.setVisibility((this.f11531A && a0(view)) ? 4 : 0);
            this.f11558y.add(view);
        } else {
            view.setVisibility(8);
            this.f11558y.remove(view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z(int r4) {
        /*
            r3 = this;
            int r0 = r3.f11559z
            r3.f11559z = r4
            r1 = 2
            if (r4 != r1) goto Lf
            com.google.android.exoplayer2.ui.e r1 = r3.f11534a
            r2 = 8
        Lb:
            r1.setVisibility(r2)
            goto L15
        Lf:
            if (r0 != r1) goto L15
            com.google.android.exoplayer2.ui.e r1 = r3.f11534a
            r2 = 0
            goto Lb
        L15:
            if (r0 == r4) goto L1c
            com.google.android.exoplayer2.ui.e r4 = r3.f11534a
            r4.e0()
        L1c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.X.Z(int):void");
    }

    public final boolean a0(View view) {
        int id = view.getId();
        return id == AbstractC1104s.f11678e || id == AbstractC1104s.f11657G || id == AbstractC1104s.f11697x || id == AbstractC1104s.f11661K || id == AbstractC1104s.f11662L || id == AbstractC1104s.f11690q || id == AbstractC1104s.f11691r;
    }

    public void b0() {
        if (!this.f11534a.d0()) {
            this.f11534a.setVisibility(0);
            this.f11534a.n0();
            this.f11534a.j0();
        }
        c0();
    }

    public final void c0() {
        AnimatorSet animatorSet;
        if (!this.f11533C) {
            Z(0);
            W();
            return;
        }
        int i9 = this.f11559z;
        if (i9 == 1) {
            animatorSet = this.f11548o;
        } else {
            if (i9 != 2) {
                if (i9 == 3) {
                    this.f11532B = true;
                } else if (i9 == 4) {
                    return;
                }
                W();
            }
            animatorSet = this.f11549p;
        }
        animatorSet.start();
        W();
    }

    public final void d0() {
        ViewGroup viewGroup = this.f11538e;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.f11531A ? 0 : 4);
        }
        if (this.f11543j != null) {
            int dimensionPixelSize = this.f11534a.getResources().getDimensionPixelSize(AbstractC1102p.f11630d);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f11543j.getLayoutParams();
            if (marginLayoutParams != null) {
                if (this.f11531A) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                this.f11543j.setLayoutParams(marginLayoutParams);
            }
            View view = this.f11543j;
            if (view instanceof com.google.android.exoplayer2.ui.b) {
                com.google.android.exoplayer2.ui.b bVar = (com.google.android.exoplayer2.ui.b) view;
                if (this.f11531A) {
                    bVar.i(true);
                } else {
                    int i9 = this.f11559z;
                    if (i9 == 1) {
                        bVar.i(false);
                    } else if (i9 != 3) {
                        bVar.t();
                    }
                }
            }
        }
        for (View view2 : this.f11558y) {
            view2.setVisibility((this.f11531A && a0(view2)) ? 4 : 0);
        }
    }

    public final boolean e0() {
        int width = (this.f11534a.getWidth() - this.f11534a.getPaddingLeft()) - this.f11534a.getPaddingRight();
        int height = (this.f11534a.getHeight() - this.f11534a.getPaddingBottom()) - this.f11534a.getPaddingTop();
        int iB = B(this.f11536c);
        ViewGroup viewGroup = this.f11536c;
        int paddingLeft = iB - (viewGroup != null ? viewGroup.getPaddingLeft() + this.f11536c.getPaddingRight() : 0);
        int iZ = z(this.f11536c);
        ViewGroup viewGroup2 = this.f11536c;
        return width <= Math.max(paddingLeft, B(this.f11542i) + B(this.f11544k)) || height <= (iZ - (viewGroup2 != null ? viewGroup2.getPaddingTop() + this.f11536c.getPaddingBottom() : 0)) + (z(this.f11537d) * 2);
    }

    public final void y(float f9) {
        if (this.f11541h != null) {
            this.f11541h.setTranslationX((int) (r0.getWidth() * (1.0f - f9)));
        }
        ViewGroup viewGroup = this.f11542i;
        if (viewGroup != null) {
            viewGroup.setAlpha(1.0f - f9);
        }
        ViewGroup viewGroup2 = this.f11539f;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f9);
        }
    }
}
