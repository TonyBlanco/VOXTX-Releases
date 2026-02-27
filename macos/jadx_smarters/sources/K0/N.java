package K0;

import K0.AbstractC0681l;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class N extends AbstractC0681l {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final String[] f3427K = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f3428J = 3;

    public class a extends AbstractC0682m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f3429a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f3430c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f3431d;

        public a(ViewGroup viewGroup, View view, View view2) {
            this.f3429a = viewGroup;
            this.f3430c = view;
            this.f3431d = view2;
        }

        @Override // K0.AbstractC0682m, K0.AbstractC0681l.f
        public void b(AbstractC0681l abstractC0681l) {
            x.a(this.f3429a).d(this.f3430c);
        }

        @Override // K0.AbstractC0681l.f
        public void c(AbstractC0681l abstractC0681l) {
            this.f3431d.setTag(AbstractC0678i.f3505a, null);
            x.a(this.f3429a).d(this.f3430c);
            abstractC0681l.Q(this);
        }

        @Override // K0.AbstractC0682m, K0.AbstractC0681l.f
        public void e(AbstractC0681l abstractC0681l) {
            if (this.f3430c.getParent() == null) {
                x.a(this.f3429a).c(this.f3430c);
            } else {
                N.this.cancel();
            }
        }
    }

    public static class b extends AnimatorListenerAdapter implements AbstractC0681l.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f3433a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f3434c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ViewGroup f3435d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f3436e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f3437f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f3438g = false;

        public b(View view, int i9, boolean z9) {
            this.f3433a = view;
            this.f3434c = i9;
            this.f3435d = (ViewGroup) view.getParent();
            this.f3436e = z9;
            g(true);
        }

        @Override // K0.AbstractC0681l.f
        public void a(AbstractC0681l abstractC0681l) {
        }

        @Override // K0.AbstractC0681l.f
        public void b(AbstractC0681l abstractC0681l) {
            g(false);
        }

        @Override // K0.AbstractC0681l.f
        public void c(AbstractC0681l abstractC0681l) {
            f();
            abstractC0681l.Q(this);
        }

        @Override // K0.AbstractC0681l.f
        public void d(AbstractC0681l abstractC0681l) {
        }

        @Override // K0.AbstractC0681l.f
        public void e(AbstractC0681l abstractC0681l) {
            g(true);
        }

        public final void f() {
            if (!this.f3438g) {
                A.h(this.f3433a, this.f3434c);
                ViewGroup viewGroup = this.f3435d;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        public final void g(boolean z9) {
            ViewGroup viewGroup;
            if (!this.f3436e || this.f3437f == z9 || (viewGroup = this.f3435d) == null) {
                return;
            }
            this.f3437f = z9;
            x.c(viewGroup, z9);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3438g = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (this.f3438g) {
                return;
            }
            A.h(this.f3433a, this.f3434c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f3438g) {
                return;
            }
            A.h(this.f3433a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f3439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f3440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3441c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3442d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ViewGroup f3443e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ViewGroup f3444f;
    }

    private void d0(s sVar) {
        sVar.f3568a.put("android:visibility:visibility", Integer.valueOf(sVar.f3569b.getVisibility()));
        sVar.f3568a.put("android:visibility:parent", sVar.f3569b.getParent());
        int[] iArr = new int[2];
        sVar.f3569b.getLocationOnScreen(iArr);
        sVar.f3568a.put("android:visibility:screenLocation", iArr);
    }

    @Override // K0.AbstractC0681l
    public String[] E() {
        return f3427K;
    }

    @Override // K0.AbstractC0681l
    public boolean G(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f3568a.containsKey("android:visibility:visibility") != sVar.f3568a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarE0 = e0(sVar, sVar2);
        if (cVarE0.f3439a) {
            return cVarE0.f3441c == 0 || cVarE0.f3442d == 0;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (r9 == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
    
        if (r0.f3443e == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0092, code lost:
    
        if (r0.f3441c == 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final K0.N.c e0(K0.s r8, K0.s r9) {
        /*
            r7 = this;
            K0.N$c r0 = new K0.N$c
            r0.<init>()
            r1 = 0
            r0.f3439a = r1
            r0.f3440b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L33
            java.util.Map r6 = r8.f3568a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map r6 = r8.f3568a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f3441c = r6
            java.util.Map r6 = r8.f3568a
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f3443e = r6
            goto L37
        L33:
            r0.f3441c = r3
            r0.f3443e = r2
        L37:
            if (r9 == 0) goto L5a
            java.util.Map r6 = r9.f3568a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map r2 = r9.f3568a
            java.lang.Object r2 = r2.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f3442d = r2
            java.util.Map r2 = r9.f3568a
            java.lang.Object r2 = r2.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L57:
            r0.f3444f = r2
            goto L5d
        L5a:
            r0.f3442d = r3
            goto L57
        L5d:
            r2 = 1
            if (r8 == 0) goto L87
            if (r9 == 0) goto L87
            int r8 = r0.f3441c
            int r9 = r0.f3442d
            if (r8 != r9) goto L6f
            android.view.ViewGroup r3 = r0.f3443e
            android.view.ViewGroup r4 = r0.f3444f
            if (r3 != r4) goto L6f
            return r0
        L6f:
            if (r8 == r9) goto L7d
            if (r8 != 0) goto L78
        L73:
            r0.f3440b = r1
        L75:
            r0.f3439a = r2
            goto L95
        L78:
            if (r9 != 0) goto L95
        L7a:
            r0.f3440b = r2
            goto L75
        L7d:
            android.view.ViewGroup r8 = r0.f3444f
            if (r8 != 0) goto L82
            goto L73
        L82:
            android.view.ViewGroup r8 = r0.f3443e
            if (r8 != 0) goto L95
            goto L7a
        L87:
            if (r8 != 0) goto L8e
            int r8 = r0.f3442d
            if (r8 != 0) goto L8e
            goto L7a
        L8e:
            if (r9 != 0) goto L95
            int r8 = r0.f3441c
            if (r8 != 0) goto L95
            goto L73
        L95:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.N.e0(K0.s, K0.s):K0.N$c");
    }

    public Animator f0(ViewGroup viewGroup, s sVar, int i9, s sVar2, int i10) {
        if ((this.f3428J & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f3569b.getParent();
            if (e0(u(view, false), F(view, false)).f3439a) {
                return null;
            }
        }
        return g0(viewGroup, sVar2.f3569b, sVar, sVar2);
    }

    @Override // K0.AbstractC0681l
    public void g(s sVar) {
        d0(sVar);
    }

    public abstract Animator g0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069 A[PHI: r2
      0x0069: PHI (r2v3 android.view.View) = 
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v6 android.view.View)
     binds: [B:26:0x003e, B:31:0x004d, B:37:0x0076, B:39:0x0079, B:41:0x007f, B:43:0x0083, B:34:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator h0(android.view.ViewGroup r11, K0.s r12, int r13, K0.s r14, int r15) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.N.h0(android.view.ViewGroup, K0.s, int, K0.s, int):android.animation.Animator");
    }

    public abstract Animator i0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    @Override // K0.AbstractC0681l
    public void j(s sVar) {
        d0(sVar);
    }

    public void j0(int i9) {
        if ((i9 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f3428J = i9;
    }

    @Override // K0.AbstractC0681l
    public Animator n(ViewGroup viewGroup, s sVar, s sVar2) {
        c cVarE0 = e0(sVar, sVar2);
        if (!cVarE0.f3439a) {
            return null;
        }
        if (cVarE0.f3443e == null && cVarE0.f3444f == null) {
            return null;
        }
        return cVarE0.f3440b ? f0(viewGroup, sVar, cVarE0.f3441c, sVar2, cVarE0.f3442d) : h0(viewGroup, sVar, cVarE0.f3441c, sVar2, cVarE0.f3442d);
    }
}
