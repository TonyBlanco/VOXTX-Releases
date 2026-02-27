package com.onesignal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.webkit.WebView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import com.onesignal.C1586t;
import com.onesignal.F1;
import com.onesignal.v2;

/* JADX INFO: loaded from: classes4.dex */
public class F {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f38197v = Color.parseColor("#00000000");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f38198w = Color.parseColor("#BB000000");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f38199x = C1.b(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PopupWindow f38200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f38201b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38204e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public double f38209j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f38210k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f38213n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public A0 f38214o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public v2.m f38215p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public WebView f38216q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RelativeLayout f38217r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C1586t f38218s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public j f38219t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Runnable f38220u;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f38202c = new Handler();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f38205f = C1.b(24);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f38206g = C1.b(24);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f38207h = C1.b(24);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f38208i = C1.b(24);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f38211l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f38212m = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38203d = -1;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f38221a;

        public a(int i9) {
            this.f38221a = i9;
        }

        @Override // java.lang.Runnable
        public void run() {
            F1.v vVar;
            String str;
            if (F.this.f38216q == null) {
                vVar = F1.v.WARN;
                str = "WebView height update skipped, new height will be used once it is displayed.";
            } else {
                ViewGroup.LayoutParams layoutParams = F.this.f38216q.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = this.f38221a;
                    F.this.f38216q.setLayoutParams(layoutParams);
                    if (F.this.f38218s != null) {
                        C1586t c1586t = F.this.f38218s;
                        F f9 = F.this;
                        c1586t.i(f9.F(this.f38221a, f9.f38215p, F.this.f38213n));
                        return;
                    }
                    return;
                }
                vVar = F1.v.WARN;
                str = "WebView height update skipped because of null layoutParams, new height will be used once it is displayed.";
            }
            F1.c1(vVar, str);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RelativeLayout.LayoutParams f38223a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ RelativeLayout.LayoutParams f38224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C1586t.c f38225d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ v2.m f38226e;

        public b(RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, C1586t.c cVar, v2.m mVar) {
            this.f38223a = layoutParams;
            this.f38224c = layoutParams2;
            this.f38225d = cVar;
            this.f38226e = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (F.this.f38216q == null) {
                return;
            }
            F.this.f38216q.setLayoutParams(this.f38223a);
            Context applicationContext = F.this.f38201b.getApplicationContext();
            F.this.S(applicationContext, this.f38224c, this.f38225d);
            F.this.T(applicationContext);
            F f9 = F.this;
            f9.H(f9.f38217r);
            if (F.this.f38219t != null) {
                F f10 = F.this;
                f10.z(this.f38226e, f10.f38218s, F.this.f38217r);
            }
            F.this.Y();
        }
    }

    public class c implements C1586t.b {
        public c() {
        }

        @Override // com.onesignal.C1586t.b
        public void a() {
            F.this.f38212m = false;
        }

        @Override // com.onesignal.C1586t.b
        public void b() {
            F.this.f38212m = true;
        }

        @Override // com.onesignal.C1586t.b
        public void onDismiss() {
            if (F.this.f38219t != null) {
                F.this.f38219t.c();
            }
            F.this.L(null);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (F.this.f38219t != null) {
                F.this.f38219t.c();
            }
            if (F.this.f38201b == null) {
                F.this.f38211l = true;
            } else {
                F.this.K(null);
                F.this.f38220u = null;
            }
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f38230a;

        public e(Activity activity) {
            this.f38230a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            F.this.I(this.f38230a);
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v2.l f38232a;

        public f(v2.l lVar) {
            this.f38232a = lVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (F.this.f38210k && F.this.f38217r != null) {
                F f9 = F.this;
                f9.v(f9.f38217r, this.f38232a);
                return;
            }
            F.this.C();
            v2.l lVar = this.f38232a;
            if (lVar != null) {
                lVar.a();
            }
        }
    }

    public class g implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CardView f38234a;

        public g(CardView cardView) {
            this.f38234a = cardView;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (Build.VERSION.SDK_INT == 23) {
                this.f38234a.setCardElevation(C1.b(5));
            }
            if (F.this.f38219t != null) {
                F.this.f38219t.a();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v2.l f38236a;

        public h(v2.l lVar) {
            this.f38236a = lVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            F.this.C();
            v2.l lVar = this.f38236a;
            if (lVar != null) {
                lVar.a();
            }
        }
    }

    public static /* synthetic */ class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38238a;

        static {
            int[] iArr = new int[v2.m.values().length];
            f38238a = iArr;
            try {
                iArr[v2.m.TOP_BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38238a[v2.m.BOTTOM_BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38238a[v2.m.CENTER_MODAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38238a[v2.m.FULL_SCREEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface j {
        void a();

        void b();

        void c();
    }

    public F(WebView webView, A0 a02, boolean z9) {
        this.f38213n = false;
        this.f38216q = webView;
        this.f38215p = a02.c();
        this.f38204e = a02.d();
        this.f38209j = a02.b() == null ? 0.0d : a02.b().doubleValue();
        v2.m mVar = this.f38215p;
        this.f38210k = !false;
        this.f38213n = z9;
        this.f38214o = a02;
        Q(a02);
    }

    public final void A(View view, int i9, Animation.AnimationListener animationListener) {
        H1.a(view, (-i9) - this.f38207h, 0.0f, 1000, new J1(0.1d, 8.0d), animationListener).start();
    }

    public void B() {
        if (this.f38211l) {
            this.f38211l = false;
            L(null);
        }
    }

    public final void C() {
        P();
        j jVar = this.f38219t;
        if (jVar != null) {
            jVar.b();
        }
    }

    public final Animation.AnimationListener D(CardView cardView) {
        return new g(cardView);
    }

    public final CardView E(Context context) {
        CardView cardView = new CardView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f38215p == v2.m.FULL_SCREEN ? -1 : -2);
        layoutParams.addRule(13);
        cardView.setLayoutParams(layoutParams);
        cardView.setCardElevation(Build.VERSION.SDK_INT == 23 ? 0.0f : C1.b(5));
        cardView.setRadius(C1.b(8));
        cardView.setClipChildren(false);
        cardView.setClipToPadding(false);
        cardView.setPreventCornerOverlap(false);
        cardView.setCardBackgroundColor(0);
        return cardView;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.onesignal.C1586t.c F(int r5, com.onesignal.v2.m r6, boolean r7) {
        /*
            r4 = this;
            com.onesignal.t$c r0 = new com.onesignal.t$c
            r0.<init>()
            int r1 = r4.f38206g
            r0.f38852d = r1
            int r1 = r4.f38207h
            r0.f38850b = r1
            r0.f38856h = r7
            r0.f38854f = r5
            int r7 = r4.N()
            r0.f38853e = r7
            int[] r7 = com.onesignal.F.i.f38238a
            int r1 = r6.ordinal()
            r7 = r7[r1]
            r1 = 1
            if (r7 == r1) goto L58
            r2 = 2
            if (r7 == r2) goto L49
            r3 = 3
            if (r7 == r3) goto L38
            r5 = 4
            if (r7 == r5) goto L2c
            goto L5e
        L2c:
            int r5 = r4.N()
            int r7 = r4.f38208i
            int r3 = r4.f38207h
            int r7 = r7 + r3
            int r5 = r5 - r7
            r0.f38854f = r5
        L38:
            int r7 = r4.N()
            int r7 = r7 / r2
            int r5 = r5 / r2
            int r7 = r7 - r5
            int r5 = com.onesignal.F.f38199x
            int r5 = r5 + r7
            r0.f38851c = r5
            r0.f38850b = r7
            r0.f38849a = r7
            goto L5e
        L49:
            int r7 = r4.N()
            int r7 = r7 - r5
            r0.f38849a = r7
            int r5 = r4.f38208i
            int r7 = com.onesignal.F.f38199x
            int r5 = r5 + r7
        L55:
            r0.f38851c = r5
            goto L5e
        L58:
            int r5 = r4.f38207h
            int r7 = com.onesignal.F.f38199x
            int r5 = r5 - r7
            goto L55
        L5e:
            com.onesignal.v2$m r5 = com.onesignal.v2.m.TOP_BANNER
            if (r6 != r5) goto L63
            r1 = 0
        L63:
            r0.f38855g = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.F.F(int, com.onesignal.v2$m, boolean):com.onesignal.t$c");
    }

    public final RelativeLayout.LayoutParams G() {
        int i9;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f38203d, -1);
        int i10 = i.f38238a[this.f38215p.ordinal()];
        if (i10 == 1) {
            i9 = 10;
        } else {
            if (i10 != 2) {
                if (i10 == 3 || i10 == 4) {
                    layoutParams.addRule(13);
                }
                return layoutParams;
            }
            i9 = 12;
        }
        layoutParams.addRule(i9);
        layoutParams.addRule(14);
        return layoutParams;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(android.widget.RelativeLayout r5) {
        /*
            r4 = this;
            android.widget.PopupWindow r0 = new android.widget.PopupWindow
            boolean r1 = r4.f38210k
            r2 = -1
            if (r1 == 0) goto L9
            r3 = -1
            goto Lb
        L9:
            int r3 = r4.f38203d
        Lb:
            if (r1 == 0) goto Le
            goto Lf
        Le:
            r2 = -2
        Lf:
            r1 = 1
            r0.<init>(r5, r3, r2, r1)
            r4.f38200a = r0
            android.graphics.drawable.ColorDrawable r5 = new android.graphics.drawable.ColorDrawable
            r2 = 0
            r5.<init>(r2)
            r0.setBackgroundDrawable(r5)
            android.widget.PopupWindow r5 = r4.f38200a
            r5.setTouchable(r1)
            android.widget.PopupWindow r5 = r4.f38200a
            r5.setClippingEnabled(r2)
            boolean r5 = r4.f38210k
            if (r5 != 0) goto L48
            int[] r5 = com.onesignal.F.i.f38238a
            com.onesignal.v2$m r0 = r4.f38215p
            int r0 = r0.ordinal()
            r5 = r5[r0]
            if (r5 == r1) goto L45
            r0 = 2
            if (r5 == r0) goto L42
            r0 = 3
            if (r5 == r0) goto L49
            r0 = 4
            if (r5 == r0) goto L49
            goto L48
        L42:
            r1 = 81
            goto L49
        L45:
            r1 = 49
            goto L49
        L48:
            r1 = 0
        L49:
            com.onesignal.A0 r5 = r4.f38214o
            boolean r5 = r5.g()
            if (r5 == 0) goto L54
            r5 = 1000(0x3e8, float:1.401E-42)
            goto L56
        L54:
            r5 = 1003(0x3eb, float:1.406E-42)
        L56:
            android.widget.PopupWindow r0 = r4.f38200a
            T.h.b(r0, r5)
            android.widget.PopupWindow r5 = r4.f38200a
            android.app.Activity r0 = r4.f38201b
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.view.View r0 = r0.getRootView()
            r5.showAtLocation(r0, r1, r2, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.F.H(android.widget.RelativeLayout):void");
    }

    public final void I(Activity activity) {
        if (C1.k(activity) && this.f38217r == null) {
            W(activity);
        } else {
            new Handler().postDelayed(new e(activity), 200L);
        }
    }

    public final void J() {
        this.f38217r = null;
        this.f38218s = null;
        this.f38216q = null;
    }

    public void K(v2.l lVar) {
        C1586t c1586t = this.f38218s;
        if (c1586t != null) {
            c1586t.g();
            L(lVar);
            return;
        }
        F1.b(F1.v.ERROR, "No host presenter to trigger dismiss animation, counting as dismissed already", new Throwable());
        J();
        if (lVar != null) {
            lVar.a();
        }
    }

    public final void L(v2.l lVar) {
        OSUtils.R(new f(lVar), 600);
    }

    public v2.m M() {
        return this.f38215p;
    }

    public final int N() {
        return C1.f(this.f38201b);
    }

    public boolean O() {
        return this.f38212m;
    }

    public void P() {
        F1.c1(F1.v.DEBUG, "InAppMessageView removing views");
        Runnable runnable = this.f38220u;
        if (runnable != null) {
            this.f38202c.removeCallbacks(runnable);
            this.f38220u = null;
        }
        C1586t c1586t = this.f38218s;
        if (c1586t != null) {
            c1586t.removeAllViews();
        }
        PopupWindow popupWindow = this.f38200a;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        J();
    }

    public final void Q(A0 a02) {
        this.f38207h = a02.e() ? C1.b(24) : 0;
        this.f38208i = a02.e() ? C1.b(24) : 0;
        this.f38205f = a02.f() ? C1.b(24) : 0;
        this.f38206g = a02.f() ? C1.b(24) : 0;
    }

    public void R(j jVar) {
        this.f38219t = jVar;
    }

    public final void S(Context context, RelativeLayout.LayoutParams layoutParams, C1586t.c cVar) {
        C1586t c1586t = new C1586t(context);
        this.f38218s = c1586t;
        if (layoutParams != null) {
            c1586t.setLayoutParams(layoutParams);
        }
        this.f38218s.i(cVar);
        this.f38218s.h(new c());
        if (this.f38216q.getParent() != null) {
            ((ViewGroup) this.f38216q.getParent()).removeAllViews();
        }
        CardView cardViewE = E(context);
        cardViewE.setTag("IN_APP_MESSAGE_CARD_VIEW_TAG");
        cardViewE.addView(this.f38216q);
        this.f38218s.setPadding(this.f38205f, this.f38207h, this.f38206g, this.f38208i);
        this.f38218s.setClipChildren(false);
        this.f38218s.setClipToPadding(false);
        this.f38218s.addView(cardViewE);
    }

    public final void T(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f38217r = relativeLayout;
        relativeLayout.setBackgroundDrawable(new ColorDrawable(0));
        this.f38217r.setClipChildren(false);
        this.f38217r.setClipToPadding(false);
        this.f38217r.addView(this.f38218s);
    }

    public void U(WebView webView) {
        this.f38216q = webView;
        webView.setBackgroundColor(0);
    }

    public final void V(v2.m mVar, RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, C1586t.c cVar) {
        OSUtils.S(new b(layoutParams, layoutParams2, cVar, mVar));
    }

    public void W(Activity activity) {
        this.f38201b = activity;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f38204e);
        layoutParams.addRule(13);
        RelativeLayout.LayoutParams layoutParamsG = this.f38210k ? G() : null;
        v2.m mVar = this.f38215p;
        V(mVar, layoutParams, layoutParamsG, F(this.f38204e, mVar, this.f38213n));
    }

    public void X(Activity activity) {
        I(activity);
    }

    public final void Y() {
        if (this.f38209j > 0.0d && this.f38220u == null) {
            d dVar = new d();
            this.f38220u = dVar;
            this.f38202c.postDelayed(dVar, ((long) this.f38209j) * 1000);
        }
    }

    public void Z(int i9) {
        this.f38204e = i9;
        OSUtils.S(new a(i9));
    }

    public String toString() {
        return "InAppMessageView{currentActivity=" + this.f38201b + ", pageWidth=" + this.f38203d + ", pageHeight=" + this.f38204e + ", displayDuration=" + this.f38209j + ", hasBackground=" + this.f38210k + ", shouldDismissWhenActive=" + this.f38211l + ", isDragging=" + this.f38212m + ", disableDragDismiss=" + this.f38213n + ", displayLocation=" + this.f38215p + ", webView=" + this.f38216q + '}';
    }

    public final void v(View view, v2.l lVar) {
        w(view, 400, f38198w, f38197v, new h(lVar)).start();
    }

    public final ValueAnimator w(View view, int i9, int i10, int i11, Animator.AnimatorListener animatorListener) {
        return H1.b(view, i9, i10, i11, animatorListener);
    }

    public final void x(View view, int i9, Animation.AnimationListener animationListener) {
        H1.a(view, i9 + this.f38208i, 0.0f, 1000, new J1(0.1d, 8.0d), animationListener).start();
    }

    public final void y(View view, View view2, Animation.AnimationListener animationListener, Animator.AnimatorListener animatorListener) {
        Animation animationC = H1.c(view, 1000, new J1(0.1d, 8.0d), animationListener);
        ValueAnimator valueAnimatorW = w(view2, 400, f38197v, f38198w, animatorListener);
        animationC.start();
        valueAnimatorW.start();
    }

    public final void z(v2.m mVar, View view, View view2) {
        CardView cardView = (CardView) view.findViewWithTag("IN_APP_MESSAGE_CARD_VIEW_TAG");
        Animation.AnimationListener animationListenerD = D(cardView);
        int i9 = i.f38238a[mVar.ordinal()];
        if (i9 == 1) {
            A(cardView, this.f38216q.getHeight(), animationListenerD);
            return;
        }
        if (i9 == 2) {
            x(cardView, this.f38216q.getHeight(), animationListenerD);
        } else if (i9 == 3 || i9 == 4) {
            y(view, view2, animationListenerD, null);
        }
    }
}
