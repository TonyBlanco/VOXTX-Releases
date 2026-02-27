package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
final class akz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private aky f20081b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f20080a = new Handler();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20082c = false;

    public static /* synthetic */ void a(aky akyVar, Handler handler, long j9) {
        akyVar.a();
        e(akyVar, handler, 200L);
    }

    private static void e(final aky akyVar, final Handler handler, long j9) {
        final long j10 = 200;
        handler.postDelayed(new Runnable(handler, j10) { // from class: com.google.ads.interactivemedia.v3.internal.akx

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Handler f20078b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f20079c = 200;

            @Override // java.lang.Runnable
            public final void run() {
                akz.a(this.f20077a, this.f20078b, 200L);
            }
        }, 200L);
    }

    public final void b(aky akyVar) {
        this.f20081b = akyVar;
    }

    public final void c() {
        if (this.f20082c) {
            return;
        }
        this.f20082c = true;
        this.f20081b.a();
        e(this.f20081b, this.f20080a, 200L);
    }

    public final void d() {
        if (this.f20082c) {
            this.f20082c = false;
            this.f20080a.removeCallbacksAndMessages(null);
        }
    }
}
