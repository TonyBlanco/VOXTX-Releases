package com.google.android.material.bottomsheet;

import P.L;
import Q.C;
import Q.F;
import R4.j;
import R4.k;
import R4.l;
import W.d;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.amazonaws.services.s3.internal.Constants;
import d.AbstractC1617D;
import f5.w;
import i5.AbstractC1893c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import l5.C2198g;

/* JADX INFO: loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f27034d0 = k.f8852f;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ValueAnimator f27035A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f27036B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f27037C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f27038D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f27039E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f27040F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f27041G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f27042H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f27043I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f27044J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f27045K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f27046L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public W.d f27047M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f27048N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f27049O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f27050P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f27051Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f27052R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f27053S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public WeakReference f27054T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public WeakReference f27055U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final ArrayList f27056V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public VelocityTracker f27057W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f27058X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f27059Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f27060Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27061a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Map f27062a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f27063b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f27064b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f27065c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final d.c f27066c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f27067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f27069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f27070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f27071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C2198g f27072i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f27073j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27074k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f27075l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f27076m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f27077n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f27078o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f27079p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f27080q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f27081r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f27082s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f27083t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f27084u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f27085v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f27086w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public l5.k f27087x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f27088y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final g f27089z;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f27090a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27091c;

        public a(View view, int i9) {
            this.f27090a = view;
            this.f27091c = i9;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.J0(this.f27090a, this.f27091c, false);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f27072i != null) {
                BottomSheetBehavior.this.f27072i.X(fFloatValue);
            }
        }
    }

    public class c implements w.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f27094a;

        public c(boolean z9) {
            this.f27094a = z9;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
        @Override // f5.w.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public P.X a(android.view.View r11, P.X r12, f5.w.e r13) {
            /*
                Method dump skipped, instruction units count: 205
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.c.a(android.view.View, P.X, f5.w$e):P.X");
        }
    }

    public class d extends d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f27096a;

        public d() {
        }

        @Override // W.d.c
        public int a(View view, int i9, int i10) {
            return view.getLeft();
        }

        @Override // W.d.c
        public int b(View view, int i9, int i10) {
            int iF0 = BottomSheetBehavior.this.f0();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return J.a.b(i9, iF0, bottomSheetBehavior.f27042H ? bottomSheetBehavior.f27053S : bottomSheetBehavior.f27040F);
        }

        @Override // W.d.c
        public int e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f27042H ? bottomSheetBehavior.f27053S : bottomSheetBehavior.f27040F;
        }

        @Override // W.d.c
        public void j(int i9) {
            if (i9 == 1 && BottomSheetBehavior.this.f27044J) {
                BottomSheetBehavior.this.C0(1);
            }
        }

        @Override // W.d.c
        public void k(View view, int i9, int i10, int i11, int i12) {
            BottomSheetBehavior.this.c0(i10);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
        @Override // W.d.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void l(android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instruction units count: 303
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.l(android.view.View, float, float):void");
        }

        @Override // W.d.c
        public boolean m(View view, int i9) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i10 = bottomSheetBehavior.f27045K;
            if (i10 == 1 || bottomSheetBehavior.f27060Z) {
                return false;
            }
            if (i10 == 3 && bottomSheetBehavior.f27058X == i9) {
                WeakReference weakReference = bottomSheetBehavior.f27055U;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f27096a = System.currentTimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.f27054T;
            return weakReference2 != null && weakReference2.get() == view;
        }

        public final boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f27053S + bottomSheetBehavior.f0()) / 2;
        }
    }

    public class e implements F {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f27098a;

        public e(int i9) {
            this.f27098a = i9;
        }

        @Override // Q.F
        public boolean a(View view, F.a aVar) {
            BottomSheetBehavior.this.B0(this.f27098a);
            return true;
        }
    }

    public static class f extends V.a {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f27100d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f27101e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f27102f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f27103g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f27104h;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i9) {
                return new f[i9];
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f27100d = parcel.readInt();
            this.f27101e = parcel.readInt();
            this.f27102f = parcel.readInt() == 1;
            this.f27103g = parcel.readInt() == 1;
            this.f27104h = parcel.readInt() == 1;
        }

        public f(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f27100d = bottomSheetBehavior.f27045K;
            this.f27101e = bottomSheetBehavior.f27068e;
            this.f27102f = bottomSheetBehavior.f27063b;
            this.f27103g = bottomSheetBehavior.f27042H;
            this.f27104h = bottomSheetBehavior.f27043I;
        }

        @Override // V.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i9) {
            super.writeToParcel(parcel, i9);
            parcel.writeInt(this.f27100d);
            parcel.writeInt(this.f27101e);
            parcel.writeInt(this.f27102f ? 1 : 0);
            parcel.writeInt(this.f27103g ? 1 : 0);
            parcel.writeInt(this.f27104h ? 1 : 0);
        }
    }

    public class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f27105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f27106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Runnable f27107c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.f27106b = false;
                W.d dVar = BottomSheetBehavior.this.f27047M;
                if (dVar != null && dVar.k(true)) {
                    g gVar = g.this;
                    gVar.c(gVar.f27105a);
                    return;
                }
                g gVar2 = g.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f27045K == 2) {
                    bottomSheetBehavior.C0(gVar2.f27105a);
                }
            }
        }

        public g() {
            this.f27107c = new a();
        }

        public /* synthetic */ g(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }

        public void c(int i9) {
            WeakReference weakReference = BottomSheetBehavior.this.f27054T;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f27105a = i9;
            if (this.f27106b) {
                return;
            }
            L.k0((View) BottomSheetBehavior.this.f27054T.get(), this.f27107c);
            this.f27106b = true;
        }
    }

    public BottomSheetBehavior() {
        this.f27061a = 0;
        this.f27063b = true;
        this.f27065c = false;
        this.f27074k = -1;
        this.f27075l = -1;
        this.f27089z = new g(this, null);
        this.f27039E = 0.5f;
        this.f27041G = -1.0f;
        this.f27044J = true;
        this.f27045K = 4;
        this.f27046L = 4;
        this.f27056V = new ArrayList();
        this.f27064b0 = -1;
        this.f27066c0 = new d();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i9;
        super(context, attributeSet);
        this.f27061a = 0;
        this.f27063b = true;
        this.f27065c = false;
        this.f27074k = -1;
        this.f27075l = -1;
        this.f27089z = new g(this, null);
        this.f27039E = 0.5f;
        this.f27041G = -1.0f;
        this.f27044J = true;
        this.f27045K = 4;
        this.f27046L = 4;
        this.f27056V = new ArrayList();
        this.f27064b0 = -1;
        this.f27066c0 = new d();
        this.f27071h = context.getResources().getDimensionPixelSize(R4.d.f8721T);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f9023T);
        if (typedArrayObtainStyledAttributes.hasValue(l.f9055X)) {
            this.f27073j = AbstractC1893c.a(context, typedArrayObtainStyledAttributes, l.f9055X);
        }
        if (typedArrayObtainStyledAttributes.hasValue(l.f9206o0)) {
            this.f27087x = l5.k.e(context, attributeSet, R4.b.f8669d, f27034d0).m();
        }
        a0(context);
        b0();
        this.f27041G = typedArrayObtainStyledAttributes.getDimension(l.f9047W, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(l.f9031U)) {
            w0(typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f9031U, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(l.f9039V)) {
            v0(typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f9039V, -1));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(l.f9107d0);
        x0((typedValuePeekValue == null || (i9 = typedValuePeekValue.data) != -1) ? typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f9107d0, -1) : i9);
        u0(typedArrayObtainStyledAttributes.getBoolean(l.f9098c0, false));
        s0(typedArrayObtainStyledAttributes.getBoolean(l.f9134g0, false));
        r0(typedArrayObtainStyledAttributes.getBoolean(l.f9080a0, true));
        A0(typedArrayObtainStyledAttributes.getBoolean(l.f9125f0, false));
        p0(typedArrayObtainStyledAttributes.getBoolean(l.f9063Y, true));
        z0(typedArrayObtainStyledAttributes.getInt(l.f9116e0, 0));
        t0(typedArrayObtainStyledAttributes.getFloat(l.f9089b0, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(l.f9071Z);
        q0((typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) ? typedArrayObtainStyledAttributes.getDimensionPixelOffset(l.f9071Z, 0) : typedValuePeekValue2.data);
        this.f27078o = typedArrayObtainStyledAttributes.getBoolean(l.f9170k0, false);
        this.f27079p = typedArrayObtainStyledAttributes.getBoolean(l.f9179l0, false);
        this.f27080q = typedArrayObtainStyledAttributes.getBoolean(l.f9188m0, false);
        this.f27081r = typedArrayObtainStyledAttributes.getBoolean(l.f9197n0, true);
        this.f27082s = typedArrayObtainStyledAttributes.getBoolean(l.f9143h0, false);
        this.f27083t = typedArrayObtainStyledAttributes.getBoolean(l.f9152i0, false);
        this.f27084u = typedArrayObtainStyledAttributes.getBoolean(l.f9161j0, false);
        typedArrayObtainStyledAttributes.recycle();
        this.f27067d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i9, int i10) {
        this.f27049O = 0;
        this.f27050P = false;
        return (i9 & 2) != 0;
    }

    public void A0(boolean z9) {
        this.f27043I = z9;
    }

    public void B0(int i9) {
        if (i9 == 1 || i9 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i9 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.f27042H && i9 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i9);
            return;
        }
        int i10 = (i9 == 6 && this.f27063b && g0(i9) <= this.f27037C) ? 3 : i9;
        WeakReference weakReference = this.f27054T;
        if (weakReference == null || weakReference.get() == null) {
            C0(i9);
        } else {
            View view = (View) this.f27054T.get();
            o0(view, new a(view, i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.f0()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.C0(r0)
            return
        Lf:
            boolean r3 = r2.k0()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference r3 = r2.f27055U
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.f27050P
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.f27049O
            r5 = 6
            if (r3 <= 0) goto L39
            boolean r3 = r2.f27063b
            if (r3 == 0) goto L2f
            goto Laa
        L2f:
            int r3 = r4.getTop()
            int r6 = r2.f27038D
            if (r3 <= r6) goto Laa
            goto La9
        L39:
            boolean r3 = r2.f27042H
            if (r3 == 0) goto L49
            float r3 = r2.h0()
            boolean r3 = r2.G0(r4, r3)
            if (r3 == 0) goto L49
            r0 = 5
            goto Laa
        L49:
            int r3 = r2.f27049O
            r6 = 4
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.f27063b
            if (r1 == 0) goto L68
            int r5 = r2.f27037C
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f27040F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.f27038D
            if (r3 >= r1) goto L7e
            int r1 = r2.f27040F
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.H0()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f27040F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.f27063b
            if (r3 == 0) goto L94
        L92:
            r0 = 4
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.f27038D
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f27040F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = 6
        Laa:
            r3 = 0
            r2.J0(r4, r0, r3)
            r2.f27050P = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public void C0(int i9) {
        if (this.f27045K == i9) {
            return;
        }
        this.f27045K = i9;
        if (i9 == 4 || i9 == 3 || i9 == 6 || (this.f27042H && i9 == 5)) {
            this.f27046L = i9;
        }
        WeakReference weakReference = this.f27054T;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i9 == 3) {
            M0(true);
        } else if (i9 == 6 || i9 == 5 || i9 == 4) {
            M0(false);
        }
        L0(i9);
        if (this.f27056V.size() <= 0) {
            K0();
        } else {
            AbstractC1617D.a(this.f27056V.get(0));
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f27045K == 1 && actionMasked == 0) {
            return true;
        }
        if (F0()) {
            this.f27047M.z(motionEvent);
        }
        if (actionMasked == 0) {
            m0();
        }
        if (this.f27057W == null) {
            this.f27057W = VelocityTracker.obtain();
        }
        this.f27057W.addMovement(motionEvent);
        if (F0() && actionMasked == 2 && !this.f27048N && Math.abs(this.f27059Y - motionEvent.getY()) > this.f27047M.u()) {
            this.f27047M.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f27048N;
    }

    public final void D0(View view) {
        boolean z9 = (Build.VERSION.SDK_INT < 29 || i0() || this.f27069f) ? false : true;
        if (this.f27078o || this.f27079p || this.f27080q || this.f27082s || this.f27083t || this.f27084u || z9) {
            w.a(view, new c(z9));
        }
    }

    public boolean E0(long j9, float f9) {
        return false;
    }

    public final boolean F0() {
        return this.f27047M != null && (this.f27044J || this.f27045K == 1);
    }

    public boolean G0(View view, float f9) {
        if (this.f27043I) {
            return true;
        }
        if (view.getTop() < this.f27040F) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f9 * 0.1f)) - ((float) this.f27040F)) / ((float) Y()) > 0.5f;
    }

    public boolean H0() {
        return false;
    }

    public boolean I0() {
        return true;
    }

    public final void J0(View view, int i9, boolean z9) {
        int iG0 = g0(i9);
        W.d dVar = this.f27047M;
        if (dVar == null || (!z9 ? dVar.H(view, view.getLeft(), iG0) : dVar.F(view.getLeft(), iG0))) {
            C0(i9);
            return;
        }
        C0(2);
        L0(i9);
        this.f27089z.c(i9);
    }

    public final void K0() {
        View view;
        int i9;
        C.a aVar;
        WeakReference weakReference = this.f27054T;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        L.m0(view, 524288);
        L.m0(view, 262144);
        L.m0(view, Constants.MB);
        int i10 = this.f27064b0;
        if (i10 != -1) {
            L.m0(view, i10);
        }
        if (!this.f27063b && this.f27045K != 6) {
            this.f27064b0 = V(view, j.f8827a, 6);
        }
        if (this.f27042H && this.f27045K != 5) {
            l0(view, C.a.f7420y, 5);
        }
        int i11 = this.f27045K;
        if (i11 == 3) {
            i9 = this.f27063b ? 4 : 6;
            aVar = C.a.f7419x;
        } else {
            if (i11 != 4) {
                if (i11 != 6) {
                    return;
                }
                l0(view, C.a.f7419x, 4);
                l0(view, C.a.f7418w, 3);
                return;
            }
            i9 = this.f27063b ? 3 : 6;
            aVar = C.a.f7418w;
        }
        l0(view, aVar, i9);
    }

    public final void L0(int i9) {
        ValueAnimator valueAnimator;
        if (i9 == 2) {
            return;
        }
        boolean z9 = i9 == 3;
        if (this.f27088y != z9) {
            this.f27088y = z9;
            if (this.f27072i == null || (valueAnimator = this.f27035A) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.f27035A.reverse();
                return;
            }
            float f9 = z9 ? 0.0f : 1.0f;
            this.f27035A.setFloatValues(1.0f - f9, f9);
            this.f27035A.start();
        }
    }

    public final void M0(boolean z9) {
        Map map;
        int iIntValue;
        WeakReference weakReference = this.f27054T;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z9) {
                if (this.f27062a0 != null) {
                    return;
                } else {
                    this.f27062a0 = new HashMap(childCount);
                }
            }
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = coordinatorLayout.getChildAt(i9);
                if (childAt != this.f27054T.get()) {
                    if (z9) {
                        this.f27062a0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f27065c) {
                            iIntValue = 4;
                            L.C0(childAt, iIntValue);
                        }
                    } else if (this.f27065c && (map = this.f27062a0) != null && map.containsKey(childAt)) {
                        iIntValue = ((Integer) this.f27062a0.get(childAt)).intValue();
                        L.C0(childAt, iIntValue);
                    }
                }
            }
            if (!z9) {
                this.f27062a0 = null;
            } else if (this.f27065c) {
                ((View) this.f27054T.get()).sendAccessibilityEvent(8);
            }
        }
    }

    public final void N0(boolean z9) {
        View view;
        if (this.f27054T != null) {
            W();
            if (this.f27045K != 4 || (view = (View) this.f27054T.get()) == null) {
                return;
            }
            if (z9) {
                B0(4);
            } else {
                view.requestLayout();
            }
        }
    }

    public final int V(View view, int i9, int i10) {
        return L.c(view, view.getResources().getString(i9), Z(i10));
    }

    public final void W() {
        int iY = Y();
        if (this.f27063b) {
            this.f27040F = Math.max(this.f27053S - iY, this.f27037C);
        } else {
            this.f27040F = this.f27053S - iY;
        }
    }

    public final void X() {
        this.f27038D = (int) (this.f27053S * (1.0f - this.f27039E));
    }

    public final int Y() {
        int i9;
        return this.f27069f ? Math.min(Math.max(this.f27070g, this.f27053S - ((this.f27052R * 9) / 16)), this.f27051Q) + this.f27085v : (this.f27077n || this.f27078o || (i9 = this.f27076m) <= 0) ? this.f27068e + this.f27085v : Math.max(this.f27068e, i9 + this.f27071h);
    }

    public final F Z(int i9) {
        return new e(i9);
    }

    public final void a0(Context context) {
        if (this.f27087x == null) {
            return;
        }
        C2198g c2198g = new C2198g(this.f27087x);
        this.f27072i = c2198g;
        c2198g.L(context);
        ColorStateList colorStateList = this.f27073j;
        if (colorStateList != null) {
            this.f27072i.W(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f27072i.setTint(typedValue.data);
    }

    public final void b0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f27035A = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f27035A.addUpdateListener(new b());
    }

    public void c0(int i9) {
        if (((View) this.f27054T.get()) == null || this.f27056V.isEmpty()) {
            return;
        }
        int i10 = this.f27040F;
        if (i9 <= i10 && i10 != f0()) {
            f0();
        }
        if (this.f27056V.size() <= 0) {
            return;
        }
        AbstractC1617D.a(this.f27056V.get(0));
        throw null;
    }

    public View d0(View view) {
        if (L.X(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View viewD0 = d0(viewGroup.getChildAt(i9));
            if (viewD0 != null) {
                return viewD0;
            }
        }
        return null;
    }

    public final int e0(int i9, int i10, int i11, int i12) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i9, i10, i12);
        if (i11 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i11), 1073741824);
        }
        if (size != 0) {
            i11 = Math.min(size, i11);
        }
        return View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
    }

    public int f0() {
        if (this.f27063b) {
            return this.f27037C;
        }
        return Math.max(this.f27036B, this.f27081r ? 0 : this.f27086w);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.f27054T = null;
        this.f27047M = null;
    }

    public final int g0(int i9) {
        if (i9 == 3) {
            return f0();
        }
        if (i9 == 4) {
            return this.f27040F;
        }
        if (i9 == 5) {
            return this.f27053S;
        }
        if (i9 == 6) {
            return this.f27038D;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i9);
    }

    public final float h0() {
        VelocityTracker velocityTracker = this.f27057W;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f27067d);
        return this.f27057W.getYVelocity(this.f27058X);
    }

    public boolean i0() {
        return this.f27077n;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.f27054T = null;
        this.f27047M = null;
    }

    public final boolean j0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && L.V(view);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        W.d dVar;
        if (!view.isShown() || !this.f27044J) {
            this.f27048N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m0();
        }
        if (this.f27057W == null) {
            this.f27057W = VelocityTracker.obtain();
        }
        this.f27057W.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x9 = (int) motionEvent.getX();
            this.f27059Y = (int) motionEvent.getY();
            if (this.f27045K != 2) {
                WeakReference weakReference = this.f27055U;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.C(view2, x9, this.f27059Y)) {
                    this.f27058X = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f27060Z = true;
                }
            }
            this.f27048N = this.f27058X == -1 && !coordinatorLayout.C(view, x9, this.f27059Y);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f27060Z = false;
            this.f27058X = -1;
            if (this.f27048N) {
                this.f27048N = false;
                return false;
            }
        }
        if (!this.f27048N && (dVar = this.f27047M) != null && dVar.G(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f27055U;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f27048N || this.f27045K == 1 || coordinatorLayout.C(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f27047M == null || Math.abs(((float) this.f27059Y) - motionEvent.getY()) <= ((float) this.f27047M.u())) ? false : true;
    }

    public boolean k0() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f6  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean l(androidx.coordinatorlayout.widget.CoordinatorLayout r7, android.view.View r8, int r9) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.l(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    public final void l0(View view, C.a aVar, int i9) {
        L.o0(view, aVar, null, Z(i9));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i9, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(e0(i9, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, this.f27074k, marginLayoutParams.width), e0(i11, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i12, this.f27075l, marginLayoutParams.height));
        return true;
    }

    public final void m0() {
        this.f27058X = -1;
        VelocityTracker velocityTracker = this.f27057W;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f27057W = null;
        }
    }

    public final void n0(f fVar) {
        int i9 = this.f27061a;
        if (i9 == 0) {
            return;
        }
        if (i9 == -1 || (i9 & 1) == 1) {
            this.f27068e = fVar.f27101e;
        }
        if (i9 == -1 || (i9 & 2) == 2) {
            this.f27063b = fVar.f27102f;
        }
        if (i9 == -1 || (i9 & 4) == 4) {
            this.f27042H = fVar.f27103g;
        }
        if (i9 == -1 || (i9 & 8) == 8) {
            this.f27043I = fVar.f27104h;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f9, float f10) {
        WeakReference weakReference;
        if (k0() && (weakReference = this.f27055U) != null && view2 == weakReference.get()) {
            return this.f27045K != 3 || super.o(coordinatorLayout, view, view2, f9, f10);
        }
        return false;
    }

    public final void o0(View view, Runnable runnable) {
        if (j0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    public void p0(boolean z9) {
        this.f27044J = z9;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i9, int i10, int[] iArr, int i11) {
        int i12;
        if (i11 == 1) {
            return;
        }
        WeakReference weakReference = this.f27055U;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (!k0() || view2 == view3) {
            int top = view.getTop();
            int i13 = top - i10;
            if (i10 > 0) {
                if (i13 < f0()) {
                    int iF0 = top - f0();
                    iArr[1] = iF0;
                    L.d0(view, -iF0);
                    i12 = 3;
                    C0(i12);
                } else {
                    if (!this.f27044J) {
                        return;
                    }
                    iArr[1] = i10;
                    L.d0(view, -i10);
                    C0(1);
                }
            } else if (i10 < 0 && !view2.canScrollVertically(-1)) {
                int i14 = this.f27040F;
                if (i13 > i14 && !this.f27042H) {
                    int i15 = top - i14;
                    iArr[1] = i15;
                    L.d0(view, -i15);
                    i12 = 4;
                    C0(i12);
                } else {
                    if (!this.f27044J) {
                        return;
                    }
                    iArr[1] = i10;
                    L.d0(view, -i10);
                    C0(1);
                }
            }
            c0(view.getTop());
            this.f27049O = i10;
            this.f27050P = true;
        }
    }

    public void q0(int i9) {
        if (i9 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f27036B = i9;
    }

    public void r0(boolean z9) {
        if (this.f27063b == z9) {
            return;
        }
        this.f27063b = z9;
        if (this.f27054T != null) {
            W();
        }
        C0((this.f27063b && this.f27045K == 6) ? 3 : this.f27045K);
        K0();
    }

    public void s0(boolean z9) {
        this.f27077n = z9;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i9, int i10, int i11, int i12, int i13, int[] iArr) {
    }

    public void t0(float f9) {
        if (f9 <= 0.0f || f9 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f27039E = f9;
        if (this.f27054T != null) {
            X();
        }
    }

    public void u0(boolean z9) {
        if (this.f27042H != z9) {
            this.f27042H = z9;
            if (!z9 && this.f27045K == 5) {
                B0(4);
            }
            K0();
        }
    }

    public void v0(int i9) {
        this.f27075l = i9;
    }

    public void w0(int i9) {
        this.f27074k = i9;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        f fVar = (f) parcelable;
        super.x(coordinatorLayout, view, fVar.a());
        n0(fVar);
        int i9 = fVar.f27100d;
        if (i9 == 1 || i9 == 2) {
            i9 = 4;
        }
        this.f27045K = i9;
        this.f27046L = i9;
    }

    public void x0(int i9) {
        y0(i9, false);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        return new f(super.y(coordinatorLayout, view), this);
    }

    public final void y0(int i9, boolean z9) {
        if (i9 == -1) {
            if (this.f27069f) {
                return;
            } else {
                this.f27069f = true;
            }
        } else {
            if (!this.f27069f && this.f27068e == i9) {
                return;
            }
            this.f27069f = false;
            this.f27068e = Math.max(0, i9);
        }
        N0(z9);
    }

    public void z0(int i9) {
        this.f27061a = i9;
    }
}
