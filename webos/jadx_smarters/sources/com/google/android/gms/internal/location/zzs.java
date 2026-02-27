package com.google.android.gms.internal.location;

import J4.InterfaceC0651j;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.C1373l;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes3.dex */
final class zzs extends zzx {
    final /* synthetic */ LocationRequest zza;
    final /* synthetic */ InterfaceC0651j zzb;
    final /* synthetic */ Looper zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzz zzzVar, GoogleApiClient googleApiClient, LocationRequest locationRequest, InterfaceC0651j interfaceC0651j, Looper looper) {
        super(googleApiClient);
        this.zza = locationRequest;
        this.zzb = interfaceC0651j;
        this.zzc = looper;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1357d
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzaz) bVar).zzC(this.zza, C1373l.a(this.zzb, zzbj.zza(this.zzc), InterfaceC0651j.class.getSimpleName()), new zzy(this));
    }
}
