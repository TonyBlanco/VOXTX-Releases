package com.google.android.gms.common.api.internal;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC1366h0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26636a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1372k0 f26637c;

    public RunnableC1366h0(C1372k0 c1372k0, int i9) {
        this.f26637c = c1372k0;
        this.f26636a = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26637c.i(this.f26636a);
    }
}
