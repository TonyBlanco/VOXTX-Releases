package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class pu implements ww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ pv f24129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f24130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final xc f24131c = new xc("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final cy f24132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private qd f24133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f24134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f24135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f24136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f24137i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f24138j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private IOException f24139k;

    public pu(pv pvVar, Uri uri) {
        this.f24129a = pvVar;
        this.f24130b = uri;
        this.f24132d = pvVar.f24153n.d();
    }

    public static /* bridge */ /* synthetic */ boolean n(pu puVar, long j9) {
        puVar.f24137i = SystemClock.elapsedRealtime() + j9;
        return puVar.f24130b.equals(puVar.f24129a.f24149j) && !pv.x(puVar.f24129a);
    }

    private final void p(Uri uri) {
        pv pvVar = this.f24129a;
        xf xfVar = new xf(this.f24132d, uri, 4, pvVar.f24141b.b(pvVar.f24148i, this.f24133e));
        this.f24131c.b(xfVar, this, ws.c(xfVar.f25044c));
        this.f24129a.f24144e.j(new sw(xfVar.f25043b), xfVar.f25044c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(final Uri uri) {
        this.f24137i = 0L;
        if (this.f24138j) {
            return;
        }
        xc xcVar = this.f24131c;
        if (xcVar.m() || xcVar.l()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j9 = this.f24136h;
        if (jElapsedRealtime >= j9) {
            p(uri);
        } else {
            this.f24138j = true;
            this.f24129a.f24146g.postDelayed(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.pt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24127a.j(uri);
                }
            }, j9 - jElapsedRealtime);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(qd qdVar, sw swVar) {
        boolean z9;
        Uri uriBuild;
        qd qdVar2 = this.f24133e;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f24134f = jElapsedRealtime;
        qd qdVarH = pv.h(this.f24129a, qdVar2, qdVar);
        this.f24133e = qdVarH;
        IOException qoVar = null;
        if (qdVarH != qdVar2) {
            this.f24139k = null;
            this.f24135g = jElapsedRealtime;
            pv.p(this.f24129a, this.f24130b, qdVarH);
        } else if (!qdVarH.f24193l) {
            if (qdVar.f24189h + ((long) qdVar.f24196o.size()) < this.f24133e.f24189h) {
                qoVar = new qn();
                z9 = true;
            } else {
                z9 = false;
                if (jElapsedRealtime - this.f24135g > cq.x(r2.f24191j) * 3.5d) {
                    qoVar = new qo();
                }
            }
            if (qoVar != null) {
                this.f24139k = qoVar;
                pv.C(this.f24129a, this.f24130b, new bdz(qoVar, 1), z9);
            }
        }
        qd qdVar3 = this.f24133e;
        this.f24136h = jElapsedRealtime + cq.x(!qdVar3.f24200s.f24181e ? qdVar3 != qdVar2 ? qdVar3.f24191j : qdVar3.f24191j / 2 : 0L);
        if (this.f24133e.f24192k != -9223372036854775807L || this.f24130b.equals(this.f24129a.f24149j)) {
            qd qdVar4 = this.f24133e;
            if (qdVar4.f24193l) {
                return;
            }
            qc qcVar = qdVar4.f24200s;
            if (qcVar.f24177a != -9223372036854775807L || qcVar.f24181e) {
                Uri.Builder builderBuildUpon = this.f24130b.buildUpon();
                qd qdVar5 = this.f24133e;
                if (qdVar5.f24200s.f24181e) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(qdVar5.f24189h + ((long) qdVar5.f24196o.size())));
                    qd qdVar6 = this.f24133e;
                    if (qdVar6.f24192k != -9223372036854775807L) {
                        List list = qdVar6.f24197p;
                        int size = list.size();
                        if (!list.isEmpty() && ((py) axo.z(list)).f24159b) {
                            size--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                qc qcVar2 = this.f24133e.f24200s;
                if (qcVar2.f24177a != -9223372036854775807L) {
                    builderBuildUpon.appendQueryParameter("_HLS_skip", true != qcVar2.f24178b ? "YES" : "v2");
                }
                uriBuild = builderBuildUpon.build();
            } else {
                uriBuild = this.f24130b;
            }
            q(uriBuild);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ww
    public final /* bridge */ /* synthetic */ void bj(wy wyVar, long j9, long j10) {
        xf xfVar = (xf) wyVar;
        qh qhVar = (qh) xfVar.d();
        xfVar.c();
        xfVar.f();
        xfVar.a();
        sw swVar = new sw();
        if (qhVar instanceof qd) {
            r((qd) qhVar, swVar);
            this.f24129a.f24144e.f(swVar, 4);
        } else {
            this.f24139k = as.c("Loaded playlist has unexpected type.", null);
            this.f24129a.f24144e.h(swVar, 4, this.f24139k, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    @Override // com.google.ads.interactivemedia.v3.internal.ww
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ com.google.ads.interactivemedia.v3.internal.wv bk(com.google.ads.interactivemedia.v3.internal.wy r4, long r5, long r7, java.io.IOException r9, int r10) {
        /*
            r3 = this;
            com.google.ads.interactivemedia.v3.internal.xf r4 = (com.google.ads.interactivemedia.v3.internal.xf) r4
            com.google.ads.interactivemedia.v3.internal.sw r5 = new com.google.ads.interactivemedia.v3.internal.sw
            long r6 = r4.f25042a
            r4.c()
            r4.f()
            r4.a()
            r5.<init>()
            android.net.Uri r6 = r4.c()
            java.lang.String r7 = "_HLS_msn"
            java.lang.String r6 = r6.getQueryParameter(r7)
            boolean r7 = r9 instanceof com.google.ads.interactivemedia.v3.internal.qi
            r8 = 1
            if (r6 != 0) goto L24
            if (r7 == 0) goto L3c
            r7 = 1
        L24:
            boolean r6 = r9 instanceof com.google.ads.interactivemedia.v3.internal.dq
            if (r6 == 0) goto L2e
            r6 = r9
            com.google.ads.interactivemedia.v3.internal.dq r6 = (com.google.ads.interactivemedia.v3.internal.dq) r6
            int r6 = r6.f22734c
            goto L31
        L2e:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L31:
            if (r7 != 0) goto L77
            r7 = 400(0x190, float:5.6E-43)
            if (r6 == r7) goto L77
            r7 = 503(0x1f7, float:7.05E-43)
            if (r6 != r7) goto L3c
            goto L77
        L3c:
            com.google.ads.interactivemedia.v3.internal.bdz r6 = new com.google.ads.interactivemedia.v3.internal.bdz
            r6.<init>(r9, r10)
            com.google.ads.interactivemedia.v3.internal.pv r7 = r3.f24129a
            android.net.Uri r10 = r3.f24130b
            r0 = 0
            boolean r7 = com.google.ads.interactivemedia.v3.internal.pv.C(r7, r10, r6, r0)
            if (r7 == 0) goto L61
            long r6 = com.google.ads.interactivemedia.v3.internal.ws.e(r6)
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r10 == 0) goto L5e
            com.google.ads.interactivemedia.v3.internal.wv r6 = com.google.ads.interactivemedia.v3.internal.xc.n(r0, r6)
            goto L63
        L5e:
            com.google.ads.interactivemedia.v3.internal.wv r6 = com.google.ads.interactivemedia.v3.internal.xc.f25038c
            goto L63
        L61:
            com.google.ads.interactivemedia.v3.internal.wv r6 = com.google.ads.interactivemedia.v3.internal.xc.f25037b
        L63:
            boolean r7 = r6.a()
            r7 = r7 ^ r8
            com.google.ads.interactivemedia.v3.internal.pv r8 = r3.f24129a
            com.google.ads.interactivemedia.v3.internal.tj r8 = com.google.ads.interactivemedia.v3.internal.pv.m(r8)
            int r4 = r4.f25044c
            r8.h(r5, r4, r9, r7)
            if (r7 != 0) goto L76
            goto L8f
        L76:
            return r6
        L77:
            long r6 = android.os.SystemClock.elapsedRealtime()
            r3.f24136h = r6
            r3.k()
            com.google.ads.interactivemedia.v3.internal.pv r6 = r3.f24129a
            com.google.ads.interactivemedia.v3.internal.tj r6 = com.google.ads.interactivemedia.v3.internal.pv.m(r6)
            int r7 = com.google.ads.interactivemedia.v3.internal.cq.f22640a
            int r4 = r4.f25044c
            r6.h(r5, r4, r9, r8)
            com.google.ads.interactivemedia.v3.internal.wv r6 = com.google.ads.interactivemedia.v3.internal.xc.f25037b
        L8f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.pu.bk(com.google.ads.interactivemedia.v3.internal.wy, long, long, java.io.IOException, int):com.google.ads.interactivemedia.v3.internal.wv");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ww
    public final /* bridge */ /* synthetic */ void bn(wy wyVar, long j9, long j10, boolean z9) {
        xf xfVar = (xf) wyVar;
        long j11 = xfVar.f25042a;
        xfVar.c();
        xfVar.f();
        xfVar.a();
        this.f24129a.f24144e.d(new sw(), 4);
    }

    public final qd g() {
        return this.f24133e;
    }

    public final /* synthetic */ void j(Uri uri) {
        this.f24138j = false;
        p(uri);
    }

    public final void k() {
        q(this.f24130b);
    }

    public final void l() throws IOException {
        this.f24131c.a();
        IOException iOException = this.f24139k;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void m() {
        this.f24131c.j();
    }

    public final boolean o() {
        int i9;
        if (this.f24133e == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, cq.x(this.f24133e.f24199r));
        qd qdVar = this.f24133e;
        return qdVar.f24193l || (i9 = qdVar.f24182a) == 2 || i9 == 1 || this.f24134f + jMax > jElapsedRealtime;
    }
}
