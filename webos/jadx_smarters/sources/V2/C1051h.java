package V2;

import O2.AbstractC0904o;
import O2.C0936z0;
import P2.v0;
import V2.C1050g;
import V2.C1056m;
import V2.G;
import V2.InterfaceC1058o;
import V2.InterfaceC1065w;
import V2.y;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import b4.C1208A;
import com.facebook.ads.AdError;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.k0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import s5.AbstractC2719C;
import s5.AbstractC2743y;
import s5.Z;
import s5.c0;

/* JADX INFO: renamed from: V2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1051h implements y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f9955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final G.c f9956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final O f9957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f9958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f9959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f9960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f9961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f9962j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b4.F f9963k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0127h f9964l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f9965m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f9966n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Set f9967o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Set f9968p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9969q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public G f9970r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C1050g f9971s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C1050g f9972t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Looper f9973u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Handler f9974v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f9975w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public byte[] f9976x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public v0 f9977y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile d f9978z;

    /* JADX INFO: renamed from: V2.h$b */
    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f9982d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f9984f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f9979a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public UUID f9980b = AbstractC0904o.f6140d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public G.c f9981c = L.f9887d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public b4.F f9985g = new C1208A();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int[] f9983e = new int[0];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f9986h = 300000;

        public C1051h a(O o9) {
            return new C1051h(this.f9980b, this.f9981c, o9, this.f9979a, this.f9982d, this.f9983e, this.f9984f, this.f9985g, this.f9986h);
        }

        public b b(Map map) {
            this.f9979a.clear();
            if (map != null) {
                this.f9979a.putAll(map);
            }
            return this;
        }

        public b c(boolean z9) {
            this.f9982d = z9;
            return this;
        }

        public b d(boolean z9) {
            this.f9984f = z9;
            return this;
        }

        public b e(int... iArr) {
            for (int i9 : iArr) {
                boolean z9 = true;
                if (i9 != 2 && i9 != 1) {
                    z9 = false;
                }
                AbstractC1684a.a(z9);
            }
            this.f9983e = (int[]) iArr.clone();
            return this;
        }

        public b f(UUID uuid, G.c cVar) {
            this.f9980b = (UUID) AbstractC1684a.e(uuid);
            this.f9981c = (G.c) AbstractC1684a.e(cVar);
            return this;
        }
    }

    /* JADX INFO: renamed from: V2.h$c */
    public class c implements G.b {
        public c() {
        }

        @Override // V2.G.b
        public void a(G g9, byte[] bArr, int i9, int i10, byte[] bArr2) {
            ((d) AbstractC1684a.e(C1051h.this.f9978z)).obtainMessage(i9, bArr).sendToTarget();
        }
    }

    /* JADX INFO: renamed from: V2.h$d */
    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (C1050g c1050g : C1051h.this.f9966n) {
                if (c1050g.t(bArr)) {
                    c1050g.B(message.what);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: V2.h$e */
    public static final class e extends Exception {
        public e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* JADX INFO: renamed from: V2.h$f */
    public class f implements y.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC1065w.a f9989b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public InterfaceC1058o f9990c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f9991d;

        public f(InterfaceC1065w.a aVar) {
            this.f9989b = aVar;
        }

        public void c(final C0936z0 c0936z0) {
            ((Handler) AbstractC1684a.e(C1051h.this.f9974v)).post(new Runnable() { // from class: V2.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9997a.d(c0936z0);
                }
            });
        }

        public final /* synthetic */ void d(C0936z0 c0936z0) {
            if (C1051h.this.f9969q == 0 || this.f9991d) {
                return;
            }
            C1051h c1051h = C1051h.this;
            this.f9990c = c1051h.s((Looper) AbstractC1684a.e(c1051h.f9973u), this.f9989b, c0936z0, false);
            C1051h.this.f9967o.add(this);
        }

        public final /* synthetic */ void e() {
            if (this.f9991d) {
                return;
            }
            InterfaceC1058o interfaceC1058o = this.f9990c;
            if (interfaceC1058o != null) {
                interfaceC1058o.f(this.f9989b);
            }
            C1051h.this.f9967o.remove(this);
            this.f9991d = true;
        }

        @Override // V2.y.b
        public void release() {
            k0.Y0((Handler) AbstractC1684a.e(C1051h.this.f9974v), new Runnable() { // from class: V2.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9999a.e();
                }
            });
        }
    }

    /* JADX INFO: renamed from: V2.h$g */
    public class g implements C1050g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f9993a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public C1050g f9994b;

        public g() {
        }

        @Override // V2.C1050g.a
        public void a(C1050g c1050g) {
            this.f9993a.add(c1050g);
            if (this.f9994b != null) {
                return;
            }
            this.f9994b = c1050g;
            c1050g.H();
        }

        @Override // V2.C1050g.a
        public void b(Exception exc, boolean z9) {
            this.f9994b = null;
            AbstractC2743y abstractC2743yR = AbstractC2743y.r(this.f9993a);
            this.f9993a.clear();
            c0 it = abstractC2743yR.iterator();
            while (it.hasNext()) {
                ((C1050g) it.next()).D(exc, z9);
            }
        }

        @Override // V2.C1050g.a
        public void c() {
            this.f9994b = null;
            AbstractC2743y abstractC2743yR = AbstractC2743y.r(this.f9993a);
            this.f9993a.clear();
            c0 it = abstractC2743yR.iterator();
            while (it.hasNext()) {
                ((C1050g) it.next()).C();
            }
        }

        public void d(C1050g c1050g) {
            this.f9993a.remove(c1050g);
            if (this.f9994b == c1050g) {
                this.f9994b = null;
                if (this.f9993a.isEmpty()) {
                    return;
                }
                C1050g c1050g2 = (C1050g) this.f9993a.iterator().next();
                this.f9994b = c1050g2;
                c1050g2.H();
            }
        }
    }

    /* JADX INFO: renamed from: V2.h$h, reason: collision with other inner class name */
    public class C0127h implements C1050g.b {
        public C0127h() {
        }

        @Override // V2.C1050g.b
        public void a(C1050g c1050g, int i9) {
            if (C1051h.this.f9965m != -9223372036854775807L) {
                C1051h.this.f9968p.remove(c1050g);
                ((Handler) AbstractC1684a.e(C1051h.this.f9974v)).removeCallbacksAndMessages(c1050g);
            }
        }

        @Override // V2.C1050g.b
        public void b(final C1050g c1050g, int i9) {
            if (i9 == 1 && C1051h.this.f9969q > 0 && C1051h.this.f9965m != -9223372036854775807L) {
                C1051h.this.f9968p.add(c1050g);
                ((Handler) AbstractC1684a.e(C1051h.this.f9974v)).postAtTime(new Runnable() { // from class: V2.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        c1050g.f(null);
                    }
                }, c1050g, SystemClock.uptimeMillis() + C1051h.this.f9965m);
            } else if (i9 == 0) {
                C1051h.this.f9966n.remove(c1050g);
                if (C1051h.this.f9971s == c1050g) {
                    C1051h.this.f9971s = null;
                }
                if (C1051h.this.f9972t == c1050g) {
                    C1051h.this.f9972t = null;
                }
                C1051h.this.f9962j.d(c1050g);
                if (C1051h.this.f9965m != -9223372036854775807L) {
                    ((Handler) AbstractC1684a.e(C1051h.this.f9974v)).removeCallbacksAndMessages(c1050g);
                    C1051h.this.f9968p.remove(c1050g);
                }
            }
            C1051h.this.B();
        }
    }

    public C1051h(UUID uuid, G.c cVar, O o9, HashMap map, boolean z9, int[] iArr, boolean z10, b4.F f9, long j9) {
        AbstractC1684a.e(uuid);
        AbstractC1684a.b(!AbstractC0904o.f6138b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f9955c = uuid;
        this.f9956d = cVar;
        this.f9957e = o9;
        this.f9958f = map;
        this.f9959g = z9;
        this.f9960h = iArr;
        this.f9961i = z10;
        this.f9963k = f9;
        this.f9962j = new g();
        this.f9964l = new C0127h();
        this.f9975w = 0;
        this.f9966n = new ArrayList();
        this.f9967o = Z.h();
        this.f9968p = Z.h();
        this.f9965m = j9;
    }

    public static boolean t(InterfaceC1058o interfaceC1058o) {
        return interfaceC1058o.getState() == 1 && (k0.f39777a < 19 || (((InterfaceC1058o.a) AbstractC1684a.e(interfaceC1058o.getError())).getCause() instanceof ResourceBusyException));
    }

    public static List x(C1056m c1056m, UUID uuid, boolean z9) {
        ArrayList arrayList = new ArrayList(c1056m.f10009e);
        for (int i9 = 0; i9 < c1056m.f10009e; i9++) {
            C1056m.b bVarF = c1056m.f(i9);
            if ((bVarF.e(uuid) || (AbstractC0904o.f6139c.equals(uuid) && bVarF.e(AbstractC0904o.f6138b))) && (bVarF.f10014f != null || z9)) {
                arrayList.add(bVarF);
            }
        }
        return arrayList;
    }

    public final void A(Looper looper) {
        if (this.f9978z == null) {
            this.f9978z = new d(looper);
        }
    }

    public final void B() {
        if (this.f9970r != null && this.f9969q == 0 && this.f9966n.isEmpty() && this.f9967o.isEmpty()) {
            ((G) AbstractC1684a.e(this.f9970r)).release();
            this.f9970r = null;
        }
    }

    public final void C() {
        c0 it = AbstractC2719C.r(this.f9968p).iterator();
        while (it.hasNext()) {
            ((InterfaceC1058o) it.next()).f(null);
        }
    }

    public final void D() {
        c0 it = AbstractC2719C.r(this.f9967o).iterator();
        while (it.hasNext()) {
            ((f) it.next()).release();
        }
    }

    public void E(int i9, byte[] bArr) {
        AbstractC1684a.g(this.f9966n.isEmpty());
        if (i9 == 1 || i9 == 3) {
            AbstractC1684a.e(bArr);
        }
        this.f9975w = i9;
        this.f9976x = bArr;
    }

    public final void F(InterfaceC1058o interfaceC1058o, InterfaceC1065w.a aVar) {
        interfaceC1058o.f(aVar);
        if (this.f9965m != -9223372036854775807L) {
            interfaceC1058o.f(null);
        }
    }

    public final void G(boolean z9) {
        if (z9 && this.f9973u == null) {
            AbstractC1681B.k("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) AbstractC1684a.e(this.f9973u)).getThread()) {
            AbstractC1681B.k("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f9973u.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // V2.y
    public int a(C0936z0 c0936z0) {
        G(false);
        int iH = ((G) AbstractC1684a.e(this.f9970r)).h();
        C1056m c1056m = c0936z0.f6470p;
        if (c1056m != null) {
            if (u(c1056m)) {
                return iH;
            }
            return 1;
        }
        if (k0.K0(this.f9960h, d4.F.k(c0936z0.f6467m)) != -1) {
            return iH;
        }
        return 0;
    }

    @Override // V2.y
    public void b(Looper looper, v0 v0Var) {
        y(looper);
        this.f9977y = v0Var;
    }

    @Override // V2.y
    public InterfaceC1058o c(InterfaceC1065w.a aVar, C0936z0 c0936z0) {
        G(false);
        AbstractC1684a.g(this.f9969q > 0);
        AbstractC1684a.i(this.f9973u);
        return s(this.f9973u, aVar, c0936z0, true);
    }

    @Override // V2.y
    public y.b d(InterfaceC1065w.a aVar, C0936z0 c0936z0) {
        AbstractC1684a.g(this.f9969q > 0);
        AbstractC1684a.i(this.f9973u);
        f fVar = new f(aVar);
        fVar.c(c0936z0);
        return fVar;
    }

    @Override // V2.y
    public final void prepare() {
        G(true);
        int i9 = this.f9969q;
        this.f9969q = i9 + 1;
        if (i9 != 0) {
            return;
        }
        if (this.f9970r == null) {
            G gA = this.f9956d.a(this.f9955c);
            this.f9970r = gA;
            gA.d(new c());
        } else if (this.f9965m != -9223372036854775807L) {
            for (int i10 = 0; i10 < this.f9966n.size(); i10++) {
                ((C1050g) this.f9966n.get(i10)).g(null);
            }
        }
    }

    @Override // V2.y
    public final void release() {
        G(true);
        int i9 = this.f9969q - 1;
        this.f9969q = i9;
        if (i9 != 0) {
            return;
        }
        if (this.f9965m != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f9966n);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((C1050g) arrayList.get(i10)).f(null);
            }
        }
        D();
        B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC1058o s(Looper looper, InterfaceC1065w.a aVar, C0936z0 c0936z0, boolean z9) {
        List listX;
        A(looper);
        C1056m c1056m = c0936z0.f6470p;
        if (c1056m == null) {
            return z(d4.F.k(c0936z0.f6467m), z9);
        }
        C1050g c1050gW = null;
        Object[] objArr = 0;
        if (this.f9976x == null) {
            listX = x((C1056m) AbstractC1684a.e(c1056m), this.f9955c, false);
            if (listX.isEmpty()) {
                e eVar = new e(this.f9955c);
                AbstractC1681B.e("DefaultDrmSessionMgr", "DRM error", eVar);
                if (aVar != null) {
                    aVar.l(eVar);
                }
                return new E(new InterfaceC1058o.a(eVar, AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE));
            }
        } else {
            listX = null;
        }
        if (this.f9959g) {
            Iterator it = this.f9966n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1050g c1050g = (C1050g) it.next();
                if (k0.c(c1050g.f9922a, listX)) {
                    c1050gW = c1050g;
                    break;
                }
            }
        } else {
            c1050gW = this.f9972t;
        }
        if (c1050gW == null) {
            c1050gW = w(listX, false, aVar, z9);
            if (!this.f9959g) {
                this.f9972t = c1050gW;
            }
            this.f9966n.add(c1050gW);
        } else {
            c1050gW.g(aVar);
        }
        return c1050gW;
    }

    public final boolean u(C1056m c1056m) {
        if (this.f9976x != null) {
            return true;
        }
        if (x(c1056m, this.f9955c, true).isEmpty()) {
            if (c1056m.f10009e != 1 || !c1056m.f(0).e(AbstractC0904o.f6138b)) {
                return false;
            }
            AbstractC1681B.j("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f9955c);
        }
        String str = c1056m.f10008d;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? k0.f39777a >= 25 : ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    public final C1050g v(List list, boolean z9, InterfaceC1065w.a aVar) {
        AbstractC1684a.e(this.f9970r);
        C1050g c1050g = new C1050g(this.f9955c, this.f9970r, this.f9962j, this.f9964l, list, this.f9975w, this.f9961i | z9, z9, this.f9976x, this.f9958f, this.f9957e, (Looper) AbstractC1684a.e(this.f9973u), this.f9963k, (v0) AbstractC1684a.e(this.f9977y));
        c1050g.g(aVar);
        if (this.f9965m != -9223372036854775807L) {
            c1050g.g(null);
        }
        return c1050g;
    }

    public final C1050g w(List list, boolean z9, InterfaceC1065w.a aVar, boolean z10) {
        C1050g c1050gV = v(list, z9, aVar);
        if (t(c1050gV) && !this.f9968p.isEmpty()) {
            C();
            F(c1050gV, aVar);
            c1050gV = v(list, z9, aVar);
        }
        if (!t(c1050gV) || !z10 || this.f9967o.isEmpty()) {
            return c1050gV;
        }
        D();
        if (!this.f9968p.isEmpty()) {
            C();
        }
        F(c1050gV, aVar);
        return v(list, z9, aVar);
    }

    public final synchronized void y(Looper looper) {
        try {
            Looper looper2 = this.f9973u;
            if (looper2 == null) {
                this.f9973u = looper;
                this.f9974v = new Handler(looper);
            } else {
                AbstractC1684a.g(looper2 == looper);
                AbstractC1684a.e(this.f9974v);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final InterfaceC1058o z(int i9, boolean z9) {
        G g9 = (G) AbstractC1684a.e(this.f9970r);
        if ((g9.h() == 2 && H.f9881d) || k0.K0(this.f9960h, i9) == -1 || g9.h() == 1) {
            return null;
        }
        C1050g c1050g = this.f9971s;
        if (c1050g == null) {
            C1050g c1050gW = w(AbstractC2743y.z(), true, null, z9);
            this.f9966n.add(c1050gW);
            this.f9971s = c1050gW;
        } else {
            c1050g.g(null);
        }
        return this.f9971s;
    }
}
