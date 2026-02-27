package com.google.android.gms.internal.appset;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import i4.C1890f;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zze extends zzb implements zzf {
    public zze() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // com.google.android.gms.internal.appset.zzb
    public final boolean zza(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i9 != 1) {
            return false;
        }
        zzb((Status) zzc.zza(parcel, Status.CREATOR), (C1890f) zzc.zza(parcel, C1890f.CREATOR));
        return true;
    }
}
