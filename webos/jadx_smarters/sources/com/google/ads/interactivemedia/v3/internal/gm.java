package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.facebook.ads.AdError;
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

/* JADX INFO: loaded from: classes3.dex */
final class gm implements Handler.Callback, tc, wi, gz, et, hc {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f23024C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f23025D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f23026E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f23027F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private gl f23028G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private long f23029H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f23030I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f23031J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private ev f23032K;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final es f23034M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final fk f23035N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final er f23036O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hh[] f23037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f23038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hi[] f23039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wj f23040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wk f23041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final wq f23042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final bv f23043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HandlerThread f23044h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Looper f23045i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final bd f23046j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final bc f23047k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f23048l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final eu f23049m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList f23050n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final bn f23051o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final gt f23052p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ha f23053q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private hl f23055s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private hb f23056t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private gj f23057u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f23058v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f23060x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f23061y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f23062z;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f23022A = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f23023B = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final long f23054r = 500;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f23059w = false;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private long f23033L = -9223372036854775807L;

    public gm(hh[] hhVarArr, wj wjVar, wk wkVar, es esVar, wq wqVar, hu huVar, hl hlVar, er erVar, long j9, Looper looper, bn bnVar, fk fkVar, iw iwVar) {
        this.f23035N = fkVar;
        this.f23037a = hhVarArr;
        this.f23040d = wjVar;
        this.f23041e = wkVar;
        this.f23034M = esVar;
        this.f23042f = wqVar;
        this.f23055s = hlVar;
        this.f23036O = erVar;
        this.f23051o = bnVar;
        this.f23048l = esVar.a();
        hb hbVarG = hb.g(wkVar);
        this.f23056t = hbVarG;
        this.f23057u = new gj(hbVarG);
        int length = hhVarArr.length;
        this.f23039c = new hi[2];
        for (int i9 = 0; i9 < 2; i9++) {
            hhVarArr[i9].r(i9, iwVar);
            this.f23039c[i9] = hhVarArr[i9].k();
        }
        this.f23049m = new eu(this, bnVar);
        this.f23050n = new ArrayList();
        this.f23038b = axo.f();
        this.f23046j = new bd();
        this.f23047k = new bc();
        wjVar.n(this, wqVar);
        this.f23031J = true;
        Handler handler = new Handler(looper);
        this.f23052p = new gt(huVar, handler);
        this.f23053q = new ha(this, huVar, handler, iwVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f23044h = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f23045i = looper2;
        this.f23043g = bnVar.b(looper2, this);
    }

    private final void A(hh hhVar) throws ev {
        if (ad(hhVar)) {
            this.f23049m.d(hhVar);
            al(hhVar);
            hhVar.o();
            this.f23027F--;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0535  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void B() throws com.google.ads.interactivemedia.v3.internal.ev, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.gm.B():void");
    }

    private final void C() throws ev {
        int length = this.f23037a.length;
        D(new boolean[2]);
    }

    private final void D(boolean[] zArr) throws ev {
        gq gqVarE = this.f23052p.e();
        wk wkVarJ = gqVarE.j();
        int i9 = 0;
        while (true) {
            int length = this.f23037a.length;
            if (i9 >= 2) {
                break;
            }
            if (!wkVarJ.b(i9) && this.f23038b.remove(this.f23037a[i9])) {
                this.f23037a[i9].A();
            }
            i9++;
        }
        int i10 = 0;
        while (true) {
            int length2 = this.f23037a.length;
            if (i10 >= 2) {
                gqVarE.f23071g = true;
                return;
            }
            if (wkVarJ.b(i10)) {
                boolean z9 = zArr[i10];
                hh hhVar = this.f23037a[i10];
                if (!ad(hhVar)) {
                    gq gqVarE2 = this.f23052p.e();
                    boolean z10 = gqVarE2 == this.f23052p.d();
                    wk wkVarJ2 = gqVarE2.j();
                    hj hjVar = wkVarJ2.f24977b[i10];
                    C1333s[] c1333sArrAj = aj(wkVarJ2.f24978c[i10]);
                    boolean z11 = ah() && this.f23056t.f23136e == 3;
                    boolean z12 = !z9 && z11;
                    this.f23027F++;
                    this.f23038b.add(hhVar);
                    hhVar.p(hjVar, c1333sArrAj, gqVarE2.f23067c[i10], this.f23029H, z12, z10, gqVarE2.e(), gqVarE2.d());
                    hhVar.q(11, new gf(this));
                    this.f23049m.e(hhVar);
                    if (z11) {
                        hhVar.E();
                    }
                }
            }
            i10++;
        }
    }

    private final void E(IOException iOException, int i9) {
        ev evVarC = ev.c(iOException, i9);
        gq gqVarD = this.f23052p.d();
        if (gqVarD != null) {
            evVarC = evVarC.a(gqVarD.f23070f.f23080a);
        }
        cd.c("ExoPlayerImplInternal", "Playback error", evVarC);
        V(false, false);
        this.f23056t = this.f23056t.d(evVarC);
    }

    private final void F(boolean z9) {
        gq gqVarC = this.f23052p.c();
        te teVar = gqVarC == null ? this.f23056t.f23133b : gqVarC.f23070f.f23080a;
        boolean z10 = !this.f23056t.f23142k.equals(teVar);
        if (z10) {
            this.f23056t = this.f23056t.a(teVar);
        }
        hb hbVar = this.f23056t;
        hbVar.f23147p = gqVarC == null ? hbVar.f23149r : gqVarC.b();
        this.f23056t.f23148q = t();
        if ((z10 || z9) && gqVarC != null && gqVarC.f23068d) {
            Y(gqVarC.i(), gqVarC.j());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:180:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void G(com.google.ads.interactivemedia.v3.internal.be r37, boolean r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.gm.G(com.google.ads.interactivemedia.v3.internal.be, boolean):void");
    }

    private final void H(au auVar, boolean z9) throws ev {
        I(auVar, auVar.f20739b, true, z9);
    }

    private final void I(au auVar, float f9, boolean z9, boolean z10) throws ev {
        int i9;
        gm gmVar = this;
        if (z9) {
            if (z10) {
                gmVar.f23057u.a(1);
            }
            hb hbVar = gmVar.f23056t;
            gmVar = this;
            gmVar.f23056t = new hb(hbVar.f23132a, hbVar.f23133b, hbVar.f23134c, hbVar.f23135d, hbVar.f23136e, hbVar.f23137f, hbVar.f23138g, hbVar.f23139h, hbVar.f23140i, hbVar.f23141j, hbVar.f23142k, hbVar.f23143l, hbVar.f23144m, auVar, hbVar.f23147p, hbVar.f23148q, hbVar.f23149r, hbVar.f23146o);
        }
        float f10 = auVar.f20739b;
        gq gqVarD = gmVar.f23052p.d();
        while (true) {
            i9 = 0;
            if (gqVarD == null) {
                break;
            }
            we[] weVarArr = gqVarD.j().f24978c;
            int length = weVarArr.length;
            while (i9 < length) {
                we weVar = weVarArr[i9];
                if (weVar != null) {
                    weVar.h(f10);
                }
                i9++;
            }
            gqVarD = gqVarD.h();
        }
        hh[] hhVarArr = gmVar.f23037a;
        int length2 = hhVarArr.length;
        while (i9 < 2) {
            hh hhVar = hhVarArr[i9];
            if (hhVar != null) {
                hhVar.D(f9, auVar.f20739b);
            }
            i9++;
        }
    }

    private final void J() {
        boolean zH;
        if (ac()) {
            gq gqVarC = this.f23052p.c();
            long jU = u(gqVarC.c());
            if (gqVarC == this.f23052p.d()) {
                gqVarC.f(this.f23029H);
            } else {
                gqVarC.f(this.f23029H);
                long j9 = gqVarC.f23070f.f23081b;
            }
            zH = this.f23034M.h(jU, this.f23049m.c().f20739b);
            if (!zH && jU < 500000 && this.f23048l > 0) {
                this.f23052p.d().f23065a.q(this.f23056t.f23149r);
                zH = this.f23034M.h(jU, this.f23049m.c().f20739b);
            }
        } else {
            zH = false;
        }
        this.f23062z = zH;
        if (zH) {
            this.f23052p.c().l(this.f23029H);
        }
        X();
    }

    private final void K() {
        this.f23057u.c(this.f23056t);
        if (this.f23057u.f23012g) {
            this.f23035N.a(this.f23057u);
            this.f23057u = new gj(this.f23056t);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6 A[PHI: r4 r5 r7
      0x00a6: PHI (r4v3 com.google.ads.interactivemedia.v3.internal.te) = (r4v2 com.google.ads.interactivemedia.v3.internal.te), (r4v8 com.google.ads.interactivemedia.v3.internal.te) binds: [B:30:0x0079, B:32:0x009e] A[DONT_GENERATE, DONT_INLINE]
      0x00a6: PHI (r5v3 long) = (r5v2 long), (r5v5 long) binds: [B:30:0x0079, B:32:0x009e] A[DONT_GENERATE, DONT_INLINE]
      0x00a6: PHI (r7v3 long) = (r7v2 long), (r7v5 long) binds: [B:30:0x0079, B:32:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void L(boolean r29, boolean r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.gm.L(boolean, boolean, boolean, boolean):void");
    }

    private final void M() {
        gq gqVarD = this.f23052p.d();
        boolean z9 = false;
        if (gqVarD != null && gqVarD.f23070f.f23087h && this.f23059w) {
            z9 = true;
        }
        this.f23060x = z9;
    }

    private final void N(long j9) throws ev {
        gq gqVarD = this.f23052p.d();
        long jG = gqVarD == null ? j9 + 1000000000000L : gqVarD.g(j9);
        this.f23029H = jG;
        this.f23049m.f(jG);
        hh[] hhVarArr = this.f23037a;
        int length = hhVarArr.length;
        for (int i9 = 0; i9 < 2; i9++) {
            hh hhVar = hhVarArr[i9];
            if (ad(hhVar)) {
                hhVar.B(this.f23029H);
            }
        }
        for (gq gqVarD2 = this.f23052p.d(); gqVarD2 != null; gqVarD2 = gqVarD2.h()) {
            for (we weVar : gqVarD2.j().f24978c) {
            }
        }
    }

    private final void O(be beVar, be beVar2) {
        if (beVar.p() && beVar2.p()) {
            return;
        }
        int size = this.f23050n.size();
        while (true) {
            size--;
            if (size < 0) {
                Collections.sort(this.f23050n);
                return;
            } else if (!ag((gi) this.f23050n.get(size), beVar, beVar2, this.f23022A, this.f23023B, this.f23046j, this.f23047k)) {
                ((gi) this.f23050n.get(size)).f23002a.h(false);
                this.f23050n.remove(size);
            }
        }
    }

    private final void P(long j9, long j10) {
        this.f23043g.i(j9 + j10);
    }

    private final void Q(boolean z9) throws ev {
        te teVar = this.f23052p.d().f23070f.f23080a;
        long jW = w(teVar, this.f23056t.f23149r, true, false);
        if (jW != this.f23056t.f23149r) {
            hb hbVar = this.f23056t;
            this.f23056t = z(teVar, jW, hbVar.f23134c, hbVar.f23135d, z9, 5);
        }
    }

    private final void R(he heVar) throws ev {
        if (heVar.d() != this.f23045i) {
            this.f23043g.b(15, heVar).a();
            return;
        }
        ak(heVar);
        int i9 = this.f23056t.f23136e;
        if (i9 == 3 || i9 == 2) {
            this.f23043g.h(2);
        }
    }

    private final void S(boolean z9, int i9, boolean z10, int i10) throws ev {
        this.f23057u.a(z10 ? 1 : 0);
        this.f23057u.b(i10);
        this.f23056t = this.f23056t.c(z9, i9);
        this.f23061y = false;
        for (gq gqVarD = this.f23052p.d(); gqVarD != null; gqVarD = gqVarD.h()) {
            for (we weVar : gqVarD.j().f24978c) {
            }
        }
        if (!ah()) {
            W();
            Z();
            return;
        }
        int i11 = this.f23056t.f23136e;
        if (i11 == 3) {
            U();
            this.f23043g.h(2);
        } else if (i11 == 2) {
            this.f23043g.h(2);
        }
    }

    private final void T(int i9) {
        hb hbVar = this.f23056t;
        if (hbVar.f23136e != i9) {
            if (i9 != 2) {
                this.f23033L = -9223372036854775807L;
            }
            this.f23056t = hbVar.e(i9);
        }
    }

    private final void U() throws ev {
        this.f23061y = false;
        this.f23049m.h();
        hh[] hhVarArr = this.f23037a;
        int length = hhVarArr.length;
        for (int i9 = 0; i9 < 2; i9++) {
            hh hhVar = hhVarArr[i9];
            if (ad(hhVar)) {
                hhVar.E();
            }
        }
    }

    private final void V(boolean z9, boolean z10) {
        L(z9 || !this.f23024C, false, true, false);
        this.f23057u.a(z10 ? 1 : 0);
        this.f23034M.d();
        T(1);
    }

    private final void W() throws ev {
        this.f23049m.i();
        hh[] hhVarArr = this.f23037a;
        int length = hhVarArr.length;
        for (int i9 = 0; i9 < 2; i9++) {
            hh hhVar = hhVarArr[i9];
            if (ad(hhVar)) {
                al(hhVar);
            }
        }
    }

    private final void X() {
        gq gqVarC = this.f23052p.c();
        boolean z9 = this.f23062z || (gqVarC != null && gqVarC.f23065a.p());
        hb hbVar = this.f23056t;
        if (z9 != hbVar.f23138g) {
            this.f23056t = new hb(hbVar.f23132a, hbVar.f23133b, hbVar.f23134c, hbVar.f23135d, hbVar.f23136e, hbVar.f23137f, z9, hbVar.f23139h, hbVar.f23140i, hbVar.f23141j, hbVar.f23142k, hbVar.f23143l, hbVar.f23144m, hbVar.f23145n, hbVar.f23147p, hbVar.f23148q, hbVar.f23149r, hbVar.f23146o);
        }
    }

    private final void Y(um umVar, wk wkVar) {
        this.f23034M.g(this.f23037a, wkVar.f24978c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
    
        if (r5 < r13.f23050n.size()) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c6, code lost:
    
        r7 = (com.google.ads.interactivemedia.v3.internal.gi) r13.f23050n.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cf, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d0, code lost:
    
        if (r7 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d4, code lost:
    
        if (r7.f23005d == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d6, code lost:
    
        r8 = r7.f23003b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d8, code lost:
    
        if (r8 < r4) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00da, code lost:
    
        if (r8 != r4) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e0, code lost:
    
        if (r7.f23004c > r2) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ea, code lost:
    
        if (r5 >= r13.f23050n.size()) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ed, code lost:
    
        if (r7 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f1, code lost:
    
        if (r7.f23005d == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f5, code lost:
    
        if (r7.f23003b != r4) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f7, code lost:
    
        r8 = r7.f23004c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fb, code lost:
    
        if (r8 <= r2) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ff, code lost:
    
        if (r8 > r0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0101, code lost:
    
        R(r7.f23002a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0106, code lost:
    
        r7.f23002a.i();
        r13.f23050n.remove(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0116, code lost:
    
        if (r5 >= r13.f23050n.size()) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0118, code lost:
    
        r7 = (com.google.ads.interactivemedia.v3.internal.gi) r13.f23050n.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0121, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0123, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0124, code lost:
    
        r7.f23002a.i();
        r13.f23050n.remove(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x012e, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x012f, code lost:
    
        r13.f23030I = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00d0, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00ea -> B:43:0x00c6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Z() throws com.google.ads.interactivemedia.v3.internal.ev {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.gm.Z():void");
    }

    private final void aa(be beVar, te teVar, be beVar2, te teVar2, long j9) {
        if (!ai(beVar, teVar)) {
            au auVar = teVar.b() ? au.f20738a : this.f23056t.f23145n;
            if (this.f23049m.c().equals(auVar)) {
                return;
            }
            this.f23049m.g(auVar);
            return;
        }
        beVar.o(beVar.n(teVar.f20173a, this.f23047k).f21037c, this.f23046j);
        er erVar = this.f23036O;
        ac acVar = this.f23046j.f21072k;
        int i9 = cq.f22640a;
        erVar.d(acVar);
        if (j9 != -9223372036854775807L) {
            this.f23036O.e(s(beVar, teVar.f20173a, j9));
            return;
        }
        if (cq.V(!beVar2.p() ? beVar2.o(beVar2.n(teVar2.f20173a, this.f23047k).f21037c, this.f23046j).f21063b : null, this.f23046j.f21063b)) {
            return;
        }
        this.f23036O.e(-9223372036854775807L);
    }

    private final synchronized void ab(atq atqVar, long j9) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + 500;
        boolean z9 = false;
        for (long jElapsedRealtime2 = 500; !((Boolean) atqVar.a()).booleanValue() && jElapsedRealtime2 > 0; jElapsedRealtime2 = jElapsedRealtime - SystemClock.elapsedRealtime()) {
            try {
                wait(jElapsedRealtime2);
            } catch (InterruptedException unused) {
                z9 = true;
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
    }

    private final boolean ac() {
        gq gqVarC = this.f23052p.c();
        return (gqVarC == null || gqVarC.c() == Long.MIN_VALUE) ? false : true;
    }

    private static boolean ad(hh hhVar) {
        return hhVar.bg() != 0;
    }

    private final boolean ae() {
        gq gqVarD = this.f23052p.d();
        long j9 = gqVarD.f23070f.f23084e;
        if (gqVarD.f23068d) {
            return j9 == -9223372036854775807L || this.f23056t.f23149r < j9 || !ah();
        }
        return false;
    }

    private static boolean af(hb hbVar, bc bcVar) {
        te teVar = hbVar.f23133b;
        be beVar = hbVar.f23132a;
        return beVar.p() || beVar.n(teVar.f20173a, bcVar).f21040f;
    }

    private static boolean ag(gi giVar, be beVar, be beVar2, int i9, boolean z9, bd bdVar, bc bcVar) {
        Object obj = giVar.f23005d;
        if (obj == null) {
            giVar.f23002a.c();
            giVar.f23002a.c();
            Pair pairY = y(beVar, new gl(giVar.f23002a.e(), giVar.f23002a.a(), cq.t(-9223372036854775807L)), false, i9, z9, bdVar, bcVar);
            if (pairY == null) {
                return false;
            }
            giVar.a(beVar.a(pairY.first), ((Long) pairY.second).longValue(), pairY.first);
            giVar.f23002a.c();
            return true;
        }
        int iA = beVar.a(obj);
        if (iA == -1) {
            return false;
        }
        giVar.f23002a.c();
        giVar.f23003b = iA;
        beVar2.n(giVar.f23005d, bcVar);
        if (bcVar.f21040f && beVar2.o(bcVar.f21037c, bdVar).f21076o == beVar2.a(giVar.f23005d)) {
            Pair pairK = beVar.k(bdVar, bcVar, beVar.n(giVar.f23005d, bcVar).f21037c, giVar.f23004c + bcVar.f21039e);
            giVar.a(beVar.a(pairK.first), ((Long) pairK.second).longValue(), pairK.first);
        }
        return true;
    }

    private final boolean ah() {
        hb hbVar = this.f23056t;
        return hbVar.f23143l && hbVar.f23144m == 0;
    }

    private final boolean ai(be beVar, te teVar) {
        if (!teVar.b() && !beVar.p()) {
            beVar.o(beVar.n(teVar.f20173a, this.f23047k).f21037c, this.f23046j);
            if (this.f23046j.c()) {
                bd bdVar = this.f23046j;
                if (bdVar.f21070i && bdVar.f21067f != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private static C1333s[] aj(we weVar) {
        int iN = weVar != null ? weVar.n() : 0;
        C1333s[] c1333sArr = new C1333s[iN];
        for (int i9 = 0; i9 < iN; i9++) {
            c1333sArr[i9] = weVar.o(i9);
        }
        return c1333sArr;
    }

    private static final void ak(he heVar) throws ev {
        heVar.k();
        try {
            heVar.f().q(heVar.b(), heVar.g());
        } finally {
            heVar.h(true);
        }
    }

    private static final void al(hh hhVar) throws ev {
        if (hhVar.bg() == 2) {
            hhVar.F();
        }
    }

    private static final void am(hh hhVar) {
        hhVar.C();
        if (hhVar instanceof vi) {
            throw null;
        }
    }

    public static Object e(bd bdVar, bc bcVar, int i9, boolean z9, Object obj, be beVar, be beVar2) {
        int iA = beVar.a(obj);
        int iB = beVar.b();
        int i10 = 0;
        int i11 = iA;
        int iA2 = -1;
        while (true) {
            if (i10 >= iB || iA2 != -1) {
                break;
            }
            i11 = beVar.i(i11, bcVar, bdVar, i9, z9);
            if (i11 == -1) {
                iA2 = -1;
                break;
            }
            iA2 = beVar2.a(beVar.f(i11));
            i10++;
        }
        if (iA2 == -1) {
            return null;
        }
        return beVar2.f(iA2);
    }

    private final long s(be beVar, Object obj, long j9) {
        beVar.o(beVar.n(obj, this.f23047k).f21037c, this.f23046j);
        bd bdVar = this.f23046j;
        if (bdVar.f21067f != -9223372036854775807L && bdVar.c()) {
            bd bdVar2 = this.f23046j;
            if (bdVar2.f21070i) {
                return cq.t(cq.r(bdVar2.f21068g) - this.f23046j.f21067f) - (j9 + this.f23047k.f21039e);
            }
        }
        return -9223372036854775807L;
    }

    private final long t() {
        return u(this.f23056t.f23147p);
    }

    private final long u(long j9) {
        gq gqVarC = this.f23052p.c();
        if (gqVarC == null) {
            return 0L;
        }
        return Math.max(0L, j9 - gqVarC.f(this.f23029H));
    }

    private final long v(te teVar, long j9, boolean z9) throws ev {
        return w(teVar, j9, this.f23052p.d() != this.f23052p.e(), z9);
    }

    private final long w(te teVar, long j9, boolean z9, boolean z10) throws ev {
        W();
        this.f23061y = false;
        if (z10 || this.f23056t.f23136e == 3) {
            T(2);
        }
        gq gqVarD = this.f23052p.d();
        gq gqVarH = gqVarD;
        while (gqVarH != null && !teVar.equals(gqVarH.f23070f.f23080a)) {
            gqVarH = gqVarH.h();
        }
        if (z9 || gqVarD != gqVarH || (gqVarH != null && gqVarH.g(j9) < 0)) {
            hh[] hhVarArr = this.f23037a;
            int length = hhVarArr.length;
            for (int i9 = 0; i9 < 2; i9++) {
                A(hhVarArr[i9]);
            }
            if (gqVarH != null) {
                while (this.f23052p.d() != gqVarH) {
                    this.f23052p.a();
                }
                this.f23052p.m(gqVarH);
                gqVarH.t();
                C();
            }
        }
        gt gtVar = this.f23052p;
        if (gqVarH != null) {
            gtVar.m(gqVarH);
            if (!gqVarH.f23068d) {
                gqVarH.f23070f = gqVarH.f23070f.b(j9);
            } else if (gqVarH.f23069e) {
                j9 = gqVarH.f23065a.e(j9);
                gqVarH.f23065a.q(j9 - this.f23048l);
            }
            N(j9);
            J();
        } else {
            gtVar.i();
            N(j9);
        }
        F(false);
        this.f23043g.h(2);
        return j9;
    }

    private final Pair x(be beVar) {
        long j9 = 0;
        if (beVar.p()) {
            return Pair.create(hb.h(), 0L);
        }
        Pair pairK = beVar.k(this.f23046j, this.f23047k, beVar.g(this.f23023B), -9223372036854775807L);
        te teVarH = this.f23052p.h(beVar, pairK.first, 0L);
        long jLongValue = ((Long) pairK.second).longValue();
        if (teVarH.b()) {
            beVar.n(teVarH.f20173a, this.f23047k);
            if (teVarH.f20175c == this.f23047k.d(teVarH.f20174b)) {
                this.f23047k.j();
            }
        } else {
            j9 = jLongValue;
        }
        return Pair.create(teVarH, Long.valueOf(j9));
    }

    private static Pair y(be beVar, gl glVar, boolean z9, int i9, boolean z10, bd bdVar, bc bcVar) {
        Pair pairK;
        Object objE;
        int i10;
        long j9;
        be beVar2 = glVar.f23019a;
        if (beVar.p()) {
            return null;
        }
        be beVar3 = true == beVar2.p() ? beVar : beVar2;
        try {
            pairK = beVar3.k(bdVar, bcVar, glVar.f23020b, glVar.f23021c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (beVar.equals(beVar3)) {
            return pairK;
        }
        if (beVar.a(pairK.first) == -1) {
            if (z9 && (objE = e(bdVar, bcVar, i9, z10, pairK.first, beVar3, beVar)) != null) {
                i10 = beVar.n(objE, bcVar).f21037c;
                j9 = -9223372036854775807L;
            }
            return null;
        }
        if (!beVar3.n(pairK.first, bcVar).f21040f || beVar3.o(bcVar.f21037c, bdVar).f21076o != beVar3.a(pairK.first)) {
            return pairK;
        }
        i10 = beVar.n(pairK.first, bcVar).f21037c;
        j9 = glVar.f23021c;
        return beVar.k(bdVar, bcVar, i10, j9);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.ads.interactivemedia.v3.internal.hb z(com.google.ads.interactivemedia.v3.internal.te r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.gm.z(com.google.ads.interactivemedia.v3.internal.te, long, long, long, boolean, int):com.google.ads.interactivemedia.v3.internal.hb");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.et
    public final void a(au auVar) {
        this.f23043g.b(16, auVar).a();
    }

    public final Looper b() {
        return this.f23045i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tc
    public final void bl(td tdVar) {
        this.f23043g.b(8, tdVar).a();
    }

    public final /* synthetic */ Boolean d() {
        return Boolean.valueOf(this.f23058v);
    }

    public final /* synthetic */ void f(he heVar) {
        try {
            ak(heVar);
        } catch (ev e9) {
            cd.c("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e9);
            throw new RuntimeException(e9);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ug
    public final /* bridge */ /* synthetic */ void g(uh uhVar) {
        this.f23043g.b(9, (td) uhVar).a();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.gz
    public final void h() {
        this.f23043g.h(22);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        IOException iOException;
        int i9;
        boolean z9;
        gq gqVarE;
        int i10;
        bv bvVar;
        long jLongValue;
        long j9;
        boolean z10;
        te teVar;
        Throwable th;
        long jV;
        boolean z11;
        long jA;
        hb hbVar;
        int i11;
        hb hbVarZ;
        be beVarK;
        try {
        } catch (as e9) {
            int i12 = e9.f20612b;
            E(e9, i12 == 1 ? true != e9.f20611a ? 3003 : AdError.MEDIATION_ERROR_CODE : i12 == 4 ? true != e9.f20611a ? 3004 : 3002 : 1000);
        } catch (cz e10) {
            cz czVar = e10;
            i9 = czVar.f22673a;
            iOException = czVar;
            E(iOException, i9);
        } catch (ev e11) {
            ev evVarA = e11;
            if (evVarA.f22860c == 1 && (gqVarE = this.f23052p.e()) != null) {
                evVarA = evVarA.a(gqVarE.f23070f.f23080a);
            }
            if (!evVarA.f22866i || this.f23032K != null) {
                ev evVar = this.f23032K;
                if (evVar != null) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(evVar, evVarA);
                    } catch (Exception unused) {
                    }
                    evVarA = this.f23032K;
                }
                cd.c("ExoPlayerImplInternal", "Playback error", evVarA);
                z9 = true;
                V(true, false);
                this.f23056t = this.f23056t.d(evVarA);
                K();
                return z9;
            }
            cd.f("ExoPlayerImplInternal", "Recoverable renderer error", evVarA);
            this.f23032K = evVarA;
            bv bvVar2 = this.f23043g;
            bvVar2.j(bvVar2.b(25, evVarA));
        } catch (nl e12) {
            nl nlVar = e12;
            i9 = nlVar.f23894a;
            iOException = nlVar;
            E(iOException, i9);
        } catch (sb e13) {
            iOException = e13;
            i9 = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
            E(iOException, i9);
        } catch (IOException e14) {
            iOException = e14;
            i9 = AdError.SERVER_ERROR_CODE;
            E(iOException, i9);
        } catch (RuntimeException e15) {
            ev evVarD = ev.d(e15, ((e15 instanceof IllegalStateException) || (e15 instanceof IllegalArgumentException)) ? 1004 : 1000);
            cd.c("ExoPlayerImplInternal", "Playback error", evVarD);
            V(true, false);
            this.f23056t = this.f23056t.d(evVarD);
        }
        switch (message.what) {
            case 0:
                i10 = 2;
                this.f23057u.a(1);
                L(false, false, false, true);
                this.f23034M.b();
                T(true != this.f23056t.f23132a.p() ? 2 : 4);
                this.f23053q.e(this.f23042f.f());
                bvVar = this.f23043g;
                bvVar.h(i10);
                z9 = true;
                K();
                return z9;
            case 1:
                S(message.arg1 != 0, message.arg2, true, 1);
                z9 = true;
                K();
                return z9;
            case 2:
                B();
                z9 = true;
                K();
                return z9;
            case 3:
                gl glVar = (gl) message.obj;
                this.f23057u.a(1);
                Pair pairY = y(this.f23056t.f23132a, glVar, true, this.f23022A, this.f23023B, this.f23046j, this.f23047k);
                if (pairY == null) {
                    Pair pairX = x(this.f23056t.f23132a);
                    teVar = (te) pairX.first;
                    jLongValue = ((Long) pairX.second).longValue();
                    j9 = -9223372036854775807L;
                    z10 = !this.f23056t.f23132a.p();
                } else {
                    Object obj = pairY.first;
                    jLongValue = ((Long) pairY.second).longValue();
                    j9 = glVar.f23021c == -9223372036854775807L ? -9223372036854775807L : jLongValue;
                    te teVarH = this.f23052p.h(this.f23056t.f23132a, obj, jLongValue);
                    if (teVarH.b()) {
                        this.f23056t.f23132a.n(teVarH.f20173a, this.f23047k);
                        if (this.f23047k.d(teVarH.f20174b) == teVarH.f20175c) {
                            this.f23047k.j();
                        }
                        teVar = teVarH;
                        jLongValue = 0;
                        z10 = true;
                    } else {
                        z10 = glVar.f23021c == -9223372036854775807L;
                        teVar = teVarH;
                    }
                }
                try {
                    if (this.f23056t.f23132a.p()) {
                        this.f23028G = glVar;
                    } else if (pairY == null) {
                        if (this.f23056t.f23136e != 1) {
                            T(4);
                        }
                        L(false, true, false, true);
                    } else {
                        try {
                            if (teVar.equals(this.f23056t.f23133b)) {
                                gq gqVarD = this.f23052p.d();
                                jA = (gqVarD == null || !gqVarD.f23068d || jLongValue == 0) ? jLongValue : gqVarD.f23065a.a(jLongValue, this.f23055s);
                                if (cq.x(jA) == cq.x(this.f23056t.f23149r) && ((i11 = (hbVar = this.f23056t).f23136e) == 2 || i11 == 3)) {
                                    long j10 = hbVar.f23149r;
                                    hbVarZ = z(teVar, j10, j9, j10, z10, 2);
                                    this.f23056t = hbVarZ;
                                    z9 = true;
                                    K();
                                    return z9;
                                }
                            } else {
                                jA = jLongValue;
                            }
                            hb hbVar2 = this.f23056t;
                            be beVar = hbVar2.f23132a;
                            aa(beVar, teVar, beVar, hbVar2.f23133b, j9);
                            hbVarZ = z(teVar, jV, j9, jV, z11, 2);
                            this.f23056t = hbVarZ;
                            z9 = true;
                            K();
                            return z9;
                        } catch (Throwable th2) {
                            th = th2;
                            Throwable th3 = th;
                            this.f23056t = z(teVar, jV, j9, jV, z11, 2);
                            throw th3;
                        }
                        jV = v(teVar, jA, this.f23056t.f23136e == 4);
                        z11 = z10 | (jLongValue != jV);
                    }
                    jV = jLongValue;
                    z11 = z10;
                    hbVarZ = z(teVar, jV, j9, jV, z11, 2);
                    this.f23056t = hbVarZ;
                    z9 = true;
                    K();
                    return z9;
                } catch (Throwable th4) {
                    th = th4;
                    jV = jLongValue;
                    z11 = z10;
                }
                break;
            case 4:
                this.f23049m.g((au) message.obj);
                H(this.f23049m.c(), true);
                z9 = true;
                K();
                return z9;
            case 5:
                this.f23055s = (hl) message.obj;
                z9 = true;
                K();
                return z9;
            case 6:
                V(false, true);
                z9 = true;
                K();
                return z9;
            case 7:
                L(true, false, true, false);
                this.f23034M.c();
                T(1);
                this.f23044h.quit();
                synchronized (this) {
                    this.f23058v = true;
                    notifyAll();
                    break;
                }
                return true;
            case 8:
                if (this.f23052p.l((td) message.obj)) {
                    gq gqVarC = this.f23052p.c();
                    gqVarC.m(this.f23049m.c().f20739b, this.f23056t.f23132a);
                    Y(gqVarC.i(), gqVarC.j());
                    if (gqVarC == this.f23052p.d()) {
                        N(gqVarC.f23070f.f23081b);
                        C();
                        hb hbVar3 = this.f23056t;
                        te teVar2 = hbVar3.f23133b;
                        long j11 = gqVarC.f23070f.f23081b;
                        this.f23056t = z(teVar2, j11, hbVar3.f23134c, j11, false, 5);
                    }
                    J();
                }
                z9 = true;
                K();
                return z9;
            case 9:
                if (this.f23052p.l((td) message.obj)) {
                    this.f23052p.k(this.f23029H);
                    J();
                }
                z9 = true;
                K();
                return z9;
            case 10:
                float f9 = this.f23049m.c().f20739b;
                gq gqVarD2 = this.f23052p.d();
                gq gqVarE2 = this.f23052p.e();
                boolean z12 = true;
                while (gqVarD2 != null && gqVarD2.f23068d) {
                    wk wkVarK = gqVarD2.k(f9, this.f23056t.f23132a);
                    wk wkVarJ = gqVarD2.j();
                    if (wkVarJ != null && wkVarJ.f24978c.length == wkVarK.f24978c.length) {
                        for (int i13 = 0; i13 < wkVarK.f24978c.length; i13++) {
                            if (wkVarK.a(wkVarJ, i13)) {
                            }
                        }
                        z12 &= gqVarD2 != gqVarE2;
                        gqVarD2 = gqVarD2.h();
                    }
                    if (z12) {
                        gq gqVarD3 = this.f23052p.d();
                        boolean zM = this.f23052p.m(gqVarD3);
                        int length = this.f23037a.length;
                        boolean[] zArr = new boolean[2];
                        long jA2 = gqVarD3.a(wkVarK, this.f23056t.f23149r, zM, zArr);
                        hb hbVar4 = this.f23056t;
                        boolean z13 = (hbVar4.f23136e == 4 || jA2 == hbVar4.f23149r) ? false : true;
                        hb hbVar5 = this.f23056t;
                        i10 = 2;
                        this.f23056t = z(hbVar5.f23133b, jA2, hbVar5.f23134c, hbVar5.f23135d, z13, 5);
                        if (z13) {
                            N(jA2);
                        }
                        int length2 = this.f23037a.length;
                        boolean[] zArr2 = new boolean[2];
                        int i14 = 0;
                        while (true) {
                            hh[] hhVarArr = this.f23037a;
                            int length3 = hhVarArr.length;
                            if (i14 < 2) {
                                hh hhVar = hhVarArr[i14];
                                boolean zAd = ad(hhVar);
                                zArr2[i14] = zAd;
                                uf ufVar = gqVarD3.f23067c[i14];
                                if (zAd) {
                                    if (ufVar != hhVar.n()) {
                                        A(hhVar);
                                    } else if (zArr[i14]) {
                                        hhVar.B(this.f23029H);
                                    }
                                }
                                i14++;
                            } else {
                                D(zArr2);
                            }
                        }
                    } else {
                        i10 = 2;
                        this.f23052p.m(gqVarD2);
                        if (gqVarD2.f23068d) {
                            gqVarD2.s(wkVarK, Math.max(gqVarD2.f23070f.f23081b, gqVarD2.f(this.f23029H)));
                        }
                    }
                    F(true);
                    if (this.f23056t.f23136e != 4) {
                        J();
                        Z();
                        bvVar = this.f23043g;
                        bvVar.h(i10);
                    }
                }
                z9 = true;
                K();
                return z9;
            case 11:
                int i15 = message.arg1;
                this.f23022A = i15;
                if (!this.f23052p.p(this.f23056t.f23132a, i15)) {
                    Q(true);
                }
                F(false);
                z9 = true;
                K();
                return z9;
            case 12:
                boolean z14 = message.arg1 != 0;
                this.f23023B = z14;
                if (!this.f23052p.q(this.f23056t.f23132a, z14)) {
                    Q(true);
                }
                F(false);
                z9 = true;
                K();
                return z9;
            case 13:
                boolean z15 = message.arg1 != 0;
                AtomicBoolean atomicBoolean = (AtomicBoolean) message.obj;
                if (this.f23024C != z15) {
                    this.f23024C = z15;
                    if (!z15) {
                        hh[] hhVarArr2 = this.f23037a;
                        int length4 = hhVarArr2.length;
                        for (int i16 = 0; i16 < 2; i16++) {
                            hh hhVar2 = hhVarArr2[i16];
                            if (!ad(hhVar2) && this.f23038b.remove(hhVar2)) {
                                hhVar2.A();
                            }
                        }
                    }
                }
                if (atomicBoolean != null) {
                    synchronized (this) {
                        atomicBoolean.set(true);
                        notifyAll();
                        break;
                    }
                }
                z9 = true;
                K();
                return z9;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                he heVar = (he) message.obj;
                heVar.c();
                R(heVar);
                z9 = true;
                K();
                return z9;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                final he heVar2 = (he) message.obj;
                Looper looperD = heVar2.d();
                if (looperD.getThread().isAlive()) {
                    this.f23051o.b(looperD, null).e(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.ge
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f22991a.f(heVar2);
                        }
                    });
                } else {
                    cd.e("TAG", "Trying to send message on a dead thread.");
                    heVar2.h(false);
                }
                z9 = true;
                K();
                return z9;
            case 16:
                H((au) message.obj, false);
                z9 = true;
                K();
                return z9;
            case LangUtils.HASH_SEED /* 17 */:
                gg ggVar = (gg) message.obj;
                this.f23057u.a(1);
                if (ggVar.f22995b != -1) {
                    this.f23028G = new gl(new hf(ggVar.f22994a, ggVar.f22997d), ggVar.f22995b, ggVar.f22996c);
                }
                beVarK = this.f23053q.k(ggVar.f22994a, ggVar.f22997d);
                G(beVarK, false);
                z9 = true;
                K();
                return z9;
            case 18:
                gg ggVar2 = (gg) message.obj;
                int iA = message.arg1;
                this.f23057u.a(1);
                ha haVar = this.f23053q;
                if (iA == -1) {
                    iA = haVar.a();
                }
                beVarK = haVar.i(iA, ggVar2.f22994a, ggVar2.f22997d);
                G(beVarK, false);
                z9 = true;
                K();
                return z9;
            case 19:
                gh ghVar = (gh) message.obj;
                this.f23057u.a(1);
                ha haVar2 = this.f23053q;
                int i17 = ghVar.f22998a;
                beVarK = haVar2.o();
                G(beVarK, false);
                z9 = true;
                K();
                return z9;
            case 20:
                int i18 = message.arg1;
                int i19 = message.arg2;
                ui uiVar = (ui) message.obj;
                this.f23057u.a(1);
                beVarK = this.f23053q.j(i18, i19, uiVar);
                G(beVarK, false);
                z9 = true;
                K();
                return z9;
            case 21:
                ui uiVar2 = (ui) message.obj;
                this.f23057u.a(1);
                beVarK = this.f23053q.l(uiVar2);
                G(beVarK, false);
                z9 = true;
                K();
                return z9;
            case 22:
                G(this.f23053q.b(), true);
                z9 = true;
                K();
                return z9;
            case 23:
                this.f23059w = message.arg1 != 0;
                M();
                if (this.f23060x && this.f23052p.e() != this.f23052p.d()) {
                    Q(true);
                    F(false);
                }
                z9 = true;
                K();
                return z9;
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                boolean z16 = message.arg1 == 1;
                if (z16 != this.f23026E) {
                    this.f23026E = z16;
                    if (!z16 && this.f23056t.f23146o) {
                        this.f23043g.h(2);
                    }
                }
                z9 = true;
                K();
                return z9;
            case 25:
                Q(true);
                z9 = true;
                K();
                return z9;
            default:
                return false;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wi
    public final void j() {
        this.f23043g.h(10);
    }

    public final void k() {
        this.f23043g.a(0).a();
    }

    public final void l(be beVar, int i9, long j9) {
        this.f23043g.b(3, new gl(beVar, i9, j9)).a();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hc
    public final synchronized void m(he heVar) {
        if (!this.f23058v && this.f23044h.isAlive()) {
            this.f23043g.b(14, heVar).a();
            return;
        }
        cd.e("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        heVar.h(false);
    }

    public final void n(boolean z9, int i9) {
        this.f23043g.d(z9 ? 1 : 0, i9).a();
    }

    public final void o() {
        this.f23043g.a(6).a();
    }

    public final synchronized boolean p() {
        if (!this.f23058v && this.f23044h.isAlive()) {
            this.f23043g.h(7);
            ab(new atq() { // from class: com.google.ads.interactivemedia.v3.internal.gd
                @Override // com.google.ads.interactivemedia.v3.internal.atq
                public final Object a() {
                    return this.f22990a.d();
                }
            }, 500L);
            return this.f23058v;
        }
        return true;
    }

    public final void q(List list, int i9, long j9, ui uiVar) {
        this.f23043g.b(17, new gg(list, uiVar, i9, j9)).a();
    }
}
