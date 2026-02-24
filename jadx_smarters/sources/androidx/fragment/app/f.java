package androidx.fragment.app;

import L.e;
import P.H;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.fragment.app.x;
import e0.AbstractC1727a;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    public class a implements e.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f15011a;

        public a(Fragment fragment) {
            this.f15011a = fragment;
        }

        @Override // L.e.b
        public void a() {
            if (this.f15011a.getAnimatingAway() != null) {
                View animatingAway = this.f15011a.getAnimatingAway();
                this.f15011a.setAnimatingAway(null);
                animatingAway.clearAnimation();
            }
            this.f15011a.setAnimator(null);
        }
    }

    public class b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f15012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f15013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x.g f15014c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ L.e f15015d;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f15013b.getAnimatingAway() != null) {
                    b.this.f15013b.setAnimatingAway(null);
                    b bVar = b.this;
                    bVar.f15014c.b(bVar.f15013b, bVar.f15015d);
                }
            }
        }

        public b(ViewGroup viewGroup, Fragment fragment, x.g gVar, L.e eVar) {
            this.f15012a = viewGroup;
            this.f15013b = fragment;
            this.f15014c = gVar;
            this.f15015d = eVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f15012a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f15017a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f15018c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Fragment f15019d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x.g f15020e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ L.e f15021f;

        public c(ViewGroup viewGroup, View view, Fragment fragment, x.g gVar, L.e eVar) {
            this.f15017a = viewGroup;
            this.f15018c = view;
            this.f15019d = fragment;
            this.f15020e = gVar;
            this.f15021f = eVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f15017a.endViewTransition(this.f15018c);
            Animator animator2 = this.f15019d.getAnimator();
            this.f15019d.setAnimator(null);
            if (animator2 == null || this.f15017a.indexOfChild(this.f15018c) >= 0) {
                return;
            }
            this.f15020e.b(this.f15019d, this.f15021f);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f15022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Animator f15023b;

        public d(Animator animator) {
            this.f15022a = null;
            this.f15023b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        public d(Animation animation) {
            this.f15022a = animation;
            this.f15023b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    public static class e extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViewGroup f15024a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f15025c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f15026d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f15027e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f15028f;

        public e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f15028f = true;
            this.f15024a = viewGroup;
            this.f15025c = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j9, Transformation transformation) {
            this.f15028f = true;
            if (this.f15026d) {
                return !this.f15027e;
            }
            if (!super.getTransformation(j9, transformation)) {
                this.f15026d = true;
                H.a(this.f15024a, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j9, Transformation transformation, float f9) {
            this.f15028f = true;
            if (this.f15026d) {
                return !this.f15027e;
            }
            if (!super.getTransformation(j9, transformation, f9)) {
                this.f15026d = true;
                H.a(this.f15024a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f15026d || !this.f15028f) {
                this.f15024a.endViewTransition(this.f15025c);
                this.f15027e = true;
            } else {
                this.f15028f = false;
                this.f15024a.post(this);
            }
        }
    }

    public static void a(Fragment fragment, d dVar, x.g gVar) {
        View view = fragment.mView;
        ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        L.e eVar = new L.e();
        eVar.d(new a(fragment));
        gVar.a(fragment, eVar);
        if (dVar.f15022a != null) {
            e eVar2 = new e(dVar.f15022a, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            eVar2.setAnimationListener(new b(viewGroup, fragment, gVar, eVar));
            fragment.mView.startAnimation(eVar2);
            return;
        }
        Animator animator = dVar.f15023b;
        fragment.setAnimator(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, eVar));
        animator.setTarget(fragment.mView);
        animator.start();
    }

    public static int b(Fragment fragment, boolean z9, boolean z10) {
        return z10 ? z9 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z9 ? fragment.getEnterAnim() : fragment.getExitAnim();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0071 A[Catch: RuntimeException -> 0x0077, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0077, blocks: (B:32:0x006b, B:34:0x0071), top: B:45:0x006b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.fragment.app.f.d c(android.content.Context r4, androidx.fragment.app.Fragment r5, boolean r6, boolean r7) {
        /*
            int r0 = r5.getNextTransition()
            int r7 = b(r5, r6, r7)
            r1 = 0
            r5.setAnimations(r1, r1, r1, r1)
            android.view.ViewGroup r1 = r5.mContainer
            r2 = 0
            if (r1 == 0) goto L20
            int r3 = e0.AbstractC1728b.f40135c
            java.lang.Object r1 = r1.getTag(r3)
            if (r1 == 0) goto L20
            android.view.ViewGroup r1 = r5.mContainer
            int r3 = e0.AbstractC1728b.f40135c
            r1.setTag(r3, r2)
        L20:
            android.view.ViewGroup r1 = r5.mContainer
            if (r1 == 0) goto L2b
            android.animation.LayoutTransition r1 = r1.getLayoutTransition()
            if (r1 == 0) goto L2b
            return r2
        L2b:
            android.view.animation.Animation r1 = r5.onCreateAnimation(r0, r6, r7)
            if (r1 == 0) goto L37
            androidx.fragment.app.f$d r4 = new androidx.fragment.app.f$d
            r4.<init>(r1)
            return r4
        L37:
            android.animation.Animator r5 = r5.onCreateAnimator(r0, r6, r7)
            if (r5 == 0) goto L43
            androidx.fragment.app.f$d r4 = new androidx.fragment.app.f$d
            r4.<init>(r5)
            return r4
        L43:
            if (r7 != 0) goto L4b
            if (r0 == 0) goto L4b
            int r7 = d(r0, r6)
        L4b:
            if (r7 == 0) goto L87
            android.content.res.Resources r5 = r4.getResources()
            java.lang.String r5 = r5.getResourceTypeName(r7)
            java.lang.String r6 = "anim"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L6b
            android.view.animation.Animation r6 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)     // Catch: android.content.res.Resources.NotFoundException -> L69 java.lang.RuntimeException -> L6b
            if (r6 == 0) goto L87
            androidx.fragment.app.f$d r0 = new androidx.fragment.app.f$d     // Catch: android.content.res.Resources.NotFoundException -> L69 java.lang.RuntimeException -> L6b
            r0.<init>(r6)     // Catch: android.content.res.Resources.NotFoundException -> L69 java.lang.RuntimeException -> L6b
            return r0
        L69:
            r4 = move-exception
            throw r4
        L6b:
            android.animation.Animator r6 = android.animation.AnimatorInflater.loadAnimator(r4, r7)     // Catch: java.lang.RuntimeException -> L77
            if (r6 == 0) goto L87
            androidx.fragment.app.f$d r0 = new androidx.fragment.app.f$d     // Catch: java.lang.RuntimeException -> L77
            r0.<init>(r6)     // Catch: java.lang.RuntimeException -> L77
            return r0
        L77:
            r6 = move-exception
            if (r5 != 0) goto L86
            android.view.animation.Animation r4 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)
            if (r4 == 0) goto L87
            androidx.fragment.app.f$d r5 = new androidx.fragment.app.f$d
            r5.<init>(r4)
            return r5
        L86:
            throw r6
        L87:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.f.c(android.content.Context, androidx.fragment.app.Fragment, boolean, boolean):androidx.fragment.app.f$d");
    }

    public static int d(int i9, boolean z9) {
        if (i9 == 4097) {
            return z9 ? AbstractC1727a.f40131e : AbstractC1727a.f40132f;
        }
        if (i9 == 4099) {
            return z9 ? AbstractC1727a.f40129c : AbstractC1727a.f40130d;
        }
        if (i9 != 8194) {
            return -1;
        }
        return z9 ? AbstractC1727a.f40127a : AbstractC1727a.f40128b;
    }
}
