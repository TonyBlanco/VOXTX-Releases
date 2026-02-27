package J3;

import B3.C0512u;
import B3.C0515x;
import B3.J;
import J3.f;
import J3.g;
import J3.i;
import J3.k;
import O2.C0897l1;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import b4.C;
import b4.F;
import b4.G;
import b4.I;
import b4.InterfaceC1224o;
import com.google.android.gms.common.api.a;
import d4.AbstractC1684a;
import d4.k0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import s5.D;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements k, G.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final k.a f3096q = new k.a() { // from class: J3.b
        @Override // J3.k.a
        public final k a(H3.g gVar, F f9, j jVar) {
            return new c(gVar, f9, jVar);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H3.g f3097a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f3098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F f3099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f3100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArrayList f3101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f3102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public J.a f3103h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public G f3104i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Handler f3105j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k.e f3106k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public g f3107l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Uri f3108m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f f3109n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f3110o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f3111p;

    public class b implements k.b {
        public b() {
        }

        @Override // J3.k.b
        public boolean a(Uri uri, F.c cVar, boolean z9) {
            C0051c c0051c;
            if (c.this.f3109n == null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                List list = ((g) k0.j(c.this.f3107l)).f3172e;
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    C0051c c0051c2 = (C0051c) c.this.f3100e.get(((g.b) list.get(i10)).f3185a);
                    if (c0051c2 != null && jElapsedRealtime < c0051c2.f3120i) {
                        i9++;
                    }
                }
                F.b bVarA = c.this.f3099d.a(new F.a(1, 0, c.this.f3107l.f3172e.size(), i9), cVar);
                if (bVarA != null && bVarA.f17492a == 2 && (c0051c = (C0051c) c.this.f3100e.get(uri)) != null) {
                    c0051c.h(bVarA.f17493b);
                }
            }
            return false;
        }

        @Override // J3.k.b
        public void e() {
            c.this.f3101f.remove(this);
        }
    }

    /* JADX INFO: renamed from: J3.c$c, reason: collision with other inner class name */
    public final class C0051c implements G.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f3113a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final G f3114c = new G("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final InterfaceC1224o f3115d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public f f3116e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f3117f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f3118g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f3119h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f3120i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f3121j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public IOException f3122k;

        public C0051c(Uri uri) {
            this.f3113a = uri;
            this.f3115d = c.this.f3097a.a(4);
        }

        public final boolean h(long j9) {
            this.f3120i = SystemClock.elapsedRealtime() + j9;
            return this.f3113a.equals(c.this.f3108m) && !c.this.K();
        }

        public final Uri i() {
            f fVar = this.f3116e;
            if (fVar != null) {
                f.C0052f c0052f = fVar.f3146v;
                if (c0052f.f3165a != -9223372036854775807L || c0052f.f3169e) {
                    Uri.Builder builderBuildUpon = this.f3113a.buildUpon();
                    f fVar2 = this.f3116e;
                    if (fVar2.f3146v.f3169e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(fVar2.f3135k + ((long) fVar2.f3142r.size())));
                        f fVar3 = this.f3116e;
                        if (fVar3.f3138n != -9223372036854775807L) {
                            List list = fVar3.f3143s;
                            int size = list.size();
                            if (!list.isEmpty() && ((f.b) D.d(list)).f3148n) {
                                size--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    f.C0052f c0052f2 = this.f3116e.f3146v;
                    if (c0052f2.f3165a != -9223372036854775807L) {
                        builderBuildUpon.appendQueryParameter("_HLS_skip", c0052f2.f3166b ? "v2" : "YES");
                    }
                    return builderBuildUpon.build();
                }
            }
            return this.f3113a;
        }

        public f k() {
            return this.f3116e;
        }

        public boolean l() {
            int i9;
            if (this.f3116e == null) {
                return false;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jMax = Math.max(30000L, k0.x1(this.f3116e.f3145u));
            f fVar = this.f3116e;
            return fVar.f3139o || (i9 = fVar.f3128d) == 2 || i9 == 1 || this.f3117f + jMax > jElapsedRealtime;
        }

        public final /* synthetic */ void m(Uri uri) {
            this.f3121j = false;
            o(uri);
        }

        public void n() {
            p(this.f3113a);
        }

        public final void o(Uri uri) {
            I i9 = new I(this.f3115d, uri, 4, c.this.f3098c.a(c.this.f3107l, this.f3116e));
            c.this.f3103h.y(new C0512u(i9.f17518a, i9.f17519c, this.f3114c.n(i9, this, c.this.f3099d.b(i9.f17520d))), i9.f17520d);
        }

        public final void p(final Uri uri) {
            this.f3120i = 0L;
            if (this.f3121j || this.f3114c.j() || this.f3114c.i()) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime >= this.f3119h) {
                o(uri);
            } else {
                this.f3121j = true;
                c.this.f3105j.postDelayed(new Runnable() { // from class: J3.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f3124a.m(uri);
                    }
                }, this.f3119h - jElapsedRealtime);
            }
        }

        public void q() throws IOException {
            this.f3114c.a();
            IOException iOException = this.f3122k;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // b4.G.b
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void t(I i9, long j9, long j10, boolean z9) {
            C0512u c0512u = new C0512u(i9.f17518a, i9.f17519c, i9.f(), i9.d(), j9, j10, i9.b());
            c.this.f3099d.d(i9.f17518a);
            c.this.f3103h.p(c0512u, 4);
        }

        @Override // b4.G.b
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void W(I i9, long j9, long j10) {
            h hVar = (h) i9.e();
            C0512u c0512u = new C0512u(i9.f17518a, i9.f17519c, i9.f(), i9.d(), j9, j10, i9.b());
            if (hVar instanceof f) {
                v((f) hVar, c0512u);
                c.this.f3103h.s(c0512u, 4);
            } else {
                this.f3122k = C0897l1.c("Loaded playlist has unexpected type.", null);
                c.this.f3103h.w(c0512u, 4, this.f3122k, true);
            }
            c.this.f3099d.d(i9.f17518a);
        }

        @Override // b4.G.b
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public G.c j(I i9, long j9, long j10, IOException iOException, int i10) {
            G.c cVarH;
            C0512u c0512u = new C0512u(i9.f17518a, i9.f17519c, i9.f(), i9.d(), j9, j10, i9.b());
            boolean z9 = iOException instanceof i.a;
            if ((i9.f().getQueryParameter("_HLS_msn") != null) || z9) {
                int i11 = iOException instanceof C.e ? ((C.e) iOException).f17480e : a.e.API_PRIORITY_OTHER;
                if (z9 || i11 == 400 || i11 == 503) {
                    this.f3119h = SystemClock.elapsedRealtime();
                    n();
                    ((J.a) k0.j(c.this.f3103h)).w(c0512u, i9.f17520d, iOException, true);
                    return G.f17500f;
                }
            }
            F.c cVar = new F.c(c0512u, new C0515x(i9.f17520d), iOException, i10);
            if (c.this.M(this.f3113a, cVar, false)) {
                long jC = c.this.f3099d.c(cVar);
                cVarH = jC != -9223372036854775807L ? G.h(false, jC) : G.f17501g;
            } else {
                cVarH = G.f17500f;
            }
            boolean z10 = !cVarH.c();
            c.this.f3103h.w(c0512u, i9.f17520d, iOException, z10);
            if (z10) {
                c.this.f3099d.d(i9.f17518a);
            }
            return cVarH;
        }

        public final void v(f fVar, C0512u c0512u) {
            boolean z9;
            f fVar2 = this.f3116e;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f3117f = jElapsedRealtime;
            f fVarF = c.this.F(fVar2, fVar);
            this.f3116e = fVarF;
            IOException dVar = null;
            if (fVarF != fVar2) {
                this.f3122k = null;
                this.f3118g = jElapsedRealtime;
                c.this.Q(this.f3113a, fVarF);
            } else if (!fVarF.f3139o) {
                if (fVar.f3135k + ((long) fVar.f3142r.size()) < this.f3116e.f3135k) {
                    dVar = new k.c(this.f3113a);
                    z9 = true;
                } else {
                    double d9 = jElapsedRealtime - this.f3118g;
                    double dX1 = k0.x1(r12.f3137m) * c.this.f3102g;
                    z9 = false;
                    if (d9 > dX1) {
                        dVar = new k.d(this.f3113a);
                    }
                }
                if (dVar != null) {
                    this.f3122k = dVar;
                    c.this.M(this.f3113a, new F.c(c0512u, new C0515x(4), dVar, 1), z9);
                }
            }
            f fVar3 = this.f3116e;
            this.f3119h = jElapsedRealtime + k0.x1(!fVar3.f3146v.f3169e ? fVar3 != fVar2 ? fVar3.f3137m : fVar3.f3137m / 2 : 0L);
            if ((this.f3116e.f3138n != -9223372036854775807L || this.f3113a.equals(c.this.f3108m)) && !this.f3116e.f3139o) {
                p(i());
            }
        }

        public void w() {
            this.f3114c.l();
        }
    }

    public c(H3.g gVar, F f9, j jVar) {
        this(gVar, f9, jVar, 3.5d);
    }

    public c(H3.g gVar, F f9, j jVar, double d9) {
        this.f3097a = gVar;
        this.f3098c = jVar;
        this.f3099d = f9;
        this.f3102g = d9;
        this.f3101f = new CopyOnWriteArrayList();
        this.f3100e = new HashMap();
        this.f3111p = -9223372036854775807L;
    }

    public static f.d E(f fVar, f fVar2) {
        int i9 = (int) (fVar2.f3135k - fVar.f3135k);
        List list = fVar.f3142r;
        if (i9 < list.size()) {
            return (f.d) list.get(i9);
        }
        return null;
    }

    public final void D(List list) {
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            Uri uri = (Uri) list.get(i9);
            this.f3100e.put(uri, new C0051c(uri));
        }
    }

    public final f F(f fVar, f fVar2) {
        return !fVar2.f(fVar) ? fVar2.f3139o ? fVar.d() : fVar : fVar2.c(H(fVar, fVar2), G(fVar, fVar2));
    }

    public final int G(f fVar, f fVar2) {
        f.d dVarE;
        if (fVar2.f3133i) {
            return fVar2.f3134j;
        }
        f fVar3 = this.f3109n;
        int i9 = fVar3 != null ? fVar3.f3134j : 0;
        return (fVar == null || (dVarE = E(fVar, fVar2)) == null) ? i9 : (fVar.f3134j + dVarE.f3157e) - ((f.d) fVar2.f3142r.get(0)).f3157e;
    }

    public final long H(f fVar, f fVar2) {
        if (fVar2.f3140p) {
            return fVar2.f3132h;
        }
        f fVar3 = this.f3109n;
        long j9 = fVar3 != null ? fVar3.f3132h : 0L;
        if (fVar == null) {
            return j9;
        }
        int size = fVar.f3142r.size();
        f.d dVarE = E(fVar, fVar2);
        return dVarE != null ? fVar.f3132h + dVarE.f3158f : ((long) size) == fVar2.f3135k - fVar.f3135k ? fVar.e() : j9;
    }

    public final Uri I(Uri uri) {
        f.c cVar;
        f fVar = this.f3109n;
        if (fVar == null || !fVar.f3146v.f3169e || (cVar = (f.c) fVar.f3144t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(cVar.f3150b));
        int i9 = cVar.f3151c;
        if (i9 != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i9));
        }
        return builderBuildUpon.build();
    }

    public final boolean J(Uri uri) {
        List list = this.f3107l.f3172e;
        for (int i9 = 0; i9 < list.size(); i9++) {
            if (uri.equals(((g.b) list.get(i9)).f3185a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean K() {
        List list = this.f3107l.f3172e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i9 = 0; i9 < size; i9++) {
            C0051c c0051c = (C0051c) AbstractC1684a.e((C0051c) this.f3100e.get(((g.b) list.get(i9)).f3185a));
            if (jElapsedRealtime > c0051c.f3120i) {
                Uri uri = c0051c.f3113a;
                this.f3108m = uri;
                c0051c.p(I(uri));
                return true;
            }
        }
        return false;
    }

    public final void L(Uri uri) {
        if (uri.equals(this.f3108m) || !J(uri)) {
            return;
        }
        f fVar = this.f3109n;
        if (fVar == null || !fVar.f3139o) {
            this.f3108m = uri;
            C0051c c0051c = (C0051c) this.f3100e.get(uri);
            f fVar2 = c0051c.f3116e;
            if (fVar2 == null || !fVar2.f3139o) {
                c0051c.p(I(uri));
            } else {
                this.f3109n = fVar2;
                this.f3106k.M(fVar2);
            }
        }
    }

    public final boolean M(Uri uri, F.c cVar, boolean z9) {
        Iterator it = this.f3101f.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= !((k.b) it.next()).a(uri, cVar, z9);
        }
        return z10;
    }

    @Override // b4.G.b
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void t(I i9, long j9, long j10, boolean z9) {
        C0512u c0512u = new C0512u(i9.f17518a, i9.f17519c, i9.f(), i9.d(), j9, j10, i9.b());
        this.f3099d.d(i9.f17518a);
        this.f3103h.p(c0512u, 4);
    }

    @Override // b4.G.b
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void W(I i9, long j9, long j10) {
        h hVar = (h) i9.e();
        boolean z9 = hVar instanceof f;
        g gVarE = z9 ? g.e(hVar.f3191a) : (g) hVar;
        this.f3107l = gVarE;
        this.f3108m = ((g.b) gVarE.f3172e.get(0)).f3185a;
        this.f3101f.add(new b());
        D(gVarE.f3171d);
        C0512u c0512u = new C0512u(i9.f17518a, i9.f17519c, i9.f(), i9.d(), j9, j10, i9.b());
        C0051c c0051c = (C0051c) this.f3100e.get(this.f3108m);
        if (z9) {
            c0051c.v((f) hVar, c0512u);
        } else {
            c0051c.n();
        }
        this.f3099d.d(i9.f17518a);
        this.f3103h.s(c0512u, 4);
    }

    @Override // b4.G.b
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public G.c j(I i9, long j9, long j10, IOException iOException, int i10) {
        C0512u c0512u = new C0512u(i9.f17518a, i9.f17519c, i9.f(), i9.d(), j9, j10, i9.b());
        long jC = this.f3099d.c(new F.c(c0512u, new C0515x(i9.f17520d), iOException, i10));
        boolean z9 = jC == -9223372036854775807L;
        this.f3103h.w(c0512u, i9.f17520d, iOException, z9);
        if (z9) {
            this.f3099d.d(i9.f17518a);
        }
        return z9 ? G.f17501g : G.h(false, jC);
    }

    public final void Q(Uri uri, f fVar) {
        if (uri.equals(this.f3108m)) {
            if (this.f3109n == null) {
                this.f3110o = !fVar.f3139o;
                this.f3111p = fVar.f3132h;
            }
            this.f3109n = fVar;
            this.f3106k.M(fVar);
        }
        Iterator it = this.f3101f.iterator();
        while (it.hasNext()) {
            ((k.b) it.next()).e();
        }
    }

    @Override // J3.k
    public void a(Uri uri, J.a aVar, k.e eVar) {
        this.f3105j = k0.x();
        this.f3103h = aVar;
        this.f3106k = eVar;
        I i9 = new I(this.f3097a.a(4), uri, 4, this.f3098c.b());
        AbstractC1684a.g(this.f3104i == null);
        G g9 = new G("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f3104i = g9;
        aVar.y(new C0512u(i9.f17518a, i9.f17519c, g9.n(i9, this, this.f3099d.b(i9.f17520d))), i9.f17520d);
    }

    @Override // J3.k
    public void b(k.b bVar) {
        AbstractC1684a.e(bVar);
        this.f3101f.add(bVar);
    }

    @Override // J3.k
    public void c(Uri uri) throws IOException {
        ((C0051c) this.f3100e.get(uri)).q();
    }

    @Override // J3.k
    public long d() {
        return this.f3111p;
    }

    @Override // J3.k
    public g e() {
        return this.f3107l;
    }

    @Override // J3.k
    public void f(k.b bVar) {
        this.f3101f.remove(bVar);
    }

    @Override // J3.k
    public void g(Uri uri) {
        ((C0051c) this.f3100e.get(uri)).n();
    }

    @Override // J3.k
    public boolean h(Uri uri) {
        return ((C0051c) this.f3100e.get(uri)).l();
    }

    @Override // J3.k
    public boolean i() {
        return this.f3110o;
    }

    @Override // J3.k
    public boolean k(Uri uri, long j9) {
        if (((C0051c) this.f3100e.get(uri)) != null) {
            return !r2.h(j9);
        }
        return false;
    }

    @Override // J3.k
    public void l() throws IOException {
        G g9 = this.f3104i;
        if (g9 != null) {
            g9.a();
        }
        Uri uri = this.f3108m;
        if (uri != null) {
            c(uri);
        }
    }

    @Override // J3.k
    public f m(Uri uri, boolean z9) {
        f fVarK = ((C0051c) this.f3100e.get(uri)).k();
        if (fVarK != null && z9) {
            L(uri);
        }
        return fVarK;
    }

    @Override // J3.k
    public void stop() {
        this.f3108m = null;
        this.f3109n = null;
        this.f3107l = null;
        this.f3111p = -9223372036854775807L;
        this.f3104i.l();
        this.f3104i = null;
        Iterator it = this.f3100e.values().iterator();
        while (it.hasNext()) {
            ((C0051c) it.next()).w();
        }
        this.f3105j.removeCallbacksAndMessages(null);
        this.f3105j = null;
        this.f3100e.clear();
    }
}
