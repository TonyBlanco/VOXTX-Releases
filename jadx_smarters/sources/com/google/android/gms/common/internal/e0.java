package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC1404c f26808a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26809c;

    public e0(AbstractC1404c abstractC1404c, int i9) {
        this.f26808a = abstractC1404c;
        this.f26809c = i9;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1414m
    public final void R0(int i9, IBinder iBinder, k0 k0Var) {
        AbstractC1404c abstractC1404c = this.f26808a;
        r.n(abstractC1404c, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        r.m(k0Var);
        AbstractC1404c.zzj(abstractC1404c, k0Var);
        z(i9, iBinder, k0Var.f26844f);
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1414m
    public final void o0(int i9, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1414m
    public final void z(int i9, IBinder iBinder, Bundle bundle) {
        r.n(this.f26808a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f26808a.onPostInitHandler(i9, iBinder, bundle, this.f26809c);
        this.f26808a = null;
    }
}
