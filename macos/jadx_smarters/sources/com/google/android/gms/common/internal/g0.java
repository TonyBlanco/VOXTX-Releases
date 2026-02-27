package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import w4.C2914b;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends S {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f26834g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC1404c f26835h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(AbstractC1404c abstractC1404c, int i9, IBinder iBinder, Bundle bundle) {
        super(abstractC1404c, i9, bundle);
        this.f26835h = abstractC1404c;
        this.f26834g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.S
    public final void f(C2914b c2914b) {
        if (this.f26835h.zzx != null) {
            this.f26835h.zzx.onConnectionFailed(c2914b);
        }
        this.f26835h.onConnectionFailed(c2914b);
    }

    @Override // com.google.android.gms.common.internal.S
    public final boolean g() {
        String str;
        String interfaceDescriptor;
        try {
            IBinder iBinder = this.f26834g;
            r.m(iBinder);
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
        } catch (RemoteException unused) {
            str = "service probably died";
        }
        if (!this.f26835h.getServiceDescriptor().equals(interfaceDescriptor)) {
            str = "service descriptor mismatch: " + this.f26835h.getServiceDescriptor() + " vs. " + interfaceDescriptor;
            Log.w("GmsClient", str);
            return false;
        }
        IInterface iInterfaceCreateServiceInterface = this.f26835h.createServiceInterface(this.f26834g);
        if (iInterfaceCreateServiceInterface == null || !(AbstractC1404c.zzn(this.f26835h, 2, 4, iInterfaceCreateServiceInterface) || AbstractC1404c.zzn(this.f26835h, 3, 4, iInterfaceCreateServiceInterface))) {
            return false;
        }
        this.f26835h.zzB = null;
        AbstractC1404c abstractC1404c = this.f26835h;
        Bundle connectionHint = abstractC1404c.getConnectionHint();
        if (abstractC1404c.zzw == null) {
            return true;
        }
        this.f26835h.zzw.onConnected(connectionHint);
        return true;
    }
}
