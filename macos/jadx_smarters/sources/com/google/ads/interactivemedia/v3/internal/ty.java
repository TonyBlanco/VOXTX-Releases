package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class ty extends sa implements tr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ai f24666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ad f24667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final cx f24668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nt f24669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f24670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f24671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f24672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f24673h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f24674i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private dw f24675j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final xv f24676k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ws f24677l;

    public /* synthetic */ ty(ai aiVar, cx cxVar, xv xvVar, nt ntVar, ws wsVar, int i9, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        ad adVar = aiVar.f19815b;
        af.s(adVar);
        this.f24667b = adVar;
        this.f24666a = aiVar;
        this.f24668c = cxVar;
        this.f24676k = xvVar;
        this.f24669d = ntVar;
        this.f24677l = wsVar;
        this.f24670e = i9;
        this.f24671f = true;
        this.f24672g = -9223372036854775807L;
    }

    private final void c() {
        long j9 = this.f24672g;
        boolean z9 = this.f24673h;
        boolean z10 = this.f24674i;
        ai aiVar = this.f24666a;
        uj ujVar = new uj(-9223372036854775807L, -9223372036854775807L, j9, j9, 0L, 0L, z9, false, false, null, aiVar, z10 ? aiVar.f19816c : null);
        G(this.f24671f ? new tw(ujVar) : ujVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tg
    public final ai a() {
        return this.f24666a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tr
    public final void b(long j9, boolean z9, boolean z10) {
        if (j9 == -9223372036854775807L) {
            j9 = this.f24672g;
        }
        if (!this.f24671f && this.f24672g == j9 && this.f24673h == z9 && this.f24674i == z10) {
            return;
        }
        this.f24672g = j9;
        this.f24673h = z9;
        this.f24674i = z10;
        this.f24671f = false;
        c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tg
    public final void h() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sa
    public final void n(dw dwVar) {
        this.f24675j = dwVar;
        this.f24669d.o();
        nt ntVar = this.f24669d;
        Looper looperMyLooper = Looper.myLooper();
        af.s(looperMyLooper);
        ntVar.q(looperMyLooper, u());
        c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tg
    public final void o(td tdVar) {
        ((tv) tdVar).I();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sa
    public final void p() {
        this.f24669d.p();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.ads.interactivemedia.v3.internal.zn, java.lang.Object] */
    @Override // com.google.ads.interactivemedia.v3.internal.tg
    public final td q(te teVar, wr wrVar, long j9) {
        de deVarA = ((df) this.f24668c).a();
        dw dwVar = this.f24675j;
        if (dwVar != null) {
            deVarA.f(dwVar);
        }
        Uri uri = this.f24667b.f19027a;
        xv xvVar = this.f24676k;
        u();
        return new tv(uri, deVarA, new sc(xvVar.f25127a), this.f24669d, v(teVar), this.f24677l, x(teVar), this, wrVar, this.f24670e, null, null, null);
    }
}
