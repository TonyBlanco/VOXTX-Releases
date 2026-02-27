package com.google.android.gms.internal.appset;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.InterfaceC1361f;
import com.google.android.gms.common.api.internal.InterfaceC1377n;
import com.google.android.gms.common.internal.AbstractC1409h;
import com.google.android.gms.common.internal.C1406e;
import i4.h;
import w4.C2916d;

/* JADX INFO: loaded from: classes3.dex */
public final class zzd extends AbstractC1409h {
    public zzd(Context context, Looper looper, C1406e c1406e, InterfaceC1361f interfaceC1361f, InterfaceC1377n interfaceC1377n) {
        super(context, looper, 300, c1406e, interfaceC1361f, interfaceC1377n);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return iInterfaceQueryLocalInterface instanceof zzg ? (zzg) iInterfaceQueryLocalInterface : new zzg(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final C2916d[] getApiFeatures() {
        return h.f41865b;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final int getMinApkVersion() {
        return 212800000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final String getStartServiceAction() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
