package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class pv implements qq, ww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pr f24140a = pr.f24125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ql f24141b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private tj f24144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private xc f24145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Handler f24146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private qp f24147h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private qg f24148i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Uri f24149j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private qd f24150k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f24151l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final oq f24153n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ws f24154o;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArrayList f24143d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f24142c = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f24152m = -9223372036854775807L;

    public pv(oq oqVar, ws wsVar, ql qlVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f24153n = oqVar;
        this.f24141b = qlVar;
        this.f24154o = wsVar;
    }

    public static /* bridge */ /* synthetic */ boolean C(pv pvVar, Uri uri, bdz bdzVar, boolean z9) {
        Iterator it = pvVar.f24143d.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= !((qm) it.next()).s(uri, bdzVar, z9);
        }
        return z10;
    }

    private final Uri D(Uri uri) {
        pz pzVar;
        qd qdVar = this.f24150k;
        if (qdVar == null || !qdVar.f24200s.f24181e || (pzVar = (pz) qdVar.f24198q.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(pzVar.f24161b));
        int i9 = pzVar.f24162c;
        if (i9 != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i9));
        }
        return builderBuildUpon.build();
    }

    private static qa E(qd qdVar, qd qdVar2) {
        int i9 = (int) (qdVar2.f24189h - qdVar.f24189h);
        List list = qdVar.f24196o;
        if (i9 < list.size()) {
            return (qa) list.get(i9);
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ qd h(pv pvVar, qd qdVar, qd qdVar2) {
        long jA;
        int i9;
        qa qaVarE;
        int size;
        int size2;
        int size3;
        if (qdVar != null) {
            long j9 = qdVar2.f24189h;
            long j10 = qdVar.f24189h;
            if (j9 <= j10 && (j9 < j10 || ((size = qdVar2.f24196o.size() - qdVar.f24196o.size()) == 0 ? !((size2 = qdVar2.f24197p.size()) > (size3 = qdVar.f24197p.size()) || (size2 == size3 && qdVar2.f24193l && !qdVar.f24193l)) : size <= 0))) {
                return (!qdVar2.f24193l || qdVar.f24193l) ? qdVar : new qd(qdVar.f24182a, qdVar.f24221t, qdVar.f24222u, qdVar.f24183b, qdVar.f24185d, qdVar.f24186e, qdVar.f24187f, qdVar.f24188g, qdVar.f24189h, qdVar.f24190i, qdVar.f24191j, qdVar.f24192k, qdVar.f24223v, true, qdVar.f24194m, qdVar.f24195n, qdVar.f24196o, qdVar.f24197p, qdVar.f24200s, qdVar.f24198q);
            }
        }
        if (qdVar2.f24194m) {
            jA = qdVar2.f24186e;
        } else {
            qd qdVar3 = pvVar.f24150k;
            jA = qdVar3 != null ? qdVar3.f24186e : 0L;
            if (qdVar != null) {
                int size4 = qdVar.f24196o.size();
                qa qaVarE2 = E(qdVar, qdVar2);
                if (qaVarE2 != null) {
                    jA = qdVar.f24186e + qaVarE2.f24170g;
                } else if (size4 == qdVar2.f24189h - qdVar.f24189h) {
                    jA = qdVar.a();
                }
            }
        }
        long j11 = jA;
        if (qdVar2.f24187f) {
            i9 = qdVar2.f24188g;
        } else {
            qd qdVar4 = pvVar.f24150k;
            i9 = qdVar4 != null ? qdVar4.f24188g : 0;
            if (qdVar != null && (qaVarE = E(qdVar, qdVar2)) != null) {
                i9 = (qdVar.f24188g + qaVarE.f24169f) - ((qa) qdVar2.f24196o.get(0)).f24169f;
            }
        }
        return new qd(qdVar2.f24182a, qdVar2.f24221t, qdVar2.f24222u, qdVar2.f24183b, qdVar2.f24185d, j11, true, i9, qdVar2.f24189h, qdVar2.f24190i, qdVar2.f24191j, qdVar2.f24192k, qdVar2.f24223v, qdVar2.f24193l, qdVar2.f24194m, qdVar2.f24195n, qdVar2.f24196o, qdVar2.f24197p, qdVar2.f24200s, qdVar2.f24198q);
    }

    public static /* bridge */ /* synthetic */ void p(pv pvVar, Uri uri, qd qdVar) {
        if (uri.equals(pvVar.f24149j)) {
            if (pvVar.f24150k == null) {
                pvVar.f24151l = !qdVar.f24193l;
                pvVar.f24152m = qdVar.f24186e;
            }
            pvVar.f24150k = qdVar;
            pvVar.f24147h.b(qdVar);
        }
        Iterator it = pvVar.f24143d.iterator();
        while (it.hasNext()) {
            ((qm) it.next()).j();
        }
    }

    public static /* bridge */ /* synthetic */ boolean x(pv pvVar) {
        List list = pvVar.f24148i.f24212c;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i9 = 0; i9 < size; i9++) {
            pu puVar = (pu) pvVar.f24142c.get(((qf) list.get(i9)).f24204a);
            af.s(puVar);
            if (jElapsedRealtime > puVar.f24137i) {
                Uri uri = puVar.f24130b;
                pvVar.f24149j = uri;
                puVar.q(pvVar.D(uri));
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.qq
    public final boolean A(Uri uri) {
        return ((pu) this.f24142c.get(uri)).o();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ww
    public final /* bridge */ /* synthetic */ void bj(wy wyVar, long j9, long j10) {
        xf xfVar = (xf) wyVar;
        qh qhVar = (qh) xfVar.d();
        boolean z9 = qhVar instanceof qd;
        qg qgVarA = z9 ? qg.a(qhVar.f24221t) : (qg) qhVar;
        this.f24148i = qgVarA;
        this.f24149j = ((qf) qgVarA.f24212c.get(0)).f24204a;
        this.f24143d.add(new ps(this));
        List list = qgVarA.f24211b;
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            Uri uri = (Uri) list.get(i9);
            this.f24142c.put(uri, new pu(this, uri));
        }
        xfVar.c();
        xfVar.f();
        xfVar.a();
        sw swVar = new sw();
        pu puVar = (pu) this.f24142c.get(this.f24149j);
        if (z9) {
            puVar.r((qd) qhVar, swVar);
        } else {
            puVar.k();
        }
        this.f24144e.f(swVar, 4);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ww
    public final /* bridge */ /* synthetic */ wv bk(wy wyVar, long j9, long j10, IOException iOException, int i9) {
        xf xfVar = (xf) wyVar;
        long j11 = xfVar.f25042a;
        xfVar.c();
        xfVar.f();
        xfVar.a();
        sw swVar = new sw();
        long jE = ws.e(new bdz(iOException, i9));
        boolean z9 = jE == -9223372036854775807L;
        this.f24144e.h(swVar, xfVar.f25044c, iOException, z9);
        return z9 ? xc.f25038c : xc.n(false, jE);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ww
    public final /* bridge */ /* synthetic */ void bn(wy wyVar, long j9, long j10, boolean z9) {
        xf xfVar = (xf) wyVar;
        long j11 = xfVar.f25042a;
        xfVar.c();
        xfVar.f();
        xfVar.a();
        this.f24144e.d(new sw(), 4);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.qq
    public final long d() {
        return this.f24152m;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.qq
    public final qd i(Uri uri, boolean z9) {
        qd qdVarG = ((pu) this.f24142c.get(uri)).g();
        if (qdVarG != null && z9 && !uri.equals(this.f24149j)) {
            List list = this.f24148i.f24212c;
            int i9 = 0;
            while (true) {
                if (i9 >= list.size()) {
                    break;
                }
                if (uri.equals(((qf) list.get(i9)).f24204a)) {
                    qd qdVar = this.f24150k;
                    if (qdVar == null || !qdVar.f24193l) {
                        this.f24149j = uri;
                        pu puVar = (pu) this.f24142c.get(uri);
                        qd qdVar2 = puVar.f24133e;
                        if (qdVar2 == null || !qdVar2.f24193l) {
                            puVar.q(D(uri));
                        } else {
                            this.f24150k = qdVar2;
                            this.f24147h.b(qdVar2);
                        }
                    }
                } else {
                    i9++;
                }
            }
        }
        return qdVarG;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.qq
    public final qg k() {
        return this.f24148i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.qq
    public final void q(qm qmVar) {
        this.f24143d.add(qmVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.qq
    public final void r(Uri uri) throws IOException {
        ((pu) this.f24142c.get(uri)).l();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.qq
    public final void s() throws IOException {
        xc xcVar = this.f24145f;
        if (xcVar != null) {
            xcVar.a();
        }
        Uri uri = this.f24149j;
        if (uri != null) {
            r(uri);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.qq
    public final void t(Uri uri) {
        ((pu) this.f24142c.get(uri)).k();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.qq
    public final void u(qm qmVar) {
        this.f24143d.remove(qmVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.qq
    public final void v(Uri uri, tj tjVar, qp qpVar) {
        this.f24146g = cq.A();
        this.f24144e = tjVar;
        this.f24147h = qpVar;
        xf xfVar = new xf(this.f24153n.d(), uri, 4, this.f24141b.a());
        af.w(this.f24145f == null);
        xc xcVar = new xc("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f24145f = xcVar;
        xcVar.b(xfVar, this, ws.c(xfVar.f25044c));
        tjVar.j(new sw(xfVar.f25043b), xfVar.f25044c);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.qq
    public final void w() {
        this.f24149j = null;
        this.f24150k = null;
        this.f24148i = null;
        this.f24152m = -9223372036854775807L;
        this.f24145f.j();
        this.f24145f = null;
        Iterator it = this.f24142c.values().iterator();
        while (it.hasNext()) {
            ((pu) it.next()).m();
        }
        this.f24146g.removeCallbacksAndMessages(null);
        this.f24146g = null;
        this.f24142c.clear();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.qq
    public final boolean y(Uri uri, long j9) {
        pu puVar = (pu) this.f24142c.get(uri);
        return (puVar == null || pu.n(puVar, j9)) ? false : true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.qq
    public final boolean z() {
        return this.f24151l;
    }
}
