package com.google.android.exoplayer2.ui;

import O2.AbstractC0926v1;
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
import a4.AbstractC1101o;
import a4.AbstractC1103q;
import a4.AbstractC1104s;
import a4.AbstractC1106u;
import a4.AbstractC1108w;
import a4.AbstractC1110y;
import a4.C1087a;
import a4.InterfaceC1088b;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.c;
import d4.AbstractC1684a;
import d4.InterfaceC1699p;
import d4.k0;
import e4.C1737C;
import e4.k;
import f4.l;
import java.util.ArrayList;
import java.util.List;
import org.achartengine.renderer.DefaultRenderer;
import q3.C2540a;
import s5.AbstractC2743y;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class PlayerView extends FrameLayout implements InterfaceC1088b {

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public static boolean f25805B0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f25806A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public int f25807A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public LinearLayout f25808B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Animation f25809C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Animation f25810D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public LinearLayout f25811E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Animation f25812F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Animation f25813G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Animation f25814H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public RelativeLayout f25815I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f25816J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f25817K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public String f25818L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public String f25819M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Handler f25820N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public Context f25821O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f25822P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public Handler f25823Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public Handler f25824R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f25825S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public ProgressBar f25826T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final b f25827U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final AspectRatioFrameLayout f25828V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final View f25829W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f25830a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f25831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Activity f25832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PlayerView f25833e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final View f25834e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f25835f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final boolean f25836f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f25837g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final ImageView f25838g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Boolean f25839h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final SubtitleView f25840h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f25841i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final View f25842i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f25843j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final TextView f25844j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Boolean f25845k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final com.google.android.exoplayer2.ui.c f25846k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Boolean f25847l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final FrameLayout f25848l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Boolean f25849m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final FrameLayout f25850m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f25851n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public InterfaceC0920t1 f25852n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f25853o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f25854o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f25855p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public c.e f25856p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f25857q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f25858q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f25859r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Drawable f25860r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f25861s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f25862s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public LinearLayout f25863t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f25864t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Handler f25865u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public InterfaceC1699p f25866u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Runnable f25867v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public CharSequence f25868v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Handler f25869w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f25870w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Runnable f25871x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f25872x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Animation f25873y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f25874y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Animation f25875z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f25876z0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PlayerView.this.x();
        }
    }

    public final class b implements InterfaceC0920t1.d, View.OnLayoutChangeListener, View.OnClickListener, c.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Q1.b f25878a = new Q1.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f25879c;

        public b() {
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void A(C1019e c1019e) {
            AbstractC0926v1.a(this, c1019e);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void B(boolean z9) {
            AbstractC0926v1.j(this, z9);
        }

        @Override // O2.InterfaceC0920t1.d
        public void E(int i9) {
            PlayerView.this.P();
            PlayerView.this.S();
            PlayerView.this.R();
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
        public void P() {
            if (PlayerView.this.f25829W != null) {
                PlayerView.this.f25829W.setVisibility(4);
            }
        }

        @Override // O2.InterfaceC0920t1.d
        public void S(InterfaceC0920t1.e eVar, InterfaceC0920t1.e eVar2, int i9) {
            if (PlayerView.this.z() && PlayerView.this.f25874y0) {
                PlayerView.this.w();
            }
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
        public void f0(V1 v12) {
            InterfaceC0920t1 interfaceC0920t1 = (InterfaceC0920t1) AbstractC1684a.e(PlayerView.this.f25852n0);
            Q1 q1W = interfaceC0920t1.w();
            if (q1W.v()) {
                this.f25879c = null;
            } else if (interfaceC0920t1.p().d()) {
                Object obj = this.f25879c;
                if (obj != null) {
                    int iF = q1W.f(obj);
                    if (iF != -1) {
                        if (interfaceC0920t1.X() == q1W.k(iF, this.f25878a).f5718d) {
                            return;
                        }
                    }
                    this.f25879c = null;
                }
            } else {
                this.f25879c = q1W.l(interfaceC0920t1.J(), this.f25878a, true).f5717c;
            }
            PlayerView.this.T(false);
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
        public void j(C1737C c1737c) {
            PlayerView.this.O();
        }

        @Override // O2.InterfaceC0920t1.d
        public void j0(boolean z9, int i9) {
            PlayerView.this.P();
            PlayerView.this.R();
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
        public /* synthetic */ void m0(InterfaceC0920t1 interfaceC0920t1, InterfaceC0920t1.c cVar) {
            AbstractC0926v1.g(this, interfaceC0920t1, cVar);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void n0(boolean z9) {
            AbstractC0926v1.i(this, z9);
        }

        @Override // com.google.android.exoplayer2.ui.c.e
        public void o(int i9) {
            PlayerView.this.Q();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlayerView.this.N();
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            PlayerView.o((TextureView) view, PlayerView.this.f25807A0);
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
        public void u(P3.f fVar) {
            if (PlayerView.this.f25840h0 != null) {
                PlayerView.this.f25840h0.setCues(fVar.f7230a);
            }
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void z(int i9) {
            AbstractC0926v1.q(this, i9);
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f25881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f25882b;

        public c(Activity activity) {
            this.f25881a = activity;
        }

        public c a(int i9) {
            this.f25882b = this.f25881a.findViewById(i9);
            return this;
        }

        public c b(CharSequence charSequence) {
            View view = this.f25882b;
            if (view != null && (view instanceof TextView)) {
                ((TextView) view).setText(charSequence);
            }
            return this;
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerView(Context context, AttributeSet attributeSet, int i9) {
        int i10;
        int i11;
        boolean z9;
        int i12;
        boolean z10;
        boolean z11;
        int i13;
        int i14;
        boolean z12;
        int i15;
        boolean z13;
        int i16;
        boolean z14;
        boolean z15;
        View textureView;
        super(context, attributeSet, i9);
        this.f25831c = "visible";
        this.f25835f = -1.0f;
        Boolean bool = Boolean.FALSE;
        this.f25839h = bool;
        this.f25841i = bool;
        this.f25843j = bool;
        this.f25845k = bool;
        this.f25847l = bool;
        this.f25849m = bool;
        this.f25851n = false;
        this.f25853o = false;
        this.f25855p = false;
        this.f25857q = false;
        this.f25859r = false;
        this.f25861s = false;
        this.f25806A = 0;
        this.f25817K = false;
        this.f25822P = 0;
        b bVar = new b();
        this.f25827U = bVar;
        if (isInEditMode()) {
            this.f25828V = null;
            this.f25829W = null;
            this.f25834e0 = null;
            this.f25836f0 = false;
            this.f25838g0 = null;
            this.f25840h0 = null;
            this.f25842i0 = null;
            this.f25844j0 = null;
            this.f25846k0 = null;
            this.f25848l0 = null;
            this.f25850m0 = null;
            ImageView imageView = new ImageView(context);
            if (k0.f39777a >= 23) {
                s(context, getResources(), imageView);
            } else {
                r(context, getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i17 = AbstractC1106u.f11704c;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC1110y.f11747B, i9, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(AbstractC1110y.f11757L);
                int color = typedArrayObtainStyledAttributes.getColor(AbstractC1110y.f11757L, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(AbstractC1110y.f11753H, i17);
                boolean z16 = typedArrayObtainStyledAttributes.getBoolean(AbstractC1110y.f11759N, true);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(AbstractC1110y.f11749D, 0);
                boolean z17 = typedArrayObtainStyledAttributes.getBoolean(AbstractC1110y.f11760O, true);
                int i18 = typedArrayObtainStyledAttributes.getInt(AbstractC1110y.f11758M, 1);
                int i19 = typedArrayObtainStyledAttributes.getInt(AbstractC1110y.f11754I, 0);
                int i20 = typedArrayObtainStyledAttributes.getInt(AbstractC1110y.f11756K, 5000);
                boolean z18 = typedArrayObtainStyledAttributes.getBoolean(AbstractC1110y.f11751F, true);
                boolean z19 = typedArrayObtainStyledAttributes.getBoolean(AbstractC1110y.f11748C, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(AbstractC1110y.f11755J, 0);
                this.f25864t0 = typedArrayObtainStyledAttributes.getBoolean(AbstractC1110y.f11752G, this.f25864t0);
                boolean z20 = typedArrayObtainStyledAttributes.getBoolean(AbstractC1110y.f11750E, true);
                typedArrayObtainStyledAttributes.recycle();
                i13 = i19;
                i12 = integer;
                z11 = z20;
                z9 = z18;
                i11 = i20;
                i10 = resourceId;
                z10 = z19;
                z14 = z17;
                i16 = resourceId2;
                z13 = z16;
                i15 = color;
                z12 = zHasValue;
                i14 = i18;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i10 = i17;
            i11 = 5000;
            z9 = true;
            i12 = 0;
            z10 = true;
            z11 = true;
            i13 = 0;
            i14 = 1;
            z12 = false;
            i15 = 0;
            z13 = true;
            i16 = 0;
            z14 = true;
        }
        LayoutInflater.from(context).inflate(i10, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(AbstractC1104s.f11682i);
        this.f25828V = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            I(aspectRatioFrameLayout, i13);
        }
        View viewFindViewById = findViewById(AbstractC1104s.f11665O);
        this.f25829W = viewFindViewById;
        if (viewFindViewById != null && z12) {
            viewFindViewById.setBackgroundColor(i15);
        }
        if (aspectRatioFrameLayout == null || i14 == 0) {
            this.f25834e0 = null;
            z15 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i14 == 2) {
                textureView = new TextureView(context);
            } else if (i14 == 3) {
                try {
                    int i21 = l.f40667n;
                    this.f25834e0 = (View) l.class.getConstructor(Context.class).newInstance(context);
                    z15 = true;
                    this.f25834e0.setLayoutParams(layoutParams);
                    this.f25834e0.setOnClickListener(bVar);
                    this.f25834e0.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f25834e0, 0);
                } catch (Exception e9) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e9);
                }
            } else if (i14 != 4) {
                textureView = new SurfaceView(context);
            } else {
                try {
                    int i22 = k.f40345c;
                    this.f25834e0 = (View) k.class.getConstructor(Context.class).newInstance(context);
                    z15 = false;
                    this.f25834e0.setLayoutParams(layoutParams);
                    this.f25834e0.setOnClickListener(bVar);
                    this.f25834e0.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f25834e0, 0);
                } catch (Exception e10) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e10);
                }
            }
            this.f25834e0 = textureView;
            z15 = false;
            this.f25834e0.setLayoutParams(layoutParams);
            this.f25834e0.setOnClickListener(bVar);
            this.f25834e0.setClickable(false);
            aspectRatioFrameLayout.addView(this.f25834e0, 0);
        }
        this.f25836f0 = z15;
        this.f25848l0 = (FrameLayout) findViewById(AbstractC1104s.f11674a);
        this.f25850m0 = (FrameLayout) findViewById(AbstractC1104s.f11651A);
        ImageView imageView2 = (ImageView) findViewById(AbstractC1104s.f11675b);
        this.f25838g0 = imageView2;
        this.f25858q0 = z13 && imageView2 != null;
        if (i16 != 0) {
            this.f25860r0 = E.b.getDrawable(getContext(), i16);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(AbstractC1104s.f11668R);
        this.f25840h0 = subtitleView;
        if (subtitleView != null) {
            subtitleView.d();
            subtitleView.e();
        }
        View viewFindViewById2 = findViewById(AbstractC1104s.f11679f);
        this.f25842i0 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f25862s0 = i12;
        TextView textView = (TextView) findViewById(AbstractC1104s.f11687n);
        this.f25844j0 = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        com.google.android.exoplayer2.ui.c cVar = (com.google.android.exoplayer2.ui.c) findViewById(AbstractC1104s.f11683j);
        View viewFindViewById3 = findViewById(AbstractC1104s.f11684k);
        if (cVar != null) {
            this.f25846k0 = cVar;
        } else if (viewFindViewById3 != null) {
            com.google.android.exoplayer2.ui.c cVar2 = new com.google.android.exoplayer2.ui.c(context, null, 0, attributeSet);
            this.f25846k0 = cVar2;
            cVar2.setId(AbstractC1104s.f11683j);
            cVar2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(cVar2, iIndexOfChild);
        } else {
            this.f25846k0 = null;
        }
        com.google.android.exoplayer2.ui.c cVar3 = this.f25846k0;
        this.f25870w0 = cVar3 != null ? i11 : 0;
        this.f25876z0 = z9;
        this.f25872x0 = z10;
        this.f25874y0 = z11;
        this.f25854o0 = z14 && cVar3 != null;
        if (cVar3 != null) {
            cVar3.A();
            this.f25846k0.w(bVar);
        }
        if (z14) {
            setClickable(true);
        }
        Q();
    }

    public static void I(AspectRatioFrameLayout aspectRatioFrameLayout, int i9) {
        aspectRatioFrameLayout.setResizeMode(i9);
    }

    public static void o(TextureView textureView, int i9) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i9 != 0) {
            float f9 = width / 2.0f;
            float f10 = height / 2.0f;
            matrix.postRotate(i9, f9, f10);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f9, f10);
        }
        textureView.setTransform(matrix);
    }

    public static void r(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(k0.X(context, resources, AbstractC1103q.f11636f));
        imageView.setBackgroundColor(resources.getColor(AbstractC1101o.f11626a));
    }

    public static void s(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(k0.X(context, resources, AbstractC1103q.f11636f));
        imageView.setBackgroundColor(resources.getColor(AbstractC1101o.f11626a, null));
    }

    public final void A(boolean z9) {
        if (!(z() && this.f25874y0) && V()) {
            boolean z10 = this.f25846k0.D() && this.f25846k0.getShowTimeoutMs() <= 0;
            boolean zJ = J();
            if (z9 || z10 || zJ) {
                L(zJ);
            }
        }
    }

    public void B(AspectRatioFrameLayout aspectRatioFrameLayout, float f9) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f9);
        }
    }

    public void C() {
        View view = this.f25834e0;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onPause();
        }
    }

    public void D() {
        View view = this.f25834e0;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onResume();
        }
    }

    public void E() {
        Handler handler = this.f25823Q;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void F(Activity activity, PlayerView playerView, LinearLayout linearLayout, Animation animation, Animation animation2, LinearLayout linearLayout2, Animation animation3, Animation animation4, LinearLayout linearLayout3, Animation animation5, Animation animation6, RelativeLayout relativeLayout, Animation animation7, ProgressBar progressBar) {
        this.f25832d = activity;
        this.f25833e = playerView;
        this.f25823Q = new Handler();
        this.f25824R = new Handler();
        this.f25863t = linearLayout;
        this.f25865u = new Handler();
        this.f25869w = new Handler();
        this.f25873y = animation;
        this.f25875z = animation2;
        this.f25808B = linearLayout2;
        this.f25809C = animation3;
        this.f25810D = animation4;
        this.f25811E = linearLayout3;
        this.f25812F = animation5;
        this.f25813G = animation6;
        this.f25815I = relativeLayout;
        this.f25814H = animation7;
        this.f25826T = progressBar;
        this.f25837g = new c(activity);
    }

    public final boolean G(R0 r02) {
        byte[] bArr = r02.f5814k;
        if (bArr == null) {
            return false;
        }
        return H(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    public final boolean H(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                B(this.f25828V, intrinsicWidth / intrinsicHeight);
                this.f25838g0.setImageDrawable(drawable);
                this.f25838g0.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final boolean J() {
        InterfaceC0920t1 interfaceC0920t1 = this.f25852n0;
        if (interfaceC0920t1 == null) {
            return true;
        }
        int playbackState = interfaceC0920t1.getPlaybackState();
        return this.f25872x0 && (playbackState == 1 || playbackState == 4 || !this.f25852n0.E());
    }

    public void K() {
        L(J());
    }

    public final void L(boolean z9) {
        if (V()) {
            this.f25846k0.setShowTimeoutMs(z9 ? 0 : this.f25870w0);
            this.f25846k0.J();
        }
    }

    public void M() {
        if (this.f25863t.getVisibility() == 8) {
            this.f25811E.startAnimation(this.f25812F);
            this.f25811E.setVisibility(0);
        }
    }

    public final void N() {
        if (!V() || this.f25852n0 == null) {
            return;
        }
        if (!this.f25846k0.D()) {
            A(true);
        } else if (this.f25876z0) {
            this.f25846k0.A();
        }
    }

    public final void O() {
        InterfaceC0920t1 interfaceC0920t1 = this.f25852n0;
        C1737C c1737cL = interfaceC0920t1 != null ? interfaceC0920t1.L() : C1737C.f40172f;
        int i9 = c1737cL.f40178a;
        int i10 = c1737cL.f40179c;
        int i11 = c1737cL.f40180d;
        float f9 = (i10 == 0 || i9 == 0) ? 0.0f : (i9 * c1737cL.f40181e) / i10;
        View view = this.f25834e0;
        if (view instanceof TextureView) {
            if (f9 > 0.0f && (i11 == 90 || i11 == 270)) {
                f9 = 1.0f / f9;
            }
            if (this.f25807A0 != 0) {
                view.removeOnLayoutChangeListener(this.f25827U);
            }
            this.f25807A0 = i11;
            if (i11 != 0) {
                this.f25834e0.addOnLayoutChangeListener(this.f25827U);
            }
            o((TextureView) this.f25834e0, this.f25807A0);
        }
        B(this.f25828V, this.f25836f0 ? 0.0f : f9);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P() {
        /*
            r4 = this;
            android.view.View r0 = r4.f25842i0
            if (r0 == 0) goto L2b
            O2.t1 r0 = r4.f25852n0
            r1 = 0
            if (r0 == 0) goto L20
            int r0 = r0.getPlaybackState()
            r2 = 2
            if (r0 != r2) goto L20
            int r0 = r4.f25862s0
            r3 = 1
            if (r0 == r2) goto L21
            if (r0 != r3) goto L20
            O2.t1 r0 = r4.f25852n0
            boolean r0 = r0.E()
            if (r0 == 0) goto L20
            goto L21
        L20:
            r3 = 0
        L21:
            android.view.View r0 = r4.f25842i0
            if (r3 == 0) goto L26
            goto L28
        L26:
            r1 = 8
        L28:
            r0.setVisibility(r1)
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.PlayerView.P():void");
    }

    public final void Q() {
        com.google.android.exoplayer2.ui.c cVar = this.f25846k0;
        String string = null;
        if (cVar != null && this.f25854o0) {
            if (cVar.getVisibility() != 0) {
                setContentDescription(getResources().getString(AbstractC1108w.f11730l));
                return;
            } else if (this.f25876z0) {
                string = getResources().getString(AbstractC1108w.f11723e);
            }
        }
        setContentDescription(string);
    }

    public final void R() {
        if (z() && this.f25874y0) {
            w();
        } else {
            A(false);
        }
    }

    public final void S() {
        InterfaceC1699p interfaceC1699p;
        TextView textView = this.f25844j0;
        if (textView != null) {
            CharSequence charSequence = this.f25868v0;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f25844j0.setVisibility(0);
                return;
            }
            InterfaceC0920t1 interfaceC0920t1 = this.f25852n0;
            C0909p1 c0909p1N = interfaceC0920t1 != null ? interfaceC0920t1.n() : null;
            if (c0909p1N == null || (interfaceC1699p = this.f25866u0) == null) {
                this.f25844j0.setVisibility(8);
            } else {
                this.f25844j0.setText((CharSequence) interfaceC1699p.a(c0909p1N).second);
                this.f25844j0.setVisibility(0);
            }
        }
    }

    public final void T(boolean z9) {
        InterfaceC0920t1 interfaceC0920t1 = this.f25852n0;
        if (interfaceC0920t1 == null || !interfaceC0920t1.t(30) || interfaceC0920t1.p().d()) {
            if (this.f25864t0) {
                return;
            }
            v();
            q();
            return;
        }
        if (z9 && !this.f25864t0) {
            q();
        }
        if (interfaceC0920t1.p().e(2)) {
            v();
            return;
        }
        q();
        if (U() && (G(interfaceC0920t1.e0()) || H(this.f25860r0))) {
            return;
        }
        v();
    }

    public final boolean U() {
        if (!this.f25858q0) {
            return false;
        }
        AbstractC1684a.i(this.f25838g0);
        return true;
    }

    public final boolean V() {
        if (!this.f25854o0) {
            return false;
        }
        AbstractC1684a.i(this.f25846k0);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        InterfaceC0920t1 interfaceC0920t1 = this.f25852n0;
        if (interfaceC0920t1 != null && interfaceC0920t1.d()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zY = y(keyEvent.getKeyCode());
        if ((zY && V() && !this.f25846k0.D()) || t(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            A(true);
            return true;
        }
        if (zY && V()) {
            A(true);
        }
        return false;
    }

    @Override // a4.InterfaceC1088b
    public List<C1087a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f25850m0;
        if (frameLayout != null) {
            arrayList.add(new C1087a(frameLayout, 4, "Transparent overlay does not impact viewability"));
        }
        com.google.android.exoplayer2.ui.c cVar = this.f25846k0;
        if (cVar != null) {
            arrayList.add(new C1087a(cVar, 1));
        }
        return AbstractC2743y.r(arrayList);
    }

    @Override // a4.InterfaceC1088b
    public ViewGroup getAdViewGroup() {
        return (ViewGroup) AbstractC1684a.j(this.f25848l0, "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.f25872x0;
    }

    public boolean getControllerHideOnTouch() {
        return this.f25876z0;
    }

    public int getControllerShowTimeoutMs() {
        return this.f25870w0;
    }

    public int getCurrentWindowIndex() {
        return this.f25822P;
    }

    public Drawable getDefaultArtwork() {
        return this.f25860r0;
    }

    public Boolean getFullScreenValue() {
        return Boolean.valueOf(this.f25825S);
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f25850m0;
    }

    public InterfaceC0920t1 getPlayer() {
        return this.f25852n0;
    }

    public int getResizeMode() {
        AbstractC1684a.i(this.f25828V);
        return this.f25828V.getResizeMode();
    }

    public String getShowOrHideSubtitles() {
        return this.f25831c;
    }

    public SubtitleView getSubtitleView() {
        return this.f25840h0;
    }

    public boolean getUseArtwork() {
        return this.f25858q0;
    }

    public boolean getUseController() {
        return this.f25854o0;
    }

    public View getVideoSurfaceView() {
        return this.f25834e0;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!V() || this.f25852n0 == null) {
            return false;
        }
        A(true);
        return true;
    }

    public void p(int i9) {
        a aVar = new a();
        this.f25871x = aVar;
        this.f25869w.postDelayed(aVar, i9);
    }

    @Override // android.view.View
    public boolean performClick() {
        N();
        return super.performClick();
    }

    public final void q() {
        View view = this.f25829W;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public void setAdjustViewBounds(boolean z9) {
        if (this.f25816J == z9) {
            return;
        }
        this.f25816J = z9;
        if (z9) {
            setBackground(null);
        } else {
            setBackgroundColor(DefaultRenderer.BACKGROUND_COLOR);
        }
        requestLayout();
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.b bVar) {
        AbstractC1684a.i(this.f25828V);
        this.f25828V.setAspectRatioListener(bVar);
    }

    public void setContext(Context context) {
        this.f25821O = context;
    }

    public void setControllerAutoShow(boolean z9) {
        this.f25872x0 = z9;
    }

    public void setControllerHideDuringAds(boolean z9) {
        this.f25874y0 = z9;
    }

    public void setControllerHideOnTouch(boolean z9) {
        AbstractC1684a.i(this.f25846k0);
        this.f25876z0 = z9;
        Q();
    }

    public void setControllerShowTimeoutMs(int i9) {
        AbstractC1684a.i(this.f25846k0);
        this.f25870w0 = i9;
        if (this.f25846k0.D()) {
            K();
        }
    }

    public void setControllerVisibilityListener(c.e eVar) {
        AbstractC1684a.i(this.f25846k0);
        c.e eVar2 = this.f25856p0;
        if (eVar2 == eVar) {
            return;
        }
        if (eVar2 != null) {
            this.f25846k0.E(eVar2);
        }
        this.f25856p0 = eVar;
        if (eVar != null) {
            this.f25846k0.w(eVar);
        }
    }

    public void setCurrentChannelLogo(String str) {
        this.f25819M = str;
    }

    public void setCurrentEpgChannelID(String str) {
        this.f25818L = str;
    }

    public void setCurrentWindowIndex(int i9) {
        this.f25822P = i9;
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        AbstractC1684a.g(this.f25844j0 != null);
        this.f25868v0 = charSequence;
        S();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f25860r0 != drawable) {
            this.f25860r0 = drawable;
            T(false);
        }
    }

    public void setEPGHandler(Handler handler) {
        this.f25820N = handler;
    }

    public void setErrorMessageProvider(InterfaceC1699p interfaceC1699p) {
        if (this.f25866u0 != interfaceC1699p) {
            this.f25866u0 = interfaceC1699p;
            S();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z9) {
        if (this.f25864t0 != z9) {
            this.f25864t0 = z9;
            T(false);
        }
    }

    public void setPlayer(InterfaceC0920t1 interfaceC0920t1) {
        AbstractC1684a.g(Looper.myLooper() == Looper.getMainLooper());
        AbstractC1684a.a(interfaceC0920t1 == null || interfaceC0920t1.x() == Looper.getMainLooper());
        InterfaceC0920t1 interfaceC0920t12 = this.f25852n0;
        if (interfaceC0920t12 == interfaceC0920t1) {
            return;
        }
        if (interfaceC0920t12 != null) {
            interfaceC0920t12.l(this.f25827U);
            if (interfaceC0920t12.t(27)) {
                View view = this.f25834e0;
                if (view instanceof TextureView) {
                    interfaceC0920t12.K((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    interfaceC0920t12.Y((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.f25840h0;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f25852n0 = interfaceC0920t1;
        if (V()) {
            this.f25846k0.setPlayer(interfaceC0920t1);
        }
        P();
        S();
        T(true);
        if (interfaceC0920t1 == null) {
            w();
            return;
        }
        if (interfaceC0920t1.t(27)) {
            View view2 = this.f25834e0;
            if (view2 instanceof TextureView) {
                interfaceC0920t1.A((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                interfaceC0920t1.j((SurfaceView) view2);
            }
            O();
        }
        if (this.f25840h0 != null && interfaceC0920t1.t(28)) {
            this.f25840h0.setCues(interfaceC0920t1.r().f7230a);
        }
        interfaceC0920t1.B(this.f25827U);
        A(false);
    }

    public void setRepeatToggleModes(int i9) {
        AbstractC1684a.i(this.f25846k0);
        this.f25846k0.setRepeatToggleModes(i9);
    }

    public void setResizeMode(int i9) {
        AbstractC1684a.i(this.f25828V);
        this.f25828V.setResizeMode(i9);
    }

    public void setShowBuffering(int i9) {
        if (this.f25862s0 != i9) {
            this.f25862s0 = i9;
            P();
        }
    }

    public void setShowFastForwardButton(boolean z9) {
        AbstractC1684a.i(this.f25846k0);
        this.f25846k0.setShowFastForwardButton(z9);
    }

    public void setShowMultiWindowTimeBar(boolean z9) {
        AbstractC1684a.i(this.f25846k0);
        this.f25846k0.setShowMultiWindowTimeBar(z9);
    }

    public void setShowNextButton(boolean z9) {
        AbstractC1684a.i(this.f25846k0);
        this.f25846k0.setShowNextButton(z9);
    }

    public void setShowOrHideSubtitles(String str) {
        this.f25831c = str;
    }

    public void setShowPreviousButton(boolean z9) {
        AbstractC1684a.i(this.f25846k0);
        this.f25846k0.setShowPreviousButton(z9);
    }

    public void setShowRewindButton(boolean z9) {
        AbstractC1684a.i(this.f25846k0);
        this.f25846k0.setShowRewindButton(z9);
    }

    public void setShowShuffleButton(boolean z9) {
        AbstractC1684a.i(this.f25846k0);
        this.f25846k0.setShowShuffleButton(z9);
    }

    public void setShutterBackgroundColor(int i9) {
        View view = this.f25829W;
        if (view != null) {
            view.setBackgroundColor(i9);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f25837g.a(AbstractC1104s.f11673W).b(charSequence);
    }

    public void setUseArtwork(boolean z9) {
        AbstractC1684a.g((z9 && this.f25838g0 == null) ? false : true);
        if (this.f25858q0 != z9) {
            this.f25858q0 = z9;
            T(false);
        }
    }

    public void setUseController(boolean z9) {
        com.google.android.exoplayer2.ui.c cVar;
        InterfaceC0920t1 interfaceC0920t1;
        boolean z10 = true;
        AbstractC1684a.g((z9 && this.f25846k0 == null) ? false : true);
        if (!z9 && !hasOnClickListeners()) {
            z10 = false;
        }
        setClickable(z10);
        if (this.f25854o0 == z9) {
            return;
        }
        this.f25854o0 = z9;
        if (!V()) {
            com.google.android.exoplayer2.ui.c cVar2 = this.f25846k0;
            if (cVar2 != null) {
                cVar2.A();
                cVar = this.f25846k0;
                interfaceC0920t1 = null;
            }
            Q();
        }
        cVar = this.f25846k0;
        interfaceC0920t1 = this.f25852n0;
        cVar.setPlayer(interfaceC0920t1);
        Q();
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        View view = this.f25834e0;
        if (view instanceof SurfaceView) {
            view.setVisibility(i9);
        }
    }

    public boolean t(KeyEvent keyEvent) {
        return V() && this.f25846k0.y(keyEvent);
    }

    public void u(Boolean bool) {
        this.f25825S = bool.booleanValue();
    }

    public final void v() {
        ImageView imageView = this.f25838g0;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            this.f25838g0.setVisibility(4);
        }
    }

    public void w() {
        com.google.android.exoplayer2.ui.c cVar = this.f25846k0;
        if (cVar != null) {
            cVar.A();
        }
    }

    public void x() {
        if (this.f25811E.getVisibility() == 0) {
            this.f25811E.startAnimation(this.f25813G);
            this.f25811E.setVisibility(8);
        }
    }

    public final boolean y(int i9) {
        return i9 == 19 || i9 == 270 || i9 == 22 || i9 == 271 || i9 == 20 || i9 == 269 || i9 == 21 || i9 == 268 || i9 == 23;
    }

    public final boolean z() {
        InterfaceC0920t1 interfaceC0920t1 = this.f25852n0;
        return interfaceC0920t1 != null && interfaceC0920t1.d() && this.f25852n0.E();
    }
}
