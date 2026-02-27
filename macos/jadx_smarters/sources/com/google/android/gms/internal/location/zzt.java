package com.google.android.gms.internal.location;

import J4.AbstractC0650i;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.C1373l;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes3.dex */
final class zzt extends zzx {
    final /* synthetic */ LocationRequest zza;
    final /* synthetic */ AbstractC0650i zzb;
    final /* synthetic */ Looper zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzt(zzz zzzVar, GoogleApiClient googleApiClient, LocationRequest locationRequest, AbstractC0650i abstractC0650i, Looper looper) {
        super(googleApiClient);
        this.zza = locationRequest;
        this.zzc = looper;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1357d
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzaz) bVar).zzB(zzba.zza(null, this.zza), C1373l.a(null, zzbj.zza(this.zzc), AbstractC0650i.class.getSimpleName()), new zzy(this));
    }
}
