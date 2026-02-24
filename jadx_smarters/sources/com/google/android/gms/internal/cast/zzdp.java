package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.AbstractC1409h;
import com.google.android.gms.common.internal.C1406e;
import n4.InterfaceC2272g;
import t4.C2775b;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class zzdp extends AbstractC1409h implements IBinder.DeathRecipient {
    private static final C2775b zze = new C2775b("CastRemoteDisplayClientImpl");
    private final InterfaceC2272g zzf;
    private final CastDevice zzg;
    private final Bundle zzh;

    public zzdp(Context context, Looper looper, C1406e c1406e, CastDevice castDevice, Bundle bundle, InterfaceC2272g interfaceC2272g, GoogleApiClient.b bVar, GoogleApiClient.c cVar) {
        super(context, looper, 83, c1406e, bVar, cVar);
        zze.a("instance created", new Object[0]);
        this.zzg = castDevice;
        this.zzh = bundle;
    }

    public static /* bridge */ /* synthetic */ InterfaceC2272g zzp(zzdp zzdpVar) {
        zzdpVar.getClass();
        return null;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
        return iInterfaceQueryLocalInterface instanceof zzds ? (zzds) iInterfaceQueryLocalInterface : new zzds(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c, com.google.android.gms.common.api.a.f
    public final void disconnect() {
        zze.a("disconnect", new Object[0]);
        try {
            ((zzds) getService()).zze();
        } catch (RemoteException | IllegalStateException unused) {
        } finally {
            super.disconnect();
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final String getStartServiceAction() {
        return "com.google.android.gms.cast.remote_display.service.START";
    }

    public final void zzr(zzdr zzdrVar, zzdu zzduVar, String str) throws RemoteException {
        zze.a("startRemoteDisplay", new Object[0]);
        ((zzds) getService()).zzg(zzdrVar, new zzdo(this, zzduVar), this.zzg.H(), str, this.zzh);
    }

    public final void zzs(zzdr zzdrVar) throws RemoteException {
        zze.a("stopRemoteDisplay", new Object[0]);
        ((zzds) getService()).zzi(zzdrVar);
    }
}
