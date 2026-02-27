package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class ams implements amv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ams f20253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f20255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final asr f20256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final asv f20257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final asx f20258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ans f20259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final aru f20260h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Executor f20261i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final asu f20262j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final aof f20264l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final anx f20265m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile boolean f20267o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile boolean f20268p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f20269q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile long f20254a = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f20266n = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final CountDownLatch f20263k = new CountDownLatch(1);

    public ams(Context context, aru aruVar, asr asrVar, asv asvVar, asx asxVar, ans ansVar, Executor executor, arl arlVar, int i9, aof aofVar, anx anxVar) {
        this.f20268p = false;
        this.f20255c = context;
        this.f20260h = aruVar;
        this.f20256d = asrVar;
        this.f20257e = asvVar;
        this.f20258f = asxVar;
        this.f20259g = ansVar;
        this.f20261i = executor;
        this.f20269q = i9;
        this.f20264l = aofVar;
        this.f20265m = anxVar;
        this.f20268p = false;
        this.f20262j = new amr(arlVar);
    }

    public static synchronized ams a(String str, Context context, boolean z9, boolean z10) {
        return b(str, context, Executors.newCachedThreadPool(), z9, z10);
    }

    @Deprecated
    public static synchronized ams b(String str, Context context, Executor executor, boolean z9, boolean z10) {
        try {
            if (f20253b == null) {
                arv arvVarA = arw.a();
                arvVarA.b(str);
                arvVarA.d(z9);
                arw arwVarA = arvVarA.a();
                aru aruVarA = aru.a(context, executor, z10);
                anh anhVarC = ((Boolean) aqo.f20549x.f()).booleanValue() ? anh.c(context) : null;
                aof aofVarD = ((Boolean) aqo.f20550y.f()).booleanValue() ? aof.d(context, executor) : null;
                anx anxVar = ((Boolean) aqo.f20541p.f()).booleanValue() ? new anx() : null;
                asg asgVarE = asg.e(context, executor, aruVarA, arwVarA);
                anr anrVar = new anr(context);
                ans ansVar = new ans(arwVarA, asgVarE, new aod(context, anrVar), anrVar, anhVarC, aofVarD, anxVar);
                int iD = com.google.ads.interactivemedia.v3.impl.data.aq.d(context, aruVarA);
                arl arlVar = new arl();
                ams amsVar = new ams(context, aruVarA, new asr(context, iD), new asv(context, iD, new amz(aruVarA, 1), ((Boolean) aqo.f20527b.f()).booleanValue()), new asx(context, ansVar, aruVarA, arlVar), ansVar, executor, arlVar, iD, aofVarD, anxVar);
                f20253b = amsVar;
                amsVar.m();
                f20253b.o();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f20253b;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f6 A[Catch: all -> 0x0096, bqw -> 0x0099, TryCatch #1 {bqw -> 0x0099, blocks: (B:6:0x001e, B:8:0x002c, B:11:0x0031, B:12:0x003d, B:14:0x004b, B:16:0x0059, B:19:0x0066, B:31:0x009c, B:35:0x00b1, B:41:0x00ca, B:44:0x00dc, B:46:0x00e2, B:48:0x00ea, B:49:0x00ec, B:38:0x00bb, B:39:0x00c2, B:22:0x006d, B:24:0x0083, B:50:0x00f6, B:51:0x0103, B:52:0x0110), top: B:58:0x001e, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ void j(com.google.ads.interactivemedia.v3.internal.ams r8) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ams.j(com.google.ads.interactivemedia.v3.internal.ams):void");
    }

    private final void t() {
        aof aofVar = this.f20264l;
        if (aofVar != null) {
            aofVar.h();
        }
    }

    private final asq u(int i9) {
        if (com.google.ads.interactivemedia.v3.impl.data.aq.c(this.f20269q)) {
            return ((Boolean) aqo.f20526a.f()).booleanValue() ? this.f20257e.c(1) : this.f20256d.d(1);
        }
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.amv
    public final String e(Context context, String str, View view, Activity activity) {
        t();
        if (((Boolean) aqo.f20541p.f()).booleanValue()) {
            this.f20265m.i();
        }
        o();
        arx arxVarA = this.f20258f.a();
        if (arxVarA == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strA = arxVarA.a(context, str, view, activity);
        this.f20260h.f(5000, System.currentTimeMillis() - jCurrentTimeMillis, strA);
        return strA;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.amv
    public final String f(Context context) {
        t();
        if (((Boolean) aqo.f20541p.f()).booleanValue()) {
            this.f20265m.j();
        }
        o();
        arx arxVarA = this.f20258f.a();
        if (arxVarA == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strC = arxVarA.c(context);
        this.f20260h.f(5001, System.currentTimeMillis() - jCurrentTimeMillis, strC);
        return strC;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.amv
    public final String g(Context context, byte[] bArr) {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.amv
    public final String h(Context context, View view, Activity activity) {
        t();
        if (((Boolean) aqo.f20541p.f()).booleanValue()) {
            this.f20265m.k(context, view);
        }
        o();
        arx arxVarA = this.f20258f.a();
        if (arxVarA == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strB = arxVarA.b(context, view, activity);
        this.f20260h.f(5002, System.currentTimeMillis() - jCurrentTimeMillis, strB);
        return strB;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.amv
    public final void k(MotionEvent motionEvent) {
        arx arxVarA = this.f20258f.a();
        if (arxVarA != null) {
            try {
                arxVarA.d(motionEvent);
            } catch (asw e9) {
                this.f20260h.c(e9.a(), -1L, e9);
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.amv
    public final void l(int i9, int i10, int i11) {
    }

    public final synchronized void m() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        asq asqVarU = u(1);
        if (asqVarU == null) {
            this.f20260h.d(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.f20258f.c(asqVarU)) {
            this.f20268p = true;
            this.f20263k.countDown();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.amv
    public final void n(View view) {
        this.f20259g.d(view);
    }

    public final void o() {
        if (this.f20267o) {
            return;
        }
        synchronized (this.f20266n) {
            try {
                if (!this.f20267o) {
                    if ((System.currentTimeMillis() / 1000) - this.f20254a < 3600) {
                        return;
                    }
                    asq asqVarB = this.f20258f.b();
                    if ((asqVarB == null || asqVarB.d()) && com.google.ads.interactivemedia.v3.impl.data.aq.c(this.f20269q)) {
                        this.f20261i.execute(new amt(this, 1));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.amv
    public final boolean q() {
        return r();
    }

    public final synchronized boolean r() {
        return this.f20268p;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.amv
    public final boolean s() {
        try {
            this.f20263k.await();
        } catch (InterruptedException unused) {
        }
        return r();
    }
}
