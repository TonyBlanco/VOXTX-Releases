package com.google.android.gms.internal.location;

import J4.InterfaceC0651j;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.C1373l;

/* JADX INFO: loaded from: classes3.dex */
final class zzv extends zzx {
    final /* synthetic */ InterfaceC0651j zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzv(zzz zzzVar, GoogleApiClient googleApiClient, InterfaceC0651j interfaceC0651j) {
        super(googleApiClient);
        this.zza = interfaceC0651j;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1357d
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzaz) bVar).zzF(C1373l.b(this.zza, InterfaceC0651j.class.getSimpleName()), new zzy(this));
    }
}
