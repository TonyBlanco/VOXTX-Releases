package com.google.ads.interactivemedia.v3.internal;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
final class my implements nm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final oj f23824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final UUID f23825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final mw f23826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ob f23827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ms f23828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final mt f23829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f23830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f23831i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final HashMap f23832j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final bq f23833k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final iw f23834l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f23835m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f23836n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private HandlerThread f23837o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private mu f23838p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ea f23839q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private nl f23840r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private byte[] f23841s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private byte[] f23842t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private zo f23843u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private aeq f23844v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ws f23845w;

    public my(UUID uuid, ob obVar, ms msVar, mt mtVar, List list, boolean z9, boolean z10, byte[] bArr, HashMap map, oj ojVar, Looper looper, ws wsVar, iw iwVar, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        List listUnmodifiableList;
        this.f23825c = uuid;
        this.f23828f = msVar;
        this.f23829g = mtVar;
        this.f23827e = obVar;
        this.f23830h = z9;
        this.f23831i = z10;
        if (bArr != null) {
            this.f23842t = bArr;
            listUnmodifiableList = null;
        } else {
            af.s(list);
            listUnmodifiableList = Collections.unmodifiableList(list);
        }
        this.f23823a = listUnmodifiableList;
        this.f23832j = map;
        this.f23824b = ojVar;
        this.f23833k = new bq();
        this.f23845w = wsVar;
        this.f23834l = iwVar;
        this.f23835m = 2;
        this.f23826d = new mw(this, looper);
    }

    public static /* bridge */ /* synthetic */ void f(my myVar, Object obj, Object obj2) {
        if (obj == myVar.f23844v && myVar.v()) {
            myVar.f23844v = null;
            if (obj2 instanceof Exception) {
                myVar.t((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArrL = myVar.f23827e.l(myVar.f23841s, (byte[]) obj2);
                if (myVar.f23842t != null && bArrL != null && bArrL.length != 0) {
                    myVar.f23842t = bArrL;
                }
                myVar.f23835m = 4;
                myVar.q(mr.f23812a);
            } catch (Exception e9) {
                myVar.t(e9, true);
            }
        }
    }

    public static /* bridge */ /* synthetic */ void g(my myVar, Object obj, Object obj2) {
        if (obj == myVar.f23843u) {
            if (myVar.f23835m == 2 || myVar.v()) {
                myVar.f23843u = null;
                if (obj2 instanceof Exception) {
                    myVar.f23828f.b((Exception) obj2, false);
                    return;
                }
                try {
                    myVar.f23827e.e((byte[]) obj2);
                    myVar.f23828f.a();
                } catch (Exception e9) {
                    myVar.f23828f.b(e9, true);
                }
            }
        }
    }

    private final void q(bp bpVar) {
        Iterator it = this.f23833k.b().iterator();
        while (it.hasNext()) {
            bpVar.a((nn) it.next());
        }
    }

    private final void r(boolean z9) {
        long jMin;
        if (this.f23831i) {
            return;
        }
        byte[] bArr = (byte[]) cq.G(this.f23841s);
        byte[] bArr2 = this.f23842t;
        if (bArr2 == null) {
            u(bArr, 1, z9);
            return;
        }
        if (this.f23835m != 4) {
            try {
                this.f23827e.g(this.f23841s, bArr2);
            } catch (Exception e9) {
                s(e9, 1);
                return;
            }
        }
        if (C1304i.f23215d.equals(this.f23825c)) {
            Pair pairA = pi.a(this);
            af.s(pairA);
            jMin = Math.min(((Long) pairA.first).longValue(), ((Long) pairA.second).longValue());
        } else {
            jMin = Long.MAX_VALUE;
        }
        if (jMin > 60) {
            this.f23835m = 4;
            q(mr.f23813b);
            return;
        }
        cd.a("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jMin);
        u(bArr, 2, z9);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void s(final java.lang.Exception r8, int r9) {
        /*
            r7 = this;
            com.google.ads.interactivemedia.v3.internal.nl r0 = new com.google.ads.interactivemedia.v3.internal.nl
            int r1 = com.google.ads.interactivemedia.v3.internal.cq.f22640a
            r2 = 21
            r3 = 1
            if (r1 < r2) goto L14
            boolean r2 = com.google.ads.interactivemedia.v3.internal.nw.b(r8)
            if (r2 == 0) goto L14
            int r9 = com.google.ads.interactivemedia.v3.internal.nw.a(r8)
            goto L5a
        L14:
            r2 = 23
            r4 = 6006(0x1776, float:8.416E-42)
            if (r1 < r2) goto L23
            boolean r2 = com.google.ads.interactivemedia.v3.internal.nx.a(r8)
            if (r2 == 0) goto L23
        L20:
            r9 = 6006(0x1776, float:8.416E-42)
            goto L5a
        L23:
            r2 = 6002(0x1772, float:8.41E-42)
            r5 = 18
            if (r1 < r5) goto L32
            boolean r6 = com.google.ads.interactivemedia.v3.internal.nv.b(r8)
            if (r6 == 0) goto L32
        L2f:
            r9 = 6002(0x1772, float:8.41E-42)
            goto L5a
        L32:
            if (r1 < r5) goto L3d
            boolean r1 = com.google.ads.interactivemedia.v3.internal.nv.a(r8)
            if (r1 == 0) goto L3d
            r9 = 6007(0x1777, float:8.418E-42)
            goto L5a
        L3d:
            boolean r1 = r8 instanceof com.google.ads.interactivemedia.v3.internal.ol
            if (r1 == 0) goto L44
            r9 = 6001(0x1771, float:8.409E-42)
            goto L5a
        L44:
            boolean r1 = r8 instanceof com.google.ads.interactivemedia.v3.internal.nc
            if (r1 == 0) goto L4b
            r9 = 6003(0x1773, float:8.412E-42)
            goto L5a
        L4b:
            boolean r1 = r8 instanceof com.google.ads.interactivemedia.v3.internal.oi
            if (r1 == 0) goto L52
            r9 = 6008(0x1778, float:8.419E-42)
            goto L5a
        L52:
            if (r9 != r3) goto L55
            goto L20
        L55:
            r1 = 2
            if (r9 != r1) goto L2f
            r9 = 6004(0x1774, float:8.413E-42)
        L5a:
            r0.<init>(r8, r9)
            r7.f23840r = r0
            java.lang.String r9 = "DefaultDrmSession"
            java.lang.String r0 = "DRM session error"
            com.google.ads.interactivemedia.v3.internal.cd.c(r9, r0, r8)
            com.google.ads.interactivemedia.v3.internal.mp r9 = new com.google.ads.interactivemedia.v3.internal.mp
            r9.<init>()
            r7.q(r9)
            int r8 = r7.f23835m
            r9 = 4
            if (r8 == r9) goto L75
            r7.f23835m = r3
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.my.s(java.lang.Exception, int):void");
    }

    private final void t(Exception exc, boolean z9) {
        if (exc instanceof NotProvisionedException) {
            this.f23828f.c(this);
        } else {
            s(exc, true != z9 ? 2 : 1);
        }
    }

    private final void u(byte[] bArr, int i9, boolean z9) {
        try {
            aeq aeqVarN = this.f23827e.n(bArr, this.f23823a, i9, this.f23832j);
            this.f23844v = aeqVarN;
            mu muVar = this.f23838p;
            int i10 = cq.f22640a;
            af.s(aeqVarN);
            muVar.a(1, aeqVarN, z9);
        } catch (Exception e9) {
            t(e9, true);
        }
    }

    private final boolean v() {
        int i9 = this.f23835m;
        return i9 == 3 || i9 == 4;
    }

    private final boolean w() {
        if (v()) {
            return true;
        }
        try {
            byte[] bArrK = this.f23827e.k();
            this.f23841s = bArrK;
            this.f23827e.i(bArrK, this.f23834l);
            this.f23839q = this.f23827e.b(this.f23841s);
            final int i9 = 3;
            this.f23835m = 3;
            q(new bp(i9) { // from class: com.google.ads.interactivemedia.v3.internal.mq

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f23811a = 3;

                @Override // com.google.ads.interactivemedia.v3.internal.bp
                public final void a(Object obj) {
                    ((nn) obj).e(3);
                }
            });
            af.s(this.f23841s);
            return true;
        } catch (NotProvisionedException unused) {
            this.f23828f.c(this);
            return false;
        } catch (Exception e9) {
            s(e9, 1);
            return false;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nm
    public final int a() {
        return this.f23835m;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nm
    public final ea b() {
        return this.f23839q;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nm
    public final nl c() {
        if (this.f23835m == 1) {
            return this.f23840r;
        }
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nm
    public final Map d() {
        byte[] bArr = this.f23841s;
        if (bArr == null) {
            return null;
        }
        return this.f23827e.c(bArr);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nm
    public final UUID e() {
        return this.f23825c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nm
    public final void h(nn nnVar) {
        int i9 = this.f23836n;
        if (i9 < 0) {
            cd.b("DefaultDrmSession", "Session reference count less than zero: " + i9);
            this.f23836n = 0;
        }
        if (nnVar != null) {
            this.f23833k.c(nnVar);
        }
        int i10 = this.f23836n + 1;
        this.f23836n = i10;
        if (i10 == 1) {
            af.w(this.f23835m == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f23837o = handlerThread;
            handlerThread.start();
            this.f23838p = new mu(this, this.f23837o.getLooper());
            if (w()) {
                r(true);
            }
        } else if (nnVar != null && v() && this.f23833k.a(nnVar) == 1) {
            nnVar.e(this.f23835m);
        }
        ni niVar = (ni) this.f23829g;
        niVar.f23869a.f23880l.remove(this);
        Handler handler = niVar.f23869a.f23886r;
        af.s(handler);
        handler.removeCallbacksAndMessages(this);
    }

    public final void i(int i9) {
        if (i9 == 2 && this.f23835m == 4) {
            int i10 = cq.f22640a;
            r(false);
        }
    }

    public final void j() {
        if (w()) {
            r(true);
        }
    }

    public final void k(Exception exc, boolean z9) {
        s(exc, true != z9 ? 3 : 1);
    }

    public final void l() {
        zo zoVarM = this.f23827e.m();
        this.f23843u = zoVarM;
        mu muVar = this.f23838p;
        int i9 = cq.f22640a;
        af.s(zoVarM);
        muVar.a(0, zoVarM, true);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nm
    public final void m(nn nnVar) {
        int i9 = this.f23836n;
        if (i9 <= 0) {
            cd.b("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i10 = i9 - 1;
        this.f23836n = i10;
        if (i10 == 0) {
            this.f23835m = 0;
            mw mwVar = this.f23826d;
            int i11 = cq.f22640a;
            mwVar.removeCallbacksAndMessages(null);
            this.f23838p.b();
            this.f23838p = null;
            this.f23837o.quit();
            this.f23837o = null;
            this.f23839q = null;
            this.f23840r = null;
            this.f23844v = null;
            this.f23843u = null;
            byte[] bArr = this.f23841s;
            if (bArr != null) {
                this.f23827e.d(bArr);
                this.f23841s = null;
            }
        }
        if (nnVar != null) {
            this.f23833k.d(nnVar);
            if (this.f23833k.a(nnVar) == 0) {
                nnVar.g();
            }
        }
        mt mtVar = this.f23829g;
        int i12 = this.f23836n;
        if (i12 == 1) {
            ni niVar = (ni) mtVar;
            nj njVar = niVar.f23869a;
            if (njVar.f23881m > 0) {
                njVar.f23880l.add(this);
                Handler handler = niVar.f23869a.f23886r;
                af.s(handler);
                handler.postAtTime(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.nh
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f23868a.m(null);
                    }
                }, this, SystemClock.uptimeMillis() + niVar.f23869a.f23877i);
            }
        } else if (i12 == 0) {
            ni niVar2 = (ni) mtVar;
            niVar2.f23869a.f23878j.remove(this);
            nj njVar2 = niVar2.f23869a;
            if (njVar2.f23883o == this) {
                njVar2.f23883o = null;
            }
            nj njVar3 = niVar2.f23869a;
            if (njVar3.f23884p == this) {
                njVar3.f23884p = null;
            }
            niVar2.f23869a.f23875g.d(this);
            Handler handler2 = niVar2.f23869a.f23886r;
            af.s(handler2);
            handler2.removeCallbacksAndMessages(this);
            niVar2.f23869a.f23880l.remove(this);
        }
        ((ni) mtVar).f23869a.A();
    }

    public final boolean n(byte[] bArr) {
        return Arrays.equals(this.f23841s, bArr);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nm
    public final boolean o() {
        return this.f23830h;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nm
    public final boolean p(String str) {
        return this.f23827e.j((byte[]) af.t(this.f23841s), str);
    }
}
