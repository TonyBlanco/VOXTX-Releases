package com.google.ads.interactivemedia.v3.internal;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
final class ke implements js {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ kh f23439a;

    public /* synthetic */ ke(kh khVar) {
        this.f23439a = khVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.js
    public final void a(long j9) {
        cd.e("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.js
    public final void b(long j9) {
        kh khVar = this.f23439a;
        if (khVar.f23487r != null) {
            ((km) khVar.f23487r).f23509a.f23511c.r(j9);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.js
    public final void c(long j9, long j10, long j11, long j12) {
        cd.e("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + j9 + ", " + j10 + ", " + j11 + ", " + j12 + ", " + this.f23439a.I() + ", " + this.f23439a.J());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.js
    public final void d(long j9, long j10, long j11, long j12) {
        cd.e("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + j9 + ", " + j10 + ", " + j11 + ", " + j12 + ", " + this.f23439a.I() + ", " + this.f23439a.J());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.js
    public final void e(int i9, long j9) {
        if (this.f23439a.f23487r != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            kh khVar = this.f23439a;
            ((km) khVar.f23487r).f23509a.f23511c.t(i9, j9, jElapsedRealtime - khVar.aa);
        }
    }
}
