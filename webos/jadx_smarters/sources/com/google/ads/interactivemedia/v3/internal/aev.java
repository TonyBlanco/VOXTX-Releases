package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class aev implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ aew f19407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f19408b;

    public final void a() {
        if (this.f19408b) {
            return;
        }
        this.f19408b = true;
        this.f19407a.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19408b = false;
    }
}
