package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class lh extends sa {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f23635A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f23636B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final lf f23637C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final ly f23638D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final aeq f23639E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final ws f23640F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final ws f23641G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ai f23642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cx f23643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nt f23644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f23645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final tj f23646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final xe f23647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f23648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final SparseArray f23649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f23650i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f23651j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final lp f23652k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final xd f23653l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private cy f23654m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private xc f23655n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private dw f23656o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private IOException f23657p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Handler f23658q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ac f23659r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Uri f23660s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Uri f23661t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private lu f23662u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f23663v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f23664w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f23665x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f23666y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f23667z;

    static {
        aj.b("media3.exoplayer.dash");
    }

    public /* synthetic */ lh(ai aiVar, cx cxVar, xe xeVar, aeq aeqVar, ws wsVar, nt ntVar, ws wsVar2, long j9, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f23642a = aiVar;
        this.f23659r = aiVar.f19816c;
        ad adVar = aiVar.f19815b;
        af.s(adVar);
        this.f23660s = adVar.f19027a;
        this.f23661t = aiVar.f19815b.f19027a;
        this.f23662u = null;
        this.f23643b = cxVar;
        this.f23647f = xeVar;
        this.f23639E = aeqVar;
        this.f23644c = ntVar;
        this.f23640F = wsVar2;
        this.f23645d = 30000L;
        this.f23641G = wsVar;
        this.f23638D = new ly();
        this.f23646e = x(null);
        this.f23648g = new Object();
        this.f23649h = new SparseArray();
        this.f23652k = new lb(this);
        this.f23635A = -9223372036854775807L;
        this.f23666y = -9223372036854775807L;
        this.f23637C = new lf(this, 1);
        this.f23653l = new le(this);
        this.f23650i = new ky(this, 0);
        this.f23651j = new ky(this, 2);
    }

    private final void N() {
        xm.f(this.f23655n, new kz(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(IOException iOException) {
        cd.c("DashMediaSource", "Failed to resolve time offset.", iOException);
        Q(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(long j9) {
        this.f23666y = j9;
        Q(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a0 A[PHI: r5
      0x01a0: PHI (r5v32 long) = (r5v21 long), (r5v25 long) binds: [B:72:0x019e, B:77:0x01af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e5 A[PHI: r1
      0x01e5: PHI (r1v41 long) = (r1v31 long), (r1v34 long) binds: [B:90:0x01e3, B:96:0x01fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Q(boolean r38) {
        /*
            Method dump skipped, instruction units count: 986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.lh.Q(boolean):void");
    }

    private final void R(mo moVar, xe xeVar) {
        T(new xf(this.f23654m, Uri.parse(moVar.f23809b), 5, xeVar), new lf(this, 0), 1);
    }

    private final void S(long j9) {
        this.f23658q.postDelayed(this.f23650i, j9);
    }

    private final void T(xf xfVar, ww wwVar, int i9) {
        this.f23655n.b(xfVar, wwVar, i9);
        this.f23646e.j(new sw(xfVar.f25043b), xfVar.f25044c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U() {
        Uri uri;
        this.f23658q.removeCallbacks(this.f23650i);
        if (this.f23655n.l()) {
            return;
        }
        if (this.f23655n.m()) {
            this.f23663v = true;
            return;
        }
        synchronized (this.f23648g) {
            uri = this.f23660s;
        }
        this.f23663v = false;
        T(new xf(this.f23654m, uri, 4, this.f23647f), this.f23637C, ws.c(4));
    }

    private static boolean V(lz lzVar) {
        for (int i9 = 0; i9 < lzVar.f23761c.size(); i9++) {
            int i10 = ((ls) lzVar.f23761c.get(i9)).f23716b;
            if (i10 == 1 || i10 == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tg
    public final ai a() {
        return this.f23642a;
    }

    public final /* synthetic */ void g() {
        Q(false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tg
    public final void h() throws IOException {
        this.f23653l.a();
    }

    public final void i(long j9) {
        long j10 = this.f23635A;
        if (j10 == -9223372036854775807L || j10 < j9) {
            this.f23635A = j9;
        }
    }

    public final void j() {
        this.f23658q.removeCallbacks(this.f23651j);
        U();
    }

    public final void k(xf xfVar, long j9, long j10) {
        long j11 = xfVar.f25042a;
        xfVar.c();
        xfVar.f();
        xfVar.a();
        this.f23646e.d(new sw(), xfVar.f25044c);
    }

    public final void l(xf xfVar, long j9, long j10) {
        long j11 = xfVar.f25042a;
        xfVar.c();
        xfVar.f();
        xfVar.a();
        this.f23646e.f(new sw(), xfVar.f25044c);
        lu luVar = (lu) xfVar.d();
        lu luVar2 = this.f23662u;
        int iA = luVar2 == null ? 0 : luVar2.a();
        long j12 = luVar.d(0).f23760b;
        int i9 = 0;
        while (i9 < iA && this.f23662u.d(i9).f23760b < j12) {
            i9++;
        }
        if (luVar.f23728d) {
            if (iA - i9 > luVar.a()) {
                cd.e("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j13 = this.f23635A;
                if (j13 != -9223372036854775807L) {
                    long j14 = luVar.f23732h;
                    if (1000 * j14 <= j13) {
                        cd.e("DashMediaSource", "Loaded stale dynamic manifest: " + j14 + ", " + j13);
                    }
                }
                this.f23667z = 0;
            }
            int i10 = this.f23667z;
            this.f23667z = i10 + 1;
            if (i10 < ws.c(xfVar.f25044c)) {
                S(Math.min((this.f23667z - 1) * 1000, 5000));
                return;
            } else {
                this.f23657p = new kv();
                return;
            }
        }
        this.f23662u = luVar;
        this.f23663v = luVar.f23728d & this.f23663v;
        this.f23664w = j9 - j10;
        this.f23665x = j9;
        synchronized (this.f23648g) {
            try {
                if (xfVar.f25043b.f22688a == this.f23660s) {
                    Uri uriC = this.f23662u.f23735k;
                    if (uriC == null) {
                        uriC = xfVar.c();
                    }
                    this.f23660s = uriC;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (iA != 0) {
            this.f23636B += i9;
            Q(true);
            return;
        }
        lu luVar3 = this.f23662u;
        if (!luVar3.f23728d) {
            Q(true);
            return;
        }
        mo moVar = luVar3.f23733i;
        if (moVar == null) {
            N();
            return;
        }
        String str = moVar.f23808a;
        if (cq.V(str, "urn:mpeg:dash:utc:direct:2014") || cq.V(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                P(cq.u(moVar.f23809b) - this.f23665x);
                return;
            } catch (as e9) {
                O(e9);
                return;
            }
        }
        if (cq.V(str, "urn:mpeg:dash:utc:http-iso:2014") || cq.V(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            R(moVar, new ld());
            return;
        }
        if (cq.V(str, "urn:mpeg:dash:utc:http-xsdate:2014") || cq.V(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            R(moVar, new lg(null));
        } else if (cq.V(str, "urn:mpeg:dash:utc:ntp:2014") || cq.V(str, "urn:mpeg:dash:utc:ntp:2012")) {
            N();
        } else {
            O(new IOException("Unsupported UTC timing scheme"));
        }
    }

    public final void m(xf xfVar, long j9, long j10) {
        long j11 = xfVar.f25042a;
        xfVar.c();
        xfVar.f();
        xfVar.a();
        this.f23646e.f(new sw(), xfVar.f25044c);
        P(((Long) xfVar.d()).longValue() - j9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sa
    public final void n(dw dwVar) {
        this.f23656o = dwVar;
        this.f23644c.o();
        this.f23644c.q(Looper.myLooper(), u());
        this.f23654m = ((df) this.f23643b).a();
        this.f23655n = new xc("DashMediaSource");
        this.f23658q = cq.A();
        U();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tg
    public final void o(td tdVar) {
        kx kxVar = (kx) tdVar;
        kxVar.m();
        this.f23649h.remove(kxVar.f23584a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sa
    public final void p() {
        this.f23663v = false;
        this.f23654m = null;
        xc xcVar = this.f23655n;
        if (xcVar != null) {
            xcVar.j();
            this.f23655n = null;
        }
        this.f23664w = 0L;
        this.f23665x = 0L;
        this.f23662u = null;
        this.f23660s = this.f23661t;
        this.f23657p = null;
        Handler handler = this.f23658q;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f23658q = null;
        }
        this.f23666y = -9223372036854775807L;
        this.f23667z = 0;
        this.f23635A = -9223372036854775807L;
        this.f23636B = 0;
        this.f23649h.clear();
        this.f23638D.e();
        this.f23644c.p();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tg
    public final td q(te teVar, wr wrVar, long j9) {
        int iIntValue = ((Integer) teVar.f20173a).intValue() - this.f23636B;
        tj tjVarY = y(teVar, this.f23662u.d(iIntValue).f23760b);
        kx kxVar = new kx(iIntValue + this.f23636B, this.f23662u, this.f23638D, iIntValue, this.f23639E, this.f23656o, this.f23644c, v(teVar), this.f23640F, tjVarY, this.f23666y, this.f23653l, wrVar, this.f23641G, this.f23652k, u(), null, null, null, null);
        this.f23649h.put(kxVar.f23584a, kxVar);
        return kxVar;
    }

    public final wv r(xf xfVar, long j9, long j10, IOException iOException, int i9) {
        long j11 = xfVar.f25042a;
        xfVar.c();
        xfVar.f();
        xfVar.a();
        sw swVar = new sw();
        long jE = ws.e(new bdz(iOException, i9));
        wv wvVarN = jE == -9223372036854775807L ? xc.f25038c : xc.n(false, jE);
        this.f23646e.h(swVar, xfVar.f25044c, iOException, !wvVarN.a());
        return wvVarN;
    }

    public final wv s(xf xfVar, long j9, long j10, IOException iOException) {
        tj tjVar = this.f23646e;
        long j11 = xfVar.f25042a;
        xfVar.c();
        xfVar.f();
        xfVar.a();
        tjVar.h(new sw(), xfVar.f25044c, iOException, true);
        O(iOException);
        return xc.f25037b;
    }
}
