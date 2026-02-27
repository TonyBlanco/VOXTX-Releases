package O2;

import B3.C;
import B3.C0494b;
import B3.InterfaceC0517z;
import O2.C0894k1;
import O2.C0932x1;
import O2.C1;
import O2.E1;
import O2.H0;
import O2.Q1;
import O2.r;
import P2.InterfaceC0984a;
import V2.InterfaceC1058o;
import Z3.C;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import b4.C1225p;
import b4.InterfaceC1215f;
import com.facebook.ads.AdError;
import d.AbstractC1617D;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.InterfaceC1688e;
import d4.InterfaceC1705w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;
import org.joda.time.DateTimeConstants;
import q3.C2540a;
import s5.AbstractC2743y;

/* JADX INFO: renamed from: O2.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0925v0 implements Handler.Callback, InterfaceC0517z.a, C.a, C0894k1.d, r.a, C0932x1.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f6276A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f6277B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f6278C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f6279D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f6280E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f6281F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f6282G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f6283H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f6284I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f6285J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f6286K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public h f6287L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public long f6288M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f6289N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f6290O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public C0927w f6291P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public long f6292Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public long f6293R = -9223372036854775807L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1[] f6294a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f6295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E1[] f6296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Z3.C f6297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Z3.D f6298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final F0 f6299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC1215f f6300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC1705w f6301i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HandlerThread f6302j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Looper f6303k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Q1.d f6304l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Q1.b f6305m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f6306n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f6307o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r f6308p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f6309q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final InterfaceC1688e f6310r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f6311s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final V0 f6312t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0894k1 f6313u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final E0 f6314v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f6315w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public H1 f6316x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C0912q1 f6317y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public e f6318z;

    /* JADX INFO: renamed from: O2.v0$a */
    public class a implements C1.a {
        public a() {
        }

        @Override // O2.C1.a
        public void a() {
            C0925v0.this.f6284I = true;
        }

        @Override // O2.C1.a
        public void b() {
            C0925v0.this.f6301i.j(2);
        }
    }

    /* JADX INFO: renamed from: O2.v0$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f6320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final B3.a0 f6321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6322c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f6323d;

        public b(List list, B3.a0 a0Var, int i9, long j9) {
            this.f6320a = list;
            this.f6321b = a0Var;
            this.f6322c = i9;
            this.f6323d = j9;
        }

        public /* synthetic */ b(List list, B3.a0 a0Var, int i9, long j9, a aVar) {
            this(list, a0Var, i9, j9);
        }
    }

    /* JADX INFO: renamed from: O2.v0$c */
    public static class c {
    }

    /* JADX INFO: renamed from: O2.v0$d */
    public static final class d implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0932x1 f6324a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6325c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f6326d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f6327e;

        public d(C0932x1 c0932x1) {
            this.f6324a = c0932x1;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.f6327e;
            if ((obj == null) != (dVar.f6327e == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i9 = this.f6325c - dVar.f6325c;
            return i9 != 0 ? i9 : d4.k0.p(this.f6326d, dVar.f6326d);
        }

        public void b(int i9, long j9, Object obj) {
            this.f6325c = i9;
            this.f6326d = j9;
            this.f6327e = obj;
        }
    }

    /* JADX INFO: renamed from: O2.v0$e */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f6328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public C0912q1 f6329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6330c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f6331d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f6332e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f6333f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f6334g;

        public e(C0912q1 c0912q1) {
            this.f6329b = c0912q1;
        }

        public void b(int i9) {
            this.f6328a |= i9 > 0;
            this.f6330c += i9;
        }

        public void c(int i9) {
            this.f6328a = true;
            this.f6333f = true;
            this.f6334g = i9;
        }

        public void d(C0912q1 c0912q1) {
            this.f6328a |= this.f6329b != c0912q1;
            this.f6329b = c0912q1;
        }

        public void e(int i9) {
            if (this.f6331d && this.f6332e != 5) {
                AbstractC1684a.a(i9 == 5);
                return;
            }
            this.f6328a = true;
            this.f6331d = true;
            this.f6332e = i9;
        }
    }

    /* JADX INFO: renamed from: O2.v0$f */
    public interface f {
        void a(e eVar);
    }

    /* JADX INFO: renamed from: O2.v0$g */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C.b f6335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f6337c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f6338d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f6339e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f6340f;

        public g(C.b bVar, long j9, long j10, boolean z9, boolean z10, boolean z11) {
            this.f6335a = bVar;
            this.f6336b = j9;
            this.f6337c = j10;
            this.f6338d = z9;
            this.f6339e = z10;
            this.f6340f = z11;
        }
    }

    /* JADX INFO: renamed from: O2.v0$h */
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Q1 f6341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f6343c;

        public h(Q1 q12, int i9, long j9) {
            this.f6341a = q12;
            this.f6342b = i9;
            this.f6343c = j9;
        }
    }

    public C0925v0(C1[] c1Arr, Z3.C c9, Z3.D d9, F0 f02, InterfaceC1215f interfaceC1215f, int i9, boolean z9, InterfaceC0984a interfaceC0984a, H1 h12, E0 e02, long j9, boolean z10, Looper looper, InterfaceC1688e interfaceC1688e, f fVar, P2.v0 v0Var, Looper looper2) {
        this.f6311s = fVar;
        this.f6294a = c1Arr;
        this.f6297e = c9;
        this.f6298f = d9;
        this.f6299g = f02;
        this.f6300h = interfaceC1215f;
        this.f6281F = i9;
        this.f6282G = z9;
        this.f6316x = h12;
        this.f6314v = e02;
        this.f6315w = j9;
        this.f6292Q = j9;
        this.f6277B = z10;
        this.f6310r = interfaceC1688e;
        this.f6306n = f02.b();
        this.f6307o = f02.a();
        C0912q1 c0912q1K = C0912q1.k(d9);
        this.f6317y = c0912q1K;
        this.f6318z = new e(c0912q1K);
        this.f6296d = new E1[c1Arr.length];
        E1.a aVarD = c9.d();
        for (int i10 = 0; i10 < c1Arr.length; i10++) {
            c1Arr[i10].l(i10, v0Var);
            this.f6296d[i10] = c1Arr[i10].q();
            if (aVarD != null) {
                this.f6296d[i10].i(aVarD);
            }
        }
        this.f6308p = new r(this, interfaceC1688e);
        this.f6309q = new ArrayList();
        this.f6295c = s5.Z.h();
        this.f6304l = new Q1.d();
        this.f6305m = new Q1.b();
        c9.e(this, interfaceC1215f);
        this.f6290O = true;
        InterfaceC1705w interfaceC1705wC = interfaceC1688e.c(looper, null);
        this.f6312t = new V0(interfaceC0984a, interfaceC1705wC);
        this.f6313u = new C0894k1(this, interfaceC0984a, interfaceC1705wC, v0Var);
        if (looper2 != null) {
            this.f6302j = null;
            this.f6303k = looper2;
        } else {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
            this.f6302j = handlerThread;
            handlerThread.start();
            this.f6303k = handlerThread.getLooper();
        }
        this.f6301i = interfaceC1688e.c(this.f6303k, this);
    }

    public static Pair A0(Q1 q12, h hVar, boolean z9, int i9, boolean z10, Q1.d dVar, Q1.b bVar) {
        Pair pairO;
        Object objB0;
        Q1 q13 = hVar.f6341a;
        if (q12.v()) {
            return null;
        }
        Q1 q14 = q13.v() ? q12 : q13;
        try {
            pairO = q14.o(dVar, bVar, hVar.f6342b, hVar.f6343c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (q12.equals(q14)) {
            return pairO;
        }
        if (q12.f(pairO.first) != -1) {
            return (q14.m(pairO.first, bVar).f5721g && q14.s(bVar.f5718d, dVar).f5758p == q14.f(pairO.first)) ? q12.o(dVar, bVar, q12.m(pairO.first, bVar).f5718d, hVar.f6343c) : pairO;
        }
        if (z9 && (objB0 = B0(dVar, bVar, i9, z10, pairO.first, q14, q12)) != null) {
            return q12.o(dVar, bVar, q12.m(objB0, bVar).f5718d, -9223372036854775807L);
        }
        return null;
    }

    public static Object B0(Q1.d dVar, Q1.b bVar, int i9, boolean z9, Object obj, Q1 q12, Q1 q13) {
        int iF = q12.f(obj);
        int iN = q12.n();
        int i10 = iF;
        int iF2 = -1;
        for (int i11 = 0; i11 < iN && iF2 == -1; i11++) {
            i10 = q12.i(i10, bVar, dVar, i9, z9);
            if (i10 == -1) {
                break;
            }
            iF2 = q13.f(q12.r(i10));
        }
        if (iF2 == -1) {
            return null;
        }
        return q13.r(iF2);
    }

    public static boolean Q(boolean z9, C.b bVar, long j9, C.b bVar2, Q1.b bVar3, long j10) {
        if (!z9 && j9 == j10 && bVar.f271a.equals(bVar2.f271a)) {
            return (bVar.b() && bVar3.x(bVar.f272b)) ? (bVar3.l(bVar.f272b, bVar.f273c) == 4 || bVar3.l(bVar.f272b, bVar.f273c) == 2) ? false : true : bVar2.b() && bVar3.x(bVar2.f272b);
        }
        return false;
    }

    public static boolean S(C1 c12) {
        return c12.getState() != 0;
    }

    public static boolean U(C0912q1 c0912q1, Q1.b bVar) {
        C.b bVar2 = c0912q1.f6192b;
        Q1 q12 = c0912q1.f6191a;
        return q12.v() || q12.m(bVar2.f271a, bVar).f5721g;
    }

    private void n0() {
        t0(true, false, true, false);
        o0();
        this.f6299g.f();
        d1(1);
        HandlerThread handlerThread = this.f6302j;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.f6276A = true;
            notifyAll();
        }
    }

    public static void w0(Q1 q12, d dVar, Q1.d dVar2, Q1.b bVar) {
        int i9 = q12.s(q12.m(dVar.f6327e, bVar).f5718d, dVar2).f5759q;
        Object obj = q12.l(i9, bVar, true).f5717c;
        long j9 = bVar.f5719e;
        dVar.b(i9, j9 != -9223372036854775807L ? j9 - 1 : Long.MAX_VALUE, obj);
    }

    public static boolean x0(d dVar, Q1 q12, Q1 q13, int i9, boolean z9, Q1.d dVar2, Q1.b bVar) {
        Object obj = dVar.f6327e;
        if (obj == null) {
            Pair pairA0 = A0(q12, new h(dVar.f6324a.h(), dVar.f6324a.d(), dVar.f6324a.f() == Long.MIN_VALUE ? -9223372036854775807L : d4.k0.P0(dVar.f6324a.f())), false, i9, z9, dVar2, bVar);
            if (pairA0 == null) {
                return false;
            }
            dVar.b(q12.f(pairA0.first), ((Long) pairA0.second).longValue(), pairA0.first);
            if (dVar.f6324a.f() == Long.MIN_VALUE) {
                w0(q12, dVar, dVar2, bVar);
            }
            return true;
        }
        int iF = q12.f(obj);
        if (iF == -1) {
            return false;
        }
        if (dVar.f6324a.f() == Long.MIN_VALUE) {
            w0(q12, dVar, dVar2, bVar);
            return true;
        }
        dVar.f6325c = iF;
        q13.m(dVar.f6327e, bVar);
        if (bVar.f5721g && q13.s(bVar.f5718d, dVar2).f5758p == q13.f(dVar.f6327e)) {
            Pair pairO = q12.o(dVar2, bVar, q12.m(dVar.f6327e, bVar).f5718d, dVar.f6326d + bVar.t());
            dVar.b(q12.f(pairO.first), ((Long) pairO.second).longValue(), pairO.first);
        }
        return true;
    }

    public static C0936z0[] z(Z3.s sVar) {
        int length = sVar != null ? sVar.length() : 0;
        C0936z0[] c0936z0Arr = new C0936z0[length];
        for (int i9 = 0; i9 < length; i9++) {
            c0936z0Arr[i9] = sVar.c(i9);
        }
        return c0936z0Arr;
    }

    public static g z0(Q1 q12, C0912q1 c0912q1, h hVar, V0 v02, int i9, boolean z9, Q1.d dVar, Q1.b bVar) {
        int i10;
        C.b bVar2;
        long jLongValue;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        int iE;
        int iE2;
        boolean z13;
        V0 v03;
        long j9;
        int i12;
        boolean z14;
        int iE3;
        boolean z15;
        boolean z16;
        if (q12.v()) {
            return new g(C0912q1.l(), 0L, -9223372036854775807L, false, true, false);
        }
        C.b bVar3 = c0912q1.f6192b;
        Object obj = bVar3.f271a;
        boolean zU = U(c0912q1, bVar);
        long j10 = (c0912q1.f6192b.b() || zU) ? c0912q1.f6193c : c0912q1.f6208r;
        if (hVar != null) {
            i10 = -1;
            Pair pairA0 = A0(q12, hVar, true, i9, z9, dVar, bVar);
            if (pairA0 == null) {
                iE3 = q12.e(z9);
                jLongValue = j10;
                z14 = false;
                z15 = false;
                z16 = true;
            } else {
                if (hVar.f6343c == -9223372036854775807L) {
                    iE3 = q12.m(pairA0.first, bVar).f5718d;
                    jLongValue = j10;
                    z14 = false;
                } else {
                    obj = pairA0.first;
                    jLongValue = ((Long) pairA0.second).longValue();
                    z14 = true;
                    iE3 = -1;
                }
                z15 = c0912q1.f6195e == 4;
                z16 = false;
            }
            z12 = z14;
            z10 = z15;
            z11 = z16;
            i11 = iE3;
            bVar2 = bVar3;
        } else {
            i10 = -1;
            if (c0912q1.f6191a.v()) {
                iE = q12.e(z9);
            } else if (q12.f(obj) == -1) {
                Object objB0 = B0(dVar, bVar, i9, z9, obj, c0912q1.f6191a, q12);
                if (objB0 == null) {
                    iE2 = q12.e(z9);
                    z13 = true;
                } else {
                    iE2 = q12.m(objB0, bVar).f5718d;
                    z13 = false;
                }
                i11 = iE2;
                z11 = z13;
                jLongValue = j10;
                bVar2 = bVar3;
                z10 = false;
                z12 = false;
            } else if (j10 == -9223372036854775807L) {
                iE = q12.m(obj, bVar).f5718d;
            } else if (zU) {
                bVar2 = bVar3;
                c0912q1.f6191a.m(bVar2.f271a, bVar);
                if (c0912q1.f6191a.s(bVar.f5718d, dVar).f5758p == c0912q1.f6191a.f(bVar2.f271a)) {
                    Pair pairO = q12.o(dVar, bVar, q12.m(obj, bVar).f5718d, j10 + bVar.t());
                    obj = pairO.first;
                    jLongValue = ((Long) pairO.second).longValue();
                } else {
                    jLongValue = j10;
                }
                i11 = -1;
                z10 = false;
                z11 = false;
                z12 = true;
            } else {
                bVar2 = bVar3;
                jLongValue = j10;
                i11 = -1;
                z10 = false;
                z11 = false;
                z12 = false;
            }
            i11 = iE;
            jLongValue = j10;
            bVar2 = bVar3;
            z10 = false;
            z11 = false;
            z12 = false;
        }
        if (i11 != i10) {
            Pair pairO2 = q12.o(dVar, bVar, i11, -9223372036854775807L);
            obj = pairO2.first;
            jLongValue = ((Long) pairO2.second).longValue();
            v03 = v02;
            j9 = -9223372036854775807L;
        } else {
            v03 = v02;
            j9 = jLongValue;
        }
        C.b bVarF = v03.F(q12, obj, jLongValue);
        int i13 = bVarF.f275e;
        boolean z17 = bVar2.f271a.equals(obj) && !bVar2.b() && !bVarF.b() && (i13 == i10 || ((i12 = bVar2.f275e) != i10 && i13 >= i12));
        C.b bVar4 = bVar2;
        boolean zQ = Q(zU, bVar2, j10, bVarF, q12.m(obj, bVar), j9);
        if (z17 || zQ) {
            bVarF = bVar4;
        }
        if (bVarF.b()) {
            if (bVarF.equals(bVar4)) {
                jLongValue = c0912q1.f6208r;
            } else {
                q12.m(bVarF.f271a, bVar);
                jLongValue = bVarF.f273c == bVar.q(bVarF.f272b) ? bVar.k() : 0L;
            }
        }
        return new g(bVarF, jLongValue, j9, z10, z11, z12);
    }

    public final long A(Q1 q12, Object obj, long j9) {
        q12.s(q12.m(obj, this.f6305m).f5718d, this.f6304l);
        Q1.d dVar = this.f6304l;
        if (dVar.f5749g != -9223372036854775807L && dVar.i()) {
            Q1.d dVar2 = this.f6304l;
            if (dVar2.f5752j) {
                return d4.k0.P0(dVar2.c() - this.f6304l.f5749g) - (j9 + this.f6305m.t());
            }
        }
        return -9223372036854775807L;
    }

    public final long B() {
        S0 s0S = this.f6312t.s();
        if (s0S == null) {
            return 0L;
        }
        long jL = s0S.l();
        if (!s0S.f5867d) {
            return jL;
        }
        int i9 = 0;
        while (true) {
            C1[] c1Arr = this.f6294a;
            if (i9 >= c1Arr.length) {
                return jL;
            }
            if (S(c1Arr[i9]) && this.f6294a[i9].f() == s0S.f5866c[i9]) {
                long jV = this.f6294a[i9].v();
                if (jV == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jL = Math.max(jV, jL);
            }
            i9++;
        }
    }

    public final Pair C(Q1 q12) {
        if (q12.v()) {
            return Pair.create(C0912q1.l(), 0L);
        }
        Pair pairO = q12.o(this.f6304l, this.f6305m, q12.e(this.f6282G), -9223372036854775807L);
        C.b bVarF = this.f6312t.F(q12, pairO.first, 0L);
        long jLongValue = ((Long) pairO.second).longValue();
        if (bVarF.b()) {
            q12.m(bVarF.f271a, this.f6305m);
            jLongValue = bVarF.f273c == this.f6305m.q(bVarF.f272b) ? this.f6305m.k() : 0L;
        }
        return Pair.create(bVarF, Long.valueOf(jLongValue));
    }

    public final void C0(long j9, long j10) {
        this.f6301i.k(2, j9 + j10);
    }

    public Looper D() {
        return this.f6303k;
    }

    public void D0(Q1 q12, int i9, long j9) {
        this.f6301i.d(3, new h(q12, i9, j9)).a();
    }

    public final long E() {
        return F(this.f6317y.f6206p);
    }

    public final void E0(boolean z9) throws C0927w {
        C.b bVar = this.f6312t.r().f5869f.f5880a;
        long jH0 = H0(bVar, this.f6317y.f6208r, true, false);
        if (jH0 != this.f6317y.f6208r) {
            C0912q1 c0912q1 = this.f6317y;
            this.f6317y = N(bVar, jH0, c0912q1.f6193c, c0912q1.f6194d, z9, 5);
        }
    }

    public final long F(long j9) {
        S0 s0L = this.f6312t.l();
        if (s0L == null) {
            return 0L;
        }
        return Math.max(0L, j9 - s0L.y(this.f6288M));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab A[Catch: all -> 0x00ae, TryCatch #1 {all -> 0x00ae, blocks: (B:22:0x00a1, B:24:0x00ab, B:29:0x00b5, B:31:0x00bb, B:32:0x00be, B:34:0x00c4, B:36:0x00ce, B:38:0x00d6, B:42:0x00de, B:44:0x00e8, B:46:0x00f8, B:50:0x0102, B:54:0x0114, B:58:0x011d), top: B:74:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F0(O2.C0925v0.h r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.C0925v0.F0(O2.v0$h):void");
    }

    public final void G(InterfaceC0517z interfaceC0517z) {
        if (this.f6312t.y(interfaceC0517z)) {
            this.f6312t.C(this.f6288M);
            X();
        }
    }

    public final long G0(C.b bVar, long j9, boolean z9) {
        return H0(bVar, j9, this.f6312t.r() != this.f6312t.s(), z9);
    }

    public final void H(IOException iOException, int i9) {
        C0927w c0927wJ = C0927w.j(iOException, i9);
        S0 s0R = this.f6312t.r();
        if (s0R != null) {
            c0927wJ = c0927wJ.g(s0R.f5869f.f5880a);
        }
        AbstractC1681B.e("ExoPlayerImplInternal", "Playback error", c0927wJ);
        l1(false, false);
        this.f6317y = this.f6317y.f(c0927wJ);
    }

    public final long H0(C.b bVar, long j9, boolean z9, boolean z10) throws C0927w {
        m1();
        this.f6279D = false;
        if (z10 || this.f6317y.f6195e == 3) {
            d1(2);
        }
        S0 s0R = this.f6312t.r();
        S0 s0J = s0R;
        while (s0J != null && !bVar.equals(s0J.f5869f.f5880a)) {
            s0J = s0J.j();
        }
        if (z9 || s0R != s0J || (s0J != null && s0J.z(j9) < 0)) {
            for (C1 c12 : this.f6294a) {
                p(c12);
            }
            if (s0J != null) {
                while (this.f6312t.r() != s0J) {
                    this.f6312t.b();
                }
                this.f6312t.D(s0J);
                s0J.x(1000000000000L);
                s();
            }
        }
        V0 v02 = this.f6312t;
        if (s0J != null) {
            v02.D(s0J);
            if (!s0J.f5867d) {
                s0J.f5869f = s0J.f5869f.b(j9);
            } else if (s0J.f5868e) {
                j9 = s0J.f5864a.l(j9);
                s0J.f5864a.v(j9 - this.f6306n, this.f6307o);
            }
            v0(j9);
            X();
        } else {
            v02.f();
            v0(j9);
        }
        I(false);
        this.f6301i.j(2);
        return j9;
    }

    public final void I(boolean z9) {
        S0 s0L = this.f6312t.l();
        C.b bVar = s0L == null ? this.f6317y.f6192b : s0L.f5869f.f5880a;
        boolean z10 = !this.f6317y.f6201k.equals(bVar);
        if (z10) {
            this.f6317y = this.f6317y.c(bVar);
        }
        C0912q1 c0912q1 = this.f6317y;
        c0912q1.f6206p = s0L == null ? c0912q1.f6208r : s0L.i();
        this.f6317y.f6207q = E();
        if ((z10 || z9) && s0L != null && s0L.f5867d) {
            o1(s0L.f5869f.f5880a, s0L.n(), s0L.o());
        }
    }

    public final void I0(C0932x1 c0932x1) {
        if (c0932x1.f() == -9223372036854775807L) {
            J0(c0932x1);
            return;
        }
        if (this.f6317y.f6191a.v()) {
            this.f6309q.add(new d(c0932x1));
            return;
        }
        d dVar = new d(c0932x1);
        Q1 q12 = this.f6317y.f6191a;
        if (!x0(dVar, q12, q12, this.f6281F, this.f6282G, this.f6304l, this.f6305m)) {
            c0932x1.k(false);
        } else {
            this.f6309q.add(dVar);
            Collections.sort(this.f6309q);
        }
    }

    /* JADX WARN: Not initialized variable reg: 25, insn: 0x007c: MOVE (r5 I:??[long, double]) = (r25 I:??[long, double]), block:B:26:0x007b */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(O2.Q1 r28, boolean r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.C0925v0.J(O2.Q1, boolean):void");
    }

    public final void J0(C0932x1 c0932x1) {
        if (c0932x1.c() != this.f6303k) {
            this.f6301i.d(15, c0932x1).a();
            return;
        }
        o(c0932x1);
        int i9 = this.f6317y.f6195e;
        if (i9 == 3 || i9 == 2) {
            this.f6301i.j(2);
        }
    }

    public final void K(InterfaceC0517z interfaceC0517z) throws C0927w {
        if (this.f6312t.y(interfaceC0517z)) {
            S0 s0L = this.f6312t.l();
            s0L.p(this.f6308p.c().f6231a, this.f6317y.f6191a);
            o1(s0L.f5869f.f5880a, s0L.n(), s0L.o());
            if (s0L == this.f6312t.r()) {
                v0(s0L.f5869f.f5881b);
                s();
                C0912q1 c0912q1 = this.f6317y;
                C.b bVar = c0912q1.f6192b;
                long j9 = s0L.f5869f.f5881b;
                this.f6317y = N(bVar, j9, c0912q1.f6193c, j9, false, 5);
            }
            X();
        }
    }

    public final void K0(final C0932x1 c0932x1) {
        Looper looperC = c0932x1.c();
        if (looperC.getThread().isAlive()) {
            this.f6310r.c(looperC, null).i(new Runnable() { // from class: O2.u0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6274a.W(c0932x1);
                }
            });
        } else {
            AbstractC1681B.j("TAG", "Trying to send message on a dead thread.");
            c0932x1.k(false);
        }
    }

    public final void L(C0917s1 c0917s1, float f9, boolean z9, boolean z10) {
        if (z9) {
            if (z10) {
                this.f6318z.b(1);
            }
            this.f6317y = this.f6317y.g(c0917s1);
        }
        s1(c0917s1.f6231a);
        for (C1 c12 : this.f6294a) {
            if (c12 != null) {
                c12.s(f9, c0917s1.f6231a);
            }
        }
    }

    public final void L0(long j9) {
        for (C1 c12 : this.f6294a) {
            if (c12.f() != null) {
                M0(c12, j9);
            }
        }
    }

    public final void M(C0917s1 c0917s1, boolean z9) {
        L(c0917s1, c0917s1.f6231a, true, z9);
    }

    public final void M0(C1 c12, long j9) {
        c12.j();
        if (c12 instanceof P3.r) {
            ((P3.r) c12).c0(j9);
        }
    }

    public final C0912q1 N(C.b bVar, long j9, long j10, long j11, boolean z9, int i9) {
        List listZ;
        B3.i0 i0Var;
        Z3.D d9;
        this.f6290O = (!this.f6290O && j9 == this.f6317y.f6208r && bVar.equals(this.f6317y.f6192b)) ? false : true;
        u0();
        C0912q1 c0912q1 = this.f6317y;
        B3.i0 i0Var2 = c0912q1.f6198h;
        Z3.D d10 = c0912q1.f6199i;
        List list = c0912q1.f6200j;
        if (this.f6313u.t()) {
            S0 s0R = this.f6312t.r();
            B3.i0 i0VarN = s0R == null ? B3.i0.f587e : s0R.n();
            Z3.D dO = s0R == null ? this.f6298f : s0R.o();
            AbstractC2743y abstractC2743yX = x(dO.f11083c);
            if (s0R != null) {
                T0 t02 = s0R.f5869f;
                if (t02.f5882c != j10) {
                    s0R.f5869f = t02.a(j10);
                }
            }
            i0Var = i0VarN;
            d9 = dO;
            listZ = abstractC2743yX;
        } else if (bVar.equals(this.f6317y.f6192b)) {
            listZ = list;
            i0Var = i0Var2;
            d9 = d10;
        } else {
            i0Var = B3.i0.f587e;
            d9 = this.f6298f;
            listZ = AbstractC2743y.z();
        }
        if (z9) {
            this.f6318z.e(i9);
        }
        return this.f6317y.d(bVar, j9, j10, j11, E(), i0Var, d9, listZ);
    }

    public final void N0(boolean z9, AtomicBoolean atomicBoolean) {
        if (this.f6283H != z9) {
            this.f6283H = z9;
            if (!z9) {
                for (C1 c12 : this.f6294a) {
                    if (!S(c12) && this.f6295c.remove(c12)) {
                        c12.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final boolean O(C1 c12, S0 s02) {
        S0 s0J = s02.j();
        return s02.f5869f.f5885f && s0J.f5867d && ((c12 instanceof P3.r) || (c12 instanceof q3.g) || c12.v() >= s0J.m());
    }

    public final void O0(C0917s1 c0917s1) {
        this.f6301i.l(16);
        this.f6308p.b(c0917s1);
    }

    public final boolean P() {
        S0 s0S = this.f6312t.s();
        if (!s0S.f5867d) {
            return false;
        }
        int i9 = 0;
        while (true) {
            C1[] c1Arr = this.f6294a;
            if (i9 >= c1Arr.length) {
                return true;
            }
            C1 c12 = c1Arr[i9];
            B3.Y y9 = s0S.f5866c[i9];
            if (c12.f() != y9 || (y9 != null && !c12.h() && !O(c12, s0S))) {
                break;
            }
            i9++;
        }
        return false;
    }

    public final void P0(b bVar) throws Throwable {
        this.f6318z.b(1);
        if (bVar.f6322c != -1) {
            this.f6287L = new h(new y1(bVar.f6320a, bVar.f6321b), bVar.f6322c, bVar.f6323d);
        }
        J(this.f6313u.C(bVar.f6320a, bVar.f6321b), false);
    }

    public void Q0(List list, int i9, long j9, B3.a0 a0Var) {
        this.f6301i.d(17, new b(list, a0Var, i9, j9, null)).a();
    }

    public final boolean R() {
        S0 s0L = this.f6312t.l();
        return (s0L == null || s0L.k() == Long.MIN_VALUE) ? false : true;
    }

    public final void R0(boolean z9) {
        if (z9 == this.f6285J) {
            return;
        }
        this.f6285J = z9;
        if (z9 || !this.f6317y.f6205o) {
            return;
        }
        this.f6301i.j(2);
    }

    public final void S0(boolean z9) throws C0927w {
        this.f6277B = z9;
        u0();
        if (!this.f6278C || this.f6312t.s() == this.f6312t.r()) {
            return;
        }
        E0(true);
        I(false);
    }

    public final boolean T() {
        S0 s0R = this.f6312t.r();
        long j9 = s0R.f5869f.f5884e;
        return s0R.f5867d && (j9 == -9223372036854775807L || this.f6317y.f6208r < j9 || !g1());
    }

    public void T0(boolean z9, int i9) {
        this.f6301i.g(1, z9 ? 1 : 0, i9).a();
    }

    public final void U0(boolean z9, int i9, boolean z10, int i10) {
        this.f6318z.b(z10 ? 1 : 0);
        this.f6318z.c(i10);
        this.f6317y = this.f6317y.e(z9, i9);
        this.f6279D = false;
        h0(z9);
        if (!g1()) {
            m1();
            q1();
            return;
        }
        int i11 = this.f6317y.f6195e;
        if (i11 == 3) {
            j1();
        } else if (i11 != 2) {
            return;
        }
        this.f6301i.j(2);
    }

    public final /* synthetic */ Boolean V() {
        return Boolean.valueOf(this.f6276A);
    }

    public void V0(C0917s1 c0917s1) {
        this.f6301i.d(4, c0917s1).a();
    }

    public final /* synthetic */ void W(C0932x1 c0932x1) {
        try {
            o(c0932x1);
        } catch (C0927w e9) {
            AbstractC1681B.e("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e9);
            throw new RuntimeException(e9);
        }
    }

    public final void W0(C0917s1 c0917s1) {
        O0(c0917s1);
        M(this.f6308p.c(), true);
    }

    public final void X() {
        boolean zF1 = f1();
        this.f6280E = zF1;
        if (zF1) {
            this.f6312t.l().d(this.f6288M);
        }
        n1();
    }

    public void X0(int i9) {
        this.f6301i.g(11, i9, 0).a();
    }

    public final void Y() {
        this.f6318z.d(this.f6317y);
        if (this.f6318z.f6328a) {
            this.f6311s.a(this.f6318z);
            this.f6318z = new e(this.f6317y);
        }
    }

    public final void Y0(int i9) throws C0927w {
        this.f6281F = i9;
        if (!this.f6312t.K(this.f6317y.f6191a, i9)) {
            E0(true);
        }
        I(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        if (r1 < r8.f6309q.size()) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        r3 = (O2.C0925v0.d) r8.f6309q.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if (r3 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        if (r3.f6327e == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
    
        r4 = r3.f6325c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        if (r4 < r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
    
        if (r4 != r0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        if (r3.f6326d > r9) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
    
        if (r1 >= r8.f6309q.size()) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0096, code lost:
    
        if (r3 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009a, code lost:
    
        if (r3.f6327e == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009e, code lost:
    
        if (r3.f6325c != r0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a0, code lost:
    
        r4 = r3.f6326d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a4, code lost:
    
        if (r4 <= r9) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a8, code lost:
    
        if (r4 > r11) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00aa, code lost:
    
        J0(r3.f6324a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b5, code lost:
    
        if (r3.f6324a.b() != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bd, code lost:
    
        if (r3.f6324a.j() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c0, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c3, code lost:
    
        r8.f6309q.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ce, code lost:
    
        if (r1 >= r8.f6309q.size()) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d0, code lost:
    
        r3 = (O2.C0925v0.d) r8.f6309q.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d9, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00db, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e2, code lost:
    
        if (r3.f6324a.b() != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ec, code lost:
    
        r8.f6309q.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f1, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f2, code lost:
    
        r8.f6289N = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0079, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0093 -> B:27:0x006f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z(long r9, long r11) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.C0925v0.Z(long, long):void");
    }

    public final void Z0(H1 h12) {
        this.f6316x = h12;
    }

    @Override // Z3.C.a
    public void a(C1 c12) {
        this.f6301i.j(26);
    }

    public final void a0() {
        T0 t0Q;
        this.f6312t.C(this.f6288M);
        if (this.f6312t.H() && (t0Q = this.f6312t.q(this.f6288M, this.f6317y)) != null) {
            S0 s0G = this.f6312t.g(this.f6296d, this.f6297e, this.f6299g.d(), this.f6313u, t0Q, this.f6298f);
            s0G.f5864a.s(this, t0Q.f5881b);
            if (this.f6312t.r() == s0G) {
                v0(t0Q.f5881b);
            }
            I(false);
        }
        if (!this.f6280E) {
            X();
        } else {
            this.f6280E = R();
            n1();
        }
    }

    public void a1(boolean z9) {
        this.f6301i.g(12, z9 ? 1 : 0, 0).a();
    }

    @Override // Z3.C.a
    public void b() {
        this.f6301i.j(10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b0() {
        /*
            r14 = this;
            r0 = 0
            r1 = 0
        L2:
            boolean r2 = r14.e1()
            if (r2 == 0) goto L61
            if (r1 == 0) goto Ld
            r14.Y()
        Ld:
            O2.V0 r1 = r14.f6312t
            O2.S0 r1 = r1.b()
            java.lang.Object r1 = d4.AbstractC1684a.e(r1)
            O2.S0 r1 = (O2.S0) r1
            O2.q1 r2 = r14.f6317y
            B3.C$b r2 = r2.f6192b
            java.lang.Object r2 = r2.f271a
            O2.T0 r3 = r1.f5869f
            B3.C$b r3 = r3.f5880a
            java.lang.Object r3 = r3.f271a
            boolean r2 = r2.equals(r3)
            r3 = 1
            if (r2 == 0) goto L45
            O2.q1 r2 = r14.f6317y
            B3.C$b r2 = r2.f6192b
            int r4 = r2.f272b
            r5 = -1
            if (r4 != r5) goto L45
            O2.T0 r4 = r1.f5869f
            B3.C$b r4 = r4.f5880a
            int r6 = r4.f272b
            if (r6 != r5) goto L45
            int r2 = r2.f275e
            int r4 = r4.f275e
            if (r2 == r4) goto L45
            r2 = 1
            goto L46
        L45:
            r2 = 0
        L46:
            O2.T0 r1 = r1.f5869f
            B3.C$b r5 = r1.f5880a
            long r10 = r1.f5881b
            long r8 = r1.f5882c
            r12 = r2 ^ 1
            r13 = 0
            r4 = r14
            r6 = r10
            O2.q1 r1 = r4.N(r5, r6, r8, r10, r12, r13)
            r14.f6317y = r1
            r14.u0()
            r14.q1()
            r1 = 1
            goto L2
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.C0925v0.b0():void");
    }

    public final void b1(boolean z9) throws C0927w {
        this.f6282G = z9;
        if (!this.f6312t.L(this.f6317y.f6191a, z9)) {
            E0(true);
        }
        I(false);
    }

    @Override // O2.C0894k1.d
    public void c() {
        this.f6301i.j(22);
    }

    public final void c0() {
        S0 s0S = this.f6312t.s();
        if (s0S == null) {
            return;
        }
        int i9 = 0;
        if (s0S.j() != null && !this.f6278C) {
            if (P()) {
                if (s0S.j().f5867d || this.f6288M >= s0S.j().m()) {
                    Z3.D dO = s0S.o();
                    S0 s0C = this.f6312t.c();
                    Z3.D dO2 = s0C.o();
                    Q1 q12 = this.f6317y.f6191a;
                    r1(q12, s0C.f5869f.f5880a, q12, s0S.f5869f.f5880a, -9223372036854775807L, false);
                    if (s0C.f5867d && s0C.f5864a.m() != -9223372036854775807L) {
                        L0(s0C.m());
                        return;
                    }
                    for (int i10 = 0; i10 < this.f6294a.length; i10++) {
                        boolean zC = dO.c(i10);
                        boolean zC2 = dO2.c(i10);
                        if (zC && !this.f6294a[i10].p()) {
                            boolean z9 = this.f6296d[i10].getTrackType() == -2;
                            F1 f12 = dO.f11082b[i10];
                            F1 f13 = dO2.f11082b[i10];
                            if (!zC2 || !f13.equals(f12) || z9) {
                                M0(this.f6294a[i10], s0C.m());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!s0S.f5869f.f5888i && !this.f6278C) {
            return;
        }
        while (true) {
            C1[] c1Arr = this.f6294a;
            if (i9 >= c1Arr.length) {
                return;
            }
            C1 c12 = c1Arr[i9];
            B3.Y y9 = s0S.f5866c[i9];
            if (y9 != null && c12.f() == y9 && c12.h()) {
                long j9 = s0S.f5869f.f5884e;
                M0(c12, (j9 == -9223372036854775807L || j9 == Long.MIN_VALUE) ? -9223372036854775807L : s0S.l() + s0S.f5869f.f5884e);
            }
            i9++;
        }
    }

    public final void c1(B3.a0 a0Var) throws Throwable {
        this.f6318z.b(1);
        J(this.f6313u.D(a0Var), false);
    }

    @Override // O2.C0932x1.a
    public synchronized void d(C0932x1 c0932x1) {
        if (!this.f6276A && this.f6303k.getThread().isAlive()) {
            this.f6301i.d(14, c0932x1).a();
            return;
        }
        AbstractC1681B.j("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        c0932x1.k(false);
    }

    public final void d0() throws C0927w {
        S0 s0S = this.f6312t.s();
        if (s0S == null || this.f6312t.r() == s0S || s0S.f5870g || !q0()) {
            return;
        }
        s();
    }

    public final void d1(int i9) {
        C0912q1 c0912q1 = this.f6317y;
        if (c0912q1.f6195e != i9) {
            if (i9 != 2) {
                this.f6293R = -9223372036854775807L;
            }
            this.f6317y = c0912q1.h(i9);
        }
    }

    @Override // B3.InterfaceC0517z.a
    public void e(InterfaceC0517z interfaceC0517z) {
        this.f6301i.d(8, interfaceC0517z).a();
    }

    public final void e0() throws Throwable {
        J(this.f6313u.i(), true);
    }

    public final boolean e1() {
        S0 s0R;
        S0 s0J;
        return g1() && !this.f6278C && (s0R = this.f6312t.r()) != null && (s0J = s0R.j()) != null && this.f6288M >= s0J.m() && s0J.f5870g;
    }

    public final void f0(c cVar) {
        this.f6318z.b(1);
        throw null;
    }

    public final boolean f1() {
        if (!R()) {
            return false;
        }
        S0 s0L = this.f6312t.l();
        long jF = F(s0L.k());
        long jY = s0L == this.f6312t.r() ? s0L.y(this.f6288M) : s0L.y(this.f6288M) - s0L.f5869f.f5881b;
        boolean zH = this.f6299g.h(jY, jF, this.f6308p.c().f6231a);
        if (zH || jF >= 500000) {
            return zH;
        }
        if (this.f6306n <= 0 && !this.f6307o) {
            return zH;
        }
        this.f6312t.r().f5864a.v(this.f6317y.f6208r, false);
        return this.f6299g.h(jY, jF, this.f6308p.c().f6231a);
    }

    public final void g0() {
        for (S0 s0R = this.f6312t.r(); s0R != null; s0R = s0R.j()) {
            for (Z3.s sVar : s0R.o().f11083c) {
                if (sVar != null) {
                    sVar.h();
                }
            }
        }
    }

    public final boolean g1() {
        C0912q1 c0912q1 = this.f6317y;
        return c0912q1.f6202l && c0912q1.f6203m == 0;
    }

    public final void h0(boolean z9) {
        for (S0 s0R = this.f6312t.r(); s0R != null; s0R = s0R.j()) {
            for (Z3.s sVar : s0R.o().f11083c) {
                if (sVar != null) {
                    sVar.m(z9);
                }
            }
        }
    }

    public final boolean h1(boolean z9) {
        if (this.f6286K == 0) {
            return T();
        }
        if (!z9) {
            return false;
        }
        if (!this.f6317y.f6197g) {
            return true;
        }
        S0 s0R = this.f6312t.r();
        long jB = i1(this.f6317y.f6191a, s0R.f5869f.f5880a) ? this.f6314v.b() : -9223372036854775807L;
        S0 s0L = this.f6312t.l();
        return (s0L.q() && s0L.f5869f.f5888i) || (s0L.f5869f.f5880a.b() && !s0L.f5867d) || this.f6299g.g(this.f6317y.f6191a, s0R.f5869f.f5880a, E(), this.f6308p.c().f6231a, this.f6279D, jB);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        C0927w e9;
        int i9;
        S0 s0S;
        IOException iOException;
        try {
            switch (message.what) {
                case 0:
                    l0();
                    break;
                case 1:
                    U0(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    q();
                    break;
                case 3:
                    F0((h) message.obj);
                    break;
                case 4:
                    W0((C0917s1) message.obj);
                    break;
                case 5:
                    Z0((H1) message.obj);
                    break;
                case 6:
                    l1(false, true);
                    break;
                case 7:
                    n0();
                    return true;
                case 8:
                    K((InterfaceC0517z) message.obj);
                    break;
                case 9:
                    G((InterfaceC0517z) message.obj);
                    break;
                case 10:
                    r0();
                    break;
                case 11:
                    Y0(message.arg1);
                    break;
                case 12:
                    b1(message.arg1 != 0);
                    break;
                case 13:
                    N0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    I0((C0932x1) message.obj);
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    K0((C0932x1) message.obj);
                    break;
                case 16:
                    M((C0917s1) message.obj, false);
                    break;
                case LangUtils.HASH_SEED /* 17 */:
                    P0((b) message.obj);
                    break;
                case 18:
                    k((b) message.obj, message.arg1);
                    break;
                case 19:
                    AbstractC1617D.a(message.obj);
                    f0(null);
                    break;
                case 20:
                    p0(message.arg1, message.arg2, (B3.a0) message.obj);
                    break;
                case 21:
                    c1((B3.a0) message.obj);
                    break;
                case 22:
                    e0();
                    break;
                case 23:
                    S0(message.arg1 != 0);
                    break;
                case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                    R0(message.arg1 == 1);
                    break;
                case 25:
                    m();
                    break;
                case 26:
                    s0();
                    break;
                default:
                    return false;
            }
        } catch (C0494b e10) {
            i9 = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
            iOException = e10;
            H(iOException, i9);
        } catch (C0897l1 e11) {
            int i10 = e11.f6129c;
            if (i10 == 1) {
                i = e11.f6128a ? AdError.MEDIATION_ERROR_CODE : 3003;
            } else if (i10 == 4) {
                i = e11.f6128a ? 3002 : 3004;
            }
            H(e11, i);
        } catch (C0927w e12) {
            e9 = e12;
            if (e9.f6351j == 1 && (s0S = this.f6312t.s()) != null) {
                e9 = e9.g(s0S.f5869f.f5880a);
            }
            if (e9.f6357p && this.f6291P == null) {
                AbstractC1681B.k("ExoPlayerImplInternal", "Recoverable renderer error", e9);
                this.f6291P = e9;
                InterfaceC1705w interfaceC1705w = this.f6301i;
                interfaceC1705w.h(interfaceC1705w.d(25, e9));
            } else {
                C0927w c0927w = this.f6291P;
                if (c0927w != null) {
                    c0927w.addSuppressed(e9);
                    e9 = this.f6291P;
                }
                AbstractC1681B.e("ExoPlayerImplInternal", "Playback error", e9);
                if (e9.f6351j == 1 && this.f6312t.r() != this.f6312t.s()) {
                    while (this.f6312t.r() != this.f6312t.s()) {
                        this.f6312t.b();
                    }
                    T0 t02 = ((S0) AbstractC1684a.e(this.f6312t.r())).f5869f;
                    C.b bVar = t02.f5880a;
                    long j9 = t02.f5881b;
                    this.f6317y = N(bVar, j9, t02.f5882c, j9, true, 0);
                }
                l1(true, false);
                this.f6317y = this.f6317y.f(e9);
            }
        } catch (InterfaceC1058o.a e13) {
            i9 = e13.f10015a;
            iOException = e13;
            H(iOException, i9);
        } catch (C1225p e14) {
            i9 = e14.f17591a;
            iOException = e14;
            H(iOException, i9);
        } catch (IOException e15) {
            i9 = AdError.SERVER_ERROR_CODE;
            iOException = e15;
            H(iOException, i9);
        } catch (RuntimeException e16) {
            e9 = C0927w.l(e16, ((e16 instanceof IllegalStateException) || (e16 instanceof IllegalArgumentException)) ? 1004 : 1000);
            AbstractC1681B.e("ExoPlayerImplInternal", "Playback error", e9);
            l1(true, false);
            this.f6317y = this.f6317y.f(e9);
        }
        Y();
        return true;
    }

    public final void i0() {
        for (S0 s0R = this.f6312t.r(); s0R != null; s0R = s0R.j()) {
            for (Z3.s sVar : s0R.o().f11083c) {
                if (sVar != null) {
                    sVar.s();
                }
            }
        }
    }

    public final boolean i1(Q1 q12, C.b bVar) {
        if (bVar.b() || q12.v()) {
            return false;
        }
        q12.s(q12.m(bVar.f271a, this.f6305m).f5718d, this.f6304l);
        if (!this.f6304l.i()) {
            return false;
        }
        Q1.d dVar = this.f6304l;
        return dVar.f5752j && dVar.f5749g != -9223372036854775807L;
    }

    @Override // B3.Z.a
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void j(InterfaceC0517z interfaceC0517z) {
        this.f6301i.d(9, interfaceC0517z).a();
    }

    public final void j1() {
        this.f6279D = false;
        this.f6308p.g();
        for (C1 c12 : this.f6294a) {
            if (S(c12)) {
                c12.start();
            }
        }
    }

    public final void k(b bVar, int i9) throws Throwable {
        this.f6318z.b(1);
        C0894k1 c0894k1 = this.f6313u;
        if (i9 == -1) {
            i9 = c0894k1.r();
        }
        J(c0894k1.f(i9, bVar.f6320a, bVar.f6321b), false);
    }

    public void k0() {
        this.f6301i.a(0).a();
    }

    public void k1() {
        this.f6301i.a(6).a();
    }

    public void l(int i9, List list, B3.a0 a0Var) {
        this.f6301i.c(18, i9, 0, new b(list, a0Var, -1, -9223372036854775807L, null)).a();
    }

    public final void l0() {
        this.f6318z.b(1);
        t0(false, false, false, true);
        this.f6299g.onPrepared();
        d1(this.f6317y.f6191a.v() ? 4 : 2);
        this.f6313u.w(this.f6300h.d());
        this.f6301i.j(2);
    }

    public final void l1(boolean z9, boolean z10) {
        t0(z9 || !this.f6283H, false, true, false);
        this.f6318z.b(z10 ? 1 : 0);
        this.f6299g.e();
        d1(1);
    }

    public final void m() throws C0927w {
        s0();
    }

    public synchronized boolean m0() {
        if (!this.f6276A && this.f6303k.getThread().isAlive()) {
            this.f6301i.j(7);
            t1(new r5.r() { // from class: O2.t0
                @Override // r5.r
                public final Object get() {
                    return this.f6234a.V();
                }
            }, this.f6315w);
            return this.f6276A;
        }
        return true;
    }

    public final void m1() {
        this.f6308p.h();
        for (C1 c12 : this.f6294a) {
            if (S(c12)) {
                v(c12);
            }
        }
    }

    public final void n1() {
        S0 s0L = this.f6312t.l();
        boolean z9 = this.f6280E || (s0L != null && s0L.f5864a.b());
        C0912q1 c0912q1 = this.f6317y;
        if (z9 != c0912q1.f6197g) {
            this.f6317y = c0912q1.b(z9);
        }
    }

    public final void o(C0932x1 c0932x1) {
        if (c0932x1.j()) {
            return;
        }
        try {
            c0932x1.g().n(c0932x1.i(), c0932x1.e());
        } finally {
            c0932x1.k(true);
        }
    }

    public final void o0() {
        for (int i9 = 0; i9 < this.f6294a.length; i9++) {
            this.f6296d[i9].g();
            this.f6294a[i9].release();
        }
    }

    public final void o1(C.b bVar, B3.i0 i0Var, Z3.D d9) {
        this.f6299g.c(this.f6317y.f6191a, bVar, this.f6294a, i0Var, d9.f11083c);
    }

    public final void p(C1 c12) {
        if (S(c12)) {
            this.f6308p.a(c12);
            v(c12);
            c12.disable();
            this.f6286K--;
        }
    }

    public final void p0(int i9, int i10, B3.a0 a0Var) throws Throwable {
        this.f6318z.b(1);
        J(this.f6313u.A(i9, i10, a0Var), false);
    }

    public final void p1() throws C0927w {
        if (this.f6317y.f6191a.v() || !this.f6313u.t()) {
            return;
        }
        a0();
        c0();
        d0();
        b0();
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q() throws O2.C0927w {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.C0925v0.q():void");
    }

    public final boolean q0() {
        S0 s0S = this.f6312t.s();
        Z3.D dO = s0S.o();
        int i9 = 0;
        boolean z9 = false;
        while (true) {
            C1[] c1Arr = this.f6294a;
            if (i9 >= c1Arr.length) {
                return !z9;
            }
            C1 c12 = c1Arr[i9];
            if (S(c12)) {
                boolean z10 = c12.f() != s0S.f5866c[i9];
                if (!dO.c(i9) || z10) {
                    if (!c12.p()) {
                        c12.m(z(dO.f11083c[i9]), s0S.f5866c[i9], s0S.m(), s0S.l());
                    } else if (c12.d()) {
                        p(c12);
                    } else {
                        z9 = true;
                    }
                }
            }
            i9++;
        }
    }

    public final void q1() {
        S0 s0R = this.f6312t.r();
        if (s0R == null) {
            return;
        }
        long jM = s0R.f5867d ? s0R.f5864a.m() : -9223372036854775807L;
        if (jM != -9223372036854775807L) {
            v0(jM);
            if (jM != this.f6317y.f6208r) {
                C0912q1 c0912q1 = this.f6317y;
                this.f6317y = N(c0912q1.f6192b, jM, c0912q1.f6193c, jM, true, 5);
            }
        } else {
            long jI = this.f6308p.i(s0R != this.f6312t.s());
            this.f6288M = jI;
            long jY = s0R.y(jI);
            Z(this.f6317y.f6208r, jY);
            this.f6317y.o(jY);
        }
        this.f6317y.f6206p = this.f6312t.l().i();
        this.f6317y.f6207q = E();
        C0912q1 c0912q12 = this.f6317y;
        if (c0912q12.f6202l && c0912q12.f6195e == 3 && i1(c0912q12.f6191a, c0912q12.f6192b) && this.f6317y.f6204n.f6231a == 1.0f) {
            float fA = this.f6314v.a(y(), E());
            if (this.f6308p.c().f6231a != fA) {
                O0(this.f6317y.f6204n.d(fA));
                L(this.f6317y.f6204n, this.f6308p.c().f6231a, false, false);
            }
        }
    }

    public final void r(int i9, boolean z9) throws C0927w {
        C1 c12 = this.f6294a[i9];
        if (S(c12)) {
            return;
        }
        S0 s0S = this.f6312t.s();
        boolean z10 = s0S == this.f6312t.r();
        Z3.D dO = s0S.o();
        F1 f12 = dO.f11082b[i9];
        C0936z0[] c0936z0ArrZ = z(dO.f11083c[i9]);
        boolean z11 = g1() && this.f6317y.f6195e == 3;
        boolean z12 = !z9 && z11;
        this.f6286K++;
        this.f6295c.add(c12);
        c12.k(f12, c0936z0ArrZ, s0S.f5866c[i9], this.f6288M, z12, z10, s0S.m(), s0S.l());
        c12.n(11, new a());
        this.f6308p.d(c12);
        if (z11) {
            c12.start();
        }
    }

    public final void r0() throws C0927w {
        float f9 = this.f6308p.c().f6231a;
        S0 s0S = this.f6312t.s();
        boolean z9 = true;
        for (S0 s0R = this.f6312t.r(); s0R != null && s0R.f5867d; s0R = s0R.j()) {
            Z3.D dV = s0R.v(f9, this.f6317y.f6191a);
            if (!dV.a(s0R.o())) {
                V0 v02 = this.f6312t;
                if (z9) {
                    S0 s0R2 = v02.r();
                    boolean zD = this.f6312t.D(s0R2);
                    boolean[] zArr = new boolean[this.f6294a.length];
                    long jB = s0R2.b(dV, this.f6317y.f6208r, zD, zArr);
                    C0912q1 c0912q1 = this.f6317y;
                    boolean z10 = (c0912q1.f6195e == 4 || jB == c0912q1.f6208r) ? false : true;
                    C0912q1 c0912q12 = this.f6317y;
                    this.f6317y = N(c0912q12.f6192b, jB, c0912q12.f6193c, c0912q12.f6194d, z10, 5);
                    if (z10) {
                        v0(jB);
                    }
                    boolean[] zArr2 = new boolean[this.f6294a.length];
                    int i9 = 0;
                    while (true) {
                        C1[] c1Arr = this.f6294a;
                        if (i9 >= c1Arr.length) {
                            break;
                        }
                        C1 c12 = c1Arr[i9];
                        boolean zS = S(c12);
                        zArr2[i9] = zS;
                        B3.Y y9 = s0R2.f5866c[i9];
                        if (zS) {
                            if (y9 != c12.f()) {
                                p(c12);
                            } else if (zArr[i9]) {
                                c12.w(this.f6288M);
                            }
                        }
                        i9++;
                    }
                    u(zArr2);
                } else {
                    v02.D(s0R);
                    if (s0R.f5867d) {
                        s0R.a(dV, Math.max(s0R.f5869f.f5881b, s0R.y(this.f6288M)), false);
                    }
                }
                I(true);
                if (this.f6317y.f6195e != 4) {
                    X();
                    q1();
                    this.f6301i.j(2);
                    return;
                }
                return;
            }
            if (s0R == s0S) {
                z9 = false;
            }
        }
    }

    public final void r1(Q1 q12, C.b bVar, Q1 q13, C.b bVar2, long j9, boolean z9) {
        if (!i1(q12, bVar)) {
            C0917s1 c0917s1 = bVar.b() ? C0917s1.f6227e : this.f6317y.f6204n;
            if (this.f6308p.c().equals(c0917s1)) {
                return;
            }
            O0(c0917s1);
            L(this.f6317y.f6204n, c0917s1.f6231a, false, false);
            return;
        }
        q12.s(q12.m(bVar.f271a, this.f6305m).f5718d, this.f6304l);
        this.f6314v.e((H0.g) d4.k0.j(this.f6304l.f5754l));
        if (j9 != -9223372036854775807L) {
            this.f6314v.d(A(q12, bVar.f271a, j9));
            return;
        }
        if (!d4.k0.c(!q13.v() ? q13.s(q13.m(bVar2.f271a, this.f6305m).f5718d, this.f6304l).f5744a : null, this.f6304l.f5744a) || z9) {
            this.f6314v.d(-9223372036854775807L);
        }
    }

    public final void s() throws C0927w {
        u(new boolean[this.f6294a.length]);
    }

    public final void s0() throws C0927w {
        r0();
        E0(true);
    }

    public final void s1(float f9) {
        for (S0 s0R = this.f6312t.r(); s0R != null; s0R = s0R.j()) {
            for (Z3.s sVar : s0R.o().f11083c) {
                if (sVar != null) {
                    sVar.f(f9);
                }
            }
        }
    }

    @Override // O2.r.a
    public void t(C0917s1 c0917s1) {
        this.f6301i.d(16, c0917s1).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6 A[PHI: r4 r5 r7
      0x00a6: PHI (r4v3 B3.C$b) = (r4v2 B3.C$b), (r4v11 B3.C$b) binds: [B:30:0x0079, B:32:0x009e] A[DONT_GENERATE, DONT_INLINE]
      0x00a6: PHI (r5v2 long) = (r5v1 long), (r5v4 long) binds: [B:30:0x0079, B:32:0x009e] A[DONT_GENERATE, DONT_INLINE]
      0x00a6: PHI (r7v3 long) = (r7v2 long), (r7v5 long) binds: [B:30:0x0079, B:32:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t0(boolean r31, boolean r32, boolean r33, boolean r34) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.C0925v0.t0(boolean, boolean, boolean, boolean):void");
    }

    public final synchronized void t1(r5.r rVar, long j9) {
        long jB = this.f6310r.b() + j9;
        boolean z9 = false;
        while (!((Boolean) rVar.get()).booleanValue() && j9 > 0) {
            try {
                this.f6310r.d();
                wait(j9);
            } catch (InterruptedException unused) {
                z9 = true;
            }
            j9 = jB - this.f6310r.b();
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
    }

    public final void u(boolean[] zArr) throws C0927w {
        S0 s0S = this.f6312t.s();
        Z3.D dO = s0S.o();
        for (int i9 = 0; i9 < this.f6294a.length; i9++) {
            if (!dO.c(i9) && this.f6295c.remove(this.f6294a[i9])) {
                this.f6294a[i9].reset();
            }
        }
        for (int i10 = 0; i10 < this.f6294a.length; i10++) {
            if (dO.c(i10)) {
                r(i10, zArr[i10]);
            }
        }
        s0S.f5870g = true;
    }

    public final void u0() {
        S0 s0R = this.f6312t.r();
        this.f6278C = s0R != null && s0R.f5869f.f5887h && this.f6277B;
    }

    public final void v(C1 c12) {
        if (c12.getState() == 2) {
            c12.stop();
        }
    }

    public final void v0(long j9) {
        S0 s0R = this.f6312t.r();
        long jZ = s0R == null ? j9 + 1000000000000L : s0R.z(j9);
        this.f6288M = jZ;
        this.f6308p.e(jZ);
        for (C1 c12 : this.f6294a) {
            if (S(c12)) {
                c12.w(this.f6288M);
            }
        }
        g0();
    }

    public void w(long j9) {
        this.f6292Q = j9;
    }

    public final AbstractC2743y x(Z3.s[] sVarArr) {
        AbstractC2743y.a aVar = new AbstractC2743y.a();
        boolean z9 = false;
        for (Z3.s sVar : sVarArr) {
            if (sVar != null) {
                C2540a c2540a = sVar.c(0).f6465k;
                if (c2540a == null) {
                    aVar.a(new C2540a(new C2540a.b[0]));
                } else {
                    aVar.a(c2540a);
                    z9 = true;
                }
            }
        }
        return z9 ? aVar.k() : AbstractC2743y.z();
    }

    public final long y() {
        C0912q1 c0912q1 = this.f6317y;
        return A(c0912q1.f6191a, c0912q1.f6192b.f271a, c0912q1.f6208r);
    }

    public final void y0(Q1 q12, Q1 q13) {
        if (q12.v() && q13.v()) {
            return;
        }
        for (int size = this.f6309q.size() - 1; size >= 0; size--) {
            if (!x0((d) this.f6309q.get(size), q12, q13, this.f6281F, this.f6282G, this.f6304l, this.f6305m)) {
                ((d) this.f6309q.get(size)).f6324a.k(false);
                this.f6309q.remove(size);
            }
        }
        Collections.sort(this.f6309q);
    }
}
