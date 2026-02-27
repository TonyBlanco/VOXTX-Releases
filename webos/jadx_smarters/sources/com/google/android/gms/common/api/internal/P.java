package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import w4.C2914b;

/* JADX INFO: loaded from: classes3.dex */
public final class P implements GoogleApiClient.b, GoogleApiClient.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T f26507a;

    public /* synthetic */ P(T t9, O o9) {
        this.f26507a = t9;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1361f
    public final void onConnected(Bundle bundle) {
        ((O4.e) com.google.android.gms.common.internal.r.m(this.f26507a.f26525k)).d(new N(this.f26507a));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1377n
    public final void onConnectionFailed(C2914b c2914b) {
        this.f26507a.f26516b.lock();
        try {
            if (this.f26507a.q(c2914b)) {
                this.f26507a.i();
                this.f26507a.n();
            } else {
                this.f26507a.l(c2914b);
            }
            this.f26507a.f26516b.unlock();
        } catch (Throwable th) {
            this.f26507a.f26516b.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1361f
    public final void onConnectionSuspended(int i9) {
    }
}
