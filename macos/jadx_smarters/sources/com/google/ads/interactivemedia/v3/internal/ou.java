package com.google.ads.interactivemedia.v3.internal;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class ou extends vm {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23941d;

    public ou(bf bfVar, int[] iArr) {
        super(bfVar, iArr);
        this.f23941d = m(bfVar.b(iArr[0]));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.we
    public final int a() {
        return this.f23941d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.we
    public final int b() {
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.we
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.we
    public final void d(long j9, long j10, List list, vg[] vgVarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (s(this.f23941d, jElapsedRealtime)) {
            int i9 = this.f24859b;
            do {
                i9--;
                if (i9 < 0) {
                    throw new IllegalStateException();
                }
            } while (s(i9, jElapsedRealtime));
            this.f23941d = i9;
        }
    }
}
