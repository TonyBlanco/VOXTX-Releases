package O2;

import B3.C;
import B3.a0;
import O2.C0865b;
import O2.C0886i;
import O2.C0894k1;
import O2.C0921u;
import O2.C0925v0;
import O2.C0932x1;
import O2.InterfaceC0920t1;
import O2.InterfaceC0933y;
import O2.L1;
import O2.Q1;
import P2.InterfaceC0984a;
import P2.InterfaceC0986c;
import Q2.AbstractC1029o;
import Q2.C1019e;
import Q2.InterfaceC1039z;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import b4.InterfaceC1215f;
import com.amazonaws.services.s3.internal.Constants;
import d.AbstractC1617D;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.C1680A;
import d4.C1691h;
import d4.C1701s;
import d4.InterfaceC1688e;
import d4.InterfaceC1705w;
import e4.C1737C;
import e4.InterfaceC1735A;
import f4.InterfaceC1773a;
import f4.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import q3.C2540a;
import q3.InterfaceC2545f;
import s5.AbstractC2743y;

/* JADX INFO: renamed from: O2.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0890j0 extends AbstractC0889j implements InterfaceC0933y {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0886i f6008A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final L1 f6009B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final W1 f6010C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final X1 f6011D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final long f6012E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f6013F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f6014G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f6015H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f6016I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f6017J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f6018K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public H1 f6019L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public B3.a0 f6020M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f6021N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public InterfaceC0920t1.b f6022O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public R0 f6023P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public R0 f6024Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public C0936z0 f6025R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0936z0 f6026S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public AudioTrack f6027T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public Object f6028U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Surface f6029V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public SurfaceHolder f6030W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public f4.l f6031X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f6032Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public TextureView f6033Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f6034a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z3.D f6035b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f6036b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0920t1.b f6037c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public d4.S f6038c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1691h f6039d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public U2.e f6040d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f6041e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public U2.e f6042e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC0920t1 f6043f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f6044f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1[] f6045g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public C1019e f6046g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Z3.C f6047h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public float f6048h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC1705w f6049i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f6050i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0925v0.f f6051j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public P3.f f6052j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0925v0 f6053k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f6054k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C1680A f6055l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f6056l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArraySet f6057m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f6058m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Q1.b f6059n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f6060n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f6061o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public C0921u f6062o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f6063p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public C1737C f6064p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C.a f6065q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public R0 f6066q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final InterfaceC0984a f6067r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public C0912q1 f6068r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Looper f6069s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f6070s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final InterfaceC1215f f6071t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f6072t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f6073u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public long f6074u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f6075v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final InterfaceC1688e f6076w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c f6077x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final d f6078y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0865b f6079z;

    /* JADX INFO: renamed from: O2.j0$b */
    public static final class b {
        public static P2.v0 a(Context context, C0890j0 c0890j0, boolean z9) {
            P2.t0 t0VarW0 = P2.t0.w0(context);
            if (t0VarW0 == null) {
                AbstractC1681B.j("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new P2.v0(LogSessionId.LOG_SESSION_ID_NONE);
            }
            if (z9) {
                c0890j0.W(t0VarW0);
            }
            return new P2.v0(t0VarW0.D0());
        }
    }

    /* JADX INFO: renamed from: O2.j0$c */
    public final class c implements InterfaceC1735A, InterfaceC1039z, P3.q, InterfaceC2545f, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, l.b, C0886i.b, C0865b.InterfaceC0073b, L1.b, InterfaceC0933y.a {
        public c() {
        }

        @Override // f4.l.b
        public void A(Surface surface) {
            C0890j0.this.G2(surface);
        }

        @Override // O2.L1.b
        public void B(final int i9, final boolean z9) {
            C0890j0.this.f6055l.l(30, new C1680A.a() { // from class: O2.o0
                @Override // d4.C1680A.a
                public final void invoke(Object obj) {
                    ((InterfaceC0920t1.d) obj).M(i9, z9);
                }
            });
        }

        @Override // Q2.InterfaceC1039z
        public /* synthetic */ void C(C0936z0 c0936z0) {
            AbstractC1029o.f(this, c0936z0);
        }

        @Override // O2.InterfaceC0933y.a
        public /* synthetic */ void D(boolean z9) {
            AbstractC0930x.a(this, z9);
        }

        @Override // O2.InterfaceC0933y.a
        public void E(boolean z9) {
            C0890j0.this.N2();
        }

        @Override // O2.C0886i.b
        public void F(float f9) {
            C0890j0.this.B2();
        }

        @Override // O2.C0886i.b
        public void G(int i9) {
            boolean zE = C0890j0.this.E();
            C0890j0.this.K2(zE, i9, C0890j0.P1(zE, i9));
        }

        @Override // e4.InterfaceC1735A
        public /* synthetic */ void H(C0936z0 c0936z0) {
            e4.p.i(this, c0936z0);
        }

        public final /* synthetic */ void S(InterfaceC0920t1.d dVar) {
            dVar.i0(C0890j0.this.f6023P);
        }

        @Override // Q2.InterfaceC1039z
        public void a(final boolean z9) {
            if (C0890j0.this.f6050i0 == z9) {
                return;
            }
            C0890j0.this.f6050i0 = z9;
            C0890j0.this.f6055l.l(23, new C1680A.a() { // from class: O2.s0
                @Override // d4.C1680A.a
                public final void invoke(Object obj) {
                    ((InterfaceC0920t1.d) obj).a(z9);
                }
            });
        }

        @Override // Q2.InterfaceC1039z
        public void b(Exception exc) {
            C0890j0.this.f6067r.b(exc);
        }

        @Override // e4.InterfaceC1735A
        public void c(String str) {
            C0890j0.this.f6067r.c(str);
        }

        @Override // e4.InterfaceC1735A
        public void d(String str, long j9, long j10) {
            C0890j0.this.f6067r.d(str, j9, j10);
        }

        @Override // q3.InterfaceC2545f
        public void e(final C2540a c2540a) {
            C0890j0 c0890j0 = C0890j0.this;
            c0890j0.f6066q0 = c0890j0.f6066q0.b().L(c2540a).H();
            R0 r0C1 = C0890j0.this.C1();
            if (!r0C1.equals(C0890j0.this.f6023P)) {
                C0890j0.this.f6023P = r0C1;
                C0890j0.this.f6055l.i(14, new C1680A.a() { // from class: O2.m0
                    @Override // d4.C1680A.a
                    public final void invoke(Object obj) {
                        this.f6132a.S((InterfaceC0920t1.d) obj);
                    }
                });
            }
            C0890j0.this.f6055l.i(28, new C1680A.a() { // from class: O2.n0
                @Override // d4.C1680A.a
                public final void invoke(Object obj) {
                    ((InterfaceC0920t1.d) obj).e(c2540a);
                }
            });
            C0890j0.this.f6055l.f();
        }

        @Override // Q2.InterfaceC1039z
        public void f(String str) {
            C0890j0.this.f6067r.f(str);
        }

        @Override // Q2.InterfaceC1039z
        public void g(String str, long j9, long j10) {
            C0890j0.this.f6067r.g(str, j9, j10);
        }

        @Override // e4.InterfaceC1735A
        public void h(U2.e eVar) {
            C0890j0.this.f6067r.h(eVar);
            C0890j0.this.f6025R = null;
            C0890j0.this.f6040d0 = null;
        }

        @Override // Q2.InterfaceC1039z
        public void i(U2.e eVar) {
            C0890j0.this.f6042e0 = eVar;
            C0890j0.this.f6067r.i(eVar);
        }

        @Override // e4.InterfaceC1735A
        public void j(final C1737C c1737c) {
            C0890j0.this.f6064p0 = c1737c;
            C0890j0.this.f6055l.l(25, new C1680A.a() { // from class: O2.r0
                @Override // d4.C1680A.a
                public final void invoke(Object obj) {
                    ((InterfaceC0920t1.d) obj).j(c1737c);
                }
            });
        }

        @Override // P3.q
        public void k(final List list) {
            C0890j0.this.f6055l.l(27, new C1680A.a() { // from class: O2.k0
                @Override // d4.C1680A.a
                public final void invoke(Object obj) {
                    ((InterfaceC0920t1.d) obj).k(list);
                }
            });
        }

        @Override // Q2.InterfaceC1039z
        public void l(long j9) {
            C0890j0.this.f6067r.l(j9);
        }

        @Override // e4.InterfaceC1735A
        public void m(Exception exc) {
            C0890j0.this.f6067r.m(exc);
        }

        @Override // Q2.InterfaceC1039z
        public void n(U2.e eVar) {
            C0890j0.this.f6067r.n(eVar);
            C0890j0.this.f6026S = null;
            C0890j0.this.f6042e0 = null;
        }

        @Override // O2.L1.b
        public void o(int i9) {
            final C0921u c0921uF1 = C0890j0.F1(C0890j0.this.f6009B);
            if (c0921uF1.equals(C0890j0.this.f6062o0)) {
                return;
            }
            C0890j0.this.f6062o0 = c0921uF1;
            C0890j0.this.f6055l.l(29, new C1680A.a() { // from class: O2.p0
                @Override // d4.C1680A.a
                public final void invoke(Object obj) {
                    ((InterfaceC0920t1.d) obj).a0(c0921uF1);
                }
            });
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i9, int i10) {
            C0890j0.this.F2(surfaceTexture);
            C0890j0.this.w2(i9, i10);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C0890j0.this.G2(null);
            C0890j0.this.w2(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i9, int i10) {
            C0890j0.this.w2(i9, i10);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // e4.InterfaceC1735A
        public void p(U2.e eVar) {
            C0890j0.this.f6040d0 = eVar;
            C0890j0.this.f6067r.p(eVar);
        }

        @Override // e4.InterfaceC1735A
        public void q(C0936z0 c0936z0, U2.h hVar) {
            C0890j0.this.f6025R = c0936z0;
            C0890j0.this.f6067r.q(c0936z0, hVar);
        }

        @Override // Q2.InterfaceC1039z
        public void r(C0936z0 c0936z0, U2.h hVar) {
            C0890j0.this.f6026S = c0936z0;
            C0890j0.this.f6067r.r(c0936z0, hVar);
        }

        @Override // e4.InterfaceC1735A
        public void s(int i9, long j9) {
            C0890j0.this.f6067r.s(i9, j9);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i9, int i10, int i11) {
            C0890j0.this.w2(i10, i11);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (C0890j0.this.f6032Y) {
                C0890j0.this.G2(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (C0890j0.this.f6032Y) {
                C0890j0.this.G2(null);
            }
            C0890j0.this.w2(0, 0);
        }

        @Override // O2.C0865b.InterfaceC0073b
        public void t() {
            C0890j0.this.K2(false, -1, 3);
        }

        @Override // P3.q
        public void u(final P3.f fVar) {
            C0890j0.this.f6052j0 = fVar;
            C0890j0.this.f6055l.l(27, new C1680A.a() { // from class: O2.l0
                @Override // d4.C1680A.a
                public final void invoke(Object obj) {
                    ((InterfaceC0920t1.d) obj).u(fVar);
                }
            });
        }

        @Override // e4.InterfaceC1735A
        public void v(Object obj, long j9) {
            C0890j0.this.f6067r.v(obj, j9);
            if (C0890j0.this.f6028U == obj) {
                C0890j0.this.f6055l.l(26, new C1680A.a() { // from class: O2.q0
                    @Override // d4.C1680A.a
                    public final void invoke(Object obj2) {
                        ((InterfaceC0920t1.d) obj2).P();
                    }
                });
            }
        }

        @Override // Q2.InterfaceC1039z
        public void w(Exception exc) {
            C0890j0.this.f6067r.w(exc);
        }

        @Override // Q2.InterfaceC1039z
        public void x(int i9, long j9, long j10) {
            C0890j0.this.f6067r.x(i9, j9, j10);
        }

        @Override // e4.InterfaceC1735A
        public void y(long j9, int i9) {
            C0890j0.this.f6067r.y(j9, i9);
        }

        @Override // f4.l.b
        public void z(Surface surface) {
            C0890j0.this.G2(null);
        }
    }

    /* JADX INFO: renamed from: O2.j0$d */
    public static final class d implements e4.m, InterfaceC1773a, C0932x1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e4.m f6081a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public InterfaceC1773a f6082c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public e4.m f6083d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public InterfaceC1773a f6084e;

        public d() {
        }

        @Override // e4.m
        public void a(long j9, long j10, C0936z0 c0936z0, MediaFormat mediaFormat) {
            e4.m mVar = this.f6083d;
            if (mVar != null) {
                mVar.a(j9, j10, c0936z0, mediaFormat);
            }
            e4.m mVar2 = this.f6081a;
            if (mVar2 != null) {
                mVar2.a(j9, j10, c0936z0, mediaFormat);
            }
        }

        @Override // f4.InterfaceC1773a
        public void b(long j9, float[] fArr) {
            InterfaceC1773a interfaceC1773a = this.f6084e;
            if (interfaceC1773a != null) {
                interfaceC1773a.b(j9, fArr);
            }
            InterfaceC1773a interfaceC1773a2 = this.f6082c;
            if (interfaceC1773a2 != null) {
                interfaceC1773a2.b(j9, fArr);
            }
        }

        @Override // f4.InterfaceC1773a
        public void c() {
            InterfaceC1773a interfaceC1773a = this.f6084e;
            if (interfaceC1773a != null) {
                interfaceC1773a.c();
            }
            InterfaceC1773a interfaceC1773a2 = this.f6082c;
            if (interfaceC1773a2 != null) {
                interfaceC1773a2.c();
            }
        }

        @Override // O2.C0932x1.b
        public void n(int i9, Object obj) {
            InterfaceC1773a cameraMotionListener;
            if (i9 == 7) {
                this.f6081a = (e4.m) obj;
                return;
            }
            if (i9 == 8) {
                this.f6082c = (InterfaceC1773a) obj;
                return;
            }
            if (i9 != 10000) {
                return;
            }
            f4.l lVar = (f4.l) obj;
            if (lVar == null) {
                cameraMotionListener = null;
                this.f6083d = null;
            } else {
                this.f6083d = lVar.getVideoFrameMetadataListener();
                cameraMotionListener = lVar.getCameraMotionListener();
            }
            this.f6084e = cameraMotionListener;
        }
    }

    /* JADX INFO: renamed from: O2.j0$e */
    public static final class e implements W0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f6085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Q1 f6086b;

        public e(Object obj, Q1 q12) {
            this.f6085a = obj;
            this.f6086b = q12;
        }

        @Override // O2.W0
        public Object a() {
            return this.f6085a;
        }

        @Override // O2.W0
        public Q1 b() {
            return this.f6086b;
        }
    }

    static {
        AbstractC0928w0.a("goog.exo.exoplayer");
    }

    public C0890j0(InterfaceC0933y.b bVar, InterfaceC0920t1 interfaceC0920t1) {
        C1691h c1691h = new C1691h();
        this.f6039d = c1691h;
        try {
            AbstractC1681B.g("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.19.0] [" + d4.k0.f39781e + "]");
            Context applicationContext = bVar.f6378a.getApplicationContext();
            this.f6041e = applicationContext;
            InterfaceC0984a interfaceC0984a = (InterfaceC0984a) bVar.f6386i.apply(bVar.f6379b);
            this.f6067r = interfaceC0984a;
            this.f6046g0 = bVar.f6388k;
            this.f6034a0 = bVar.f6394q;
            this.f6036b0 = bVar.f6395r;
            this.f6050i0 = bVar.f6392o;
            this.f6012E = bVar.f6402y;
            c cVar = new c();
            this.f6077x = cVar;
            d dVar = new d();
            this.f6078y = dVar;
            Handler handler = new Handler(bVar.f6387j);
            C1[] c1ArrA = ((G1) bVar.f6381d.get()).a(handler, cVar, cVar, cVar, cVar);
            this.f6045g = c1ArrA;
            AbstractC1684a.g(c1ArrA.length > 0);
            Z3.C c9 = (Z3.C) bVar.f6383f.get();
            this.f6047h = c9;
            this.f6065q = (C.a) bVar.f6382e.get();
            InterfaceC1215f interfaceC1215f = (InterfaceC1215f) bVar.f6385h.get();
            this.f6071t = interfaceC1215f;
            this.f6063p = bVar.f6396s;
            this.f6019L = bVar.f6397t;
            this.f6073u = bVar.f6398u;
            this.f6075v = bVar.f6399v;
            this.f6021N = bVar.f6403z;
            Looper looper = bVar.f6387j;
            this.f6069s = looper;
            InterfaceC1688e interfaceC1688e = bVar.f6379b;
            this.f6076w = interfaceC1688e;
            InterfaceC0920t1 interfaceC0920t12 = interfaceC0920t1 == null ? this : interfaceC0920t1;
            this.f6043f = interfaceC0920t12;
            this.f6055l = new C1680A(looper, interfaceC1688e, new C1680A.b() { // from class: O2.T
                @Override // d4.C1680A.b
                public final void a(Object obj, C1701s c1701s) {
                    this.f5879a.X1((InterfaceC0920t1.d) obj, c1701s);
                }
            });
            this.f6057m = new CopyOnWriteArraySet();
            this.f6061o = new ArrayList();
            this.f6020M = new a0.a(0);
            Z3.D d9 = new Z3.D(new F1[c1ArrA.length], new Z3.s[c1ArrA.length], V1.f5907c, null);
            this.f6035b = d9;
            this.f6059n = new Q1.b();
            InterfaceC0920t1.b bVarE = new InterfaceC0920t1.b.a().c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 24, 27, 28, 32).d(29, c9.h()).d(23, bVar.f6393p).d(25, bVar.f6393p).d(33, bVar.f6393p).d(26, bVar.f6393p).d(34, bVar.f6393p).e();
            this.f6037c = bVarE;
            this.f6022O = new InterfaceC0920t1.b.a().b(bVarE).a(4).a(10).e();
            this.f6049i = interfaceC1688e.c(looper, null);
            C0925v0.f fVar = new C0925v0.f() { // from class: O2.U
                @Override // O2.C0925v0.f
                public final void a(C0925v0.e eVar) {
                    this.f5889a.Z1(eVar);
                }
            };
            this.f6051j = fVar;
            this.f6068r0 = C0912q1.k(d9);
            interfaceC0984a.k0(interfaceC0920t12, looper);
            int i9 = d4.k0.f39777a;
            C0925v0 c0925v0 = new C0925v0(c1ArrA, c9, d9, (F0) bVar.f6384g.get(), interfaceC1215f, this.f6013F, this.f6014G, interfaceC0984a, this.f6019L, bVar.f6400w, bVar.f6401x, this.f6021N, looper, interfaceC1688e, fVar, i9 < 31 ? new P2.v0() : b.a(applicationContext, this, bVar.f6375A), bVar.f6376B);
            this.f6053k = c0925v0;
            this.f6048h0 = 1.0f;
            this.f6013F = 0;
            R0 r02 = R0.f5761J;
            this.f6023P = r02;
            this.f6024Q = r02;
            this.f6066q0 = r02;
            this.f6070s0 = -1;
            this.f6044f0 = i9 < 21 ? V1(0) : d4.k0.G(applicationContext);
            this.f6052j0 = P3.f.f7226d;
            this.f6054k0 = true;
            B(interfaceC0984a);
            interfaceC1215f.g(new Handler(looper), interfaceC0984a);
            y1(cVar);
            long j9 = bVar.f6380c;
            if (j9 > 0) {
                c0925v0.w(j9);
            }
            C0865b c0865b = new C0865b(bVar.f6378a, handler, cVar);
            this.f6079z = c0865b;
            c0865b.b(bVar.f6391n);
            C0886i c0886i = new C0886i(bVar.f6378a, handler, cVar);
            this.f6008A = c0886i;
            c0886i.m(bVar.f6389l ? this.f6046g0 : null);
            if (bVar.f6393p) {
                L1 l12 = new L1(bVar.f6378a, handler, cVar);
                this.f6009B = l12;
                l12.h(d4.k0.l0(this.f6046g0.f7793d));
            } else {
                this.f6009B = null;
            }
            W1 w12 = new W1(bVar.f6378a);
            this.f6010C = w12;
            w12.a(bVar.f6390m != 0);
            X1 x12 = new X1(bVar.f6378a);
            this.f6011D = x12;
            x12.a(bVar.f6390m == 2);
            this.f6062o0 = F1(this.f6009B);
            this.f6064p0 = C1737C.f40172f;
            this.f6038c0 = d4.S.f39721c;
            c9.l(this.f6046g0);
            A2(1, 10, Integer.valueOf(this.f6044f0));
            A2(2, 10, Integer.valueOf(this.f6044f0));
            A2(1, 3, this.f6046g0);
            A2(2, 4, Integer.valueOf(this.f6034a0));
            A2(2, 5, Integer.valueOf(this.f6036b0));
            A2(1, 9, Boolean.valueOf(this.f6050i0));
            A2(2, 7, dVar);
            A2(6, 8, dVar);
            c1691h.f();
        } catch (Throwable th) {
            this.f6039d.f();
            throw th;
        }
    }

    public static C0921u F1(L1 l12) {
        return new C0921u.b(0).g(l12 != null ? l12.d() : 0).f(l12 != null ? l12.c() : 0).e();
    }

    public static int P1(boolean z9, int i9) {
        return (!z9 || i9 == 1) ? 1 : 2;
    }

    public static long T1(C0912q1 c0912q1) {
        Q1.d dVar = new Q1.d();
        Q1.b bVar = new Q1.b();
        c0912q1.f6191a.m(c0912q1.f6192b.f271a, bVar);
        return c0912q1.f6193c == -9223372036854775807L ? c0912q1.f6191a.s(bVar.f5718d, dVar).e() : bVar.t() + c0912q1.f6193c;
    }

    public static /* synthetic */ void a2(InterfaceC0920t1.d dVar) {
        dVar.l0(C0927w.l(new C0931x0(1), 1003));
    }

    public static /* synthetic */ void g2(C0912q1 c0912q1, int i9, InterfaceC0920t1.d dVar) {
        dVar.V(c0912q1.f6191a, i9);
    }

    public static /* synthetic */ void h2(int i9, InterfaceC0920t1.e eVar, InterfaceC0920t1.e eVar2, InterfaceC0920t1.d dVar) {
        dVar.b0(i9);
        dVar.S(eVar, eVar2, i9);
    }

    public static /* synthetic */ void j2(C0912q1 c0912q1, InterfaceC0920t1.d dVar) {
        dVar.W(c0912q1.f6196f);
    }

    public static /* synthetic */ void k2(C0912q1 c0912q1, InterfaceC0920t1.d dVar) {
        dVar.l0(c0912q1.f6196f);
    }

    public static /* synthetic */ void l2(C0912q1 c0912q1, InterfaceC0920t1.d dVar) {
        dVar.f0(c0912q1.f6199i.f11084d);
    }

    public static /* synthetic */ void n2(C0912q1 c0912q1, InterfaceC0920t1.d dVar) {
        dVar.B(c0912q1.f6197g);
        dVar.d0(c0912q1.f6197g);
    }

    public static /* synthetic */ void o2(C0912q1 c0912q1, InterfaceC0920t1.d dVar) {
        dVar.g0(c0912q1.f6202l, c0912q1.f6195e);
    }

    public static /* synthetic */ void p2(C0912q1 c0912q1, InterfaceC0920t1.d dVar) {
        dVar.E(c0912q1.f6195e);
    }

    public static /* synthetic */ void q2(C0912q1 c0912q1, int i9, InterfaceC0920t1.d dVar) {
        dVar.j0(c0912q1.f6202l, i9);
    }

    public static /* synthetic */ void r2(C0912q1 c0912q1, InterfaceC0920t1.d dVar) {
        dVar.z(c0912q1.f6203m);
    }

    public static /* synthetic */ void s2(C0912q1 c0912q1, InterfaceC0920t1.d dVar) {
        dVar.n0(c0912q1.n());
    }

    public static /* synthetic */ void t2(C0912q1 c0912q1, InterfaceC0920t1.d dVar) {
        dVar.t(c0912q1.f6204n);
    }

    @Override // O2.InterfaceC0920t1
    public void A(TextureView textureView) {
        O2();
        if (textureView == null) {
            D1();
            return;
        }
        z2();
        this.f6033Z = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            AbstractC1681B.j("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f6077x);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            G2(null);
            w2(0, 0);
        } else {
            F2(surfaceTexture);
            w2(textureView.getWidth(), textureView.getHeight());
        }
    }

    public void A1(int i9, List list) {
        O2();
        AbstractC1684a.a(i9 >= 0);
        int iMin = Math.min(i9, this.f6061o.size());
        if (this.f6061o.isEmpty()) {
            C2(list, this.f6070s0 == -1);
        } else {
            L2(B1(this.f6068r0, iMin, list), 0, 1, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final void A2(int i9, int i10, Object obj) {
        for (C1 c12 : this.f6045g) {
            if (c12.getTrackType() == i9) {
                I1(c12).n(i10).m(obj).l();
            }
        }
    }

    @Override // O2.InterfaceC0920t1
    public void B(InterfaceC0920t1.d dVar) {
        this.f6055l.c((InterfaceC0920t1.d) AbstractC1684a.e(dVar));
    }

    public final C0912q1 B1(C0912q1 c0912q1, int i9, List list) {
        Q1 q12 = c0912q1.f6191a;
        this.f6015H++;
        List listZ1 = z1(i9, list);
        Q1 q1G1 = G1();
        C0912q1 c0912q1U2 = u2(c0912q1, q1G1, O1(q12, q1G1, N1(c0912q1), L1(c0912q1)));
        this.f6053k.l(i9, listZ1, this.f6020M);
        return c0912q1U2;
    }

    public final void B2() {
        A2(1, 2, Float.valueOf(this.f6048h0 * this.f6008A.g()));
    }

    public final R0 C1() {
        Q1 q1W = w();
        if (q1W.v()) {
            return this.f6066q0;
        }
        return this.f6066q0.b().J(q1W.s(X(), this.f6007a).f5746d.f5531f).H();
    }

    public void C2(List list, boolean z9) {
        O2();
        D2(list, -1, -9223372036854775807L, z9);
    }

    @Override // O2.InterfaceC0920t1
    public InterfaceC0920t1.b D() {
        O2();
        return this.f6022O;
    }

    public void D1() {
        O2();
        z2();
        G2(null);
        w2(0, 0);
    }

    public final void D2(List list, int i9, long j9, boolean z9) {
        int iE;
        long j10;
        int iN1 = N1(this.f6068r0);
        long currentPosition = getCurrentPosition();
        this.f6015H++;
        if (!this.f6061o.isEmpty()) {
            y2(0, this.f6061o.size());
        }
        List listZ1 = z1(0, list);
        Q1 q1G1 = G1();
        if (!q1G1.v() && i9 >= q1G1.u()) {
            throw new D0(q1G1, i9, j9);
        }
        if (z9) {
            j10 = -9223372036854775807L;
            iE = q1G1.e(this.f6014G);
        } else if (i9 == -1) {
            iE = iN1;
            j10 = currentPosition;
        } else {
            iE = i9;
            j10 = j9;
        }
        C0912q1 c0912q1U2 = u2(this.f6068r0, q1G1, v2(q1G1, iE, j10));
        int i10 = c0912q1U2.f6195e;
        if (iE != -1 && i10 != 1) {
            i10 = (q1G1.v() || iE >= q1G1.u()) ? 4 : 2;
        }
        C0912q1 c0912q1H = c0912q1U2.h(i10);
        this.f6053k.Q0(listZ1, iE, d4.k0.P0(j10), this.f6020M);
        L2(c0912q1H, 0, 1, (this.f6068r0.f6192b.f271a.equals(c0912q1H.f6192b.f271a) || this.f6068r0.f6191a.v()) ? false : true, 4, M1(c0912q1H), -1, false);
    }

    @Override // O2.InterfaceC0920t1
    public boolean E() {
        O2();
        return this.f6068r0.f6202l;
    }

    public void E1(SurfaceHolder surfaceHolder) {
        O2();
        if (surfaceHolder == null || surfaceHolder != this.f6030W) {
            return;
        }
        D1();
    }

    public final void E2(SurfaceHolder surfaceHolder) {
        this.f6032Y = false;
        this.f6030W = surfaceHolder;
        surfaceHolder.addCallback(this.f6077x);
        Surface surface = this.f6030W.getSurface();
        if (surface == null || !surface.isValid()) {
            w2(0, 0);
        } else {
            Rect surfaceFrame = this.f6030W.getSurfaceFrame();
            w2(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // O2.InterfaceC0920t1
    public void F(final boolean z9) {
        O2();
        if (this.f6014G != z9) {
            this.f6014G = z9;
            this.f6053k.a1(z9);
            this.f6055l.i(9, new C1680A.a() { // from class: O2.Y
                @Override // d4.C1680A.a
                public final void invoke(Object obj) {
                    ((InterfaceC0920t1.d) obj).J(z9);
                }
            });
            J2();
            this.f6055l.f();
        }
    }

    public final void F2(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        G2(surface);
        this.f6029V = surface;
    }

    public final Q1 G1() {
        return new y1(this.f6061o, this.f6020M);
    }

    public final void G2(Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z9 = false;
        for (C1 c12 : this.f6045g) {
            if (c12.getTrackType() == 2) {
                arrayList.add(I1(c12).n(1).m(obj).l());
            }
        }
        Object obj2 = this.f6028U;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C0932x1) it.next()).a(this.f6012E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z9 = true;
            }
            Object obj3 = this.f6028U;
            Surface surface = this.f6029V;
            if (obj3 == surface) {
                surface.release();
                this.f6029V = null;
            }
        }
        this.f6028U = obj;
        if (z9) {
            I2(C0927w.l(new C0931x0(3), 1003));
        }
    }

    @Override // O2.InterfaceC0920t1
    public long H() {
        O2();
        return 3000L;
    }

    public final List H1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < list.size(); i9++) {
            arrayList.add(this.f6065q.b((H0) list.get(i9)));
        }
        return arrayList;
    }

    public void H2(SurfaceHolder surfaceHolder) {
        O2();
        if (surfaceHolder == null) {
            D1();
            return;
        }
        z2();
        this.f6032Y = true;
        this.f6030W = surfaceHolder;
        surfaceHolder.addCallback(this.f6077x);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            G2(null);
            w2(0, 0);
        } else {
            G2(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            w2(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final C0932x1 I1(C0932x1.b bVar) {
        int iN1 = N1(this.f6068r0);
        C0925v0 c0925v0 = this.f6053k;
        return new C0932x1(c0925v0, bVar, this.f6068r0.f6191a, iN1 == -1 ? 0 : iN1, this.f6076w, c0925v0.D());
    }

    public final void I2(C0927w c0927w) {
        C0912q1 c0912q1 = this.f6068r0;
        C0912q1 c0912q1C = c0912q1.c(c0912q1.f6192b);
        c0912q1C.f6206p = c0912q1C.f6208r;
        c0912q1C.f6207q = 0L;
        C0912q1 c0912q1H = c0912q1C.h(1);
        if (c0927w != null) {
            c0912q1H = c0912q1H.f(c0927w);
        }
        this.f6015H++;
        this.f6053k.k1();
        L2(c0912q1H, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // O2.InterfaceC0920t1
    public int J() {
        O2();
        if (this.f6068r0.f6191a.v()) {
            return this.f6072t0;
        }
        C0912q1 c0912q1 = this.f6068r0;
        return c0912q1.f6191a.f(c0912q1.f6192b.f271a);
    }

    public final Pair J1(C0912q1 c0912q1, C0912q1 c0912q12, boolean z9, int i9, boolean z10, boolean z11) {
        Q1 q12 = c0912q12.f6191a;
        Q1 q13 = c0912q1.f6191a;
        if (q13.v() && q12.v()) {
            return new Pair(Boolean.FALSE, -1);
        }
        int i10 = 3;
        if (q13.v() != q12.v()) {
            return new Pair(Boolean.TRUE, 3);
        }
        if (q12.s(q12.m(c0912q12.f6192b.f271a, this.f6059n).f5718d, this.f6007a).f5744a.equals(q13.s(q13.m(c0912q1.f6192b.f271a, this.f6059n).f5718d, this.f6007a).f5744a)) {
            return (z9 && i9 == 0 && c0912q12.f6192b.f274d < c0912q1.f6192b.f274d) ? new Pair(Boolean.TRUE, 0) : (z9 && i9 == 1 && z11) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        }
        if (z9 && i9 == 0) {
            i10 = 1;
        } else if (z9 && i9 == 1) {
            i10 = 2;
        } else if (!z10) {
            throw new IllegalStateException();
        }
        return new Pair(Boolean.TRUE, Integer.valueOf(i10));
    }

    public final void J2() {
        InterfaceC0920t1.b bVar = this.f6022O;
        InterfaceC0920t1.b bVarJ = d4.k0.J(this.f6043f, this.f6037c);
        this.f6022O = bVarJ;
        if (bVarJ.equals(bVar)) {
            return;
        }
        this.f6055l.i(13, new C1680A.a() { // from class: O2.a0
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                this.f5946a.f2((InterfaceC0920t1.d) obj);
            }
        });
    }

    @Override // O2.InterfaceC0920t1
    public void K(TextureView textureView) {
        O2();
        if (textureView == null || textureView != this.f6033Z) {
            return;
        }
        D1();
    }

    public boolean K1() {
        O2();
        return this.f6068r0.f6205o;
    }

    public final void K2(boolean z9, int i9, int i10) {
        int i11 = 0;
        boolean z10 = z9 && i9 != -1;
        if (z10 && i9 != 1) {
            i11 = 1;
        }
        C0912q1 c0912q1A = this.f6068r0;
        if (c0912q1A.f6202l == z10 && c0912q1A.f6203m == i11) {
            return;
        }
        this.f6015H++;
        if (c0912q1A.f6205o) {
            c0912q1A = c0912q1A.a();
        }
        C0912q1 c0912q1E = c0912q1A.e(z10, i11);
        this.f6053k.T0(z10, i11);
        L2(c0912q1E, 0, i10, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // O2.InterfaceC0920t1
    public C1737C L() {
        O2();
        return this.f6064p0;
    }

    public final long L1(C0912q1 c0912q1) {
        if (!c0912q1.f6192b.b()) {
            return d4.k0.x1(M1(c0912q1));
        }
        c0912q1.f6191a.m(c0912q1.f6192b.f271a, this.f6059n);
        return c0912q1.f6193c == -9223372036854775807L ? c0912q1.f6191a.s(N1(c0912q1), this.f6007a).d() : this.f6059n.s() + d4.k0.x1(c0912q1.f6193c);
    }

    public final void L2(final C0912q1 c0912q1, final int i9, final int i10, boolean z9, final int i11, long j9, int i12, boolean z10) {
        C0912q1 c0912q12 = this.f6068r0;
        this.f6068r0 = c0912q1;
        boolean z11 = !c0912q12.f6191a.equals(c0912q1.f6191a);
        Pair pairJ1 = J1(c0912q1, c0912q12, z9, i11, z11, z10);
        boolean zBooleanValue = ((Boolean) pairJ1.first).booleanValue();
        final int iIntValue = ((Integer) pairJ1.second).intValue();
        R0 r0C1 = this.f6023P;
        if (zBooleanValue) {
            h0 = c0912q1.f6191a.v() ? null : c0912q1.f6191a.s(c0912q1.f6191a.m(c0912q1.f6192b.f271a, this.f6059n).f5718d, this.f6007a).f5746d;
            this.f6066q0 = R0.f5761J;
        }
        if (zBooleanValue || !c0912q12.f6200j.equals(c0912q1.f6200j)) {
            this.f6066q0 = this.f6066q0.b().K(c0912q1.f6200j).H();
            r0C1 = C1();
        }
        boolean z12 = !r0C1.equals(this.f6023P);
        this.f6023P = r0C1;
        boolean z13 = c0912q12.f6202l != c0912q1.f6202l;
        boolean z14 = c0912q12.f6195e != c0912q1.f6195e;
        if (z14 || z13) {
            N2();
        }
        boolean z15 = c0912q12.f6197g;
        boolean z16 = c0912q1.f6197g;
        boolean z17 = z15 != z16;
        if (z17) {
            M2(z16);
        }
        if (z11) {
            this.f6055l.i(0, new C1680A.a() { // from class: O2.K
                @Override // d4.C1680A.a
                public final void invoke(Object obj) {
                    C0890j0.g2(c0912q1, i9, (InterfaceC0920t1.d) obj);
                }
            });
        }
        if (z9) {
            final InterfaceC0920t1.e eVarS1 = S1(i11, c0912q12, i12);
            final InterfaceC0920t1.e eVarR1 = R1(j9);
            this.f6055l.i(11, new C1680A.a() { // from class: O2.e0
                @Override // d4.C1680A.a
                public final void invoke(Object obj) {
                    C0890j0.h2(i11, eVarS1, eVarR1, (InterfaceC0920t1.d) obj);
                }
            });
        }
        if (zBooleanValue) {
            this.f6055l.i(1, new C1680A.a() { // from class: O2.f0
                @Override // d4.C1680A.a
                public final void invoke(Object obj) {
                    ((InterfaceC0920t1.d) obj).h0(h0, iIntValue);
                }
            });
        }
        if (c0912q12.f6196f != c0912q1.f6196f) {
            this.f6055l.i(10, new C1680A.a() { // from class: O2.g0
                @Override // d4.C1680A.a
                public final void invoke(Object obj) {
                    C0890j0.j2(c0912q1, (InterfaceC0920t1.d) obj);
                }
            });
            if (c0912q1.f6196f != null) {
                this.f6055l.i(10, new C1680A.a() { // from class: O2.h0
                    @Override // d4.C1680A.a
                    public final void invoke(Object obj) {
                        C0890j0.k2(c0912q1, (InterfaceC0920t1.d) obj);
                    }
                });
            }
        }
        Z3.D d9 = c0912q12.f6199i;
        Z3.D d10 = c0912q1.f6199i;
        if (d9 != d10) {
            this.f6047h.i(d10.f11085e);
            this.f6055l.i(2, new C1680A.a() { // from class: O2.i0
                @Override // d4.C1680A.a
                public final void invoke(Object obj) {
                    C0890j0.l2(c0912q1, (InterfaceC0920t1.d) obj);
                }
            });
        }
        if (z12) {
            final R0 r02 = this.f6023P;
            this.f6055l.i(14, new C1680A.a() { // from class: O2.L
                @Override // d4.C1680A.a
                public final void invoke(Object obj) {
                    ((InterfaceC0920t1.d) obj).i0(r02);
                }
            });
        }
        if (z17) {
            this.f6055l.i(3, new C1680A.a() { // from class: O2.M
                @Override // d4.C1680A.a
                public final void invoke(Object obj) {
                    C0890j0.n2(c0912q1, (InterfaceC0920t1.d) obj);
                }
            });
        }
        if (z14 || z13) {
            this.f6055l.i(-1, new C1680A.a() { // from class: O2.N
                @Override // d4.C1680A.a
                public final void invoke(Object obj) {
                    C0890j0.o2(c0912q1, (InterfaceC0920t1.d) obj);
                }
            });
        }
        if (z14) {
            this.f6055l.i(4, new C1680A.a() { // from class: O2.O
                @Override // d4.C1680A.a
                public final void invoke(Object obj) {
                    C0890j0.p2(c0912q1, (InterfaceC0920t1.d) obj);
                }
            });
        }
        if (z13) {
            this.f6055l.i(5, new C1680A.a() { // from class: O2.W
                @Override // d4.C1680A.a
                public final void invoke(Object obj) {
                    C0890j0.q2(c0912q1, i10, (InterfaceC0920t1.d) obj);
                }
            });
        }
        if (c0912q12.f6203m != c0912q1.f6203m) {
            this.f6055l.i(6, new C1680A.a() { // from class: O2.b0
                @Override // d4.C1680A.a
                public final void invoke(Object obj) {
                    C0890j0.r2(c0912q1, (InterfaceC0920t1.d) obj);
                }
            });
        }
        if (c0912q12.n() != c0912q1.n()) {
            this.f6055l.i(7, new C1680A.a() { // from class: O2.c0
                @Override // d4.C1680A.a
                public final void invoke(Object obj) {
                    C0890j0.s2(c0912q1, (InterfaceC0920t1.d) obj);
                }
            });
        }
        if (!c0912q12.f6204n.equals(c0912q1.f6204n)) {
            this.f6055l.i(12, new C1680A.a() { // from class: O2.d0
                @Override // d4.C1680A.a
                public final void invoke(Object obj) {
                    C0890j0.t2(c0912q1, (InterfaceC0920t1.d) obj);
                }
            });
        }
        J2();
        this.f6055l.f();
        if (c0912q12.f6205o != c0912q1.f6205o) {
            Iterator it = this.f6057m.iterator();
            while (it.hasNext()) {
                ((InterfaceC0933y.a) it.next()).E(c0912q1.f6205o);
            }
        }
    }

    public final long M1(C0912q1 c0912q1) {
        if (c0912q1.f6191a.v()) {
            return d4.k0.P0(this.f6074u0);
        }
        long jM = c0912q1.f6205o ? c0912q1.m() : c0912q1.f6208r;
        return c0912q1.f6192b.b() ? jM : x2(c0912q1.f6191a, c0912q1.f6192b, jM);
    }

    public final void M2(boolean z9) {
    }

    @Override // O2.InterfaceC0920t1
    public int N() {
        O2();
        if (d()) {
            return this.f6068r0.f6192b.f273c;
        }
        return -1;
    }

    public final int N1(C0912q1 c0912q1) {
        return c0912q1.f6191a.v() ? this.f6070s0 : c0912q1.f6191a.m(c0912q1.f6192b.f271a, this.f6059n).f5718d;
    }

    public final void N2() {
        int playbackState = getPlaybackState();
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                this.f6010C.b(E() && !K1());
                this.f6011D.b(E());
                return;
            } else if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        this.f6010C.b(false);
        this.f6011D.b(false);
    }

    @Override // O2.InterfaceC0933y
    public void O(final C1019e c1019e, boolean z9) {
        O2();
        if (this.f6060n0) {
            return;
        }
        if (!d4.k0.c(this.f6046g0, c1019e)) {
            this.f6046g0 = c1019e;
            A2(1, 3, c1019e);
            L1 l12 = this.f6009B;
            if (l12 != null) {
                l12.h(d4.k0.l0(c1019e.f7793d));
            }
            this.f6055l.i(20, new C1680A.a() { // from class: O2.P
                @Override // d4.C1680A.a
                public final void invoke(Object obj) {
                    ((InterfaceC0920t1.d) obj).A(c1019e);
                }
            });
        }
        this.f6008A.m(z9 ? c1019e : null);
        this.f6047h.l(c1019e);
        boolean zE = E();
        int iP = this.f6008A.p(zE, getPlaybackState());
        K2(zE, iP, P1(zE, iP));
        this.f6055l.f();
    }

    public final Pair O1(Q1 q12, Q1 q13, int i9, long j9) {
        if (q12.v() || q13.v()) {
            boolean z9 = !q12.v() && q13.v();
            return v2(q13, z9 ? -1 : i9, z9 ? -9223372036854775807L : j9);
        }
        Pair pairO = q12.o(this.f6007a, this.f6059n, i9, d4.k0.P0(j9));
        Object obj = ((Pair) d4.k0.j(pairO)).first;
        if (q13.f(obj) != -1) {
            return pairO;
        }
        Object objB0 = C0925v0.B0(this.f6007a, this.f6059n, this.f6013F, this.f6014G, obj, q12, q13);
        if (objB0 == null) {
            return v2(q13, -1, -9223372036854775807L);
        }
        q13.m(objB0, this.f6059n);
        int i10 = this.f6059n.f5718d;
        return v2(q13, i10, q13.s(i10, this.f6007a).d());
    }

    public final void O2() {
        this.f6039d.c();
        if (Thread.currentThread() != x().getThread()) {
            String strD = d4.k0.D("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), x().getThread().getName());
            if (this.f6054k0) {
                throw new IllegalStateException(strD);
            }
            AbstractC1681B.k("ExoPlayerImpl", strD, this.f6056l0 ? null : new IllegalStateException());
            this.f6056l0 = true;
        }
    }

    @Override // O2.InterfaceC0920t1
    public long P() {
        O2();
        return this.f6075v;
    }

    @Override // O2.InterfaceC0933y
    public U2.e Q() {
        O2();
        return this.f6040d0;
    }

    @Override // O2.InterfaceC0920t1
    /* JADX INFO: renamed from: Q1, reason: merged with bridge method [inline-methods] */
    public C0927w n() {
        O2();
        return this.f6068r0.f6196f;
    }

    @Override // O2.InterfaceC0920t1
    public long R() {
        O2();
        return L1(this.f6068r0);
    }

    public final InterfaceC0920t1.e R1(long j9) {
        Object obj;
        H0 h02;
        Object obj2;
        int iF;
        int iX = X();
        if (this.f6068r0.f6191a.v()) {
            obj = null;
            h02 = null;
            obj2 = null;
            iF = -1;
        } else {
            C0912q1 c0912q1 = this.f6068r0;
            Object obj3 = c0912q1.f6192b.f271a;
            c0912q1.f6191a.m(obj3, this.f6059n);
            iF = this.f6068r0.f6191a.f(obj3);
            obj2 = obj3;
            obj = this.f6068r0.f6191a.s(iX, this.f6007a).f5744a;
            h02 = this.f6007a.f5746d;
        }
        long jX1 = d4.k0.x1(j9);
        long jX12 = this.f6068r0.f6192b.b() ? d4.k0.x1(T1(this.f6068r0)) : jX1;
        C.b bVar = this.f6068r0.f6192b;
        return new InterfaceC0920t1.e(obj, iX, h02, obj2, iF, jX1, jX12, bVar.f272b, bVar.f273c);
    }

    @Override // O2.InterfaceC0933y
    public C0936z0 S() {
        O2();
        return this.f6026S;
    }

    public final InterfaceC0920t1.e S1(int i9, C0912q1 c0912q1, int i10) {
        int i11;
        Object obj;
        H0 h02;
        Object obj2;
        int i12;
        long jT1;
        long jT12;
        Q1.b bVar = new Q1.b();
        if (c0912q1.f6191a.v()) {
            i11 = i10;
            obj = null;
            h02 = null;
            obj2 = null;
            i12 = -1;
        } else {
            Object obj3 = c0912q1.f6192b.f271a;
            c0912q1.f6191a.m(obj3, bVar);
            int i13 = bVar.f5718d;
            int iF = c0912q1.f6191a.f(obj3);
            Object obj4 = c0912q1.f6191a.s(i13, this.f6007a).f5744a;
            h02 = this.f6007a.f5746d;
            obj2 = obj3;
            i12 = iF;
            obj = obj4;
            i11 = i13;
        }
        boolean zB = c0912q1.f6192b.b();
        if (i9 == 0) {
            if (zB) {
                C.b bVar2 = c0912q1.f6192b;
                jT1 = bVar.e(bVar2.f272b, bVar2.f273c);
                jT12 = T1(c0912q1);
            } else {
                jT1 = c0912q1.f6192b.f275e != -1 ? T1(this.f6068r0) : bVar.f5720f + bVar.f5719e;
                jT12 = jT1;
            }
        } else if (zB) {
            jT1 = c0912q1.f6208r;
            jT12 = T1(c0912q1);
        } else {
            jT1 = bVar.f5720f + c0912q1.f6208r;
            jT12 = jT1;
        }
        long jX1 = d4.k0.x1(jT1);
        long jX12 = d4.k0.x1(jT12);
        C.b bVar3 = c0912q1.f6192b;
        return new InterfaceC0920t1.e(obj, i11, h02, obj2, i12, jX1, jX12, bVar3.f272b, bVar3.f273c);
    }

    @Override // O2.InterfaceC0920t1
    public void T(int i9, List list) {
        O2();
        A1(i9, H1(list));
    }

    @Override // O2.InterfaceC0920t1
    public long U() {
        O2();
        if (!d()) {
            return a0();
        }
        C0912q1 c0912q1 = this.f6068r0;
        return c0912q1.f6201k.equals(c0912q1.f6192b) ? d4.k0.x1(this.f6068r0.f6206p) : getDuration();
    }

    /* JADX INFO: renamed from: U1, reason: merged with bridge method [inline-methods] */
    public final void Y1(C0925v0.e eVar) {
        long j9;
        boolean z9;
        long jX2;
        int i9 = this.f6015H - eVar.f6330c;
        this.f6015H = i9;
        boolean z10 = true;
        if (eVar.f6331d) {
            this.f6016I = eVar.f6332e;
            this.f6017J = true;
        }
        if (eVar.f6333f) {
            this.f6018K = eVar.f6334g;
        }
        if (i9 == 0) {
            Q1 q12 = eVar.f6329b.f6191a;
            if (!this.f6068r0.f6191a.v() && q12.v()) {
                this.f6070s0 = -1;
                this.f6074u0 = 0L;
                this.f6072t0 = 0;
            }
            if (!q12.v()) {
                List listK = ((y1) q12).K();
                AbstractC1684a.g(listK.size() == this.f6061o.size());
                for (int i10 = 0; i10 < listK.size(); i10++) {
                    ((e) this.f6061o.get(i10)).f6086b = (Q1) listK.get(i10);
                }
            }
            if (this.f6017J) {
                if (eVar.f6329b.f6192b.equals(this.f6068r0.f6192b) && eVar.f6329b.f6194d == this.f6068r0.f6208r) {
                    z10 = false;
                }
                if (z10) {
                    if (q12.v() || eVar.f6329b.f6192b.b()) {
                        jX2 = eVar.f6329b.f6194d;
                    } else {
                        C0912q1 c0912q1 = eVar.f6329b;
                        jX2 = x2(q12, c0912q1.f6192b, c0912q1.f6194d);
                    }
                    j9 = jX2;
                } else {
                    j9 = -9223372036854775807L;
                }
                z9 = z10;
            } else {
                j9 = -9223372036854775807L;
                z9 = false;
            }
            this.f6017J = false;
            L2(eVar.f6329b, 1, this.f6018K, z9, this.f6016I, j9, -1, false);
        }
    }

    public final int V1(int i9) {
        AudioTrack audioTrack = this.f6027T;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i9) {
            this.f6027T.release();
            this.f6027T = null;
        }
        if (this.f6027T == null) {
            this.f6027T = new AudioTrack(3, 4000, 4, 2, 2, 0, i9);
        }
        return this.f6027T.getAudioSessionId();
    }

    @Override // O2.InterfaceC0933y
    public void W(InterfaceC0986c interfaceC0986c) {
        this.f6067r.X((InterfaceC0986c) AbstractC1684a.e(interfaceC0986c));
    }

    @Override // O2.InterfaceC0920t1
    public int X() {
        O2();
        int iN1 = N1(this.f6068r0);
        if (iN1 == -1) {
            return 0;
        }
        return iN1;
    }

    public final /* synthetic */ void X1(InterfaceC0920t1.d dVar, C1701s c1701s) {
        dVar.m0(this.f6043f, new InterfaceC0920t1.c(c1701s));
    }

    @Override // O2.InterfaceC0920t1
    public void Y(SurfaceView surfaceView) {
        O2();
        E1(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // O2.InterfaceC0920t1
    public boolean Z() {
        O2();
        return this.f6014G;
    }

    public final /* synthetic */ void Z1(final C0925v0.e eVar) {
        this.f6049i.i(new Runnable() { // from class: O2.Z
            @Override // java.lang.Runnable
            public final void run() {
                this.f5939a.Y1(eVar);
            }
        });
    }

    @Override // O2.InterfaceC0933y
    public C0936z0 a() {
        O2();
        return this.f6025R;
    }

    @Override // O2.InterfaceC0920t1
    public long a0() {
        O2();
        if (this.f6068r0.f6191a.v()) {
            return this.f6074u0;
        }
        C0912q1 c0912q1 = this.f6068r0;
        if (c0912q1.f6201k.f274d != c0912q1.f6192b.f274d) {
            return c0912q1.f6191a.s(X(), this.f6007a).f();
        }
        long j9 = c0912q1.f6206p;
        if (this.f6068r0.f6201k.b()) {
            C0912q1 c0912q12 = this.f6068r0;
            Q1.b bVarM = c0912q12.f6191a.m(c0912q12.f6201k.f271a, this.f6059n);
            long j10 = bVarM.j(this.f6068r0.f6201k.f272b);
            j9 = j10 == Long.MIN_VALUE ? bVarM.f5719e : j10;
        }
        C0912q1 c0912q13 = this.f6068r0;
        return d4.k0.x1(x2(c0912q13.f6191a, c0912q13.f6201k, j9));
    }

    @Override // O2.InterfaceC0920t1
    public void b(C0917s1 c0917s1) {
        O2();
        if (c0917s1 == null) {
            c0917s1 = C0917s1.f6227e;
        }
        if (this.f6068r0.f6204n.equals(c0917s1)) {
            return;
        }
        C0912q1 c0912q1G = this.f6068r0.g(c0917s1);
        this.f6015H++;
        this.f6053k.V0(c0917s1);
        L2(c0912q1G, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // O2.InterfaceC0920t1
    public C0917s1 c() {
        O2();
        return this.f6068r0.f6204n;
    }

    @Override // O2.InterfaceC0933y
    public U2.e c0() {
        O2();
        return this.f6042e0;
    }

    @Override // O2.InterfaceC0920t1
    public boolean d() {
        O2();
        return this.f6068r0.f6192b.b();
    }

    @Override // O2.InterfaceC0920t1
    public long e() {
        O2();
        return d4.k0.x1(this.f6068r0.f6207q);
    }

    @Override // O2.InterfaceC0920t1
    public R0 e0() {
        O2();
        return this.f6023P;
    }

    @Override // O2.InterfaceC0920t1
    public long f0() {
        O2();
        return this.f6073u;
    }

    public final /* synthetic */ void f2(InterfaceC0920t1.d dVar) {
        dVar.O(this.f6022O);
    }

    @Override // O2.InterfaceC0920t1
    public long getCurrentPosition() {
        O2();
        return d4.k0.x1(M1(this.f6068r0));
    }

    @Override // O2.InterfaceC0920t1
    public long getDuration() {
        O2();
        if (!d()) {
            return I();
        }
        C0912q1 c0912q1 = this.f6068r0;
        C.b bVar = c0912q1.f6192b;
        c0912q1.f6191a.m(bVar.f271a, this.f6059n);
        return d4.k0.x1(this.f6059n.e(bVar.f272b, bVar.f273c));
    }

    @Override // O2.InterfaceC0920t1
    public int getPlaybackState() {
        O2();
        return this.f6068r0.f6195e;
    }

    @Override // O2.InterfaceC0920t1
    public int getRepeatMode() {
        O2();
        return this.f6013F;
    }

    @Override // O2.InterfaceC0920t1
    public float getVolume() {
        O2();
        return this.f6048h0;
    }

    @Override // O2.InterfaceC0920t1
    public void h(List list, boolean z9) {
        O2();
        C2(H1(list), z9);
    }

    @Override // O2.InterfaceC0920t1
    public void i(final Z3.z zVar) {
        O2();
        if (!this.f6047h.h() || zVar.equals(this.f6047h.c())) {
            return;
        }
        this.f6047h.m(zVar);
        this.f6055l.l(19, new C1680A.a() { // from class: O2.S
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0920t1.d) obj).Y(zVar);
            }
        });
    }

    @Override // O2.InterfaceC0920t1
    public void j(SurfaceView surfaceView) {
        O2();
        if (surfaceView instanceof e4.l) {
            z2();
            G2(surfaceView);
        } else {
            if (!(surfaceView instanceof f4.l)) {
                H2(surfaceView == null ? null : surfaceView.getHolder());
                return;
            }
            z2();
            this.f6031X = (f4.l) surfaceView;
            I1(this.f6078y).n(Constants.MAXIMUM_UPLOAD_PARTS).m(this.f6031X).l();
            this.f6031X.d(this.f6077x);
            G2(this.f6031X.getVideoSurface());
        }
        E2(surfaceView.getHolder());
    }

    @Override // O2.InterfaceC0920t1
    public void l(InterfaceC0920t1.d dVar) {
        O2();
        this.f6055l.k((InterfaceC0920t1.d) AbstractC1684a.e(dVar));
    }

    @Override // O2.InterfaceC0920t1
    public void o(boolean z9) {
        O2();
        int iP = this.f6008A.p(z9, getPlaybackState());
        K2(z9, iP, P1(z9, iP));
    }

    @Override // O2.InterfaceC0920t1
    public V1 p() {
        O2();
        return this.f6068r0.f6199i.f11084d;
    }

    @Override // O2.InterfaceC0920t1
    public void prepare() {
        O2();
        boolean zE = E();
        int iP = this.f6008A.p(zE, 2);
        K2(zE, iP, P1(zE, iP));
        C0912q1 c0912q1 = this.f6068r0;
        if (c0912q1.f6195e != 1) {
            return;
        }
        C0912q1 c0912q1F = c0912q1.f(null);
        C0912q1 c0912q1H = c0912q1F.h(c0912q1F.f6191a.v() ? 4 : 2);
        this.f6015H++;
        this.f6053k.k0();
        L2(c0912q1H, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // O2.AbstractC0889j
    public void q0(int i9, long j9, int i10, boolean z9) {
        O2();
        AbstractC1684a.a(i9 >= 0);
        this.f6067r.H();
        Q1 q12 = this.f6068r0.f6191a;
        if (q12.v() || i9 < q12.u()) {
            this.f6015H++;
            if (d()) {
                AbstractC1681B.j("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                C0925v0.e eVar = new C0925v0.e(this.f6068r0);
                eVar.b(1);
                this.f6051j.a(eVar);
                return;
            }
            C0912q1 c0912q1H = this.f6068r0;
            int i11 = c0912q1H.f6195e;
            if (i11 == 3 || (i11 == 4 && !q12.v())) {
                c0912q1H = this.f6068r0.h(2);
            }
            int iX = X();
            C0912q1 c0912q1U2 = u2(c0912q1H, q12, v2(q12, i9, j9));
            this.f6053k.D0(q12, i9, d4.k0.P0(j9));
            L2(c0912q1U2, 0, 1, true, 1, M1(c0912q1U2), iX, z9);
        }
    }

    @Override // O2.InterfaceC0920t1
    public P3.f r() {
        O2();
        return this.f6052j0;
    }

    @Override // O2.InterfaceC0920t1
    public void release() {
        AudioTrack audioTrack;
        AbstractC1681B.g("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.19.0] [" + d4.k0.f39781e + "] [" + AbstractC0928w0.b() + "]");
        O2();
        if (d4.k0.f39777a < 21 && (audioTrack = this.f6027T) != null) {
            audioTrack.release();
            this.f6027T = null;
        }
        this.f6079z.b(false);
        L1 l12 = this.f6009B;
        if (l12 != null) {
            l12.g();
        }
        this.f6010C.b(false);
        this.f6011D.b(false);
        this.f6008A.i();
        if (!this.f6053k.m0()) {
            this.f6055l.l(10, new C1680A.a() { // from class: O2.Q
                @Override // d4.C1680A.a
                public final void invoke(Object obj) {
                    C0890j0.a2((InterfaceC0920t1.d) obj);
                }
            });
        }
        this.f6055l.j();
        this.f6049i.e(null);
        this.f6071t.h(this.f6067r);
        C0912q1 c0912q1 = this.f6068r0;
        if (c0912q1.f6205o) {
            this.f6068r0 = c0912q1.a();
        }
        C0912q1 c0912q1H = this.f6068r0.h(1);
        this.f6068r0 = c0912q1H;
        C0912q1 c0912q1C = c0912q1H.c(c0912q1H.f6192b);
        this.f6068r0 = c0912q1C;
        c0912q1C.f6206p = c0912q1C.f6208r;
        this.f6068r0.f6207q = 0L;
        this.f6067r.release();
        this.f6047h.j();
        z2();
        Surface surface = this.f6029V;
        if (surface != null) {
            surface.release();
            this.f6029V = null;
        }
        if (this.f6058m0) {
            AbstractC1617D.a(AbstractC1684a.e(null));
            throw null;
        }
        this.f6052j0 = P3.f.f7226d;
        this.f6060n0 = true;
    }

    @Override // O2.InterfaceC0920t1
    public int s() {
        O2();
        if (d()) {
            return this.f6068r0.f6192b.f272b;
        }
        return -1;
    }

    @Override // O2.InterfaceC0920t1
    public void setRepeatMode(final int i9) {
        O2();
        if (this.f6013F != i9) {
            this.f6013F = i9;
            this.f6053k.X0(i9);
            this.f6055l.i(8, new C1680A.a() { // from class: O2.V
                @Override // d4.C1680A.a
                public final void invoke(Object obj) {
                    ((InterfaceC0920t1.d) obj).onRepeatModeChanged(i9);
                }
            });
            J2();
            this.f6055l.f();
        }
    }

    public final C0912q1 u2(C0912q1 c0912q1, Q1 q12, Pair pair) {
        long jE;
        AbstractC1684a.a(q12.v() || pair != null);
        Q1 q13 = c0912q1.f6191a;
        long jL1 = L1(c0912q1);
        C0912q1 c0912q1J = c0912q1.j(q12);
        if (q12.v()) {
            C.b bVarL = C0912q1.l();
            long jP0 = d4.k0.P0(this.f6074u0);
            C0912q1 c0912q1C = c0912q1J.d(bVarL, jP0, jP0, jP0, 0L, B3.i0.f587e, this.f6035b, AbstractC2743y.z()).c(bVarL);
            c0912q1C.f6206p = c0912q1C.f6208r;
            return c0912q1C;
        }
        Object obj = c0912q1J.f6192b.f271a;
        boolean z9 = !obj.equals(((Pair) d4.k0.j(pair)).first);
        C.b bVar = z9 ? new C.b(pair.first) : c0912q1J.f6192b;
        long jLongValue = ((Long) pair.second).longValue();
        long jP02 = d4.k0.P0(jL1);
        if (!q13.v()) {
            jP02 -= q13.m(obj, this.f6059n).t();
        }
        if (z9 || jLongValue < jP02) {
            AbstractC1684a.g(!bVar.b());
            C0912q1 c0912q1C2 = c0912q1J.d(bVar, jLongValue, jLongValue, jLongValue, 0L, z9 ? B3.i0.f587e : c0912q1J.f6198h, z9 ? this.f6035b : c0912q1J.f6199i, z9 ? AbstractC2743y.z() : c0912q1J.f6200j).c(bVar);
            c0912q1C2.f6206p = jLongValue;
            return c0912q1C2;
        }
        if (jLongValue == jP02) {
            int iF = q12.f(c0912q1J.f6201k.f271a);
            if (iF == -1 || q12.k(iF, this.f6059n).f5718d != q12.m(bVar.f271a, this.f6059n).f5718d) {
                q12.m(bVar.f271a, this.f6059n);
                jE = bVar.b() ? this.f6059n.e(bVar.f272b, bVar.f273c) : this.f6059n.f5719e;
                c0912q1J = c0912q1J.d(bVar, c0912q1J.f6208r, c0912q1J.f6208r, c0912q1J.f6194d, jE - c0912q1J.f6208r, c0912q1J.f6198h, c0912q1J.f6199i, c0912q1J.f6200j).c(bVar);
            }
            return c0912q1J;
        }
        AbstractC1684a.g(!bVar.b());
        long jMax = Math.max(0L, c0912q1J.f6207q - (jLongValue - jP02));
        jE = c0912q1J.f6206p;
        if (c0912q1J.f6201k.equals(c0912q1J.f6192b)) {
            jE = jLongValue + jMax;
        }
        c0912q1J = c0912q1J.d(bVar, jLongValue, jLongValue, jLongValue, jMax, c0912q1J.f6198h, c0912q1J.f6199i, c0912q1J.f6200j);
        c0912q1J.f6206p = jE;
        return c0912q1J;
    }

    @Override // O2.InterfaceC0920t1
    public int v() {
        O2();
        return this.f6068r0.f6203m;
    }

    public final Pair v2(Q1 q12, int i9, long j9) {
        if (q12.v()) {
            this.f6070s0 = i9;
            if (j9 == -9223372036854775807L) {
                j9 = 0;
            }
            this.f6074u0 = j9;
            this.f6072t0 = 0;
            return null;
        }
        if (i9 == -1 || i9 >= q12.u()) {
            i9 = q12.e(this.f6014G);
            j9 = q12.s(i9, this.f6007a).d();
        }
        return q12.o(this.f6007a, this.f6059n, i9, d4.k0.P0(j9));
    }

    @Override // O2.InterfaceC0920t1
    public Q1 w() {
        O2();
        return this.f6068r0.f6191a;
    }

    public final void w2(final int i9, final int i10) {
        if (i9 == this.f6038c0.b() && i10 == this.f6038c0.a()) {
            return;
        }
        this.f6038c0 = new d4.S(i9, i10);
        this.f6055l.l(24, new C1680A.a() { // from class: O2.X
            @Override // d4.C1680A.a
            public final void invoke(Object obj) {
                ((InterfaceC0920t1.d) obj).U(i9, i10);
            }
        });
        A2(2, 14, new d4.S(i9, i10));
    }

    @Override // O2.InterfaceC0920t1
    public Looper x() {
        return this.f6069s;
    }

    public final long x2(Q1 q12, C.b bVar, long j9) {
        q12.m(bVar.f271a, this.f6059n);
        return j9 + this.f6059n.t();
    }

    @Override // O2.InterfaceC0920t1
    public Z3.z y() {
        O2();
        return this.f6047h.c();
    }

    public void y1(InterfaceC0933y.a aVar) {
        this.f6057m.add(aVar);
    }

    public final void y2(int i9, int i10) {
        for (int i11 = i10 - 1; i11 >= i9; i11--) {
            this.f6061o.remove(i11);
        }
        this.f6020M = this.f6020M.a(i9, i10);
    }

    public final List z1(int i9, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C0894k1.c cVar = new C0894k1.c((B3.C) list.get(i10), this.f6063p);
            arrayList.add(cVar);
            this.f6061o.add(i10 + i9, new e(cVar.f6123b, cVar.f6122a.J0()));
        }
        this.f6020M = this.f6020M.g(i9, arrayList.size());
        return arrayList;
    }

    public final void z2() {
        if (this.f6031X != null) {
            I1(this.f6078y).n(Constants.MAXIMUM_UPLOAD_PARTS).m(null).l();
            this.f6031X.i(this.f6077x);
            this.f6031X = null;
        }
        TextureView textureView = this.f6033Z;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f6077x) {
                AbstractC1681B.j("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f6033Z.setSurfaceTextureListener(null);
            }
            this.f6033Z = null;
        }
        SurfaceHolder surfaceHolder = this.f6030W;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f6077x);
            this.f6030W = null;
        }
    }
}
