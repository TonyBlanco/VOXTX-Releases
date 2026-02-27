package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1382p0 extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.common.api.e f26700c;

    public C1382p0(com.google.android.gms.common.api.e eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f26700c = eVar;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final AbstractC1357d e(AbstractC1357d abstractC1357d) {
        return this.f26700c.doRead(abstractC1357d);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final AbstractC1357d f(AbstractC1357d abstractC1357d) {
        return this.f26700c.doWrite(abstractC1357d);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Context h() {
        return this.f26700c.getApplicationContext();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper i() {
        return this.f26700c.getLooper();
    }
}
