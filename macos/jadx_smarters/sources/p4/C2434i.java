package p4;

import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.AdError;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.zzdy;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import n4.AbstractC2268e;
import n4.C2279k;
import n4.C2280l;
import n4.C2284p;
import n4.C2285q;
import n4.C2286s;
import n4.D0;
import org.json.JSONObject;
import t4.C2775b;
import t4.C2790q;
import t4.C2791s;

/* JADX INFO: renamed from: p4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2434i implements AbstractC2268e.InterfaceC0394e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2791s f46520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2417E f46521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2429d f46522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public D0 f46523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TaskCompletionSource f46524g;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C2775b f46517m = new C2775b("RemoteMediaClient");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f46516l = C2791s.f50734C;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f46525h = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f46526i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f46527j = new ConcurrentHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map f46528k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f46518a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f46519b = new zzdy(Looper.getMainLooper());

    /* JADX INFO: renamed from: p4.i$a */
    public static abstract class a {
        public void a() {
        }

        public void b(MediaError mediaError) {
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }

        public void f() {
        }

        public abstract void g();

        public void h(int[] iArr) {
        }

        public void i(int[] iArr, int i9) {
        }

        public void j(C2284p[] c2284pArr) {
        }

        public void k(int[] iArr) {
        }

        public void l(List list, List list2, int i9) {
        }

        public void m(int[] iArr) {
        }

        public void n() {
        }
    }

    /* JADX INFO: renamed from: p4.i$b */
    public interface b {
        void a();

        void b();

        void c();

        void d();

        void e();

        void f();
    }

    /* JADX INFO: renamed from: p4.i$c */
    public interface c extends com.google.android.gms.common.api.h {
    }

    /* JADX INFO: renamed from: p4.i$d */
    public interface d {
    }

    /* JADX INFO: renamed from: p4.i$e */
    public interface e {
        void onProgressUpdated(long j9, long j10);
    }

    public C2434i(C2791s c2791s) {
        C2417E c2417e = new C2417E(this);
        this.f46521d = c2417e;
        C2791s c2791s2 = (C2791s) com.google.android.gms.common.internal.r.m(c2791s);
        this.f46520c = c2791s2;
        c2791s2.t(new C2425M(this, null));
        c2791s2.e(c2417e);
        this.f46522e = new C2429d(this, 20, 20);
    }

    public static /* bridge */ /* synthetic */ d a0(C2434i c2434i) {
        c2434i.getClass();
        return null;
    }

    public static com.google.android.gms.common.api.f d0(int i9, String str) {
        C2419G c2419g = new C2419G();
        c2419g.setResult(new C2418F(c2419g, new Status(i9, str)));
        return c2419g;
    }

    public static /* bridge */ /* synthetic */ void j0(C2434i c2434i) {
        for (O o9 : c2434i.f46528k.values()) {
            if (c2434i.q() && !o9.i()) {
                o9.f();
            } else if (!c2434i.q() && o9.i()) {
                o9.g();
            }
            if (o9.i() && (c2434i.r() || c2434i.q0() || c2434i.u() || c2434i.t())) {
                c2434i.s0(o9.f46412a);
            }
        }
    }

    public static final AbstractC2422J u0(AbstractC2422J abstractC2422J) {
        try {
            abstractC2422J.e();
        } catch (IllegalArgumentException e9) {
            throw e9;
        } catch (Throwable unused) {
            abstractC2422J.setResult(new C2421I(abstractC2422J, new Status(AdError.BROKEN_MEDIA_ERROR_CODE)));
        }
        return abstractC2422J;
    }

    public com.google.android.gms.common.api.f A() {
        return B(null);
    }

    public com.google.android.gms.common.api.f B(JSONObject jSONObject) {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        if (!t0()) {
            return d0(17, null);
        }
        C2450z c2450z = new C2450z(this, jSONObject);
        u0(c2450z);
        return c2450z;
    }

    public com.google.android.gms.common.api.f C() {
        return D(null);
    }

    public com.google.android.gms.common.api.f D(JSONObject jSONObject) {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        if (!t0()) {
            return d0(17, null);
        }
        C2413A c2413a = new C2413A(this, jSONObject);
        u0(c2413a);
        return c2413a;
    }

    public com.google.android.gms.common.api.f E(int i9, long j9, JSONObject jSONObject) {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        if (!t0()) {
            return d0(17, null);
        }
        C2445u c2445u = new C2445u(this, i9, j9, jSONObject);
        u0(c2445u);
        return c2445u;
    }

    public com.google.android.gms.common.api.f F(int i9, JSONObject jSONObject) {
        return E(i9, -1L, jSONObject);
    }

    public com.google.android.gms.common.api.f G(C2284p[] c2284pArr, int i9, int i10, long j9, JSONObject jSONObject) {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        if (!t0()) {
            return d0(17, null);
        }
        C2441p c2441p = new C2441p(this, c2284pArr, i9, i10, j9, jSONObject);
        u0(c2441p);
        return c2441p;
    }

    public com.google.android.gms.common.api.f H(C2284p[] c2284pArr, int i9, int i10, JSONObject jSONObject) {
        return G(c2284pArr, i9, i10, -1L, jSONObject);
    }

    public com.google.android.gms.common.api.f I(int i9, int i10, JSONObject jSONObject) {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        if (!t0()) {
            return d0(17, null);
        }
        C2446v c2446v = new C2446v(this, i9, i10, jSONObject);
        u0(c2446v);
        return c2446v;
    }

    public com.google.android.gms.common.api.f J(JSONObject jSONObject) {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        if (!t0()) {
            return d0(17, null);
        }
        C2443s c2443s = new C2443s(this, jSONObject);
        u0(c2443s);
        return c2443s;
    }

    public com.google.android.gms.common.api.f K(JSONObject jSONObject) {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        if (!t0()) {
            return d0(17, null);
        }
        r rVar = new r(this, jSONObject);
        u0(rVar);
        return rVar;
    }

    public com.google.android.gms.common.api.f L(int i9, JSONObject jSONObject) {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        if (!t0()) {
            return d0(17, null);
        }
        C2444t c2444t = new C2444t(this, i9, jSONObject);
        u0(c2444t);
        return c2444t;
    }

    public com.google.android.gms.common.api.f M(int[] iArr, JSONObject jSONObject) {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        if (!t0()) {
            return d0(17, null);
        }
        C2442q c2442q = new C2442q(this, iArr, jSONObject);
        u0(c2442q);
        return c2442q;
    }

    public void N(a aVar) {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        if (aVar != null) {
            this.f46526i.add(aVar);
        }
    }

    public void O(b bVar) {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        if (bVar != null) {
            this.f46525h.remove(bVar);
        }
    }

    public void P(e eVar) {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        O o9 = (O) this.f46527j.remove(eVar);
        if (o9 != null) {
            o9.e(eVar);
            if (o9.h()) {
                return;
            }
            this.f46528k.remove(Long.valueOf(o9.b()));
            o9.g();
        }
    }

    public com.google.android.gms.common.api.f Q() {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        if (!t0()) {
            return d0(17, null);
        }
        C2439n c2439n = new C2439n(this);
        u0(c2439n);
        return c2439n;
    }

    public com.google.android.gms.common.api.f R(long j9) {
        return S(j9, 0, null);
    }

    public com.google.android.gms.common.api.f S(long j9, int i9, JSONObject jSONObject) {
        C2285q.a aVar = new C2285q.a();
        aVar.d(j9);
        aVar.e(i9);
        aVar.b(jSONObject);
        return T(aVar.a());
    }

    public com.google.android.gms.common.api.f T(C2285q c2285q) {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        if (!t0()) {
            return d0(17, null);
        }
        C2415C c2415c = new C2415C(this, c2285q);
        u0(c2415c);
        return c2415c;
    }

    public com.google.android.gms.common.api.f U(long[] jArr) {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        if (!t0()) {
            return d0(17, null);
        }
        C2440o c2440o = new C2440o(this, jArr);
        u0(c2440o);
        return c2440o;
    }

    public com.google.android.gms.common.api.f V() {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        if (!t0()) {
            return d0(17, null);
        }
        C2438m c2438m = new C2438m(this);
        u0(c2438m);
        return c2438m;
    }

    public void W() {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        int iN = n();
        if (iN == 4 || iN == 2) {
            A();
        } else {
            C();
        }
    }

    public void X(a aVar) {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        if (aVar != null) {
            this.f46526i.remove(aVar);
        }
    }

    public final int Y() {
        C2284p c2284pI;
        if (j() != null && q()) {
            if (r()) {
                return 6;
            }
            if (v()) {
                return 3;
            }
            if (u()) {
                return 2;
            }
            if (t() && (c2284pI = i()) != null && c2284pI.L() != null) {
                return 6;
            }
        }
        return 0;
    }

    @Override // n4.AbstractC2268e.InterfaceC0394e
    public void a(CastDevice castDevice, String str, String str2) {
        this.f46520c.r(str2);
    }

    public void b(b bVar) {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        if (bVar != null) {
            this.f46525h.add(bVar);
        }
    }

    public boolean c(e eVar, long j9) {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        if (eVar == null || this.f46527j.containsKey(eVar)) {
            return false;
        }
        Map map = this.f46528k;
        Long lValueOf = Long.valueOf(j9);
        O o9 = (O) map.get(lValueOf);
        if (o9 == null) {
            o9 = new O(this, j9);
            this.f46528k.put(lValueOf, o9);
        }
        o9.d(eVar);
        this.f46527j.put(eVar, o9);
        if (!q()) {
            return true;
        }
        o9.f();
        return true;
    }

    public long d() {
        long jF;
        synchronized (this.f46518a) {
            com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
            jF = this.f46520c.F();
        }
        return jF;
    }

    public long e() {
        long jG;
        synchronized (this.f46518a) {
            com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
            jG = this.f46520c.G();
        }
        return jG;
    }

    public final com.google.android.gms.common.api.f e0() {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        if (!t0()) {
            return d0(17, null);
        }
        C2447w c2447w = new C2447w(this, true);
        u0(c2447w);
        return c2447w;
    }

    public long f() {
        long jH;
        synchronized (this.f46518a) {
            com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
            jH = this.f46520c.H();
        }
        return jH;
    }

    public final com.google.android.gms.common.api.f f0(int[] iArr) {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        if (!t0()) {
            return d0(17, null);
        }
        C2448x c2448x = new C2448x(this, true, iArr);
        u0(c2448x);
        return c2448x;
    }

    public long g() {
        long jI;
        synchronized (this.f46518a) {
            com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
            jI = this.f46520c.I();
        }
        return jI;
    }

    public final Task g0(JSONObject jSONObject) {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        if (!t0()) {
            return Tasks.forException(new C2790q());
        }
        this.f46524g = new TaskCompletionSource();
        f46517m.a("create SessionState with cached mediaInfo and mediaStatus", new Object[0]);
        MediaInfo mediaInfoJ = j();
        n4.r rVarL = l();
        C2286s c2286sA = null;
        if (mediaInfoJ != null && rVarL != null) {
            C2280l.a aVar = new C2280l.a();
            aVar.h(mediaInfoJ);
            aVar.f(g());
            aVar.j(rVarL.W());
            aVar.i(rVarL.T());
            aVar.b(rVarL.H());
            aVar.g(rVarL.L());
            C2280l c2280lA = aVar.a();
            C2286s.a aVar2 = new C2286s.a();
            aVar2.b(c2280lA);
            c2286sA = aVar2.a();
        }
        TaskCompletionSource taskCompletionSource = this.f46524g;
        if (c2286sA != null) {
            taskCompletionSource.setResult(c2286sA);
        } else {
            taskCompletionSource.setException(new C2790q());
        }
        return this.f46524g.getTask();
    }

    public int h() {
        int iM;
        synchronized (this.f46518a) {
            try {
                com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
                n4.r rVarL = l();
                iM = rVarL != null ? rVarL.M() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iM;
    }

    public C2284p i() {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        n4.r rVarL = l();
        if (rVarL == null) {
            return null;
        }
        return rVarL.Y(rVarL.R());
    }

    public MediaInfo j() {
        MediaInfo mediaInfoN;
        synchronized (this.f46518a) {
            com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
            mediaInfoN = this.f46520c.n();
        }
        return mediaInfoN;
    }

    public C2429d k() {
        C2429d c2429d;
        synchronized (this.f46518a) {
            com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
            c2429d = this.f46522e;
        }
        return c2429d;
    }

    public n4.r l() {
        n4.r rVarO;
        synchronized (this.f46518a) {
            com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
            rVarO = this.f46520c.o();
        }
        return rVarO;
    }

    public final void l0() {
        D0 d02 = this.f46523f;
        if (d02 == null) {
            return;
        }
        d02.d(m(), this);
        Q();
    }

    public String m() {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        return this.f46520c.b();
    }

    public final void m0(C2286s c2286s) {
        C2280l c2280lH;
        if (c2286s == null || (c2280lH = c2286s.H()) == null) {
            return;
        }
        f46517m.a("resume SessionState", new Object[0]);
        z(c2280lH);
    }

    public int n() {
        int iU;
        synchronized (this.f46518a) {
            try {
                com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
                n4.r rVarL = l();
                iU = rVarL != null ? rVarL.U() : 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iU;
    }

    public final void n0(D0 d02) {
        D0 d03 = this.f46523f;
        if (d03 == d02) {
            return;
        }
        if (d03 != null) {
            this.f46520c.c();
            this.f46522e.n();
            d03.e(m());
            this.f46521d.b(null);
            this.f46519b.removeCallbacksAndMessages(null);
        }
        this.f46523f = d02;
        if (d02 != null) {
            this.f46521d.b(d02);
        }
    }

    public C2284p o() {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        n4.r rVarL = l();
        if (rVarL == null) {
            return null;
        }
        return rVarL.Y(rVarL.V());
    }

    public final boolean o0() {
        Integer numN;
        if (!q()) {
            return false;
        }
        n4.r rVar = (n4.r) com.google.android.gms.common.internal.r.m(l());
        return rVar.f0(64L) || rVar.b0() != 0 || ((numN = rVar.N(rVar.K())) != null && numN.intValue() < rVar.Z() + (-1));
    }

    public long p() {
        long jK;
        synchronized (this.f46518a) {
            com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
            jK = this.f46520c.K();
        }
        return jK;
    }

    public final boolean p0() {
        Integer numN;
        if (!q()) {
            return false;
        }
        n4.r rVar = (n4.r) com.google.android.gms.common.internal.r.m(l());
        return rVar.f0(128L) || rVar.b0() != 0 || ((numN = rVar.N(rVar.K())) != null && numN.intValue() > 0);
    }

    public boolean q() {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        return r() || q0() || v() || u() || t();
    }

    public final boolean q0() {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        n4.r rVarL = l();
        return rVarL != null && rVarL.U() == 5;
    }

    public boolean r() {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        n4.r rVarL = l();
        return rVarL != null && rVarL.U() == 4;
    }

    public final boolean r0() {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        if (!s()) {
            return true;
        }
        n4.r rVarL = l();
        return (rVarL == null || !rVarL.f0(2L) || rVarL.Q() == null) ? false : true;
    }

    public boolean s() {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        MediaInfo mediaInfoJ = j();
        return mediaInfoJ != null && mediaInfoJ.T() == 2;
    }

    public final void s0(Set set) {
        MediaInfo mediaInfoL;
        HashSet hashSet = new HashSet(set);
        if (v() || u() || r() || q0()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((e) it.next()).onProgressUpdated(g(), p());
            }
        } else {
            if (!t()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).onProgressUpdated(0L, 0L);
                }
                return;
            }
            C2284p c2284pI = i();
            if (c2284pI == null || (mediaInfoL = c2284pI.L()) == null) {
                return;
            }
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                ((e) it3.next()).onProgressUpdated(0L, mediaInfoL.S());
            }
        }
    }

    public boolean t() {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        n4.r rVarL = l();
        return (rVarL == null || rVarL.R() == 0) ? false : true;
    }

    public final boolean t0() {
        return this.f46523f != null;
    }

    public boolean u() {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        n4.r rVarL = l();
        if (rVarL == null) {
            return false;
        }
        if (rVarL.U() != 3) {
            return s() && h() == 2;
        }
        return true;
    }

    public boolean v() {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        n4.r rVarL = l();
        return rVarL != null && rVarL.U() == 2;
    }

    public boolean w() {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        n4.r rVarL = l();
        return rVarL != null && rVarL.h0();
    }

    public com.google.android.gms.common.api.f x(MediaInfo mediaInfo, C2279k c2279k) {
        C2280l.a aVar = new C2280l.a();
        aVar.h(mediaInfo);
        aVar.c(Boolean.valueOf(c2279k.b()));
        aVar.f(c2279k.f());
        aVar.i(c2279k.g());
        aVar.b(c2279k.a());
        aVar.g(c2279k.e());
        aVar.d(c2279k.c());
        aVar.e(c2279k.d());
        return z(aVar.a());
    }

    public com.google.android.gms.common.api.f y(MediaInfo mediaInfo, boolean z9, long j9) {
        C2279k.a aVar = new C2279k.a();
        aVar.b(z9);
        aVar.c(j9);
        return x(mediaInfo, aVar.a());
    }

    public com.google.android.gms.common.api.f z(C2280l c2280l) {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        if (!t0()) {
            return d0(17, null);
        }
        C2449y c2449y = new C2449y(this, c2280l);
        u0(c2449y);
        return c2449y;
    }
}
