package B3;

import B3.C;
import B3.M;
import B3.S;
import B3.T;
import O2.H0;
import O2.Q1;
import P2.v0;
import V2.C1055l;
import android.os.Looper;
import b4.C1208A;
import b4.InterfaceC1211b;
import b4.InterfaceC1224o;
import com.amazonaws.services.s3.internal.Constants;
import d3.InterfaceC1678o;
import d4.AbstractC1684a;

/* JADX INFO: loaded from: classes3.dex */
public final class T extends AbstractC0493a implements S.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final H0 f404i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final H0.h f405j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC1224o.a f406k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final M.a f407l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final V2.y f408m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b4.F f409n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f410o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f411p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f412q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f413r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f414s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b4.S f415t;

    public class a extends AbstractC0510s {
        public a(Q1 q12) {
            super(q12);
        }

        @Override // B3.AbstractC0510s, O2.Q1
        public Q1.b l(int i9, Q1.b bVar, boolean z9) {
            super.l(i9, bVar, z9);
            bVar.f5721g = true;
            return bVar;
        }

        @Override // B3.AbstractC0510s, O2.Q1
        public Q1.d t(int i9, Q1.d dVar, long j9) {
            super.t(i9, dVar, j9);
            dVar.f5755m = true;
            return dVar;
        }
    }

    public static final class b implements C.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC1224o.a f417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public M.a f418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public V2.B f419c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public b4.F f420d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f421e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f422f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f423g;

        public b(InterfaceC1224o.a aVar, M.a aVar2) {
            this(aVar, aVar2, new C1055l(), new C1208A(), Constants.MB);
        }

        public b(InterfaceC1224o.a aVar, M.a aVar2, V2.B b9, b4.F f9, int i9) {
            this.f417a = aVar;
            this.f418b = aVar2;
            this.f419c = b9;
            this.f420d = f9;
            this.f421e = i9;
        }

        public b(InterfaceC1224o.a aVar, final InterfaceC1678o interfaceC1678o) {
            this(aVar, new M.a() { // from class: B3.U
                @Override // B3.M.a
                public final M a(v0 v0Var) {
                    return T.b.g(interfaceC1678o, v0Var);
                }
            });
        }

        public static /* synthetic */ M g(InterfaceC1678o interfaceC1678o, v0 v0Var) {
            return new C0495c(interfaceC1678o);
        }

        @Override // B3.C.a
        public int[] c() {
            return new int[]{4};
        }

        @Override // B3.C.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public T b(H0 h02) {
            H0.c cVarB;
            H0.c cVarL;
            AbstractC1684a.e(h02.f5528c);
            H0.h hVar = h02.f5528c;
            boolean z9 = false;
            boolean z10 = hVar.f5633j == null && this.f423g != null;
            if (hVar.f5630g == null && this.f422f != null) {
                z9 = true;
            }
            if (!z10 || !z9) {
                if (z10) {
                    cVarL = h02.b().l(this.f423g);
                    h02 = cVarL.a();
                    H0 h03 = h02;
                    return new T(h03, this.f417a, this.f418b, this.f419c.a(h03), this.f420d, this.f421e, null);
                }
                if (z9) {
                    cVarB = h02.b();
                }
                H0 h032 = h02;
                return new T(h032, this.f417a, this.f418b, this.f419c.a(h032), this.f420d, this.f421e, null);
            }
            cVarB = h02.b().l(this.f423g);
            cVarL = cVarB.d(this.f422f);
            h02 = cVarL.a();
            H0 h0322 = h02;
            return new T(h0322, this.f417a, this.f418b, this.f419c.a(h0322), this.f420d, this.f421e, null);
        }

        @Override // B3.C.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public b d(V2.B b9) {
            this.f419c = (V2.B) AbstractC1684a.f(b9, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // B3.C.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public b a(b4.F f9) {
            this.f420d = (b4.F) AbstractC1684a.f(f9, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }
    }

    public T(H0 h02, InterfaceC1224o.a aVar, M.a aVar2, V2.y yVar, b4.F f9, int i9) {
        this.f405j = (H0.h) AbstractC1684a.e(h02.f5528c);
        this.f404i = h02;
        this.f406k = aVar;
        this.f407l = aVar2;
        this.f408m = yVar;
        this.f409n = f9;
        this.f410o = i9;
        this.f411p = true;
        this.f412q = -9223372036854775807L;
    }

    public /* synthetic */ T(H0 h02, InterfaceC1224o.a aVar, M.a aVar2, V2.y yVar, b4.F f9, int i9, a aVar3) {
        this(h02, aVar, aVar2, yVar, f9, i9);
    }

    @Override // B3.C
    public InterfaceC0517z E(C.b bVar, InterfaceC1211b interfaceC1211b, long j9) {
        InterfaceC1224o interfaceC1224oA = this.f406k.a();
        b4.S s9 = this.f415t;
        if (s9 != null) {
            interfaceC1224oA.g(s9);
        }
        return new S(this.f405j.f5625a, interfaceC1224oA, this.f407l.a(i0()), this.f408m, b0(bVar), this.f409n, f0(bVar), this, interfaceC1211b, this.f405j.f5630g, this.f410o);
    }

    @Override // B3.S.b
    public void O(long j9, boolean z9, boolean z10) {
        if (j9 == -9223372036854775807L) {
            j9 = this.f412q;
        }
        if (!this.f411p && this.f412q == j9 && this.f413r == z9 && this.f414s == z10) {
            return;
        }
        this.f412q = j9;
        this.f413r = z9;
        this.f414s = z10;
        this.f411p = false;
        o0();
    }

    @Override // B3.C
    public void P() {
    }

    @Override // B3.C
    public void Y(InterfaceC0517z interfaceC0517z) {
        ((S) interfaceC0517z).g0();
    }

    @Override // B3.C
    public H0 e() {
        return this.f404i;
    }

    @Override // B3.AbstractC0493a
    public void l0(b4.S s9) {
        this.f415t = s9;
        this.f408m.b((Looper) AbstractC1684a.e(Looper.myLooper()), i0());
        this.f408m.prepare();
        o0();
    }

    @Override // B3.AbstractC0493a
    public void n0() {
        this.f408m.release();
    }

    public final void o0() {
        Q1 b0Var = new b0(this.f412q, this.f413r, false, this.f414s, null, this.f404i);
        if (this.f411p) {
            b0Var = new a(b0Var);
        }
        m0(b0Var);
    }
}
