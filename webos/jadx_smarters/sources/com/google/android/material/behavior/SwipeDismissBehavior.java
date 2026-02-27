package com.google.android.material.behavior;

import P.L;
import Q.C;
import Q.F;
import W.d;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.amazonaws.services.s3.internal.Constants;

/* JADX INFO: loaded from: classes3.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f27012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f27013b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f27015d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f27014c = 0.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27016e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f27017f = 0.5f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f27018g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f27019h = 0.5f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d.c f27020i = new a();

    public class a extends d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f27021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f27022b = -1;

        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
        @Override // W.d.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int a(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = P.L.E(r3)
                r0 = 1
                if (r5 != r0) goto L9
                r5 = 1
                goto La
            L9:
                r5 = 0
            La:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f27016e
                if (r1 != 0) goto L24
                if (r5 == 0) goto L1c
            L12:
                int r5 = r2.f27021a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f27021a
                goto L37
            L1c:
                int r5 = r2.f27021a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L37
            L24:
                if (r1 != r0) goto L29
                if (r5 == 0) goto L12
                goto L1c
            L29:
                int r5 = r2.f27021a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f27021a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L37:
                int r3 = com.google.android.material.behavior.SwipeDismissBehavior.G(r5, r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.a(android.view.View, int, int):int");
        }

        @Override // W.d.c
        public int b(View view, int i9, int i10) {
            return view.getTop();
        }

        @Override // W.d.c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // W.d.c
        public void i(View view, int i9) {
            this.f27022b = i9;
            this.f27021a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // W.d.c
        public void j(int i9) {
            SwipeDismissBehavior.this.getClass();
        }

        @Override // W.d.c
        public void k(View view, int i9, int i10, int i11, int i12) {
            float width = this.f27021a + (view.getWidth() * SwipeDismissBehavior.this.f27018g);
            float width2 = this.f27021a + (view.getWidth() * SwipeDismissBehavior.this.f27019h);
            float f9 = i9;
            if (f9 <= width) {
                view.setAlpha(1.0f);
            } else if (f9 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.F(0.0f, 1.0f - SwipeDismissBehavior.I(width, width2, f9), 1.0f));
            }
        }

        @Override // W.d.c
        public void l(View view, float f9, float f10) {
            int i9;
            boolean z9;
            this.f27022b = -1;
            int width = view.getWidth();
            if (n(view, f9)) {
                int left = view.getLeft();
                int i10 = this.f27021a;
                i9 = left < i10 ? i10 - width : i10 + width;
                z9 = true;
            } else {
                i9 = this.f27021a;
                z9 = false;
            }
            if (SwipeDismissBehavior.this.f27012a.F(i9, view.getTop())) {
                L.k0(view, new c(view, z9));
            } else if (z9) {
                SwipeDismissBehavior.this.getClass();
            }
        }

        @Override // W.d.c
        public boolean m(View view, int i9) {
            int i10 = this.f27022b;
            return (i10 == -1 || i10 == i9) && SwipeDismissBehavior.this.E(view);
        }

        public final boolean n(View view, float f9) {
            if (f9 == 0.0f) {
                return Math.abs(view.getLeft() - this.f27021a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f27017f);
            }
            boolean z9 = L.E(view) == 1;
            int i9 = SwipeDismissBehavior.this.f27016e;
            if (i9 == 2) {
                return true;
            }
            if (i9 == 0) {
                if (z9) {
                    if (f9 >= 0.0f) {
                        return false;
                    }
                } else if (f9 <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (i9 != 1) {
                return false;
            }
            if (z9) {
                if (f9 <= 0.0f) {
                    return false;
                }
            } else if (f9 >= 0.0f) {
                return false;
            }
            return true;
        }
    }

    public class b implements F {
        public b() {
        }

        @Override // Q.F
        public boolean a(View view, F.a aVar) {
            if (!SwipeDismissBehavior.this.E(view)) {
                return false;
            }
            boolean z9 = L.E(view) == 1;
            int i9 = SwipeDismissBehavior.this.f27016e;
            L.c0(view, (!(i9 == 0 && z9) && (i9 != 1 || z9)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            SwipeDismissBehavior.this.getClass();
            return true;
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f27025a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f27026c;

        public c(View view, boolean z9) {
            this.f27025a = view;
            this.f27026c = z9;
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = SwipeDismissBehavior.this.f27012a;
            if (dVar != null && dVar.k(true)) {
                L.k0(this.f27025a, this);
            } else if (this.f27026c) {
                SwipeDismissBehavior.this.getClass();
            }
        }
    }

    public static float F(float f9, float f10, float f11) {
        return Math.min(Math.max(f9, f10), f11);
    }

    public static int G(int i9, int i10, int i11) {
        return Math.min(Math.max(i9, i10), i11);
    }

    public static float I(float f9, float f10, float f11) {
        return (f11 - f9) / (f10 - f9);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        d dVar = this.f27012a;
        if (dVar == null) {
            return false;
        }
        dVar.z(motionEvent);
        return true;
    }

    public boolean E(View view) {
        return true;
    }

    public final void H(ViewGroup viewGroup) {
        if (this.f27012a == null) {
            this.f27012a = this.f27015d ? d.l(viewGroup, this.f27014c, this.f27020i) : d.m(viewGroup, this.f27020i);
        }
    }

    public void J(float f9) {
        this.f27019h = F(0.0f, f9, 1.0f);
    }

    public void K(float f9) {
        this.f27018g = F(0.0f, f9, 1.0f);
    }

    public void L(int i9) {
        this.f27016e = i9;
    }

    public final void M(View view) {
        L.m0(view, Constants.MB);
        if (E(view)) {
            L.o0(view, C.a.f7420y, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zC = this.f27013b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zC = coordinatorLayout.C(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f27013b = zC;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f27013b = false;
        }
        if (!zC) {
            return false;
        }
        H(coordinatorLayout);
        return this.f27012a.G(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i9) {
        boolean zL = super.l(coordinatorLayout, view, i9);
        if (L.C(view) == 0) {
            L.C0(view, 1);
            M(view);
        }
        return zL;
    }
}
