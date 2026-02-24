package com.google.android.gms.internal.appset;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import i4.C1888d;

/* JADX INFO: loaded from: classes3.dex */
public final class zzg extends zza implements IInterface {
    public zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    public final void zzc(C1888d c1888d, zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, c1888d);
        zzc.zzc(parcelZza, zzfVar);
        zzb(1, parcelZza);
    }
}
