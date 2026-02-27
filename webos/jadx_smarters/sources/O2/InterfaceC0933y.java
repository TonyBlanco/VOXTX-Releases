package O2;

import B3.C;
import B3.C0509q;
import O2.C0907p;
import O2.InterfaceC0933y;
import P2.InterfaceC0986c;
import Q2.C1019e;
import android.content.Context;
import android.os.Looper;
import d3.C1669f;
import d4.AbstractC1684a;
import d4.InterfaceC1688e;
import r5.InterfaceC2677f;

/* JADX INFO: renamed from: O2.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0933y extends InterfaceC0920t1 {

    /* JADX INFO: renamed from: O2.y$a */
    public interface a {
        void D(boolean z9);

        void E(boolean z9);
    }

    /* JADX INFO: renamed from: O2.y$b */
    public static final class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public boolean f6375A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public Looper f6376B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public boolean f6377C;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f6378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InterfaceC1688e f6379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f6380c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public r5.r f6381d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public r5.r f6382e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public r5.r f6383f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public r5.r f6384g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public r5.r f6385h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public InterfaceC2677f f6386i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Looper f6387j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public C1019e f6388k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f6389l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f6390m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f6391n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f6392o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f6393p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f6394q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f6395r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f6396s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public H1 f6397t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public long f6398u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public long f6399v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public E0 f6400w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public long f6401x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public long f6402y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public boolean f6403z;

        public b(final Context context) {
            this(context, new r5.r() { // from class: O2.z
                @Override // r5.r
                public final Object get() {
                    return InterfaceC0933y.b.l(context);
                }
            }, new r5.r() { // from class: O2.B
                @Override // r5.r
                public final Object get() {
                    return InterfaceC0933y.b.m(context);
                }
            });
        }

        public b(final Context context, final G1 g12) {
            this(context, new r5.r() { // from class: O2.D
                @Override // r5.r
                public final Object get() {
                    return InterfaceC0933y.b.p(g12);
                }
            }, new r5.r() { // from class: O2.E
                @Override // r5.r
                public final Object get() {
                    return InterfaceC0933y.b.q(context);
                }
            });
            AbstractC1684a.e(g12);
        }

        public b(final Context context, r5.r rVar, r5.r rVar2) {
            this(context, rVar, rVar2, new r5.r() { // from class: O2.H
                @Override // r5.r
                public final Object get() {
                    return InterfaceC0933y.b.n(context);
                }
            }, new r5.r() { // from class: O2.I
                @Override // r5.r
                public final Object get() {
                    return new C0910q();
                }
            }, new r5.r() { // from class: O2.J
                @Override // r5.r
                public final Object get() {
                    return b4.v.n(context);
                }
            }, new InterfaceC2677f() { // from class: O2.A
                @Override // r5.InterfaceC2677f
                public final Object apply(Object obj) {
                    return new P2.p0((InterfaceC1688e) obj);
                }
            });
        }

        public b(Context context, r5.r rVar, r5.r rVar2, r5.r rVar3, r5.r rVar4, r5.r rVar5, InterfaceC2677f interfaceC2677f) {
            this.f6378a = (Context) AbstractC1684a.e(context);
            this.f6381d = rVar;
            this.f6382e = rVar2;
            this.f6383f = rVar3;
            this.f6384g = rVar4;
            this.f6385h = rVar5;
            this.f6386i = interfaceC2677f;
            this.f6387j = d4.k0.S();
            this.f6388k = C1019e.f7784h;
            this.f6390m = 0;
            this.f6394q = 1;
            this.f6395r = 0;
            this.f6396s = true;
            this.f6397t = H1.f5671g;
            this.f6398u = 5000L;
            this.f6399v = 15000L;
            this.f6400w = new C0907p.b().a();
            this.f6379b = InterfaceC1688e.f39758a;
            this.f6401x = 500L;
            this.f6402y = 2000L;
            this.f6375A = true;
        }

        public static /* synthetic */ G1 l(Context context) {
            return new C0915s(context);
        }

        public static /* synthetic */ C.a m(Context context) {
            return new C0509q(context, new C1669f());
        }

        public static /* synthetic */ Z3.C n(Context context) {
            return new Z3.m(context);
        }

        public static /* synthetic */ G1 p(G1 g12) {
            return g12;
        }

        public static /* synthetic */ C.a q(Context context) {
            return new C0509q(context, new C1669f());
        }

        public static /* synthetic */ C.a r(C.a aVar) {
            return aVar;
        }

        public static /* synthetic */ G1 s(G1 g12) {
            return g12;
        }

        public static /* synthetic */ Z3.C t(Z3.C c9) {
            return c9;
        }

        public InterfaceC0933y j() {
            AbstractC1684a.g(!this.f6377C);
            this.f6377C = true;
            return new C0890j0(this, null);
        }

        public I1 k() {
            AbstractC1684a.g(!this.f6377C);
            this.f6377C = true;
            return new I1(this);
        }

        public b u(final C.a aVar) {
            AbstractC1684a.g(!this.f6377C);
            AbstractC1684a.e(aVar);
            this.f6382e = new r5.r() { // from class: O2.G
                @Override // r5.r
                public final Object get() {
                    return InterfaceC0933y.b.r(aVar);
                }
            };
            return this;
        }

        public b v(final G1 g12) {
            AbstractC1684a.g(!this.f6377C);
            AbstractC1684a.e(g12);
            this.f6381d = new r5.r() { // from class: O2.F
                @Override // r5.r
                public final Object get() {
                    return InterfaceC0933y.b.s(g12);
                }
            };
            return this;
        }

        public b w(final Z3.C c9) {
            AbstractC1684a.g(!this.f6377C);
            AbstractC1684a.e(c9);
            this.f6383f = new r5.r() { // from class: O2.C
                @Override // r5.r
                public final Object get() {
                    return InterfaceC0933y.b.t(c9);
                }
            };
            return this;
        }
    }

    void O(C1019e c1019e, boolean z9);

    U2.e Q();

    C0936z0 S();

    void W(InterfaceC0986c interfaceC0986c);

    C0936z0 a();

    U2.e c0();
}
