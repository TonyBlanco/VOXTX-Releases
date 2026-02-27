package com.google.ads.interactivemedia.v3.internal;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class ho implements gp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bn f23178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f23180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f23181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private au f23182e = au.f20738a;

    public ho(bn bnVar) {
        this.f23178a = bnVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.gp
    public final long a() {
        long j9 = this.f23180c;
        if (!this.f23179b) {
            return j9;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f23181d;
        au auVar = this.f23182e;
        return j9 + (auVar.f20739b == 1.0f ? cq.t(jElapsedRealtime) : auVar.a(jElapsedRealtime));
    }

    public final void b(long j9) {
        this.f23180c = j9;
        if (this.f23179b) {
            this.f23181d = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.gp
    public final au c() {
        return this.f23182e;
    }

    public final void d() {
        if (this.f23179b) {
            return;
        }
        this.f23181d = SystemClock.elapsedRealtime();
        this.f23179b = true;
    }

    public final void e() {
        if (this.f23179b) {
            b(a());
            this.f23179b = false;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.gp
    public final void g(au auVar) {
        if (this.f23179b) {
            b(a());
        }
        this.f23182e = auVar;
    }
}
