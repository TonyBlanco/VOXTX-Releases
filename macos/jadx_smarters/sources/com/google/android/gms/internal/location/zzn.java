package com.google.android.gms.internal.location;

import J4.AbstractC0650i;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.C1373l;

/* JADX INFO: loaded from: classes3.dex */
final class zzn extends zzx {
    final /* synthetic */ AbstractC0650i zza;

    public zzn(zzz zzzVar, GoogleApiClient googleApiClient, AbstractC0650i abstractC0650i) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1357d
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzaz) bVar).zzH(C1373l.b(null, AbstractC0650i.class.getSimpleName()), new zzy(this));
    }
}
