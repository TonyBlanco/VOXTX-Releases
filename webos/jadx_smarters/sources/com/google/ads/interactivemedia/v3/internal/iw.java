package com.google.ads.interactivemedia.v3.internal;

import android.media.metrics.LogSessionId;

/* JADX INFO: loaded from: classes3.dex */
public final class iw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final iv f23322a;

    static {
        if (cq.f22640a < 31) {
            new iw();
        } else {
            iv ivVar = iv.f23320a;
        }
    }

    public iw() {
        this((iv) null);
        af.w(cq.f22640a < 31);
    }

    public iw(LogSessionId logSessionId) {
        this(new iv(logSessionId));
    }

    private iw(iv ivVar) {
        this.f23322a = ivVar;
    }

    public final LogSessionId a() {
        iv ivVar = this.f23322a;
        af.s(ivVar);
        return ivVar.f23321b;
    }
}
