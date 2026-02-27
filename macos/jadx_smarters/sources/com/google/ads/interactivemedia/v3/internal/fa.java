package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class fa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f22876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final bn f22877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final atq f22878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final atq f22879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final atq f22880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final atq f22881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final atq f22882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final ati f22883h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Looper f22884i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final C1295f f22885j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final int f22886k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final boolean f22887l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final hl f22888m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final long f22889n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final long f22890o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final long f22891p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final long f22892q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final boolean f22893r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    boolean f22894s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final er f22895t;

    public fa(Context context, hk hkVar) {
        ex exVar = new ex(hkVar, 1);
        ex exVar2 = new ex(context, 0);
        ex exVar3 = new ex(context, 2);
        ey eyVar = new atq() { // from class: com.google.ads.interactivemedia.v3.internal.ey
            @Override // com.google.ads.interactivemedia.v3.internal.atq
            public final Object a() {
                return new es();
            }
        };
        ex exVar4 = new ex(context, 3);
        ez ezVar = new ati() { // from class: com.google.ads.interactivemedia.v3.internal.ez
            @Override // com.google.ads.interactivemedia.v3.internal.ati
            public final Object a(Object obj) {
                return new im((bn) obj);
            }
        };
        af.s(context);
        this.f22876a = context;
        this.f22878c = exVar;
        this.f22879d = exVar2;
        this.f22880e = exVar3;
        this.f22881f = eyVar;
        this.f22882g = exVar4;
        this.f22883h = ezVar;
        this.f22884i = cq.D();
        this.f22885j = C1295f.f22871a;
        this.f22886k = 1;
        this.f22887l = true;
        this.f22888m = hl.f23173b;
        this.f22889n = 5000L;
        this.f22890o = 15000L;
        this.f22895t = fz.a(0.97f, 1.03f, 1000L, 1.0E-7f, cq.t(20L), cq.t(500L), 0.999f);
        this.f22877b = bn.f21741a;
        this.f22891p = 500L;
        this.f22892q = 2000L;
        this.f22893r = true;
    }
}
