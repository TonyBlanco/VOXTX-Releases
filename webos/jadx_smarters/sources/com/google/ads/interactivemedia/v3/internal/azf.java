package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.internal.axz;

/* JADX INFO: loaded from: classes3.dex */
final class azf extends axz.i implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f20961b;

    public azf(Runnable runnable) {
        atp.k(runnable);
        this.f20961b = runnable;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axz
    public final String e() {
        return "task=[" + this.f20961b + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f20961b.run();
        } catch (Error | RuntimeException e9) {
            o(e9);
            throw e9;
        }
    }
}
