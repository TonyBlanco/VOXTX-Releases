package com.google.android.gms.common.api.internal;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC1368i0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1370j0 f26640a;

    public RunnableC1368i0(C1370j0 c1370j0) {
        this.f26640a = c1370j0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1372k0 c1372k0 = this.f26640a.f26641a;
        c1372k0.f26649c.disconnect(c1372k0.f26649c.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
