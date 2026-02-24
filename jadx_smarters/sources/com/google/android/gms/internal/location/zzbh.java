package com.google.android.gms.internal.location;

import J4.C0653l;
import J4.C0654m;
import J4.H;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;

/* JADX INFO: loaded from: classes3.dex */
final class zzbh extends H {
    final /* synthetic */ C0653l zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbh(zzbi zzbiVar, GoogleApiClient googleApiClient, C0653l c0653l, String str) {
        super(googleApiClient);
        this.zza = c0653l;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ h createFailedResult(Status status) {
        return new C0654m(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1357d
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzaz) bVar).zzL(this.zza, this, null);
    }
}
