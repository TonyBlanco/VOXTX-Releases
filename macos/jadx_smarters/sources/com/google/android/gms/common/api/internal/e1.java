package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import w4.C2914b;

/* JADX INFO: loaded from: classes3.dex */
public final class e1 implements GoogleApiClient.b, GoogleApiClient.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.common.api.a f26612a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f26613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f1 f26614d;

    public e1(com.google.android.gms.common.api.a aVar, boolean z9) {
        this.f26612a = aVar;
        this.f26613c = z9;
    }

    public final void a(f1 f1Var) {
        this.f26614d = f1Var;
    }

    public final f1 b() {
        com.google.android.gms.common.internal.r.n(this.f26614d, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.f26614d;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1361f
    public final void onConnected(Bundle bundle) {
        b().onConnected(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1377n
    public final void onConnectionFailed(C2914b c2914b) {
        b().A(c2914b, this.f26612a, this.f26613c);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1361f
    public final void onConnectionSuspended(int i9) {
        b().onConnectionSuspended(i9);
    }
}
