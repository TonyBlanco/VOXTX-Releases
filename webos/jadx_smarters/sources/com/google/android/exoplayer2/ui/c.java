package com.google.android.exoplayer2.ui;

import O2.AbstractC0926v1;
import O2.AbstractC0928w0;
import O2.C0909p1;
import O2.C0917s1;
import O2.C0921u;
import O2.H0;
import O2.InterfaceC0920t1;
import O2.Q1;
import O2.R0;
import O2.V1;
import Q2.C1019e;
import Z3.z;
import a4.AbstractC1103q;
import a4.AbstractC1104s;
import a4.AbstractC1105t;
import a4.AbstractC1106u;
import a4.AbstractC1108w;
import a4.AbstractC1110y;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.ui.f;
import d4.AbstractC1684a;
import d4.P;
import d4.k0;
import e4.C1737C;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import q3.C2540a;

/* JADX INFO: loaded from: classes3.dex */
public class c extends FrameLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final String f25988A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Drawable f25989B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Drawable f25990C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final float f25991D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final float f25992E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final String f25993F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final String f25994G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public InterfaceC0920t1 f25995H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f25996I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f25997J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f25998K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f25999L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f26000M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f26001N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f26002O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f26003P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f26004Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f26005R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f26006S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f26007T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public long f26008U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public long[] f26009V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean[] f26010W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewOnClickListenerC0248c f26011a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f26012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f26013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f26014e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public long[] f26015e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f26016f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean[] f26017f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f26018g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public long f26019g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f26020h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public long f26021h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f26022i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public long f26023i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f26024j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImageView f26025k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f26026l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f26027m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f26028n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f f26029o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final StringBuilder f26030p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Formatter f26031q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Q1.b f26032r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Q1.d f26033s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Runnable f26034t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Runnable f26035u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Drawable f26036v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Drawable f26037w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Drawable f26038x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f26039y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f26040z;

    public static final class b {
        public static boolean a(View view) {
            return view.isAccessibilityFocused();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.c$c, reason: collision with other inner class name */
    public final class ViewOnClickListenerC0248c implements InterfaceC0920t1.d, f.a, View.OnClickListener {
        public ViewOnClickListenerC0248c() {
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void A(C1019e c1019e) {
            AbstractC0926v1.a(this, c1019e);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void B(boolean z9) {
            AbstractC0926v1.j(this, z9);
        }

        @Override // com.google.android.exoplayer2.ui.f.a
        public void C(f fVar, long j9, boolean z9) {
            c.this.f25999L = false;
            if (z9 || c.this.f25995H == null) {
                return;
            }
            c cVar = c.this;
            cVar.I(cVar.f25995H, j9);
        }

        @Override // com.google.android.exoplayer2.ui.f.a
        public void D(f fVar, long j9) {
            c.this.f25999L = true;
            if (c.this.f26028n != null) {
                c.this.f26028n.setText(k0.m0(c.this.f26030p, c.this.f26031q, j9));
            }
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void E(int i9) {
            AbstractC0926v1.p(this, i9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void J(boolean z9) {
            AbstractC0926v1.y(this, z9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void M(int i9, boolean z9) {
            AbstractC0926v1.f(this, i9, z9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void O(InterfaceC0920t1.b bVar) {
            AbstractC0926v1.b(this, bVar);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void P() {
            AbstractC0926v1.w(this);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void S(InterfaceC0920t1.e eVar, InterfaceC0920t1.e eVar2, int i9) {
            AbstractC0926v1.v(this, eVar, eVar2, i9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void U(int i9, int i10) {
            AbstractC0926v1.A(this, i9, i10);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void V(Q1 q12, int i9) {
            AbstractC0926v1.B(this, q12, i9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void W(C0909p1 c0909p1) {
            AbstractC0926v1.s(this, c0909p1);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void Y(z zVar) {
            AbstractC0926v1.C(this, zVar);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void a(boolean z9) {
            AbstractC0926v1.z(this, z9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void a0(C0921u c0921u) {
            AbstractC0926v1.e(this, c0921u);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void b0(int i9) {
            AbstractC0926v1.u(this, i9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void d0(boolean z9) {
            AbstractC0926v1.h(this, z9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void e(C2540a c2540a) {
            AbstractC0926v1.m(this, c2540a);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void f0(V1 v12) {
            AbstractC0926v1.D(this, v12);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void g0(boolean z9, int i9) {
            AbstractC0926v1.t(this, z9, i9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void h0(H0 h02, int i9) {
            AbstractC0926v1.k(this, h02, i9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void i0(R0 r02) {
            AbstractC0926v1.l(this, r02);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void j(C1737C c1737c) {
            AbstractC0926v1.E(this, c1737c);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void j0(boolean z9, int i9) {
            AbstractC0926v1.n(this, z9, i9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void k(List list) {
            AbstractC0926v1.d(this, list);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void l0(C0909p1 c0909p1) {
            AbstractC0926v1.r(this, c0909p1);
        }

        @Override // O2.InterfaceC0920t1.d
        public void m0(InterfaceC0920t1 interfaceC0920t1, InterfaceC0920t1.c cVar) {
            if (cVar.b(4, 5)) {
                c.this.N();
            }
            if (cVar.b(4, 5, 7)) {
                c.this.O();
            }
            if (cVar.a(8)) {
                c.this.P();
            }
            if (cVar.a(9)) {
                c.this.Q();
            }
            if (cVar.b(8, 9, 11, 0, 13)) {
                c.this.M();
            }
            if (cVar.b(11, 0)) {
                c.this.R();
            }
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void n0(boolean z9) {
            AbstractC0926v1.i(this, z9);
        }

        @Override // com.google.android.exoplayer2.ui.f.a
        public void o(f fVar, long j9) {
            if (c.this.f26028n != null) {
                c.this.f26028n.setText(k0.m0(c.this.f26030p, c.this.f26031q, j9));
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            InterfaceC0920t1 interfaceC0920t1 = c.this.f25995H;
            if (interfaceC0920t1 == null) {
                return;
            }
            if (c.this.f26014e == view) {
                interfaceC0920t1.z();
                return;
            }
            if (c.this.f26013d == view) {
                interfaceC0920t1.m();
                return;
            }
            if (c.this.f26020h == view) {
                if (interfaceC0920t1.getPlaybackState() != 4) {
                    interfaceC0920t1.b0();
                    return;
                }
                return;
            }
            if (c.this.f26022i == view) {
                interfaceC0920t1.d0();
                return;
            }
            if (c.this.f26016f == view) {
                k0.u0(interfaceC0920t1);
                return;
            }
            if (c.this.f26018g == view) {
                k0.t0(interfaceC0920t1);
            } else if (c.this.f26024j == view) {
                interfaceC0920t1.setRepeatMode(P.a(interfaceC0920t1.getRepeatMode(), c.this.f26002O));
            } else if (c.this.f26025k == view) {
                interfaceC0920t1.F(!interfaceC0920t1.Z());
            }
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void onRepeatModeChanged(int i9) {
            AbstractC0926v1.x(this, i9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void t(C0917s1 c0917s1) {
            AbstractC0926v1.o(this, c0917s1);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void u(P3.f fVar) {
            AbstractC0926v1.c(this, fVar);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void z(int i9) {
            AbstractC0926v1.q(this, i9);
        }
    }

    public interface d {
    }

    public interface e {
        void o(int i9);
    }

    static {
        AbstractC0928w0.a("goog.exo.ui");
    }

    public c(Context context, AttributeSet attributeSet, int i9, AttributeSet attributeSet2) {
        super(context, attributeSet, i9);
        int resourceId = AbstractC1106u.f11703b;
        this.f26000M = 5000;
        this.f26002O = 0;
        this.f26001N = 200;
        this.f26008U = -9223372036854775807L;
        this.f26003P = true;
        this.f26004Q = true;
        this.f26005R = true;
        this.f26006S = true;
        this.f26007T = false;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, AbstractC1110y.f11806r, i9, 0);
            try {
                this.f26000M = typedArrayObtainStyledAttributes.getInt(AbstractC1110y.f11814z, this.f26000M);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(AbstractC1110y.f11807s, resourceId);
                this.f26002O = z(typedArrayObtainStyledAttributes, this.f26002O);
                this.f26003P = typedArrayObtainStyledAttributes.getBoolean(AbstractC1110y.f11812x, this.f26003P);
                this.f26004Q = typedArrayObtainStyledAttributes.getBoolean(AbstractC1110y.f11809u, this.f26004Q);
                this.f26005R = typedArrayObtainStyledAttributes.getBoolean(AbstractC1110y.f11811w, this.f26005R);
                this.f26006S = typedArrayObtainStyledAttributes.getBoolean(AbstractC1110y.f11810v, this.f26006S);
                this.f26007T = typedArrayObtainStyledAttributes.getBoolean(AbstractC1110y.f11813y, this.f26007T);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(AbstractC1110y.f11746A, this.f26001N));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f26012c = new CopyOnWriteArrayList();
        this.f26032r = new Q1.b();
        this.f26033s = new Q1.d();
        StringBuilder sb = new StringBuilder();
        this.f26030p = sb;
        this.f26031q = new Formatter(sb, Locale.getDefault());
        this.f26009V = new long[0];
        this.f26010W = new boolean[0];
        this.f26015e0 = new long[0];
        this.f26017f0 = new boolean[0];
        ViewOnClickListenerC0248c viewOnClickListenerC0248c = new ViewOnClickListenerC0248c();
        this.f26011a = viewOnClickListenerC0248c;
        this.f26034t = new Runnable() { // from class: a4.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f11623a.O();
            }
        };
        this.f26035u = new Runnable() { // from class: a4.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f11624a.A();
            }
        };
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        f fVar = (f) findViewById(AbstractC1104s.f11658H);
        View viewFindViewById = findViewById(AbstractC1104s.f11659I);
        f fVar2 = fVar;
        if (fVar != null) {
            this.f26029o = fVar2;
        } else if (viewFindViewById != null) {
            com.google.android.exoplayer2.ui.b bVar = new com.google.android.exoplayer2.ui.b(context, null, 0, attributeSet2);
            bVar.setId(AbstractC1104s.f11658H);
            bVar.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(bVar, iIndexOfChild);
            fVar2 = bVar;
            this.f26029o = fVar2;
        } else {
            this.f26029o = null;
        }
        this.f26027m = (TextView) findViewById(AbstractC1104s.f11686m);
        this.f26028n = (TextView) findViewById(AbstractC1104s.f11656F);
        f fVar3 = this.f26029o;
        if (fVar3 != null) {
            fVar3.a(viewOnClickListenerC0248c);
        }
        View viewFindViewById2 = findViewById(AbstractC1104s.f11653C);
        this.f26016f = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(viewOnClickListenerC0248c);
        }
        View viewFindViewById3 = findViewById(AbstractC1104s.f11652B);
        this.f26018g = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(viewOnClickListenerC0248c);
        }
        View viewFindViewById4 = findViewById(AbstractC1104s.f11657G);
        this.f26013d = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(viewOnClickListenerC0248c);
        }
        View viewFindViewById5 = findViewById(AbstractC1104s.f11697x);
        this.f26014e = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(viewOnClickListenerC0248c);
        }
        View viewFindViewById6 = findViewById(AbstractC1104s.f11661K);
        this.f26022i = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(viewOnClickListenerC0248c);
        }
        View viewFindViewById7 = findViewById(AbstractC1104s.f11690q);
        this.f26020h = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(viewOnClickListenerC0248c);
        }
        ImageView imageView = (ImageView) findViewById(AbstractC1104s.f11660J);
        this.f26024j = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(viewOnClickListenerC0248c);
        }
        ImageView imageView2 = (ImageView) findViewById(AbstractC1104s.f11664N);
        this.f26025k = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(viewOnClickListenerC0248c);
        }
        View viewFindViewById8 = findViewById(AbstractC1104s.f11672V);
        this.f26026l = viewFindViewById8;
        setShowVrButton(false);
        L(false, false, viewFindViewById8);
        Resources resources = context.getResources();
        this.f25991D = resources.getInteger(AbstractC1105t.f11701b) / 100.0f;
        this.f25992E = resources.getInteger(AbstractC1105t.f11700a) / 100.0f;
        this.f26036v = k0.X(context, resources, AbstractC1103q.f11632b);
        this.f26037w = k0.X(context, resources, AbstractC1103q.f11633c);
        this.f26038x = k0.X(context, resources, AbstractC1103q.f11631a);
        this.f25989B = k0.X(context, resources, AbstractC1103q.f11635e);
        this.f25990C = k0.X(context, resources, AbstractC1103q.f11634d);
        this.f26039y = resources.getString(AbstractC1108w.f11728j);
        this.f26040z = resources.getString(AbstractC1108w.f11729k);
        this.f25988A = resources.getString(AbstractC1108w.f11727i);
        this.f25993F = resources.getString(AbstractC1108w.f11732n);
        this.f25994G = resources.getString(AbstractC1108w.f11731m);
        this.f26021h0 = -9223372036854775807L;
        this.f26023i0 = -9223372036854775807L;
    }

    public static boolean C(int i9) {
        return i9 == 90 || i9 == 89 || i9 == 85 || i9 == 79 || i9 == 126 || i9 == 127 || i9 == 87 || i9 == 88;
    }

    public static boolean x(Q1 q12, Q1.d dVar) {
        if (q12.u() > 100) {
            return false;
        }
        int iU = q12.u();
        for (int i9 = 0; i9 < iU; i9++) {
            if (q12.s(i9, dVar).f5757o == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    public static int z(TypedArray typedArray, int i9) {
        return typedArray.getInt(AbstractC1110y.f11808t, i9);
    }

    public void A() {
        if (D()) {
            setVisibility(8);
            Iterator it = this.f26012c.iterator();
            while (it.hasNext()) {
                ((e) it.next()).o(getVisibility());
            }
            removeCallbacks(this.f26034t);
            removeCallbacks(this.f26035u);
            this.f26008U = -9223372036854775807L;
        }
    }

    public final void B() {
        removeCallbacks(this.f26035u);
        if (this.f26000M <= 0) {
            this.f26008U = -9223372036854775807L;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i9 = this.f26000M;
        this.f26008U = jUptimeMillis + ((long) i9);
        if (this.f25996I) {
            postDelayed(this.f26035u, i9);
        }
    }

    public boolean D() {
        return getVisibility() == 0;
    }

    public void E(e eVar) {
        this.f26012c.remove(eVar);
    }

    public final void F() {
        View view;
        View view2;
        boolean zF1 = k0.f1(this.f25995H);
        if (zF1 && (view2 = this.f26016f) != null) {
            view2.sendAccessibilityEvent(8);
        } else {
            if (zF1 || (view = this.f26018g) == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    public final void G() {
        View view;
        View view2;
        boolean zF1 = k0.f1(this.f25995H);
        if (zF1 && (view2 = this.f26016f) != null) {
            view2.requestFocus();
        } else {
            if (zF1 || (view = this.f26018g) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    public final void H(InterfaceC0920t1 interfaceC0920t1, int i9, long j9) {
        interfaceC0920t1.C(i9, j9);
    }

    public final void I(InterfaceC0920t1 interfaceC0920t1, long j9) {
        int iX;
        Q1 q1W = interfaceC0920t1.w();
        if (this.f25998K && !q1W.v()) {
            int iU = q1W.u();
            iX = 0;
            while (true) {
                long jF = q1W.s(iX, this.f26033s).f();
                if (j9 < jF) {
                    break;
                }
                if (iX == iU - 1) {
                    j9 = jF;
                    break;
                } else {
                    j9 -= jF;
                    iX++;
                }
            }
        } else {
            iX = interfaceC0920t1.X();
        }
        H(interfaceC0920t1, iX, j9);
        O();
    }

    public void J() {
        if (!D()) {
            setVisibility(0);
            Iterator it = this.f26012c.iterator();
            while (it.hasNext()) {
                ((e) it.next()).o(getVisibility());
            }
            K();
            G();
            F();
        }
        B();
    }

    public final void K() {
        N();
        M();
        P();
        Q();
        R();
    }

    public final void L(boolean z9, boolean z10, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z10);
        view.setAlpha(z10 ? this.f25991D : this.f25992E);
        view.setVisibility(z9 ? 0 : 8);
    }

    public final void M() {
        boolean zT;
        boolean zT2;
        boolean zT3;
        boolean zT4;
        boolean zT5;
        if (D() && this.f25996I) {
            InterfaceC0920t1 interfaceC0920t1 = this.f25995H;
            if (interfaceC0920t1 != null) {
                zT = interfaceC0920t1.t(5);
                zT3 = interfaceC0920t1.t(7);
                zT4 = interfaceC0920t1.t(11);
                zT5 = interfaceC0920t1.t(12);
                zT2 = interfaceC0920t1.t(9);
            } else {
                zT = false;
                zT2 = false;
                zT3 = false;
                zT4 = false;
                zT5 = false;
            }
            L(this.f26005R, zT3, this.f26013d);
            L(this.f26003P, zT4, this.f26022i);
            L(this.f26004Q, zT5, this.f26020h);
            L(this.f26006S, zT2, this.f26014e);
            f fVar = this.f26029o;
            if (fVar != null) {
                fVar.setEnabled(zT);
            }
        }
    }

    public final void N() {
        boolean z9;
        boolean z10;
        if (D() && this.f25996I) {
            boolean zF1 = k0.f1(this.f25995H);
            View view = this.f26016f;
            boolean z11 = true;
            if (view != null) {
                z9 = !zF1 && view.isFocused();
                z10 = k0.f39777a < 21 ? z9 : !zF1 && b.a(this.f26016f);
                this.f26016f.setVisibility(zF1 ? 0 : 8);
            } else {
                z9 = false;
                z10 = false;
            }
            View view2 = this.f26018g;
            if (view2 != null) {
                z9 |= zF1 && view2.isFocused();
                if (k0.f39777a < 21) {
                    z11 = z9;
                } else if (!zF1 || !b.a(this.f26018g)) {
                    z11 = false;
                }
                z10 |= z11;
                this.f26018g.setVisibility(zF1 ? 8 : 0);
            }
            if (z9) {
                G();
            }
            if (z10) {
                F();
            }
        }
    }

    public final void O() {
        long jR;
        long jA0;
        if (D() && this.f25996I) {
            InterfaceC0920t1 interfaceC0920t1 = this.f25995H;
            if (interfaceC0920t1 != null) {
                jR = this.f26019g0 + interfaceC0920t1.R();
                jA0 = this.f26019g0 + interfaceC0920t1.a0();
            } else {
                jR = 0;
                jA0 = 0;
            }
            boolean z9 = jR != this.f26021h0;
            this.f26021h0 = jR;
            this.f26023i0 = jA0;
            TextView textView = this.f26028n;
            if (textView != null && !this.f25999L && z9) {
                textView.setText(k0.m0(this.f26030p, this.f26031q, jR));
            }
            f fVar = this.f26029o;
            if (fVar != null) {
                fVar.setPosition(jR);
                this.f26029o.setBufferedPosition(jA0);
            }
            removeCallbacks(this.f26034t);
            int playbackState = interfaceC0920t1 == null ? 1 : interfaceC0920t1.getPlaybackState();
            if (interfaceC0920t1 == null || !interfaceC0920t1.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.f26034t, 1000L);
                return;
            }
            f fVar2 = this.f26029o;
            long jMin = Math.min(fVar2 != null ? fVar2.getPreferredUpdateDelay() : 1000L, 1000 - (jR % 1000));
            float f9 = interfaceC0920t1.c().f6231a;
            postDelayed(this.f26034t, k0.s(f9 > 0.0f ? (long) (jMin / f9) : 1000L, this.f26001N, 1000L));
        }
    }

    public final void P() {
        ImageView imageView;
        ImageView imageView2;
        String str;
        if (D() && this.f25996I && (imageView = this.f26024j) != null) {
            if (this.f26002O == 0) {
                L(false, false, imageView);
                return;
            }
            InterfaceC0920t1 interfaceC0920t1 = this.f25995H;
            if (interfaceC0920t1 == null) {
                L(true, false, imageView);
                this.f26024j.setImageDrawable(this.f26036v);
                this.f26024j.setContentDescription(this.f26039y);
                return;
            }
            L(true, true, imageView);
            int repeatMode = interfaceC0920t1.getRepeatMode();
            if (repeatMode == 0) {
                this.f26024j.setImageDrawable(this.f26036v);
                imageView2 = this.f26024j;
                str = this.f26039y;
            } else {
                if (repeatMode != 1) {
                    if (repeatMode == 2) {
                        this.f26024j.setImageDrawable(this.f26038x);
                        imageView2 = this.f26024j;
                        str = this.f25988A;
                    }
                    this.f26024j.setVisibility(0);
                }
                this.f26024j.setImageDrawable(this.f26037w);
                imageView2 = this.f26024j;
                str = this.f26040z;
            }
            imageView2.setContentDescription(str);
            this.f26024j.setVisibility(0);
        }
    }

    public final void Q() {
        ImageView imageView;
        ImageView imageView2;
        String str;
        if (D() && this.f25996I && (imageView = this.f26025k) != null) {
            InterfaceC0920t1 interfaceC0920t1 = this.f25995H;
            if (!this.f26007T) {
                L(false, false, imageView);
                return;
            }
            if (interfaceC0920t1 != null) {
                L(true, true, imageView);
                this.f26025k.setImageDrawable(interfaceC0920t1.Z() ? this.f25989B : this.f25990C);
                imageView2 = this.f26025k;
                if (interfaceC0920t1.Z()) {
                    str = this.f25993F;
                }
                imageView2.setContentDescription(str);
            }
            L(true, false, imageView);
            this.f26025k.setImageDrawable(this.f25990C);
            imageView2 = this.f26025k;
            str = this.f25994G;
            imageView2.setContentDescription(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R() {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.c.R():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return y(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f26035u);
        } else if (motionEvent.getAction() == 1) {
            B();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public InterfaceC0920t1 getPlayer() {
        return this.f25995H;
    }

    public int getRepeatToggleModes() {
        return this.f26002O;
    }

    public boolean getShowShuffleButton() {
        return this.f26007T;
    }

    public int getShowTimeoutMs() {
        return this.f26000M;
    }

    public boolean getShowVrButton() {
        View view = this.f26026l;
        return view != null && view.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f25996I = true;
        long j9 = this.f26008U;
        if (j9 != -9223372036854775807L) {
            long jUptimeMillis = j9 - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                A();
            } else {
                postDelayed(this.f26035u, jUptimeMillis);
            }
        } else if (D()) {
            B();
        }
        K();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25996I = false;
        removeCallbacks(this.f26034t);
        removeCallbacks(this.f26035u);
    }

    public void setPlayer(InterfaceC0920t1 interfaceC0920t1) {
        AbstractC1684a.g(Looper.myLooper() == Looper.getMainLooper());
        AbstractC1684a.a(interfaceC0920t1 == null || interfaceC0920t1.x() == Looper.getMainLooper());
        InterfaceC0920t1 interfaceC0920t12 = this.f25995H;
        if (interfaceC0920t12 == interfaceC0920t1) {
            return;
        }
        if (interfaceC0920t12 != null) {
            interfaceC0920t12.l(this.f26011a);
        }
        this.f25995H = interfaceC0920t1;
        if (interfaceC0920t1 != null) {
            interfaceC0920t1.B(this.f26011a);
        }
        K();
    }

    public void setProgressUpdateListener(d dVar) {
    }

    public void setRepeatToggleModes(int i9) {
        this.f26002O = i9;
        InterfaceC0920t1 interfaceC0920t1 = this.f25995H;
        if (interfaceC0920t1 != null) {
            int repeatMode = interfaceC0920t1.getRepeatMode();
            if (i9 == 0 && repeatMode != 0) {
                this.f25995H.setRepeatMode(0);
            } else if (i9 == 1 && repeatMode == 2) {
                this.f25995H.setRepeatMode(1);
            } else if (i9 == 2 && repeatMode == 1) {
                this.f25995H.setRepeatMode(2);
            }
        }
        P();
    }

    public void setShowFastForwardButton(boolean z9) {
        this.f26004Q = z9;
        M();
    }

    public void setShowMultiWindowTimeBar(boolean z9) {
        this.f25997J = z9;
        R();
    }

    public void setShowNextButton(boolean z9) {
        this.f26006S = z9;
        M();
    }

    public void setShowPreviousButton(boolean z9) {
        this.f26005R = z9;
        M();
    }

    public void setShowRewindButton(boolean z9) {
        this.f26003P = z9;
        M();
    }

    public void setShowShuffleButton(boolean z9) {
        this.f26007T = z9;
        Q();
    }

    public void setShowTimeoutMs(int i9) {
        this.f26000M = i9;
        if (D()) {
            B();
        }
    }

    public void setShowVrButton(boolean z9) {
        View view = this.f26026l;
        if (view != null) {
            view.setVisibility(z9 ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i9) {
        this.f26001N = k0.r(i9, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.f26026l;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            L(getShowVrButton(), onClickListener != null, this.f26026l);
        }
    }

    public void w(e eVar) {
        AbstractC1684a.e(eVar);
        this.f26012c.add(eVar);
    }

    public boolean y(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        InterfaceC0920t1 interfaceC0920t1 = this.f25995H;
        if (interfaceC0920t1 == null || !C(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (interfaceC0920t1.getPlaybackState() == 4) {
                return true;
            }
            interfaceC0920t1.b0();
            return true;
        }
        if (keyCode == 89) {
            interfaceC0920t1.d0();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            k0.v0(interfaceC0920t1);
            return true;
        }
        if (keyCode == 87) {
            interfaceC0920t1.z();
            return true;
        }
        if (keyCode == 88) {
            interfaceC0920t1.m();
            return true;
        }
        if (keyCode == 126) {
            k0.u0(interfaceC0920t1);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        k0.t0(interfaceC0920t1);
        return true;
    }
}
