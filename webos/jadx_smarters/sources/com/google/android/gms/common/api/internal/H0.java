package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class H0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P4.l f26477a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ J0 f26478c;

    public H0(J0 j02, P4.l lVar) {
        this.f26478c = j02;
        this.f26477a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        J0.Z(this.f26478c, this.f26477a);
    }
}
