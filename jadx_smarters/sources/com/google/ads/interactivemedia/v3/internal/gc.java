package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
final class gc extends AbstractC1301h implements az {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f22939d = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f22940A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f22941B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f22942C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f22943D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private hl f22944E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private aw f22945F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private al f22946G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private AudioTrack f22947H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private Object f22948I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private Surface f22949J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private SurfaceHolder f22950K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f22951L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f22952M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f22953N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f22954O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f22955P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private C1295f f22956Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private float f22957R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f22958S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f22959T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f22960U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private C1313l f22961V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private al f22962W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private hb f22963X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private int f22964Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private long f22965Z;
    private final fk aa;
    private ui ab;
    private final agp ac;
    private final ht ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final wk f22966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final aw f22967c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f22968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final az f22969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final hh[] f22970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final wj f22971h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final bv f22972i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final gm f22973j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ca f22974k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final CopyOnWriteArraySet f22975l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final bc f22976m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f22977n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f22978o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final hu f22979p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Looper f22980q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final wq f22981r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final bn f22982s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final fy f22983t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ga f22984u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ej f22985v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final en f22986w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final hs f22987x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ht f22988y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final long f22989z;

    static {
        aj.b("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.google.ads.interactivemedia.v3.internal.ax, com.google.ads.interactivemedia.v3.internal.hu, com.google.ads.interactivemedia.v3.internal.wp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7, types: [com.google.ads.interactivemedia.v3.internal.hk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.ads.interactivemedia.v3.internal.wq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [byte[], com.google.ads.interactivemedia.v3.internal.f] */
    @SuppressLint({"HandlerLeak"})
    public gc(fa faVar, az azVar) {
        Object obj;
        int iE;
        agp agpVar = new agp();
        this.ac = agpVar;
        try {
            cd.d("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.0.0-beta02] [" + cq.f22644e + "]");
            Context applicationContext = faVar.f22876a.getApplicationContext();
            this.f22968e = applicationContext;
            ?? A9 = faVar.f22883h.a(faVar.f22877b);
            this.f22979p = A9;
            this.f22956Q = faVar.f22885j;
            this.f22952M = 1;
            this.f22958S = false;
            this.f22989z = 2000L;
            fy fyVar = new fy(this);
            this.f22983t = fyVar;
            ga gaVar = new ga(null);
            this.f22984u = gaVar;
            Handler handler = new Handler(faVar.f22884i);
            hh[] hhVarArrA = ((ex) faVar.f22878c).f22867a.a(handler, fyVar, fyVar);
            this.f22970g = hhVarArrA;
            int length = hhVarArrA.length;
            af.w(true);
            wj wjVar = (wj) faVar.f22880e.a();
            this.f22971h = wjVar;
            faVar.f22879d.a();
            ?? A10 = faVar.f22882g.a();
            this.f22981r = A10;
            this.f22978o = true;
            this.f22944E = faVar.f22888m;
            Looper looper = faVar.f22884i;
            this.f22980q = looper;
            bn bnVar = faVar.f22877b;
            this.f22982s = bnVar;
            this.f22969f = azVar;
            this.f22974k = new ca(looper, bnVar, new by() { // from class: com.google.ads.interactivemedia.v3.internal.fj
                @Override // com.google.ads.interactivemedia.v3.internal.by
                public final void a(Object obj2, C1328q c1328q) {
                }
            });
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.f22975l = copyOnWriteArraySet;
            this.f22977n = new ArrayList();
            this.ab = new ui();
            int length2 = hhVarArrA.length;
            wk wkVar = new wk(new hj[2], new we[2], bk.f21593a, null);
            this.f22966b = wkVar;
            this.f22976m = new bc();
            av avVar = new av();
            avVar.d(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28);
            wjVar.k();
            avVar.e(29, true);
            aw awVarA = avVar.a();
            this.f22967c = awVarA;
            av avVar2 = new av();
            avVar2.c(awVarA);
            avVar2.b(4);
            avVar2.b(10);
            this.f22945F = avVar2.a();
            this.f22972i = bnVar.b(looper, null);
            fk fkVar = new fk(this);
            this.aa = fkVar;
            this.f22963X = hb.g(wkVar);
            A9.R(azVar, looper);
            int i9 = cq.f22640a;
            this.f22973j = new gm(hhVarArrA, wjVar, wkVar, (es) faVar.f22881f.a(), A10, A9, this.f22944E, faVar.f22895t, 500L, looper, bnVar, fkVar, i9 < 31 ? new iw() : fu.a(applicationContext, this, true));
            this.f22957R = 1.0f;
            al alVar = al.f20083a;
            this.f22946G = alVar;
            this.f22962W = alVar;
            this.f22964Y = -1;
            if (i9 < 21) {
                AudioTrack audioTrack = this.f22947H;
                if (audioTrack == null || audioTrack.getAudioSessionId() == 0) {
                    obj = null;
                } else {
                    this.f22947H.release();
                    obj = null;
                    this.f22947H = null;
                }
                if (this.f22947H == null) {
                    this.f22947H = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                iE = this.f22947H.getAudioSessionId();
            } else {
                obj = null;
                iE = cq.e(applicationContext);
            }
            this.f22955P = iE;
            bm bmVar = bm.f21685a;
            this.f22959T = true;
            N(A9);
            A10.g(new Handler(looper), A9);
            copyOnWriteArraySet.add(fyVar);
            ?? r32 = obj;
            ej ejVar = new ej(faVar.f22876a, handler, fyVar);
            this.f22985v = ejVar;
            ejVar.a();
            en enVar = new en(faVar.f22876a, handler, fyVar);
            this.f22986w = enVar;
            enVar.e(r32);
            hs hsVar = new hs(faVar.f22876a, handler, fyVar);
            this.f22987x = hsVar;
            int i10 = this.f22956Q.f22873c;
            hsVar.f(3);
            ht htVar = new ht(faVar.f22876a, r32);
            this.ad = htVar;
            htVar.c();
            ht htVar2 = new ht(faVar.f22876a);
            this.f22988y = htVar2;
            htVar2.a();
            this.f22961V = aj(hsVar);
            wjVar.h(this.f22956Q);
            ao(1, 10, Integer.valueOf(this.f22955P));
            ao(2, 10, Integer.valueOf(this.f22955P));
            ao(1, 3, this.f22956Q);
            ao(2, 4, Integer.valueOf(this.f22952M));
            ao(2, 5, 0);
            ao(1, 9, Boolean.valueOf(this.f22958S));
            ao(2, 7, gaVar);
            ao(6, 8, gaVar);
            agpVar.f();
        } catch (Throwable th) {
            this.ac.f();
            throw th;
        }
    }

    public static /* bridge */ /* synthetic */ void I(gc gcVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        gcVar.ap(surface);
        gcVar.f22949J = surface;
    }

    private final int ad() {
        if (this.f22963X.f23132a.p()) {
            return this.f22964Y;
        }
        hb hbVar = this.f22963X;
        return hbVar.f23132a.n(hbVar.f23133b.f20173a, this.f22976m).f21037c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ae(boolean z9, int i9) {
        return (!z9 || i9 == 1) ? 1 : 2;
    }

    private final long af(hb hbVar) {
        return hbVar.f23132a.p() ? cq.t(this.f22965Z) : hbVar.f23133b.b() ? hbVar.f23149r : ah(hbVar.f23132a, hbVar.f23133b, hbVar.f23149r);
    }

    private static long ag(hb hbVar) {
        bd bdVar = new bd();
        bc bcVar = new bc();
        hbVar.f23132a.n(hbVar.f23133b.f20173a, bcVar);
        long j9 = hbVar.f23134c;
        return j9 == -9223372036854775807L ? hbVar.f23132a.o(bcVar.f21037c, bdVar).f21074m : bcVar.f21039e + j9;
    }

    private final long ah(be beVar, te teVar, long j9) {
        beVar.n(teVar.f20173a, this.f22976m);
        return j9 + this.f22976m.f21039e;
    }

    private final Pair ai(be beVar, int i9, long j9) {
        if (beVar.p()) {
            this.f22964Y = i9;
            if (j9 == -9223372036854775807L) {
                j9 = 0;
            }
            this.f22965Z = j9;
            return null;
        }
        if (i9 == -1 || i9 >= beVar.c()) {
            i9 = beVar.g(false);
            j9 = beVar.o(i9, this.f23118a).a();
        }
        return beVar.k(this.f23118a, this.f22976m, i9, cq.t(j9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C1313l aj(hs hsVar) {
        return new C1313l(hsVar.b(), hsVar.a());
    }

    private final hb ak(hb hbVar, be beVar, Pair pair) {
        long jF;
        hb hbVarB;
        af.u(beVar.p() || pair != null);
        be beVar2 = hbVar.f23132a;
        hb hbVarF = hbVar.f(beVar);
        if (beVar.p()) {
            te teVarH = hb.h();
            long jT = cq.t(this.f22965Z);
            hb hbVarA = hbVarF.b(teVarH, jT, jT, jT, 0L, um.f24748a, this.f22966b, avo.o()).a(teVarH);
            hbVarA.f23147p = hbVarA.f23149r;
            return hbVarA;
        }
        Object obj = hbVarF.f23133b.f20173a;
        int i9 = cq.f22640a;
        boolean z9 = !obj.equals(pair.first);
        te teVar = z9 ? new te(pair.first) : hbVarF.f23133b;
        long jLongValue = ((Long) pair.second).longValue();
        long jT2 = cq.t(l());
        if (!beVar2.p()) {
            jT2 -= beVar2.n(obj, this.f22976m).f21039e;
        }
        if (z9 || jLongValue < jT2) {
            af.w(!teVar.b());
            hb hbVarA2 = hbVarF.b(teVar, jLongValue, jLongValue, jLongValue, 0L, z9 ? um.f24748a : hbVarF.f23139h, z9 ? this.f22966b : hbVarF.f23140i, z9 ? avo.o() : hbVarF.f23141j).a(teVar);
            hbVarA2.f23147p = jLongValue;
            return hbVarA2;
        }
        if (jLongValue == jT2) {
            int iA = beVar.a(hbVarF.f23142k.f20173a);
            if (iA != -1 && beVar.m(iA, this.f22976m).f21037c == beVar.n(teVar.f20173a, this.f22976m).f21037c) {
                return hbVarF;
            }
            beVar.n(teVar.f20173a, this.f22976m);
            jF = teVar.b() ? this.f22976m.f(teVar.f20174b, teVar.f20175c) : this.f22976m.f21038d;
            hbVarB = hbVarF.b(teVar, hbVarF.f23149r, hbVarF.f23149r, hbVarF.f23135d, jF - hbVarF.f23149r, hbVarF.f23139h, hbVarF.f23140i, hbVarF.f23141j).a(teVar);
        } else {
            af.w(!teVar.b());
            long jMax = Math.max(0L, hbVarF.f23148q - (jLongValue - jT2));
            jF = hbVarF.f23147p;
            if (hbVarF.f23142k.equals(hbVarF.f23133b)) {
                jF = jLongValue + jMax;
            }
            hbVarB = hbVarF.b(teVar, jLongValue, jLongValue, jLongValue, jMax, hbVarF.f23139h, hbVarF.f23140i, hbVarF.f23141j);
        }
        hbVarB.f23147p = jF;
        return hbVarB;
    }

    private final he al(hd hdVar) {
        int iAd = ad();
        gm gmVar = this.f22973j;
        return new he(gmVar, hdVar, this.f22963X.f23132a, iAd == -1 ? 0 : iAd, this.f22982s, gmVar.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void am(final int i9, final int i10) {
        if (i9 == this.f22953N && i10 == this.f22954O) {
            return;
        }
        this.f22953N = i9;
        this.f22954O = i10;
        this.f22974k.g(24, new bx() { // from class: com.google.ads.interactivemedia.v3.internal.fm
            @Override // com.google.ads.interactivemedia.v3.internal.bx
            public final void a(Object obj) {
                int i11 = i9;
                int i12 = i10;
                int i13 = gc.f22939d;
                ((ax) obj).r(i11, i12);
            }
        });
    }

    private final void an() {
        SurfaceHolder surfaceHolder = this.f22950K;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f22983t);
            this.f22950K = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ao(int i9, int i10, Object obj) {
        hh[] hhVarArr = this.f22970g;
        int length = hhVarArr.length;
        for (int i11 = 0; i11 < 2; i11++) {
            hh hhVar = hhVarArr[i11];
            if (hhVar.b() == i9) {
                he heVarAl = al(hhVar);
                heVarAl.n(i10);
                heVarAl.m(obj);
                heVarAl.l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ap(Object obj) {
        ArrayList arrayList = new ArrayList();
        hh[] hhVarArr = this.f22970g;
        int length = hhVarArr.length;
        boolean z9 = false;
        for (int i9 = 0; i9 < 2; i9++) {
            hh hhVar = hhVarArr[i9];
            if (hhVar.b() == 2) {
                he heVarAl = al(hhVar);
                heVarAl.n(1);
                heVarAl.m(obj);
                heVarAl.l();
                arrayList.add(heVarAl);
            }
        }
        Object obj2 = this.f22948I;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((he) it.next()).j(this.f22989z);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z9 = true;
            }
            Object obj3 = this.f22948I;
            Surface surface = this.f22949J;
            if (obj3 == surface) {
                surface.release();
                this.f22949J = null;
            }
        }
        this.f22948I = obj;
        if (z9) {
            av(ev.d(new gn(3), 1003));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void aq(boolean z9, int i9, int i10) {
        int i11 = 0;
        boolean z10 = z9 && i9 != -1;
        if (z10 && i9 != 1) {
            i11 = 1;
        }
        hb hbVar = this.f22963X;
        if (hbVar.f23143l == z10 && hbVar.f23144m == i11) {
            return;
        }
        this.f22940A++;
        hb hbVarC = hbVar.c(z10, i11);
        this.f22973j.n(z10, i11);
        ar(hbVarC, 0, i10, false, false, 5, -9223372036854775807L, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ar(final com.google.ads.interactivemedia.v3.internal.hb r39, final int r40, final int r41, boolean r42, boolean r43, int r44, long r45, int r47) {
        /*
            Method dump skipped, instruction units count: 995
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.gc.ar(com.google.ads.interactivemedia.v3.internal.hb, int, int, boolean, boolean, int, long, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void as() {
        ht htVar;
        int iJ = j();
        if (iJ == 2 || iJ == 3) {
            at();
            boolean z9 = this.f22963X.f23146o;
            ht htVar2 = this.ad;
            q();
            htVar2.d();
            htVar = this.f22988y;
            q();
        } else {
            this.ad.d();
            htVar = this.f22988y;
        }
        htVar.b();
    }

    private final void at() {
        this.ac.d();
        if (Thread.currentThread() != this.f22980q.getThread()) {
            String strH = cq.H("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.f22980q.getThread().getName());
            if (this.f22959T) {
                throw new IllegalStateException(strH);
            }
            cd.f("ExoPlayerImpl", strH, this.f22960U ? null : new IllegalStateException());
            this.f22960U = true;
        }
    }

    private static boolean au(hb hbVar) {
        return hbVar.f23136e == 3 && hbVar.f23143l && hbVar.f23144m == 0;
    }

    private final void av(ev evVar) {
        hb hbVar = this.f22963X;
        hb hbVarA = hbVar.a(hbVar.f23133b);
        hbVarA.f23147p = hbVarA.f23149r;
        hbVarA.f23148q = 0L;
        hb hbVarE = hbVarA.e(1);
        if (evVar != null) {
            hbVarE = hbVarE.d(evVar);
        }
        hb hbVar2 = hbVarE;
        this.f22940A++;
        this.f22973j.o();
        ar(hbVar2, 0, 1, false, hbVar2.f23132a.p() && !this.f22963X.f23132a.p(), 4, af(hbVar2), -1);
    }

    public final ev A() {
        at();
        return this.f22963X.f23137f;
    }

    public final void M(hw hwVar) {
        hu huVar = this.f22979p;
        af.s(hwVar);
        huVar.v(hwVar);
    }

    public final void N(ax axVar) {
        ca caVar = this.f22974k;
        af.s(axVar);
        caVar.b(axVar);
    }

    public final /* synthetic */ void O(gj gjVar) {
        long j9;
        boolean z9;
        long jAh;
        int i9 = this.f22940A - gjVar.f23007b;
        this.f22940A = i9;
        boolean z10 = true;
        if (gjVar.f23008c) {
            this.f22941B = gjVar.f23009d;
            this.f22942C = true;
        }
        if (gjVar.f23010e) {
            this.f22943D = gjVar.f23011f;
        }
        if (i9 == 0) {
            be beVar = gjVar.f23006a.f23132a;
            if (!this.f22963X.f23132a.p() && beVar.p()) {
                this.f22964Y = -1;
                this.f22965Z = 0L;
            }
            if (!beVar.p()) {
                List listA = ((hf) beVar).A();
                af.w(listA.size() == this.f22977n.size());
                for (int i10 = 0; i10 < listA.size(); i10++) {
                    ((gb) this.f22977n.get(i10)).f22938b = (be) listA.get(i10);
                }
            }
            if (this.f22942C) {
                if (gjVar.f23006a.f23133b.equals(this.f22963X.f23133b) && gjVar.f23006a.f23135d == this.f22963X.f23149r) {
                    z10 = false;
                }
                if (z10) {
                    if (beVar.p() || gjVar.f23006a.f23133b.b()) {
                        jAh = gjVar.f23006a.f23135d;
                    } else {
                        hb hbVar = gjVar.f23006a;
                        jAh = ah(beVar, hbVar.f23133b, hbVar.f23135d);
                    }
                    j9 = jAh;
                } else {
                    j9 = -9223372036854775807L;
                }
                z9 = z10;
            } else {
                j9 = -9223372036854775807L;
                z9 = false;
            }
            this.f22942C = false;
            ar(gjVar.f23006a, 1, this.f22943D, false, z9, this.f22941B, j9, -1);
        }
    }

    public final /* synthetic */ void P(final gj gjVar) {
        this.f22972i.e(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.fl
            @Override // java.lang.Runnable
            public final void run() {
                this.f22908a.O(gjVar);
            }
        });
    }

    public final /* synthetic */ void Q(ax axVar) {
        axVar.a(this.f22945F);
    }

    @Deprecated
    public final void S(tg tgVar) {
        at();
        at();
        List listSingletonList = Collections.singletonList(tgVar);
        at();
        at();
        ad();
        m();
        this.f22940A++;
        if (!this.f22977n.isEmpty()) {
            int size = this.f22977n.size();
            for (int i9 = size - 1; i9 >= 0; i9--) {
                this.f22977n.remove(i9);
            }
            this.ab = this.ab.h(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < listSingletonList.size(); i10++) {
            gy gyVar = new gy((tg) listSingletonList.get(i10), this.f22978o);
            arrayList.add(gyVar);
            this.f22977n.add(i10, new gb(gyVar.f23114b, gyVar.f23113a.k()));
        }
        this.ab = this.ab.g(0, arrayList.size());
        hf hfVar = new hf(this.f22977n, this.ab);
        if (!hfVar.p() && hfVar.c() < 0) {
            throw new C1336t();
        }
        int iG = hfVar.g(false);
        hb hbVarAk = ak(this.f22963X, hfVar, ai(hfVar, iG, -9223372036854775807L));
        int i11 = hbVarAk.f23136e;
        if (iG != -1 && i11 != 1) {
            i11 = (hfVar.p() || iG >= hfVar.c()) ? 4 : 2;
        }
        hb hbVarE = hbVarAk.e(i11);
        this.f22973j.q(arrayList, iG, cq.t(-9223372036854775807L), this.ab);
        ar(hbVarE, 0, 1, false, (this.f22963X.f23133b.f20173a.equals(hbVarE.f23133b.f20173a) || this.f22963X.f23132a.p()) ? false : true, 4, af(hbVarE), -1);
        at();
        boolean zQ = q();
        int iB = this.f22986w.b(zQ, 2);
        aq(zQ, iB, ae(zQ, iB));
        hb hbVar = this.f22963X;
        if (hbVar.f23136e != 1) {
            return;
        }
        hb hbVarD = hbVar.d(null);
        hb hbVarE2 = hbVarD.e(true == hbVarD.f23132a.p() ? 4 : 2);
        this.f22940A++;
        this.f22973j.k();
        ar(hbVarE2, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    public final void T() {
        AudioTrack audioTrack;
        cd.d("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.0.0-beta02] [" + cq.f22644e + "] [" + aj.a() + "]");
        at();
        if (cq.f22640a < 21 && (audioTrack = this.f22947H) != null) {
            audioTrack.release();
            this.f22947H = null;
        }
        this.f22985v.a();
        this.f22987x.e();
        this.ad.d();
        this.f22988y.b();
        this.f22986w.d();
        if (!this.f22973j.p()) {
            this.f22974k.g(10, fs.f22920b);
        }
        this.f22974k.e();
        this.f22972i.f();
        this.f22981r.h(this.f22979p);
        hb hbVarE = this.f22963X.e(1);
        this.f22963X = hbVarE;
        hb hbVarA = hbVarE.a(hbVarE.f23133b);
        this.f22963X = hbVarA;
        hbVarA.f23147p = hbVarA.f23149r;
        this.f22963X.f23148q = 0L;
        this.f22979p.P();
        this.f22971h.g();
        an();
        Surface surface = this.f22949J;
        if (surface != null) {
            surface.release();
            this.f22949J = null;
        }
        bm bmVar = bm.f21685a;
    }

    public final void U(hw hwVar) {
        hu huVar = this.f22979p;
        af.s(hwVar);
        huVar.Q(hwVar);
    }

    public final void V(ax axVar) {
        af.s(axVar);
        this.f22974k.f(axVar);
    }

    public final void W(boolean z9) {
        at();
        int iB = this.f22986w.b(z9, j());
        aq(z9, iB, ae(z9, iB));
    }

    public final void X(SurfaceHolder surfaceHolder) {
        at();
        if (surfaceHolder == null) {
            at();
            an();
            ap(null);
            am(0, 0);
            return;
        }
        an();
        this.f22951L = true;
        this.f22950K = surfaceHolder;
        surfaceHolder.addCallback(this.f22983t);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            ap(null);
            am(0, 0);
        } else {
            ap(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            am(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void Y(SurfaceView surfaceView) {
        at();
        X(surfaceView == null ? null : surfaceView.getHolder());
    }

    public final void Z() {
        at();
        at();
        this.f22986w.b(q(), 1);
        av(null);
        avo avoVarO = avo.o();
        long j9 = this.f22963X.f23149r;
        new bm(avoVarO);
    }

    public final void ac() {
        at();
        an();
        ap(null);
        am(0, 0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.az
    public final int f() {
        at();
        if (r()) {
            return this.f22963X.f23133b.f20174b;
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.az
    public final int g() {
        at();
        if (r()) {
            return this.f22963X.f23133b.f20175c;
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.az
    public final int h() {
        at();
        int iAd = ad();
        if (iAd == -1) {
            return 0;
        }
        return iAd;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.az
    public final int i() {
        at();
        if (this.f22963X.f23132a.p()) {
            return 0;
        }
        hb hbVar = this.f22963X;
        return hbVar.f23132a.a(hbVar.f23133b.f20173a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.az
    public final int j() {
        at();
        return this.f22963X.f23136e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.az
    public final int k() {
        at();
        return this.f22963X.f23144m;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.az
    public final long l() {
        at();
        if (!r()) {
            return m();
        }
        hb hbVar = this.f22963X;
        hbVar.f23132a.n(hbVar.f23133b.f20173a, this.f22976m);
        hb hbVar2 = this.f22963X;
        return hbVar2.f23134c == -9223372036854775807L ? hbVar2.f23132a.o(h(), this.f23118a).a() : this.f22976m.g() + cq.x(this.f22963X.f23134c);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.az
    public final long m() {
        at();
        return cq.x(af(this.f22963X));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.az
    public final long n() {
        at();
        return cq.x(this.f22963X.f23148q);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.az
    public final be o() {
        at();
        return this.f22963X.f23132a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.az
    public final bk p() {
        at();
        return this.f22963X.f23140i.f24979d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.az
    public final boolean q() {
        at();
        return this.f22963X.f23143l;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.az
    public final boolean r() {
        at();
        return this.f22963X.f23133b.b();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.az
    public final void s() {
        at();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.az
    public final void t() {
        at();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.az
    public final void u(int i9) {
        at();
        this.f22979p.w();
        be beVar = this.f22963X.f23132a;
        if (i9 < 0 || (!beVar.p() && i9 >= beVar.c())) {
            throw new C1336t();
        }
        this.f22940A++;
        if (r()) {
            cd.e("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            gj gjVar = new gj(this.f22963X);
            gjVar.a(1);
            this.aa.a(gjVar);
            return;
        }
        int i10 = j() != 1 ? 2 : 1;
        int iH = h();
        hb hbVarAk = ak(this.f22963X.e(i10), beVar, ai(beVar, i9, 0L));
        this.f22973j.l(beVar, i9, cq.t(0L));
        ar(hbVarAk, 0, 1, true, true, 1, af(hbVarAk), iH);
    }

    public final long w() {
        at();
        if (r()) {
            hb hbVar = this.f22963X;
            te teVar = hbVar.f23133b;
            hbVar.f23132a.n(teVar.f20173a, this.f22976m);
            return cq.x(this.f22976m.f(teVar.f20174b, teVar.f20175c));
        }
        be beVarO = o();
        if (beVarO.p()) {
            return -9223372036854775807L;
        }
        return beVarO.o(h(), this.f23118a).b();
    }
}
