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
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.GLSurfaceView;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.e;
import d4.AbstractC1684a;
import d4.InterfaceC1699p;
import d4.k0;
import e4.C1737C;
import e4.k;
import f4.l;
import java.util.ArrayList;
import java.util.List;
import q3.C2540a;
import s5.AbstractC2743y;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class StyledPlayerView extends FrameLayout implements InterfaceC1088b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f25884A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f25885B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f25886a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AspectRatioFrameLayout f25887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f25888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f25889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f25890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f25891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SubtitleView f25892h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f25893i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f25894j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f25895k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final FrameLayout f25896l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final FrameLayout f25897m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InterfaceC0920t1 f25898n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f25899o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f25900p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public e.m f25901q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f25902r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Drawable f25903s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f25904t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f25905u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public InterfaceC1699p f25906v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CharSequence f25907w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f25908x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f25909y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f25910z;

    public final class a implements InterfaceC0920t1.d, View.OnLayoutChangeListener, View.OnClickListener, e.m, e.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Q1.b f25911a = new Q1.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f25912c;

        public a() {
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void A(C1019e c1019e) {
            AbstractC0926v1.a(this, c1019e);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void B(boolean z9) {
            AbstractC0926v1.j(this, z9);
        }

        @Override // com.google.android.exoplayer2.ui.e.d
        public void C(boolean z9) {
            StyledPlayerView.h(StyledPlayerView.this);
        }

        @Override // O2.InterfaceC0920t1.d
        public void E(int i9) {
            StyledPlayerView.this.L();
            StyledPlayerView.this.O();
            StyledPlayerView.this.N();
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
            if (StyledPlayerView.this.f25888d != null) {
                StyledPlayerView.this.f25888d.setVisibility(4);
            }
        }

        @Override // O2.InterfaceC0920t1.d
        public void S(InterfaceC0920t1.e eVar, InterfaceC0920t1.e eVar2, int i9) {
            if (StyledPlayerView.this.y() && StyledPlayerView.this.f25910z) {
                StyledPlayerView.this.w();
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
            InterfaceC0920t1 interfaceC0920t1 = (InterfaceC0920t1) AbstractC1684a.e(StyledPlayerView.this.f25898n);
            Q1 q1W = interfaceC0920t1.t(17) ? interfaceC0920t1.w() : Q1.f5705a;
            if (q1W.v()) {
                this.f25912c = null;
            } else if (!interfaceC0920t1.t(30) || interfaceC0920t1.p().d()) {
                Object obj = this.f25912c;
                if (obj != null) {
                    int iF = q1W.f(obj);
                    if (iF != -1) {
                        if (interfaceC0920t1.X() == q1W.k(iF, this.f25911a).f5718d) {
                            return;
                        }
                    }
                    this.f25912c = null;
                }
            } else {
                this.f25912c = q1W.l(interfaceC0920t1.J(), this.f25911a, true).f5717c;
            }
            StyledPlayerView.this.P(false);
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
            if (c1737c.equals(C1737C.f40172f) || StyledPlayerView.this.f25898n == null || StyledPlayerView.this.f25898n.getPlaybackState() == 1) {
                return;
            }
            StyledPlayerView.this.K();
        }

        @Override // O2.InterfaceC0920t1.d
        public void j0(boolean z9, int i9) {
            StyledPlayerView.this.L();
            StyledPlayerView.this.N();
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

        @Override // com.google.android.exoplayer2.ui.e.m
        public void o(int i9) {
            StyledPlayerView.this.M();
            if (StyledPlayerView.this.f25900p != null) {
                StyledPlayerView.this.f25900p.D(i9);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            StyledPlayerView.this.J();
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            StyledPlayerView.q((TextureView) view, StyledPlayerView.this.f25885B);
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
            if (StyledPlayerView.this.f25892h != null) {
                StyledPlayerView.this.f25892h.setCues(fVar.f7230a);
            }
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void z(int i9) {
            AbstractC0926v1.q(this, i9);
        }
    }

    public interface b {
        void D(int i9);
    }

    public interface c {
    }

    public StyledPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StyledPlayerView(Context context, AttributeSet attributeSet, int i9) {
        int i10;
        int i11;
        int i12;
        boolean z9;
        boolean z10;
        int i13;
        int i14;
        int i15;
        boolean z11;
        int i16;
        boolean z12;
        int i17;
        boolean z13;
        boolean z14;
        boolean z15;
        View textureView;
        super(context, attributeSet, i9);
        a aVar = new a();
        this.f25886a = aVar;
        if (isInEditMode()) {
            this.f25887c = null;
            this.f25888d = null;
            this.f25889e = null;
            this.f25890f = false;
            this.f25891g = null;
            this.f25892h = null;
            this.f25893i = null;
            this.f25894j = null;
            this.f25895k = null;
            this.f25896l = null;
            this.f25897m = null;
            ImageView imageView = new ImageView(context);
            if (k0.f39777a >= 23) {
                t(context, getResources(), imageView);
            } else {
                s(context, getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i18 = AbstractC1106u.f11706e;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC1110y.f11777c0, i9, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(AbstractC1110y.f11799n0);
                int color = typedArrayObtainStyledAttributes.getColor(AbstractC1110y.f11799n0, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(AbstractC1110y.f11791j0, i18);
                boolean z16 = typedArrayObtainStyledAttributes.getBoolean(AbstractC1110y.f11803p0, true);
                int i19 = typedArrayObtainStyledAttributes.getInt(AbstractC1110y.f11779d0, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(AbstractC1110y.f11783f0, 0);
                boolean z17 = typedArrayObtainStyledAttributes.getBoolean(AbstractC1110y.f11805q0, true);
                int i20 = typedArrayObtainStyledAttributes.getInt(AbstractC1110y.f11801o0, 1);
                int i21 = typedArrayObtainStyledAttributes.getInt(AbstractC1110y.f11793k0, 0);
                int i22 = typedArrayObtainStyledAttributes.getInt(AbstractC1110y.f11797m0, 5000);
                z10 = typedArrayObtainStyledAttributes.getBoolean(AbstractC1110y.f11787h0, true);
                boolean z18 = typedArrayObtainStyledAttributes.getBoolean(AbstractC1110y.f11781e0, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(AbstractC1110y.f11795l0, 0);
                this.f25905u = typedArrayObtainStyledAttributes.getBoolean(AbstractC1110y.f11789i0, this.f25905u);
                boolean z19 = typedArrayObtainStyledAttributes.getBoolean(AbstractC1110y.f11785g0, true);
                typedArrayObtainStyledAttributes.recycle();
                z9 = z18;
                i13 = integer;
                z14 = z19;
                i12 = i21;
                i11 = i22;
                i10 = resourceId;
                z13 = z17;
                i17 = i19;
                i16 = color;
                i15 = resourceId2;
                z12 = z16;
                z11 = zHasValue;
                i14 = i20;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i10 = i18;
            i11 = 5000;
            i12 = 0;
            z9 = true;
            z10 = true;
            i13 = 0;
            i14 = 1;
            i15 = 0;
            z11 = false;
            i16 = 0;
            z12 = true;
            i17 = 1;
            z13 = true;
            z14 = true;
        }
        LayoutInflater.from(context).inflate(i10, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(AbstractC1104s.f11682i);
        this.f25887c = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            F(aspectRatioFrameLayout, i12);
        }
        View viewFindViewById = findViewById(AbstractC1104s.f11665O);
        this.f25888d = viewFindViewById;
        if (viewFindViewById != null && z11) {
            viewFindViewById.setBackgroundColor(i16);
        }
        if (aspectRatioFrameLayout == null || i14 == 0) {
            this.f25889e = null;
            z15 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i14 == 2) {
                textureView = new TextureView(context);
            } else if (i14 == 3) {
                try {
                    int i23 = l.f40667n;
                    this.f25889e = (View) l.class.getConstructor(Context.class).newInstance(context);
                    z15 = true;
                    this.f25889e.setLayoutParams(layoutParams);
                    this.f25889e.setOnClickListener(aVar);
                    this.f25889e.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f25889e, 0);
                } catch (Exception e9) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e9);
                }
            } else if (i14 != 4) {
                textureView = new SurfaceView(context);
            } else {
                try {
                    int i24 = k.f40345c;
                    this.f25889e = (View) k.class.getConstructor(Context.class).newInstance(context);
                    z15 = false;
                    this.f25889e.setLayoutParams(layoutParams);
                    this.f25889e.setOnClickListener(aVar);
                    this.f25889e.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f25889e, 0);
                } catch (Exception e10) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e10);
                }
            }
            this.f25889e = textureView;
            z15 = false;
            this.f25889e.setLayoutParams(layoutParams);
            this.f25889e.setOnClickListener(aVar);
            this.f25889e.setClickable(false);
            aspectRatioFrameLayout.addView(this.f25889e, 0);
        }
        this.f25890f = z15;
        this.f25896l = (FrameLayout) findViewById(AbstractC1104s.f11674a);
        this.f25897m = (FrameLayout) findViewById(AbstractC1104s.f11651A);
        ImageView imageView2 = (ImageView) findViewById(AbstractC1104s.f11675b);
        this.f25891g = imageView2;
        this.f25902r = (!z12 || i17 == 0 || imageView2 == null) ? 0 : i17;
        if (i15 != 0) {
            this.f25903s = E.b.getDrawable(getContext(), i15);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(AbstractC1104s.f11668R);
        this.f25892h = subtitleView;
        if (subtitleView != null) {
            subtitleView.d();
            subtitleView.e();
        }
        View viewFindViewById2 = findViewById(AbstractC1104s.f11679f);
        this.f25893i = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f25904t = i13;
        TextView textView = (TextView) findViewById(AbstractC1104s.f11687n);
        this.f25894j = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        e eVar = (e) findViewById(AbstractC1104s.f11683j);
        View viewFindViewById3 = findViewById(AbstractC1104s.f11684k);
        if (eVar != null) {
            this.f25895k = eVar;
        } else if (viewFindViewById3 != null) {
            e eVar2 = new e(context, null, 0, attributeSet);
            this.f25895k = eVar2;
            eVar2.setId(AbstractC1104s.f11683j);
            eVar2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(eVar2, iIndexOfChild);
        } else {
            this.f25895k = null;
        }
        e eVar3 = this.f25895k;
        this.f25908x = eVar3 != null ? i11 : 0;
        this.f25884A = z10;
        this.f25909y = z9;
        this.f25910z = z14;
        this.f25899o = z13 && eVar3 != null;
        if (eVar3 != null) {
            eVar3.Y();
            this.f25895k.R(aVar);
        }
        if (z13) {
            setClickable(true);
        }
        M();
    }

    private boolean E(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f25902r == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                A(this.f25887c, width);
                this.f25891g.setScaleType(scaleType);
                this.f25891g.setImageDrawable(drawable);
                this.f25891g.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private static void F(AspectRatioFrameLayout aspectRatioFrameLayout, int i9) {
        aspectRatioFrameLayout.setResizeMode(i9);
    }

    private boolean G() {
        InterfaceC0920t1 interfaceC0920t1 = this.f25898n;
        if (interfaceC0920t1 == null) {
            return true;
        }
        int playbackState = interfaceC0920t1.getPlaybackState();
        return this.f25909y && !(this.f25898n.t(17) && this.f25898n.w().v()) && (playbackState == 1 || playbackState == 4 || !((InterfaceC0920t1) AbstractC1684a.e(this.f25898n)).E());
    }

    private void I(boolean z9) {
        if (R()) {
            this.f25895k.setShowTimeoutMs(z9 ? 0 : this.f25908x);
            this.f25895k.m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        if (!R() || this.f25898n == null) {
            return;
        }
        if (!this.f25895k.b0()) {
            z(true);
        } else if (this.f25884A) {
            this.f25895k.X();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        InterfaceC0920t1 interfaceC0920t1 = this.f25898n;
        C1737C c1737cL = interfaceC0920t1 != null ? interfaceC0920t1.L() : C1737C.f40172f;
        int i9 = c1737cL.f40178a;
        int i10 = c1737cL.f40179c;
        int i11 = c1737cL.f40180d;
        float f9 = (i10 == 0 || i9 == 0) ? 0.0f : (i9 * c1737cL.f40181e) / i10;
        View view = this.f25889e;
        if (view instanceof TextureView) {
            if (f9 > 0.0f && (i11 == 90 || i11 == 270)) {
                f9 = 1.0f / f9;
            }
            if (this.f25885B != 0) {
                view.removeOnLayoutChangeListener(this.f25886a);
            }
            this.f25885B = i11;
            if (i11 != 0) {
                this.f25889e.addOnLayoutChangeListener(this.f25886a);
            }
            q((TextureView) this.f25889e, this.f25885B);
        }
        A(this.f25887c, this.f25890f ? 0.0f : f9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void L() {
        /*
            r4 = this;
            android.view.View r0 = r4.f25893i
            if (r0 == 0) goto L2b
            O2.t1 r0 = r4.f25898n
            r1 = 0
            if (r0 == 0) goto L20
            int r0 = r0.getPlaybackState()
            r2 = 2
            if (r0 != r2) goto L20
            int r0 = r4.f25904t
            r3 = 1
            if (r0 == r2) goto L21
            if (r0 != r3) goto L20
            O2.t1 r0 = r4.f25898n
            boolean r0 = r0.E()
            if (r0 == 0) goto L20
            goto L21
        L20:
            r3 = 0
        L21:
            android.view.View r0 = r4.f25893i
            if (r3 == 0) goto L26
            goto L28
        L26:
            r1 = 8
        L28:
            r0.setVisibility(r1)
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.StyledPlayerView.L():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        e eVar = this.f25895k;
        String string = null;
        if (eVar != null && this.f25899o) {
            if (!eVar.b0()) {
                setContentDescription(getResources().getString(AbstractC1108w.f11730l));
                return;
            } else if (this.f25884A) {
                string = getResources().getString(AbstractC1108w.f11723e);
            }
        }
        setContentDescription(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        if (y() && this.f25910z) {
            w();
        } else {
            z(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        InterfaceC1699p interfaceC1699p;
        TextView textView = this.f25894j;
        if (textView != null) {
            CharSequence charSequence = this.f25907w;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f25894j.setVisibility(0);
                return;
            }
            InterfaceC0920t1 interfaceC0920t1 = this.f25898n;
            C0909p1 c0909p1N = interfaceC0920t1 != null ? interfaceC0920t1.n() : null;
            if (c0909p1N == null || (interfaceC1699p = this.f25906v) == null) {
                this.f25894j.setVisibility(8);
            } else {
                this.f25894j.setText((CharSequence) interfaceC1699p.a(c0909p1N).second);
                this.f25894j.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(boolean z9) {
        InterfaceC0920t1 interfaceC0920t1 = this.f25898n;
        if (interfaceC0920t1 == null || !interfaceC0920t1.t(30) || interfaceC0920t1.p().d()) {
            if (this.f25905u) {
                return;
            }
            v();
            r();
            return;
        }
        if (z9 && !this.f25905u) {
            r();
        }
        if (interfaceC0920t1.p().e(2)) {
            v();
            return;
        }
        r();
        if (Q() && (D(interfaceC0920t1) || E(this.f25903s))) {
            return;
        }
        v();
    }

    private boolean Q() {
        if (this.f25902r == 0) {
            return false;
        }
        AbstractC1684a.i(this.f25891g);
        return true;
    }

    private boolean R() {
        if (!this.f25899o) {
            return false;
        }
        AbstractC1684a.i(this.f25895k);
        return true;
    }

    public static /* synthetic */ c h(StyledPlayerView styledPlayerView) {
        styledPlayerView.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(TextureView textureView, int i9) {
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

    private void r() {
        View view = this.f25888d;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void s(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(k0.X(context, resources, AbstractC1103q.f11636f));
        imageView.setBackgroundColor(resources.getColor(AbstractC1101o.f11626a));
    }

    private static void t(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(k0.X(context, resources, AbstractC1103q.f11636f));
        imageView.setBackgroundColor(resources.getColor(AbstractC1101o.f11626a, null));
    }

    private void v() {
        ImageView imageView = this.f25891g;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            this.f25891g.setVisibility(4);
        }
    }

    private boolean x(int i9) {
        return i9 == 19 || i9 == 270 || i9 == 22 || i9 == 271 || i9 == 20 || i9 == 269 || i9 == 21 || i9 == 268 || i9 == 23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y() {
        InterfaceC0920t1 interfaceC0920t1 = this.f25898n;
        return interfaceC0920t1 != null && interfaceC0920t1.t(16) && this.f25898n.d() && this.f25898n.E();
    }

    private void z(boolean z9) {
        if (!(y() && this.f25910z) && R()) {
            boolean z10 = this.f25895k.b0() && this.f25895k.getShowTimeoutMs() <= 0;
            boolean zG = G();
            if (z9 || z10 || zG) {
                I(zG);
            }
        }
    }

    public void A(AspectRatioFrameLayout aspectRatioFrameLayout, float f9) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f9);
        }
    }

    public void B() {
        View view = this.f25889e;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onPause();
        }
    }

    public void C() {
        View view = this.f25889e;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onResume();
        }
    }

    public final boolean D(InterfaceC0920t1 interfaceC0920t1) {
        byte[] bArr;
        if (interfaceC0920t1.t(18) && (bArr = interfaceC0920t1.e0().f5814k) != null) {
            return E(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
        }
        return false;
    }

    public void H() {
        I(G());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        InterfaceC0920t1 interfaceC0920t1 = this.f25898n;
        if (interfaceC0920t1 != null && interfaceC0920t1.t(16) && this.f25898n.d()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zX = x(keyEvent.getKeyCode());
        if ((zX && R() && !this.f25895k.b0()) || u(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            z(true);
            return true;
        }
        if (zX && R()) {
            z(true);
        }
        return false;
    }

    @Override // a4.InterfaceC1088b
    public List<C1087a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f25897m;
        if (frameLayout != null) {
            arrayList.add(new C1087a(frameLayout, 4, "Transparent overlay does not impact viewability"));
        }
        e eVar = this.f25895k;
        if (eVar != null) {
            arrayList.add(new C1087a(eVar, 1));
        }
        return AbstractC2743y.r(arrayList);
    }

    @Override // a4.InterfaceC1088b
    public ViewGroup getAdViewGroup() {
        return (ViewGroup) AbstractC1684a.j(this.f25896l, "exo_ad_overlay must be present for ad playback");
    }

    public int getArtworkDisplayMode() {
        return this.f25902r;
    }

    public boolean getControllerAutoShow() {
        return this.f25909y;
    }

    public boolean getControllerHideOnTouch() {
        return this.f25884A;
    }

    public int getControllerShowTimeoutMs() {
        return this.f25908x;
    }

    public Drawable getDefaultArtwork() {
        return this.f25903s;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f25897m;
    }

    public InterfaceC0920t1 getPlayer() {
        return this.f25898n;
    }

    public int getResizeMode() {
        AbstractC1684a.i(this.f25887c);
        return this.f25887c.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f25892h;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.f25902r != 0;
    }

    public boolean getUseController() {
        return this.f25899o;
    }

    public View getVideoSurfaceView() {
        return this.f25889e;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!R() || this.f25898n == null) {
            return false;
        }
        z(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        J();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i9) {
        AbstractC1684a.g(i9 == 0 || this.f25891g != null);
        if (this.f25902r != i9) {
            this.f25902r = i9;
            P(false);
        }
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.b bVar) {
        AbstractC1684a.i(this.f25887c);
        this.f25887c.setAspectRatioListener(bVar);
    }

    public void setControllerAutoShow(boolean z9) {
        this.f25909y = z9;
    }

    public void setControllerHideDuringAds(boolean z9) {
        this.f25910z = z9;
    }

    public void setControllerHideOnTouch(boolean z9) {
        AbstractC1684a.i(this.f25895k);
        this.f25884A = z9;
        M();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(e.d dVar) {
        AbstractC1684a.i(this.f25895k);
        this.f25895k.setOnFullScreenModeChangedListener(dVar);
    }

    public void setControllerShowTimeoutMs(int i9) {
        AbstractC1684a.i(this.f25895k);
        this.f25908x = i9;
        if (this.f25895k.b0()) {
            H();
        }
    }

    public void setControllerVisibilityListener(b bVar) {
        this.f25900p = bVar;
        if (bVar != null) {
            setControllerVisibilityListener((e.m) null);
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(e.m mVar) {
        AbstractC1684a.i(this.f25895k);
        e.m mVar2 = this.f25901q;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            this.f25895k.i0(mVar2);
        }
        this.f25901q = mVar;
        if (mVar != null) {
            this.f25895k.R(mVar);
            setControllerVisibilityListener((b) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        AbstractC1684a.g(this.f25894j != null);
        this.f25907w = charSequence;
        O();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f25903s != drawable) {
            this.f25903s = drawable;
            P(false);
        }
    }

    public void setErrorMessageProvider(InterfaceC1699p interfaceC1699p) {
        if (this.f25906v != interfaceC1699p) {
            this.f25906v = interfaceC1699p;
            O();
        }
    }

    public void setFullscreenButtonClickListener(c cVar) {
        AbstractC1684a.i(this.f25895k);
        this.f25895k.setOnFullScreenModeChangedListener(this.f25886a);
    }

    public void setKeepContentOnPlayerReset(boolean z9) {
        if (this.f25905u != z9) {
            this.f25905u = z9;
            P(false);
        }
    }

    public void setPlayer(InterfaceC0920t1 interfaceC0920t1) {
        AbstractC1684a.g(Looper.myLooper() == Looper.getMainLooper());
        AbstractC1684a.a(interfaceC0920t1 == null || interfaceC0920t1.x() == Looper.getMainLooper());
        InterfaceC0920t1 interfaceC0920t12 = this.f25898n;
        if (interfaceC0920t12 == interfaceC0920t1) {
            return;
        }
        if (interfaceC0920t12 != null) {
            interfaceC0920t12.l(this.f25886a);
            if (interfaceC0920t12.t(27)) {
                View view = this.f25889e;
                if (view instanceof TextureView) {
                    interfaceC0920t12.K((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    interfaceC0920t12.Y((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.f25892h;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f25898n = interfaceC0920t1;
        if (R()) {
            this.f25895k.setPlayer(interfaceC0920t1);
        }
        L();
        O();
        P(true);
        if (interfaceC0920t1 == null) {
            w();
            return;
        }
        if (interfaceC0920t1.t(27)) {
            View view2 = this.f25889e;
            if (view2 instanceof TextureView) {
                interfaceC0920t1.A((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                interfaceC0920t1.j((SurfaceView) view2);
            }
            if (interfaceC0920t1.p().f(2)) {
                K();
            }
        }
        if (this.f25892h != null && interfaceC0920t1.t(28)) {
            this.f25892h.setCues(interfaceC0920t1.r().f7230a);
        }
        interfaceC0920t1.B(this.f25886a);
        z(false);
    }

    public void setRepeatToggleModes(int i9) {
        AbstractC1684a.i(this.f25895k);
        this.f25895k.setRepeatToggleModes(i9);
    }

    public void setResizeMode(int i9) {
        AbstractC1684a.i(this.f25887c);
        this.f25887c.setResizeMode(i9);
    }

    public void setShowBuffering(int i9) {
        if (this.f25904t != i9) {
            this.f25904t = i9;
            L();
        }
    }

    public void setShowFastForwardButton(boolean z9) {
        AbstractC1684a.i(this.f25895k);
        this.f25895k.setShowFastForwardButton(z9);
    }

    public void setShowMultiWindowTimeBar(boolean z9) {
        AbstractC1684a.i(this.f25895k);
        this.f25895k.setShowMultiWindowTimeBar(z9);
    }

    public void setShowNextButton(boolean z9) {
        AbstractC1684a.i(this.f25895k);
        this.f25895k.setShowNextButton(z9);
    }

    public void setShowPreviousButton(boolean z9) {
        AbstractC1684a.i(this.f25895k);
        this.f25895k.setShowPreviousButton(z9);
    }

    public void setShowRewindButton(boolean z9) {
        AbstractC1684a.i(this.f25895k);
        this.f25895k.setShowRewindButton(z9);
    }

    public void setShowShuffleButton(boolean z9) {
        AbstractC1684a.i(this.f25895k);
        this.f25895k.setShowShuffleButton(z9);
    }

    public void setShowSubtitleButton(boolean z9) {
        AbstractC1684a.i(this.f25895k);
        this.f25895k.setShowSubtitleButton(z9);
    }

    public void setShowVrButton(boolean z9) {
        AbstractC1684a.i(this.f25895k);
        this.f25895k.setShowVrButton(z9);
    }

    public void setShutterBackgroundColor(int i9) {
        View view = this.f25888d;
        if (view != null) {
            view.setBackgroundColor(i9);
        }
    }

    @Deprecated
    public void setUseArtwork(boolean z9) {
        setArtworkDisplayMode(!z9 ? 1 : 0);
    }

    public void setUseController(boolean z9) {
        e eVar;
        InterfaceC0920t1 interfaceC0920t1;
        boolean z10 = true;
        AbstractC1684a.g((z9 && this.f25895k == null) ? false : true);
        if (!z9 && !hasOnClickListeners()) {
            z10 = false;
        }
        setClickable(z10);
        if (this.f25899o == z9) {
            return;
        }
        this.f25899o = z9;
        if (!R()) {
            e eVar2 = this.f25895k;
            if (eVar2 != null) {
                eVar2.X();
                eVar = this.f25895k;
                interfaceC0920t1 = null;
            }
            M();
        }
        eVar = this.f25895k;
        interfaceC0920t1 = this.f25898n;
        eVar.setPlayer(interfaceC0920t1);
        M();
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        View view = this.f25889e;
        if (view instanceof SurfaceView) {
            view.setVisibility(i9);
        }
    }

    public boolean u(KeyEvent keyEvent) {
        return R() && this.f25895k.T(keyEvent);
    }

    public void w() {
        e eVar = this.f25895k;
        if (eVar != null) {
            eVar.X();
        }
    }
}
