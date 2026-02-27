package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class ahq implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f19791a;

    public ahq(int i9) {
        this.f19791a = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f19791a != 0) {
            aht.f(aht.c());
        } else if (aht.f19794c != null) {
            aht.f19794c.post(aht.f19795d);
            aht.f19794c.postDelayed(aht.f19796e, 200L);
        }
    }
}
